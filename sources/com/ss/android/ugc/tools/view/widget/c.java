package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.dd;
import com.ss.android.ugc.tools.view.d.a;
import com.zhiliaoapp.musically.R;

public final class c extends FrameLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f150376a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f150377b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f150378c;

    /* renamed from: d  reason: collision with root package name */
    private h f150379d;

    /* renamed from: e  reason: collision with root package name */
    private int f150380e;

    static {
        Covode.recordClassIndex(98910);
    }

    private void a() {
        if (this.f150379d == h.SOLID) {
            b();
        } else {
            c();
        }
    }

    private void b() {
        if (this.f150376a == 0) {
            setBackgroundResource(R.drawable.bmi);
        } else {
            setBackgroundResource(R.drawable.bmh);
        }
        this.f150378c.setTextColor(b.c(getContext(), R.color.a9));
        if (this.f150380e != -1) {
            dd.a(getContext(), this.f150377b, this.f150380e, R.color.a9);
        }
    }

    private void c() {
        if (this.f150376a == 0) {
            setBackgroundResource(R.drawable.bmj);
            this.f150378c.setTextColor(b.c(getContext(), R.color.bx));
            if (this.f150380e != -1) {
                dd.a(getContext(), this.f150377b, this.f150380e, R.color.bx);
                return;
            }
            return;
        }
        setBackgroundResource(R.drawable.bmf);
        this.f150378c.setTextColor(b.c(getContext(), R.color.a_));
        if (this.f150380e != -1) {
            dd.a(getContext(), this.f150377b, this.f150380e, R.color.a_);
        }
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.tools.view.d.a
    public final void a(int i2) {
        if (this.f150376a != i2) {
            this.f150376a = i2;
            a();
        }
    }

    private c(Context context, byte b2) {
        this(context, (char) 0);
    }

    private c(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(11561);
        this.f150376a = g.a().E().a();
        this.f150379d = h.SOLID;
        this.f150380e = -1;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b4g, this, true);
        this.f150377b = (ImageView) a2.findViewById(R.id.by0);
        this.f150378c = (TextView) a2.findViewById(R.id.f9a);
        a();
        MethodCollector.o(11561);
    }

    public final void a(h hVar, int i2, String str) {
        this.f150380e = i2;
        if (hVar == h.BORDER) {
            c();
        } else {
            b();
        }
        this.f150378c.setText(str);
    }
}
