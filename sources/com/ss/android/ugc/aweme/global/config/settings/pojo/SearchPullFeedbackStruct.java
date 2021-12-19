package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class SearchPullFeedbackStruct {
    @c(a = "feedback_options")
    private SearchPullFeedbackOptions feedbackOptions;
    @c(a = "freq_per_day")
    private Integer freqPerDay = 1000;
    @c(a = "freq_per_query")
    private Integer freqPerQuery = 2;
    @c(a = "is_open_feedback")
    private Boolean isOpenFeedback = false;

    static {
        Covode.recordClassIndex(63072);
    }

    public SearchPullFeedbackOptions getFeedbackOptions() {
        SearchPullFeedbackOptions searchPullFeedbackOptions = this.feedbackOptions;
        if (searchPullFeedbackOptions != null) {
            return searchPullFeedbackOptions;
        }
        throw new a();
    }

    public Integer getFreqPerDay() {
        Integer num = this.freqPerDay;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getFreqPerQuery() {
        Integer num = this.freqPerQuery;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getIsOpenFeedback() {
        Boolean bool = this.isOpenFeedback;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
