package com.ss.android.ugc.aweme.discover.ui.a.b.b;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f82244a;

    /* renamed from: b  reason: collision with root package name */
    public final View f82245b;

    static {
        Covode.recordClassIndex(51183);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.b36);
        l.b(findViewById, "");
        this.f82244a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.emp);
        l.b(findViewById2, "");
        this.f82245b = findViewById2;
    }
}
