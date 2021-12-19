package com.bytedance.android.live.publicscreen.impl.widget.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.a.a.a;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.live.publicscreen.impl.model.p;
import com.bytedance.android.live.publicscreen.impl.widget.b.f;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends a<p, f> {
    static {
        Covode.recordClassIndex(6894);
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        Boolean bool;
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        g gVar = this.f12173a;
        if (gVar == null) {
            l.a("publicScreenContext");
        }
        DataChannel dataChannel = gVar.f12208l;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(cp.class)) == null || bool.booleanValue()) {
            i2 = R.layout.b_i;
        } else {
            i2 = R.layout.b_j;
        }
        View a2 = com.a.a(layoutInflater, i2, viewGroup, false);
        l.b(a2, "");
        return new f(a2);
    }
}
