package com.bytedance.ies.ugc.aweme.commercialize.splash.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.i.a;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;

public interface b {
    static {
        Covode.recordClassIndex(20826);
    }

    a a(Context context);

    HashMap<String, String> a();

    void a(Context context, Aweme aweme);

    void a(Context context, Aweme aweme, Map<String, String> map);

    void a(a aVar);

    void a(Aweme aweme);

    void a(String str);

    void a(boolean z, String str);

    boolean a(Activity activity);

    boolean a(Context context, String str);

    boolean a(Context context, String str, String str2, String str3);

    Intent b(Context context);

    String b();

    void b(Context context, String str);

    void b(String str);

    boolean b(Aweme aweme);

    String c();

    boolean c(Aweme aweme);

    com.ss.android.ad.splash.core.i.b d();

    boolean d(Aweme aweme);

    String e();

    void e(Aweme aweme);

    boolean f();

    boolean g();

    boolean h();

    void i();

    void j();

    void k();

    long l();

    String m();

    String n();

    String o();

    IDownloadService p();

    boolean q();

    boolean r();

    boolean s();

    int t();

    boolean u();

    long v();
}
