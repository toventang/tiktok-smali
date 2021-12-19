package com.ss.android.ugc.aweme.services.story;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import h.z;

public interface IStoryView {
    static {
        Covode.recordClassIndex(79825);
    }

    Fragment asFragment();

    LiveData<z> getCloseEvent();

    LiveData<Boolean> getForbidDrawerScrollEvent();

    void onActivityResult(int i2, int i3, Intent intent);

    boolean onBackPressed();

    void onOpenCompletely();

    void onSlideExitStoryShoot();

    void updateEnterStoryParam(EnterStoryParam enterStoryParam);
}
