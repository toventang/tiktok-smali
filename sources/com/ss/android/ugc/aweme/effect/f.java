package com.ss.android.ugc.aweme.effect;

import android.app.job.JobParameters;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.b.a.c;
import com.ss.android.ugc.aweme.main.ay;

final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final EffectCompatJobService f88943a;

    /* renamed from: b  reason: collision with root package name */
    private final JobParameters f88944b;

    static {
        Covode.recordClassIndex(55937);
    }

    f(EffectCompatJobService effectCompatJobService, JobParameters jobParameters) {
        this.f88943a = effectCompatJobService;
        this.f88944b = jobParameters;
    }

    @Override // b.g
    public final Object then(i iVar) {
        EffectCompatJobService effectCompatJobService = this.f88943a;
        JobParameters jobParameters = this.f88944b;
        ay ayVar = (ay) c.a(effectCompatJobService, ay.class);
        ayVar.a(System.currentTimeMillis());
        ayVar.b();
        effectCompatJobService.jobFinished(jobParameters, false);
        EffectCompatJobService.f88743b = false;
        return null;
    }
}
