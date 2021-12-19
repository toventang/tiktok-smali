package com.ss.android.ugc.aweme.question.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public final class a extends BaseResponse implements Serializable {
    @c(a = "question")
    private com.ss.android.ugc.aweme.question.c question;

    static {
        Covode.recordClassIndex(77905);
    }

    public final com.ss.android.ugc.aweme.question.c getQuestion() {
        return this.question;
    }

    public final void setQuestion(com.ss.android.ugc.aweme.question.c cVar) {
        this.question = cVar;
    }
}
