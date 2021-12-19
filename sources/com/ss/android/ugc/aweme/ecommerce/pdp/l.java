package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.zhiliaoapp.musically.R;

public final class l extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    TuxDualBallView f86509a;

    static {
        Covode.recordClassIndex(54193);
    }

    public final void dismiss() {
        super.dismiss();
        this.f86509a.c();
    }

    public final void show() {
        super.show();
        this.f86509a.b();
    }

    public l(Context context) {
        super(context, R.style.fe);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.py);
        this.f86509a = (TuxDualBallView) findViewById(R.id.eu5);
        setCanceledOnTouchOutside(false);
    }
}
