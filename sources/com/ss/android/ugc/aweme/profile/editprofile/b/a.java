package com.ss.android.ugc.aweme.profile.editprofile.b;

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

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f116169a;

    static {
        Covode.recordClassIndex(74934);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(8210);
        LayoutInflater.from(getContext()).inflate(R.layout.ank, this);
        MethodCollector.o(8210);
    }

    public final void setChunkText(String str) {
        l.d(str, "");
        if (this.f116169a == null) {
            this.f116169a = new SparseArray();
        }
        View view = (View) this.f116169a.get(R.id.a63);
        if (view == null) {
            view = findViewById(R.id.a63);
            this.f116169a.put(R.id.a63, view);
        }
        TuxTextView tuxTextView = (TuxTextView) view;
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
