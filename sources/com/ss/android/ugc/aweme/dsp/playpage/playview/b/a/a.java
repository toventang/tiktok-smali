package com.ss.android.ugc.aweme.dsp.playpage.playview.b.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cp.d;
import com.ss.android.ugc.aweme.dsp.playpage.model.g;
import com.ss.android.ugc.aweme.feed.assem.digg.l;
import com.ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playerservice.b.c f83774a;

    /* renamed from: b  reason: collision with root package name */
    public b f83775b;

    /* renamed from: c  reason: collision with root package name */
    public final DiggAnimationView f83776c;

    /* renamed from: d  reason: collision with root package name */
    public final TuxTextView f83777d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.base.b f83778e;

    /* renamed from: f  reason: collision with root package name */
    private final View f83779f;

    /* renamed from: g  reason: collision with root package name */
    private final FrameLayout f83780g;

    /* renamed from: h  reason: collision with root package name */
    private final View.OnClickListener f83781h;

    /* renamed from: i  reason: collision with root package name */
    private final u<l> f83782i = new C1996a(this);

    /* renamed from: j  reason: collision with root package name */
    private final u<com.bytedance.assem.arch.extensions.a<Boolean>> f83783j = new c(this);

    static {
        Covode.recordClassIndex(52262);
    }

    public final void a() {
        g gVar;
        t<com.bytedance.assem.arch.extensions.a<Boolean>> tVar;
        b();
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = this.f83774a;
        if (cVar != null) {
            Context context = this.f83779f.getContext();
            h.f.b.l.b(context, "");
            com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83778e;
            if (bVar == null || (gVar = bVar.n()) == null) {
                gVar = g.f83745b;
            }
            b bVar2 = new b(context, cVar, gVar);
            this.f83775b = bVar2;
            t<l> tVar2 = bVar2.f83789a;
            if (tVar2 != null) {
                tVar2.observeForever(this.f83782i);
            }
            b bVar3 = this.f83775b;
            if (bVar3 != null && (tVar = bVar3.f83790b) != null) {
                tVar.observeForever(this.f83783j);
            }
        }
    }

    public final void b() {
        t<com.bytedance.assem.arch.extensions.a<Boolean>> tVar;
        t<l> tVar2;
        b bVar = this.f83775b;
        if (!(bVar == null || (tVar2 = bVar.f83789a) == null)) {
            tVar2.removeObserver(this.f83782i);
        }
        b bVar2 = this.f83775b;
        if (!(bVar2 == null || (tVar = bVar2.f83790b) == null)) {
            tVar.removeObserver(this.f83783j);
        }
        b bVar3 = this.f83775b;
        if (bVar3 != null) {
            cg.b(bVar3);
        }
        this.f83775b = null;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83786a;

        static {
            Covode.recordClassIndex(52265);
        }

        b(a aVar) {
            this.f83786a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f83786a.f83775b;
            if (bVar != null) {
                bVar.a("click_like");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.a$a  reason: collision with other inner class name */
    static final class C1996a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83785a;

        static {
            Covode.recordClassIndex(52264);
        }

        C1996a(a aVar) {
            this.f83785a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            l lVar = (l) obj;
            if (lVar.f92251c) {
                this.f83785a.f83777d.setVisibility(0);
                this.f83785a.f83777d.setText(lVar.f92249a);
            } else {
                this.f83785a.f83777d.setVisibility(4);
            }
            this.f83785a.f83776c.setSelected(lVar.f92250b);
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83787a;

        static {
            Covode.recordClassIndex(52266);
        }

        c(a aVar) {
            this.f83787a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            com.bytedance.assem.arch.extensions.a aVar = (com.bytedance.assem.arch.extensions.a) obj;
            if (aVar.f25630a) {
                t = null;
            } else {
                aVar.f25630a = true;
                t = aVar.f25631b;
            }
            if (h.f.b.l.a((Object) t, (Object) true)) {
                this.f83787a.f83776c.a(this.f83787a.f83776c);
            }
        }
    }

    public a(View view) {
        h.f.b.l.d(view, "");
        View findViewById = view.findViewById(R.id.am7);
        h.f.b.l.b(findViewById, "");
        this.f83779f = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.am3);
        h.f.b.l.b(findViewById2, "");
        this.f83780g = (FrameLayout) findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.am1);
        h.f.b.l.b(findViewById3, "");
        DiggAnimationView diggAnimationView = (DiggAnimationView) findViewById3;
        this.f83776c = diggAnimationView;
        View findViewById4 = findViewById.findViewById(R.id.am4);
        h.f.b.l.b(findViewById4, "");
        this.f83777d = (TuxTextView) findViewById4;
        b bVar = new b(this);
        this.f83781h = bVar;
        Drawable d2 = d.d();
        diggAnimationView.setImageDrawable(d2 == null ? findViewById.getResources().getDrawable(R.drawable.azy) : d2);
        findViewById.setOnClickListener(bVar);
        findViewById.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f83784a;

            static {
                Covode.recordClassIndex(52263);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f83784a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f83784a.b();
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f83784a.f83775b != null) {
                    this.f83784a.a();
                }
            }
        });
    }
}
