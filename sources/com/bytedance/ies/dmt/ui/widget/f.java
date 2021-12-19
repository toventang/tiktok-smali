package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.titlebar.b.a;
import com.zhiliaoapp.musically.R;

public final class f extends FrameLayout implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f33664a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f33665b;

    /* renamed from: c  reason: collision with root package name */
    private DmtTextView f33666c;

    /* renamed from: d  reason: collision with root package name */
    private a f33667d;

    /* renamed from: e  reason: collision with root package name */
    private int f33668e;

    static {
        Covode.recordClassIndex(20032);
    }

    private void a() {
        if (this.f33667d == a.SOLID) {
            b();
        } else {
            c();
        }
    }

    public final String getTextString() {
        DmtTextView dmtTextView = this.f33666c;
        if (dmtTextView == null || dmtTextView.getText() == null) {
            return "";
        }
        return this.f33666c.getText().toString();
    }

    private void b() {
        if (this.f33664a == 0) {
            setBackgroundResource(R.drawable.cbm);
        } else {
            setBackgroundResource(R.drawable.cbl);
        }
        this.f33666c.setTextColor(b.c(getContext(), R.color.a9));
        if (this.f33668e != -1) {
            a.a(getContext(), this.f33665b, this.f33668e, R.color.a9);
        }
    }

    private void c() {
        if (this.f33664a == 0) {
            setBackgroundResource(R.drawable.cbk);
            this.f33666c.setTextColor(b.c(getContext(), R.color.bx));
            if (this.f33668e != -1) {
                a.a(getContext(), this.f33665b, this.f33668e, R.color.bx);
                return;
            }
            return;
        }
        setBackgroundResource(R.drawable.cbi);
        this.f33666c.setTextColor(b.c(getContext(), R.color.a_));
        if (this.f33668e != -1) {
            a.a(getContext(), this.f33665b, this.f33668e, R.color.a_);
        }
    }

    public f(Context context) {
        this(context, (byte) 0);
    }

    public final void setFontType(String str) {
        this.f33666c.setFontType(str);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
        if (this.f33664a != i2) {
            this.f33664a = i2;
            a();
        }
    }

    private f(Context context, byte b2) {
        this(context, (char) 0);
    }

    private f(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(8650);
        this.f33664a = b.a.f33348a.f33347a;
        this.f33667d = a.SOLID;
        this.f33668e = -1;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.ag0, this, true);
        this.f33665b = (ImageView) a2.findViewById(R.id.by0);
        this.f33666c = (DmtTextView) a2.findViewById(R.id.f9a);
        a();
        MethodCollector.o(8650);
    }

    public final void a(a aVar, int i2, String str) {
        this.f33668e = i2;
        if (aVar == a.BORDER) {
            c();
        } else {
            b();
        }
        this.f33666c.setText(str);
    }
}
