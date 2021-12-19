package com.ss.android.ugc.aweme.ecommerce.address.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class InputResultIndicator extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84577a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private View f84578b;

    /* renamed from: c  reason: collision with root package name */
    private View f84579c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f84580d;

    /* renamed from: e  reason: collision with root package name */
    private int f84581e;

    /* renamed from: f  reason: collision with root package name */
    private int f84582f;

    /* renamed from: g  reason: collision with root package name */
    private int f84583g;

    /* renamed from: h  reason: collision with root package name */
    private int f84584h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f84585i;

    static {
        Covode.recordClassIndex(52799);
    }

    public InputResultIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52800);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        this.f84578b.setBackgroundColor(this.f84582f);
        this.f84579c.setVisibility(8);
    }

    public final void a(String str) {
        l.d(str, "");
        boolean z = this.f84585i;
        l.d(str, "");
        if (z) {
            this.f84578b.setVisibility(0);
            this.f84578b.setBackgroundColor(this.f84583g);
        } else {
            this.f84578b.setVisibility(8);
        }
        if (str.length() > 0) {
            this.f84579c.setVisibility(0);
            this.f84580d.setText(str);
        }
    }

    private /* synthetic */ InputResultIndicator(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputResultIndicator(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        int i2 = 0;
        MethodCollector.i(5331);
        this.f84585i = true;
        this.f84581e = n.a(0.5d);
        this.f84582f = b.c(context, R.color.b0);
        this.f84583g = b.c(context, R.color.bd);
        this.f84584h = b.c(context, R.color.bd);
        this.f84585i = true;
        View.inflate(context, R.layout.op, this);
        View findViewById = findViewById(R.id.dmc);
        l.b(findViewById, "");
        this.f84578b = findViewById;
        View findViewById2 = findViewById(R.id.dma);
        l.b(findViewById2, "");
        this.f84579c = findViewById2;
        View findViewById3 = findViewById(R.id.dmd);
        l.b(findViewById3, "");
        this.f84580d = (TextView) findViewById3;
        com.ss.android.ugc.aweme.ecommerce.util.n.a(this.f84578b, this.f84581e);
        this.f84580d.setTextColor(this.f84584h);
        this.f84578b.setVisibility(!this.f84585i ? 8 : i2);
        a();
        MethodCollector.o(5331);
    }
}
