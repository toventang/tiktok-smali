package com.bytedance.globalpayment.iap.google.helper;

import com.android.billingclient.api.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.google.f.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30431a = false;

    /* renamed from: b  reason: collision with root package name */
    public static int f30432b;

    /* renamed from: c  reason: collision with root package name */
    public static int f30433c;

    /* renamed from: d  reason: collision with root package name */
    public static int f30434d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f30435e = a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17649);
    }

    public static g a(g.a aVar, OrderData orderData) {
        String str;
        String orderId = orderData.getOrderId();
        String str2 = orderData.getIapPayRequest().f30262b;
        String userId = orderData.getUserId();
        String str3 = orderData.getIapPayRequest().f30269i;
        if (orderData.isNewSubscription()) {
            str = "1";
        } else {
            str = "0";
        }
        if (f30431a) {
            String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
            int max = Math.max(Math.max(f30432b, f30433c), f30434d);
            orderId = "";
            str2 = orderId;
            userId = str2;
            for (int i2 = 0; i2 < max; i2++) {
                if (i2 < f30432b) {
                    orderId = orderId + (i2 % 10);
                }
                if (i2 < f30433c) {
                    str2 = str2 + strArr[i2 % 10];
                }
                if (i2 < f30434d) {
                    userId = userId + strArr[i2 % 10].toUpperCase();
                }
            }
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        orderId.length();
        str2.length();
        userId.length();
        aVar.f5845a = "newstr" + b.a(new String[]{orderId, com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d().f30539a, str});
        if (str2.length() > 64) {
            aVar.f5846b = str2.substring(0, 64);
        } else if ((str2 + "\n" + userId).length() > 64) {
            aVar.f5846b = (str2 + "\n" + userId).substring(0, 64);
        } else if ((str2 + "\n" + userId + "\n" + str3).length() > 64) {
            aVar.f5846b = (str2 + "\n" + userId + "\n" + str3).substring(0, 64);
        } else {
            aVar.f5846b = str2 + "\n" + userId + "\n" + str3;
        }
        return aVar.a();
    }
}
