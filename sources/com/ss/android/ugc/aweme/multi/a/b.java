package com.ss.android.ugc.aweme.multi.a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.r;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class b implements com.ss.android.ugc.aweme.anchor.multi.a.a {
    static {
        Covode.recordClassIndex(71143);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f110892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f110893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f110894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f110895d;

        static {
            Covode.recordClassIndex(71146);
        }

        c(TextView textView, int i2, int i3, TextView textView2) {
            this.f110892a = textView;
            this.f110893b = i2;
            this.f110894c = i3;
            this.f110895d = textView2;
        }

        public final void run() {
            TextView textView;
            int i2;
            TextView textView2;
            ViewParent parent = this.f110892a.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int measuredWidth = ((ViewGroup) parent).getMeasuredWidth();
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = measuredWidth - h.g.a.a(TypedValue.applyDimension(1, 13.0f, system.getDisplayMetrics()));
            int i3 = this.f110893b;
            int i4 = this.f110894c;
            if (i3 + i4 > a2) {
                int i5 = a2 / 2;
                if (i3 <= i5 && i4 > i5) {
                    textView = this.f110892a;
                } else {
                    textView = this.f110895d;
                }
                if (l.a(textView, this.f110892a)) {
                    i2 = this.f110893b;
                } else {
                    i2 = this.f110894c;
                }
                int min = Math.min(i2, i5);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = min;
                textView.setLayoutParams(layoutParams);
                if (l.a(textView, this.f110892a)) {
                    textView2 = this.f110895d;
                } else {
                    textView2 = this.f110892a;
                }
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                layoutParams2.width = a2 - min;
                textView2.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.multi.c, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.multi.d $chain;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(71147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, com.ss.android.ugc.aweme.multi.d dVar) {
            super(1);
            this.this$0 = bVar;
            this.$chain = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.multi.c cVar) {
            com.ss.android.ugc.aweme.multi.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.multi.d dVar = this.$chain;
            cVar2.a(com.ss.android.ugc.aweme.anchor.multi.a.b.b(dVar, cVar2, this.this$0.a(dVar)));
            return z.f158842a;
        }
    }

    public boolean a(com.ss.android.ugc.aweme.multi.d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.multi.c cVar = (com.ss.android.ugc.aweme.multi.c) n.h((List) dVar.f110896a);
        if (cVar == null || cVar.d() <= 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.multi.c f110884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f110885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.base.ui.anchor.c f110886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.multi.d f110887d;

        static {
            Covode.recordClassIndex(71144);
        }

        a(com.ss.android.ugc.aweme.multi.c cVar, b bVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar2, com.ss.android.ugc.aweme.multi.d dVar) {
            this.f110884a = cVar;
            this.f110885b = bVar;
            this.f110886c = cVar2;
            this.f110887d = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.multi.c cVar = this.f110884a;
            com.ss.android.ugc.aweme.multi.d dVar = this.f110887d;
            cVar.c(com.ss.android.ugc.aweme.anchor.multi.a.b.a(dVar, cVar, this.f110885b.a(dVar)));
            com.ss.android.ugc.aweme.multi.c cVar2 = this.f110884a;
            com.ss.android.ugc.aweme.multi.d dVar2 = this.f110887d;
            cVar2.d(com.ss.android.ugc.aweme.anchor.multi.a.b.b(dVar2, cVar2, this.f110885b.a(dVar2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.a.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2834b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.multi.c f110888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f110889b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.base.ui.anchor.c f110890c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.multi.d f110891d;

        static {
            Covode.recordClassIndex(71145);
        }

        View$OnClickListenerC2834b(com.ss.android.ugc.aweme.multi.c cVar, b bVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar2, com.ss.android.ugc.aweme.multi.d dVar) {
            this.f110888a = cVar;
            this.f110889b = bVar;
            this.f110890c = cVar2;
            this.f110891d = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.multi.c cVar = this.f110888a;
            com.ss.android.ugc.aweme.multi.d dVar = this.f110891d;
            cVar.c(com.ss.android.ugc.aweme.anchor.multi.a.b.a(dVar, cVar, this.f110889b.a(dVar)));
            com.ss.android.ugc.aweme.multi.c cVar2 = this.f110888a;
            com.ss.android.ugc.aweme.multi.d dVar2 = this.f110891d;
            cVar2.d(com.ss.android.ugc.aweme.anchor.multi.a.b.b(dVar2, cVar2, this.f110889b.a(dVar2)));
        }
    }

    protected static void a(com.ss.android.ugc.aweme.multi.d dVar, h.f.a.b<? super com.ss.android.ugc.aweme.multi.c, z> bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        AnchorCustomData anchorCustomData = dVar.f110897b.getAnchorCustomData();
        if (anchorCustomData != null && anchorCustomData.getShouldOpen()) {
            Object h2 = n.h((List) dVar.f110896a);
            if (h2 != 0) {
                bVar.invoke(h2);
            }
            anchorCustomData.setShouldOpen(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a
    public void b(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        com.ss.android.ugc.aweme.multi.c cVar2 = (com.ss.android.ugc.aweme.multi.c) n.g((List) dVar.f110896a);
        cVar2.a(cVar.d());
        cVar.k().setVisibility(0);
        cVar2.a().a(true);
        cVar.h().setOnClickListener(new a(cVar2, this, cVar, dVar));
    }

    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a
    public final void c(com.ss.android.ugc.aweme.multi.d dVar, com.ss.android.ugc.aweme.base.ui.anchor.c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        try {
            Object g2 = n.g((List) dVar.f110896a);
            com.ss.android.ugc.aweme.multi.c cVar2 = (com.ss.android.ugc.aweme.multi.c) g2;
            cVar2.b(com.ss.android.ugc.aweme.anchor.multi.a.b.a(dVar, cVar2, a(dVar)));
            cVar.k().setVisibility(0);
            q.m223constructorimpl((com.ss.android.ugc.aweme.multi.c) g2);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        Iterator<T> it = dVar.f110896a.iterator();
        while (it.hasNext()) {
            it.next().a(dVar, cVar, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r1 == null) goto L_0x005b;
     */
    @Override // com.ss.android.ugc.aweme.anchor.multi.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.multi.d r9, com.ss.android.ugc.aweme.base.ui.anchor.c r10) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.a.b.a(com.ss.android.ugc.aweme.multi.d, com.ss.android.ugc.aweme.base.ui.anchor.c):void");
    }
}
