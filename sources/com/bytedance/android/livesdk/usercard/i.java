package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.v;
import com.bytedance.android.livesdk.event.a;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f21850a;

    static {
        Covode.recordClassIndex(12865);
    }

    i(f fVar) {
        this.f21850a = fVar;
    }

    public final void onClick(View view) {
        f fVar = this.f21850a;
        if (fVar.f21836d.getSecret() == 1) {
            ao.a(y.e(), y.a((int) R.string.e9r, fVar.f21836d.displayId), 0);
        } else if (fVar.f21835c != null) {
            fVar.f21835c.c(v.class, new a(fVar.f21836d, "user_profile"));
            view.setClickable(false);
            if (fVar.f21844l != null) {
                fVar.f21844l.a();
            }
        }
    }
}
