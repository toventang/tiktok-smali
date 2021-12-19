package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.logger.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class v {

    /* renamed from: g  reason: collision with root package name */
    private static v f78576g;

    /* renamed from: a  reason: collision with root package name */
    public List<SingleWebView> f78577a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public LinkedList<SingleWebView> f78578b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, SingleWebView> f78579c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public int f78580d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final Object f78581e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private List<String> f78582f;

    public interface a {
        static {
            Covode.recordClassIndex(48795);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(48793);
    }

    private static boolean f() {
        return b.a().a(true, "enable_webview_cache", false);
    }

    public final SingleWebView b() {
        if (this.f78578b.size() > 0) {
            return this.f78578b.poll();
        }
        return null;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (!d.a(this.f78582f) || f() || g()) {
            return false;
        }
        return true;
    }

    private v() {
        try {
            this.f78582f = c.f99077a.f99078b.getWebviewCachePoolSwitch();
        } catch (Throwable unused) {
        }
    }

    public static v a() {
        MethodCollector.i(11438);
        if (f78576g == null) {
            synchronized (v.class) {
                try {
                    if (f78576g == null) {
                        f78576g = new v();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11438);
                    throw th;
                }
            }
        }
        v vVar = f78576g;
        MethodCollector.o(11438);
        return vVar;
    }

    private static boolean g() {
        WebViewPreloadEntry webViewPreloadEntry;
        try {
            webViewPreloadEntry = (WebViewPreloadEntry) b.a().a(true, "webview_preload_entry_ab", WebViewPreloadEntry.class);
            if (webViewPreloadEntry == null) {
                try {
                    webViewPreloadEntry = (WebViewPreloadEntry) SettingsManager.a().a("webview_preload_entry", WebViewPreloadEntry.class);
                } catch (Throwable unused) {
                }
                if (webViewPreloadEntry == null) {
                    return false;
                }
            }
        } catch (Throwable unused2) {
            webViewPreloadEntry = null;
        }
        if (webViewPreloadEntry.isUsePool()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean d() {
        MethodCollector.i(12080);
        SystemClock.uptimeMillis();
        synchronized (this.f78581e) {
            for (int i2 = 0; i2 < this.f78580d - this.f78577a.size(); i2++) {
                try {
                    this.f78577a.add(new SingleWebView(new MutableContextWrapper(com.bytedance.ies.ugc.appcontext.d.a())));
                } catch (Throwable th) {
                    MethodCollector.o(12080);
                    throw th;
                }
            }
        }
        SystemClock.uptimeMillis();
        MethodCollector.o(12080);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean e() {
        MethodCollector.i(12234);
        SystemClock.uptimeMillis();
        synchronized (this.f78581e) {
            for (int i2 = 0; i2 < this.f78580d - this.f78577a.size(); i2++) {
                try {
                    this.f78577a.add(new SingleWebView(new MutableContextWrapper(com.bytedance.ies.ugc.appcontext.d.a())));
                } catch (Throwable th) {
                    MethodCollector.o(12234);
                    throw th;
                }
            }
        }
        SystemClock.uptimeMillis();
        MethodCollector.o(12234);
        return false;
    }

    public static boolean b(com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        if (aVar == null) {
            return false;
        }
        String str = aVar.f78741a.f78730c;
        if (!TextUtils.isEmpty(str) && str.contains("/ies-cdn-alisg/tiktok_activities/covid19") && str.contains("cov19_render_no_need_load=1")) {
            return true;
        }
        return false;
    }

    public final SingleWebView a(Activity activity) {
        MethodCollector.i(11772);
        SingleWebView singleWebView = null;
        if (c()) {
            MethodCollector.o(11772);
            return null;
        }
        synchronized (this.f78581e) {
            try {
                if (this.f78577a.size() > 0) {
                    singleWebView = this.f78577a.get(0);
                    this.f78577a.remove(0);
                    if (singleWebView != null) {
                        Context context = singleWebView.getContext();
                        if (context instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context).setBaseContext(activity);
                        }
                        singleWebView.initWeb(activity);
                    }
                }
            } finally {
                MethodCollector.o(11772);
            }
        }
        return singleWebView;
    }

    public final SingleWebView b(Activity activity) {
        SingleWebView singleWebView;
        MethodCollector.i(11933);
        synchronized (this.f78581e) {
            try {
                if (this.f78577a.size() > 0) {
                    singleWebView = this.f78577a.get(0);
                    this.f78577a.remove(0);
                    if (singleWebView == null) {
                        return new SingleWebView(new MutableContextWrapper(activity));
                    }
                    singleWebView.setTag("cachedWebView");
                    Context context = singleWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(activity);
                    }
                } else {
                    singleWebView = new SingleWebView(new MutableContextWrapper(activity));
                }
                singleWebView.initWeb(activity);
                MethodCollector.o(11933);
                return singleWebView;
            } finally {
                MethodCollector.o(11933);
            }
        }
    }

    public final boolean a(com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        if (aVar == null) {
            return false;
        }
        String str = aVar.f78741a.f78730c;
        if (TextUtils.isEmpty(str) || a(str)) {
            return false;
        }
        if (f() || g() || str.contains("need_webview_pool=1")) {
            return true;
        }
        if (!d.a(this.f78582f)) {
            for (String str2 : this.f78582f) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (str.contains("need_webview_pool=1") || !d.a(this.f78582f) || f() || g()) {
            return false;
        }
        return true;
    }

    public final SingleWebView a(Activity activity, com.ss.android.ugc.aweme.crossplatform.d.a.a aVar) {
        SingleWebView singleWebView;
        MethodCollector.i(11618);
        synchronized (this.f78581e) {
            singleWebView = null;
            if (aVar != null) {
                try {
                    String str = aVar.f78741a.f78730c;
                    if (!TextUtils.isEmpty(str) && this.f78579c.containsKey("/ies-cdn-alisg/tiktok_activities/covid19") && str.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                        singleWebView = this.f78579c.get("/ies-cdn-alisg/tiktok_activities/covid19");
                        this.f78579c.remove("/ies-cdn-alisg/tiktok_activities/covid19");
                        if (singleWebView != null) {
                            aVar.f78741a.f78730c += "&cov19_render_no_need_load=1";
                            singleWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            Context context = singleWebView.getContext();
                            if (context instanceof MutableContextWrapper) {
                                ((MutableContextWrapper) context).setBaseContext(activity);
                            }
                            singleWebView.initWeb(activity);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("click_btn_timestamp", System.currentTimeMillis());
                                jSONObject.put("cold_boot_begin_timestamp", a.b.f109011a.f109007h);
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            singleWebView.sendEventToWebView("cov_pre_render_show", jSONObject);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11618);
                    throw th;
                }
            }
        }
        MethodCollector.o(11618);
        return singleWebView;
    }
}
