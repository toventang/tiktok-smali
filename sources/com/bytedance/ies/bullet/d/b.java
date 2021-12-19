package com.bytedance.ies.bullet.d;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.l;
import com.bytedance.ies.bullet.service.base.m;
import com.ss.android.agilelogger.ALog;
import h.z;
import java.util.concurrent.Callable;

public final class b extends com.bytedance.ies.bullet.service.base.b.a implements m {

    /* renamed from: a  reason: collision with root package name */
    final l f32104a;

    static {
        Covode.recordClassIndex(18825);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f32105a;

        static {
            Covode.recordClassIndex(18826);
        }

        a(h.f.a.a aVar) {
            this.f32105a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            this.f32105a.invoke();
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Throwable $e;
        final /* synthetic */ String $extraMsg;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, Throwable th, String str) {
            super(0);
            this.this$0 = bVar;
            this.$e = th;
            this.$extraMsg = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a("onReject: " + this.$e.getMessage() + ", extra: " + this.$extraMsg);
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.d.b$b  reason: collision with other inner class name */
    static final class C0675b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ p $level;
        final /* synthetic */ String $msg;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(18827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0675b(b bVar, p pVar, String str) {
            super(0);
            this.this$0 = bVar;
            this.$level = pVar;
            this.$msg = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = c.f32106a[this.$level.ordinal()];
            if (i2 == 1) {
                b bVar = this.this$0;
                String str = this.$msg;
                if (!bVar.f32104a.a()) {
                    ALog.d("bullet", str);
                }
            } else if (i2 == 2) {
                this.this$0.a(this.$msg);
            } else if (i2 != 3) {
                b bVar2 = this.this$0;
                String str2 = this.$msg;
                if (!bVar2.f32104a.a()) {
                    ALog.i("bullet", str2);
                }
            } else {
                b bVar3 = this.this$0;
                String str3 = this.$msg;
                if (!bVar3.f32104a.a()) {
                    ALog.w("bullet", str3);
                }
            }
            return z.f158842a;
        }
    }

    public b(l lVar) {
        h.f.b.l.c(lVar, "");
        this.f32104a = lVar;
    }

    private static void a(h.f.a.a<z> aVar) {
        i.a(new a(aVar), i.f4824a);
    }

    public final void a(String str) {
        if (!this.f32104a.a()) {
            ALog.e("bullet", str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.m
    public final void a(String str, p pVar) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(pVar, "");
        a(new C0675b(this, pVar, str));
    }

    @Override // com.bytedance.ies.bullet.service.base.m
    public final void a(Throwable th, String str) {
        h.f.b.l.c(th, "");
        h.f.b.l.c(str, "");
        a(new c(this, th, str));
    }
}
