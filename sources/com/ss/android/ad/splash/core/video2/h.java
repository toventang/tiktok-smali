package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.view.Surface;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public interface h {
    static {
        Covode.recordClassIndex(36451);
    }

    void a();

    Context getApplicationContext();

    Surface getSurface();

    void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setSurfaceViewVisibility(int i2);

    void setVideoViewCallback(i iVar);
}
