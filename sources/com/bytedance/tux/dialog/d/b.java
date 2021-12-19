package com.bytedance.tux.dialog.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f44851a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f44852b;

    static {
        Covode.recordClassIndex(27386);
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        boolean z;
        MethodCollector.i(8306);
        View inflate = LayoutInflater.from(this.f44902f).inflate(R.layout.f160000i, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.title_tv);
        TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.aei);
        tuxTextView.setTextColor(this.f44900d.f44911i);
        CharSequence charSequence = this.f44851a;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            l.a((Object) tuxTextView, "");
            tuxTextView.setVisibility(8);
            CharSequence charSequence2 = this.f44852b;
            if (charSequence2 == null || charSequence2.length() == 0) {
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setTuxFont(this.f44900d.f44906d);
                tuxTextView2.setTextColor(this.f44900d.f44911i);
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setText(this.f44852b);
                if (!(this.f44852b instanceof String)) {
                    tuxTextView2.setMovementMethod(com.bytedance.tux.f.b.f45048a);
                }
            }
        } else {
            tuxTextView.setTuxFont(this.f44900d.f44904b);
            l.a((Object) tuxTextView, "");
            tuxTextView.setText(this.f44851a);
            if (!(this.f44851a instanceof String)) {
                tuxTextView.setMovementMethod(com.bytedance.tux.f.b.f45048a);
            }
            CharSequence charSequence3 = this.f44852b;
            if (charSequence3 == null || charSequence3.length() == 0) {
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setTuxFont(this.f44900d.f44905c);
                tuxTextView2.setTextColor(this.f44900d.f44912j);
                l.a((Object) tuxTextView2, "");
                tuxTextView2.setText(this.f44852b);
                if (!(this.f44852b instanceof String)) {
                    tuxTextView2.setMovementMethod(com.bytedance.tux.f.b.f45048a);
                }
            }
        }
        l.a((Object) inflate, "");
        MethodCollector.o(8306);
        return inflate;
    }

    @Override // com.bytedance.tux.dialog.d.c
    public final void a(CharSequence charSequence) {
        this.f44851a = charSequence;
    }

    @Override // com.bytedance.tux.dialog.d.c
    public final void b(CharSequence charSequence) {
        this.f44852b = charSequence;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.c(context, "");
    }
}
