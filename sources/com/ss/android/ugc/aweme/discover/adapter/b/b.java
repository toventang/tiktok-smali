package com.ss.android.ugc.aweme.discover.adapter.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.e.o;
import com.ss.android.ugc.aweme.discover.mob.helpers.SearchSugMobHelper;
import com.ss.android.ugc.aweme.discover.widget.SugCompletionView;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.search.n.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: g  reason: collision with root package name */
    public static final a f80443g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f80444a;

    /* renamed from: b  reason: collision with root package name */
    public int f80445b;

    /* renamed from: c  reason: collision with root package name */
    public String f80446c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f80447d;

    /* renamed from: e  reason: collision with root package name */
    public final String f80448e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.g.a f80449f;

    /* renamed from: h  reason: collision with root package name */
    private final String f80450h;

    /* renamed from: i  reason: collision with root package name */
    private SearchSugMobHelper f80451i;

    /* renamed from: j  reason: collision with root package name */
    private final h f80452j;

    static {
        Covode.recordClassIndex(50070);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.discover.h.b a() {
        return (com.ss.android.ugc.aweme.discover.h.b) this.f80452j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50074);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.b$b  reason: collision with other inner class name */
    static final class RunnableC1876b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f80457a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f80458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f80459c;

        static {
            Covode.recordClassIndex(50075);
        }

        RunnableC1876b(b bVar, int i2, e eVar) {
            this.f80457a = bVar;
            this.f80458b = i2;
            this.f80459c = eVar;
        }

        public final void run() {
            g.a(this.f80457a.f80448e, this.f80458b, this.f80459c, "enrich_sug");
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.discover.h.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80460a = new c();

        static {
            Covode.recordClassIndex(50076);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.discover.h.b invoke() {
            return SearchServiceImpl.t().f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, String str, int i2, com.ss.android.ugc.aweme.discover.g.a aVar, final SugCompletionView.a aVar2) {
        super(view);
        String searchPosition;
        l.d(view, "");
        this.f80449f = aVar;
        this.f80450h = str;
        this.f80452j = i.a((h.f.a.a) c.f80460a);
        if (i2 > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
        com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(AnonymousClass1.f80453a);
        Context context = view.getContext();
        l.b(context, "");
        ((SugCompletionView) view.findViewById(R.id.c1q)).setImageDrawable(a2.a(context));
        ((SugCompletionView) view.findViewById(R.id.c1q)).setKeyboardDismissHandler(aVar2);
        ((SugCompletionView) view.findViewById(R.id.c1q)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.b.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f80454a;

            static {
                Covode.recordClassIndex(50072);
            }

            {
                this.f80454a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                b bVar = this.f80454a;
                e eVar = bVar.f80444a;
                if (eVar != null) {
                    com.ss.android.ugc.d.a.c.a(new o(eVar.f121519b));
                    g.a(bVar.f80445b, eVar);
                }
            }
        });
        View view2 = this.itemView;
        l.b(view2, "");
        Context context2 = view2.getContext();
        if (context2 instanceof androidx.fragment.app.e) {
            this.f80451i = (SearchSugMobHelper) ae.a((androidx.fragment.app.e) context2, (ad.b) null).a(SearchSugMobHelper.class);
        }
        com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
        if (!(b2 == null || (searchPosition = b2.getSearchPosition()) == null || searchPosition.length() <= 0)) {
            str = searchPosition;
        }
        this.f80448e = str;
        view.setOnTouchListener(new com.ss.android.ugc.aweme.discover.m.c(this) {
            /* class com.ss.android.ugc.aweme.discover.adapter.b.b.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f80455a;

            static {
                Covode.recordClassIndex(50073);
            }

            @Override // com.ss.android.ugc.aweme.discover.m.c
            public final void a() {
                SugCompletionView.a aVar = aVar2;
                if (aVar != null) {
                    aVar.a(this.f80455a.f80444a, this.f80455a.f80445b);
                }
            }

            @Override // com.ss.android.ugc.aweme.discover.ui.aj
            public final void a(View view) {
                e eVar;
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && this.f80455a.f80447d && (eVar = this.f80455a.f80444a) != null) {
                    com.ss.android.ugc.aweme.discover.g.a aVar = this.f80455a.f80449f;
                    if (aVar != null) {
                        aVar.a(eVar, this.f80455a.f80446c, this.f80455a.f80445b);
                    }
                    g.b(this.f80455a.f80448e, this.f80455a.f80445b, eVar, "enrich_sug");
                }
            }

            {
                this.f80455a = r1;
            }
        });
    }
}
