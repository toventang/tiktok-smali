package com.ss.android.ugc.aweme.ad.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.j;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public interface c {
    static {
        Covode.recordClassIndex(40355);
    }

    int a(String str, String str2);

    String a();

    String a(String str, int i2);

    List<k> a(b bVar);

    Map<String, Object> a(com.bytedance.ies.bullet.ui.common.b.c cVar);

    void a(int i2, int i3, Intent intent);

    void a(Activity activity, String str);

    void a(Activity activity, String str, long j2);

    void a(Context context, View view, j jVar);

    void a(Context context, WebView webView);

    void a(WebView webView);

    void a(e eVar, String str, String str2);

    void a(com.bytedance.ies.bullet.kit.web.a.e eVar, String str);

    void a(com.bytedance.ies.bullet.ui.common.b.c cVar, SSWebView sSWebView);

    void a(com.bytedance.ies.bullet.ui.common.b.c cVar, String str);

    void a(com.bytedance.ies.bullet.ui.common.b.c cVar, boolean z);

    void a(String str);

    void a(String str, AwemeRawAd awemeRawAd);

    void a(String str, String str2, int i2, int i3, String str3, String str4);

    void a(String str, List<String> list, Long l2, String str2, String str3, String str4);

    void a(String str, boolean z);

    boolean a(Activity activity);

    boolean a(Context context, Aweme aweme);

    boolean a(Context context, String str);

    boolean a(Context context, String str, boolean z);

    boolean a(Uri uri, String str, Context context, String str2, Aweme aweme, boolean z);

    boolean a(Aweme aweme);

    boolean a(String str, String str2, List<String> list);

    String b();

    String b(String str, String str2);

    List<k> b(b bVar);

    void b(Activity activity);

    void b(com.bytedance.ies.bullet.ui.common.b.c cVar);

    void b(com.bytedance.ies.bullet.ui.common.b.c cVar, SSWebView sSWebView);

    void b(com.bytedance.ies.bullet.ui.common.b.c cVar, String str);

    void b(String str);

    void b(String str, boolean z);

    boolean b(Activity activity, String str);

    boolean b(Context context, String str);

    boolean b(Aweme aweme);

    CardStruct c(Aweme aweme);

    List<k> c(b bVar);

    void c();

    void c(Activity activity);

    void c(com.bytedance.ies.bullet.ui.common.b.c cVar);

    void c(com.bytedance.ies.bullet.ui.common.b.c cVar, SSWebView sSWebView);

    void c(String str, String str2);

    void c(String str, boolean z);

    boolean c(String str);

    String d(String str, String str2);

    boolean d();

    List<Pattern> e();

    void f();

    void g();

    String h();

    CardStruct i();

    CardStruct j();

    CardStruct k();

    Aweme l();

    Map<String, String> m();

    int n();
}
