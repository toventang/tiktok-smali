package com.ss.android.ugc.aweme.friends.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class q extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(61423);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(ViewGroup viewGroup) {
        super(a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2k, viewGroup, false));
        l.d(viewGroup, "");
    }

    public final void a(int i2) {
        View view = this.itemView;
        l.b(view, "");
        ((TuxTextView) view.findViewById(R.id.f9l)).setText(i2);
    }
}
