package com.bytedance.globalpayment.service.manager.ecommerce;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.a.c;
import com.bytedance.globalpayment.a.a.a.a.d;
import com.bytedance.globalpayment.a.a.a.c.a;
import com.bytedance.globalpayment.a.a.a.d.b;
import java.util.List;

public interface ECommerceService {
    static {
        Covode.recordClassIndex(17770);
    }

    String encryptWithRsa(String str);

    b getCardPaymentMethod(String str);

    a getECommerceInterceptor();

    List<Object> getElements(String str, String... strArr);

    com.bytedance.globalpayment.a.a.a.d.a isValidElement(String str, String str2, String str3);

    com.bytedance.globalpayment.a.a.a.d.a isValidExpiryDateElement(String str, String str2, String str3);

    void onLanguageUpdate(String str);

    void pay(com.bytedance.globalpayment.a.a.a.d.a.b bVar, c cVar);

    void payWithChannel(int i2, com.bytedance.globalpayment.a.b.a aVar, com.bytedance.globalpayment.a.a.a.a.b bVar);

    void queryOrderState(com.bytedance.globalpayment.a.a.a.d.a.c cVar, d dVar);

    void updateNonce(String str);
}
