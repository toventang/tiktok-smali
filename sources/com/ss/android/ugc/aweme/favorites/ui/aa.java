package com.ss.android.ugc.aweme.favorites.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class aa implements DmtTabLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private final y f90817a;

    static {
        Covode.recordClassIndex(57065);
    }

    aa(y yVar) {
        this.f90817a = yVar;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
    public final void a(DmtTabLayout.f fVar) {
        this.f90817a.o = true;
        fVar.a();
        fVar.f33756i.findViewById(R.id.cat).setVisibility(8);
    }
}
