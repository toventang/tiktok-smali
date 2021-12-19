package com.bytedance.android.livesdk.l;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f18298a;

    static {
        Covode.recordClassIndex(10299);
    }

    d(b bVar) {
        this.f18298a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f18298a;
        if (!bVar.w) {
            b.a(false, bVar.f18277g);
            new Handler().postDelayed(new m(bVar), 100);
        }
        if (bVar.r != null) {
            bVar.r.onClick(bVar, 1);
        }
    }
}
