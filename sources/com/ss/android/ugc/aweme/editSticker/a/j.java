package com.ss.android.ugc.aweme.editSticker.a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.a.a.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends b {
    static {
        Covode.recordClassIndex(55364);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final View c() {
        MethodCollector.i(2913);
        LinearLayout d2 = d();
        LinearLayout a2 = a(2131230935, R.string.ayc);
        a2.setOnClickListener(new b(this));
        d2.addView(a2);
        MethodCollector.o(2913);
        return d2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f88076a;

        static {
            Covode.recordClassIndex(55365);
        }

        a(j jVar) {
            this.f88076a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88076a.a();
            k kVar = this.f88076a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f88077a;

        static {
            Covode.recordClassIndex(55366);
        }

        b(j jVar) {
            this.f88077a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88077a.b();
            k kVar = this.f88077a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final boolean a(d dVar) {
        l.d(dVar, "");
        d.b bVar = new d.b();
        bVar.f45495a = 2131230935;
        bVar.f45497c = R.string.ayc;
        bVar.f45500f = new a(this);
        dVar.a(bVar);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view, k kVar) {
        super(view, kVar);
        l.d(view, "");
    }
}
