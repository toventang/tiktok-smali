package com.bytedance.tux.table.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f45403a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f45404b;

    static {
        Covode.recordClassIndex(27645);
    }

    public final View a(int i2) {
        if (this.f45404b == null) {
            this.f45404b = new HashMap();
        }
        View view = (View) this.f45404b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f45404b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final View getCustomView$tux_release() {
        return this.f45403a;
    }

    public final TuxTextView getLabelTv$tux_release() {
        return (TuxTextView) a(R.id.c48);
    }

    public final CharSequence getLabel() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.c48);
        l.a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    public final boolean getWithIcon$tux_release() {
        TuxIconView tuxIconView = (TuxIconView) a(R.id.icon_iv);
        l.a((Object) tuxIconView, "");
        if (tuxIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void setCustomView$tux_release(View view) {
        this.f45403a = view;
    }

    public final void setFont(int i2) {
        ((TuxTextView) a(R.id.c48)).setTuxFont(i2);
    }

    public final void setIconColor(int i2) {
        ((TuxIconView) a(R.id.icon_iv)).setTintColor(i2);
    }

    public final void setIconRes(int i2) {
        ((TuxIconView) a(R.id.icon_iv)).setIconRes(i2);
    }

    public final void setTextColor(int i2) {
        ((TuxTextView) a(R.id.c48)).setTextColor(i2);
    }

    public final void setLabel(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.c48);
        l.a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, R.attr.cc);
        l.c(context, "");
        MethodCollector.i(6810);
        com.a.a(LayoutInflater.from(context), R.layout.w, this, true);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.c48);
        tuxTextView.setMaxLines(1);
        tuxTextView.setSingleLine();
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        MethodCollector.o(6810);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
