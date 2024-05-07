import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.sadaebu.easyband.Group
import com.sadaebu.easyband.R

class GroupListAdapter(private val groups: List<Group>) : BaseAdapter() {
    override fun getCount(): Int = groups.size

    override fun getItem(position: Int): Any = groups[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.item_group, parent, false)

        val itemTitle: TextView = view.findViewById(R.id.item_title)
        val itemSubtitle: TextView = view.findViewById(R.id.item_subtitle)
        val itemImage: ImageView = view.findViewById(R.id.item_image)

        val group = getItem(position) as Group
        itemTitle.text = group.name
        itemSubtitle.text = group.description
        itemImage.setImageResource(group.imageId)

        return view
    }
}