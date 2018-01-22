package sk.styk.martin.apkanalyzer.activity.detailfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_app_detail_activity.*
import sk.styk.martin.apkanalyzer.R
import sk.styk.martin.apkanalyzer.activity.AppDetailFragment
import sk.styk.martin.apkanalyzer.adapter.detaillist.ActivityListAdapter
import sk.styk.martin.apkanalyzer.model.detail.ActivityData

/**
 * @author Martin Styk
 * @version 30.06.2017.
 */
class AppDetailFragment_Activity : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_app_detail_activity, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arguments.getParcelableArrayList<ActivityData>(AppDetailFragment.ARG_CHILD)
                ?: throw IllegalArgumentException("null data")

        recycler_view_activity.adapter = ActivityListAdapter(data)
        recycler_view_activity.setHasFixedSize(true)
    }
}