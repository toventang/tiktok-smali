package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.panel.k;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.a.h;
import com.ss.android.ugc.aweme.sticker.view.internal.search.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.style.StyleTextView;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class h extends f<Effect> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f136545m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f136546a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f136547b;

    /* renamed from: c  reason: collision with root package name */
    public final o f136548c;

    /* renamed from: d  reason: collision with root package name */
    public final g f136549d;

    /* renamed from: e  reason: collision with root package name */
    final com.ss.android.ugc.aweme.sticker.panel.h f136550e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.panel.a.b f136551f;

    /* renamed from: g  reason: collision with root package name */
    public final int f136552g;

    /* renamed from: l  reason: collision with root package name */
    public final h.f.a.a<String> f136553l;
    private String n;
    private final HashSet<String> o;
    private List<? extends Effect> p;
    private final t<f> q;

    static {
        Covode.recordClassIndex(89185);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89190);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(k kVar) {
        l.d(kVar, "");
        a((List) kVar.f136582b);
        this.f136546a = kVar.f136583c;
    }

    static final class b extends m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(89191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(com.ss.android.ugc.aweme.sticker.p.g.t((Effect) this.this$0.a(num.intValue())));
        }
    }

    public final int a(Effect effect) {
        if (this.f136552g == 3) {
            return n.a((List) this.p, (Object) effect);
        }
        return super.a((Object) effect);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect> aVar) {
        l.d(aVar, "");
        super.a((com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a) aVar);
        aVar.a(this.f136550e.f135207g.f135238m);
    }

    static final class c extends m implements h.f.a.b<ViewGroup, com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect>> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(89192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect> invoke(ViewGroup viewGroup) {
            p a2;
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            int i2 = this.this$0.f136552g;
            if (i2 == 1) {
                k kVar = this.this$0.f136550e.f135207g;
                Context context = viewGroup2.getContext();
                l.b(context, "");
                a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context);
            } else if (i2 != 3) {
                k kVar2 = this.this$0.f136550e.f135207g;
                Context context2 = viewGroup2.getContext();
                l.b(context2, "");
                a2 = com.ss.android.ugc.aweme.sticker.widget.c.a(kVar2, context2);
            } else {
                k kVar3 = this.this$0.f136550e.f135207g;
                Context context3 = viewGroup2.getContext();
                l.b(context3, "");
                a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar3, context3);
            }
            FrameLayout frameLayout = (FrameLayout) a2.component1();
            com.ss.android.ugc.tools.view.widget.c.b bVar = (com.ss.android.ugc.tools.view.widget.c.b) a2.component2();
            return new com.ss.android.ugc.aweme.sticker.panel.b.a.b(this, bVar, frameLayout, frameLayout, bVar, this.this$0.f136548c, this.this$0.f136549d, this.this$0.f136369j) {
                /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.c.AnonymousClass1 */

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ c f136558e;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ com.ss.android.ugc.tools.view.widget.c.b f136559i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ FrameLayout f136560j;

                static {
                    Covode.recordClassIndex(89193);
                }

                @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.e
                public final void b(boolean z) {
                    super.b(z);
                    if ((this.f136559i instanceof com.ss.android.ugc.tools.view.widget.n) && (this.f136558e.this$0.f136369j instanceof TTSearchStickerViewModel)) {
                        ((com.ss.android.ugc.tools.view.widget.n) this.f136559i).a(z, ((SearchStickerViewModel) this.f136558e.this$0.f136369j).j().f135486b);
                    }
                }

                {
                    this.f136558e = r7;
                    this.f136559i = r8;
                    this.f136560j = r9;
                }
            };
        }
    }

    static final class d extends m implements h.f.a.b<ViewGroup, com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect>> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(89194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect> invoke(ViewGroup viewGroup) {
            p a2;
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            int i2 = this.this$0.f136552g;
            if (i2 == 1) {
                k kVar = this.this$0.f136550e.f135207g;
                Context context = viewGroup2.getContext();
                l.b(context, "");
                a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar, context);
            } else if (i2 != 3) {
                k kVar2 = this.this$0.f136550e.f135207g;
                Context context2 = viewGroup2.getContext();
                l.b(context2, "");
                a2 = com.ss.android.ugc.aweme.sticker.widget.c.a(kVar2, context2);
            } else {
                k kVar3 = this.this$0.f136550e.f135207g;
                Context context3 = viewGroup2.getContext();
                l.b(context3, "");
                a2 = com.ss.android.ugc.aweme.sticker.widget.b.a(kVar3, context3);
            }
            FrameLayout frameLayout = (FrameLayout) a2.component1();
            com.ss.android.ugc.tools.view.widget.c.b bVar = (com.ss.android.ugc.tools.view.widget.c.b) a2.component2();
            if (this.this$0.f136550e.f135207g.t) {
                AnonymousClass1 r1 = new com.ss.android.ugc.aweme.sticker.panel.b.a.a(this, bVar, frameLayout, frameLayout, bVar, this.this$0.f136548c, this.this$0.f136549d, this.this$0.f136369j) {
                    /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.d.AnonymousClass1 */

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ d f136561e;

                    /* renamed from: i  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.tools.view.widget.c.b f136562i;

                    /* renamed from: j  reason: collision with root package name */
                    final /* synthetic */ FrameLayout f136563j;

                    static {
                        Covode.recordClassIndex(89195);
                    }

                    @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.e
                    public final void b(boolean z) {
                        super.b(z);
                        if ((this.f136562i instanceof com.ss.android.ugc.tools.view.widget.n) && (this.f136561e.this$0.f136369j instanceof TTSearchStickerViewModel)) {
                            ((com.ss.android.ugc.tools.view.widget.n) this.f136562i).a(z, ((SearchStickerViewModel) this.f136561e.this$0.f136369j).j().f135486b);
                        }
                    }

                    {
                        this.f136561e = r7;
                        this.f136562i = r8;
                        this.f136563j = r9;
                    }
                };
                r1.f135051a = this.this$0.f136551f;
                return r1;
            }
            AnonymousClass2 r12 = new com.ss.android.ugc.aweme.sticker.panel.b.a.g(this, bVar, frameLayout, frameLayout, bVar, this.this$0.f136548c, this.this$0.f136549d, this.this$0.f136369j) {
                /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.d.AnonymousClass2 */

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ d f136564e;

                /* renamed from: i  reason: collision with root package name */
                final /* synthetic */ com.ss.android.ugc.tools.view.widget.c.b f136565i;

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ FrameLayout f136566j;

                static {
                    Covode.recordClassIndex(89196);
                }

                @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.e
                public final void b(boolean z) {
                    super.b(z);
                    if ((this.f136565i instanceof com.ss.android.ugc.tools.view.widget.n) && (this.f136564e.this$0.f136369j instanceof TTSearchStickerViewModel)) {
                        ((com.ss.android.ugc.tools.view.widget.n) this.f136565i).a(z, ((SearchStickerViewModel) this.f136564e.this$0.f136369j).j().f135486b);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
                @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.g, com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a
                public final /* bridge */ /* synthetic */ void a(Effect effect, int i2) {
                    a(effect, i2);
                }

                @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.g
                public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f<Effect> b(Effect effect, int i2) {
                    String str;
                    l.d(effect, "");
                    int i3 = this.f136356h;
                    Bundle bundle = new Bundle();
                    bundle.putString("search_id", this.f136564e.this$0.f136546a);
                    if (this.f136564e.this$0.f136552g == 3) {
                        str = "recommend";
                    } else {
                        str = "search";
                    }
                    bundle.putString("search_method", str);
                    bundle.putString("is_panel_unfold", this.f136564e.this$0.f136553l.invoke());
                    return new com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f<>(effect, i2, i3, false, false, true, bundle, this, null, 792);
                }

                @Override // com.ss.android.ugc.aweme.sticker.panel.b.a.g
                public final void a(Effect effect, int i2) {
                    String valueOf;
                    String str;
                    l.d(effect, "");
                    super.a(effect, i2);
                    long use_number = effect.getUse_number();
                    com.ss.android.ugc.tools.view.widget.c.b bVar = this.f136565i;
                    if (bVar instanceof com.ss.android.ugc.tools.view.widget.n) {
                        com.ss.android.ugc.tools.view.widget.n nVar = (com.ss.android.ugc.tools.view.widget.n) bVar;
                        if (0 <= use_number && 1000 > use_number) {
                            valueOf = String.valueOf(use_number);
                        } else if (1000 <= use_number && 1000000 > use_number) {
                            valueOf = defpackage.b.a(use_number, 1000, "k");
                        } else if (1000000 <= use_number && 100000000 > use_number) {
                            valueOf = defpackage.b.a(use_number, 1000, "m");
                        } else {
                            valueOf = defpackage.b.a(use_number, 1000000000, "b");
                        }
                        l.d(valueOf, "");
                        String str2 = valueOf + ' ';
                        if (use_number > 1) {
                            str = str2 + nVar.getContext().getString(com.ss.android.ugc.aweme.shortvideo.m.b.f128757k);
                        } else {
                            str = str2 + nVar.getContext().getString(com.ss.android.ugc.aweme.shortvideo.m.b.f128758l);
                        }
                        StyleTextView styleTextView = nVar.f150455b;
                        if (styleTextView == null) {
                            l.a("stickerUseNumberText");
                        }
                        styleTextView.setText(str);
                    }
                    if ((this.f136565i instanceof com.ss.android.ugc.tools.view.widget.n) && (this.f136564e.this$0.f136369j instanceof TTSearchStickerViewModel)) {
                        ((com.ss.android.ugc.tools.view.widget.n) this.f136565i).a(((SearchStickerViewModel) this.f136564e.this$0.f136369j).j().f135486b);
                    }
                }

                {
                    this.f136564e = r7;
                    this.f136565i = r8;
                    this.f136566j = r9;
                }
            };
            r12.f135051a = this.this$0.f136551f;
            return r12;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(com.ss.android.ugc.aweme.sticker.view.internal.pager.a.h<Effect, com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect>> hVar) {
        l.d(hVar, "");
        super.a((com.ss.android.ugc.aweme.sticker.view.internal.pager.a.h) hVar);
        hVar.a(new b(this), new c(this));
        hVar.a(h.a.C3556a.f136382a, new d(this));
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(List<? extends Effect> list) {
        l.d(list, "");
        if (this.f136552g == 3) {
            this.n = "recommend";
            this.p = list;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().setSearchType("prop_recommend");
            }
        } else {
            this.n = "search";
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().setSearchType("prop_search");
            }
        }
        super.a((List) list);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f, androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        onBindViewHolder((com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a) viewHolder, i2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a.f
    public final void a(com.ss.android.ugc.aweme.sticker.view.internal.pager.a.a<Effect> aVar, int i2) {
        l.d(aVar, "");
        super.onBindViewHolder(aVar, i2);
        Effect effect = (Effect) a(i2);
        if (effect != null && i2 > 0 && !this.o.contains(effect.getEffectId())) {
            this.o.add(effect.getEffectId());
            this.q.setValue(new f.e(this.n, this.f136546a, this.f136553l.invoke(), effect, i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private h(final e eVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> bVar, com.ss.android.ugc.aweme.sticker.panel.h hVar, t<f> tVar, final RecyclerView.i iVar, int i2, h.f.a.a<String> aVar) {
        super(bVar, hVar);
        l.d(eVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        l.d(bVar, "");
        l.d(hVar, "");
        l.d(tVar, "");
        l.d(aVar, "");
        this.f136548c = oVar;
        this.f136549d = gVar;
        this.f136550e = hVar;
        this.f136551f = null;
        this.q = tVar;
        this.f136552g = i2;
        this.f136553l = aVar;
        this.n = "search";
        this.f136546a = "0";
        this.o = new HashSet<>();
        this.p = new ArrayList();
        this.f136368i = -1;
        oVar.n().d().observe(eVar, new u<com.ss.android.ugc.aweme.sticker.presenter.n>(this) {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f136554a;

            static {
                Covode.recordClassIndex(89186);
            }

            {
                this.f136554a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.sticker.presenter.n nVar) {
                com.ss.android.ugc.aweme.sticker.presenter.n nVar2 = nVar;
                if (nVar2 != null) {
                    Effect effect = nVar2.f135422a;
                    Effect effect2 = nVar2.f135423b;
                    int a2 = this.f136554a.a(effect);
                    int a3 = this.f136554a.a(effect2);
                    if (a2 >= 0) {
                        this.f136554a.notifyItemChanged(a2 + 1, effect);
                    }
                    if (a3 >= 0) {
                        this.f136554a.notifyItemChanged(a3 + 1, effect2);
                    }
                }
            }
        });
        bVar.k().observe(eVar, new u<h.u<? extends Effect, ? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer>>(this) {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f136555a;

            static {
                Covode.recordClassIndex(89187);
            }

            {
                this.f136555a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(h.u<? extends Effect, ? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer> uVar) {
                h.u<? extends Effect, ? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer> uVar2 = uVar;
                if (uVar2 != null) {
                    Effect effect = (Effect) uVar2.component1();
                    int a2 = this.f136555a.a(effect);
                    if (a2 >= 0) {
                        this.f136555a.f136547b = true;
                        this.f136555a.notifyItemChanged(a2 + 1, effect);
                    }
                    if (this.f136555a.f136552g != 3 && (iVar instanceof LinearLayoutManager) && uVar2.getSecond() == com.ss.android.ugc.tools.h.a.c.DOWNLOAD_SUCCESS) {
                        ((LinearLayoutManager) iVar).a(a2 + 1, 0);
                    }
                }
            }
        });
        bVar.n().observe(eVar, new u<com.bytedance.jedi.arch.d<? extends Effect>>() {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.AnonymousClass3 */

            static {
                Covode.recordClassIndex(89188);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(com.bytedance.jedi.arch.d<? extends Effect> dVar) {
                com.bytedance.jedi.arch.d<? extends Effect> dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.a(new h.f.a.b<Effect, z>(this) {
                        /* class com.ss.android.ugc.aweme.sticker.view.internal.search.h.AnonymousClass3.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass3 this$0;

                        static {
                            Covode.recordClassIndex(89189);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // h.f.a.b
                        public final /* synthetic */ z invoke(Effect effect) {
                            l.d(effect, "");
                            j.a.a(eVar, (int) R.string.blv, 0).a();
                            return z.f158842a;
                        }
                    });
                }
            }
        });
    }

    public /* synthetic */ h(e eVar, o oVar, g gVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b bVar, com.ss.android.ugc.aweme.sticker.panel.h hVar, t tVar, RecyclerView.i iVar, int i2, h.f.a.a aVar, byte b2) {
        this(eVar, oVar, gVar, bVar, hVar, tVar, iVar, i2, aVar);
    }
}
