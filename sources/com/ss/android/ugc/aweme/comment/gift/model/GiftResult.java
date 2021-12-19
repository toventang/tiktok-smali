package com.ss.android.ugc.aweme.comment.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class GiftResult {
    @c(a = "pages")
    private final List<GiftPage> giftPageList;

    static {
        Covode.recordClassIndex(44214);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.gift.model.GiftResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftResult copy$default(GiftResult giftResult, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = giftResult.giftPageList;
        }
        return giftResult.copy(list);
    }

    public final List<GiftPage> component1() {
        return this.giftPageList;
    }

    public final GiftResult copy(List<GiftPage> list) {
        return new GiftResult(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GiftResult) && l.a(this.giftPageList, ((GiftResult) obj).giftPageList);
        }
        return true;
    }

    public final int hashCode() {
        List<GiftPage> list = this.giftPageList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GiftResult(giftPageList=" + this.giftPageList + ")";
    }

    public final List<GiftPage> getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResult(List<GiftPage> list) {
        this.giftPageList = list;
    }
}
