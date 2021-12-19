package com.bytedance.android.livesdk.l;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f18302a;

    static {
        Covode.recordClassIndex(10303);
    }

    h(b bVar) {
        this.f18302a = bVar;
    }

    public final void onClick(View view) {
        this.f18302a.cancel();
    }
}
