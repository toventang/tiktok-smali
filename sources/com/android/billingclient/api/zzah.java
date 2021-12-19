package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.List;

final class zzah implements c, f, j, k, m {

    /* renamed from: a  reason: collision with root package name */
    private final long f5907a;

    static {
        Covode.recordClassIndex(2469);
    }

    public static native void nativeOnAcknowledgePurchaseResponse(int i2, String str, long j2);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i2, String str, long j2);

    public static native void nativeOnConsumePurchaseResponse(int i2, String str, String str2, long j2);

    public static native void nativeOnPriceChangeConfirmationResult(int i2, String str, long j2);

    public static native void nativeOnPurchaseHistoryResponse(int i2, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j2);

    public static native void nativeOnPurchasesUpdated(int i2, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i2, String str, Purchase[] purchaseArr, long j2);

    public static native void nativeOnSkuDetailsResponse(int i2, String str, SkuDetails[] skuDetailsArr, long j2);

    zzah() {
    }

    @Override // com.android.billingclient.api.f
    public final void a() {
        MethodCollector.i(6074);
        nativeOnBillingServiceDisconnected();
        MethodCollector.o(6074);
    }

    @Override // com.android.billingclient.api.c
    public final void a(h hVar) {
        MethodCollector.i(6014);
        nativeOnAcknowledgePurchaseResponse(hVar.f5852a, hVar.f5853b, this.f5907a);
        MethodCollector.o(6014);
    }

    @Override // com.android.billingclient.api.f
    public final void b(h hVar) {
        MethodCollector.i(6015);
        nativeOnBillingSetupFinished(hVar.f5852a, hVar.f5853b, this.f5907a);
        MethodCollector.o(6015);
    }

    @Override // com.android.billingclient.api.j
    public final void a(h hVar, String str) {
        MethodCollector.i(6153);
        nativeOnConsumePurchaseResponse(hVar.f5852a, hVar.f5853b, str, this.f5907a);
        MethodCollector.o(6153);
    }

    @Override // com.android.billingclient.api.m
    public final void b(h hVar, List<SkuDetails> list) {
        MethodCollector.i(6012);
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(hVar.f5852a, hVar.f5853b, (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), this.f5907a);
        MethodCollector.o(6012);
    }

    @Override // com.android.billingclient.api.k
    public final void a(h hVar, List<Purchase> list) {
        MethodCollector.i(6216);
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(hVar.f5852a, hVar.f5853b, (Purchase[]) list.toArray(new Purchase[list.size()]));
        MethodCollector.o(6216);
    }
}
