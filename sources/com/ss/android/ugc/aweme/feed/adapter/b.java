package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.assem.g;
import com.ss.android.ugc.aweme.feed.e.l;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public abstract class b extends ar implements ag {

    /* renamed from: m  reason: collision with root package name */
    public static int f91650m;
    public static final C2211b n = new C2211b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f91651a = new i();

    /* renamed from: b  reason: collision with root package name */
    public boolean f91652b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f91653c = true;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super String, ? extends View> f91654d;

    /* renamed from: e  reason: collision with root package name */
    public long f91655e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f91656f;

    /* renamed from: g  reason: collision with root package name */
    public final LayoutInflater f91657g;

    /* renamed from: h  reason: collision with root package name */
    public final s<ag> f91658h;

    /* renamed from: i  reason: collision with root package name */
    public final Fragment f91659i;

    /* renamed from: j  reason: collision with root package name */
    public final View.OnTouchListener f91660j;

    /* renamed from: k  reason: collision with root package name */
    public final BaseFeedPageParams f91661k;

    /* renamed from: l  reason: collision with root package name */
    public final l f91662l;
    private final LongPressLayout.a o;
    private final com.bytedance.ies.dmt.ui.widget.b p;
    private final com.ss.android.ugc.aweme.feed.helper.c q;
    private final h v;
    private final h w;
    private final Map<Integer, o> x;
    private int y;

    static {
        Covode.recordClassIndex(57723);
    }

    public abstract String b();

    public final g c() {
        return (g) this.v.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.b$b  reason: collision with other inner class name */
    public static final class C2211b {
        static {
            Covode.recordClassIndex(57725);
        }

        private C2211b() {
        }

        public /* synthetic */ C2211b(byte b2) {
            this();
        }
    }

    public ch a() {
        return e.f91799a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aj f91663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f91664b;

        static {
            Covode.recordClassIndex(57726);
        }

        c(aj ajVar, View view) {
            this.f91663a = ajVar;
            this.f91664b = view;
        }

        public final void run() {
            this.f91663a.a(this.f91664b);
        }
    }

    static final class f extends m implements h.f.a.a<g> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(57729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ag
    public List<Aweme> e() {
        return this.f91651a.f91808a;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ag, androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f91651a.f91808a.size();
    }

    static final class d extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f91665a = new d();

        static {
            Covode.recordClassIndex(57727);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.SERIAL);
            a2.f79173b = "feed-diff";
            return com.ss.android.ugc.aweme.cw.g.a(a2.a());
        }
    }

    public final List<Aweme> d() {
        return this.f91651a.f91808a;
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f91666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f91667b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ aj f91668c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f91669d;

        static {
            Covode.recordClassIndex(57728);
        }

        e(b bVar, z.e eVar, aj ajVar, int i2) {
            this.f91666a = bVar;
            this.f91667b = eVar;
            this.f91668c = ajVar;
            this.f91669d = i2;
        }

        public final void run() {
            String str;
            b.a((View) this.f91667b.element);
            long currentTimeMillis = System.currentTimeMillis();
            this.f91668c.b(this.f91666a.b());
            this.f91668c.a(this.f91666a.d(this.f91669d), this.f91669d);
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                Aweme c2 = this.f91666a.c(this.f91669d);
                if (c2 != null) {
                    b bVar = this.f91666a;
                    long j2 = currentTimeMillis2 - currentTimeMillis;
                    if (c2.isAd()) {
                        str = "ad";
                    } else if (c2.getAwemeType() == 101) {
                        str = "live";
                    } else {
                        str = "common";
                    }
                    r.a("mt_feed_total_bind_consumption", v.a(Long.valueOf(j2), "duration"), v.a(str, "aweme_type"), v.a(bVar.b(), "feed_type"));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.ar
    public final int a(int i2) {
        return b(i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ag
    public final Aweme c(int i2) {
        return this.f91651a.a(i2);
    }

    public Aweme d(int i2) {
        return c(i2);
    }

    public final void f(int i2) {
        e(i2);
        notifyDataSetChanged();
    }

    protected static aj d(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.b1q);
        } else {
            obj = null;
        }
        return (aj) obj;
    }

    public static void a(View view) {
        if (view != null) {
            int i2 = f91650m;
            f91650m = i2 + 1;
            view.setTag(R.id.b1r, Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.ar
    public final void c(View view) {
        if (view != null && (view instanceof aj)) {
            aj d2 = d(view);
            if (d2 == null) {
                h.f.b.l.b();
            }
            d2.u();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ar
    public final void e(View view) {
        Object obj;
        aj ajVar = null;
        if (view != null) {
            obj = view.getTag(R.id.b1q);
        } else {
            obj = null;
        }
        if (obj instanceof aj) {
            ajVar = obj;
        }
        aj ajVar2 = ajVar;
        if (ajVar2 != null) {
            ajVar2.c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.ar
    public final int b(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag(R.id.b1s);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Exception) new RuntimeException("expect tag is type int,but no:".concat(String.valueOf(obj))));
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        h.f.b.l.d(obj, "");
        aj d2 = d((View) obj);
        int count = getCount();
        for (int i2 = 0; i2 < count; i2++) {
            Aweme aweme = e().get(i2);
            if (!(d2 == null || d2.b() == null)) {
                String aid = aweme.getAid();
                Aweme b2 = d2.b();
                h.f.b.l.b(b2, "");
                if (com.bytedance.common.utility.m.a(aid, b2.getAid())) {
                    return i2;
                }
            }
        }
        return -2;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.ar
    public int b(int i2) {
        Aweme c2 = c(i2);
        if (c2 == null) {
            return 0;
        }
        for (Map.Entry<Integer, o> entry : this.x.entrySet()) {
            int intValue = entry.getKey().intValue();
            h.f.a.b<ay, Boolean> bVar = entry.getValue().f91850c;
            Context context = this.f91656f;
            List<Aweme> e2 = e();
            String str = this.f91661k.eventType;
            h.f.b.l.b(str, "");
            if (bVar.invoke(new ay(c2, i2, context, e2, str, this.f91661k.awemeFromPage, this.f91661k.isMyProfile, this.f91661k.pageType, this.f91661k.isFromPostList)).booleanValue()) {
                return intValue;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void e(int i2) {
        if (i2 >= 0 && i2 < getCount()) {
            Aweme remove = d().remove(i2);
            g c2 = c();
            h.f.b.l.d(remove, "");
            Iterator<Map.Entry<String, ap<VideoBaseCell, VideoItemParams>>> it = c2.f92253a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, ap<VideoBaseCell, VideoItemParams>> next = it.next();
                h.f.b.l.b(next, "");
                if (h.f.b.l.a((Object) next.getKey(), (Object) com.ss.android.ugc.aweme.feed.x.l.a(remove))) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ag
    public void a(List<? extends Aweme> list) {
        String str;
        this.f91651a.a(list);
        g c2 = c();
        ConcurrentHashMap<String, ap<VideoBaseCell, VideoItemParams>> concurrentHashMap = new ConcurrentHashMap<>();
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    str = com.ss.android.ugc.aweme.feed.x.l.a(t);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && c2.f92253a.get(str) != null) {
                    if (str == null) {
                        h.f.b.l.b();
                    }
                    concurrentHashMap.put(str, c2.f92253a.get(str));
                }
            }
        }
        c2.f92253a = concurrentHashMap;
        notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r18) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.b.g(int):void");
    }

    public final boolean a(String str) {
        h.f.b.l.d(str, "");
        List<Aweme> d2 = d();
        boolean z = false;
        for (int size = d2.size() - 1; size >= 0; size--) {
            if (TextUtils.equals(str, d2.get(size).getAuthorUid())) {
                e(size);
                z = true;
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
        return z;
    }

    public final void a(List<? extends Aweme> list, int i2) {
        a(list, i2, 1);
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(57724);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.f91849b), Integer.valueOf(t2.f91849b));
        }
    }

    public final void a(Aweme aweme, int i2) {
        if (aweme == null || i2 < 0 || i2 > getCount()) {
            throw new IllegalArgumentException("position out of range");
        }
        d().add(i2, aweme);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final View a(int i2, ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        o oVar = this.x.get(Integer.valueOf(i2));
        if (oVar == null) {
            oVar = a();
        }
        h.f.a.b<ao, View> bVar = oVar.f91851d;
        Context context = this.f91656f;
        LayoutInflater layoutInflater = this.f91657g;
        String str = this.f91661k.eventType;
        h.f.b.l.b(str, "");
        View invoke = bVar.invoke(new ao(viewGroup, context, layoutInflater, str));
        invoke.setTag(R.id.b1s, Integer.valueOf(i2));
        h.f.a.b<cf, aj> bVar2 = oVar.f91852e;
        h.f.b.l.d(invoke, "");
        s<ag> sVar = this.f91658h;
        Fragment fragment = this.f91659i;
        View.OnTouchListener onTouchListener = this.f91660j;
        BaseFeedPageParams baseFeedPageParams = this.f91661k;
        com.ss.android.ugc.aweme.feed.e.l lVar = this.f91662l;
        com.ss.android.ugc.aweme.feed.helper.c cVar = this.q;
        com.bytedance.ies.dmt.ui.widget.b bVar3 = this.p;
        LongPressLayout.a aVar = this.o;
        String str2 = baseFeedPageParams.eventType;
        h.f.b.l.b(str2, "");
        aj invoke2 = bVar2.invoke(new cf(invoke, sVar, fragment, onTouchListener, baseFeedPageParams, lVar, cVar, bVar3, aVar, str2, this.f91655e, this.f91661k.challengeId, i2, c(), this.f91654d));
        invoke.setTag(R.id.b1q, invoke2);
        invoke.setTag(R.id.b1q, invoke2);
        com.ss.android.ugc.aweme.ca.h.a(new c(invoke2, invoke));
        return invoke;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.ar
    public View a(int i2, View view, ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        z.e eVar = new z.e();
        eVar.element = view;
        int b2 = b(i2);
        T t = eVar.element;
        if (t == null || !androidx.core.g.d.a(t.getTag(R.id.b1s), Integer.valueOf(b2))) {
            eVar.element = (T) a(b2, viewGroup);
        }
        aj d2 = d(eVar.element);
        if (d2 == null) {
            h.f.b.l.b();
        }
        if (com.ss.android.ugc.aweme.ca.h.a()) {
            d2.d(c(i2));
        }
        com.ss.android.ugc.aweme.ca.h.a(new e(this, eVar, d2, i2));
        T t2 = eVar.element;
        if (t2 == null) {
            h.f.b.l.b();
        }
        return t2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r7, int r8, int r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0017
            if (r8 < 0) goto L_0x0017
            int r0 = r7.size()
            if (r8 >= r0) goto L_0x0017
            int r0 = r6.getCount()
            if (r8 <= r0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            java.util.List r2 = r6.d()
            r1 = 0
        L_0x001d:
            if (r1 >= r9) goto L_0x002e
            int r0 = r8 + r1
            java.lang.Object r0 = r7.get(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x002a:
            r2.add(r8, r0)
            goto L_0x0027
        L_0x002e:
            com.ss.android.ugc.aweme.feed.adapter.i r5 = r6.f91651a
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L_0x003e
            r3.add(r1)
            goto L_0x003e
        L_0x0059:
            r5.a(r3)
            r6.notifyDataSetChanged()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.b.a(java.util.List, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.feed.adapter.o[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, LayoutInflater layoutInflater, s<ag> sVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, com.ss.android.ugc.aweme.feed.e.l lVar) {
        super(context, layoutInflater);
        LongPressLayout.a bVar;
        h.f.b.l.d(context, "");
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(sVar, "");
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(onTouchListener, "");
        h.f.b.l.d(baseFeedPageParams, "");
        h.f.b.l.d(lVar, "");
        this.f91656f = context;
        this.f91657g = layoutInflater;
        this.f91658h = sVar;
        this.f91659i = fragment;
        this.f91660j = onTouchListener;
        this.f91661k = baseFeedPageParams;
        this.f91662l = lVar;
        Context context2 = this.t;
        h.f.b.l.b(context2, "");
        h.f.b.l.d(context2, "");
        if (baseFeedPageParams == null) {
            bVar = ce.a.C2214a.f91763a;
        } else {
            bVar = new ce.a.b(baseFeedPageParams, context2);
        }
        this.o = bVar;
        this.p = new com.bytedance.ies.dmt.ui.widget.b();
        com.ss.android.ugc.aweme.feed.helper.c cVar = new com.ss.android.ugc.aweme.feed.helper.c();
        int i2 = Build.VERSION.SDK_INT;
        com.ss.android.ugc.aweme.feed.helper.c.a(this.t);
        this.q = cVar;
        this.v = i.a((h.f.a.a) new f(this));
        this.w = i.a((h.f.a.a) d.f91665a);
        ILiveOuterService s = LiveOuterService.s();
        h.f.b.l.b(s, "");
        Object a2 = s.r().a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.FeedTypeConfig");
        List<o> g2 = n.g((Collection) n.a((Iterable) n.c(a2, aq.f91601a, as.f91604a, az.f91647a, av.f91609a, f.f91801a), (Comparator) new a()));
        g2.add(a());
        ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
        for (o oVar : g2) {
            arrayList.add(v.a(Integer.valueOf(oVar.f91849b), oVar));
        }
        this.x = h.a.ag.a(arrayList);
        this.y = -1;
    }
}
