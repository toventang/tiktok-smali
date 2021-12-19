package com.bytedance.helios.sdk.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.c.f;
import com.bytedance.helios.sdk.utils.g;
import h.f.b.l;

public final class s extends b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f30922b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private int[] f30923c;

    static {
        Covode.recordClassIndex(17943);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17944);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public s() {
        a(l.f30904c);
        a(u.f30931c);
        a(q.f30919c);
        a(t.f30924a);
    }

    @Override // com.bytedance.helios.sdk.d.b
    public final int[] a() {
        if (this.f30923c == null) {
            int size = this.f30855a.size();
            this.f30923c = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                int[] iArr = this.f30923c;
                if (iArr == null) {
                    l.a();
                }
                iArr[i2] = this.f30855a.keyAt(i2);
            }
        }
        int[] iArr2 = this.f30923c;
        if (iArr2 == null) {
            l.a();
        }
        return iArr2;
    }

    private final void a(a aVar) {
        String a2 = aVar.a();
        String b2 = aVar.b();
        int[] c2 = aVar.c();
        String[] d2 = aVar.d();
        int length = c2.length;
        for (int i2 = 0; i2 < length; i2++) {
            a(c2[i2], new e(a2, b2, c2[i2], d2[i2]));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.d.b
    public final void a(d dVar, Throwable th) {
        l.c(dVar, "");
        l.c(th, "");
        n a2 = dVar.a(th);
        long reportDelayedMills = HeliosEnvImpl.INSTANCE.getCrpConfig().getReportDelayedMills();
        l.c(a2, "");
        g.b().postDelayed(new f.a(a2), reportDelayedMills);
    }
}
