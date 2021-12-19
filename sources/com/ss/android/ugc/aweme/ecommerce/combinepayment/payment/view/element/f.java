package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import com.bytedance.covode.number.Covode;

public enum f {
    Normal,
    CardNumber,
    Date,
    Region,
    CPF,
    Email,
    Address,
    Option,
    Phone;

    static {
        Covode.recordClassIndex(53529);
    }
}
