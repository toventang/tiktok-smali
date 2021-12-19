package com.bytedance.android.livesdk.chatroom.ui;

import android.util.SparseBooleanArray;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class ay implements f {

    /* renamed from: a  reason: collision with root package name */
    private final at f15919a;

    static {
        Covode.recordClassIndex(8803);
    }

    ay(at atVar) {
        this.f15919a = atVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        at atVar = this.f15919a;
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f17192a;
        boolean z = gVar.f17194c;
        sparseBooleanArray.get(0);
        boolean z2 = sparseBooleanArray.get(2);
        View findViewById = atVar.H.findViewById(R.id.ene);
        View findViewById2 = atVar.H.findViewById(R.id.ffh);
        if (findViewById != null && findViewById2 != null) {
            e.a(atVar.getContext(), findViewById, !z2, z);
        }
    }
}
