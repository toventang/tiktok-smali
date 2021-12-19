package com.ss.android.ugc.aweme.video.simpreloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.u.d;
import com.bytedance.u.f;
import com.ss.android.ugc.aweme.video.preload.api.i;
import java.io.File;

public final class j implements i {
    static {
        Covode.recordClassIndex(94206);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.i
    public final boolean a() {
        return d.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simpreloader.j$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143979a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 94207(0x16fff, float:1.32012E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.video.preload.api.i$a[] r0 = com.ss.android.ugc.aweme.video.preload.api.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.video.simpreloader.j.AnonymousClass1.f143979a = r2
                com.ss.android.ugc.aweme.video.preload.api.i$a r0 = com.ss.android.ugc.aweme.video.preload.api.i.a.PREFER_EXTERNAL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.video.simpreloader.j.AnonymousClass1.f143979a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.video.preload.api.i$a r0 = com.ss.android.ugc.aweme.video.preload.api.i.a.PREFER_PRIVATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.video.simpreloader.j.AnonymousClass1.f143979a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.video.preload.api.i$a r0 = com.ss.android.ugc.aweme.video.preload.api.i.a.PREFER_SD_CARD     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simpreloader.j.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.i
    public final File a(Context context, i.a aVar) {
        f fVar;
        int i2 = AnonymousClass1.f143979a[aVar.ordinal()];
        if (i2 == 1) {
            fVar = f.PREFER_EXTERNAL;
        } else if (i2 == 2) {
            fVar = f.PREFER_PRIVATE;
        } else if (i2 != 3) {
            fVar = null;
        } else {
            fVar = f.PREFER_SD_CARD;
        }
        return d.b(context, fVar);
    }
}
