package h.c.a;

import com.bytedance.covode.number.Covode;
import h.c.b.a.i;
import h.c.f;
import h.c.g;
import h.f.a.m;
import h.f.b.ad;
import h.f.b.l;
import h.r;
import h.z;
import java.util.Objects;

public class c {
    static {
        Covode.recordClassIndex(105104);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.c.d<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h.c.d<T> a(h.c.d<? super T> dVar) {
        h.c.b.a.d dVar2;
        h.c.d<T> dVar3;
        l.d(dVar, "");
        if (!(dVar instanceof h.c.b.a.d)) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        h.c.b.a.d dVar4 = dVar2;
        return (dVar4 == null || (dVar3 = (h.c.d<T>) dVar4.intercepted()) == null) ? dVar : dVar3;
    }

    public static final class a extends i {
        final /* synthetic */ h.c.d $completion;
        final /* synthetic */ h.f.a.b $this_createCoroutineUnintercepted$inlined;
        private int label;

        static {
            Covode.recordClassIndex(105105);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                r.a(obj);
                h.f.a.b bVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((h.f.a.b) ad.b(bVar, 1)).invoke(this);
            } else if (i2 == 1) {
                this.label = 2;
                r.a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.c.d dVar, h.c.d dVar2, h.f.a.b bVar) {
            super(dVar2);
            this.$completion = dVar;
            this.$this_createCoroutineUnintercepted$inlined = bVar;
        }
    }

    public static final class b extends h.c.b.a.d {
        final /* synthetic */ h.c.d $completion;
        final /* synthetic */ f $context;
        final /* synthetic */ h.f.a.b $this_createCoroutineUnintercepted$inlined;
        private int label;

        static {
            Covode.recordClassIndex(105106);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                r.a(obj);
                h.f.a.b bVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((h.f.a.b) ad.b(bVar, 1)).invoke(this);
            } else if (i2 == 1) {
                this.label = 2;
                r.a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.c.d dVar, f fVar, h.c.d dVar2, f fVar2, h.f.a.b bVar) {
            super(dVar2, fVar2);
            this.$completion = dVar;
            this.$context = fVar;
            this.$this_createCoroutineUnintercepted$inlined = bVar;
        }
    }

    /* renamed from: h.c.a.c$c  reason: collision with other inner class name */
    public static final class C4182c extends i {
        final /* synthetic */ h.c.d $completion;
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ m $this_createCoroutineUnintercepted$inlined;
        private int label;

        static {
            Covode.recordClassIndex(105107);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                r.a(obj);
                m mVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((m) ad.b(mVar, 2)).invoke(this.$receiver$inlined, this);
            } else if (i2 == 1) {
                this.label = 2;
                r.a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4182c(h.c.d dVar, h.c.d dVar2, m mVar, Object obj) {
            super(dVar2);
            this.$completion = dVar;
            this.$this_createCoroutineUnintercepted$inlined = mVar;
            this.$receiver$inlined = obj;
        }
    }

    public static final class d extends h.c.b.a.d {
        final /* synthetic */ h.c.d $completion;
        final /* synthetic */ f $context;
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ m $this_createCoroutineUnintercepted$inlined;
        private int label;

        static {
            Covode.recordClassIndex(105108);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2 = this.label;
            if (i2 == 0) {
                this.label = 1;
                r.a(obj);
                m mVar = this.$this_createCoroutineUnintercepted$inlined;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                return ((m) ad.b(mVar, 2)).invoke(this.$receiver$inlined, this);
            } else if (i2 == 1) {
                this.label = 2;
                r.a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h.c.d dVar, f fVar, h.c.d dVar2, f fVar2, m mVar, Object obj) {
            super(dVar2, fVar2);
            this.$completion = dVar;
            this.$context = fVar;
            this.$this_createCoroutineUnintercepted$inlined = mVar;
            this.$receiver$inlined = obj;
        }
    }

    public static final <T> h.c.d<z> a(h.f.a.b<? super h.c.d<? super T>, ? extends Object> bVar, h.c.d<? super T> dVar) {
        l.d(bVar, "");
        l.d(dVar, "");
        l.d(dVar, "");
        if (bVar instanceof h.c.b.a.a) {
            return ((h.c.b.a.a) bVar).create(dVar);
        }
        f context = dVar.getContext();
        if (context == g.INSTANCE) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new a(dVar, dVar, bVar);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new b(dVar, context, dVar, context, bVar);
    }

    public static final <R, T> h.c.d<z> a(m<? super R, ? super h.c.d<? super T>, ? extends Object> mVar, R r, h.c.d<? super T> dVar) {
        l.d(mVar, "");
        l.d(dVar, "");
        l.d(dVar, "");
        if (mVar instanceof h.c.b.a.a) {
            return ((h.c.b.a.a) mVar).create(r, dVar);
        }
        f context = dVar.getContext();
        if (context == g.INSTANCE) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new C4182c(dVar, dVar, mVar, r);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new d(dVar, context, dVar, context, mVar, r);
    }
}
