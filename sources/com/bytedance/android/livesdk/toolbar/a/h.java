package com.bytedance.android.livesdk.toolbar.a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.b;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.view.h;
import com.bytedance.android.live.design.view.j;
import com.bytedance.android.live.gift.i;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.guide.c;
import com.bytedance.android.livesdk.j.cc;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideBubbleDurationSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.w;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f21688a;

    static {
        Covode.recordClassIndex(12788);
    }

    h(f fVar) {
        this.f21688a = fVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        f fVar = this.f21688a;
        com.bytedance.android.live.gift.h hVar = (com.bytedance.android.live.gift.h) obj;
        if (fVar.f21681a != null && fVar.f21681a.getContext() != null && fVar.f21682b != null && cc.a(fVar.f21682b)) {
            View a2 = b.a(R.layout.bea, null);
            ((TextView) a2.findViewById(R.id.fe3)).setText(y.a((int) R.string.e47, u.a().b().a().getDisplayId()));
            ((TextView) a2.findViewById(R.id.aee)).setText(w.a(hVar.f9906a));
            j.a(new h.a(fVar.f21681a).a(a2).a(fVar.f21685e).a(((long) LiveGuideBubbleDurationSetting.INSTANCE.getValue()) * 1000).b());
            c.f18109a = true;
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("gift_guide_bubble_show").a();
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            a3.a("user_id", b2.c()).b();
            if (fVar.f21682b != null) {
                fVar.f21682b.b(i.class, (Object) true);
            }
        }
    }
}
