package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.a;
import androidx.work.impl.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4680a = g.a("SystemJobService");

    /* renamed from: b  reason: collision with root package name */
    private f f4681b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, JobParameters> f4682c = new HashMap();

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    static {
        Covode.recordClassIndex(1841);
    }

    public void onDestroy() {
        super.onDestroy();
        f fVar = this.f4681b;
        if (fVar != null) {
            fVar.f4704f.b(this);
        }
    }

    public void onCreate() {
        super.onCreate();
        f b2 = f.b();
        this.f4681b = b2;
        if (b2 != null) {
            b2.f4704f.a(this);
        } else if (Application.class.equals(getApplication().getClass())) {
            g.a();
        } else {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4681b == null) {
            g.a();
            return true;
        }
        String string = jobParameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            g.a();
            return false;
        }
        g.a();
        com.a.a("onStopJob for %s", new Object[]{string});
        synchronized (this.f4682c) {
            this.f4682c.remove(string);
        }
        this.f4681b.a(string);
        if (!this.f4681b.f4704f.b(string)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r7.getTriggeredContentUris() == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r2.f4464b = java.util.Arrays.asList(r7.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r7.getTriggeredContentAuthorities() == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r2.f4463a = java.util.Arrays.asList(r7.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        r2.f4465c = r7.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r6.f4681b.a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r7) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // androidx.work.impl.a
    public final void a(String str, boolean z) {
        JobParameters remove;
        g.a();
        com.a.a("%s executed on JobScheduler", new Object[]{str});
        synchronized (this.f4682c) {
            remove = this.f4682c.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }
}
