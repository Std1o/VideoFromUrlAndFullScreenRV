package com.stdio.videofromurlandfullscreenrv.util;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import com.stdio.videofromurlandfullscreenrv.activity.VideoDetailsActivity;
import com.stdio.videofromurlandfullscreenrv.bean.MainVideoBean;

import java.util.ArrayList;

/**
 * Created by zhaoshuang on 2018/11/12.
 */

public class IntentUtil {

    public static final String INTENT_DATA_LIST = "intent_data_list";
    public static final String INTENT_PLAY_POSITION = "intent_play_position";

    public static void gotoVideoDetailsActivity(Activity activity, ArrayList<MainVideoBean> dataList, int playPosition, View animationView){

        Intent intent = new Intent(activity, VideoDetailsActivity.class);
        intent.putExtra(INTENT_DATA_LIST, dataList);
        intent.putExtra(INTENT_PLAY_POSITION, playPosition);

        ActivityOptionsCompat compat = ActivityOptionsCompat.makeClipRevealAnimation(animationView, 0, 0, animationView.getWidth(), animationView.getHeight());
        ActivityCompat.startActivity(activity, intent, compat.toBundle());
    }
}
