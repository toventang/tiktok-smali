package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.f;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;

final /* synthetic */ class bl implements a.AbstractC1744a {

    /* renamed from: a  reason: collision with root package name */
    private final bj f72590a;

    static {
        Covode.recordClassIndex(44722);
    }

    bl(bj bjVar) {
        this.f72590a = bjVar;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.AbstractC1744a
    public final View m() {
        bj bjVar = this.f72590a;
        return ((f) bjVar.f72580b.get(bjVar.f72579a.getCurrentItem())).c();
    }
}
