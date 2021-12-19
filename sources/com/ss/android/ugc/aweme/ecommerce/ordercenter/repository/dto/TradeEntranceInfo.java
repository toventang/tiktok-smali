package com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class TradeEntranceInfo implements Serializable {
    @c(a = "schema")
    private String schema;
    @c(a = "tips")
    private String tips;
    @c(a = "to_review_count")
    private Integer toReviewCount;
    @c(a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(53986);
    }

    public TradeEntranceInfo() {
        this(0, null, null, null, 15, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ TradeEntranceInfo copy$default(TradeEntranceInfo tradeEntranceInfo, int i2, String str, String str2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = tradeEntranceInfo.type;
        }
        if ((i3 & 2) != 0) {
            str = tradeEntranceInfo.tips;
        }
        if ((i3 & 4) != 0) {
            str2 = tradeEntranceInfo.schema;
        }
        if ((i3 & 8) != 0) {
            num = tradeEntranceInfo.toReviewCount;
        }
        return tradeEntranceInfo.copy(i2, str, str2, num);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.tips;
    }

    public final String component3() {
        return this.schema;
    }

    public final Integer component4() {
        return this.toReviewCount;
    }

    public final TradeEntranceInfo copy(int i2, String str, String str2, Integer num) {
        return new TradeEntranceInfo(i2, str, str2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeEntranceInfo)) {
            return false;
        }
        TradeEntranceInfo tradeEntranceInfo = (TradeEntranceInfo) obj;
        return this.type == tradeEntranceInfo.type && l.a(this.tips, tradeEntranceInfo.tips) && l.a(this.schema, tradeEntranceInfo.schema) && l.a(this.toReviewCount, tradeEntranceInfo.toReviewCount);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        String str = this.tips;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_ordercenter_repository_dto_TradeEntranceInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.toReviewCount;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "TradeEntranceInfo(type=" + this.type + ", tips=" + this.tips + ", schema=" + this.schema + ", toReviewCount=" + this.toReviewCount + ")";
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTips() {
        return this.tips;
    }

    public final Integer getToReviewCount() {
        return this.toReviewCount;
    }

    public final int getType() {
        return this.type;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public final void setToReviewCount(Integer num) {
        this.toReviewCount = num;
    }

    public TradeEntranceInfo(int i2, String str, String str2, Integer num) {
        this.type = i2;
        this.tips = str;
        this.schema = str2;
        this.toReviewCount = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TradeEntranceInfo(int i2, String str, String str2, Integer num, int i3, g gVar) {
        this((i3 & 1) != 0 ? OrderEntranceType.CLOSE.ordinal() : i2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "aweme://ec/order_center" : str2, (i3 & 8) != 0 ? 0 : num);
    }
}
