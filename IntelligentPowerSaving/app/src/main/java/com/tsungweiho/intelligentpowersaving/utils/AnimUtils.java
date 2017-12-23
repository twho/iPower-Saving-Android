package com.tsungweiho.intelligentpowersaving.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.maps.MapView;
import com.tsungweiho.intelligentpowersaving.MainActivity;
import com.tsungweiho.intelligentpowersaving.R;

/**
 * Created by Tsung Wei Ho on 2/3/17.
 */

public class AnimUtils {
    private Context context;

    // Animation duration
    private int ANIM_DURATION = 1000;
    private int MID_ANIM_DURATION = 500;
    private int FAST_ANIM_DURATION = 250;

    private static final AnimUtils ourInstance = new AnimUtils();

    public static AnimUtils getInstance() {
        return ourInstance;
    }

    private AnimUtils() {
        this.context = MainActivity.getContext();
    }

    public void setllAnimToVisible(final LinearLayout linearLayout) {
        linearLayout.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        am.setDuration(ANIM_DURATION);
        linearLayout.setAnimation(am);
        am.startNow();
    }

    public void setglAnimToVisible(final GridLayout gridLayout) {
        gridLayout.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        am.setDuration(ANIM_DURATION);
        gridLayout.setAnimation(am);
        am.startNow();
    }

    public void setflAnimToVisible(final FrameLayout frameLayout) {
        frameLayout.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        am.setDuration(ANIM_DURATION);
        frameLayout.setAnimation(am);
        am.startNow();
    }

    public void setlvAnimToVisible(final ListView listView) {
        listView.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        am.setDuration(MID_ANIM_DURATION);
        listView.setAnimation(am);
        am.startNow();
    }

    public void setMapAnimToVisible(final MapView mapView) {
        mapView.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        am.setDuration(ANIM_DURATION);
        mapView.setAnimation(am);
        am.startNow();
    }

    public void setIconAnimToVisible(ImageView imageView) {
        imageView.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        am.setDuration(ANIM_DURATION);
        imageView.setAnimation(am);
        am.startNow();
    }

    public void setllSlideUp(final LinearLayout linearLayout) {
        linearLayout.setVisibility(View.VISIBLE);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.design_bottom_sheet_slide_in);
        am.setDuration(FAST_ANIM_DURATION);
        linearLayout.setAnimation(am);
        am.startNow();
    }

    public void setllSlideDown(final LinearLayout linearLayout) {
        Animation am = AnimationUtils.loadAnimation(context, R.anim.design_bottom_sheet_slide_out);
        am.setDuration(FAST_ANIM_DURATION);
        am.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                linearLayout.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        linearLayout.setAnimation(am);
        am.startNow();
    }

    public void rotateToIcon(ImageButton imageButton, int icon) {
        imageButton.setImageResource(icon);
        Animation am = AnimationUtils.loadAnimation(context, R.anim.rotate);
        am.setDuration(FAST_ANIM_DURATION);
        imageButton.setAnimation(am);
        am.startNow();
    }
}