package com.ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class PromotionVisitor implements Serializable {
    @c(a = "avatar")
    private List<? extends UrlModel> avatars;
    @c(a = "count")
    private long count;

    static {
        Covode.recordClassIndex(45213);
    }

    public PromotionVisitor() {
        this(null, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_commerce_model_PromotionVisitor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commerce.model.PromotionVisitor */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionVisitor copy$default(PromotionVisitor promotionVisitor, List list, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = promotionVisitor.avatars;
        }
        if ((i2 & 2) != 0) {
            j2 = promotionVisitor.count;
        }
        return promotionVisitor.copy(list, j2);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> component1() {
        return this.avatars;
    }

    public final long component2() {
        return this.count;
    }

    public final PromotionVisitor copy(List<? extends UrlModel> list, long j2) {
        l.d(list, "");
        return new PromotionVisitor(list, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionVisitor)) {
            return false;
        }
        PromotionVisitor promotionVisitor = (PromotionVisitor) obj;
        return l.a(this.avatars, promotionVisitor.avatars) && this.count == promotionVisitor.count;
    }

    public final int hashCode() {
        List<? extends UrlModel> list = this.avatars;
        return ((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_commerce_model_PromotionVisitor_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.count);
    }

    public final String toString() {
        return "PromotionVisitor(avatars=" + this.avatars + ", count=" + this.count + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> getAvatars() {
        return this.avatars;
    }

    public final long getCount() {
        return this.count;
    }

    public final void setCount(long j2) {
        this.count = j2;
    }

    public final void setAvatars(List<? extends UrlModel> list) {
        l.d(list, "");
        this.avatars = list;
    }

    public PromotionVisitor(List<? extends UrlModel> list, long j2) {
        l.d(list, "");
        this.avatars = list;
        this.count = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionVisitor(List list, long j2, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? 0 : j2);
    }
}
