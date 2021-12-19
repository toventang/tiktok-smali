package com.ss.android.ugc.aweme.ecommerce.review.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final TextView f87113a;

    /* renamed from: b  reason: collision with root package name */
    final TextView f87114b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f87115c;

    /* renamed from: d  reason: collision with root package name */
    private final View f87116d;

    static {
        Covode.recordClassIndex(54647);
    }

    public final TextView getPre() {
        return this.f87113a;
    }

    public final View getStar() {
        return this.f87116d;
    }

    public final TextView getSuf() {
        return this.f87114b;
    }

    public final void a() {
        this.f87115c = false;
        setBackgroundResource(R.drawable.zh);
        this.f87113a.setTextColor(b.c(getContext(), R.color.bx));
        this.f87114b.setTextColor(b.c(getContext(), R.color.bx));
    }

    public final void setActive(boolean z) {
        this.f87115c = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(3853);
        a.a(LayoutInflater.from(context), R.layout.qm, this, true);
        setBackgroundResource(R.drawable.zh);
        this.f87113a = (TextView) findViewById(R.id.d83);
        this.f87114b = (TextView) findViewById(R.id.eek);
        this.f87116d = findViewById(R.id.e99);
        MethodCollector.o(3853);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
