package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public abstract class af {

    /* renamed from: a  reason: collision with root package name */
    public boolean f74725a;

    static {
        Covode.recordClassIndex(46087);
    }

    public abstract boolean a();

    public abstract boolean b();

    public final boolean a(a aVar) {
        l.d(aVar, "");
        if (!this.f74725a || !a() || !b()) {
            return false;
        }
        return true;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f74726a;

        /* renamed from: b  reason: collision with root package name */
        public String f74727b;

        /* renamed from: c  reason: collision with root package name */
        public String f74728c;

        /* renamed from: d  reason: collision with root package name */
        public String f74729d;

        /* renamed from: e  reason: collision with root package name */
        public long f74730e;

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f74731f;

        static {
            Covode.recordClassIndex(46088);
        }

        public a(Context context, String str, String str2, String str3, long j2, JSONObject jSONObject) {
            this.f74726a = context;
            this.f74727b = str;
            this.f74728c = str2;
            this.f74729d = str3;
            this.f74730e = j2;
            this.f74731f = jSONObject;
        }
    }
}
