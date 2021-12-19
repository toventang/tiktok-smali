package com.bytedance.globalpayment.iap.common.ability.g.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.OneTimeOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.SubscriptionOrderStateResponseEntity;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.a.a;
import com.bytedance.globalpayment.payment.common.lib.a.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends com.bytedance.globalpayment.iap.common.ability.g.b.c {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f30290b;

    /* renamed from: a  reason: collision with root package name */
    public final String f30291a = c.class.getSimpleName();

    static {
        Covode.recordClassIndex(17573);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.c
    public final void a(com.bytedance.globalpayment.iap.common.ability.c cVar, OrderData orderData, final a<CreateOrderResponseEntity> aVar) {
        String str;
        if (TextUtils.isEmpty(cVar.f30266f)) {
            aVar.a(new d(201, 2012, "pay params is error in createOrder"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", new StringBuilder().append(cVar.f30263c).toString());
        hashMap.put("merchant_id", cVar.f30262b);
        if (cVar.f30267g) {
            str = "pipo.subscription.init";
        } else {
            str = "pipo.trade.payIn";
        }
        hashMap.put("method", str);
        hashMap.put("sign", cVar.f30261a);
        hashMap.put("biz_content", cVar.f30266f);
        for (Map.Entry entry : hashMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        final com.bytedance.globalpayment.iap.common.ability.e.a aVar2 = new com.bytedance.globalpayment.iap.common.ability.e.a("create_order", orderData.getOrderId(), orderData.getProductId());
        aVar2.a();
        a(a(), hashMap, new b() {
            /* class com.bytedance.globalpayment.iap.common.ability.g.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17574);
            }

            private void a(d dVar) {
                aVar2.a(false, dVar);
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a((AbsResult) dVar);
                }
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.a.b
            public final void a(AbsResult absResult) {
                if (absResult == null) {
                    absResult = new d().withErrorCode(202).withMessage("network error but pipoResult is null");
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    absResult.getMessage();
                } else {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    absResult.getMessage();
                    absResult.withErrorCode(202);
                }
                a(d.a(absResult));
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.a.b
            public final void a(String str) {
                CreateOrderResponseEntity createOrderResponseEntity = new CreateOrderResponseEntity();
                try {
                    String optString = new JSONObject(str).optString("response");
                    JSONObject jSONObject = new JSONObject(optString);
                    createOrderResponseEntity.errorCode = jSONObject.optInt("error_code", -1);
                    createOrderResponseEntity.message = jSONObject.optString("message");
                    if (createOrderResponseEntity.isSuccess()) {
                        createOrderResponseEntity = (CreateOrderResponseEntity) com.bytedance.globalpayment.iap.common.ability.h.b.a(optString, CreateOrderResponseEntity.class);
                    }
                } catch (JSONException e2) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    e2.getLocalizedMessage();
                    createOrderResponseEntity = null;
                }
                if (createOrderResponseEntity == null) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    a(new d(202, 2021, "CreateOrderApiImpl: create order service response failed, message is null"));
                } else if (createOrderResponseEntity.isSuccess()) {
                    aVar2.a(true, (d) null);
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(createOrderResponseEntity);
                    }
                } else {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    a(new d(202, createOrderResponseEntity.errorCode, "CreateOrderApiImpl: create order service response failed because : " + createOrderResponseEntity.message));
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.c
    public final void a(String str, String str2, String str3, String str4, boolean z, String str5, final a<ResponseEntity> aVar, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30542d;
        }
        if (!z || z2) {
            final com.bytedance.globalpayment.iap.common.ability.e.a aVar2 = new com.bytedance.globalpayment.iap.common.ability.e.a("query_order_state", str, str4);
            aVar2.a();
            StringBuilder sb = new StringBuilder(200);
            sb.append(c(str5)).append('?').append("merchant_id=").append(str2).append('&').append("request_id=").append(str);
            String sb2 = sb.toString();
            AnonymousClass4 r3 = new b() {
                /* class com.bytedance.globalpayment.iap.common.ability.g.a.c.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(17577);
                }

                private void a(d dVar) {
                    aVar2.a(false, dVar);
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a((AbsResult) dVar);
                    }
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.b
                public final void a(AbsResult absResult) {
                    if (absResult == null) {
                        absResult = new d().withErrorCode(204).withMessage("network error but pipoResult is null");
                    } else {
                        absResult.withErrorCode(204);
                    }
                    a(d.a(absResult));
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.b
                public final void a(String str) {
                    String str2;
                    try {
                        OneTimeOrderStateResponseEntity oneTimeOrderStateResponseEntity = (OneTimeOrderStateResponseEntity) com.bytedance.globalpayment.iap.common.ability.h.b.a(str, OneTimeOrderStateResponseEntity.class);
                        if (oneTimeOrderStateResponseEntity == null) {
                            str2 = "";
                        } else if (oneTimeOrderStateResponseEntity.isSuccess()) {
                            aVar2.a(true, (d) null);
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            a aVar = aVar;
                            if (aVar != null) {
                                aVar.a(oneTimeOrderStateResponseEntity);
                                return;
                            }
                            return;
                        } else {
                            str2 = oneTimeOrderStateResponseEntity.message;
                        }
                        String concat = "OrderStateApiImpl: query order state service response failed:".concat(String.valueOf(str2));
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        a(new d(204, 2021, concat));
                    } catch (Throwable th) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        a(new d(204, 2021, "OrderStateApiImpl: query order state service response failed:" + th.getLocalizedMessage()));
                    }
                }
            };
            String str6 = sb2 + "&pipo_sdk_version=1.0";
            String str7 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().c().f30516k;
            if (!TextUtils.isEmpty(str7)) {
                str6 = str6 + "&device_id=" + str7;
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().g().a(str6, r3);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("MerchantID", str2);
            jSONObject.put("MerchantUserID", str3);
            jSONObject.put("MerchantSubscriptionID", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("merchant_id", str2);
        hashMap.put("method", "pipo.subscription.getSubsTxnsByMerchant");
        hashMap.put("timestamp", new StringBuilder().append(System.currentTimeMillis()).toString());
        hashMap.put("biz_content", jSONObject.toString());
        final com.bytedance.globalpayment.iap.common.ability.e.a aVar3 = new com.bytedance.globalpayment.iap.common.ability.e.a("query_subscription_order_state", str, str4);
        aVar3.a();
        a(d(str5), hashMap, new b() {
            /* class com.bytedance.globalpayment.iap.common.ability.g.a.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17576);
            }

            private void a(d dVar) {
                aVar3.a(false, dVar);
                a aVar = aVar;
                if (aVar != null) {
                    aVar.a((AbsResult) dVar);
                }
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.a.b
            public final void a(AbsResult absResult) {
                if (absResult == null) {
                    absResult = new d().withErrorCode(-1).withMessage("network error but pipoResult is null");
                } else {
                    absResult.withErrorCode(-1);
                }
                a(d.a(absResult));
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.a.b
            public final void a(String str) {
                String str2;
                SubscriptionOrderStateResponseEntity fromJson = SubscriptionOrderStateResponseEntity.fromJson(str);
                if (fromJson == null) {
                    str2 = "";
                } else if (fromJson.isSuccess()) {
                    aVar3.a(true, (d) null);
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(fromJson);
                        return;
                    }
                    return;
                } else {
                    str2 = fromJson.message;
                }
                String concat = "OrderStateApiImpl: query order state response failed, message is: ".concat(String.valueOf(str2));
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                a(new d(204, 2021, concat));
            }
        });
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.c
    public final void a(String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4, final a<ResponseEntity> aVar, boolean z2) {
        boolean z3;
        String str5;
        String str6;
        if (jSONObject != null) {
            if (!z || z2) {
                z3 = false;
            } else {
                z3 = true;
                try {
                    jSONObject.put("MerchantID", str);
                } catch (Throwable unused) {
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
            if (TextUtils.isEmpty(str)) {
                str = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30542d;
                if (TextUtils.isEmpty(str)) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    aVar.a(new d(205, 2012, "upload token failed because merchantId is null!"));
                    return;
                }
            }
            hashMap.put("merchant_id", str);
            if (z3) {
                str5 = "pipo.subscription.uploadToken";
            } else {
                str5 = "pipo.receipt.check";
            }
            hashMap.put("method", str5);
            hashMap.put("biz_content", jSONObject.toString());
            for (Map.Entry entry : hashMap.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            if (z3) {
                str6 = b(str2);
            } else {
                str6 = a(str2);
            }
            if (f30290b) {
                aVar.a(new d().withMessage("simulate up token error,return without any operation "));
                return;
            }
            final com.bytedance.globalpayment.iap.common.ability.e.a aVar2 = new com.bytedance.globalpayment.iap.common.ability.e.a("upload_token", str3, str4);
            aVar2.a();
            a(str6, hashMap, new b() {
                /* class com.bytedance.globalpayment.iap.common.ability.g.a.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(17575);
                }

                private void a(d dVar) {
                    aVar2.a(false, dVar);
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a((AbsResult) dVar);
                    }
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.b
                public final void a(AbsResult absResult) {
                    if (absResult == null) {
                        absResult = new d().withErrorCode(205).withMessage("network error but pipoResult is null");
                    } else {
                        absResult.withErrorCode(205);
                    }
                    a(d.a(absResult));
                }

                @Override // com.bytedance.globalpayment.payment.common.lib.a.b
                public final void a(String str) {
                    String str2;
                    try {
                        ResponseEntity responseEntity = (ResponseEntity) com.bytedance.globalpayment.iap.common.ability.h.b.a(str, ResponseEntity.class);
                        if (responseEntity == null) {
                            str2 = "";
                        } else if (responseEntity.isSuccess()) {
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            aVar2.a(true, (d) null);
                            if (aVar != null) {
                                JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
                                if (optJSONObject != null) {
                                    responseEntity.setOrderId(optJSONObject.optString("orderId"));
                                }
                                aVar.a(responseEntity);
                                return;
                            }
                            return;
                        } else {
                            str2 = responseEntity.message;
                        }
                        String concat = "UploadTokenApiImpl: upload token service response failed, message is: ".concat(String.valueOf(str2));
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        a(new d(205, 2021, concat));
                    } catch (Throwable th) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        a(new d(205, 2021, "UploadTokenApiImpl: upload token service response failed, message is: " + th.getLocalizedMessage()));
                    }
                }
            });
        } else if (aVar != null) {
            aVar.a(new d(201, 2012, "tokenJson is error in uploadToken"));
        }
    }
}
