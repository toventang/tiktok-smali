package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class OrderSubmitEnterParams {
    public static final a Companion = new a((byte) 0);
    @c(a = "asyncBillFetch")
    private final Boolean asyncBillFetch;
    @c(a = "billInfo")
    private final BillInfoResponse billInfoResp;
    @c(a = "buy_type")
    private final int buyType;
    @c(a = "chain_key")
    private final String chainKey;
    @c(a = "combined_area")
    private final List<Region> combinedArea;
    @c(a = "repo_id")
    private final String repoId;
    @c(a = "requestParams")
    private final OrderSubmitRequestParam requestParams;
    @c(a = "trackParams")
    private final HashMap<String, Object> trackParams;

    static {
        Covode.recordClassIndex(52911);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitEnterParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderSubmitEnterParams copy$default(OrderSubmitEnterParams orderSubmitEnterParams, OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List list, String str, HashMap hashMap, String str2, int i2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            orderSubmitRequestParam = orderSubmitEnterParams.requestParams;
        }
        if ((i3 & 2) != 0) {
            billInfoResponse = orderSubmitEnterParams.billInfoResp;
        }
        if ((i3 & 4) != 0) {
            list = orderSubmitEnterParams.combinedArea;
        }
        if ((i3 & 8) != 0) {
            str = orderSubmitEnterParams.chainKey;
        }
        if ((i3 & 16) != 0) {
            hashMap = orderSubmitEnterParams.trackParams;
        }
        if ((i3 & 32) != 0) {
            str2 = orderSubmitEnterParams.repoId;
        }
        if ((i3 & 64) != 0) {
            i2 = orderSubmitEnterParams.buyType;
        }
        if ((i3 & 128) != 0) {
            bool = orderSubmitEnterParams.asyncBillFetch;
        }
        return orderSubmitEnterParams.copy(orderSubmitRequestParam, billInfoResponse, list, str, hashMap, str2, i2, bool);
    }

    public final OrderSubmitRequestParam component1() {
        return this.requestParams;
    }

    public final BillInfoResponse component2() {
        return this.billInfoResp;
    }

    public final List<Region> component3() {
        return this.combinedArea;
    }

    public final String component4() {
        return this.chainKey;
    }

    public final HashMap<String, Object> component5() {
        return this.trackParams;
    }

    public final String component6() {
        return this.repoId;
    }

    public final int component7() {
        return this.buyType;
    }

    public final Boolean component8() {
        return this.asyncBillFetch;
    }

    public final OrderSubmitEnterParams copy(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> hashMap, String str2, int i2, Boolean bool) {
        l.d(orderSubmitRequestParam, "");
        return new OrderSubmitEnterParams(orderSubmitRequestParam, billInfoResponse, list, str, hashMap, str2, i2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitEnterParams)) {
            return false;
        }
        OrderSubmitEnterParams orderSubmitEnterParams = (OrderSubmitEnterParams) obj;
        return l.a(this.requestParams, orderSubmitEnterParams.requestParams) && l.a(this.billInfoResp, orderSubmitEnterParams.billInfoResp) && l.a(this.combinedArea, orderSubmitEnterParams.combinedArea) && l.a(this.chainKey, orderSubmitEnterParams.chainKey) && l.a(this.trackParams, orderSubmitEnterParams.trackParams) && l.a(this.repoId, orderSubmitEnterParams.repoId) && this.buyType == orderSubmitEnterParams.buyType && l.a(this.asyncBillFetch, orderSubmitEnterParams.asyncBillFetch);
    }

    public final int hashCode() {
        OrderSubmitRequestParam orderSubmitRequestParam = this.requestParams;
        int i2 = 0;
        int hashCode = (orderSubmitRequestParam != null ? orderSubmitRequestParam.hashCode() : 0) * 31;
        BillInfoResponse billInfoResponse = this.billInfoResp;
        int hashCode2 = (hashCode + (billInfoResponse != null ? billInfoResponse.hashCode() : 0)) * 31;
        List<Region> list = this.combinedArea;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.chainKey;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        HashMap<String, Object> hashMap = this.trackParams;
        int hashCode5 = (hashCode4 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        String str2 = this.repoId;
        int hashCode6 = (((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_OrderSubmitEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.buyType)) * 31;
        Boolean bool = this.asyncBillFetch;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "OrderSubmitEnterParams(requestParams=" + this.requestParams + ", billInfoResp=" + this.billInfoResp + ", combinedArea=" + this.combinedArea + ", chainKey=" + this.chainKey + ", trackParams=" + this.trackParams + ", repoId=" + this.repoId + ", buyType=" + this.buyType + ", asyncBillFetch=" + this.asyncBillFetch + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52912);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Boolean getAsyncBillFetch() {
        return this.asyncBillFetch;
    }

    public final BillInfoResponse getBillInfoResp() {
        return this.billInfoResp;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final List<Region> getCombinedArea() {
        return this.combinedArea;
    }

    public final String getRepoId() {
        return this.repoId;
    }

    public final OrderSubmitRequestParam getRequestParams() {
        return this.requestParams;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public OrderSubmitEnterParams(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> hashMap, String str2, int i2, Boolean bool) {
        l.d(orderSubmitRequestParam, "");
        this.requestParams = orderSubmitRequestParam;
        this.billInfoResp = billInfoResponse;
        this.combinedArea = list;
        this.chainKey = str;
        this.trackParams = hashMap;
        this.repoId = str2;
        this.buyType = i2;
        this.asyncBillFetch = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSubmitEnterParams(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List list, String str, HashMap hashMap, String str2, int i2, Boolean bool, int i3, g gVar) {
        this(orderSubmitRequestParam, (i3 & 2) != 0 ? null : billInfoResponse, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : hashMap, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) == 0 ? bool : null);
    }
}
