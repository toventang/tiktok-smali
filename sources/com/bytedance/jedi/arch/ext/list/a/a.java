package com.bytedance.jedi.arch.ext.list.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.a.e;
import h.f.a.b;
import h.f.b.m;
import h.z;

public abstract class a implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f39418a;

    /* renamed from: b  reason: collision with root package name */
    public int f39419b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39420c;

    static {
        Covode.recordClassIndex(24231);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(b<? super Integer, z> bVar);

    public final void b() {
        if (!this.f39418a) {
            this.f39418a = true;
            a();
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.a.e.b
    public final void a(int i2) {
        this.f39420c = true;
        a(new C0961a(this, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.ext.list.a.a$a  reason: collision with other inner class name */
    public static final class C0961a extends m implements b<Integer, z> {
        final /* synthetic */ int $indexToPrefetch;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(24232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0961a(a aVar, int i2) {
            super(1);
            this.this$0 = aVar;
            this.$indexToPrefetch = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = this.$indexToPrefetch - num.intValue();
            a aVar = this.this$0;
            aVar.f39419b = Math.max(aVar.f39419b, intValue);
            if (this.this$0.f39419b > 0) {
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, Throwable th) {
        if (this.f39420c) {
            this.f39418a = false;
            if (th == null && i2 != 0) {
                int i3 = this.f39419b - i2;
                this.f39419b = i3;
                if (i3 > 0) {
                    b();
                }
            }
        }
    }
}
