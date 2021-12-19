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

public final class b extends com.ss.android.ugc.aweme.editSticker.a.b {
    static {
        Covode.recordClassIndex(85415);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final View c() {
        MethodCollector.i(6340);
        LinearLayout d2 = d();
        LinearLayout a2 = a(2131230938, R.string.axs);
        a2.setOnClickListener(new View$OnClickListenerC3390b(this));
        d2.addView(a2);
        MethodCollector.o(6340);
        return d2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f130222a;

        static {
            Covode.recordClassIndex(85416);
        }

        a(b bVar) {
            this.f130222a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130222a.a();
            k kVar = this.f130222a.f88071i;
            if (kVar != null) {
                kVar.a();
            }
            this.f130222a.f88068f.b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC3390b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f130223a;

        static {
            Covode.recordClassIndex(85417);
        }

        View$OnClickListenerC3390b(b bVar) {
            this.f130223a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130223a.b();
            k kVar = this.f130223a.f88071i;
            if (kVar != null) {
                kVar.a();
            }
            this.f130223a.f88068f.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final boolean a(d dVar) {
        l.d(dVar, "");
        d.b bVar = new d.b();
        bVar.f45495a = 2131230938;
        bVar.f45497c = R.string.axs;
        bVar.f45500f = new a(this);
        dVar.a(bVar);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, k kVar) {
        super(view, kVar);
        l.d(view, "");
    }
}
