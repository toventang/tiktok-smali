package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class ShoutoutsProduct {
    @c(a = "creator_uid")
    private final String creatorUid;
    @c(a = "description")
    private final String description;
    @c(a = "posted")
    private final boolean posted;
    @c(a = "price")
    private final ShoutoutsPrice price;
    @c(a = "product_id")
    private final String productId;
    @c(a = "rating_avg")
    private final float ratingAvg;
    @c(a = "rating_cnt")
    private final int ratingCnt;
    @c(a = "restrict")
    private final ShoutoutsOrderRestrict restrict;
    @c(a = "show_rating")
    private final boolean showRating;
    @c(a = "sold_cnt")
    private final int soldCnt;
    @c(a = "status")
    private final int status;
    @c(a = "video_info")
    private final Aweme videoInfo;

    static {
        Covode.recordClassIndex(87102);
    }

    public static int com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ShoutoutsProduct copy$default(ShoutoutsProduct shoutoutsProduct, Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f2, int i2, int i3, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i4, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aweme = shoutoutsProduct.videoInfo;
        }
        if ((i5 & 2) != 0) {
            shoutoutsPrice = shoutoutsProduct.price;
        }
        if ((i5 & 4) != 0) {
            str = shoutoutsProduct.description;
        }
        if ((i5 & 8) != 0) {
            f2 = shoutoutsProduct.ratingAvg;
        }
        if ((i5 & 16) != 0) {
            i2 = shoutoutsProduct.ratingCnt;
        }
        if ((i5 & 32) != 0) {
            i3 = shoutoutsProduct.soldCnt;
        }
        if ((i5 & 64) != 0) {
            str2 = shoutoutsProduct.productId;
        }
        if ((i5 & 128) != 0) {
            z = shoutoutsProduct.showRating;
        }
        if ((i5 & 256) != 0) {
            z2 = shoutoutsProduct.posted;
        }
        if ((i5 & 512) != 0) {
            shoutoutsOrderRestrict = shoutoutsProduct.restrict;
        }
        if ((i5 & 1024) != 0) {
            i4 = shoutoutsProduct.status;
        }
        if ((i5 & 2048) != 0) {
            str3 = shoutoutsProduct.creatorUid;
        }
        return shoutoutsProduct.copy(aweme, shoutoutsPrice, str, f2, i2, i3, str2, z, z2, shoutoutsOrderRestrict, i4, str3);
    }

    public final Aweme component1() {
        return this.videoInfo;
    }

    public final ShoutoutsOrderRestrict component10() {
        return this.restrict;
    }

    public final int component11() {
        return this.status;
    }

    public final String component12() {
        return this.creatorUid;
    }

    public final ShoutoutsPrice component2() {
        return this.price;
    }

    public final String component3() {
        return this.description;
    }

    public final float component4() {
        return this.ratingAvg;
    }

    public final int component5() {
        return this.ratingCnt;
    }

    public final int component6() {
        return this.soldCnt;
    }

    public final String component7() {
        return this.productId;
    }

    public final boolean component8() {
        return this.showRating;
    }

    public final boolean component9() {
        return this.posted;
    }

    public final ShoutoutsProduct copy(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f2, int i2, int i3, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i4, String str3) {
        return new ShoutoutsProduct(aweme, shoutoutsPrice, str, f2, i2, i3, str2, z, z2, shoutoutsOrderRestrict, i4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsProduct)) {
            return false;
        }
        ShoutoutsProduct shoutoutsProduct = (ShoutoutsProduct) obj;
        return l.a(this.videoInfo, shoutoutsProduct.videoInfo) && l.a(this.price, shoutoutsProduct.price) && l.a(this.description, shoutoutsProduct.description) && Float.compare(this.ratingAvg, shoutoutsProduct.ratingAvg) == 0 && this.ratingCnt == shoutoutsProduct.ratingCnt && this.soldCnt == shoutoutsProduct.soldCnt && l.a(this.productId, shoutoutsProduct.productId) && this.showRating == shoutoutsProduct.showRating && this.posted == shoutoutsProduct.posted && l.a(this.restrict, shoutoutsProduct.restrict) && this.status == shoutoutsProduct.status && l.a(this.creatorUid, shoutoutsProduct.creatorUid);
    }

    public final int hashCode() {
        Aweme aweme = this.videoInfo;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        ShoutoutsPrice shoutoutsPrice = this.price;
        int hashCode2 = (hashCode + (shoutoutsPrice != null ? shoutoutsPrice.hashCode() : 0)) * 31;
        String str = this.description;
        int hashCode3 = (((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.ratingAvg)) * 31) + com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.ratingCnt)) * 31) + com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.soldCnt)) * 31;
        String str2 = this.productId;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.showRating;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode4 + i4) * 31;
        if (!this.posted) {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        ShoutoutsOrderRestrict shoutoutsOrderRestrict = this.restrict;
        int hashCode5 = (((i8 + (shoutoutsOrderRestrict != null ? shoutoutsOrderRestrict.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status)) * 31;
        String str3 = this.creatorUid;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "ShoutoutsProduct(videoInfo=" + this.videoInfo + ", price=" + this.price + ", description=" + this.description + ", ratingAvg=" + this.ratingAvg + ", ratingCnt=" + this.ratingCnt + ", soldCnt=" + this.soldCnt + ", productId=" + this.productId + ", showRating=" + this.showRating + ", posted=" + this.posted + ", restrict=" + this.restrict + ", status=" + this.status + ", creatorUid=" + this.creatorUid + ")";
    }

    public final String getCreatorUid() {
        return this.creatorUid;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getPosted() {
        return this.posted;
    }

    public final ShoutoutsPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final float getRatingAvg() {
        return this.ratingAvg;
    }

    public final int getRatingCnt() {
        return this.ratingCnt;
    }

    public final ShoutoutsOrderRestrict getRestrict() {
        return this.restrict;
    }

    public final boolean getShowRating() {
        return this.showRating;
    }

    public final int getSoldCnt() {
        return this.soldCnt;
    }

    public final int getStatus() {
        return this.status;
    }

    public final Aweme getVideoInfo() {
        return this.videoInfo;
    }

    public static int com_ss_android_ugc_aweme_shoutouts_model_ShoutoutsProduct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public ShoutoutsProduct(Aweme aweme, ShoutoutsPrice shoutoutsPrice, String str, float f2, int i2, int i3, String str2, boolean z, boolean z2, ShoutoutsOrderRestrict shoutoutsOrderRestrict, int i4, String str3) {
        this.videoInfo = aweme;
        this.price = shoutoutsPrice;
        this.description = str;
        this.ratingAvg = f2;
        this.ratingCnt = i2;
        this.soldCnt = i3;
        this.productId = str2;
        this.showRating = z;
        this.posted = z2;
        this.restrict = shoutoutsOrderRestrict;
        this.status = i4;
        this.creatorUid = str3;
    }
}
