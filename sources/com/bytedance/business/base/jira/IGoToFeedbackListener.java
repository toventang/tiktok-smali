package com.bytedance.business.base.jira;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IGoToFeedbackListener {
    static {
        Covode.recordClassIndex(15732);
    }

    void gotoFeedback(Context context, String str);
}
