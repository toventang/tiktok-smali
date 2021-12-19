package com.ss.android.ugc.aweme.ftc.l.a;

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
import com.ss.android.ugc.aweme.ftc.l.a.i;
import com.ss.android.ugc.aweme.shortvideo.ap;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class f extends j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f98711c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    b f98712a;

    /* renamed from: b  reason: collision with root package name */
    final i f98713b;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f98714d;

    /* renamed from: e  reason: collision with root package name */
    private final h f98715e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.a<z> f98716f;

    static {
        Covode.recordClassIndex(62777);
    }

    private final i.a a() {
        return (i.a) this.f98715e.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(62778);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<a> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(62780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.ftc.l.a.f.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(62781);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    f fVar = this.this$0.this$0;
                    b bVar = fVar.f98712a;
                    if (bVar == null) {
                        l.a("adapter");
                    }
                    bVar.a(h.a(fVar.f98713b));
                    return z.f158842a;
                }
            });
        }
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        this.f98713b.b(a());
        this.f98716f.invoke();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f98717a;

        static {
            Covode.recordClassIndex(62779);
        }

        b(f fVar) {
            this.f98717a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d a2 = com.bytedance.scene.ktx.b.a(this.f98717a);
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
        this.f98714d = recyclerView;
        if (recyclerView == null) {
            l.a("toolbarHiddenRecyclerView");
        }
        t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f98712a = new b(h.a(this.f98713b));
        RecyclerView recyclerView2 = this.f98714d;
        if (recyclerView2 == null) {
            l.a("toolbarHiddenRecyclerView");
        }
        b bVar = this.f98712a;
        if (bVar == null) {
            l.a("adapter");
        }
        recyclerView2.setAdapter(bVar);
        ap apVar = new ap(t());
        Drawable a2 = androidx.core.content.b.a(t(), (int) R.drawable.ha);
        if (a2 == null) {
            l.b();
        }
        apVar.a(a2);
        RecyclerView recyclerView3 = this.f98714d;
        if (recyclerView3 == null) {
            l.a("toolbarHiddenRecyclerView");
        }
        recyclerView3.a(apVar);
        c2.setOnClickListener(new b(this));
        this.f98713b.a(a());
    }

    public f(i iVar, h.f.a.a<z> aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        this.f98713b = iVar;
        this.f98716f = aVar;
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a3_, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
