package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

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
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class i extends com.bytedance.ui_component.b<EditAudioEffectViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f126816a;

    /* renamed from: b  reason: collision with root package name */
    public final int f126817b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f126818c = h.i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditAudioEffectViewModel> f126819d = b.f126821a;

    /* renamed from: e  reason: collision with root package name */
    private final f f126820e;

    static {
        Covode.recordClassIndex(83202);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditAudioEffectViewModel> b() {
        return this.f126819d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f126816a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f126820e;
    }

    static final class b extends m implements h.f.a.a<EditAudioEffectViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f126821a = new b();

        static {
            Covode.recordClassIndex(83204);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditAudioEffectViewModel invoke() {
            return new EditAudioEffectViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<k> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(83203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            k kVar = new k(this.this$0.getDiContainer());
            this.this$0.f126816a.a(this.this$0.f126817b, kVar, "EditAudioEffectScene");
            return kVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        TextView textView;
        MethodCollector.i(3505);
        k kVar = (k) this.f126818c.getValue();
        com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) kVar.o;
        if (bVar != null) {
            bVar.e(kVar);
        }
        kVar.u = kVar.b().C().getValue();
        FrameLayout frameLayout = kVar.v;
        if (frameLayout == null) {
            l.a("parentLayout");
        }
        frameLayout.removeAllViews();
        Activity activity = kVar.f42913m;
        if (activity != null) {
            d dVar = (d) activity;
            FrameLayout frameLayout2 = kVar.v;
            if (frameLayout2 == null) {
                l.a("parentLayout");
            }
            if (kVar.f126825c == null) {
                kVar.f126825c = com.a.a(LayoutInflater.from(dVar), R.layout.ex, frameLayout2, false);
                View view = kVar.f126825c;
                FrameLayout frameLayout3 = null;
                if (view != null) {
                    textView = (TextView) view.findViewById(R.id.ez1);
                } else {
                    textView = null;
                }
                kVar.f126826d = textView;
                View view2 = kVar.f126825c;
                if (view2 != null) {
                    frameLayout3 = (FrameLayout) view2.findViewById(R.id.c7c);
                }
                kVar.t = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a(frameLayout3);
                View view3 = kVar.f126825c;
                if (view3 == null) {
                    l.b();
                }
                kVar.f126827e = view3.findViewById(R.id.fkj);
                View view4 = kVar.f126825c;
                if (view4 == null) {
                    l.b();
                }
                view4.findViewById(R.id.fkn).setOnClickListener(new k.g(kVar));
                View view5 = kVar.f126825c;
                if (view5 == null) {
                    l.b();
                }
                kVar.f126828f = (RecyclerView) view5.findViewById(R.id.fkl);
                kVar.f126832j = new LinearLayoutManager(0, false);
                RecyclerView recyclerView = kVar.f126828f;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(kVar.f126832j);
                }
                Activity activity2 = kVar.f42913m;
                if (activity2 != null) {
                    kVar.f126831i = new d((d) activity2, kVar.u, kVar.a(), kVar.a().veAudioEffectParam, kVar.b());
                    d dVar2 = kVar.f126831i;
                    if (dVar2 != null) {
                        dVar2.f126785c = kVar;
                    }
                    RecyclerView recyclerView2 = kVar.f126828f;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(kVar.f126831i);
                    }
                    kVar.d();
                    View view6 = kVar.f126825c;
                    if (view6 == null) {
                        l.b();
                    }
                    View view7 = kVar.f126827e;
                    if (view7 == null) {
                        l.b();
                    }
                    kVar.f126829g = new com.ss.android.ugc.aweme.filter.a(frameLayout2, view6, view7);
                    com.ss.android.ugc.aweme.filter.a aVar = kVar.f126829g;
                    if (aVar == null) {
                        l.b();
                    }
                    aVar.f95467a = new k.f(kVar);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    MethodCollector.o(3505);
                    throw nullPointerException;
                }
            } else {
                kVar.d();
            }
            View view8 = kVar.f126825c;
            if (view8 != null) {
                view8.setVisibility(4);
            }
            com.ss.android.ugc.aweme.filter.a aVar2 = kVar.f126829g;
            if (aVar2 != null) {
                aVar2.a(new k.C3293k(kVar));
                MethodCollector.o(3505);
                return;
            }
            MethodCollector.o(3505);
            return;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        MethodCollector.o(3505);
        throw nullPointerException2;
    }

    public i(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f126820e = fVar;
        this.f126816a = bVar;
    }
}
