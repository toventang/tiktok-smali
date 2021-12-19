package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.a.k;
import com.ss.android.ugc.aweme.choosemusic.a.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ad extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public m f70795a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f70796b;

    /* renamed from: c  reason: collision with root package name */
    private View f70797c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f70798d;

    /* renamed from: e  reason: collision with root package name */
    private final k f70799e;

    static {
        Covode.recordClassIndex(43631);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f70800a;

        static {
            Covode.recordClassIndex(43632);
        }

        a(ad adVar) {
            this.f70800a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f70800a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad(Context context, k kVar) {
        super(context);
        l.d(context, "");
        l.d(kVar, "");
        this.f70798d = context;
        this.f70799e = kVar;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.b3i, null, false);
        setContentView(a2);
        View findViewById = a2.findViewById(R.id.egu);
        l.b(findViewById, "");
        this.f70796b = (RecyclerView) findViewById;
        View findViewById2 = a2.findViewById(R.id.tp);
        l.b(findViewById2, "");
        this.f70797c = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(b.c(context, R.color.c9)));
        setFocusable(true);
        setAnimationStyle(R.style.a1f);
        View view = this.f70797c;
        if (view == null) {
            l.a("mBlankView");
        }
        view.setOnClickListener(new a(this));
        RecyclerView recyclerView = this.f70796b;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        m mVar = new m(kVar);
        this.f70795a = mVar;
        mVar.d(false);
        RecyclerView recyclerView2 = this.f70796b;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        m mVar2 = this.f70795a;
        if (mVar2 == null) {
            l.a("mAdapter");
        }
        recyclerView2.setAdapter(mVar2);
    }
}
