package com.bytedance.android.livesdk.l;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f18297a;

    static {
        Covode.recordClassIndex(10298);
    }

    c(b bVar) {
        this.f18297a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f18297a;
        if (!bVar.x) {
            b.a(false, bVar.f18277g);
            new Handler().postDelayed(new e(bVar), 100);
        }
        if (bVar.s != null) {
            bVar.s.onClick(bVar, 0);
        }
    }
}
