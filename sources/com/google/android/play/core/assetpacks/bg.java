package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bg implements bl {

    /* renamed from: a  reason: collision with root package name */
    private final bm f52875a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52876b;

    static {
        Covode.recordClassIndex(32699);
    }

    bg(bm bmVar, int i2) {
        this.f52875a = bmVar;
        this.f52876b = i2;
    }

    @Override // com.google.android.play.core.assetpacks.bl
    public final Object a() {
        bm bmVar = this.f52875a;
        int i2 = this.f52876b;
        bj b2 = bmVar.b(i2);
        if (bw.b(b2.f52885c.f52880c)) {
            ac acVar = bmVar.f52893b;
            bi biVar = b2.f52885c;
            acVar.g(biVar.f52878a, b2.f52884b, biVar.f52879b);
            bi biVar2 = b2.f52885c;
            int i3 = biVar2.f52880c;
            if (i3 != 5 && i3 != 6) {
                return null;
            }
            ac acVar2 = bmVar.f52893b;
            String str = biVar2.f52878a;
            if (!acVar2.a(str).exists()) {
                return null;
            }
            ac.c(acVar2.a(str));
            return null;
        }
        throw new au(a.a("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i2)}), i2);
    }
}
