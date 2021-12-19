package com.bytedance.android.live.liveinteract.multilive.anchor.ui.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends a<b, c> {

    /* renamed from: a  reason: collision with root package name */
    private final g f11662a;

    static {
        Covode.recordClassIndex(6351);
    }

    public d(g gVar) {
        l.d(gVar, "");
        this.f11662a = gVar;
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = a.a(layoutInflater, R.layout.bcy, viewGroup, false);
        l.b(a2, "");
        return new c(a2, this.f11662a);
    }
}
