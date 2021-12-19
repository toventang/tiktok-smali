package com.ss.android.ugc.gamora.editor.lightening.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;

public final class c extends j implements com.bytedance.o.a {

    /* renamed from: g  reason: collision with root package name */
    public static final b f146037g = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f146038a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f146039b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f146040c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f146041d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f146042e = true;

    /* renamed from: f  reason: collision with root package name */
    public final d f146043f;

    /* renamed from: h  reason: collision with root package name */
    private TextView f146044h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f146045i;

    /* renamed from: j  reason: collision with root package name */
    private final h f146046j = i.a(m.NONE, new a(this));

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.o.f f146047k;

    static {
        Covode.recordClassIndex(95979);
    }

    public final com.ss.android.ugc.aweme.shortvideo.preview.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f146046j.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(95981);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f146047k;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.preview.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(95980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.preview.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.preview.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.preview.a> r1 = com.ss.android.ugc.aweme.shortvideo.preview.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.lightening.a.c.a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.c$c  reason: collision with other inner class name */
    public static final class C3898c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146048a;

        static {
            Covode.recordClassIndex(95982);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3898c(c cVar) {
            super(600);
            this.f146048a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            if (this.f146048a.f146042e) {
                this.f146048a.a().L();
                q.a("VEVideoPublishEditActivity nextStep OnClick");
                h.f.a.a<z> aVar = this.f146048a.f146043f.f146058e;
                if (aVar == null) {
                    l.a("next");
                }
                aVar.invoke();
            }
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f146049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f146050b;

        static {
            Covode.recordClassIndex(95983);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(600);
            this.f146050b = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            if (!this.f146049a) {
                this.f146050b.a().L();
                this.f146049a = true;
            }
            h.f.a.a<z> aVar = this.f146050b.f146043f.f146057d;
            if (aVar == null) {
                l.a("publish");
            }
            aVar.invoke();
        }
    }

    public static final /* synthetic */ View a(c cVar) {
        View view = cVar.f146038a;
        if (view == null) {
            l.a("quickPublish");
        }
        return view;
    }

    public static final /* synthetic */ LinearLayout b(c cVar) {
        LinearLayout linearLayout = cVar.f146040c;
        if (linearLayout == null) {
            l.a("bottomContainer");
        }
        return linearLayout;
    }

    public static final /* synthetic */ LinearLayout c(c cVar) {
        LinearLayout linearLayout = cVar.f146041d;
        if (linearLayout == null) {
            l.a("bottomContainerSingle");
        }
        return linearLayout;
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146051a;

        static {
            Covode.recordClassIndex(95984);
        }

        e(c cVar) {
            this.f146051a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            TextView textView = this.f146051a.f146039b;
            if (textView == null) {
                l.a("nextStep");
            }
            l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146052a;

        static {
            Covode.recordClassIndex(95985);
        }

        f(c cVar) {
            this.f146052a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                c.a(this.f146052a).setEnabled(true);
                c.a(this.f146052a).setVisibility(0);
                c.a(this.f146052a).setAlpha(1.0f);
                return;
            }
            c.a(this.f146052a).setVisibility(8);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f146053a;

        static {
            Covode.recordClassIndex(95986);
        }

        g(c cVar) {
            this.f146053a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                c.b(this.f146053a).setVisibility(8);
                c.c(this.f146053a).setVisibility(0);
                return;
            }
            c.c(this.f146053a).setVisibility(8);
            c.b(this.f146053a).setVisibility(0);
        }
    }

    public c(d dVar, com.bytedance.o.f fVar) {
        l.d(dVar, "");
        l.d(fVar, "");
        this.f146043f = dVar;
        this.f146047k = fVar;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atf, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        d dVar = new d(this);
        View c2 = c(R.id.dge);
        l.b(c2, "");
        this.f146038a = c2;
        if (c2 == null) {
            l.a("quickPublish");
        }
        c2.setOnClickListener(dVar);
        View c3 = c(R.id.cv4);
        l.b(c3, "");
        TextView textView = (TextView) c3;
        this.f146039b = textView;
        if (textView == null) {
            l.a("nextStep");
        }
        textView.setOnClickListener(new C3898c(this));
        View c4 = c(R.id.f59);
        l.b(c4, "");
        this.f146044h = (TextView) c4;
        View c5 = c(R.id.c51);
        l.b(c5, "");
        this.f146040c = (LinearLayout) c5;
        View c6 = c(R.id.c52);
        l.b(c6, "");
        this.f146041d = (LinearLayout) c6;
        View c7 = c(R.id.dgf);
        l.b(c7, "");
        TextView textView2 = (TextView) c7;
        this.f146045i = textView2;
        if (textView2 == null) {
            l.a("singleQuickPublish");
        }
        textView2.setOnClickListener(dVar);
        com.bytedance.als.h<Boolean> hVar = this.f146043f.f146055b;
        if (hVar == null) {
            l.a("nextVisible");
        }
        hVar.a(this, new e(this));
        com.bytedance.als.h<Boolean> hVar2 = this.f146043f.f146054a;
        if (hVar2 == null) {
            l.a("quickPublishVisible");
        }
        hVar2.a(this, new f(this));
        com.bytedance.als.h<Boolean> hVar3 = this.f146043f.f146056c;
        if (hVar3 == null) {
            l.a("onlyShowQuickPublish");
        }
        hVar3.a(this, new g(this));
    }
}
