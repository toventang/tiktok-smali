package com.ss.android.ugc.aweme.shortvideo.sticker.a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.editSticker.a.b {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f130217l;

    static {
        Covode.recordClassIndex(85410);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final View c() {
        MethodCollector.i(1474);
        LinearLayout d2 = d();
        if (!this.f130217l) {
            LinearLayout a2 = a(2131230935, R.string.x_);
            a2.setOnClickListener(new c(this));
            View e2 = e();
            d2.addView(a2);
            d2.addView(e2);
        }
        LinearLayout a3 = a(2131232208, R.string.xu);
        a3.setOnClickListener(new d(this));
        d2.addView(a3);
        MethodCollector.o(1474);
        return d2;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3389a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130218a;

        static {
            Covode.recordClassIndex(85411);
        }

        View$OnClickListenerC3389a(a aVar) {
            this.f130218a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130218a.a();
            k kVar = this.f130218a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
            this.f130218a.f88068f.b();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130219a;

        static {
            Covode.recordClassIndex(85412);
        }

        b(a aVar) {
            this.f130219a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130219a.a();
            k kVar = this.f130219a.f88071i;
            if (kVar != null) {
                kVar.e();
            }
            this.f130219a.f88068f.b();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130220a;

        static {
            Covode.recordClassIndex(85413);
        }

        c(a aVar) {
            this.f130220a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130220a.b();
            k kVar = this.f130220a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
            this.f130220a.f88068f.b();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130221a;

        static {
            Covode.recordClassIndex(85414);
        }

        d(a aVar) {
            this.f130221a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130221a.b();
            k kVar = this.f130221a.f88071i;
            if (kVar != null) {
                kVar.e();
            }
            this.f130221a.f88068f.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final boolean a(com.bytedance.tux.tooltip.a.a.d dVar) {
        l.d(dVar, "");
        if (!this.f130217l) {
            d.b bVar = new d.b();
            bVar.f45495a = 2131230935;
            bVar.f45497c = R.string.x_;
            bVar.f45500f = new View$OnClickListenerC3389a(this);
            dVar.a(bVar);
            a(2);
        }
        d.b bVar2 = new d.b();
        bVar2.f45495a = 2131232208;
        bVar2.f45497c = R.string.xu;
        bVar2.f45500f = new b(this);
        dVar.a(bVar2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, k kVar, boolean z) {
        super(view, kVar);
        l.d(view, "");
        this.f130217l = z;
    }
}
