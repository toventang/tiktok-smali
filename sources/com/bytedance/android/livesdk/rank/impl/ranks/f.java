package com.bytedance.android.livesdk.rank.impl.ranks;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final RankEntranceWidget f20912a;

    static {
        Covode.recordClassIndex(12382);
    }

    f(RankEntranceWidget rankEntranceWidget) {
        this.f20912a = rankEntranceWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        RankEntranceWidget rankEntranceWidget = this.f20912a;
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f17192a;
        boolean z = false;
        boolean z2 = sparseBooleanArray.get(0);
        boolean z3 = sparseBooleanArray.get(2);
        boolean z4 = gVar.f17194c;
        Context context = rankEntranceWidget.context;
        View view = rankEntranceWidget.getView();
        if (!z2 && !z3) {
            z = true;
        }
        e.a(context, view, z, z4);
    }
}
