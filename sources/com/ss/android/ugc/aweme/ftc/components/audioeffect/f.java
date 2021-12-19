package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends com.bytedance.ui_component.b<FTCEditAudioEffectViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f97646a;

    /* renamed from: b  reason: collision with root package name */
    public final int f97647b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f97648c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<FTCEditAudioEffectViewModel> f97649d = new b(this);

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.o.f f97650e;

    static {
        Covode.recordClassIndex(62043);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditAudioEffectViewModel> b() {
        return this.f97649d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97646a;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f97650e;
    }

    static final class b extends m implements h.f.a.a<FTCEditAudioEffectViewModel> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(62045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditAudioEffectViewModel invoke() {
            return new FTCEditAudioEffectViewModel(this.this$0.getDiContainer());
        }
    }

    static final class a extends m implements h.f.a.a<g> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(62044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            g gVar = new g(this.this$0.getDiContainer());
            this.this$0.f97646a.a(this.this$0.f97647b, gVar, "FTCEditAudioEffectScene");
            return gVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        TextView textView;
        MethodCollector.i(3707);
        g gVar = (g) this.f97648c.getValue();
        j jVar = gVar.o;
        FrameLayout frameLayout = null;
        if (!(jVar instanceof com.bytedance.scene.group.b)) {
            jVar = null;
        }
        com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) jVar;
        if (bVar != null) {
            bVar.e(gVar);
        }
        gVar.u = gVar.b().C().getValue();
        FrameLayout frameLayout2 = gVar.v;
        if (frameLayout2 == null) {
            l.a("parentLayout");
        }
        frameLayout2.removeAllViews();
        Activity activity = gVar.f42913m;
        if (activity != null) {
            d dVar = (d) activity;
            FrameLayout frameLayout3 = gVar.v;
            if (frameLayout3 == null) {
                l.a("parentLayout");
            }
            if (gVar.f97653c == null) {
                gVar.f97653c = com.a.a(LayoutInflater.from(dVar), R.layout.eg, frameLayout3, false);
                View view = gVar.f97653c;
                if (view != null) {
                    textView = (TextView) view.findViewById(R.id.ez1);
                } else {
                    textView = null;
                }
                gVar.f97654d = textView;
                View view2 = gVar.f97653c;
                if (view2 != null) {
                    frameLayout = (FrameLayout) view2.findViewById(R.id.c7c);
                }
                gVar.t = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a(frameLayout);
                View view3 = gVar.f97653c;
                if (view3 == null) {
                    l.b();
                }
                gVar.f97655e = view3.findViewById(R.id.fkj);
                View view4 = gVar.f97653c;
                if (view4 == null) {
                    l.b();
                }
                view4.findViewById(R.id.fkn).setOnClickListener(new g.View$OnClickListenerC2354g(gVar));
                View view5 = gVar.f97653c;
                if (view5 == null) {
                    l.b();
                }
                gVar.f97656f = (RecyclerView) view5.findViewById(R.id.fkl);
                gVar.f97660j = new LinearLayoutManager(0, false);
                RecyclerView recyclerView = gVar.f97656f;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(gVar.f97660j);
                }
                Activity activity2 = gVar.f42913m;
                if (activity2 != null) {
                    gVar.f97659i = new c((d) activity2, gVar.u, gVar.a(), gVar.a().veAudioEffectParam, gVar.b());
                    c cVar = gVar.f97659i;
                    if (cVar != null) {
                        cVar.f97619c = gVar;
                    }
                    RecyclerView recyclerView2 = gVar.f97656f;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(gVar.f97659i);
                    }
                    gVar.d();
                    View view6 = gVar.f97653c;
                    if (view6 == null) {
                        l.b();
                    }
                    View view7 = gVar.f97655e;
                    if (view7 == null) {
                        l.b();
                    }
                    gVar.f97657g = new com.ss.android.ugc.aweme.filter.a(frameLayout3, view6, view7);
                    com.ss.android.ugc.aweme.filter.a aVar = gVar.f97657g;
                    if (aVar != null) {
                        aVar.f95467a = new g.f(gVar);
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    MethodCollector.o(3707);
                    throw nullPointerException;
                }
            } else {
                gVar.d();
            }
            View view8 = gVar.f97653c;
            if (view8 != null) {
                view8.setVisibility(4);
            }
            com.ss.android.ugc.aweme.filter.a aVar2 = gVar.f97657g;
            if (aVar2 != null) {
                aVar2.a(new g.k(gVar));
                MethodCollector.o(3707);
                return;
            }
            MethodCollector.o(3707);
            return;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.o(3707);
        throw nullPointerException2;
    }

    public f(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97650e = fVar;
        this.f97646a = bVar;
    }
}
