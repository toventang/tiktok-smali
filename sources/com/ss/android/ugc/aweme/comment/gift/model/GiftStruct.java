package com.ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class GiftStruct {
    @c(a = "describe")
    private final String describeMessage;
    @c(a = "diamond_count")
    private final int diamondCount;
    @c(a = "asset")
    private final UrlModel effectAsset;
    @c(a = "icon")
    private final UrlModel iconList;
    @c(a = "id")
    private final long id;
    @c(a = "image")
    private final UrlModel imageList;
    @c(a = StringSet.name)
    private final String name;

    static {
        Covode.recordClassIndex(44215);
    }

    public static int com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ GiftStruct copy$default(GiftStruct giftStruct, long j2, String str, String str2, int i2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = giftStruct.id;
        }
        if ((i3 & 2) != 0) {
            str = giftStruct.name;
        }
        if ((i3 & 4) != 0) {
            str2 = giftStruct.describeMessage;
        }
        if ((i3 & 8) != 0) {
            i2 = giftStruct.diamondCount;
        }
        if ((i3 & 16) != 0) {
            urlModel = giftStruct.imageList;
        }
        if ((i3 & 32) != 0) {
            urlModel2 = giftStruct.iconList;
        }
        if ((i3 & 64) != 0) {
            urlModel3 = giftStruct.effectAsset;
        }
        return giftStruct.copy(j2, str, str2, i2, urlModel, urlModel2, urlModel3);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.describeMessage;
    }

    public final int component4() {
        return this.diamondCount;
    }

    public final UrlModel component5() {
        return this.imageList;
    }

    public final UrlModel component6() {
        return this.iconList;
    }

    public final UrlModel component7() {
        return this.effectAsset;
    }

    public final GiftStruct copy(long j2, String str, String str2, int i2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        l.d(str, "");
        return new GiftStruct(j2, str, str2, i2, urlModel, urlModel2, urlModel3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftStruct)) {
            return false;
        }
        GiftStruct giftStruct = (GiftStruct) obj;
        return this.id == giftStruct.id && l.a(this.name, giftStruct.name) && l.a(this.describeMessage, giftStruct.describeMessage) && this.diamondCount == giftStruct.diamondCount && l.a(this.imageList, giftStruct.imageList) && l.a(this.iconList, giftStruct.iconList) && l.a(this.effectAsset, giftStruct.effectAsset);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.id) * 31;
        String str = this.name;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.describeMessage;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_comment_gift_model_GiftStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.diamondCount)) * 31;
        UrlModel urlModel = this.imageList;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.iconList;
        int hashCode4 = (hashCode3 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.effectAsset;
        if (urlModel3 != null) {
            i2 = urlModel3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "GiftStruct(id=" + this.id + ", name=" + this.name + ", describeMessage=" + this.describeMessage + ", diamondCount=" + this.diamondCount + ", imageList=" + this.imageList + ", iconList=" + this.iconList + ", effectAsset=" + this.effectAsset + ")";
    }

    public final String getDescribeMessage() {
        return this.describeMessage;
    }

    public final int getDiamondCount() {
        return this.diamondCount;
    }

    public final UrlModel getEffectAsset() {
        return this.effectAsset;
    }

    public final UrlModel getIconList() {
        return this.iconList;
    }

    public final long getId() {
        return this.id;
    }

    public final UrlModel getImageList() {
        return this.imageList;
    }

    public final String getName() {
        return this.name;
    }

    public GiftStruct(long j2, String str, String str2, int i2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3) {
        l.d(str, "");
        this.id = j2;
        this.name = str;
        this.describeMessage = str2;
        this.diamondCount = i2;
        this.imageList = urlModel;
        this.iconList = urlModel2;
        this.effectAsset = urlModel3;
    }
}
