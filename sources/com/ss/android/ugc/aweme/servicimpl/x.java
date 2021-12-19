package com.ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.port.in.aw;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.utils.cp;
import com.ss.android.ugc.aweme.utils.permission.e;
import h.f.b.l;

public final class x implements aw {
    static {
        Covode.recordClassIndex(79946);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aw
    public final boolean a() {
        return e.a();
    }

    @Override // com.ss.android.ugc.aweme.port.in.v
    public final int a(Context context) {
        l.d(context, "");
        return e.c(context);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aw
    public final int b(Context context) {
        l.d(context, "");
        return e.a(context);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aw
    public final int c(Context context) {
        l.d(context, "");
        return e.b(context);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aw
    public final void d(Context context) {
        l.d(context, "");
        cp.a(context);
    }

    static final class a implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v.a f121947a;

        static {
            Covode.recordClassIndex(79947);
        }

        a(v.a aVar) {
            this.f121947a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            this.f121947a.a(strArr, iArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.aw
    public final int a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return androidx.core.app.a.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.aw
    public final boolean a(Activity activity, String str) {
        l.d(activity, "");
        l.d(str, "");
        return androidx.core.app.a.a(activity, str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.v
    public final void a(androidx.fragment.app.e eVar, v.a aVar, String... strArr) {
        l.d(eVar, "");
        l.d(aVar, "");
        l.d(strArr, "");
        b.a(eVar, strArr, new a(aVar));
    }
}
