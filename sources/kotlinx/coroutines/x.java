package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.b.a.d;

/* access modifiers changed from: package-private */
public final class x<T> extends JobSupport implements w<T> {

    /* access modifiers changed from: package-private */
    public static final class a extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(105717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(x xVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = xVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((h.c.d) this);
        }
    }

    static {
        Covode.recordClassIndex(105716);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean cH_() {
        return true;
    }

    @Override // kotlinx.coroutines.av
    public final T c() {
        return (T) r();
    }

    @Override // kotlinx.coroutines.w
    public final boolean a(T t) {
        return d((Object) t);
    }

    public x(bz bzVar) {
        super(true);
        a((bz) null);
    }

    @Override // kotlinx.coroutines.w
    public final boolean a(Throwable th) {
        return d(new CompletedExceptionally(th, false, 2, null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // kotlinx.coroutines.av
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(h.c.d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.x.a
            if (r0 == 0) goto L_0x0030
            r4 = r6
            kotlinx.coroutines.x$a r4 = (kotlinx.coroutines.x.a) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0030
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L_0x0013:
            java.lang.Object r3 = r4.result
            h.c.a.a r2 = h.c.a.a.COROUTINE_SUSPENDED
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r0) goto L_0x0036
            h.r.a(r3)
        L_0x0021:
            return r3
        L_0x0022:
            h.r.a(r3)
            r4.L$0 = r5
            r4.label = r0
            java.lang.Object r3 = r5.c(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x0030:
            kotlinx.coroutines.x$a r4 = new kotlinx.coroutines.x$a
            r4.<init>(r5, r6)
            goto L_0x0013
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.x.a(h.c.d):java.lang.Object");
    }
}
