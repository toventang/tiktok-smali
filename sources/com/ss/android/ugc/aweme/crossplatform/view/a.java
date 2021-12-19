package com.ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.crossplatform.a.c;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.d;

public interface a extends c {
    static {
        Covode.recordClassIndex(49003);
    }

    <T extends i> T a(Class<T> cls);

    void a(Activity activity);

    boolean a();

    void b(Activity activity);

    void c();

    void c(Activity activity);

    void d(Activity activity);

    String getCurrentUrl();

    k getMonitorSession();

    g getViewStatusRegistry();

    void setCrossPlatformActivityContainer(m mVar);

    void setFullScreen(d dVar);
}
