package com.ss.android.ugc.aweme.sticker.view.internal.pager.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.a.i;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.h;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;

public class b extends f<Effect> {

    /* renamed from: a  reason: collision with root package name */
    public int f136357a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f136358b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final o f136359c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.view.internal.g f136360d;

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.ugc.aweme.sticker.panel.h f136361e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.panel.a.b f136362f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.types.lock.a f136363g;

    /* renamed from: l  reason: collision with root package name */
    private final l.a f136364l;

    /* renamed from: m  reason: collision with root package name */
    private final String f136365m;
    private final int n;

    static {
        Covode.recordClassIndex(89047);
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ List $data;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, List list) {
            super(0);
            this.this$0 = bVar;
            this.$data = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.$data.isEmpty()) {
                this.this$0.f136367h.addAll(this.$data);
            }
            b bVar = this.this$0;
            b.super.a((b) bVar.f136367h);
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ List $data;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, List list) {
            super(0);
            this.this$0 = bVar;
            this.$data = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            final j.d a2 = j.a(new com.ss.android.ugc.aweme.sticker.panel.b.d(this.this$0.f136359c.f(), new ArrayList(this.this$0.f136367h), this.$data), false);
            h.f.b.l.b(a2, "");
            hx.a(0, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(89056);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.f136367h.clear();
                    if (!this.this$0.$data.isEmpty()) {
                        this.this$0.this$0.f136367h.addAll(this.this$0.$data);
                    }
                    this.this$0.this$0.b(this.this$0.this$0.f136367h);
                    a2.a(this.this$0.this$0);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<Integer, Effect> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Effect invoke(Integer num) {
            return this.this$0.a(num.intValue());
        }
    }

    public void b(h<Effect, a<Effect>> hVar) {
        h.f.b.l.d(hVar, "");
        h.a.a(hVar, new C3555b(this));
    }

    static final class c extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(com.ss.android.ugc.aweme.sticker.p.g.t((Effect) this.this$0.a(num.intValue())));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(a<Effect> aVar) {
        h.f.b.l.d(aVar, "");
        super.a((a) aVar);
        aVar.a(this.f136361e.f135207g.f135238m);
    }

    static final class d extends m implements h.f.a.b<ViewGroup, a<Effect>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            k kVar = this.this$0.f136361e.f135207g;
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context);
            return new com.ss.android.ugc.aweme.sticker.panel.b.a.b(a2.component1(), a2.component2(), this.this$0.f136359c, this.this$0.f136360d, this.this$0.f136369j);
        }
    }

    static final class e extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            boolean z;
            Effect effect = (Effect) this.this$0.a(num.intValue());
            if (this.this$0.f136363g == null || !this.this$0.f136363g.isLockStickerEnable() || !this.this$0.f136363g.reallyLockedSticker(effect)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class f extends m implements h.f.a.b<ViewGroup, a<Effect>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.a_a, viewGroup2, false);
            h.f.b.l.b(a2, "");
            com.ss.android.ugc.aweme.sticker.panel.b.a.c cVar = new com.ss.android.ugc.aweme.sticker.panel.b.a.c(a2, this.this$0.f136363g, this.this$0.f136359c, this.this$0.f136360d, this.this$0.f136369j);
            cVar.f135037a = this.this$0.f136362f;
            return cVar;
        }
    }

    private final void b(a<Effect> aVar) {
        if (aVar instanceof com.ss.android.ugc.aweme.sticker.panel.b.a.c) {
            com.ss.android.ugc.aweme.sticker.panel.b.a.c cVar = (com.ss.android.ugc.aweme.sticker.panel.b.a.c) aVar;
            if (cVar.f135039c != this.f136369j) {
                cVar.a(this.f136369j);
            }
        }
        if (aVar instanceof com.ss.android.ugc.aweme.sticker.panel.b.a.e) {
            com.ss.android.ugc.aweme.sticker.panel.b.a.e eVar = (com.ss.android.ugc.aweme.sticker.panel.b.a.e) aVar;
            if (eVar.f135054d != this.f136369j) {
                eVar.a(this.f136369j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b$b  reason: collision with other inner class name */
    public static final class C3555b extends m implements h.f.a.b<ViewGroup, a<Effect>> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3555b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a<Effect> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            k kVar = this.this$0.f136361e.f135207g;
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            p<FrameLayout, com.ss.android.ugc.tools.view.widget.c.b> a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context);
            FrameLayout component1 = a2.component1();
            com.ss.android.ugc.tools.view.widget.c.b component2 = a2.component2();
            if (this.this$0.f136361e.f135207g.t) {
                com.ss.android.ugc.aweme.sticker.panel.b.a.a aVar = new com.ss.android.ugc.aweme.sticker.panel.b.a.a(component1, component2, this.this$0.f136359c, this.this$0.f136360d, this.this$0.f136369j);
                aVar.f135051a = this.this$0.f136362f;
                return aVar;
            }
            com.ss.android.ugc.aweme.sticker.panel.b.a.g gVar = new com.ss.android.ugc.aweme.sticker.panel.b.a.g(component1, component2, this.this$0.f136359c, this.this$0.f136360d, this.this$0.f136369j);
            gVar.f135051a = this.this$0.f136362f;
            return gVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public void a(h<Effect, a<Effect>> hVar) {
        h.f.b.l.d(hVar, "");
        super.a((h) hVar);
        hVar.a(new c(this), new d(this));
        hVar.a(new e(this), new f(this));
        b(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        i iVar;
        a aVar = (a) viewHolder;
        h.f.b.l.d(aVar, "");
        super.onViewAttachedToWindow(aVar);
        Integer num = this.f136364l.f136203f;
        int i2 = this.n;
        if (num != null && num.intValue() == i2) {
            int adapterPosition = aVar.getAdapterPosition();
            if (adapterPosition < this.f136357a) {
                this.f136357a = adapterPosition;
            }
            if (adapterPosition > this.f136358b) {
                this.f136358b = adapterPosition;
            }
            if ((adapterPosition <= this.f136357a || adapterPosition >= this.f136358b) && (iVar = this.f136364l.f136198a) != null) {
                iVar.a(this.f136357a, this.f136358b, this.f136365m, new a(this));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(List<? extends Effect> list) {
        h.f.b.l.d(list, "");
        if (this.f136367h.isEmpty()) {
            hx.a(0, new g(this, list));
        } else {
            hx.a(new h(this, list));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f, androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        onBindViewHolder((a) viewHolder, i2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(a<Effect> aVar, int i2) {
        h.f.b.l.d(aVar, "");
        b(aVar);
        super.onBindViewHolder(aVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f, androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        onBindViewHolder((a) viewHolder, i2, list);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(a<Effect> aVar, int i2, List<Object> list) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(list, "");
        b(aVar);
        super.onBindViewHolder(aVar, i2, list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(o oVar, com.ss.android.ugc.aweme.sticker.view.internal.g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar, com.ss.android.ugc.aweme.sticker.panel.h hVar, com.ss.android.ugc.aweme.sticker.panel.a.b bVar2, com.ss.android.ugc.aweme.sticker.types.lock.a aVar, l.a aVar2, String str, int i2) {
        super(bVar, hVar);
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(aVar2, "");
        this.f136359c = oVar;
        this.f136360d = gVar;
        this.f136361e = hVar;
        this.f136362f = bVar2;
        this.f136363g = aVar;
        this.f136364l = aVar2;
        this.f136365m = str;
        this.n = i2;
    }
}
