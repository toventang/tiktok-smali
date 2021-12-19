package com.ss.android.ugc.aweme.kids.homepage.bottomview.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f106557b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f106558c;

    /* renamed from: d  reason: collision with root package name */
    private final int f106559d;

    /* renamed from: e  reason: collision with root package name */
    private final int f106560e;

    /* renamed from: f  reason: collision with root package name */
    private final int f106561f;

    /* renamed from: g  reason: collision with root package name */
    private final int f106562g;

    static {
        Covode.recordClassIndex(68088);
    }

    @Override // com.ss.android.ugc.aweme.kids.homepage.bottomview.a.a
    public final void a() {
    }

    public final int getDefaultDarkRes() {
        return this.f106559d;
    }

    public final int getDefaultLightRes() {
        return this.f106560e;
    }

    public final int getSelectedLightRes() {
        return this.f106562g;
    }

    public final int getSelectedRes() {
        return this.f106561f;
    }

    @Override // com.ss.android.ugc.aweme.kids.homepage.bottomview.a.a
    public final void a(boolean z) {
        if (isSelected()) {
            if (z) {
                this.f106557b.setImageDrawable(b.a(getContext(), this.f106562g));
                this.f106558c.setTextColor(b.c(getContext(), R.color.a9));
                return;
            }
            this.f106557b.setImageDrawable(b.a(getContext(), this.f106561f));
            this.f106558c.setTextColor(b.c(getContext(), R.color.bx));
        } else if (z) {
            this.f106557b.setImageDrawable(b.a(getContext(), this.f106559d));
            this.f106558c.setTextColor(b.c(getContext(), R.color.aa));
        } else {
            this.f106557b.setImageDrawable(b.a(getContext(), this.f106560e));
            this.f106558c.setTextColor(b.c(getContext(), R.color.c6));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, String str, int i2, int i3, int i4, int i5) {
        super(context);
        l.d(context, "");
        l.d(str, "");
        MethodCollector.i(11728);
        this.f106559d = i2;
        this.f106560e = i3;
        this.f106561f = i4;
        this.f106562g = i5;
        View.inflate(context, R.layout.adc, this);
        View findViewById = findViewById(R.id.bgn);
        l.b(findViewById, "");
        this.f106557b = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.bgo);
        l.b(findViewById2, "");
        this.f106558c = (TextView) findViewById2;
        this.f106557b.setImageDrawable(b.a(context, i2));
        this.f106558c.setText(str);
        setBackgroundResource(R.drawable.axm);
        MethodCollector.o(11728);
    }
}
