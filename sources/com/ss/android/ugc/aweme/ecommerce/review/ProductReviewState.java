package com.ss.android.ugc.aweme.ecommerce.review;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.ecommerce.review.a.a;
import h.f.b.l;

public final class ProductReviewState implements IListState<a, o> {
    private final a.b filterData;
    private final String productId;
    private final float rate;
    private final String selectFilterId;
    private final int state;
    private final ListState<a, o> substate;

    static {
        Covode.recordClassIndex(54530);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductReviewState copy$default(ProductReviewState productReviewState, int i2, String str, float f2, String str2, a.b bVar, ListState listState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = productReviewState.state;
        }
        if ((i3 & 2) != 0) {
            str = productReviewState.selectFilterId;
        }
        if ((i3 & 4) != 0) {
            f2 = productReviewState.rate;
        }
        if ((i3 & 8) != 0) {
            str2 = productReviewState.productId;
        }
        if ((i3 & 16) != 0) {
            bVar = productReviewState.filterData;
        }
        if ((i3 & 32) != 0) {
            listState = productReviewState.getSubstate();
        }
        return productReviewState.copy(i2, str, f2, str2, bVar, listState);
    }

    public final int component1() {
        return this.state;
    }

    public final String component2() {
        return this.selectFilterId;
    }

    public final float component3() {
        return this.rate;
    }

    public final String component4() {
        return this.productId;
    }

    public final a.b component5() {
        return this.filterData;
    }

    public final ListState<a, o> component6() {
        return getSubstate();
    }

    public final ProductReviewState copy(int i2, String str, float f2, String str2, a.b bVar, ListState<a, o> listState) {
        l.d(str2, "");
        l.d(listState, "");
        return new ProductReviewState(i2, str, f2, str2, bVar, listState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewState)) {
            return false;
        }
        ProductReviewState productReviewState = (ProductReviewState) obj;
        return this.state == productReviewState.state && l.a(this.selectFilterId, productReviewState.selectFilterId) && Float.compare(this.rate, productReviewState.rate) == 0 && l.a(this.productId, productReviewState.productId) && l.a(this.filterData, productReviewState.filterData) && l.a(getSubstate(), productReviewState.getSubstate());
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.state) * 31;
        String str = this.selectFilterId;
        int i2 = 0;
        int hashCode = (((com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rate)) * 31;
        String str2 = this.productId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        a.b bVar = this.filterData;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        ListState<a, o> substate2 = getSubstate();
        if (substate2 != null) {
            i2 = substate2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ProductReviewState(state=" + this.state + ", selectFilterId=" + this.selectFilterId + ", rate=" + this.rate + ", productId=" + this.productId + ", filterData=" + this.filterData + ", substate=" + getSubstate() + ")";
    }

    public final a.b getFilterData() {
        return this.filterData;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final float getRate() {
        return this.rate;
    }

    public final String getSelectFilterId() {
        return this.selectFilterId;
    }

    public final int getState() {
        return this.state;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public final ListState<a, o> getSubstate() {
        return this.substate;
    }

    public static int com_ss_android_ugc_aweme_ecommerce_review_ProductReviewState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public final NestedState<ListState<a, o>> newSubstate(ListState<a, o> listState) {
        l.d(listState, "");
        return copy$default(this, 0, null, 0.0f, null, null, listState, 31, null);
    }

    public ProductReviewState(int i2, String str, float f2, String str2, a.b bVar, ListState<a, o> listState) {
        l.d(str2, "");
        l.d(listState, "");
        this.state = i2;
        this.selectFilterId = str;
        this.rate = f2;
        this.productId = str2;
        this.filterData = bVar;
        this.substate = listState;
    }
}
