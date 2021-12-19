package com.ss.android.ugc.aweme.commercialize.egg.impl.b;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.egg.e.b f74004f;

    /* renamed from: g  reason: collision with root package name */
    public long f74005g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f74006h;

    static {
        Covode.recordClassIndex(45574);
    }

    public static final class b implements com.ss.android.ugc.aweme.commercialize.egg.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f74008a;

        static {
            Covode.recordClassIndex(45576);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.egg.a.b
        public final void a() {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f74008a.f73986c;
            if (aVar != null) {
                aVar.a();
            }
            if (!this.f74008a.f74006h) {
                this.f74008a.f74006h = true;
                this.f74008a.a(true, null);
            }
        }

        b(c cVar) {
            this.f74008a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.egg.a.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f74008a.f73986c;
            if (aVar != null) {
                aVar.b();
            }
            this.f74008a.a(false, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.impl.b.a
    public final void c() {
        MethodCollector.i(7562);
        com.ss.android.ugc.aweme.commercialize.egg.e.b bVar = this.f74004f;
        if (bVar != null) {
            this.f73988e.removeView(bVar.a());
            this.f73988e.setVisibility(8);
            bVar.a().setVisibility(8);
            this.f74004f = null;
            MethodCollector.o(7562);
            return;
        }
        MethodCollector.o(7562);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.impl.b.a
    public final void b() {
        String str;
        View a2;
        com.ss.android.ugc.aweme.commercialize.egg.e.b bVar;
        MethodCollector.i(7515);
        com.ss.android.ugc.aweme.commercialize.egg.d.a aVar = this.f73985b;
        View view = null;
        if (aVar == null || (str = aVar.f73933a) == null || str.length() == 0) {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar2 = this.f73986c;
            if (aVar2 != null) {
                aVar2.b();
            }
            a("materialUrl is null");
            MethodCollector.o(7515);
            return;
        }
        if (this.f74004f == null) {
            com.ss.android.ugc.aweme.commercialize.egg.b.b a3 = com.ss.android.ugc.aweme.commercialize.egg.impl.c.a.a();
            if (a3 != null) {
                bVar = a3.a(this.f73984a, str);
            } else {
                bVar = null;
            }
            this.f74004f = bVar;
            FrameLayout frameLayout = this.f73988e;
            com.ss.android.ugc.aweme.commercialize.egg.e.b bVar2 = this.f74004f;
            if (bVar2 != null) {
                view = bVar2.a();
            }
            frameLayout.addView(view);
        }
        com.ss.android.ugc.aweme.commercialize.egg.e.b bVar3 = this.f74004f;
        if (bVar3 != null) {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar3 = this.f73986c;
            if (aVar3 != null) {
                aVar3.b(bVar3.a(), this.f73988e);
            }
            bVar3.a().setOnClickListener(new a(this));
            bVar3.a(new b(this));
        }
        this.f73988e.setOnClickListener(new View$OnClickListenerC1667c(this));
        this.f73988e.setVisibility(0);
        com.ss.android.ugc.aweme.commercialize.egg.e.b bVar4 = this.f74004f;
        if (!(bVar4 == null || (a2 = bVar4.a()) == null)) {
            a2.setVisibility(0);
        }
        this.f74005g = System.currentTimeMillis();
        com.ss.android.ugc.aweme.commercialize.egg.e.b bVar5 = this.f74004f;
        if (bVar5 != null) {
            this.f74006h = false;
            bVar5.b();
            MethodCollector.o(7515);
            return;
        }
        MethodCollector.o(7515);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(FrameLayout frameLayout) {
        super(frameLayout);
        l.d(frameLayout, "");
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f74007a;

        static {
            Covode.recordClassIndex(45575);
        }

        a(c cVar) {
            this.f74007a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f74007a.f74005g);
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f74007a.f73986c;
            if (aVar != null) {
                l.b(view, "");
                aVar.a(view, currentTimeMillis);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1667c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f74009a;

        static {
            Covode.recordClassIndex(45577);
        }

        View$OnClickListenerC1667c(c cVar) {
            this.f74009a = cVar;
        }

        public final void onClick(View view) {
            View view2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f74009a.f73986c;
            if (aVar != null) {
                com.ss.android.ugc.aweme.commercialize.egg.e.b bVar = this.f74009a.f74004f;
                if (bVar != null) {
                    view2 = bVar.a();
                } else {
                    view2 = null;
                }
                l.b(view, "");
                aVar.a(view2, view);
            }
        }
    }
}
