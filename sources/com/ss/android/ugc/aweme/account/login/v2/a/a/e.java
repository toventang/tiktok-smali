package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import f.a.d.f;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class e extends d {

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f64155b;

    static {
        Covode.recordClassIndex(39533);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        JSONObject jSONObject = this.f64155b;
        if (jSONObject != null) {
            String string = jSONObject.getString("email");
            String string2 = this.f64155b.getString("password");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                androidx.fragment.app.e activity = this.f64729a.getActivity();
                l.b(string, "");
                TimerHolder.b a2 = TimerHolder.a.a(activity, string, j.SIGN_UP);
                if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
                    x.a(this.f64729a, string, 1, "auto_system", (Map) null, string2, 64).d(new a(this, string2)).c();
                } else {
                    c cVar = this.f64729a;
                    Bundle arguments = this.f64729a.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putBoolean("code_sent", false);
                    arguments.putInt("next_page", k.EMAIL_SMS_SIGN_UP.getValue());
                    arguments.putString("password", string2);
                    l.b(arguments, "");
                    cVar.a(arguments);
                    return true;
                }
            }
        }
        return true;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f64156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f64157b;

        static {
            Covode.recordClassIndex(39534);
        }

        a(e eVar, String str) {
            this.f64156a = eVar;
            this.f64157b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c cVar = this.f64156a.f64729a;
            Bundle arguments = this.f64156a.f64729a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBoolean("code_sent", true);
            arguments.putInt("next_page", k.EMAIL_SMS_SIGN_UP.getValue());
            arguments.putString("password", this.f64157b);
            l.b(arguments, "");
            cVar.a(arguments);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(c cVar, JSONObject jSONObject) {
        super(cVar);
        l.d(cVar, "");
        this.f64155b = jSONObject;
    }
}
