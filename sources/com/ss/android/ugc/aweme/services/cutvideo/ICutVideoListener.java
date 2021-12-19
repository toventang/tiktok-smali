package com.ss.android.ugc.aweme.services.cutvideo;

import com.bytedance.covode.number.Covode;

public interface ICutVideoListener {
    static {
        Covode.recordClassIndex(79591);
    }

    void onCompileDone();

    void onCompileError(int i2, int i3, float f2, String str);

    void onCompileProgress(float f2);

    void onStart();
}
