package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.g.a;
import com.bytedance.android.livesdk.feed.a.o;
import com.bytedance.android.livesdk.feed.i.m;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class k implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f17405a = new k();

    static {
        Covode.recordClassIndex(9648);
    }

    private k() {
    }

    @Override // com.bytedance.android.live.core.g.a
    public final b a(ViewGroup viewGroup, Object[] objArr) {
        return new m(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_r, viewGroup, false), (objArr.length <= 0 || !(objArr[0] instanceof o)) ? null : ((o) objArr[0]).b());
    }
}
