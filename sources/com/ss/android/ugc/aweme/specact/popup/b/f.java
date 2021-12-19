package com.ss.android.ugc.aweme.specact.popup.b;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.specact.popup.b.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends ArrayAdapter<e.C3497e> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134544a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f134545b = R.layout.b1d;

    static {
        Covode.recordClassIndex(87922);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87923);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, e.C3497e[] eVarArr) {
        super(context, (int) R.layout.b1d, eVarArr);
        l.d(context, "");
        l.d(eVarArr, "");
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(getContext()), this.f134545b, viewGroup, false);
        e.C3497e eVar = (e.C3497e) getItem(i2);
        if (eVar == null) {
            l.b(a2, "");
            return a2;
        }
        l.b(eVar, "");
        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.c3t);
        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.fes);
        View findViewById = a2.findViewById(R.id.cal);
        l.b(tuxTextView, "");
        tuxTextView.setText(eVar.f134541a);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(eVar.f134542b);
        if (i2 == getCount() - 1) {
            l.b(findViewById, "");
            findViewById.setVisibility(4);
        }
        if (eVar.f134543c) {
            tuxTextView.setTuxFont(63);
            tuxTextView2.setTuxFont(63);
            tuxTextView.setTypeface(Typeface.defaultFromStyle(1));
            tuxTextView2.setTypeface(Typeface.defaultFromStyle(1));
            tuxTextView.setTextSize(15.0f);
            tuxTextView2.setTextSize(15.0f);
        }
        l.b(a2, "");
        return a2;
    }
}
