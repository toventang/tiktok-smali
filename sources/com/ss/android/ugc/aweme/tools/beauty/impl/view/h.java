package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.da.b;
import com.ss.android.ugc.aweme.tools.beauty.b.a.e;
import com.ss.android.ugc.aweme.tools.beauty.b.c.a;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautyStyleFrameLayout;
import com.ss.android.ugc.aweme.tools.beauty.views.c;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h extends FrameLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    private View f139075a;

    /* renamed from: b  reason: collision with root package name */
    private final View f139076b;

    /* renamed from: c  reason: collision with root package name */
    private final BeautyStyleFrameLayout f139077c;

    /* renamed from: d  reason: collision with root package name */
    private c f139078d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnClickListener f139079e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f139080f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f139081g;

    /* renamed from: h  reason: collision with root package name */
    private e f139082h;

    /* renamed from: i  reason: collision with root package name */
    private h.f.a.a<? extends View> f139083i;

    static {
        Covode.recordClassIndex(90964);
    }

    public final ViewGroup getContainer() {
        return this.f139080f;
    }

    public final ViewGroup getParent() {
        return this.f139081g;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.a
    public final View getRoot() {
        return this.f139075a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.a<? extends android.view.View>, h.f.a.a<android.view.View> */
    public final h.f.a.a<View> getRootProvider() {
        return this.f139083i;
    }

    public final e getViewConfig() {
        return this.f139082h;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.a
    public final void b() {
        c cVar = this.f139078d;
        if (cVar != null) {
            cVar.b(new b());
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.a
    public final void a() {
        c cVar = this.f139078d;
        if (cVar != null) {
            cVar.f139275c = this.f139082h.f138898h;
        }
        c cVar2 = this.f139078d;
        if (cVar2 != null) {
            cVar2.a(new b());
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.a
    public final void c() {
        BeautyStyleFrameLayout beautyStyleFrameLayout = this.f139077c;
        Context context = getContext();
        l.b(context, "");
        beautyStyleFrameLayout.a(r.a(context, this.f139082h.f138858b.f138836a));
    }

    public final void setRootProvider(h.f.a.a<? extends View> aVar) {
        this.f139083i = aVar;
    }

    public final void setRoot(View view) {
        l.d(view, "");
        this.f139075a = view;
    }

    public final void setViewConfig(e eVar) {
        l.d(eVar, "");
        this.f139082h = eVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.a
    public final void setContainer(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        this.f139080f = viewGroup;
        this.f139078d = new c(this.f139080f, this, getRoot());
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.a
    public final void setDismissViewClickListener(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        this.f139079e = onClickListener;
        if (this.f139082h.f138899i) {
            this.f139076b.setOnClickListener(this.f139079e);
            return;
        }
        View view = this.f139076b;
        l.b(view, "");
        view.setClickable(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private h(Context context, ViewGroup viewGroup, e eVar) {
        super(context);
        l.d(context, "");
        l.d(viewGroup, "");
        l.d(eVar, "");
        MethodCollector.i(11309);
        this.f139081g = viewGroup;
        this.f139082h = eVar;
        this.f139083i = null;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.ej, this, true);
        l.b(a2, "");
        this.f139075a = a2;
        this.f139076b = getRoot().findViewById(R.id.fe8);
        this.f139077c = (BeautyStyleFrameLayout) getRoot().findViewById(R.id.b4u);
        this.f139080f = viewGroup;
        MethodCollector.o(11309);
    }

    public /* synthetic */ h(Context context, ViewGroup viewGroup, e eVar, byte b2) {
        this(context, viewGroup, eVar);
    }
}
