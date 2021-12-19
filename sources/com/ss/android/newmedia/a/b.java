package com.ss.android.newmedia.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.agilelogger.c.d;
import com.ss.android.common.util.f;
import com.ss.android.newmedia.g;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import java.util.HashSet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static Handler f59928a = null;

    /* renamed from: b  reason: collision with root package name */
    static final HashSet<String> f59929b;

    /* renamed from: c  reason: collision with root package name */
    static final HashSet<String> f59930c;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f59931d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f59932e;

    /* renamed from: f  reason: collision with root package name */
    private static int f59933f = -1;

    /* renamed from: g  reason: collision with root package name */
    private static int f59934g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static int f59935h = -1;

    static {
        boolean z;
        Covode.recordClassIndex(37039);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (f.c()) {
            z = true;
        } else {
            z = false;
        }
        f59931d = z;
        if (z || (Build.VERSION.SDK_INT == 16 && "ZTE N5".equals(Build.MODEL))) {
            z2 = true;
        }
        f59932e = z2;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f59929b = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f59930c = hashSet2;
    }

    public static void a(WebView webView) {
        MethodCollector.i(10393);
        if (webView == null) {
            MethodCollector.o(10393);
            return;
        }
        n.a("webview_anr_log", "common_msg", new c().a("layerType", Integer.valueOf(webView.getLayerType())).a("stackTrace", d.a(new Throwable())).a());
        webView.setWebChromeClient(null);
        com.ss.android.ugc.tiktok.security.c.b.a();
        webView.setWebViewClient(com.example.a.c.a(null));
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
            try {
                webView.destroy();
                MethodCollector.o(10393);
                return;
            } catch (Throwable th) {
                n.a("webview_anr_log", "destroy_exception", new c().a("stacktrace", d.a(th)).a());
            }
        }
        MethodCollector.o(10393);
    }

    public static void a(Context context, WebView webView) {
        int i2;
        MethodCollector.i(10391);
        if (context == null || webView == null) {
            MethodCollector.o(10391);
        } else if (CrossPlatformLegacyServiceImpl.f().b() != 0 || ((i2 = f59933f) >= 0 ? i2 > 0 : f59932e)) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing()) {
                    try {
                        g.a(webView, "about:blank");
                        if (f59935h > 0) {
                            View rootView = webView.getRootView();
                            if (rootView instanceof ViewGroup) {
                                View childAt = ((ViewGroup) rootView).getChildAt(0);
                                childAt.setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                                childAt.setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                imageView.setImageBitmap(createBitmap);
                                imageView.setVisibility(0);
                                ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    Logger.debug();
                }
            }
            MethodCollector.o(10391);
        } else {
            MethodCollector.o(10391);
        }
    }
}
