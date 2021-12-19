package com.ss.android.ugc.aweme.discover.lynx.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.discover.lynx.delegate.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.xsearch.horizontallist.g;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;

public final class a extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, com.ss.android.ugc.aweme.discover.b.b, com.ss.android.ugc.aweme.discover.mixfeed.e.a, com.ss.android.ugc.aweme.search.j.a {

    /* renamed from: b */
    public static long f81545b = -1;

    /* renamed from: c */
    public static long f81546c = -1;

    /* renamed from: d */
    public static final C1902a f81547d = new C1902a((byte) 0);

    /* renamed from: a */
    public com.ss.android.ugc.aweme.discover.lynx.a.b f81548a;

    /* renamed from: e */
    private final h f81549e;

    /* renamed from: f */
    private boolean f81550f;

    /* renamed from: g */
    private boolean f81551g;

    /* renamed from: h */
    private r f81552h;

    /* renamed from: i */
    private b.d f81553i;

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public final d c() {
        return (d) this.f81549e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final com.ss.android.ugc.aweme.search.model.d g() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int l() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final void n() {
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final SmartImageView p() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final b.d q() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean r() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final void s() {
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final void t() {
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final Aweme u() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean v() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.e.a$a */
    public static final class C1902a {
        static {
            Covode.recordClassIndex(50676);
        }

        private C1902a() {
        }

        public /* synthetic */ C1902a(byte b2) {
            this();
        }

        public static a a(ViewGroup viewGroup, c cVar) {
            l.d(viewGroup, "");
            long currentTimeMillis = System.currentTimeMillis();
            Context context = viewGroup.getContext();
            l.b(context, "");
            a aVar = new a(d.a.a(context));
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            d c2 = aVar.c();
            if (!(c2 == null || cVar == null)) {
                for (T t : cVar.a(c2.f81477b)) {
                    d c3 = aVar.c();
                    if (c3 != null) {
                        c3.a(t);
                    }
                }
            }
            if (currentTimeMillis2 <= a.f81546c) {
                currentTimeMillis2 = a.f81546c;
            }
            a.f81546c = currentTimeMillis2;
            return aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ah
    public final RecyclerView.ViewHolder b() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.discover.b.b
    public final com.ss.android.ugc.aweme.search.j.a d() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean e() {
        return this.f81551g;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final boolean f() {
        return this.f81550f;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
        b.d dVar = this.f81553i;
        if (dVar != null) {
            dVar.A();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final View h() {
        View view = this.itemView;
        l.b(view, "");
        return view;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int k() {
        return getAdapterPosition();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        b.d dVar = this.f81553i;
        if (dVar != null) {
            dVar.x();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
        b.d dVar = this.f81553i;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
        b.d dVar = this.f81553i;
        if (dVar != null) {
            dVar.z();
        }
    }

    public final void C() {
        d c2 = c();
        if (c2 != null) {
            c2.f81477b.f81419j = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.e.a
    public final void D() {
        d c2 = c();
        if (c2 != null) {
            c2.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final r F() {
        r rVar = this.f81552h;
        if (rVar == null) {
            return r.a.a();
        }
        return rVar;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int i() {
        if (this.f81553i == null) {
            return 18;
        }
        return 62;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        b.d dVar = this.f81553i;
        if (dVar != null) {
            return dVar.m();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        b.d dVar = this.f81553i;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(50675);
    }

    public final com.ss.android.ugc.aweme.discover.lynx.a.b a() {
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81548a;
        if (bVar == null) {
            l.a("bContext");
        }
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.search.j.a
    public final int j() {
        View view = this.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GridLayoutManager.b)) {
            layoutParams = null;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) layoutParams;
        if (bVar != null) {
            return bVar.f3768a;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<d> {
        final /* synthetic */ View $itemView;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, View view) {
            super(0);
            this.this$0 = aVar;
            this.$itemView = view;
        }

        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            View view = this.$itemView;
            if (!(view instanceof b)) {
                view = null;
            }
            b bVar = (b) view;
            if (bVar == null) {
                return null;
            }
            a aVar = this.this$0;
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = new com.ss.android.ugc.aweme.discover.lynx.a.b(bVar);
            l.d(bVar2, "");
            aVar.f81548a = bVar2;
            return new d(this.this$0.a());
        }
    }

    public final boolean E() {
        d c2;
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar;
        d c3;
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar2;
        LynxView lynxView;
        if (c() == null || (c2 = c()) == null || (bVar = c2.f81477b) == null || bVar.f81413d == null || (c3 = c()) == null || (bVar2 = c3.f81477b) == null || (lynxView = bVar2.f81413d) == null || lynxView.getLynxContext() == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        this.f81549e = i.a((h.f.a.a) new b(this, view));
        view.addOnAttachStateChangeListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(android.view.View r3) {
        /*
            r2 = this;
            r0 = 1
            r2.f81551g = r0
            com.ss.android.ugc.aweme.discover.lynx.delegate.d r0 = r2.c()
            if (r0 == 0) goto L_0x0024
            java.util.List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> r0 = r0.f81476a
            if (r0 != 0) goto L_0x0010
        L_0x000d:
            h.f.b.l.b()
        L_0x0010:
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.discover.lynx.delegate.b r0 = (com.ss.android.ugc.aweme.discover.lynx.delegate.b) r0
            r0.b()
            goto L_0x0014
        L_0x0024:
            r0 = 0
            goto L_0x000d
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.e.a.onViewAttachedToWindow(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewDetachedFromWindow(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            r2.f81551g = r0
            r2.f81550f = r0
            com.ss.android.ugc.aweme.discover.lynx.delegate.d r0 = r2.c()
            if (r0 == 0) goto L_0x0026
            java.util.List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> r0 = r0.f81476a
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            h.f.b.l.b()
        L_0x0012:
            java.util.Iterator r1 = r0.iterator()
        L_0x0016:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.discover.lynx.delegate.b r0 = (com.ss.android.ugc.aweme.discover.lynx.delegate.b) r0
            r0.c()
            goto L_0x0016
        L_0x0026:
            r0 = 0
            goto L_0x000f
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.e.a.onViewDetachedFromWindow(android.view.View):void");
    }

    private final boolean a(View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            Object first = arrayDeque.getFirst();
            Objects.requireNonNull(first, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) first;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (viewGroup.getChildAt(i2) instanceof com.ss.android.ugc.aweme.xsearch.live.b) {
                        View childAt = viewGroup.getChildAt(i2);
                        Objects.requireNonNull(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.xsearch.live.SearchLiveForLynx");
                        this.f81553i = (com.ss.android.ugc.aweme.xsearch.live.b) childAt;
                        return true;
                    } else if (viewGroup.getChildAt(i2) instanceof g) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        Objects.requireNonNull(childAt2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.xsearch.horizontallist.SearchHorizontalForLynx");
                        this.f81553i = (g) childAt2;
                        return true;
                    } else {
                        arrayDeque.addLast(viewGroup.getChildAt(i2));
                    }
                }
                continue;
            }
            arrayDeque.pollFirst();
        }
    }

    public final void a(com.ss.android.ugc.aweme.discover.lynx.c.a aVar) {
        d c2 = c();
        if (c2 != null) {
            c2.f81477b.n = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.k.p
    public final void a(r rVar) {
        l.d(rVar, "");
        this.f81552h = rVar;
        String str = rVar.f121271f;
        if (!TextUtils.isEmpty(str)) {
            View view = this.itemView;
            l.b(view, "");
            view.setTag(this.f81552h);
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81548a;
            if (bVar == null) {
                l.a("bContext");
            }
            bVar.o = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.mixfeed.e.a
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map<String, ? extends Object> map) {
        l.d(dVar, "");
        d c2 = c();
        if (c2 != null) {
            c2.f81477b.f81420k = true;
        }
        a(this, dVar, map, 24);
    }

    private final void a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar, int i2, Map<String, ? extends Object> map) {
        d c2 = c();
        if (c2 == null) {
            return;
        }
        if (l.a(c2.f81477b.f81417h, dVar)) {
            View view = this.itemView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.lynx.viewholder.BulletWrapperView");
            ((b) view).a();
            LynxView lynxView = c2.f81477b.f81413d;
            if (lynxView != null) {
                lynxView.onEnterForeground();
                return;
            }
            return;
        }
        c2.f81477b.f81417h = dVar;
        c2.f81477b.f81416g = Integer.valueOf(i2);
        c2.f81477b.f81418i = map;
        c2.f81477b.b();
        c2.a();
    }

    public static /* synthetic */ void a(a aVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, Map map, int i2) {
        Map map2 = map;
        if ((i2 & 4) != 0) {
            map2 = null;
        }
        aVar.a(dVar, null, map2, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.mixfeed.d r7, com.ss.android.ugc.aweme.search.theme.c r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, com.ss.android.ugc.aweme.flowfeed.a.a r10, com.ss.android.ugc.aweme.discover.b.g r11) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.e.a.a(com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.search.theme.c, java.util.Map, com.ss.android.ugc.aweme.flowfeed.a.a, com.ss.android.ugc.aweme.discover.b.g):void");
    }
}
