package com.bytedance.android.live.publicscreen.impl.widget.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.a.a.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends a<com.bytedance.android.live.publicscreen.impl.model.chat.a<? extends com.bytedance.android.livesdk.ac.b.a>, com.bytedance.android.live.publicscreen.impl.widget.b.b> {
    static {
        Covode.recordClassIndex(6892);
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bdk, viewGroup, false);
        l.b(a2, "");
        return new com.bytedance.android.live.publicscreen.impl.widget.b.b(a2);
    }
}
