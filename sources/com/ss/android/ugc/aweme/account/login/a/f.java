package com.ss.android.ugc.aweme.account.login.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ai.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f63263a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f63264b;

    /* renamed from: c  reason: collision with root package name */
    final TextView f63265c;

    /* renamed from: d  reason: collision with root package name */
    final float f63266d;

    /* renamed from: e  reason: collision with root package name */
    public final View f63267e;

    static {
        Covode.recordClassIndex(38993);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        l.d(view, "");
        this.f63267e = view;
        View findViewById = view.findViewById(R.id.bi7);
        l.b(findViewById, "");
        this.f63263a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.ad7);
        l.b(findViewById2, "");
        this.f63264b = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.a4p);
        l.b(findViewById3, "");
        this.f63265c = (TextView) findViewById3;
        this.f63266d = ((float) n.a(view.getContext())) - n.b(view.getContext(), 60.0f);
        view.setOnTouchListener(new a(0.5f));
    }
}
