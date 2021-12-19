package com.ss.android.ugc.aweme.main;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.g;

public interface j extends g {
    static {
        Covode.recordClassIndex(69982);
    }

    Fragment getCurFragment();

    String getEnterFrom();

    m getMainHelper();

    boolean hasRegistedResumeAction();

    boolean isDuoDualMode();

    boolean isMainTabVisible();

    boolean isUnderMainTab();

    boolean isUnderThirdTab();

    void onFeedRecommendFragmentReady();

    void onKeyBack();

    void setTabBackground(boolean z);
}
