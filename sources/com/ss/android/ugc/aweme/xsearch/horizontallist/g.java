package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.xsearch.horizontallist.b;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g extends FrameLayout implements b.d, b {

    /* renamed from: f  reason: collision with root package name */
    public static final a f145178f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    boolean f145179b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f145180c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f145181d;

    /* renamed from: e  reason: collision with root package name */
    public final i f145182e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f145183g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f145184h;

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f145187a = new e();

        static {
            Covode.recordClassIndex(94937);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f145196a = new l();

        static {
            Covode.recordClassIndex(94944);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(94932);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void B() {
    }

    public final List<f.a.b.b> getDisposableList() {
        return (List) this.f145183g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void y() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void z() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94933);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.g$g  reason: collision with other inner class name */
    public static final class RunnableC3859g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f145190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f145191b;

        static {
            Covode.recordClassIndex(94939);
        }

        RunnableC3859g(g gVar, ArrayList arrayList) {
            this.f145190a = gVar;
            this.f145191b = arrayList;
        }

        public final void run() {
            this.f145190a.a(this.f145191b);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<List<f.a.b.b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f145192a = new h();

        static {
            Covode.recordClassIndex(94940);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<f.a.b.b> invoke() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    public final l getHolderWrapper() {
        return this.f145182e.f145205e.c();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final boolean m() {
        if (this.f145182e.c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final View w() {
        return this.f145182e.f145205e.w();
    }

    static final class f implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f145188a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f145189b;

        static {
            Covode.recordClassIndex(94938);
        }

        f(g gVar, int i2) {
            this.f145188a = gVar;
            this.f145189b = i2;
        }

        @Override // f.a.d.a
        public final void a() {
            if (this.f145189b < this.f145188a.getDisposableList().size()) {
                this.f145188a.getDisposableList().remove(this.f145189b);
            }
        }
    }

    static final class m implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f145197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f145198b;

        static {
            Covode.recordClassIndex(94945);
        }

        m(g gVar, int i2) {
            this.f145197a = gVar;
            this.f145198b = i2;
        }

        @Override // f.a.d.a
        public final void a() {
            if (this.f145198b < this.f145197a.getDisposableList().size()) {
                this.f145197a.getDisposableList().remove(this.f145198b);
            }
        }
    }

    private final boolean b() {
        if (!this.f145179b || !this.f145180c || !this.f145184h || !this.f145181d) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (f.a.b.b bVar : getDisposableList()) {
            if (!bVar.isDisposed()) {
                bVar.dispose();
            }
        }
        getDisposableList().clear();
        this.f145184h = false;
        this.f145179b = false;
        this.f145180c = false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    public final void x() {
        i iVar = this.f145182e;
        if (!iVar.f145204d) {
            return;
        }
        if (iVar.f145207g != null) {
            b.d dVar = iVar.f145207g;
            if (dVar == null) {
                h.f.b.l.b();
            }
            dVar.x();
            iVar.f145201a.removeCallbacks(iVar.d());
            iVar.f145201a.postDelayed(iVar.d(), 50);
            return;
        }
        com.bytedance.android.alog.c.a(1, "SearchHorizontalForLynx", "try resume");
        iVar.b();
        iVar.f145201a.removeCallbacks(iVar.d());
        iVar.f145201a.postDelayed(iVar.d(), 100);
    }

    public final boolean a() {
        if (!b() || !this.f145182e.a()) {
            return false;
        }
        return true;
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f145195a;

        static {
            Covode.recordClassIndex(94943);
        }

        k(h.f.a.b bVar) {
            this.f145195a = bVar;
        }

        @Override // f.a.d.f
        public final void accept(T t) {
            this.f145195a.invoke(t);
        }
    }

    public final void setEventChangeListener(com.ss.android.ugc.aweme.xsearch.b bVar) {
        this.f145182e.f145203c = bVar;
    }

    static final class j<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f145193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f145194b;

        static {
            Covode.recordClassIndex(94942);
        }

        j(g gVar, Class cls) {
            this.f145193a = gVar;
            this.f145194b = cls;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            JavaOnlyMap javaOnlyMap = (JavaOnlyMap) obj;
            h.f.b.l.d(javaOnlyMap, "");
            return this.f145193a.a(javaOnlyMap, this.f145194b);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<b.a, z> {
        final /* synthetic */ l $holder;

        static {
            Covode.recordClassIndex(94934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar) {
            super(1);
            this.$holder = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b.a aVar) {
            b.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            l lVar = this.$holder;
            if (aVar2 != null) {
                h hVar = lVar.f145234k;
                if (hVar != null) {
                    hVar.a(aVar2.getX(), aVar2.getY(), aVar2.getWidth(), aVar2.getHeight());
                }
                lVar.f145235l = aVar2;
            }
            return z.f158842a;
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f145186a;

        static {
            Covode.recordClassIndex(94936);
        }

        d(g gVar) {
            this.f145186a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<d> arrayList = (ArrayList) obj;
            this.f145186a.f145180c = true;
            if (this.f145186a.a()) {
                i iVar = this.f145186a.f145182e;
                h.f.b.l.b(arrayList, "");
                iVar.a(arrayList);
                return;
            }
            g gVar = this.f145186a;
            h.f.b.l.b(arrayList, "");
            gVar.a(arrayList);
        }
    }

    public final void a(ArrayList<d> arrayList) {
        if (a()) {
            this.f145182e.a(arrayList);
        } else {
            com.ss.android.ugc.aweme.base.utils.m.a(new RunnableC3859g(this, arrayList), 40);
        }
    }

    public final void setSessionIdFromLynx(int i2) {
        i iVar = this.f145182e;
        com.bytedance.android.alog.c.a(1, "HorizontalContainer", "SearchHorizontalViewHolder:  generateDataProvider".concat(String.valueOf(i2)));
        iVar.a(new f(com.ss.android.ugc.aweme.xsearch.d.f145151b.b(i2)));
        com.ss.android.ugc.aweme.xsearch.c b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(i2);
        if (b2 != null) {
            int i3 = b2.f145147h;
            i iVar2 = this.f145182e;
            iVar2.f145206f = i3;
            iVar2.F().f121278m = i3;
            this.f145184h = true;
            b2.f145143d = new WeakReference<>(this);
        }
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f145185a;

        static {
            Covode.recordClassIndex(94935);
        }

        c(g gVar) {
            this.f145185a = gVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            ReadableMap readableMap = (ReadableMap) obj;
            h.f.b.l.d(readableMap, "");
            ArrayList arrayList = new ArrayList();
            ReadableMap map = readableMap.getMap("common_data");
            if (readableMap.hasKey("card_list")) {
                Iterator<Object> it = readableMap.getArray("card_list").toArrayList().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JavaOnlyMap) {
                        d dVar = new d((c) this.f145185a.a((JavaOnlyMap) next, c.class));
                        dVar.f145167a = map;
                        arrayList.add(dVar);
                    }
                }
            }
            return arrayList;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<b.c, z> {
        final /* synthetic */ l $holder;
        final /* synthetic */ ReadableMap $style$inlined;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(94941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(l lVar, g gVar, ReadableMap readableMap) {
            super(1);
            this.$holder = lVar;
            this.this$0 = gVar;
            this.$style$inlined = readableMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(b.c cVar) {
            Context context;
            b.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            l lVar = this.$holder;
            if (!(cVar2 == null || (context = lVar.f145236m.getContext()) == null)) {
                lVar.f145236m.setPadding(com.ss.android.ugc.aweme.framework.d.b.a(context, cVar2.getLeftMargin()), lVar.f145236m.getPaddingTop(), com.ss.android.ugc.aweme.framework.d.b.a(context, cVar2.getRightMargin()), lVar.f145236m.getPaddingBottom());
                if (lVar.f145236m.getItemDecorationCount() <= 0) {
                    lVar.f145236m.a(lVar.c());
                }
                lVar.c().f80114a = n.b(context, cVar2.getItemSpace());
            }
            this.this$0.f145182e.f145208h = cVar2;
            this.this$0.f145181d = true;
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private g(Context context) {
        super(context, null, 0);
        com.ss.android.ugc.aweme.flowfeed.a.a aVar;
        h.f.b.l.d(context, "");
        com.ss.android.ugc.aweme.flowfeed.a.b bVar = null;
        MethodCollector.i(1435);
        this.f145183g = h.i.a((h.f.a.a) h.f145192a);
        com.ss.android.ugc.aweme.xsearch.a a2 = com.ss.android.ugc.aweme.xsearch.f.a(this);
        h.f.b.l.d("SearchHorizontalForLynx createHorizontalView", "");
        if (a2 != null) {
            aVar = a2.f145136b;
            bVar = a2.f145137c;
        } else {
            aVar = null;
        }
        h.f.b.l.d(this, "");
        i iVar = new i(com.ss.android.ugc.aweme.search.l.m.a(this, R.layout.axq), aVar, bVar);
        this.f145182e = iVar;
        iVar.a(r.a.a());
        addView(iVar.itemView);
        MethodCollector.o(1435);
    }

    private final JavaOnlyMap a(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry entry : javaOnlyMap.entrySet()) {
            if (entry.getValue() instanceof JavaOnlyMap) {
                Object value = entry.getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                JavaOnlyMap javaOnlyMap2 = (JavaOnlyMap) value;
                if (javaOnlyMap2.containsKey("__lynx_val__")) {
                    javaOnlyMap.put(entry.getKey(), javaOnlyMap2.get("__lynx_val__"));
                } else {
                    javaOnlyMap.put(entry.getKey(), a(javaOnlyMap2));
                }
            } else {
                javaOnlyMap.put(entry.getKey(), entry.getValue());
            }
        }
        return javaOnlyMap;
    }

    public /* synthetic */ g(Context context, byte b2) {
        this(context);
    }

    public final <T> T a(JavaOnlyMap javaOnlyMap, Class<T> cls) {
        return (T) dg.a(dg.a().b(a(javaOnlyMap)), cls);
    }

    /* access modifiers changed from: package-private */
    public final <T> void a(JavaOnlyMap javaOnlyMap, Class<T> cls, h.f.a.b<? super T, z> bVar) {
        f.a.b.b a2 = f.a.h.a(javaOnlyMap).b(new j(this, cls)).b(f.a.h.a.a(f.a.k.a.f158005b)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new k(bVar), l.f145196a, new m(this, getDisposableList().size()));
        List<f.a.b.b> disposableList = getDisposableList();
        h.f.b.l.b(a2, "");
        disposableList.add(a2);
    }
}
