package com.facebook.imagepipeline.d;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.e.a;
import com.facebook.common.g.b;
import com.facebook.imagepipeline.d.h;

public final class d implements h.a {
    static {
        Covode.recordClassIndex(28934);
    }

    /* renamed from: com.facebook.imagepipeline.d.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47766a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 28935(0x7107, float:4.0547E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.common.g.b[] r0 = com.facebook.common.g.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.d.d.AnonymousClass1.f47766a = r2
                com.facebook.common.g.b r0 = com.facebook.common.g.b.OnCloseToDalvikHeapLimit     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.d.d.AnonymousClass1.f47766a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.common.g.b r0 = com.facebook.common.g.b.OnAppBackgrounded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.d.d.AnonymousClass1.f47766a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.common.g.b r0 = com.facebook.common.g.b.OnSystemMemoryCriticallyLowWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.d.d.AnonymousClass1.f47766a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.common.g.b r0 = com.facebook.common.g.b.OnSystemLowMemoryWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.facebook.imagepipeline.d.d.AnonymousClass1.f47766a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.common.g.b r0 = com.facebook.common.g.b.OnSystemLowMemoryWhileAppInBackground     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.d.d.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.facebook.imagepipeline.d.h.a
    public final double a(b bVar) {
        int i2 = AnonymousClass1.f47766a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                return 1.0d;
            }
            a.d("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", bVar);
            return 0.0d;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return b.OnCloseToDalvikHeapLimit.getSuggestedTrimRatio();
        } else {
            return 0.0d;
        }
    }
}
