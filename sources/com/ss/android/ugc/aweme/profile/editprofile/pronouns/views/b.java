package com.ss.android.ugc.aweme.profile.editprofile.pronouns.views;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f116249a;

    static {
        Covode.recordClassIndex(75039);
    }

    private View a() {
        if (this.f116249a == null) {
            this.f116249a = new SparseArray();
        }
        View view = (View) this.f116249a.get(R.id.dcr);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.dcr);
        this.f116249a.put(R.id.dcr, findViewById);
        return findViewById;
    }

    public final void a(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a();
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(9199);
        LayoutInflater.from(getContext()).inflate(R.layout.aqb, this);
        MethodCollector.o(9199);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
