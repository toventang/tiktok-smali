package com.ss.android.ugc.aweme.social.widget.card.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.view.b;
import h.f.b.l;
import h.g.a;

public final class MAFDialogController$maxHeightLayoutManager$2$1 extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b.f f133951a;

    static {
        Covode.recordClassIndex(87638);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MAFDialogController$maxHeightLayoutManager$2$1(b.f fVar) {
        this.f133951a = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void a(Rect rect, int i2, int i3) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        super.a(rect, i2, View.MeasureSpec.makeMeasureSpec(a.a(TypedValue.applyDimension(1, 272.0f, system.getDisplayMetrics())), Integer.MIN_VALUE));
    }
}
