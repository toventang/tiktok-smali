package com.ss.android.ugc.aweme.bullet.views;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import h.f.b.l;

public final class b extends DmtStatusView implements k {
    static {
        Covode.recordClassIndex(42904);
    }

    @Override // com.bytedance.ies.bullet.service.base.k
    public final void a() {
        f();
    }

    @Override // com.bytedance.ies.bullet.service.base.k
    public final void b() {
        d();
    }

    @Override // com.bytedance.ies.bullet.service.base.k
    public final View getView() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        setBuilder(DmtStatusView.a.a(context));
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
