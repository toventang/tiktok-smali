package com.ss.android.ugc.aweme.utils;

import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.h;
import kotlinx.coroutines.internal.o;

public final class ef {
    static {
        Covode.recordClassIndex(93465);
    }

    static final class b extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ LiveData $liveData;
        final /* synthetic */ u $observer;
        final /* synthetic */ androidx.lifecycle.m $owner;
        int label;

        static {
            Covode.recordClassIndex(93467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LiveData liveData, androidx.lifecycle.m mVar, u uVar, d dVar) {
            super(2, dVar);
            this.$liveData = liveData;
            this.$owner = mVar;
            this.$observer = uVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$liveData, this.$owner, this.$observer, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.$liveData.observe(this.$owner, this.$observer);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ androidx.lifecycle.l $observer;
        final /* synthetic */ androidx.lifecycle.m $owner;
        int label;

        static {
            Covode.recordClassIndex(93466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(androidx.lifecycle.m mVar, androidx.lifecycle.l lVar, d dVar) {
            super(2, dVar);
            this.$owner = mVar;
            this.$observer = lVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$owner, this.$observer, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            i lifecycle;
            if (this.label == 0) {
                r.a(obj);
                androidx.lifecycle.m mVar = this.$owner;
                if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                    return null;
                }
                lifecycle.a(this.$observer);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ androidx.lifecycle.l $observer;
        final /* synthetic */ androidx.lifecycle.m $owner;
        int label;

        static {
            Covode.recordClassIndex(93468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(androidx.lifecycle.m mVar, androidx.lifecycle.l lVar, d dVar) {
            super(2, dVar);
            this.$owner = mVar;
            this.$observer = lVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$owner, this.$observer, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            i lifecycle;
            if (this.label == 0) {
                r.a(obj);
                androidx.lifecycle.m mVar = this.$owner;
                if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
                    return null;
                }
                lifecycle.b(this.$observer);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void b(androidx.lifecycle.m mVar, androidx.lifecycle.l lVar) {
        i lifecycle;
        l.d(lVar, "");
        if (!l.a(Looper.getMainLooper(), Looper.myLooper())) {
            h.a(o.f159148a, new c(mVar, lVar, null));
        } else if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
            lifecycle.b(lVar);
        }
    }

    public static final void a(androidx.lifecycle.m mVar, androidx.lifecycle.l lVar) {
        i lifecycle;
        l.d(lVar, "");
        if (!l.a(Looper.getMainLooper(), Looper.myLooper())) {
            h.a(o.f159148a, new a(mVar, lVar, null));
        } else if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
            lifecycle.a(lVar);
        }
    }

    public static final <T> void a(LiveData<T> liveData, androidx.lifecycle.m mVar, u<T> uVar) {
        l.d(uVar, "");
        if (liveData != null && mVar != null) {
            if (l.a(Looper.getMainLooper(), Looper.myLooper())) {
                liveData.observe(mVar, uVar);
            } else {
                h.a(o.f159148a, new b(liveData, mVar, uVar, null));
            }
        }
    }
}
