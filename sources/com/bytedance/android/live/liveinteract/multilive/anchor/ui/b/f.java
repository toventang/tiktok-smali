package com.bytedance.android.live.liveinteract.multilive.anchor.ui.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends a<e, j> {

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f11663a;

    /* renamed from: b  reason: collision with root package name */
    public final h f11664b;

    static {
        Covode.recordClassIndex(6353);
    }

    public f(DataChannel dataChannel, h hVar) {
        this.f11663a = dataChannel;
        this.f11664b = hVar;
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = a.a(layoutInflater, R.layout.bd0, viewGroup, false);
        l.b(a2, "");
        return new j(a2, this.f11663a, this.f11664b);
    }
}
