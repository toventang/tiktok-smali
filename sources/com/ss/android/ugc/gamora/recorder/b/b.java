package com.ss.android.ugc.gamora.recorder.b;

import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.l;

public interface b extends com.bytedance.als.b {

    public static final class a {
        static {
            Covode.recordClassIndex(97117);
        }
    }

    static {
        Covode.recordClassIndex(97116);
    }

    void addBottomTab(int i2, a aVar, int i3);

    int bottomTabSize();

    void configSwitchDuration(l lVar);

    g<c> getBottomTabIndexChangeEvent();

    com.bytedance.als.l<Integer> getComplexTabVisibility();

    String getCurrentBottomTag();

    void hidePopupForLiveTab();

    boolean isCurrentTabNeedCamera();

    boolean isZTLiveSwitch();

    void notifyBottomTabIndexChange(c cVar);

    void onCombinePhotoTabChanged(c cVar);

    com.ss.android.ugc.gamora.a.a provideRecordEnv();

    void resetToCurTab(String str);

    void setCurrentTab(String str, boolean z);

    void showBottomTab(boolean z);

    void showComplexTab(int i2, c cVar);

    void tryShowPopupForLiveTab();

    void updateBottomTab();
}
