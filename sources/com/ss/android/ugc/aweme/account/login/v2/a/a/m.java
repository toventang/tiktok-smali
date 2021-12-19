package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import f.a.d.f;
import h.f.b.l;
import org.json.JSONObject;

public final class m extends d {

    /* renamed from: b  reason: collision with root package name */
    public final a.C1412a f64180b;

    /* renamed from: c  reason: collision with root package name */
    public final int f64181c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f64182d;

    /* renamed from: e  reason: collision with root package name */
    public final j f64183e;

    /* renamed from: f  reason: collision with root package name */
    public final k f64184f;

    static {
        Covode.recordClassIndex(39545);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        e activity = this.f64729a.getActivity();
        String a2 = com.ss.android.ugc.aweme.account.login.h.a.a(this.f64180b);
        l.b(a2, "");
        TimerHolder.b a3 = TimerHolder.a.a(activity, a2, this.f64183e);
        if (a3 == null || (aVar = a3.f64744a) == null || !aVar.d()) {
            c cVar = this.f64729a;
            String a4 = com.ss.android.ugc.aweme.account.login.h.a.a(this.f64180b);
            l.b(a4, "");
            x.a(cVar, a4, this.f64183e, this.f64184f, "", "auto_system", (String) null, 192).d(new a(this)).c();
            return true;
        }
        c cVar2 = this.f64729a;
        Bundle arguments = this.f64729a.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", k.PHONE_SMS_LOGIN.getValue());
        arguments.putBoolean("code_sent", false);
        arguments.putBoolean("bind_secure", true);
        l.b(arguments, "");
        cVar2.a(arguments);
        return true;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f64185a;

        static {
            Covode.recordClassIndex(39546);
        }

        a(m mVar) {
            this.f64185a = mVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c cVar = this.f64185a.f64729a;
            Bundle arguments = this.f64185a.f64729a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", k.PHONE_SMS_LOGIN.getValue());
            arguments.putBoolean("code_sent", true);
            arguments.putBoolean("bind_secure", true);
            l.b(arguments, "");
            cVar.a(arguments);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(c cVar, a.C1412a aVar, int i2, JSONObject jSONObject, j jVar, k kVar) {
        super(cVar);
        l.d(cVar, "");
        l.d(aVar, "");
        l.d(jVar, "");
        l.d(kVar, "");
        this.f64180b = aVar;
        this.f64181c = i2;
        this.f64182d = jSONObject;
        this.f64183e = jVar;
        this.f64184f = kVar;
    }
}
