package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.feed.be;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static b f74802a;

    static {
        Covode.recordClassIndex(46110);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f74803a;

        static {
            Covode.recordClassIndex(46111);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            if (this.f74803a == null) {
                this.f74803a = new JSONObject();
            }
            return this.f74803a;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, long j2) {
            try {
                a().put(str, j2);
            } catch (JSONException unused) {
            }
        }

        public final void a(String str, Object obj) {
            try {
                a().put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f74804a;

        /* renamed from: b  reason: collision with root package name */
        public String f74805b;

        /* renamed from: c  reason: collision with root package name */
        public String f74806c;

        /* renamed from: d  reason: collision with root package name */
        public String f74807d;

        /* renamed from: e  reason: collision with root package name */
        public final a f74808e = new a((byte) 0);

        /* renamed from: f  reason: collision with root package name */
        public String f74809f;

        static {
            Covode.recordClassIndex(46112);
        }

        public final void a(Context context) {
            Context context2 = context;
            if (context2 == null) {
                context2 = d.a();
            }
            b(context2);
            be a2 = g.a();
            String str = this.f74804a;
            String str2 = this.f74805b;
            JSONObject jSONObject = this.f74808e.f74803a;
            String str3 = this.f74806c;
            a2.a(context2, str, str2, jSONObject, (str3 == null || !str3.matches("[+-]?\\d+")) ? "0" : this.f74806c, c());
            f.a(this);
        }

        private long c() {
            try {
                String str = this.f74807d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return 0;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                return 0;
            }
        }

        public final void b() {
            b(d.a());
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "event_v3");
                if (!TextUtils.isEmpty(this.f74804a)) {
                    hashMap.put("tag", this.f74804a);
                }
                if (!TextUtils.isEmpty(this.f74805b)) {
                    hashMap.put("label", this.f74805b);
                }
                if (!TextUtils.isEmpty(this.f74806c)) {
                    hashMap.put("value", this.f74806c);
                }
                if (!TextUtils.isEmpty(this.f74807d)) {
                    hashMap.put("ext_value", this.f74807d);
                }
                JSONObject a2 = this.f74808e.a();
                ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
                if (e2 != null && !TextUtils.isEmpty(this.f74806c)) {
                    e2.a(this.f74806c, a2);
                }
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals("has_v3", next)) {
                        try {
                            Object opt = a2.opt(next);
                            if (opt instanceof String) {
                                hashMap.put(next, (String) opt);
                            } else {
                                hashMap.put(next, new com.google.gson.f().b(opt));
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.f74809f)) {
                    r.a(this.f74809f, hashMap);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            f.a(this);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f74804a = null;
            this.f74805b = null;
            this.f74806c = null;
            this.f74807d = null;
            this.f74808e.f74803a = null;
        }

        public final b a(long j2) {
            this.f74808e.a("duration", j2);
            return this;
        }

        public final b c(Long l2) {
            this.f74808e.a("ad_id", l2);
            return this;
        }

        public final b d(String str) {
            this.f74808e.a("track_label", str);
            return this;
        }

        public final b e(String str) {
            this.f74808e.a("log_extra", str);
            return this;
        }

        public final b a(Long l2) {
            String l3;
            if (l2 == null) {
                l3 = null;
            } else {
                l3 = l2.toString();
            }
            this.f74806c = l3;
            return this;
        }

        public final b b(ac acVar) {
            if (acVar != null) {
                this.f74806c = acVar.creativeId;
                e(acVar.logExtra);
            }
            return this;
        }

        private void b(Context context) {
            this.f74808e.a("is_ad_event", "1");
            String c2 = c(context);
            if (!m.a(c2)) {
                this.f74808e.a("nt", c2);
            }
        }

        public final b a(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                a(awemeRawAd.getCreativeId());
                e(awemeRawAd.getLogExtra());
                this.f74808e.a("ad_id", awemeRawAd.getAdId());
            }
            return this;
        }

        public final b c(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f74808e.a("refer", str);
            }
            return this;
        }

        private static String c(Context context) {
            if (!TextUtils.isEmpty(j.f107222a) && j.b() && !j.c()) {
                return j.f107222a;
            }
            String a2 = l.a(l.a(context));
            j.f107222a = a2;
            return a2;
        }

        public final b a(ac acVar) {
            String str;
            if (acVar != null) {
                String str2 = "";
                if (acVar.creativeId == null) {
                    str = str2;
                } else {
                    str = acVar.creativeId;
                }
                this.f74806c = str;
                if (acVar.logExtra != null) {
                    str2 = acVar.logExtra;
                }
                e(str2);
                this.f74808e.a("ad_id", -1);
            }
            return this;
        }

        public final b b(Aweme aweme) {
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                b(aweme.getAwemeRawAd());
            }
            return this;
        }

        public final b a(Banner banner) {
            String logExtra;
            if (banner != null) {
                a(Long.valueOf(banner.getCreativeId()));
                if (banner.getLogExtra() == null) {
                    logExtra = "";
                } else {
                    logExtra = banner.getLogExtra();
                }
                e(logExtra);
                this.f74808e.a("ad_id", -1);
            }
            return this;
        }

        public final b b(AwemeRawAd awemeRawAd) {
            if (awemeRawAd != null) {
                a(awemeRawAd.getCreativeId());
                b(awemeRawAd.getGroupId());
                e(awemeRawAd.getLogExtra());
            }
            return this;
        }

        public final b a(Aweme aweme) {
            if (aweme == null) {
                throw new NullPointerException("getAwemeRawAd");
            }
            a(aweme.getAwemeRawAd().getCreativeId());
            e(aweme.getAwemeRawAd().getLogExtra());
            this.f74808e.a("ad_id", aweme.getAwemeRawAd().getAdId());
            return this;
        }

        public final b b(Long l2) {
            String l3;
            if (l2 == null) {
                l3 = null;
            } else {
                l3 = l2.toString();
            }
            this.f74807d = l3;
            return this;
        }

        public final b a(Object obj) {
            this.f74808e.a("ad_extra_data", new com.google.gson.f().b(obj));
            return this;
        }

        public final b b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f74808e.a("tag_id", str);
            }
            return this;
        }

        public final b a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f74808e.a("prop_id", str);
            }
            return this;
        }

        public final b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f74808e.a(next, jSONObject.opt(next));
                }
            }
            return this;
        }

        public final b a(JSONObject jSONObject) {
            this.f74808e.a("ad_extra_data", jSONObject);
            return this;
        }
    }

    public static b a() {
        b bVar;
        MethodCollector.i(7302);
        synchronized (f.class) {
            try {
                bVar = f74802a;
                if (bVar != null) {
                    f74802a = null;
                } else {
                    bVar = null;
                }
            } finally {
                MethodCollector.o(7302);
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
        MethodCollector.i(7310);
        synchronized (f.class) {
            try {
                if (f74802a == null) {
                    f74802a = bVar;
                    bVar.a();
                }
            } finally {
                MethodCollector.o(7310);
            }
        }
    }

    public static b a(String str, String str2, long j2) {
        b a2 = a();
        a2.f74808e.a("ad_event_priority", "10");
        a2.f74808e.a("ad_event_type", "monitor");
        a2.f74808e.a("track_url_list", str);
        a2.f74808e.a("track_status", str2);
        a2.f74808e.a("ts", j2);
        String a3 = RawURLGetter.a("other");
        if (!TextUtils.isEmpty(a3)) {
            a2.f74808e.a("user_agent", a3);
        }
        return a2;
    }
}
