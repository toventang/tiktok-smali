package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import h.f.b.l;
import java.util.List;

public final class OrderSubmitState implements af {
    public static final a Companion = new a((byte) 0);
    private final int abnormalStatus;
    private final List<Object> adapterList;
    private final j bottomNotice;
    private final boolean checkPayment;
    private final c currentPage;
    private final boolean hasAddress;
    private final int keyBoardCounterDiff;
    private final boolean loadSuccess;
    private final String message;
    private final Object networkErrorState;
    private final int orderShopCount;
    private final boolean orderSummaryPanelOpened;
    private final int pageLoadStatus;
    private final boolean reachableAny;
    private final int refreshCouponViewModel;
    private final Object resendOrderCreateAction;
    private final boolean showDialogState;
    private final boolean showDivider;
    private final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j summaryInfo;
    private final Object systemErrorState;
    private final String total;
    private final int totalItems;
    private n userPaymentInfo;
    private final VoucherInfo voucherInfo;

    static {
        Covode.recordClassIndex(52914);
    }

    public OrderSubmitState() {
        this(0, null, null, false, null, false, false, null, null, 0, 0, 0, null, null, false, false, null, 0, null, false, 0, null, null, false, 16777215, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ OrderSubmitState copy$default(OrderSubmitState orderSubmitState, int i2, List list, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar, boolean z, n nVar, boolean z2, boolean z3, String str, String str2, int i3, int i4, int i5, Object obj, Object obj2, boolean z4, boolean z5, VoucherInfo voucherInfo2, int i6, c cVar, boolean z6, int i7, j jVar2, Object obj3, boolean z7, int i8, Object obj4) {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar3 = jVar;
        List<Object> list2 = list;
        int i9 = i2;
        Object obj5 = obj2;
        boolean z8 = z3;
        boolean z9 = z2;
        n nVar2 = nVar;
        boolean z10 = z;
        String str3 = str;
        String str4 = str2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        Object obj6 = obj;
        VoucherInfo voucherInfo3 = voucherInfo2;
        boolean z11 = z5;
        boolean z12 = z4;
        c cVar2 = cVar;
        boolean z13 = z6;
        int i13 = i7;
        j jVar4 = jVar2;
        Object obj7 = obj3;
        boolean z14 = z7;
        int i14 = i6;
        if ((i8 & 1) != 0) {
            i9 = orderSubmitState.pageLoadStatus;
        }
        if ((i8 & 2) != 0) {
            list2 = orderSubmitState.adapterList;
        }
        if ((i8 & 4) != 0) {
            jVar3 = orderSubmitState.summaryInfo;
        }
        if ((i8 & 8) != 0) {
            z10 = orderSubmitState.hasAddress;
        }
        if ((i8 & 16) != 0) {
            nVar2 = orderSubmitState.userPaymentInfo;
        }
        if ((i8 & 32) != 0) {
            z9 = orderSubmitState.reachableAny;
        }
        if ((i8 & 64) != 0) {
            z8 = orderSubmitState.orderSummaryPanelOpened;
        }
        if ((i8 & 128) != 0) {
            str3 = orderSubmitState.message;
        }
        if ((i8 & 256) != 0) {
            str4 = orderSubmitState.total;
        }
        if ((i8 & 512) != 0) {
            i10 = orderSubmitState.totalItems;
        }
        if ((i8 & 1024) != 0) {
            i11 = orderSubmitState.abnormalStatus;
        }
        if ((i8 & 2048) != 0) {
            i12 = orderSubmitState.keyBoardCounterDiff;
        }
        if ((i8 & 4096) != 0) {
            obj6 = orderSubmitState.networkErrorState;
        }
        if ((i8 & 8192) != 0) {
            obj5 = orderSubmitState.systemErrorState;
        }
        if ((i8 & 16384) != 0) {
            z12 = orderSubmitState.showDialogState;
        }
        if ((32768 & i8) != 0) {
            z11 = orderSubmitState.loadSuccess;
        }
        if ((65536 & i8) != 0) {
            voucherInfo3 = orderSubmitState.voucherInfo;
        }
        if ((131072 & i8) != 0) {
            i14 = orderSubmitState.refreshCouponViewModel;
        }
        if ((262144 & i8) != 0) {
            cVar2 = orderSubmitState.currentPage;
        }
        if ((524288 & i8) != 0) {
            z13 = orderSubmitState.checkPayment;
        }
        if ((1048576 & i8) != 0) {
            i13 = orderSubmitState.orderShopCount;
        }
        if ((2097152 & i8) != 0) {
            jVar4 = orderSubmitState.bottomNotice;
        }
        if ((4194304 & i8) != 0) {
            obj7 = orderSubmitState.resendOrderCreateAction;
        }
        if ((i8 & 8388608) != 0) {
            z14 = orderSubmitState.showDivider;
        }
        return orderSubmitState.copy(i9, list2, jVar3, z10, nVar2, z9, z8, str3, str4, i10, i11, i12, obj6, obj5, z12, z11, voucherInfo3, i14, cVar2, z13, i13, jVar4, obj7, z14);
    }

    public final int component1() {
        return this.pageLoadStatus;
    }

    public final int component10() {
        return this.totalItems;
    }

    public final int component11() {
        return this.abnormalStatus;
    }

    public final int component12() {
        return this.keyBoardCounterDiff;
    }

    public final Object component13() {
        return this.networkErrorState;
    }

    public final Object component14() {
        return this.systemErrorState;
    }

    public final boolean component15() {
        return this.showDialogState;
    }

    public final boolean component16() {
        return this.loadSuccess;
    }

    public final VoucherInfo component17() {
        return this.voucherInfo;
    }

    public final int component18() {
        return this.refreshCouponViewModel;
    }

    public final c component19() {
        return this.currentPage;
    }

    public final List<Object> component2() {
        return this.adapterList;
    }

    public final boolean component20() {
        return this.checkPayment;
    }

    public final int component21() {
        return this.orderShopCount;
    }

    public final j component22() {
        return this.bottomNotice;
    }

    public final Object component23() {
        return this.resendOrderCreateAction;
    }

    public final boolean component24() {
        return this.showDivider;
    }

    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j component3() {
        return this.summaryInfo;
    }

    public final boolean component4() {
        return this.hasAddress;
    }

    public final n component5() {
        return this.userPaymentInfo;
    }

    public final boolean component6() {
        return this.reachableAny;
    }

    public final boolean component7() {
        return this.orderSummaryPanelOpened;
    }

    public final String component8() {
        return this.message;
    }

    public final String component9() {
        return this.total;
    }

    public final OrderSubmitState copy(int i2, List<? extends Object> list, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar, boolean z, n nVar, boolean z2, boolean z3, String str, String str2, int i3, int i4, int i5, Object obj, Object obj2, boolean z4, boolean z5, VoucherInfo voucherInfo2, int i6, c cVar, boolean z6, int i7, j jVar2, Object obj3, boolean z7) {
        l.d(list, "");
        l.d(str, "");
        l.d(str2, "");
        return new OrderSubmitState(i2, list, jVar, z, nVar, z2, z3, str, str2, i3, i4, i5, obj, obj2, z4, z5, voucherInfo2, i6, cVar, z6, i7, jVar2, obj3, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitState)) {
            return false;
        }
        OrderSubmitState orderSubmitState = (OrderSubmitState) obj;
        return this.pageLoadStatus == orderSubmitState.pageLoadStatus && l.a(this.adapterList, orderSubmitState.adapterList) && l.a(this.summaryInfo, orderSubmitState.summaryInfo) && this.hasAddress == orderSubmitState.hasAddress && l.a(this.userPaymentInfo, orderSubmitState.userPaymentInfo) && this.reachableAny == orderSubmitState.reachableAny && this.orderSummaryPanelOpened == orderSubmitState.orderSummaryPanelOpened && l.a(this.message, orderSubmitState.message) && l.a(this.total, orderSubmitState.total) && this.totalItems == orderSubmitState.totalItems && this.abnormalStatus == orderSubmitState.abnormalStatus && this.keyBoardCounterDiff == orderSubmitState.keyBoardCounterDiff && l.a(this.networkErrorState, orderSubmitState.networkErrorState) && l.a(this.systemErrorState, orderSubmitState.systemErrorState) && this.showDialogState == orderSubmitState.showDialogState && this.loadSuccess == orderSubmitState.loadSuccess && l.a(this.voucherInfo, orderSubmitState.voucherInfo) && this.refreshCouponViewModel == orderSubmitState.refreshCouponViewModel && l.a(this.currentPage, orderSubmitState.currentPage) && this.checkPayment == orderSubmitState.checkPayment && this.orderShopCount == orderSubmitState.orderShopCount && l.a(this.bottomNotice, orderSubmitState.bottomNotice) && l.a(this.resendOrderCreateAction, orderSubmitState.resendOrderCreateAction) && this.showDivider == orderSubmitState.showDivider;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.pageLoadStatus) * 31;
        List<Object> list = this.adapterList;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar = this.summaryInfo;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        boolean z = this.hasAddress;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        n nVar = this.userPaymentInfo;
        int hashCode3 = (i7 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        boolean z2 = this.reachableAny;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode3 + i8) * 31;
        boolean z3 = this.orderSummaryPanelOpened;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        String str = this.message;
        int hashCode4 = (i15 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.total;
        int hashCode5 = (((((((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.totalItems)) * 31) + com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.abnormalStatus)) * 31) + com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.keyBoardCounterDiff)) * 31;
        Object obj = this.networkErrorState;
        int hashCode6 = (hashCode5 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.systemErrorState;
        int hashCode7 = (hashCode6 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        boolean z4 = this.showDialogState;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (hashCode7 + i16) * 31;
        boolean z5 = this.loadSuccess;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        VoucherInfo voucherInfo2 = this.voucherInfo;
        int hashCode8 = (((i23 + (voucherInfo2 != null ? voucherInfo2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.refreshCouponViewModel)) * 31;
        c cVar = this.currentPage;
        int hashCode9 = (hashCode8 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        boolean z6 = this.checkPayment;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((hashCode9 + i24) * 31) + com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.orderShopCount)) * 31;
        j jVar2 = this.bottomNotice;
        int hashCode10 = (com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        Object obj3 = this.resendOrderCreateAction;
        if (obj3 != null) {
            i2 = obj3.hashCode();
        }
        int i27 = (hashCode10 + i2) * 31;
        if (!this.showDivider) {
            i3 = 0;
        }
        return i27 + i3;
    }

    public final String toString() {
        return "OrderSubmitState(pageLoadStatus=" + this.pageLoadStatus + ", adapterList=" + this.adapterList + ", summaryInfo=" + this.summaryInfo + ", hasAddress=" + this.hasAddress + ", userPaymentInfo=" + this.userPaymentInfo + ", reachableAny=" + this.reachableAny + ", orderSummaryPanelOpened=" + this.orderSummaryPanelOpened + ", message=" + this.message + ", total=" + this.total + ", totalItems=" + this.totalItems + ", abnormalStatus=" + this.abnormalStatus + ", keyBoardCounterDiff=" + this.keyBoardCounterDiff + ", networkErrorState=" + this.networkErrorState + ", systemErrorState=" + this.systemErrorState + ", showDialogState=" + this.showDialogState + ", loadSuccess=" + this.loadSuccess + ", voucherInfo=" + this.voucherInfo + ", refreshCouponViewModel=" + this.refreshCouponViewModel + ", currentPage=" + this.currentPage + ", checkPayment=" + this.checkPayment + ", orderShopCount=" + this.orderShopCount + ", bottomNotice=" + this.bottomNotice + ", resendOrderCreateAction=" + this.resendOrderCreateAction + ", showDivider=" + this.showDivider + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52915);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getAbnormalStatus() {
        return this.abnormalStatus;
    }

    public final List<Object> getAdapterList() {
        return this.adapterList;
    }

    public final j getBottomNotice() {
        return this.bottomNotice;
    }

    public final boolean getCheckPayment() {
        return this.checkPayment;
    }

    public final c getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasAddress() {
        return this.hasAddress;
    }

    public final int getKeyBoardCounterDiff() {
        return this.keyBoardCounterDiff;
    }

    public final boolean getLoadSuccess() {
        return this.loadSuccess;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getNetworkErrorState() {
        return this.networkErrorState;
    }

    public final int getOrderShopCount() {
        return this.orderShopCount;
    }

    public final boolean getOrderSummaryPanelOpened() {
        return this.orderSummaryPanelOpened;
    }

    public final int getPageLoadStatus() {
        return this.pageLoadStatus;
    }

    public final boolean getReachableAny() {
        return this.reachableAny;
    }

    public final int getRefreshCouponViewModel() {
        return this.refreshCouponViewModel;
    }

    public final Object getResendOrderCreateAction() {
        return this.resendOrderCreateAction;
    }

    public final boolean getShowDialogState() {
        return this.showDialogState;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j getSummaryInfo() {
        return this.summaryInfo;
    }

    public final Object getSystemErrorState() {
        return this.systemErrorState;
    }

    public final String getTotal() {
        return this.total;
    }

    public final int getTotalItems() {
        return this.totalItems;
    }

    public final n getUserPaymentInfo() {
        return this.userPaymentInfo;
    }

    public final VoucherInfo getVoucherInfo() {
        return this.voucherInfo;
    }

    public final void setUserPaymentInfo(n nVar) {
        this.userPaymentInfo = nVar;
    }

    public OrderSubmitState(int i2, List<? extends Object> list, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j jVar, boolean z, n nVar, boolean z2, boolean z3, String str, String str2, int i3, int i4, int i5, Object obj, Object obj2, boolean z4, boolean z5, VoucherInfo voucherInfo2, int i6, c cVar, boolean z6, int i7, j jVar2, Object obj3, boolean z7) {
        l.d(list, "");
        l.d(str, "");
        l.d(str2, "");
        this.pageLoadStatus = i2;
        this.adapterList = list;
        this.summaryInfo = jVar;
        this.hasAddress = z;
        this.userPaymentInfo = nVar;
        this.reachableAny = z2;
        this.orderSummaryPanelOpened = z3;
        this.message = str;
        this.total = str2;
        this.totalItems = i3;
        this.abnormalStatus = i4;
        this.keyBoardCounterDiff = i5;
        this.networkErrorState = obj;
        this.systemErrorState = obj2;
        this.showDialogState = z4;
        this.loadSuccess = z5;
        this.voucherInfo = voucherInfo2;
        this.refreshCouponViewModel = i6;
        this.currentPage = cVar;
        this.checkPayment = z6;
        this.orderShopCount = i7;
        this.bottomNotice = jVar2;
        this.resendOrderCreateAction = obj3;
        this.showDivider = z7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderSubmitState(int r27, java.util.List r28, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j r29, boolean r30, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n r31, boolean r32, boolean r33, java.lang.String r34, java.lang.String r35, int r36, int r37, int r38, java.lang.Object r39, java.lang.Object r40, boolean r41, boolean r42, com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo r43, int r44, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.c r45, boolean r46, int r47, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j r48, java.lang.Object r49, boolean r50, int r51, h.f.b.g r52) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState.<init>(int, java.util.List, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b.j, boolean, com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.n, boolean, boolean, java.lang.String, java.lang.String, int, int, int, java.lang.Object, java.lang.Object, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo, int, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.c, boolean, int, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.j, java.lang.Object, boolean, int, h.f.b.g):void");
    }
}
