package com.ss.android.ugc.aweme.account.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.account.c;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C1392a f62961e = new C1392a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.sdk.a.n.a f62962a;

    /* renamed from: b  reason: collision with root package name */
    public String f62963b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f62964c = true;

    /* renamed from: d  reason: collision with root package name */
    public JSONObject f62965d;

    static {
        Covode.recordClassIndex(38788);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.e.a$a  reason: collision with other inner class name */
    public static final class C1392a {
        static {
            Covode.recordClassIndex(38789);
        }

        private C1392a() {
        }

        public /* synthetic */ C1392a(byte b2) {
            this();
        }
    }

    public a(String str, JSONObject jSONObject) {
        l.d(jSONObject, "");
        this.f62963b = str;
        this.f62965d = jSONObject;
        this.f62962a = c.a.a(jSONObject);
    }
}
