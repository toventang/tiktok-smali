package com.ss.android.ugc.aweme.account.login.e;

import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.a.a;
import com.google.android.gms.internal.b.h;
import com.ss.android.ugc.aweme.account.m.a;
import com.ss.android.ugc.aweme.account.util.m;
import com.ss.android.ugc.aweme.common.r;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f63433a = false;

    /* renamed from: b  reason: collision with root package name */
    public t<String> f63434b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    boolean f63435c;

    /* renamed from: d  reason: collision with root package name */
    int f63436d;

    /* renamed from: e  reason: collision with root package name */
    private Context f63437e;

    /* renamed from: f  reason: collision with root package name */
    private e f63438f;

    /* renamed from: g  reason: collision with root package name */
    private a f63439g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f63440h;

    static {
        Covode.recordClassIndex(39084);
    }

    private boolean d() {
        this.f63436d = com.ss.android.ugc.aweme.account.n.f.b(this.f63437e);
        boolean a2 = m.a(this.f63437e);
        this.f63435c = a2;
        if (!a2 || this.f63436d != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (!this.f63440h) {
            a("Feature cannot be used", this.f63435c, this.f63436d);
        } else {
            this.f63439g.a().a(new g(this));
        }
    }

    public final void c() {
        e eVar;
        if (d() && (eVar = this.f63438f) != null) {
            try {
                eVar.f63431a.unregisterReceiver(eVar);
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        if (this.f63440h) {
            if (this.f63438f == null) {
                this.f63438f = new e(this.f63437e, this.f63434b);
            }
            e eVar = this.f63438f;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            try {
                e.a(eVar.f63431a, eVar, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    public f(Context context) {
        this.f63437e = context;
        this.f63439g = new h(context);
        this.f63440h = d();
    }

    static void a(String str, boolean z, int i2) {
        com.ss.android.ugc.aweme.account.i.a.b(false, str, z, i2);
        a.C1450a.a(false, str, z, i2);
        r.a("sms_auto_fill", new com.ss.android.ugc.aweme.account.a.b.a().a("is_successful", 0).a("error_desc", str).a("has_sim_card", z ? 1 : 0).a("google_availability", i2).f62575a);
    }
}
