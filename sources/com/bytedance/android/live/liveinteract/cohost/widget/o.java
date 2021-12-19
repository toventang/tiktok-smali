package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout;
import com.bytedance.android.live.liveinteract.match.b.d.a;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

final /* synthetic */ class o implements b.AbstractC0253b {

    /* renamed from: a  reason: collision with root package name */
    private final a f10489a;

    static {
        Covode.recordClassIndex(5576);
    }

    o(a aVar) {
        this.f10489a = aVar;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
    public final void a(View view, Object obj) {
        LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (linkCrossTitleLayout != null) {
            ViewGroup.LayoutParams layoutParams = linkCrossTitleLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            if (booleanValue) {
                aVar.f2052i = R.id.dca;
                aVar.f2051h = -1;
            } else {
                aVar.f2052i = -1;
                aVar.f2051h = R.id.ae6;
            }
            linkCrossTitleLayout.setLayoutParams(aVar);
        }
    }
}
