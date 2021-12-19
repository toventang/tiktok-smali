package androidx.work.impl.b;

import androidx.work.a;
import androidx.work.h;
import androidx.work.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class m {
    static {
        Covode.recordClassIndex(1816);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.b.m$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4619a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f4620b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f4621c;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0097 */
        static {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.m.AnonymousClass1.<clinit>():void");
        }
    }

    public static i.a a(int i2) {
        if (i2 == 0) {
            return i.a.ENQUEUED;
        }
        if (i2 == 1) {
            return i.a.RUNNING;
        }
        if (i2 == 2) {
            return i.a.SUCCEEDED;
        }
        if (i2 == 3) {
            return i.a.FAILED;
        }
        if (i2 == 4) {
            return i.a.BLOCKED;
        }
        if (i2 == 5) {
            return i.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to State");
    }

    public static a b(int i2) {
        if (i2 == 0) {
            return a.EXPONENTIAL;
        }
        if (i2 == 1) {
            return a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to BackoffPolicy");
    }

    public static h c(int i2) {
        if (i2 == 0) {
            return h.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return h.CONNECTED;
        }
        if (i2 == 2) {
            return h.UNMETERED;
        }
        if (i2 == 3) {
            return h.NOT_ROAMING;
        }
        if (i2 == 4) {
            return h.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i2 + " to NetworkType");
    }

    public static int a(i.a aVar) {
        switch (AnonymousClass1.f4619a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return 4;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e A[SYNTHETIC, Splitter:B:34:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.d a(byte[] r7) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.m.a(byte[]):androidx.work.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067 A[SYNTHETIC, Splitter:B:36:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(androidx.work.d r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.m.a(androidx.work.d):byte[]");
    }
}
