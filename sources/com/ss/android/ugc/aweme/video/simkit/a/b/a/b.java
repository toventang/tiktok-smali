package com.ss.android.ugc.aweme.video.simkit.a.b.a;

import b.i;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.playerkit.a.e;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    volatile l.a f143824a = l.a.UNKNOWN;

    static {
        Covode.recordClassIndex(94118);
    }

    @Override // com.ss.android.ugc.aweme.playerkit.a.e
    public final String a() {
        return "network_type";
    }

    @Override // com.ss.android.ugc.aweme.playerkit.a.e
    public final String b() {
        i.b(new c(this), i.f4824a);
        switch (AnonymousClass1.f143825a[this.f143824a.ordinal()]) {
            case 1:
                return "none";
            case 2:
            case 3:
                return "2g";
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "3g";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "4g";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "5g";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "wifi";
            default:
                return "unknown";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.simkit.a.b.a.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143825a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 139
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.simkit.a.b.a.b.AnonymousClass1.<clinit>():void");
        }
    }
}
