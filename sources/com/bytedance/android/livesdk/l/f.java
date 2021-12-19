package com.bytedance.android.livesdk.l;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f18300a;

    static {
        Covode.recordClassIndex(10301);
    }

    f(b bVar) {
        this.f18300a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f18300a;
        if (!bVar.y) {
            b.a(false, bVar.f18277g);
            new Handler().postDelayed(new l(bVar), 100);
        }
        if (bVar.t != null) {
            bVar.t.onClick(bVar, 1);
        }
    }
}
