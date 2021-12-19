package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.g;
import com.bytedance.covode.number.Covode;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4683a = g.a("SystemJobInfoConverter");

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f4684b;

    static {
        Covode.recordClassIndex(1842);
    }

    /* renamed from: androidx.work.impl.background.systemjob.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4685a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 1843(0x733, float:2.583E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.work.h[] r0 = androidx.work.h.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                androidx.work.impl.background.systemjob.a.AnonymousClass1.f4685a = r2
                androidx.work.h r0 = androidx.work.h.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = androidx.work.impl.background.systemjob.a.AnonymousClass1.f4685a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.work.h r0 = androidx.work.h.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = androidx.work.impl.background.systemjob.a.AnonymousClass1.f4685a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.work.h r0 = androidx.work.h.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = androidx.work.impl.background.systemjob.a.AnonymousClass1.f4685a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.work.h r0 = androidx.work.h.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = androidx.work.impl.background.systemjob.a.AnonymousClass1.f4685a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.work.h r0 = androidx.work.h.METERED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.a.AnonymousClass1.<clinit>():void");
        }
    }

    a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f4684b = new ComponentName(applicationContext, SystemJobService.class);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.job.JobInfo a(androidx.work.impl.b.g r11, int r12) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.a.a(androidx.work.impl.b.g, int):android.app.job.JobInfo");
    }
}
