package com.bytedance.ies.ugc.aweme.commercialize.splash.f;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import c.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import h.f.b.l;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f34785a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f34786b = true;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f34787c;

    /* renamed from: d  reason: collision with root package name */
    public static String f34788d;

    /* renamed from: e  reason: collision with root package name */
    public static Long f34789e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f34790f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f34791g;

    /* renamed from: h  reason: collision with root package name */
    public static String f34792h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f34793i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f34794j;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f34795k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f34796l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f34797m;
    public static final i n = new i();

    private i() {
    }

    public static final void a() {
        f34788d = null;
        f34789e = null;
    }

    public static final String b() {
        if (f34794j) {
            return d();
        }
        return c();
    }

    static {
        Covode.recordClassIndex(20870);
    }

    public static final boolean e() {
        if (!TextUtils.isEmpty(f34792h)) {
            return true;
        }
        TroubleshootingLogDelegate.awesomeSplashLog$default(TroubleshootingLogDelegate.INSTANCE, "no TopView id", null, 0, 6, null);
        return false;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f34798a;

        static {
            Covode.recordClassIndex(20871);
        }

        a(View view) {
            this.f34798a = view;
        }

        public final void run() {
            this.f34798a.setVisibility(0);
            this.f34798a.setAlpha(0.0f);
            ObjectAnimator.ofFloat(this.f34798a, "alpha", 0.0f, 1.0f).setDuration(430L).start();
        }
    }

    public static final String c() {
        Context context;
        IHostContextDepend iHostContextDepend = com.bytedance.ies.android.base.runtime.a.f31874c;
        if (iHostContextDepend != null) {
            context = iHostContextDepend.getApplicationContext();
        } else {
            context = null;
        }
        if (context == null) {
            return null;
        }
        try {
            d.a(context);
            return d.a(context) + "/awemeSplashCache/";
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final String d() {
        c.b.a a2 = d.a("y+6T0e/qfIqkZDbYHfFiN/8XI5L6pbEB5d+bZ2FLxi1E6LD99U2nNfzcaGWObA==");
        l.b(a2, "");
        a2.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        c.b.a a3 = d.a("y+6T0e/qfIqkZDbYHfFiN/8XI5L6pbEB5d+bZ2FLxi1E6LD99U2nNfzcaGWObA==");
        l.b(a3, "");
        return sb.append(a3.getAbsolutePath()).append(File.separator).toString();
    }

    public static final void a(Intent intent) {
        boolean b2;
        if (intent == null) {
            b2 = false;
        } else {
            b2 = b(intent);
        }
        f34787c = b2;
    }

    public static final String a(String str) {
        String a2 = a(str, d());
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a(str, c());
    }

    private static boolean b(Intent intent) {
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    public static final JSONObject b(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_show_fail_type", str);
            if (!TextUtils.isEmpty(null)) {
                jSONObject2.put("ad_show_fail_type2_reason", (Object) null);
            }
            if (f34786b) {
                str2 = "1";
            } else {
                str2 = "2";
            }
            jSONObject2.put("awemelaunch", str2);
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static final boolean a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSplashInfo splashInfo;
        String awesomeSplashId;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || (awesomeSplashId = splashInfo.getAwesomeSplashId()) == null || awesomeSplashId.length() == 0) {
            return false;
        }
        return true;
    }

    private static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String a2 = l.a(str2, (Object) str);
            if (new File(a2).exists()) {
                return a2;
            }
        }
        return null;
    }

    public static final void a(int i2, View... viewArr) {
        l.d(viewArr, "");
        int i3 = 0;
        if (viewArr.length != 0) {
            if (i2 == 1 || i2 == 2) {
                int length = viewArr.length;
                while (i3 < length) {
                    View view = viewArr[i3];
                    if (!(view == null || view.getVisibility() == 8)) {
                        view.setVisibility(4);
                    }
                    i3++;
                }
            } else if (i2 == 3) {
                int length2 = viewArr.length;
                while (i3 < length2) {
                    View view2 = viewArr[i3];
                    if (!(view2 == null || view2.getVisibility() == 8)) {
                        view2.postDelayed(new a(view2), 260);
                    }
                    i3++;
                }
            } else if (i2 == 4) {
                for (View view3 : viewArr) {
                    if (!(view3 == null || view3.getVisibility() == 8)) {
                        view3.setVisibility(0);
                        view3.setAlpha(1.0f);
                    }
                }
            }
        }
    }
}
