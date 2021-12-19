package com.bytedance.geckox.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.p;
import com.google.gson.v;

public final class a extends v<Boolean> {
    static {
        Covode.recordClassIndex(17286);
    }

    /* renamed from: com.bytedance.geckox.d.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29779a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 17287(0x4387, float:2.4224E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.c.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.geckox.d.a.AnonymousClass1.f29779a = r2
                com.google.gson.c.b r0 = com.google.gson.c.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.geckox.d.a.AnonymousClass1.f29779a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.google.gson.c.b r0 = com.google.gson.c.b.NULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.geckox.d.a.AnonymousClass1.f29779a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.google.gson.c.b r0 = com.google.gson.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.d.a.AnonymousClass1.<clinit>():void");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ Boolean read(com.google.gson.c.a aVar) {
        b f2 = aVar.f();
        int i2 = AnonymousClass1.f29779a[f2.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            return Boolean.valueOf(aVar.j());
        }
        if (i2 == 2) {
            aVar.k();
            return null;
        } else if (i2 == 3) {
            if (aVar.n() == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else {
            throw new p("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f2)));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            cVar.f();
        } else {
            cVar.a(bool2.booleanValue());
        }
    }
}
