package com.ss.android.ugc.aweme.shortvideo.sticker.a;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.editSticker.a.b {

    /* renamed from: l  reason: collision with root package name */
    public VideoPublishEditModel f130224l;

    static {
        Covode.recordClassIndex(85418);
    }

    private final boolean h() {
        if (this.f130224l == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final View c() {
        MethodCollector.i(6436);
        LinearLayout d2 = d();
        LinearLayout a2 = a(2131230936, R.string.axx);
        a2.setOnClickListener(new View$OnClickListenerC3391c(this));
        LinearLayout a3 = a(2131230938, R.string.axs);
        a3.setOnClickListener(new d(this));
        if (h()) {
            d2.addView(a2);
            d2.addView(e());
        }
        d2.addView(a3);
        MethodCollector.o(6436);
        return d2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f130225a;

        static {
            Covode.recordClassIndex(85419);
        }

        a(c cVar) {
            this.f130225a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130225a.a();
            k kVar = this.f130225a.f88071i;
            if (kVar != null) {
                kVar.c();
            }
            this.f130225a.f88068f.b();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f130226a;

        static {
            Covode.recordClassIndex(85420);
        }

        b(c cVar) {
            this.f130226a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130226a.a();
            k kVar = this.f130226a.f88071i;
            if (kVar != null) {
                kVar.a();
            }
            this.f130226a.f88068f.b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC3391c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f130227a;

        static {
            Covode.recordClassIndex(85421);
        }

        View$OnClickListenerC3391c(c cVar) {
            this.f130227a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130227a.b();
            k kVar = this.f130227a.f88071i;
            if (kVar != null) {
                kVar.c();
            }
            this.f130227a.f88068f.b();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f130228a;

        static {
            Covode.recordClassIndex(85422);
        }

        d(c cVar) {
            this.f130228a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f130228a.b();
            k kVar = this.f130228a.f88071i;
            if (kVar != null) {
                kVar.a();
            }
            this.f130228a.f88068f.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final boolean a(com.bytedance.tux.tooltip.a.a.d dVar) {
        l.d(dVar, "");
        if (h()) {
            d.b bVar = new d.b();
            bVar.f45495a = 2131230936;
            bVar.f45497c = R.string.axx;
            bVar.f45500f = new a(this);
            dVar.a(bVar);
            a(2);
        }
        d.b bVar2 = new d.b();
        bVar2.f45495a = 2131230938;
        bVar2.f45497c = R.string.axs;
        bVar2.f45500f = new b(this);
        dVar.a(bVar2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, k kVar) {
        super(view, kVar);
        l.d(view, "");
    }
}
