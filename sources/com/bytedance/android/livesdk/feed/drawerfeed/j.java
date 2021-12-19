package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.g.a;
import com.bytedance.android.livesdk.feed.i.ab;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f17404a = new j();

    static {
        Covode.recordClassIndex(9647);
    }

    private j() {
    }

    @Override // com.bytedance.android.live.core.g.a
    public final b a(ViewGroup viewGroup, Object[] objArr) {
        return new ab(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.beq, viewGroup, false));
    }
}
