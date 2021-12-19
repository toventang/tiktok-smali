package com.bytedance.android.live.publicscreen.impl.game;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.impl.model.e;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends a<e> {

    /* renamed from: a  reason: collision with root package name */
    TextView f12384a;

    static {
        Covode.recordClassIndex(6804);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ViewGroup viewGroup) {
        super(R.layout.b_u, viewGroup);
        l.d(viewGroup, "");
        View findViewById = this.itemView.findViewById(R.id.bbd);
        l.b(findViewById, "");
        this.f12384a = (TextView) findViewById;
    }
}
