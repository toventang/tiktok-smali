package com.ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.c.a;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.v;
import java.util.ArrayList;
import java.util.HashMap;

public final class d extends v<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final v<Object> f87560a = new f().a(Object.class);

    static {
        Covode.recordClassIndex(55041);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f87561a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 55042(0xd702, float:7.713E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.c.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.f87561a = r2
                com.google.gson.c.b r0 = com.google.gson.c.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.f87561a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.gson.c.b r0 = com.google.gson.c.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.f87561a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.gson.c.b r0 = com.google.gson.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.f87561a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.google.gson.c.b r0 = com.google.gson.c.b.STRING     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.f87561a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.google.gson.c.b r0 = com.google.gson.c.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.f87561a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.google.gson.c.b r0 = com.google.gson.c.b.NULL     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.util.d.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.google.gson.v
    public final Object read(a aVar) {
        switch (AnonymousClass1.f87561a[aVar.f().ordinal()]) {
            case 1:
                HashMap hashMap = new HashMap();
                aVar.c();
                while (aVar.e()) {
                    hashMap.put(aVar.h(), read(aVar));
                }
                aVar.d();
                return hashMap;
            case 2:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(read(aVar));
                }
                aVar.b();
                return arrayList;
            case 3:
                String i2 = aVar.i();
                if (i2.indexOf(46) != -1) {
                    return Double.valueOf(Double.parseDouble(i2));
                }
                return Long.valueOf(Long.parseLong(i2));
            case 4:
                return aVar.i();
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return Boolean.valueOf(aVar.j());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                aVar.k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.v
    public final void write(c cVar, Object obj) {
        this.f87560a.write(cVar, obj);
    }
}
