package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.b.a.e;
import com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i implements com.ss.android.ugc.aweme.tools.beauty.b.c.b {

    /* renamed from: a  reason: collision with root package name */
    public final BeautySwitchView f139084a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f139085b;

    /* renamed from: c  reason: collision with root package name */
    public final View f139086c;

    /* renamed from: d  reason: collision with root package name */
    public final e f139087d;

    /* renamed from: e  reason: collision with root package name */
    public final b f139088e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f139089f;

    static {
        Covode.recordClassIndex(90965);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.b
    public final boolean d() {
        return this.f139087d.f138903m;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.b
    public final boolean c() {
        BeautySwitchView beautySwitchView = this.f139084a;
        l.b(beautySwitchView, "");
        return beautySwitchView.f139189b;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.b
    public final void b() {
        if (this.f139087d.f138903m) {
            BeautySwitchView beautySwitchView = this.f139084a;
            l.b(beautySwitchView, "");
            if (!beautySwitchView.f139189b) {
                BeautySwitchView beautySwitchView2 = this.f139084a;
                l.b(beautySwitchView2, "");
                beautySwitchView2.setChecked(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.b
    public final void e() {
        if (this.f139087d.f138903m && !c()) {
            BeautySwitchView beautySwitchView = this.f139084a;
            l.b(beautySwitchView, "");
            beautySwitchView.setChecked(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.b
    public final void a() {
        e eVar = this.f139087d;
        l.d(eVar, "");
        if (eVar.f138903m) {
            this.f139084a.setEnableTouch(false);
            BeautySwitchView beautySwitchView = this.f139084a;
            l.b(beautySwitchView, "");
            beautySwitchView.setChecked(this.f139088e.f139045a.q());
            b bVar = this.f139088e;
            BeautySwitchView beautySwitchView2 = this.f139084a;
            l.b(beautySwitchView2, "");
            bVar.a(beautySwitchView2.f139189b);
            this.f139084a.setOnCheckedChangeListener(new a(this));
            this.f139089f.setOnClickListener(new b(this));
            this.f139088e.f139049e.a();
            ViewGroup viewGroup = this.f139089f;
            l.b(viewGroup, "");
            viewGroup.setVisibility(0);
            return;
        }
        BeautySwitchView beautySwitchView3 = this.f139084a;
        l.b(beautySwitchView3, "");
        beautySwitchView3.setChecked(true);
        ViewGroup viewGroup2 = this.f139089f;
        l.b(viewGroup2, "");
        viewGroup2.setVisibility(8);
    }

    static final class a implements BeautySwitchView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f139090a;

        static {
            Covode.recordClassIndex(90966);
        }

        a(i iVar) {
            this.f139090a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.views.BeautySwitchView.a
        public final void a(boolean z) {
            this.f139090a.f139088e.a(z);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f139091a;

        static {
            Covode.recordClassIndex(90967);
        }

        b(i iVar) {
            this.f139091a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BeautySwitchView beautySwitchView = this.f139091a.f139084a;
            l.b(beautySwitchView, "");
            BeautySwitchView beautySwitchView2 = this.f139091a.f139084a;
            l.b(beautySwitchView2, "");
            beautySwitchView.setChecked(!beautySwitchView2.f139189b);
            b bVar = this.f139091a.f139088e;
            BeautySwitchView beautySwitchView3 = this.f139091a.f139084a;
            l.b(beautySwitchView3, "");
            boolean z = beautySwitchView3.f139189b;
            com.ss.android.ugc.aweme.tools.beauty.service.b bVar2 = bVar.f139047c.f139043a;
            if (bVar2 != null) {
                bVar2.a(z);
            }
        }
    }

    public i(Context context, View view, e eVar, b bVar) {
        l.d(context, "");
        l.d(view, "");
        l.d(eVar, "");
        l.d(bVar, "");
        this.f139085b = context;
        this.f139086c = view;
        this.f139087d = eVar;
        this.f139088e = bVar;
        this.f139089f = (ViewGroup) view.findViewById(R.id.b4t);
        this.f139084a = (BeautySwitchView) view.findViewById(R.id.b34);
    }
}
