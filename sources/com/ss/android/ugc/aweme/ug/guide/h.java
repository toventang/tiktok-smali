package com.ss.android.ugc.aweme.ug.guide;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.experiment.gl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.ug.guide.a.a;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final al f141932a;

    static {
        Covode.recordClassIndex(92738);
    }

    public h(al alVar) {
        l.d(alVar, "");
        this.f141932a = alVar;
    }

    public final boolean a(Activity activity, Aweme aweme) {
        l.d(activity, "");
        if (b.a().a(true, "interction_share_button_whatsapp_style", 0) == 0 && !a.C3776a.a(activity) && !com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) && g.d(aweme) && !gl.a()) {
            return this.f141932a.E();
        }
        return false;
    }
}
