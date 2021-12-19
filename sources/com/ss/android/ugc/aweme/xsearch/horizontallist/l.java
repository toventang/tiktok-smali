package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.autoplay.d.m;
import com.ss.android.ugc.aweme.dh.e;
import com.ss.android.ugc.aweme.flowfeed.utils.f;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.xsearch.horizontallist.b;
import h.h;
import h.i;

public class l extends m {
    public static final a p = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public f f145233j;

    /* renamed from: k  reason: collision with root package name */
    public h f145234k;

    /* renamed from: l  reason: collision with root package name */
    b.a f145235l;

    /* renamed from: m  reason: collision with root package name */
    public final RecyclerView f145236m;
    public final View n;
    public final boolean o;
    private final h q;
    private final h r;

    static final class c extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(94964);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar) {
            super(0);
            this.this$0 = lVar;
        }

        public static final class a implements f {
            static {
                Covode.recordClassIndex(94965);
            }

            a() {
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            g gVar = new g(this.this$0.f145236m, new a(), this.this$0);
            l lVar = this.this$0;
            h hVar = new h(lVar.f145236m, gVar);
            hVar.a(lVar.f145235l.getX(), lVar.f145235l.getY(), lVar.f145235l.getWidth(), lVar.f145235l.getHeight());
            lVar.f145234k = hVar;
            gVar.f96190g = this.this$0.f145234k;
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(94961);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.m
    public final g a() {
        return (g) this.r.getValue();
    }

    /* access modifiers changed from: package-private */
    public final e c() {
        return (e) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.m, com.ss.android.ugc.aweme.flowfeed.utils.g.a
    public final boolean e() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94962);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145237a = new b();

        static {
            Covode.recordClassIndex(94963);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            e eVar = new e();
            eVar.f80116c = 0;
            eVar.f80114a = 0.0f;
            eVar.f80115b.setColor(0);
            return eVar;
        }
    }

    public final void a(f fVar) {
        com.ss.android.ugc.aweme.xsearch.b bVar;
        this.f145233j = fVar;
        h hVar = this.f145234k;
        if (hVar != null) {
            if (fVar != null) {
                bVar = fVar.f145176b;
            } else {
                bVar = null;
            }
            hVar.f145199e = bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private l(RecyclerView recyclerView, View view, com.ss.android.ugc.aweme.flowfeed.a.b bVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
        super(recyclerView, view, bVar, aVar, true);
        h.f.b.l.d(recyclerView, "");
        h.f.b.l.d(view, "");
        this.f145236m = recyclerView;
        this.n = view;
        this.o = true;
        this.f145235l = new b.a(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.q = i.a((h.f.a.a) b.f145237a);
        Context context = recyclerView.getContext();
        h.f.b.l.b(context, "");
        new a(recyclerView, com.bytedance.tux.h.i.a(context), n.a(GlobalContext.getContext())).a(recyclerView);
        this.r = i.a((h.f.a.a) new c(this));
    }

    public /* synthetic */ l(RecyclerView recyclerView, View view, com.ss.android.ugc.aweme.flowfeed.a.b bVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, byte b2) {
        this(recyclerView, view, bVar, aVar);
    }
}
