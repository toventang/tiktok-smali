package com.bytedance.android.livesdk.survey.ui.widget;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.livesdk.survey.ui.a.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class SurveyControlWidget$mActivityLifecycleObserver$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SurveyControlWidget f21604a;

    static {
        Covode.recordClassIndex(12747);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_STOP) {
            onActivityStop();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onActivityStop() {
        a aVar;
        a aVar2;
        com.bytedance.android.livesdk.survey.ui.a aVar3 = this.f21604a.f21591b;
        if (aVar3 != null && (aVar = aVar3.f21528d) != null) {
            if ((aVar.f21536f == a.EnumC0473a.QUESTION || aVar.f21536f == a.EnumC0473a.FEEDBACK) && (aVar2 = aVar3.f21528d) != null) {
                aVar2.g();
            }
        }
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SurveyControlWidget$mActivityLifecycleObserver$1(SurveyControlWidget surveyControlWidget) {
        this.f21604a = surveyControlWidget;
    }
}
