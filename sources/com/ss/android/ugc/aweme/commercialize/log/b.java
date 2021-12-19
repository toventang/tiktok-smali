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

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private String f74749a;

    /* renamed from: b  reason: collision with root package name */
    private String f74750b;

    /* renamed from: c  reason: collision with root package name */
    private String f74751c;

    /* renamed from: d  reason: collision with root package name */
    private long f74752d;

    /* renamed from: e  reason: collision with root package name */
    private String f74753e;

    /* renamed from: f  reason: collision with root package name */
    private long f74754f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f74755g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f74756h;

    /* renamed from: i  reason: collision with root package name */
    private String f74757i;

    static {
        Covode.recordClassIndex(46102);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f74758a;

        /* renamed from: b  reason: collision with root package name */
        public String f74759b;

        /* renamed from: c  reason: collision with root package name */
        public String f74760c;

        /* renamed from: d  reason: collision with root package name */
        public String f74761d;

        /* renamed from: e  reason: collision with root package name */
        public long f74762e;

        /* renamed from: f  reason: collision with root package name */
        public String f74763f;

        /* renamed from: g  reason: collision with root package name */
        public long f74764g;

        /* renamed from: h  reason: collision with root package name */
        public JSONObject f74765h;

        /* renamed from: i  reason: collision with root package name */
        public JSONObject f74766i;

        static {
            Covode.recordClassIndex(46103);
        }

        public final b a() {
            if (TextUtils.isEmpty(this.f74758a)) {
                this.f74758a = "event_v1";
            }
            return new b(this);
        }
    }

    public final void a() {
        Object opt;
        if (com.bytedance.ies.android.base.runtime.a.f31872a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("category", this.f74749a);
            Context a2 = d.a();
            if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
                j.f107224c = l.d(a2);
            }
            bundle.putLong("nt", (long) j.f107224c.getValue());
            bundle.putString("tag", this.f74751c);
            bundle.putString("label", this.f74757i);
            bundle.putString("value", String.valueOf(this.f74752d));
            bundle.putString("log_extra", this.f74753e);
            bundle.putString("ext_value", String.valueOf(this.f74754f));
            bundle.putString("is_ad_event", "1");
            JSONObject jSONObject = this.f74755g;
            if (jSONObject != null) {
                bundle.putString("ad_extra_data", String.valueOf(jSONObject));
            }
            JSONObject jSONObject2 = this.f74756h;
            if (jSONObject2 != null) {
                try {
                    if (this.f74755g == null && (opt = jSONObject2.opt("ad_extra_data")) != null) {
                        bundle.putString("ad_extra_data", opt.toString());
                    }
                    Iterator<String> keys = this.f74756h.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle.putString(next, this.f74756h.getString(next));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            com.bytedance.ies.android.base.runtime.a.f31872a.onEventV3Bundle(this.f74750b, bundle);
        }
    }

    b(a aVar) {
        this.f74749a = aVar.f74758a;
        this.f74750b = aVar.f74759b;
        this.f74751c = aVar.f74760c;
        this.f74757i = aVar.f74761d;
        this.f74752d = aVar.f74762e;
        this.f74753e = aVar.f74763f;
        this.f74754f = aVar.f74764g;
        this.f74755g = aVar.f74765h;
        this.f74756h = aVar.f74766i;
    }
}
