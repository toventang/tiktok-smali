package com.ss.android.ugc.aweme.ecommerce.sku;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.common.a.d;
import h.f.b.l;

public final class a extends d {
    static {
        Covode.recordClassIndex(54846);
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h, com.ss.android.ugc.aweme.ecommerce.common.a.d
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(48);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, int i2) {
        super(context, i2);
        l.d(context, "");
    }
}
