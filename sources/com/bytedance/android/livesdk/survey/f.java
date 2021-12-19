package com.bytedance.android.livesdk.survey;

import com.bytedance.android.livesdk.survey.a.d;
import com.bytedance.android.livesdk.survey.ui.a;
import com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget;
import com.bytedance.android.livesdk.survey.ui.widget.SurveyControlWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import h.f.b.l;

public class f implements a {
    private SurveyCardWidget mSurveyCardWidget;
    private SurveyControlWidget mSurveyControlWidget;

    static {
        Covode.recordClassIndex(12667);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.survey.a
    public void release() {
        this.mSurveyCardWidget = null;
        this.mSurveyControlWidget = null;
    }

    @Override // com.bytedance.android.livesdk.survey.a
    public SurveyCardWidget getSurveyCardWidget() {
        if (this.mSurveyCardWidget == null) {
            this.mSurveyCardWidget = new SurveyCardWidget();
        }
        SurveyCardWidget surveyCardWidget = this.mSurveyCardWidget;
        if (surveyCardWidget == null) {
            l.b();
        }
        return surveyCardWidget;
    }

    @Override // com.bytedance.android.livesdk.survey.a
    public LiveWidget getSurveyControlWidget() {
        if (this.mSurveyControlWidget == null) {
            this.mSurveyControlWidget = new SurveyControlWidget();
        }
        SurveyControlWidget surveyControlWidget = this.mSurveyControlWidget;
        if (surveyControlWidget == null) {
            l.b();
        }
        return surveyControlWidget;
    }

    @Override // com.bytedance.android.livesdk.survey.a
    public void leavePlay() {
        a aVar;
        SurveyControlWidget surveyControlWidget = this.mSurveyControlWidget;
        if (surveyControlWidget != null && (aVar = surveyControlWidget.f21591b) != null) {
            aVar.a(aVar.a(), a.C0471a.EnumC0472a.CANCEL, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.survey.a
    public boolean tryShowHoldingSurveyFromSlide() {
        a aVar;
        com.bytedance.android.livesdk.survey.a.a aVar2;
        d dVar;
        com.bytedance.android.livesdk.survey.ui.a.a aVar3;
        SurveyControlWidget surveyControlWidget = this.mSurveyControlWidget;
        if (surveyControlWidget == null || (aVar = surveyControlWidget.f21591b) == null || (aVar2 = aVar.f21527c) == null || (dVar = aVar2.f21494d) == null || !dVar.a() || (aVar3 = aVar.f21528d) == null) {
            return false;
        }
        return aVar3.f();
    }
}
