package com.ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "card_predict_duration")
    private int cardPredictDuration;
    @c(a = "order_share_recommend")
    private boolean isOrderShareRecommend;
    @c(a = "recall_reason")
    private String recallReason = "";

    static {
        Covode.recordClassIndex(45217);
    }

    public final int getCardPredictDuration() {
        return this.cardPredictDuration;
    }

    public final String getRecallReason() {
        return this.recallReason;
    }

    public final boolean isOrderShareRecommend() {
        return this.isOrderShareRecommend;
    }

    public final void setCardPredictDuration(int i2) {
        this.cardPredictDuration = i2;
    }

    public final void setOrderShareRecommend(boolean z) {
        this.isOrderShareRecommend = z;
    }

    public final void setRecallReason(String str) {
        this.recallReason = str;
    }
}
