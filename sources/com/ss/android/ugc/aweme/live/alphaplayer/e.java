package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.alphaplayer.c.a;
import com.ss.android.ugc.aweme.live.alphaplayer.c.b;
import java.util.List;

public interface e {
    static {
        Covode.recordClassIndex(69386);
    }

    void a();

    void a(float f2, float f3);

    void a(List<b> list);

    boolean a(ViewGroup viewGroup);

    void b();

    boolean b(ViewGroup viewGroup);

    void bringToFront();

    boolean c();

    void d();

    Context getContext();

    int getMeasuredHeight();

    int getMeasuredWidth();

    Resources getResources();

    a.d getScaleType();

    View getView();

    void onPause();

    void requestRender();

    void setConfigParams(a.b bVar);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setPlayerController(com.ss.android.ugc.aweme.live.alphaplayer.controller.a aVar);

    void setVideoRenderer(com.ss.android.ugc.aweme.live.alphaplayer.e.a aVar);

    void setVisibility(int i2);
}
