package com.ss.android.ugc.aweme.profile.presenter;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.profile.service.h;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class ac extends c<b<ad>, v> {

    /* renamed from: a  reason: collision with root package name */
    public final String f116513a = (com.ss.android.c.b.f59141e + "/aweme/v1/user/uniqueid/");

    static {
        Covode.recordClassIndex(75299);
    }

    public static final class a extends b<ad> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f116514a;

        static {
            Covode.recordClassIndex(75300);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ac$a$a  reason: collision with other inner class name */
        static final class CallableC2971a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Uri.Builder f116515a;

            static {
                Covode.recordClassIndex(75301);
            }

            CallableC2971a(Uri.Builder builder) {
                this.f116515a = builder;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.f116622a.apiExecuteGetJSONObject(this.f116515a.toString(), ad.class, "", true, null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(ac acVar) {
            this.f116514a = acVar;
        }

        @Override // com.ss.android.ugc.aweme.common.b
        public final boolean checkParams(Object... objArr) {
            l.d(objArr, "");
            if (objArr.length == 1) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.common.b
        public final boolean sendRequest(Object... objArr) {
            l.d(objArr, "");
            if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                return false;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            Uri.Builder buildUpon = Uri.parse(this.f116514a.f116513a).buildUpon();
            buildUpon.appendQueryParameter("id", (String) obj);
            n.a().a(this.mHandler, new CallableC2971a(buildUpon), 0);
            return true;
        }
    }

    public ac() {
        a(new a(this));
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        String str;
        T t;
        T t2;
        super.c();
        b bVar = this.f76396h;
        String str2 = null;
        if (bVar == null || (t2 = bVar.mData) == null) {
            str = null;
        } else {
            str = t2.f116516a;
        }
        b bVar2 = this.f76396h;
        if (!(bVar2 == null || (t = bVar2.mData) == null)) {
            str2 = t.f116517b;
        }
        if (str != null && str2 != null) {
            ((v) this.f76397i).a(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        super.a_(exc);
        ((v) this.f76397i).d();
    }
}
