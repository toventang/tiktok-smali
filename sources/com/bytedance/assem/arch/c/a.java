package com.bytedance.assem.arch.c;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    final h f25505a = i.a((h.f.a.a) b.f25507a);

    /* renamed from: b  reason: collision with root package name */
    private final h f25506b = i.a((h.f.a.a) new C0536a(this));

    static {
        Covode.recordClassIndex(14858);
    }

    private final Handler a() {
        return (Handler) this.f25506b.getValue();
    }

    static final class b extends m implements h.f.a.a<HandlerThread> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25507a = new b();

        static {
            Covode.recordClassIndex(14860);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("assem-handler-executor");
            handlerThread.start();
            return handlerThread;
        }
    }

    /* renamed from: com.bytedance.assem.arch.c.a$a  reason: collision with other inner class name */
    static final class C0536a extends m implements h.f.a.a<Handler> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(14859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0536a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(((HandlerThread) this.this$0.f25505a.getValue()).getLooper());
        }
    }

    public final void execute(Runnable runnable) {
        l.c(runnable, "");
        a().post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.assem.arch.c.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<? extends h.f.a.a<h.z>> r6, long r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            h.f.b.l.c(r6, r0)
            java.util.Iterator r4 = r6.iterator()
        L_0x0009:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r2 = r4.next()
            h.f.a.a r2 = (h.f.a.a) r2
            android.os.Handler r1 = r5.a()
            if (r2 == 0) goto L_0x0021
            com.bytedance.assem.arch.c.b r0 = new com.bytedance.assem.arch.c.b
            r0.<init>(r2)
            r2 = r0
        L_0x0021:
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            android.os.Message r3 = android.os.Message.obtain(r1, r2)
            android.os.Handler r2 = r5.a()
            r0 = 1
            long r0 = r0 + r7
            r2.sendMessageAtTime(r3, r7)
            r7 = r0
            goto L_0x0009
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.c.a.a(java.util.List, long):void");
    }
}
