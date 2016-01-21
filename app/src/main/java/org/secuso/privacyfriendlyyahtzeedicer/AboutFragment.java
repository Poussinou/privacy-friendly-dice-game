package org.secuso.privacyfriendlyyahtzeedicer;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yonjuni on 20.01.16.
 */
public class AboutFragment extends Fragment {

    Activity activity;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
        ((ActionBarActivity)getActivity()).getSupportActionBar().setSubtitle(R.string.action_about);
        container.removeAllViews();
        return rootView;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

}
