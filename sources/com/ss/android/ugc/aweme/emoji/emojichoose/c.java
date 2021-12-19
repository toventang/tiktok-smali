package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;

public final class c extends com.ss.android.ugc.aweme.emoji.b.e implements com.ss.android.ugc.aweme.emoji.b.g, com.ss.android.ugc.aweme.emoji.d.c {

    /* renamed from: k  reason: collision with root package name */
    public static int f89209k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f89210l = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final h f89211c;

    /* renamed from: d  reason: collision with root package name */
    final q f89212d;

    /* renamed from: e  reason: collision with root package name */
    public final m f89213e;

    /* renamed from: f  reason: collision with root package name */
    final LinearLayoutManager f89214f;

    /* renamed from: g  reason: collision with root package name */
    int f89215g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f89216h;

    /* renamed from: i  reason: collision with root package name */
    public final am f89217i;

    /* renamed from: j  reason: collision with root package name */
    public final d f89218j;
    private final com.ss.android.ugc.aweme.emoji.emojichoose.a.b o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private final com.ss.android.ugc.aweme.emoji.b.h v;

    static {
        Covode.recordClassIndex(56081);
    }

    private SwipeControlledViewPager g() {
        return (SwipeControlledViewPager) this.p.getValue();
    }

    private final RecyclerView h() {
        return (RecyclerView) this.r.getValue();
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final n b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView c() {
        return (RecyclerView) this.q.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(56083);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final m a() {
        return this.f89213e;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.c$c  reason: collision with other inner class name */
    static final class C2157c extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2157c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.f89109b.findViewById(R.id.av8);
        }
    }

    static final class d extends m implements h.f.a.a<SwipeControlledViewPager> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SwipeControlledViewPager invoke() {
            return this.this$0.f89109b.findViewById(R.id.ava);
        }
    }

    static final class e extends m implements h.f.a.a<Button> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Button invoke() {
            return this.this$0.f89109b.findViewById(R.id.avd);
        }
    }

    static final class f extends m implements h.f.a.a<RecyclerView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56087);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RecyclerView invoke() {
            return this.this$0.f89109b.findViewById(R.id.avl);
        }
    }

    static final class g extends m implements h.f.a.a<View> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.f89109b.findViewById(R.id.fiq);
        }
    }

    static final class h extends m implements h.f.a.a<View> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(56089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.f89109b.findViewById(R.id.c5l);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.v.a(com.ss.android.ugc.aweme.emoji.utils.e.a(this.f89213e, g().getCurrentItem()));
    }

    public final void e() {
        List<com.ss.android.ugc.aweme.emoji.b.a> c2;
        com.ss.android.ugc.aweme.emoji.g.a aVar;
        int i2;
        int currentItem = g().getCurrentItem();
        int a2 = com.ss.android.ugc.aweme.emoji.utils.e.a(this.f89213e, currentItem);
        if (a2 == 4 && (c2 = this.f89213e.c(currentItem)) != null && !c2.isEmpty()) {
            com.ss.android.ugc.aweme.emoji.b.f fVar = this.f89213e.f89277a;
            Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.gifemoji.GifEmojiType");
            com.ss.android.ugc.aweme.emoji.d.b bVar = (com.ss.android.ugc.aweme.emoji.d.b) fVar;
            for (com.ss.android.ugc.aweme.emoji.b.a aVar2 : c2) {
                if (!(aVar2 == null || (aVar = aVar2.f89106d) == null)) {
                    if (aVar.getStaticUrl() != null || aVar.getAnimateUrl() != null) {
                        List<com.ss.android.ugc.aweme.emoji.g.a> list = bVar.f89120b;
                        if (list != null) {
                            i2 = list.indexOf(aVar);
                        } else {
                            i2 = -1;
                        }
                        this.v.b(aVar2, a2, i2);
                    }
                }
            }
        }
    }

    public final void f() {
        int g2;
        if (this.f89213e.f89277a.j() == 3) {
            com.ss.android.ugc.aweme.emoji.b.f fVar = this.f89213e.f89277a;
            l.b(fVar, "");
            if (fVar.k() == 0) {
                h().setVisibility(4);
                return;
            }
        }
        com.ss.android.ugc.aweme.emoji.emojichoose.a.b bVar = this.o;
        m mVar = this.f89213e;
        if (mVar.f89277a == null) {
            g2 = 0;
        } else {
            g2 = mVar.f89277a.g();
        }
        int a2 = this.f89213e.a();
        int j2 = this.f89213e.f89277a.j();
        com.ss.android.ugc.aweme.emoji.emojichoose.a.c cVar = bVar.f89200a;
        if (!(cVar.f89201a == g2 && cVar.f89202b == a2 && cVar.f89203c == j2)) {
            cVar.f89201a = g2;
            cVar.f89203c = j2;
            cVar.f89204d.clear();
            for (int i2 = 0; i2 < g2; i2++) {
                com.ss.android.ugc.aweme.emoji.emojichoose.a.a aVar = new com.ss.android.ugc.aweme.emoji.emojichoose.a.a();
                if (i2 == 0 && j2 == 4) {
                    aVar.f89199b = R.drawable.a7f;
                } else {
                    aVar.f89199b = R.drawable.a7c;
                }
                cVar.f89204d.add(aVar);
                if (i2 == a2) {
                    cVar.f89202b = a2;
                    cVar.f89204d.get(a2).f89198a = true;
                }
            }
            cVar.notifyDataSetChanged();
        }
        h().setVisibility(0);
    }

    public static final class i extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f89222a;

        static {
            Covode.recordClassIndex(56090);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(c cVar) {
            this.f89222a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0091, code lost:
            if (r0.getLeft() < 0) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x018b, code lost:
            if (r0.getRight() > r5.c().getWidth()) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x018f, code lost:
            if (r3 == false) goto L_0x009e;
         */
        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageSelected(int r9) {
            /*
            // Method dump skipped, instructions count: 412
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.emoji.emojichoose.c.i.onPageSelected(int):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final void a(int i2) {
        int i3;
        this.f89213e.a(i2);
        m mVar = this.f89213e;
        Iterator<com.ss.android.ugc.aweme.emoji.b.f> it = mVar.f89278b.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = 0;
                break;
            }
            com.ss.android.ugc.aweme.emoji.b.f next = it.next();
            if (next == mVar.f89277a) {
                i3 = mVar.f89277a.f() + i4;
                break;
            }
            i4 += next.g();
        }
        g().setCurrentItem(i3, false);
        if (this.f89216h && i3 == 0) {
            this.f89216h = false;
            d();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f89219a = new d();

        /* renamed from: b  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.emoji.b.h f89220b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f89221c;

        static {
            Covode.recordClassIndex(56082);
        }

        public a(com.ss.android.ugc.aweme.emoji.b.h hVar, ViewGroup viewGroup) {
            l.d(hVar, "");
            l.d(viewGroup, "");
            this.f89220b = hVar;
            this.f89221c = viewGroup;
        }
    }

    private c(com.ss.android.ugc.aweme.emoji.b.h hVar, d dVar, ViewGroup viewGroup) {
        super(viewGroup, R.layout.yz);
        boolean z;
        int i2;
        this.v = hVar;
        this.f89218j = dVar;
        this.p = h.i.a((h.f.a.a) new d(this));
        this.q = h.i.a((h.f.a.a) new f(this));
        this.r = h.i.a((h.f.a.a) new C2157c(this));
        h.h a2 = h.i.a((h.f.a.a) new e(this));
        this.s = a2;
        h.h a3 = h.i.a((h.f.a.a) new g(this));
        this.t = a3;
        h.h a4 = h.i.a((h.f.a.a) new h(this));
        this.u = a4;
        this.f89217i = an.a(bf.f159040a);
        if (dVar.f89225c) {
            l.d(this, "");
            String str = dVar.f89228f;
            l.d(UGCMonitor.EVENT_COMMENT, "");
            l.d(str, "");
            com.ss.android.ugc.aweme.emoji.utils.a.a();
        }
        this.f89213e = new m(dVar);
        h hVar2 = new h(hVar, this, g());
        this.f89211c = hVar2;
        g().setAdapter(hVar2);
        c().getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f89214f = linearLayoutManager;
        c().setLayoutManager(linearLayoutManager);
        q qVar = new q(this);
        this.f89212d = qVar;
        c().setAdapter(qVar);
        this.o = new com.ss.android.ugc.aweme.emoji.emojichoose.a.b(h());
        if (dVar.f89230h.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        View view = (View) a3.getValue();
        l.b(view, "");
        int i3 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        View view2 = (View) a4.getValue();
        l.b(view2, "");
        view2.setVisibility(z ? 0 : i3);
        f();
        g().addOnPageChangeListener(new i(this));
        this.f89216h = true;
        a(f89209k);
        a((Button) a2.getValue());
    }

    public /* synthetic */ c(com.ss.android.ugc.aweme.emoji.b.h hVar, d dVar, ViewGroup viewGroup, byte b2) {
        this(hVar, dVar, viewGroup);
    }
}
