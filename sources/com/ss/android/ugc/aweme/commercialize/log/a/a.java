package com.ss.android.ugc.aweme.commercialize.log.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.f;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static b f74713a;

    static {
        Covode.recordClassIndex(46079);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.a.a$a  reason: collision with other inner class name */
    public static class C1700a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f74714a;

        static {
            Covode.recordClassIndex(46080);
        }

        private C1700a() {
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            if (this.f74714a == null) {
                this.f74714a = new JSONObject();
            }
            return this.f74714a;
        }

        /* synthetic */ C1700a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, long j2) {
            try {
                a().put(str, j2);
            } catch (JSONException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, Object obj) {
            try {
                a().put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f74715a;

        /* renamed from: b  reason: collision with root package name */
        public String f74716b;

        /* renamed from: c  reason: collision with root package name */
        public String f74717c;

        /* renamed from: d  reason: collision with root package name */
        public String f74718d;

        /* renamed from: e  reason: collision with root package name */
        public final C1700a f74719e = new C1700a((byte) 0);

        /* renamed from: f  reason: collision with root package name */
        public String f74720f;

        static {
            Covode.recordClassIndex(46081);
        }

        private long e() {
            try {
                String str = this.f74718d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return 0;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                return 0;
            }
        }

        public final b b() {
            this.f74719e.a("ad_event_type", "debug");
            return this;
        }

        private void f() {
            this.f74719e.a("is_ad_event", "1");
            String a2 = a(d.a());
            if (!m.a(a2)) {
                this.f74719e.a("nt", a2);
            }
        }

        public final void c() {
            String str;
            f();
            String str2 = this.f74715a;
            String str3 = this.f74716b;
            JSONObject jSONObject = this.f74719e.f74714a;
            String str4 = this.f74717c;
            if (str4 == null || !str4.matches("[+-]?\\d+")) {
                str = "0";
            } else {
                str = this.f74717c;
            }
            i.a(str2, str3, jSONObject, str, e());
            a.a(this);
        }

        public final void d() {
            d.a();
            f();
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "event_v3");
                if (!TextUtils.isEmpty(this.f74715a)) {
                    hashMap.put("tag", this.f74715a);
                }
                if (!TextUtils.isEmpty(this.f74716b)) {
                    hashMap.put("label", this.f74716b);
                }
                if (!TextUtils.isEmpty(this.f74717c)) {
                    hashMap.put("value", this.f74717c);
                }
                if (!TextUtils.isEmpty(this.f74718d)) {
                    hashMap.put("ext_value", this.f74718d);
                }
                JSONObject a2 = this.f74719e.a();
                com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(this.f74715a, this.f74716b, this.f74717c, a2);
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals("has_v3", next)) {
                        try {
                            Object opt = a2.opt(next);
                            if (opt instanceof String) {
                                hashMap.put(next, (String) opt);
                            } else {
                                hashMap.put(next, new f().b(opt));
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f74720f) && com.bytedance.ies.android.base.runtime.a.f31872a != null) {
                    com.bytedance.ies.android.base.runtime.a.f31872a.onEventV3Map(this.f74720f, hashMap);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            a.a(this);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f74715a = null;
            this.f74716b = null;
            this.f74717c = null;
            this.f74718d = null;
            this.f74719e.f74714a = null;
        }

        public final b b(String str) {
            this.f74719e.a("track_label", str);
            return this;
        }

        public final b c(String str) {
            this.f74719e.a("log_extra", str);
            return this;
        }

        public final b a(Long l2) {
            String l3;
            if (l2 == null) {
                l3 = null;
            } else {
                l3 = l2.toString();
            }
            this.f74717c = l3;
            return this;
        }

        public final b a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                a(awemeRawAd.getCreativeId());
                c(awemeRawAd.getLogExtra());
                this.f74719e.a("ad_id", awemeRawAd.getAdId());
            }
            return this;
        }

        public final b b(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                a(awemeRawAd.getCreativeId());
                b(awemeRawAd.getGroupId());
                c(awemeRawAd.getLogExtra());
            }
            return this;
        }

        private static String a(Context context) {
            if (!TextUtils.isEmpty(j.f107222a) && j.b() && !j.c()) {
                return j.f107222a;
            }
            String a2 = l.a(l.a(context));
            j.f107222a = a2;
            return a2;
        }

        public final b b(Long l2) {
            String l3;
            if (l2 == null) {
                l3 = null;
            } else {
                l3 = l2.toString();
            }
            this.f74718d = l3;
            return this;
        }

        public final b a(Object obj) {
            this.f74719e.a("ad_extra_data", new f().b(obj));
            return this;
        }

        public final b a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f74719e.a("refer", str);
            }
            return this;
        }
    }

    public static b a() {
        b bVar;
        MethodCollector.i(987);
        synchronized (a.class) {
            try {
                bVar = f74713a;
                if (bVar != null) {
                    f74713a = null;
                } else {
                    bVar = null;
                }
            } finally {
                MethodCollector.o(987);
            }
        }
        if (bVar == null) {
            bVar = new b();
        } else {
            bVar.a();
        }
        return bVar;
    }

    static void a(b bVar) {
        MethodCollector.i(990);
        synchronized (a.class) {
            try {
                if (f74713a == null) {
                    f74713a = bVar;
                    bVar.a();
                }
            } finally {
                MethodCollector.o(990);
            }
        }
    }

    public static b a(String str, String str2, long j2) {
        b a2 = a();
        a2.f74719e.a("ad_event_priority", "10");
        a2.f74719e.a("ad_event_type", "monitor");
        a2.f74719e.a("track_url_list", str);
        a2.f74719e.a("track_status", str2);
        a2.f74719e.a("ts", j2);
        String e2 = com.ss.android.ugc.aweme.commercialize.track.a.f75356a.e();
        if (!TextUtils.isEmpty(e2)) {
            a2.f74719e.a("user_agent", e2);
        }
        return a2;
    }
}
