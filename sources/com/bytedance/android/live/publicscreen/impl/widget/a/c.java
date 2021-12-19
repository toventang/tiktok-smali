package com.bytedance.android.live.publicscreen.impl.widget.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.a.a.a;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends a<k<? extends com.bytedance.android.livesdk.ac.b.a>, com.bytedance.android.live.publicscreen.impl.widget.b.c<k<? extends com.bytedance.android.livesdk.ac.b.a>>> {
    static {
        Covode.recordClassIndex(6893);
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bdl, viewGroup, false);
        l.b(a2, "");
        return new com.bytedance.android.live.publicscreen.impl.widget.b.c(a2);
    }
}
