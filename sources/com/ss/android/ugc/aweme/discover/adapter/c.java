package com.ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends d implements com.ss.android.ugc.aweme.challenge.d, com.ss.android.ugc.aweme.discover.tooltip.b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f80529k = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public AbstractC1878c f80530d;

    /* renamed from: e  reason: collision with root package name */
    public TrendingTopic f80531e;

    /* renamed from: f  reason: collision with root package name */
    public int f80532f;

    /* renamed from: g  reason: collision with root package name */
    public String f80533g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f80534h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f80535i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.tooltip.b f80536j;
    private String w = "discovery";

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.c$c  reason: collision with other inner class name */
    public interface AbstractC1878c {
        static {
            Covode.recordClassIndex(50104);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(50100);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final void a(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50101);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.tooltip.b
    public final void l() {
        this.f80536j.l();
    }

    public c(com.ss.android.ugc.aweme.discover.tooltip.b bVar) {
        l.d(bVar, "");
        this.f80536j = bVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        MethodCollector.i(3470);
        l.d(viewGroup, "");
        if (in.d()) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams((int) n.b(viewGroup.getContext(), 14.0f), -1));
            b bVar = new b(view, null);
            MethodCollector.o(3470);
            return bVar;
        }
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.xv, viewGroup, false);
        l.b(a2, "");
        b bVar2 = new b(a2, this.f80530d);
        MethodCollector.o(3470);
        return bVar2;
    }

    static final class b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(50102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view, final AbstractC1878c cVar) {
            super(view);
            l.d(view, "");
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.discover.adapter.c.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(50103);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    AbstractC1878c cVar = cVar;
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.xt, viewGroup, false);
        l.b(a2, "");
        return new g(this, a2, this);
    }

    @Override // com.ss.android.ugc.aweme.base.widget.g
    public final void b(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        g gVar = (g) viewHolder;
        if (!l.a(gVar.f80551a, this)) {
            gVar.f80551a = this;
        }
        gVar.a((Aweme) ((d) this).f76354l.get(i2), i2);
        gVar.p = this.f80534h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    @Override // com.ss.android.ugc.aweme.challenge.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r20, com.ss.android.ugc.aweme.feed.model.Aweme r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 820
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.c.a(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
