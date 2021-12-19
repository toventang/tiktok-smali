package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.concurrent.atomic.AtomicReference;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    AtomicReference<Object> f3525a = new AtomicReference<>();

    static {
        Covode.recordClassIndex(1320);
    }

    public abstract b a();

    public abstract void a(l lVar);

    public abstract void b(l lVar);

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static a upFrom(b bVar) {
            return androidx_lifecycle_Lifecycle$Event_com_ss_android_ugc_aweme_lancet_ActivityLancet_upEvent(bVar);
        }

        public final b getTargetState() {
            switch (AnonymousClass1.f3527b[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return b.RESUMED;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }

        static {
            Covode.recordClassIndex(1322);
        }

        public static a androidx_lifecycle_Lifecycle$Event_com_ss_android_ugc_aweme_lancet_ActivityLancet_upEvent(b bVar) {
            if (bVar == b.DESTROYED) {
                return ON_CREATE;
            }
            return Lifecycle$Event__upFrom$___twin___(bVar);
        }

        public static a Lifecycle$Event__upFrom$___twin___(b bVar) {
            int i2 = AnonymousClass1.f3526a[bVar.ordinal()];
            if (i2 == 1) {
                return ON_START;
            }
            if (i2 == 2) {
                return ON_RESUME;
            }
            if (i2 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public static a downFrom(b bVar) {
            int i2 = AnonymousClass1.f3526a[bVar.ordinal()];
            if (i2 == 1) {
                return ON_DESTROY;
            }
            if (i2 == 2) {
                return ON_STOP;
            }
            if (i2 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static a downTo(b bVar) {
            int i2 = AnonymousClass1.f3526a[bVar.ordinal()];
            if (i2 == 1) {
                return ON_STOP;
            }
            if (i2 == 2) {
                return ON_PAUSE;
            }
            if (i2 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        public static a upTo(b bVar) {
            int i2 = AnonymousClass1.f3526a[bVar.ordinal()];
            if (i2 == 1) {
                return ON_CREATE;
            }
            if (i2 == 2) {
                return ON_START;
            }
            if (i2 != 3) {
                return null;
            }
            return ON_RESUME;
        }
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        static {
            Covode.recordClassIndex(1323);
        }

        public final boolean isAtLeast(b bVar) {
            if (compareTo((Enum) bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.i$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3526a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3527b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        static {
            /*
            // Method dump skipped, instructions count: 147
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.i.AnonymousClass1.<clinit>():void");
        }
    }
}
