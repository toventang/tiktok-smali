package com.ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class GiftPage {
    @c(a = "gifts")
    private final List<GiftStruct> giftList;
    @c(a = "page_name")
    private final int pageName;

    static {
        Covode.recordClassIndex(44212);
    }

    public static int com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.gift.model.GiftPage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftPage copy$default(GiftPage giftPage, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = giftPage.pageName;
        }
        if ((i3 & 2) != 0) {
            list = giftPage.giftList;
        }
        return giftPage.copy(i2, list);
    }

    public final int component1() {
        return this.pageName;
    }

    public final List<GiftStruct> component2() {
        return this.giftList;
    }

    public final GiftPage copy(int i2, List<GiftStruct> list) {
        return new GiftPage(i2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPage)) {
            return false;
        }
        GiftPage giftPage = (GiftPage) obj;
        return this.pageName == giftPage.pageName && l.a(this.giftList, giftPage.giftList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.pageName) * 31;
        List<GiftStruct> list = this.giftList;
        return com_ss_android_ugc_aweme_comment_gift_model_GiftPage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GiftPage(pageName=" + this.pageName + ", giftList=" + this.giftList + ")";
    }

    public final List<GiftStruct> getGiftList() {
        return this.giftList;
    }

    public final int getPageName() {
        return this.pageName;
    }

    public GiftPage(int i2, List<GiftStruct> list) {
        this.pageName = i2;
        this.giftList = list;
    }
}
