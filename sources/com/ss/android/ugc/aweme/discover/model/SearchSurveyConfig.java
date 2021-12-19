package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class SearchSurveyConfig implements Serializable {
    @c(a = "enabled")
    private boolean enabled;
    @c(a = "show_delay")
    private long showDelay = 5;
    @c(a = "show_duration")
    private long showDuration = 5;
    @c(a = "result_delay")
    private long submitResultDelay = 2;
    @c(a = "survey_id")
    private String surveyId;

    static {
        Covode.recordClassIndex(50970);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getShowDelay() {
        return this.showDelay;
    }

    public final long getShowDuration() {
        return this.showDuration;
    }

    public final long getSubmitResultDelay() {
        return this.submitResultDelay;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setShowDelay(long j2) {
        this.showDelay = j2;
    }

    public final void setShowDuration(long j2) {
        this.showDuration = j2;
    }

    public final void setSubmitResultDelay(long j2) {
        this.submitResultDelay = j2;
    }

    public final void setSurveyId(String str) {
        this.surveyId = str;
    }
}
