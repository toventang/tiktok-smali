package com.bytedance.android.live.publicscreen.impl.game;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a<MESSAGE extends h> extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(6801);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, ViewGroup viewGroup) {
        super(com.a.a(LayoutInflater.from(viewGroup.getContext()), i2, viewGroup, false));
        l.d(viewGroup, "");
    }
}
