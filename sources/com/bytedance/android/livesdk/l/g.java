package com.bytedance.android.livesdk.l;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f18301a;

    static {
        Covode.recordClassIndex(10302);
    }

    g(b bVar) {
        this.f18301a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f18301a;
        b.a(false, bVar.f18277g);
        new Handler().postDelayed(new k(bVar), 100);
    }
}
