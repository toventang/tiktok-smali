package com.ss.android.ugc.gamora.recorder.n.a;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.bytedance.scene.navigation.d;
import com.ss.android.ugc.aweme.shortvideo.ap;
import com.ss.android.ugc.gamora.recorder.n.a.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;

public final class h extends j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f148140c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    c f148141a;

    /* renamed from: b  reason: collision with root package name */
    final b f148142b;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f148143d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f148144e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<z> f148145f;

    static {
        Covode.recordClassIndex(97646);
    }

    private final b.a a() {
        return (b.a) this.f148144e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97647);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.gamora.recorder.n.a.h.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(97650);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    h hVar = this.this$0.this$0;
                    c cVar = hVar.f148141a;
                    if (cVar == null) {
                        l.a("adapter");
                    }
                    cVar.a(j.a(hVar.f148142b));
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f148142b.b(a());
        this.f148145f.invoke();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f148146a;

        static {
            Covode.recordClassIndex(97648);
        }

        b(h hVar) {
            this.f148146a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d a2 = com.bytedance.scene.ktx.b.a(this.f148146a);
            if (a2 == null) {
                l.b();
            }
            a2.E();
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.cnv);
        l.b(c2, "");
        View findViewById = c2.findViewById(R.id.djr);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f148143d = recyclerView;
        if (recyclerView == null) {
            l.a("toolbarHiddenRecyclerView");
        }
        t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f148141a = new c(j.a(this.f148142b));
        RecyclerView recyclerView2 = this.f148143d;
        if (recyclerView2 == null) {
            l.a("toolbarHiddenRecyclerView");
        }
        c cVar = this.f148141a;
        if (cVar == null) {
            l.a("adapter");
        }
        recyclerView2.setAdapter(cVar);
        ap apVar = new ap(t());
        Drawable a2 = androidx.core.content.b.a(t(), (int) R.drawable.ha);
        if (a2 == null) {
            l.b();
        }
        apVar.a(a2);
        RecyclerView recyclerView3 = this.f148143d;
        if (recyclerView3 == null) {
            l.a("toolbarHiddenRecyclerView");
        }
        recyclerView3.a(apVar);
        c2.setOnClickListener(new b(this));
        this.f148142b.a(a());
    }

    public h(b bVar, h.f.a.a<z> aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
        this.f148142b = bVar;
        this.f148145f = aVar;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.biy, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
