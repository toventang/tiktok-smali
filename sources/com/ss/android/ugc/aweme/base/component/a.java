package com.ss.android.ugc.aweme.base.component;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.metrics.am;
import java.util.concurrent.Callable;

final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final AnalysisActivityComponent f68059a;

    /* renamed from: b  reason: collision with root package name */
    private final long f68060b;

    static {
        Covode.recordClassIndex(41920);
    }

    a(AnalysisActivityComponent analysisActivityComponent, long j2) {
        this.f68059a = analysisActivityComponent;
        this.f68060b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar;
        Analysis F;
        String str;
        AnalysisActivityComponent analysisActivityComponent = this.f68059a;
        long j2 = this.f68060b;
        if (!(analysisActivityComponent.f68043b == null || (cVar = analysisActivityComponent.f68043b.get()) == null || (F = cVar.F()) == null || TextUtils.isEmpty(F.getLabelName()))) {
            com.ss.android.common.c.c.a(analysisActivityComponent.f68044c, "stay_time", F.getLabelName(), j2, F.getExt_value());
            String str2 = "";
            if (F.getExt_json() != null) {
                str2 = F.getExt_json().getString("process_id");
                str = F.getExt_json().getString("challenge_id");
            } else {
                str = str2;
            }
            am amVar = new am();
            amVar.f109498a = String.valueOf(j2);
            am a2 = amVar.a(F.getLabelName());
            a2.p = str2;
            a2.q = str;
            a2.g(AwemeService.b().b(String.valueOf(F.getValue()))).f();
        }
        return null;
    }
}
