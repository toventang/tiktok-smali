package com.ss.android.ugc.aweme.account.unbind;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f65467a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(40256);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f65468a;

        static {
            Covode.recordClassIndex(40257);
        }

        a(h.f.a.a aVar) {
            this.f65468a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f65468a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f65469a;

        static {
            Covode.recordClassIndex(40258);
        }

        b(h.f.a.a aVar) {
            this.f65469a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f65469a.invoke();
        }
    }

    public static boolean b(c cVar) {
        l.d(cVar, "");
        if (cVar.V_() == k.UNBIND_EMAIL_VERIFY_USING_PHONE || cVar.V_() == k.UNBIND_PHONE_VERIFY) {
            return true;
        }
        return false;
    }

    public static boolean c(c cVar) {
        l.d(cVar, "");
        Bundle arguments = cVar.getArguments();
        if (arguments == null || !arguments.getBoolean("is_email_verified")) {
            return false;
        }
        return true;
    }

    public static boolean a(c cVar) {
        int i2;
        l.d(cVar, "");
        Bundle arguments = cVar.getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("current_scene");
        } else {
            i2 = -1;
        }
        if (i2 == j.UNBIND_PHONE.getValue()) {
            return true;
        }
        return false;
    }

    public static void a(c cVar, String str, h.f.a.a<z> aVar) {
        l.d(cVar, "");
        l.d(str, "");
        l.d(aVar, "");
        x.a(cVar, "", k.UNBIND_PHONE_CONFIRM, str).d(new b(aVar)).c();
    }

    public static void b(c cVar, String str, h.f.a.a<z> aVar) {
        l.d(cVar, "");
        l.d(str, "");
        l.d(aVar, "");
        x.a(cVar, "", 6, str, (Map) null, (String) null, 112).d(new a(aVar)).c();
    }
}
