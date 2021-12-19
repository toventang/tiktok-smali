package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.w;
import com.bytedance.android.livesdk.chatroom.c.a;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f21851a;

    static {
        Covode.recordClassIndex(12866);
    }

    j(f fVar) {
        this.f21851a = fVar;
    }

    public final void onClick(View view) {
        f fVar = this.f21851a;
        if (fVar.f21835c != null) {
            fVar.f21835c.c(w.class, new a(fVar.f21836d, "kickout_with_profile"));
            if (fVar.f21844l != null) {
                fVar.f21844l.a();
            }
        }
    }
}
