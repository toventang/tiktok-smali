package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f16656a;

    /* renamed from: b  reason: collision with root package name */
    private final ar f16657b;

    static {
        Covode.recordClassIndex(9235);
    }

    g(f fVar, ar arVar) {
        this.f16656a = fVar;
        this.f16657b = arVar;
    }

    public final void onClick(View view) {
        this.f16656a.a(this.f16657b);
    }
}
