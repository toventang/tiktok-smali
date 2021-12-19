package com.bytedance.globalpayment.iap.google.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.h.a;
import com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService;

public class PayloadPreferencesServiceImpl implements PayloadPreferencesService {
    private static volatile PayloadPreferencesService instance;

    static {
        Covode.recordClassIndex(17657);
    }

    private PayloadPreferencesServiceImpl() {
    }

    public static PayloadPreferencesService getInstance() {
        MethodCollector.i(11269);
        if (instance == null) {
            synchronized (PayloadPreferencesServiceImpl.class) {
                try {
                    if (instance == null) {
                        instance = new PayloadPreferencesServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11269);
                    throw th;
                }
            }
        }
        PayloadPreferencesService payloadPreferencesService = instance;
        MethodCollector.o(11269);
        return payloadPreferencesService;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removePayload(Context context, String str) {
        a.a(context, str);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removeQueryOrderParam(Context context, String str) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        a.a(context).edit().remove("key_query_order_".concat(String.valueOf(str))).apply();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void addQueryOrderParam(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        SharedPreferences a2 = a.a(context);
        String a3 = a.a(str, str3, str4, z, str5, z2);
        if (!TextUtils.isEmpty(a3)) {
            a2.edit().putString("key_query_order_".concat(String.valueOf(str2)), a3).apply();
        }
    }
}
