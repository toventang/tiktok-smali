package com.bytedance.tux.status.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.c.e;
import com.bytedance.tux.c.f;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class TuxLoadingHUD extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f45383a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f45384b;

    static {
        Covode.recordClassIndex(27634);
    }

    public TuxLoadingHUD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private View b(int i2) {
        if (this.f45384b == null) {
            this.f45384b = new HashMap();
        }
        View view = (View) this.f45384b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f45384b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (this.f45383a) {
            a(i2);
        }
    }

    private final void a(int i2) {
        if (i2 == 0) {
            ((TuxDualBallView) b(R.id.chl)).b();
        } else {
            ((TuxDualBallView) b(R.id.chl)).c();
        }
    }

    public final void setMessage(int i2) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.message_tv);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(getResources().getString(i2));
    }

    public final void setMessage(String str) {
        TuxTextView tuxTextView = (TuxTextView) b(R.id.message_tv);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(str);
    }

    private /* synthetic */ TuxLoadingHUD(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxLoadingHUD(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.bw);
        l.c(context, "");
        MethodCollector.i(7264);
        this.f45383a = true;
        View.inflate(context, R.layout.n, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.du, R.attr.dv, R.attr.dw, R.attr.dx, R.attr.aq0}, R.attr.bw, 0);
        l.a((Object) obtainStyledAttributes, "");
        String string = obtainStyledAttributes.getString(4);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        final int color2 = obtainStyledAttributes.getColor(0, 0);
        final float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
        ((TuxTextView) b(R.id.message_tv)).setTuxFont(i2);
        ((TuxTextView) b(R.id.message_tv)).setTextColor(color);
        setMessage(string);
        LinearLayout linearLayout = (LinearLayout) b(R.id.cll);
        l.a((Object) linearLayout, "");
        linearLayout.setBackground(f.a(new b<e, z>() {
            /* class com.bytedance.tux.status.loading.TuxLoadingHUD.AnonymousClass1 */

            static {
                Covode.recordClassIndex(27635);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(e eVar) {
                e eVar2 = eVar;
                l.c(eVar2, "");
                eVar2.f44775a = Integer.valueOf(color2);
                eVar2.f44777c = Float.valueOf(dimension);
                return z.f158842a;
            }
        }).a(context));
        a(getVisibility());
        MethodCollector.o(7264);
    }
}
