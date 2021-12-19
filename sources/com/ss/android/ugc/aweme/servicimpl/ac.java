package com.ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.w;
import com.ss.android.ugc.aweme.servicimpl.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class ac implements w {

    /* renamed from: a  reason: collision with root package name */
    private final h f121846a = i.a((h.f.a.a) a.f121847a);

    static {
        Covode.recordClassIndex(79897);
    }

    private final w a() {
        return (w) this.f121846a.getValue();
    }

    static final class a extends m implements h.f.a.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121847a = new a();

        static {
            Covode.recordClassIndex(79898);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ w invoke() {
            return new ab.a();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $onPostNowClickListener;

        static {
            Covode.recordClassIndex(79899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.a aVar) {
            super(0);
            this.$onPostNowClickListener = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            this.$onPostNowClickListener.invoke();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.w
    public final void b(Activity activity) {
        w a2 = a();
        if (a2 != null) {
            a2.b(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.w
    public final boolean a(Activity activity) {
        l.d(activity, "");
        w a2 = a();
        if (a2 != null) {
            return a2.a(activity);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.w
    public final void a(Activity activity, h.f.a.a<z> aVar) {
        l.d(activity, "");
        l.d(aVar, "");
        w a2 = a();
        if (a2 != null) {
            a2.a(activity, new b(aVar));
        }
    }
}
