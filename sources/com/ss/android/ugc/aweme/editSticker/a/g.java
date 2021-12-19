package com.ss.android.ugc.aweme.editSticker.a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.a.a.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends b {
    static {
        Covode.recordClassIndex(55358);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final View c() {
        MethodCollector.i(3379);
        LinearLayout d2 = d();
        LinearLayout a2 = a(2131230934, R.string.bem);
        a2.setOnClickListener(new b(this));
        d2.addView(a2);
        MethodCollector.o(3379);
        return d2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f88074a;

        static {
            Covode.recordClassIndex(55359);
        }

        a(g gVar) {
            this.f88074a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88074a.a();
            k kVar = this.f88074a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f88075a;

        static {
            Covode.recordClassIndex(55360);
        }

        b(g gVar) {
            this.f88075a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88075a.b();
            k kVar = this.f88075a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final boolean a(d dVar) {
        l.d(dVar, "");
        d.b bVar = new d.b();
        bVar.f45495a = 2131230934;
        bVar.f45497c = R.string.bem;
        bVar.f45500f = new a(this);
        dVar.a(bVar);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(View view, k kVar) {
        super(view, kVar);
        l.d(view, "");
    }
}
