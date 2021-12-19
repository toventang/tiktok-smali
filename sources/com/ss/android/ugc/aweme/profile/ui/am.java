package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

/* access modifiers changed from: package-private */
public final /* synthetic */ class am implements AnalysisStayTimeFragmentComponent.a {

    /* renamed from: a  reason: collision with root package name */
    private final al f116878a;

    static {
        Covode.recordClassIndex(75476);
    }

    am(al alVar) {
        this.f116878a = alVar;
    }

    @Override // com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent.a
    public final com.ss.android.ugc.aweme.metrics.am a(com.ss.android.ugc.aweme.metrics.am amVar) {
        return amVar.g(AwemeChangeCallBack.a(this.f116878a.getActivity()));
    }
}
