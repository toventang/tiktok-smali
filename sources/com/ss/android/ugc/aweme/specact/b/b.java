package com.ss.android.ugc.aweme.specact.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.t;
import f.a.x;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class b implements g<t<? extends Throwable>, t<?>> {

    /* renamed from: a  reason: collision with root package name */
    public int f134055a;

    /* renamed from: b  reason: collision with root package name */
    public final int f134056b = 2;

    /* renamed from: c  reason: collision with root package name */
    public final long f134057c = 3000;

    static {
        Covode.recordClassIndex(87691);
    }

    public static final class a implements g<Throwable, t<?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134058a;

        static {
            Covode.recordClassIndex(87692);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f134058a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ t<?> apply(Throwable th) {
            Throwable th2 = th;
            l.d(th2, "");
            b bVar = this.f134058a;
            int i2 = bVar.f134055a;
            bVar.f134055a = i2 + 1;
            if (i2 < this.f134058a.f134056b) {
                return t.b(this.f134058a.f134057c, TimeUnit.MILLISECONDS);
            }
            return t.a(th2);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // f.a.d.g
    public final /* synthetic */ t<?> apply(t<? extends Throwable> tVar) {
        t<? extends Throwable> tVar2 = tVar;
        l.d(tVar2, "");
        t<R> a2 = tVar2.a((g<? super Object, ? extends x<? extends R>>) new a(this), false);
        l.b(a2, "");
        return a2;
    }
}
