package com.ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class GiftResponse extends BaseResponse {
    @c(a = "data")
    private final GiftResult giftPageList;

    static {
        Covode.recordClassIndex(44213);
    }

    public static /* synthetic */ GiftResponse copy$default(GiftResponse giftResponse, GiftResult giftResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            giftResult = giftResponse.giftPageList;
        }
        return giftResponse.copy(giftResult);
    }

    public final GiftResult component1() {
        return this.giftPageList;
    }

    public final GiftResponse copy(GiftResult giftResult) {
        return new GiftResponse(giftResult);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GiftResponse) && l.a(this.giftPageList, ((GiftResponse) obj).giftPageList);
        }
        return true;
    }

    public final int hashCode() {
        GiftResult giftResult = this.giftPageList;
        if (giftResult != null) {
            return giftResult.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "GiftResponse(giftPageList=" + this.giftPageList + ")";
    }

    public final GiftResult getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResponse(GiftResult giftResult) {
        this.giftPageList = giftResult;
    }
}
