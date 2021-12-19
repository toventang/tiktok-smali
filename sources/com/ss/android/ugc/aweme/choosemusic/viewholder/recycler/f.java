package com.ss.android.ugc.aweme.choosemusic.viewholder.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ac;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.MusicRecyclerViewPoolViewModel;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.a;
import com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.b;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f extends com.ss.android.ugc.aweme.arch.widgets.a {

    /* renamed from: k  reason: collision with root package name */
    public static final h f70984k = i.a((h.f.a.a) b.f70997a);

    /* renamed from: l  reason: collision with root package name */
    public static final a f70985l = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final RecyclerView f70986b;

    /* renamed from: c  reason: collision with root package name */
    public final c f70987c;

    /* renamed from: d  reason: collision with root package name */
    public s f70988d;

    /* renamed from: e  reason: collision with root package name */
    public ViewPager.e f70989e;

    /* renamed from: f  reason: collision with root package name */
    public k<com.ss.android.ugc.aweme.choosemusic.b.c> f70990f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f70991g;

    /* renamed from: h  reason: collision with root package name */
    public int f70992h;

    /* renamed from: i  reason: collision with root package name */
    public int f70993i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.b f70994j;

    /* renamed from: m  reason: collision with root package name */
    private final View f70995m;
    private final TextView n;
    private final TuxTextView o;
    private final ac p;
    private final d q;
    private final View r;
    private final int s;

    public static final class a {
        static {
            Covode.recordClassIndex(43713);
        }

        public static int a() {
            return ((Number) f.f70984k.getValue()).intValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final class c extends RecyclerView.a<com.ss.android.ugc.aweme.choosemusic.viewholder.s> {

        /* renamed from: a  reason: collision with root package name */
        public final int f70998a;

        /* renamed from: c  reason: collision with root package name */
        private List<c> f71000c = new ArrayList();

        static {
            Covode.recordClassIndex(43715);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ com.ss.android.ugc.aweme.choosemusic.viewholder.s onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f71000c.size();
        }

        public final c a(int i2) {
            return (c) n.b((List) this.f71000c, i2);
        }

        public final void a(List<? extends MusicModel> list) {
            this.f71000c.clear();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f71000c.add(new c(it.next()));
                }
            }
            c cVar = (c) n.b((List) this.f71000c, f.this.f70993i);
            if (cVar != null) {
                f.this.f70987c.a(f.this.f70993i, c.a(cVar, null, null, b.C1602b.f70976a, 3));
            }
        }

        public c(int i2) {
            this.f70998a = i2;
        }

        public final void a(int i2, c cVar) {
            l.d(cVar, "");
            this.f71000c.set(i2, cVar);
            notifyItemChanged(i2, cVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, int i2) {
            com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar2 = sVar;
            l.d(sVar2, "");
            c cVar = this.f71000c.get(i2);
            sVar2.a(cVar.f70978a, f.this.f70991g, false, l.a(cVar.f70980c, b.C1602b.f70976a), f.this.f70992h, i2, f.this.f70994j);
            sVar2.a(f.this.f70988d, f.this.f70990f);
            a(sVar2, cVar);
        }

        private static void a(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, c cVar) {
            Boolean bool;
            a aVar = cVar.f70979b;
            Boolean bool2 = null;
            if (l.a(aVar, a.b.f70973a)) {
                bool = true;
            } else if (l.a(aVar, a.C1601a.f70972a)) {
                bool = false;
            } else if (l.a(aVar, a.c.f70974a)) {
                bool = null;
            } else {
                throw new h.n();
            }
            b bVar = cVar.f70980c;
            if (l.a(bVar, b.C1602b.f70976a)) {
                bool2 = true;
            } else if (l.a(bVar, b.a.f70975a)) {
                bool2 = false;
            } else if (!l.a(bVar, b.c.f70977a)) {
                throw new h.n();
            }
            if (bool != null && bool2 != null) {
                sVar.a(bool.booleanValue(), bool2.booleanValue());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar, int i2, List list) {
            com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar2 = sVar;
            l.d(sVar2, "");
            l.d(list, "");
            if (list.isEmpty()) {
                super.onBindViewHolder(sVar2, i2, list);
            } else {
                a(sVar2, this.f71000c.get(i2));
            }
        }

        private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(4119);
            l.d(viewGroup, "");
            com.ss.android.ugc.aweme.choosemusic.viewholder.s sVar = new com.ss.android.ugc.aweme.choosemusic.viewholder.s(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa2, viewGroup, false), cVar.f70998a);
            try {
                if (sVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(sVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) sVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(sVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = sVar.getClass().getName();
            MethodCollector.o(4119);
            return sVar;
        }
    }

    public final void a() {
        this.f70995m.setVisibility(0);
    }

    public final void b() {
        this.f70995m.setVisibility(4);
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f70997a = new b();

        static {
            Covode.recordClassIndex(43714);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf((int) com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), 84.0f));
        }
    }

    static {
        Covode.recordClassIndex(43711);
    }

    public static final class d implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f71001a;

        static {
            Covode.recordClassIndex(43716);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(f fVar) {
            this.f71001a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.d
        public final void a(int i2) {
            ViewPager.e eVar = this.f71001a.f70989e;
            if (eVar != null) {
                eVar.onPageSelected(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.d
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            ViewPager.e eVar = this.f71001a.f70989e;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.d
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            ViewPager.e eVar = this.f71001a.f70989e;
            if (eVar != null) {
                eVar.onPageScrolled(i2, 0.0f, i3);
            }
        }
    }

    public final void a(s sVar, k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar) {
        l.d(sVar, "");
        l.d(kVar, "");
        this.f70988d = sVar;
        this.f70990f = kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, int i2) {
        super(view);
        l.d(view, "");
        this.r = view;
        this.s = i2;
        View findViewById = view.findViewById(R.id.fkr);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f70986b = recyclerView;
        View findViewById2 = view.findViewById(R.id.an5);
        l.b(findViewById2, "");
        this.f70995m = findViewById2;
        View findViewById3 = view.findViewById(R.id.f9n);
        l.b(findViewById3, "");
        this.n = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f9p);
        l.b(findViewById4, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.o = tuxTextView;
        d dVar = new d(this);
        this.q = dVar;
        view.getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 0);
        wrapGridLayoutManager.u = 4;
        wrapGridLayoutManager.r = true;
        wrapGridLayoutManager.b(gb.a(view.getContext()));
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        c cVar = new c(i2);
        this.f70987c = cVar;
        recyclerView.setAdapter(cVar);
        e eVar = new e();
        eVar.a(recyclerView);
        this.p = eVar;
        recyclerView.setRecycledViewPool(MusicRecyclerViewPoolViewModel.a.a(view.getContext()));
        recyclerView.a(new i(eVar, dVar));
        recyclerView.setNestedScrollingEnabled(false);
        tuxTextView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.choosemusic.viewholder.recycler.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f70996a;

            static {
                Covode.recordClassIndex(43712);
            }

            {
                this.f70996a = r1;
            }

            public final void onClick(View view) {
                s sVar;
                ClickAgent.onClick(view);
                if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (sVar = this.f70996a.f70988d) != null) {
                    sVar.a(null, view, null, 0);
                }
            }
        });
        tuxTextView.setTuxFont(62);
    }

    public final void a(int i2, int i3, boolean[] zArr, boolean[] zArr2) {
        l.d(zArr, "");
        l.d(zArr2, "");
        int length = zArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.f70986b.getTop() + (a.a() * i4) > i3 || this.f70986b.getTop() + ((i4 + 1) * a.a()) < i2) {
                zArr[i4] = false;
                zArr2[i4] = false;
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                zArr2[i4] = true;
            }
        }
    }

    public final void a(MusicCollectionItem musicCollectionItem, List<? extends MusicModel> list, int i2, int i3, int i4, com.ss.android.ugc.aweme.choosemusic.b bVar, boolean z) {
        boolean z2;
        l.d(musicCollectionItem, "");
        l.d(bVar, "");
        this.n.setText(musicCollectionItem.mcName);
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f70986b.getLayoutParams().height = a.a() * h.j.h.c(3, list.size());
            RecyclerView.i layoutManager = this.f70986b.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.WrapGridLayoutManager");
            ((GridLayoutManager) layoutManager).a(h.j.h.c(3, list.size()));
        }
        this.f70991g = z;
        this.f70992h = i4;
        this.f70993i = i3;
        this.f70994j = bVar;
        this.f70987c.a(list);
        this.f70987c.notifyDataSetChanged();
        RecyclerView.i layoutManager2 = this.f70986b.getLayoutManager();
        Objects.requireNonNull(layoutManager2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.views.WrapGridLayoutManager");
        ((LinearLayoutManager) layoutManager2).a(i2, 0);
    }
}
