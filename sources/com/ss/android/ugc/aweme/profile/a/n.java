package com.ss.android.ugc.aweme.profile.a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.f.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class n extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f115870a;

    /* renamed from: b  reason: collision with root package name */
    public final e f115871b;

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f115872c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f115873d;

    static {
        Covode.recordClassIndex(74737);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(View view, e eVar) {
        super(view);
        l.d(view, "");
        l.d(eVar, "");
        this.f115871b = eVar;
        View findViewById = view.findViewById(R.id.bs8);
        l.b(findViewById, "");
        this.f115872c = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.a2p);
        l.b(findViewById2, "");
        this.f115870a = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.acf);
        l.b(findViewById3, "");
        this.f115873d = (TextView) findViewById3;
        o.f116432b = true;
    }
}
