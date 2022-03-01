package kz.putinbyte.iszhfermer.presentation.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.timelysoft.tsjdomcom.common.GenericRecyclerAdapter
import com.timelysoft.tsjdomcom.common.ViewHolder
import kotlinx.android.synthetic.main.item_owners_recycler.view.*

class OwnersAdapter(item: ArrayList<String> = arrayListOf()): GenericRecyclerAdapter<String>(item) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return super.onCreateViewHolder(parent, R.layout.item_owners_recycler)
    }

    fun filter(sequence: CharSequence? = null, list: ArrayList<String>? = null): ArrayList<String> {
        val temp = ArrayList<String>()
        for (s in list!!) {
            if (s.toLowerCase().contains(sequence!!)) {
                temp.add(s)
            }
            if (s.toLowerCase().contains(sequence)) {
                temp.add(s)
            }

//            if (s.toString() != "null"){
//                if (s.toLowerCase().contains(sequence)) {
//                    temp.add(s)
//                }
//            }
//
//            if (s.toLowerCase().contains(sequence)) {
//                temp.add(s)
//            }
        }
        update(temp)
        return temp
    }

    override fun bind(item: String, holder: ViewHolder) {
        holder.itemView.ownersCheckbox.text = item
    }

}