package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.a;
import com.google.gson.c.b;
import com.google.gson.c.c;
import com.google.gson.t;
import com.google.gson.v;

public final class gk extends v<String> {
    static {
        Covode.recordClassIndex(93597);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gk$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143019a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 93598(0x16d9e, float:1.31159E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.c.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.utils.gk.AnonymousClass1.f143019a = r2
                com.google.gson.c.b r0 = com.google.gson.c.b.NULL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.utils.gk.AnonymousClass1.f143019a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.c.b.STRING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.gk.AnonymousClass1.<clinit>():void");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.v
    public final /* synthetic */ String read(a aVar) {
        b f2 = aVar.f();
        int i2 = AnonymousClass1.f143019a[f2.ordinal()];
        if (i2 == 1) {
            aVar.k();
            return null;
        } else if (i2 == 2) {
            String i3 = aVar.i();
            if (i3.contains("\r\n")) {
                return i3.replaceAll("\r\n", "\n");
            }
            return i3;
        } else {
            throw new t("expect STRING, but got " + f2.name() + " at " + aVar.p());
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.v
    public final /* synthetic */ void write(c cVar, String str) {
        cVar.b(str);
    }
}
