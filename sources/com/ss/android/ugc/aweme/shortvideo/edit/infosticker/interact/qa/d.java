package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.bytedance.tux.tooltip.a.a.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.a.k;
import com.ss.android.ugc.gamora.editor.sticker.qa.EditPageQaStickerViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.editSticker.a.b {

    /* renamed from: l  reason: collision with root package name */
    public final EditPageQaStickerViewModel f127557l;

    static {
        Covode.recordClassIndex(83627);
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final View c() {
        MethodCollector.i(6930);
        LinearLayout d2 = d();
        LinearLayout a2 = a(2131230935, R.string.ayc);
        a2.setOnClickListener(new c(this));
        LinearLayout a3 = a(2131230962, R.string.f2w);
        a3.setOnClickListener(new View$OnClickListenerC3316d(this));
        d2.addView(a3);
        d2.addView(e());
        d2.addView(a2);
        MethodCollector.o(6930);
        return d2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127558a;

        static {
            Covode.recordClassIndex(83628);
        }

        a(d dVar) {
            this.f127558a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127558a.a();
            k kVar = this.f127558a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127560a;

        static {
            Covode.recordClassIndex(83630);
        }

        c(d dVar) {
            this.f127560a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127560a.b();
            k kVar = this.f127560a.f88071i;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.qa.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC3316d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127561a;

        static {
            Covode.recordClassIndex(83631);
        }

        View$OnClickListenerC3316d(d dVar) {
            this.f127561a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f127561a.b();
            k kVar = this.f127561a.f88071i;
            if (kVar != null) {
                kVar.f();
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f127559a;

        static {
            Covode.recordClassIndex(83629);
        }

        b(d dVar) {
            this.f127559a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.qasticker.a aVar = this.f127559a.f127557l.f146782b;
            if (aVar.f119162b != null) {
                r.a("click_question_to_text", aVar.a().f149193a);
            }
            this.f127559a.a();
            k kVar = this.f127559a.f88071i;
            if (kVar != null) {
                kVar.f();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.editSticker.a.b
    public final boolean a(com.bytedance.tux.tooltip.a.a.d dVar) {
        l.d(dVar, "");
        d.b bVar = new d.b();
        bVar.f45495a = 2131230935;
        bVar.f45497c = R.string.ayc;
        bVar.f45500f = new a(this);
        dVar.a(bVar);
        d.b bVar2 = new d.b();
        bVar2.f45495a = 2131230962;
        bVar2.f45497c = R.string.f2w;
        bVar2.f45500f = new b(this);
        dVar.a(bVar2);
        a(2);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, k kVar) {
        super(view, kVar);
        l.d(view, "");
        Context context = this.f88067e;
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = t.a((e) context).a(EditPageQaStickerViewModel.class);
        l.b(a2, "");
        this.f127557l = (EditPageQaStickerViewModel) a2;
    }
}
