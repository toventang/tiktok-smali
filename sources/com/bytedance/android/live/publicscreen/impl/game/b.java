package com.bytedance.android.live.publicscreen.impl.game;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends a<com.bytedance.android.live.publicscreen.impl.model.chat.b> {

    /* renamed from: a  reason: collision with root package name */
    TextView f12381a;

    /* renamed from: b  reason: collision with root package name */
    TextView f12382b;

    /* renamed from: c  reason: collision with root package name */
    HSImageView f12383c;

    static {
        Covode.recordClassIndex(6802);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup) {
        super(R.layout.b_s, viewGroup);
        l.d(viewGroup, "");
        View findViewById = this.itemView.findViewById(R.id.a4w);
        l.b(findViewById, "");
        this.f12381a = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.fdm);
        l.b(findViewById2, "");
        this.f12382b = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.fcu);
        l.b(findViewById3, "");
        this.f12383c = (HSImageView) findViewById3;
    }
}
