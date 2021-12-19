package com.ss.android.ugc.aweme.i18n.musically.cut;

import c.d.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.i18n.musically.cut.n;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.tools.utils.h;

final /* synthetic */ class u implements n.a {

    /* renamed from: a  reason: collision with root package name */
    private final t f99931a;

    static {
        Covode.recordClassIndex(63687);
    }

    u(t tVar) {
        this.f99931a = tVar;
    }

    @Override // com.ss.android.ugc.aweme.i18n.musically.cut.n.a
    public final void a(MediaModel mediaModel) {
        t tVar = this.f99931a;
        if (tVar.f99920i == null) {
            return;
        }
        if (!h.f149997b || !h.b(mediaModel.f109390b)) {
            tVar.f99920i.onData(mediaModel.f109390b);
        } else {
            tVar.f99920i.onData(a.a(tVar.getContext(), h.d(mediaModel.f109390b)));
        }
    }
}
