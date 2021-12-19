package com.ss.android.ugc.aweme.question.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.aq;
import h.f.b.g;
import h.f.b.l;

public final class QuestionDetailState implements af {
    private final a<com.ss.android.ugc.aweme.question.api.a> questionDetail;

    static {
        Covode.recordClassIndex(77986);
    }

    public QuestionDetailState() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.question.viewmodel.QuestionDetailState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionDetailState copy$default(QuestionDetailState questionDetailState, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = questionDetailState.questionDetail;
        }
        return questionDetailState.copy(aVar);
    }

    public final a<com.ss.android.ugc.aweme.question.api.a> component1() {
        return this.questionDetail;
    }

    public final QuestionDetailState copy(a<com.ss.android.ugc.aweme.question.api.a> aVar) {
        l.d(aVar, "");
        return new QuestionDetailState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof QuestionDetailState) && l.a(this.questionDetail, ((QuestionDetailState) obj).questionDetail);
        }
        return true;
    }

    public final int hashCode() {
        a<com.ss.android.ugc.aweme.question.api.a> aVar = this.questionDetail;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "QuestionDetailState(questionDetail=" + this.questionDetail + ")";
    }

    public final a<com.ss.android.ugc.aweme.question.api.a> getQuestionDetail() {
        return this.questionDetail;
    }

    public QuestionDetailState(a<com.ss.android.ugc.aweme.question.api.a> aVar) {
        l.d(aVar, "");
        this.questionDetail = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuestionDetailState(a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? aq.f39400a : aVar);
    }
}
