package com.ss.android.ugc.aweme.account.network.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.e;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.LoginService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import org.json.JSONObject;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f65206a = i.a((h.f.a.a) d.f65208a);

    static final class b implements com.ss.android.account.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65207a = new b();

        static {
            Covode.recordClassIndex(40093);
        }

        b() {
        }
    }

    static {
        Covode.recordClassIndex(40091);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$a  reason: collision with other inner class name */
    public static final class C1453a extends com.ss.android.account.a.a {
        static {
            Covode.recordClassIndex(40092);
        }

        @Override // com.ss.android.account.a.b, com.ss.android.account.a.a
        public final boolean a() {
            return true;
        }

        C1453a() {
        }
    }

    public static final class c implements com.bytedance.sdk.a.o.c {
        static {
            Covode.recordClassIndex(40094);
        }

        c() {
        }

        @Override // com.bytedance.sdk.a.o.c
        public final void a(long j2, String str) {
            AppLog.setSessionKey(str);
        }

        @Override // com.bytedance.sdk.a.o.c
        public final void a(String str, JSONObject jSONObject) {
            r.a(str, jSONObject);
        }
    }

    @Override // com.ss.android.e
    public final com.ss.android.account.c.a g() {
        return b.f65207a;
    }

    static final class d extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65208a = new d();

        static {
            Covode.recordClassIndex(40095);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    @Override // com.ss.android.e
    public final String a() {
        l.b("api-va.tiktokv.com", "");
        return "api-va.tiktokv.com";
    }

    @Override // com.ss.android.e
    public final Context b() {
        return com.ss.android.ugc.aweme.a.a();
    }

    @Override // com.ss.android.e
    public final com.bytedance.sdk.a.o.c e() {
        return new c();
    }

    @Override // com.ss.android.e
    public final com.ss.android.account.a.b f() {
        return new C1453a();
    }

    @Override // com.ss.android.e
    public final com.bytedance.sdk.a.d c() {
        return (b) this.f65206a.getValue();
    }

    @Override // com.ss.android.e
    public final boolean d() {
        LoginService g2 = cj.g();
        l.b(g2, "");
        return g2.isEnableMultiAccountLogin();
    }
}
