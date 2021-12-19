package com.ss.android.ugc.aweme.adaptation.analysis;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final AnalysisActivityComponent f66184a;

    /* renamed from: b  reason: collision with root package name */
    private final long f66185b;

    static {
        Covode.recordClassIndex(40691);
    }

    a(AnalysisActivityComponent analysisActivityComponent, long j2) {
        this.f66184a = analysisActivityComponent;
        this.f66185b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f66184a.a(this.f66185b);
    }
}
