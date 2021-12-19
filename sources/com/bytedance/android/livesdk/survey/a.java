package com.bytedance.android.livesdk.survey;

import com.bytedance.android.livesdk.survey.ui.widget.SurveyCardWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(12650);
    }

    SurveyCardWidget getSurveyCardWidget();

    LiveWidget getSurveyControlWidget();

    void leavePlay();

    void release();

    boolean tryShowHoldingSurveyFromSlide();
}
