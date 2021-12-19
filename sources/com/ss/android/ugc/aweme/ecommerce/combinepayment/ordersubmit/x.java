package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ecommerce.ab.g;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import org.json.JSONObject;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f85181a = new x();

    /* access modifiers changed from: package-private */
    public static final class c extends h.c.b.a.d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(53253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(x xVar, h.c.d dVar) {
            super(dVar);
            this.this$0 = xVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, null, null, null, null, null, null, false, 0, this);
        }
    }

    public static final class a extends com.google.gson.b.a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(53251);
        }

        a() {
        }
    }

    private x() {
    }

    static {
        Covode.recordClassIndex(53250);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, h.c.d<? super BillInfoResponse>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a $orderSubmitRepository$inlined;
        final /* synthetic */ BillInfoRequest $request$inlined;
        final /* synthetic */ am $scope$inlined;
        final /* synthetic */ HashMap $trackParams$inlined;
        int label;

        static {
            Covode.recordClassIndex(53252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.c.d dVar, am amVar, com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a aVar, BillInfoRequest billInfoRequest, HashMap hashMap) {
            super(2, dVar);
            this.$scope$inlined = amVar;
            this.$orderSubmitRepository$inlined = aVar;
            this.$request$inlined = billInfoRequest;
            this.$trackParams$inlined = hashMap;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(dVar, this.$scope$inlined, this.$orderSubmitRepository$inlined, this.$request$inlined, this.$trackParams$inlined);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super BillInfoResponse> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.a aVar2 = this.$orderSubmitRepository$inlined;
                BillInfoRequest billInfoRequest = this.$request$inlined;
                HashMap hashMap = this.$trackParams$inlined;
                this.label = 1;
                obj = aVar2.a(billInfoRequest, true, hashMap, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ List $activityId;
        final /* synthetic */ Context $context;
        final /* synthetic */ IPdpStarter.PdpEnterParam $enterParam;
        final /* synthetic */ boolean $fullScreenMode;
        final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult $packedDeliverySelectResult;
        final /* synthetic */ ProductPackStruct $productInfoPack;
        final /* synthetic */ SkuPanelState $skuSelectedInfo;
        private /* synthetic */ Object L$0;
        int label;

        static {
            Covode.recordClassIndex(53254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, ProductPackStruct productPackStruct, SkuPanelState skuPanelState, IPdpStarter.PdpEnterParam pdpEnterParam, List list, boolean z, h.c.d dVar) {
            super(2, dVar);
            this.$context = context;
            this.$packedDeliverySelectResult = packedDeliverySelectResult;
            this.$productInfoPack = productPackStruct;
            this.$skuSelectedInfo = skuPanelState;
            this.$enterParam = pdpEnterParam;
            this.$activityId = list;
            this.$fullScreenMode = z;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            d dVar2 = new d(this.$context, this.$packedDeliverySelectResult, this.$productInfoPack, this.$skuSelectedInfo, this.$enterParam, this.$activityId, this.$fullScreenMode, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                x xVar = x.f85181a;
                Context context = this.$context;
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.$packedDeliverySelectResult;
                ProductPackStruct productPackStruct = this.$productInfoPack;
                SkuPanelState skuPanelState = this.$skuSelectedInfo;
                IPdpStarter.PdpEnterParam pdpEnterParam = this.$enterParam;
                List<String> list = this.$activityId;
                boolean z = this.$fullScreenMode;
                int a2 = g.a();
                this.label = 1;
                if (xVar.a((am) this.L$0, context, packedDeliverySelectResult, productPackStruct, skuPanelState, pdpEnterParam, list, z, a2, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    private static String a(HashMap<String, Object> hashMap) {
        Map map = null;
        try {
            f fVar = new f();
            Object obj = hashMap != null ? hashMap.get("entrance_info") : null;
            if (obj != null) {
                map = (Map) fVar.a((String) obj, new a().type);
                List<String> list = com.ss.android.ugc.aweme.ecommerce.ab.d.a().f84226a;
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (list.contains(entry.getKey())) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                }
                String jSONObject2 = jSONObject.toString();
                l.b(jSONObject2, "");
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0072, code lost:
        if (r1.length() == 0) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.Object> a(com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam r5, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x.a(com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, boolean):java.util.HashMap");
    }

    private static void a(Context context, OrderSubmitEnterParams orderSubmitEnterParams, String str) {
        if (str == null || str.length() == 0) {
            str = "aweme://ec/order_submit_v2";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestParams", orderSubmitEnterParams.getRequestParams());
        linkedHashMap.put("buy_type", Integer.valueOf(orderSubmitEnterParams.getBuyType()));
        List<Region> combinedArea = orderSubmitEnterParams.getCombinedArea();
        if (combinedArea != null) {
            linkedHashMap.put("combinedArea", combinedArea);
        }
        String chainKey = orderSubmitEnterParams.getChainKey();
        if (chainKey != null) {
            linkedHashMap.put("chainKey", chainKey);
        }
        BillInfoResponse billInfoResp = orderSubmitEnterParams.getBillInfoResp();
        if (billInfoResp != null) {
            linkedHashMap.put("response", billInfoResp);
        }
        HashMap<String, Object> trackParams = orderSubmitEnterParams.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.put("trackParams", trackParams);
        }
        String repoId = orderSubmitEnterParams.getRepoId();
        if (repoId != null) {
            linkedHashMap.put("repoId", repoId);
        }
        Boolean asyncBillFetch = orderSubmitEnterParams.getAsyncBillFetch();
        if (asyncBillFetch != null) {
            asyncBillFetch.booleanValue();
            linkedHashMap.put("asyncBillFetch", orderSubmitEnterParams.getAsyncBillFetch());
        }
        j.a(context, str, linkedHashMap, false).open();
    }

    private static BillInfoRequest a(DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, ProductPackStruct productPackStruct, SkuPanelState skuPanelState, IPdpStarter.PdpEnterParam pdpEnterParam, List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        HashMap<String, Object> hashMap;
        Object obj;
        HashMap<String, Object> hashMap2;
        Integer num2;
        LogisticDTO logisticDTO;
        String str5;
        String str6;
        HashMap<String, Object> hashMap3;
        VoucherInfo voucherInfo;
        LogisticDTO logisticDTO2;
        LogisticDTO logisticDTO3;
        LogisticDTO logisticDTO4;
        HashMap<String, Object> trackParams;
        SellerInfo sellerInfo;
        SkuVoucher skuVoucher = null;
        if (packedDeliverySelectResult != null) {
            str = packedDeliverySelectResult.f85807b;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null) {
            str2 = null;
        } else {
            str2 = sellerInfo.f86657a;
        }
        ArrayList arrayList2 = new ArrayList();
        if (productPackStruct != null) {
            str3 = productPackStruct.f86638b;
        } else {
            str3 = null;
        }
        if (skuPanelState != null) {
            str4 = skuPanelState.getSkuId();
            num = skuPanelState.getProductQuantity();
        } else {
            str4 = null;
            num = null;
        }
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
        } else {
            hashMap = null;
        }
        Integer valueOf = Integer.valueOf(IPdpStarter.a.a(hashMap));
        if (pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null) {
            obj = null;
        } else {
            obj = trackParams.get("author_id");
        }
        String valueOf2 = String.valueOf(obj);
        if (pdpEnterParam != null) {
            hashMap2 = pdpEnterParam.getTrackParams();
        } else {
            hashMap2 = null;
        }
        arrayList2.add(new OrderSKUDTO(str3, str4, num, null, valueOf, null, a(hashMap2), null, valueOf2, 168));
        if (packedDeliverySelectResult != null && (logisticDTO4 = packedDeliverySelectResult.f85806a) != null) {
            num2 = Integer.valueOf(logisticDTO4.f85889a);
        } else if (productPackStruct == null || (logisticDTO = productPackStruct.f86645i) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(logisticDTO.f85889a);
        }
        if (packedDeliverySelectResult == null || (logisticDTO3 = packedDeliverySelectResult.f85806a) == null || (str5 = logisticDTO3.f85899k) == null) {
            if (productPackStruct == null || (logisticDTO2 = productPackStruct.f86645i) == null) {
                str5 = null;
            } else {
                str5 = logisticDTO2.f85899k;
            }
        }
        if (skuPanelState != null) {
            str6 = skuPanelState.getWarehouseId();
        } else {
            str6 = null;
        }
        arrayList.add(new OrderShopDigest(str6, str2, arrayList2, num2, str5));
        if (pdpEnterParam != null) {
            hashMap3 = pdpEnterParam.getOrderRequestParams();
        } else {
            hashMap3 = null;
        }
        if (productPackStruct != null) {
            voucherInfo = productPackStruct.f86648l;
        } else {
            voucherInfo = null;
        }
        if (skuPanelState != null) {
            skuVoucher = skuPanelState.getVoucherInfo();
        }
        return new BillInfoRequest(str, 0, arrayList, true, true, true, true, null, null, com.ss.android.ugc.aweme.ecommerce.coupon.a.a.a(voucherInfo, skuVoucher), true, null, hashMap3, null, list, 8194, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        if (r16 != null) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r15, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r16, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r17, com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState r18, com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam r19, boolean r20, h.f.a.m<? super java.util.List<java.lang.String>, ? super java.lang.Integer, h.z> r21) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x.a(android.content.Context, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam, boolean, h.f.a.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        if (h.f.b.l.a((java.lang.Object) r11, (java.lang.Object) true) != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (h.f.b.l.a((java.lang.Object) r11, (java.lang.Object) true) != false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.am r25, android.content.Context r26, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.PackedDeliverySelectResult r27, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r28, com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState r29, com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam r30, java.util.List<java.lang.String> r31, boolean r32, int r33, h.c.d<? super h.z> r34) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x.a(kotlinx.coroutines.am, android.content.Context, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$PackedDeliverySelectResult, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState, com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam, java.util.List, boolean, int, h.c.d):java.lang.Object");
    }
}
