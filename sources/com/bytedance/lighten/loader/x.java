package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.w;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.drawee.e.q;

/* access modifiers changed from: package-private */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final q.b f40045a = q.b.f47442h;

    static {
        Covode.recordClassIndex(24685);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lighten.loader.x$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40046a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.x.AnonymousClass1.<clinit>():void");
        }
    }

    public static q.b a(w wVar) {
        q.b bVar = f40045a;
        switch (AnonymousClass1.f40046a[wVar.ordinal()]) {
            case 1:
                return q.b.f47436b;
            case 2:
                return q.b.f47437c;
            case 3:
                return q.b.f47439e;
            case 4:
                return q.b.f47438d;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return q.b.f47440f;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return q.b.f47442h;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return q.b.f47441g;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return q.b.f47443i;
            default:
                return bVar;
        }
    }
}
