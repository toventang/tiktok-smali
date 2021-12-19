package com.ss.android.ugc.aweme.ecommerce.cart.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.a;
import java.io.Serializable;

public final class c extends a<a> implements Serializable {
    static {
        Covode.recordClassIndex(52886);
    }

    public final boolean isValid() {
        return isCodeOK();
    }

    public c(int i2, String str, a aVar) {
        super(i2, str, aVar);
    }
}
