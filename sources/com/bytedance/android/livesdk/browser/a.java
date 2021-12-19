package com.bytedance.android.livesdk.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ah.b.d;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.android.livesdk.browser.jsbridge.c;
import com.bytedance.common.c.b;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f14251a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f14252b;

    static {
        Covode.recordClassIndex(7901);
    }

    public static boolean a(String str) {
        try {
            String host = new URI(str).getHost();
            if (host != null && !host.isEmpty()) {
                str = host;
            }
            String replace = str.replace("www.", "");
            List<String> e2 = c.e();
            if (replace.isEmpty()) {
                return false;
            }
            return e2.contains(replace);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        if (m.a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static boolean c(String str) {
        try {
            if (y.e().getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean d(String str) {
        String str2;
        int indexOf;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else {
                if (Build.VERSION.SDK_INT >= 27 || (indexOf = str.indexOf(92)) == -1) {
                    str2 = Uri.parse(str).getHost();
                } else {
                    str2 = Uri.parse(str.substring(0, indexOf)).getHost();
                }
                if (str2 != null && !str2.isEmpty()) {
                    str = str2;
                }
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("\\.");
                    if (split.length >= 2) {
                        str = split[split.length - 2] + "." + split[split.length - 1];
                    }
                }
            }
            if (str.isEmpty()) {
                return false;
            }
            return c.e().contains(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(final Activity activity, final Fragment fragment) {
        f.a(activity).a(new d() {
            /* class com.bytedance.android.livesdk.browser.a.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f14255c = 40003;

            static {
                Covode.recordClassIndex(7902);
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void b(String... strArr) {
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void a(String... strArr) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    n.a(activity, 2131234317, (int) R.string.gmc);
                    return;
                }
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                try {
                    Fragment fragment = fragment;
                    if (fragment != null) {
                        fragment.startActivityForResult(intent, this.f14255c);
                    } else {
                        activity.startActivityForResult(intent, this.f14255c);
                    }
                } catch (Exception unused) {
                    n.a(activity, 2131234317, (int) R.string.gmb);
                }
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static String a(Context context, WebView webView) {
        MethodCollector.i(10595);
        if (webView != null) {
            String userAgentString = webView.getSettings().getUserAgentString();
            if (!m.a(userAgentString)) {
                f14251a = userAgentString;
                MethodCollector.o(10595);
                return userAgentString;
            }
        }
        if (!m.a(f14251a)) {
            String str = f14251a;
            MethodCollector.o(10595);
            return str;
        }
        String a2 = b.f26745a.a(context);
        f14251a = a2;
        if (!m.a(a2)) {
            String str2 = f14251a;
            MethodCollector.o(10595);
            return str2;
        }
        if (!f14252b && webView == null && (context instanceof Activity)) {
            f14252b = true;
            try {
                WebView webView2 = new WebView(context);
                f14251a = webView2.getSettings().getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        String str3 = f14251a;
        MethodCollector.o(10595);
        return str3;
    }

    public static void a(HashMap<String, String> hashMap, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            loop0:
            while (keys != null) {
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (!m.a(next)) {
                            if (!m.a(optString)) {
                                hashMap.put(next, optString);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                break loop0;
            }
        }
        if (!m.a((String) null)) {
            hashMap.put("User-Agent", null);
        }
    }

    private static void a(WebView webView, String str, Map map) {
        MethodCollector.i(10434);
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str, map);
        MethodCollector.o(10434);
    }

    public static void a(String str, WebView webView, String str2) {
        if (webView != null && !m.a(str)) {
            if (!b(str)) {
                str2 = null;
            }
            HashMap hashMap = new HashMap();
            if (!m.a(str2)) {
                hashMap.put("Referer", str2);
            }
            a(str, webView, hashMap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ce, code lost:
        if (r6 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r20, android.webkit.WebView r21, java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
        // Method dump skipped, instructions count: 471
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.a.a(java.lang.String, android.webkit.WebView, java.util.Map):void");
    }

    public static void a(final Activity activity, final Fragment fragment, final String str, final String str2) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            n.a(activity, 2131234317, (int) R.string.gmc);
        } else {
            f.a(activity).a(new d() {
                /* class com.bytedance.android.livesdk.browser.a.AnonymousClass2 */

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f14260e = 40004;

                static {
                    Covode.recordClassIndex(7903);
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void b(String... strArr) {
                }

                @Override // com.bytedance.android.livesdk.ah.b.d
                public final void a(String... strArr) {
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    intent.putExtra("output", TTLiveFileProvider.getUri(activity, activity.getPackageName() + ".ttlive_provider", new File(file, str2)));
                    try {
                        Fragment fragment = fragment;
                        if (fragment != null) {
                            fragment.startActivityForResult(intent, this.f14260e);
                        } else {
                            activity.startActivityForResult(intent, this.f14260e);
                        }
                    } catch (Exception unused) {
                        n.a(activity, 2131234317, (int) R.string.gma);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }
}
