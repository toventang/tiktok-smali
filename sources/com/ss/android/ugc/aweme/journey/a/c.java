package com.ss.android.ugc.aweme.journey.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.dp;
import com.ss.android.ugc.aweme.journey.h;
import com.ss.android.ugc.aweme.journey.o;
import com.ss.android.ugc.aweme.journey.p;
import f.a.t;
import h.f.b.l;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public o f104805a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super z, z> f104806b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f104807c;

    static {
        Covode.recordClassIndex(67222);
    }

    public static final class b implements f.a.z<o> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f104809a;

        static {
            Covode.recordClassIndex(67224);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onComplete() {
            this.f104809a.f104807c = true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f104809a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            this.f104809a.f104807c = true;
            c cVar = this.f104809a;
            cVar.f104805a = oVar2;
            if (cVar.f104806b != null) {
                h.f.a.b<? super z, z> bVar = cVar.f104806b;
                if (bVar == null) {
                    l.b();
                }
                bVar.invoke(z.f158842a);
                cVar.f104806b = null;
            }
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f104808a;

        static {
            Covode.recordClassIndex(67223);
        }

        a(c cVar) {
            this.f104808a = cVar;
        }

        public final void run() {
            if (this.f104808a.f104806b != null) {
                h.f.a.b<? super z, z> bVar = this.f104808a.f104806b;
                if (bVar == null) {
                    l.b();
                }
                bVar.invoke(z.f158842a);
                this.f104808a.f104806b = null;
            }
        }
    }

    public c() {
        t<o> tVar;
        p a2 = p.a.a();
        String b2 = dp.a.b();
        if (b2 != null) {
            tVar = h.f104859a.getJourney(Integer.valueOf(a2.e()), "new_user_journey", b2);
        } else {
            tVar = h.f104859a.getJourney(Integer.valueOf(a2.e()), "new_user_journey", null);
        }
        tVar.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this));
    }

    public final void a(long j2, h.f.a.b<? super z, z> bVar) {
        l.d(bVar, "");
        if (this.f104807c) {
            bVar.invoke(z.f158842a);
            return;
        }
        this.f104806b = bVar;
        new Handler(Looper.getMainLooper()).postDelayed(new a(this), j2);
    }
}
