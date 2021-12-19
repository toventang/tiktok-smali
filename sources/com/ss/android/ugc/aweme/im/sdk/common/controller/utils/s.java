package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.k;
import com.google.c.h.a.q;
import com.google.c.h.a.u;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.av;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.w;
import kotlinx.coroutines.y;

public final class s {
    static {
        Covode.recordClassIndex(65579);
    }

    public static final class a implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f102443a;

        static {
            Covode.recordClassIndex(65580);
        }

        a(w wVar) {
            this.f102443a = wVar;
        }

        @Override // com.google.c.h.a.k
        public final void onSuccess(T t) {
            this.f102443a.a((Object) t);
        }

        @Override // com.google.c.h.a.k
        public final void onFailure(Throwable th) {
            l.d(th, "");
            this.f102443a.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ q $this_asDeferred;

        static {
            Covode.recordClassIndex(65582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(1);
            this.$this_asDeferred = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            this.$this_asDeferred.cancel(false);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ w $deferred;
        final /* synthetic */ q $this_asDeferred;
        final /* synthetic */ long $timeout;
        int label;

        static {
            Covode.recordClassIndex(65581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, long j2, w wVar, d dVar) {
            super(2, dVar);
            this.$this_asDeferred = qVar;
            this.$timeout = j2;
            this.$deferred = wVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$this_asDeferred, this.$timeout, this.$deferred, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                long j2 = this.$timeout;
                this.label = 1;
                if (ay.a(j2, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.$deferred.k()) {
                this.$this_asDeferred.cancel(true);
                this.$deferred.a((Throwable) new TimeoutException());
            }
            return z.f158842a;
        }
    }

    public static final <T> av<T> a(q<T> qVar) {
        l.d(qVar, "");
        if (qVar.isDone()) {
            try {
                return y.a(com.google.c.h.a.y.a(qVar));
            } catch (ExecutionException e2) {
                w a2 = y.a();
                Throwable cause = e2.getCause();
                if (cause == null) {
                    cause = e2;
                }
                a2.a(cause);
                return a2;
            }
        } else {
            w a3 = y.a();
            com.google.c.h.a.l.a(qVar, new a(a3), u.a.INSTANCE);
            bz unused = i.a(bs.f159054a, bf.f159041b, null, new b(qVar, 3000, a3, null), 2);
            a3.a((h.f.a.b<? super Throwable, z>) new c(qVar));
            return a3;
        }
    }
}
