package com.ss.android.ugc.aweme.crossplatform.business.a;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Iterator;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f78653a;

    /* renamed from: b  reason: collision with root package name */
    public int f78654b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f78655c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78656d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78657e;

    /* renamed from: f  reason: collision with root package name */
    public String f78658f;

    /* renamed from: g  reason: collision with root package name */
    public String f78659g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f78660h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f78661i;

    /* renamed from: j  reason: collision with root package name */
    public int f78662j;

    /* renamed from: k  reason: collision with root package name */
    public String f78663k;

    /* renamed from: l  reason: collision with root package name */
    public long f78664l = -1;

    /* renamed from: m  reason: collision with root package name */
    public boolean f78665m;
    private boolean n;
    private boolean o;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.a.a$a  reason: collision with other inner class name */
    public static class C1826a {

        /* renamed from: a  reason: collision with root package name */
        public static String f78666a;

        /* renamed from: b  reason: collision with root package name */
        public static String f78667b;

        /* renamed from: c  reason: collision with root package name */
        public static boolean f78668c;

        /* renamed from: d  reason: collision with root package name */
        public static String f78669d;

        /* renamed from: e  reason: collision with root package name */
        public static String f78670e;

        static {
            Covode.recordClassIndex(48840);
        }
    }

    static {
        Covode.recordClassIndex(48839);
    }

    public static void b() {
        C1826a.f78666a = null;
        C1826a.f78667b = null;
        C1826a.f78668c = false;
        C1826a.f78669d = null;
        C1826a.f78670e = null;
    }

    public final void a() {
        this.o = false;
        this.f78660h = true;
        this.f78657e = false;
        this.n = false;
        this.f78659g = null;
        this.f78655c = 0;
        if (this.f78661i) {
            this.f78653a = 0;
        }
        this.f78665m = false;
    }

    public static l.a a(Context context) {
        if (j.f107224c != l.a.UNKNOWN && j.b() && !j.c()) {
            return j.f107224c;
        }
        l.a d2 = l.d(context);
        j.f107224c = d2;
        return d2;
    }

    public static void a(String str, String str2) {
        C1826a.f78666a = str;
        C1826a.f78667b = str2;
        C1826a.f78668c = false;
    }

    public static void a(String str, String str2, String str3) {
        C1826a.f78666a = str;
        C1826a.f78669d = str2;
        C1826a.f78670e = str3;
        C1826a.f78668c = true;
    }

    public final void a(WebView webView, String str, long j2, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.n = true;
        a(webView.getContext(), str, j2, str2, jSONObject, jSONObject2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d8 A[Catch:{ Exception -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f7 A[Catch:{ Exception -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0100 A[Catch:{ Exception -> 0x0178 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0101 A[Catch:{ Exception -> 0x0178 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r19, java.lang.String r20, long r21, java.lang.String r23, org.json.JSONObject r24, org.json.JSONObject r25) {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.a.a.a(android.content.Context, java.lang.String, long, java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }

    public final void a(Context context, String str, long j2, String str2, JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        JSONObject jSONObject3;
        long j3;
        String str3 = str;
        JSONObject jSONObject4 = jSONObject2;
        try {
            l.a a2 = a(context);
            if (a2 != l.a.NONE) {
                if (jSONObject == null) {
                    jSONObject3 = new JSONObject();
                } else {
                    jSONObject3 = jSONObject;
                }
                jSONObject3.put("ac", l.a(a2));
                long j4 = this.f78655c;
                if (j4 > 0) {
                    j3 = this.f78653a;
                } else {
                    j4 = System.currentTimeMillis();
                    j3 = this.f78653a;
                }
                long j5 = j4 - j3;
                if (a2 == l.a.WIFI) {
                    if (j5 < 1) {
                        return;
                    }
                } else if (j5 < 1) {
                    return;
                }
                if (j5 > 0) {
                    jSONObject3.put("duration", Math.min(j5, 90000L));
                    if (str3 == null) {
                        str3 = this.f78658f;
                        if (str3 == null && (str3 = this.f78663k) == null) {
                            return;
                        }
                    }
                    jSONObject3.put("is_ad_event", "1");
                    jSONObject3.put("tag", "draw_ad");
                    if (jSONObject4 == null) {
                        jSONObject4 = new JSONObject();
                    }
                    jSONObject4.put("next_url", str3);
                    int i3 = 1;
                    if (this.f78661i && this.f78662j != 1) {
                        i3 = 0;
                    }
                    jSONObject4.put("first_page", i3);
                    jSONObject4.put("render_type", "h5");
                    jSONObject4.put("pct", i2);
                    int i4 = this.f78654b;
                    if (i4 != -1) {
                        jSONObject4.put("preload_status", i4);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject4.toString());
                    ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
                    if (e2 != null) {
                        e2.a(str2, jSONObject);
                    }
                    a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", "progress_load_finish", String.valueOf(j2), "", "0");
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a3.b(next, jSONObject3.opt(next));
                    }
                    a3.b();
                }
            }
        } catch (Exception unused) {
        }
    }
}
