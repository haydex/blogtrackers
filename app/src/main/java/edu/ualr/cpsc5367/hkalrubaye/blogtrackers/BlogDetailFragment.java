package edu.ualr.cpsc5367.hkalrubaye.blogtrackers;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.ualr.cpsc5367.hkalrubaye.blogtrackers.data.BlogModel;

/**
 * Created by haydex on 12/8/17.
 */

public class BlogDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private BlogModel.BlogItem mItem;

    public BlogDetailFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {

            mItem = BlogModel.BLOGS_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.TITLE);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.DETAILS);
        }

        return rootView;
    }

}
