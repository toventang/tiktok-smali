package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.g.a;
import com.bytedance.android.livesdk.feed.i.ac;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class i implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f17403a = new i();

    static {
        Covode.recordClassIndex(9646);
    }

    private i() {
    }

    @Override // com.bytedance.android.live.core.g.a
    public final b a(ViewGroup viewGroup, Object[] objArr) {
        return new ac(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ber, viewGroup, false));
    }
}
