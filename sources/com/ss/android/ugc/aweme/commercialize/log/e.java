package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private String f74784a;

    /* renamed from: b  reason: collision with root package name */
    private String f74785b;

    /* renamed from: c  reason: collision with root package name */
    private String f74786c;

    /* renamed from: d  reason: collision with root package name */
    private long f74787d;

    /* renamed from: e  reason: collision with root package name */
    private String f74788e;

    /* renamed from: f  reason: collision with root package name */
    private long f74789f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f74790g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f74791h;

    /* renamed from: i  reason: collision with root package name */
    private String f74792i;

    static {
        Covode.recordClassIndex(46108);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f74793a;

        /* renamed from: b  reason: collision with root package name */
        String f74794b;

        /* renamed from: c  reason: collision with root package name */
        String f74795c;

        /* renamed from: d  reason: collision with root package name */
        long f74796d;

        /* renamed from: e  reason: collision with root package name */
        long f74797e;

        /* renamed from: f  reason: collision with root package name */
        JSONObject f74798f;

        /* renamed from: g  reason: collision with root package name */
        private String f74799g;

        /* renamed from: h  reason: collision with root package name */
        private String f74800h;

        /* renamed from: i  reason: collision with root package name */
        private JSONObject f74801i;

        static {
            Covode.recordClassIndex(46109);
        }

        public final e a() {
            if (TextUtils.isEmpty(this.f74793a)) {
                this.f74793a = "event_v1";
            }
            return new e(this.f74793a, this.f74794b, this.f74795c, this.f74799g, this.f74796d, this.f74800h, this.f74797e, this.f74801i, this.f74798f);
        }
    }

    public final void a() {
        Object opt;
        Bundle bundle = new Bundle();
        bundle.putString("category", this.f74784a);
        Context a2 = d.a();
        if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107224c = l.d(a2);
        }
        bundle.putLong("nt", (long) j.f107224c.getValue());
        bundle.putString("tag", this.f74786c);
        bundle.putString("label", this.f74792i);
        bundle.putString("value", String.valueOf(this.f74787d));
        bundle.putString("log_extra", this.f74788e);
        bundle.putString("ext_value", String.valueOf(this.f74789f));
        bundle.putString("is_ad_event", "1");
        JSONObject jSONObject = this.f74790g;
        if (jSONObject != null) {
            bundle.putString("ad_extra_data", String.valueOf(jSONObject));
        }
        JSONObject jSONObject2 = this.f74791h;
        if (jSONObject2 != null) {
            try {
                if (this.f74790g == null && (opt = jSONObject2.opt("ad_extra_data")) != null) {
                    bundle.putString("ad_extra_data", opt.toString());
                }
                Iterator<String> keys = this.f74791h.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, this.f74791h.getString(next));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        com.ss.android.common.c.a.a(this.f74785b, bundle);
    }

    e(String str, String str2, String str3, String str4, long j2, String str5, long j3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f74784a = str;
        this.f74785b = str2;
        this.f74786c = str3;
        this.f74792i = str4;
        this.f74787d = j2;
        this.f74788e = str5;
        this.f74789f = j3;
        this.f74790g = jSONObject;
        this.f74791h = jSONObject2;
    }
}
