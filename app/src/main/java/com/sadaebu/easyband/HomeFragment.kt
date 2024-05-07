package com.sadaebu.easyband

import GroupListAdapter
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    // 레이아웃 연결
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    // GridView로 구현된 내 모임 목록 생성
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 모임 홈으로 이동: 서버 연결 후 수정 필요
        val myGroupTextView: TextView = view.findViewById(R.id.mybands_mygroup)
        myGroupTextView.setOnClickListener {
            val intent = Intent(activity, PostListActivity::class.java)
            startActivity(intent)
        }

        val groups = listOf(
            Group("모임 A", "모임 A 소개", R.drawable.mybands_thumbnail),
            Group("모임 B", "모임 B 소개", R.drawable.mybands_thumbnail),
            Group("모임 C", "모임 C 소개", R.drawable.mybands_thumbnail),
        )
        val adapter = GroupListAdapter(groups)
        val gridView: GridView = view.findViewById(R.id.mybands_group_list)
        gridView.adapter = adapter

    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}