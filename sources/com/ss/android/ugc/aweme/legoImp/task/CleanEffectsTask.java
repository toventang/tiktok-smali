package com.ss.android.ugc.aweme.legoImp.task;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.b.a.c;
import com.ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.ss.android.ugc.aweme.effect.EffectJobService;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.main.ay;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;
import java.util.List;

public class CleanEffectsTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f107753a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f107754b;

    static {
        Covode.recordClassIndex(68951);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        try {
            AVExternalServiceImpl.a().configService().cacheConfig().draftEffectList();
        } catch (Exception unused) {
        }
    }

    static final /* synthetic */ Object b(Context context) {
        MethodCollector.i(3008);
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            if (!f107753a && applicationContext != null && !f107754b) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                f107754b = true;
                ay ayVar = (ay) c.a(applicationContext, ay.class);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ayVar.c() >= 259200000) {
                    String effectCacheDir = AVExternalServiceImpl.a().configService().cacheConfig().effectCacheDir();
                    if (!(TextUtils.isEmpty(effectCacheDir) || new File(effectCacheDir).list() == null || new File(effectCacheDir).list().length == 0)) {
                        File file = new File(effectCacheDir, "journal");
                        if (!file.exists() || file.isDirectory() ? !ayVar.a() : currentTimeMillis - file.lastModified() <= 259200000) {
                            ayVar.a(currentTimeMillis);
                        } else {
                            f107753a = true;
                            if (Build.VERSION.SDK_INT >= 26) {
                                try {
                                    if (!EffectCompatJobService.f88743b) {
                                        EffectCompatJobService.f88743b = true;
                                        JobInfo.Builder builder = new JobInfo.Builder(EffectCompatJobService.f88742a, new ComponentName(applicationContext, EffectCompatJobService.class));
                                        builder.setMinimumLatency(0);
                                        builder.setOverrideDeadline(3000);
                                        ((JobScheduler) EffectCompatJobService.a(applicationContext, "jobscheduler")).schedule(builder.build());
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                a(applicationContext, new Intent(applicationContext, EffectJobService.class));
                            }
                        }
                    }
                }
            }
        }
        MethodCollector.o(3008);
        return null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
