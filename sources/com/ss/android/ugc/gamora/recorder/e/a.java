package com.ss.android.ugc.gamora.recorder.e;

import com.bytedance.als.b;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import h.z;

public interface a extends b {
    static {
        Covode.recordClassIndex(97348);
    }

    void dismissLivePopupEvent();

    void dismissSuperEntranceEvent();

    void dismissUploadPopEntranceEvent();

    g<z> getNoBlockTouchEvent();

    void setNeedNoTouchListener(boolean z);
}
