package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.autoplay.d.g;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.discover.lynx.delegate.f;
import com.ss.android.ugc.aweme.discover.lynx.delegate.h;
import com.ss.android.ugc.aweme.discover.lynx.delegate.i;
import com.ss.android.ugc.aweme.discover.lynx.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.xsearch.horizontallist.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class j extends g {

    /* renamed from: h  reason: collision with root package name */
    public static final a f145212h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public r f145213a;

    /* renamed from: b  reason: collision with root package name */
    public List<d> f145214b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<? extends Aweme> f145215c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f145216d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.discover.alading.a.c f145217e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.utils.g f145218f;

    /* renamed from: g  reason: collision with root package name */
    public f f145219g;

    /* renamed from: j  reason: collision with root package name */
    private int f145220j = -1;

    /* renamed from: k  reason: collision with root package name */
    private Map<String, Integer> f145221k = new HashMap();

    static {
        Covode.recordClassIndex(94951);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.a.b, com.ss.android.ugc.aweme.autoplay.d.g
    public final void a(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.g, com.ss.android.ugc.aweme.flowfeed.utils.g.a
    public final boolean e() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94952);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.discover.lynx.e.c {
        static {
            Covode.recordClassIndex(94954);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.discover.lynx.e.c
        public final List<com.ss.android.ugc.aweme.discover.lynx.delegate.b> a(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
            l.d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new h(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.e(bVar));
            arrayList.add(new com.ss.android.ugc.aweme.discover.lynx.delegate.g(bVar));
            arrayList.add(new f(bVar));
            arrayList.add(new i(bVar));
            return arrayList;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f145214b.size();
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a, com.ss.android.ugc.aweme.autoplay.d.g
    public final void b() {
        if (g()) {
            a(d.f145223a);
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.d.a, com.ss.android.ugc.aweme.autoplay.d.g
    public final void c() {
        if (g()) {
            a(b.f145222a);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f145224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f145225b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f145226c;

        static {
            Covode.recordClassIndex(94956);
        }

        e(j jVar, View view, boolean z) {
            this.f145224a = jVar;
            this.f145225b = view;
            this.f145226c = z;
        }

        public final void run() {
            for (View view = this.f145225b; view instanceof ViewGroup; view = ((ViewGroup) view).getChildAt(0)) {
                if (view instanceof com.ss.android.ugc.aweme.xsearch.video.b) {
                    com.ss.android.ugc.aweme.xsearch.video.b bVar = (com.ss.android.ugc.aweme.xsearch.video.b) view;
                    if (bVar != null) {
                        bVar.setAutoPlay(this.f145226c);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final boolean g() {
        if (this.f67400i.getLayoutManager() != null && this.f67400i.getChildCount() > 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> f() {
        List<? extends Aweme> list = this.f145215c;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        List list2 = this.f145215c;
        if (list2 == null) {
            l.b();
        }
        return list2;
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.xsearch.c, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145222a = new b();

        static {
            Covode.recordClassIndex(94953);
        }

        b() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(com.ss.android.ugc.aweme.xsearch.c cVar) {
            b.c cVar2;
            com.ss.android.ugc.aweme.xsearch.c cVar3 = cVar;
            l.d(cVar3, "");
            WeakReference<b.c> weakReference = cVar3.f145144e;
            if (weakReference == null || (cVar2 = weakReference.get()) == null) {
                return null;
            }
            cVar2.f();
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.xsearch.c, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145223a = new d();

        static {
            Covode.recordClassIndex(94955);
        }

        d() {
            super(1);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(com.ss.android.ugc.aweme.xsearch.c cVar) {
            b.c cVar2;
            com.ss.android.ugc.aweme.xsearch.c cVar3 = cVar;
            l.d(cVar3, "");
            WeakReference<b.c> weakReference = cVar3.f145144e;
            if (weakReference == null || (cVar2 = weakReference.get()) == null) {
                return null;
            }
            cVar2.e();
            return z.f158842a;
        }
    }

    public final void b(List<d> list) {
        l.d(list, "");
        this.f145214b = list;
        this.f145215c = list.get(0).f145168b;
        this.f145220j = -1;
        this.f145221k.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        String cardName;
        Integer num;
        c cVar = this.f145214b.get(i2).f145173g;
        if (cVar == null || (cardName = cVar.getCardName()) == null) {
            return -1;
        }
        if (this.f145221k.containsKey(cardName) && (num = this.f145221k.get(cardName)) != null) {
            return num.intValue();
        }
        int i3 = this.f145220j + 1;
        this.f145220j = i3;
        this.f145221k.put(cardName, Integer.valueOf(i3));
        return i3;
    }

    private final void a(h.f.a.b<? super com.ss.android.ugc.aweme.xsearch.c, ? extends Object> bVar) {
        com.ss.android.ugc.aweme.xsearch.c cVar;
        List<Integer> list;
        f fVar = this.f145219g;
        if (!(fVar == null || (cVar = fVar.f145177c) == null || (list = cVar.f145146g) == null)) {
            for (Integer num : list) {
                com.ss.android.ugc.aweme.xsearch.c b2 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(num.intValue());
                if (b2 != null) {
                    bVar.invoke(b2);
                }
            }
        }
    }

    private static Map<String, Object> a(com.ss.android.ugc.aweme.discover.mixfeed.d dVar, int i2) {
        HashMap hashMap = new HashMap();
        try {
            List<Map<?, ?>> awemeListRawByPosition = dVar.getAwemeListRawByPosition(i2);
            l.b(awemeListRawByPosition, "");
            hashMap.put("aweme_list", awemeListRawByPosition);
        } catch (Exception e2) {
            String exc = e2.toString();
            com.bytedance.android.alog.c.a(3, "HorizontalAdapter", exc);
            com.ss.android.ugc.aweme.framework.a.a.b(4, "HorizontalAdapter", exc);
        }
        return hashMap;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1563);
        l.d(viewGroup, "");
        com.ss.android.ugc.aweme.discover.lynx.e.a a3 = a.C1902a.a(viewGroup, new c());
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(1563);
        return a3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.discover.mixfeed.d */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        Integer height;
        l.d(viewHolder, "");
        d dVar = this.f145214b.get(i2);
        com.ss.android.ugc.aweme.discover.mixfeed.d dVar2 = new com.ss.android.ugc.aweme.discover.mixfeed.d();
        androidx.c.a aVar = new androidx.c.a();
        c cVar = dVar.f145173g;
        String str = null;
        if (!(cVar == null || cVar.getRawData() == null)) {
            JavaOnlyMap rawData = dVar.f145173g.getRawData();
            if (rawData == null) {
                l.b();
            }
            androidx.c.a<String, Object> arrayMap = rawData.toArrayMap();
            l.b(arrayMap, "");
            for (Map.Entry<String, Object> entry : arrayMap.entrySet()) {
                aVar.put(entry.getKey(), entry.getValue());
            }
        }
        if (dVar.f145171e != null) {
            ReadableMap readableMap = dVar.f145171e;
            if (readableMap == null) {
                l.b();
            }
            androidx.c.a<String, Object> arrayMap2 = readableMap.toArrayMap();
            l.b(arrayMap2, "");
            arrayMap2.put("rank_index", Integer.valueOf(i2));
            aVar.put("log_extra", arrayMap2);
        } else {
            androidx.c.a aVar2 = new androidx.c.a();
            aVar2.put("rank_index", Integer.valueOf(i2));
            aVar.put("log_extra", aVar2);
        }
        if (dVar.f145170d != null) {
            aVar.put("total", dVar.f145170d);
        }
        c cVar2 = dVar.f145173g;
        if (cVar2 != null) {
            str = cVar2.getSchema();
        }
        dVar2.setSchema(str);
        dVar2.setRawData(dg.a().b(aVar));
        dVar2.setAwemeList(dVar.f145168b);
        c cVar3 = dVar.f145173g;
        if (cVar3 == null || (height = cVar3.getHeight()) == null) {
            i3 = 0;
        } else {
            i3 = height.intValue();
        }
        dVar2.setHeight(i3);
        if (dVar.f145172f == null) {
            dVar2.setWidth(-2);
        } else {
            b.c cVar4 = dVar.f145172f;
            if (cVar4 == null) {
                l.b();
            }
            dVar2.setWidth((int) cVar4.getPreferItemWidth());
        }
        com.ss.android.ugc.aweme.discover.lynx.e.a aVar3 = (com.ss.android.ugc.aweme.discover.lynx.e.a) viewHolder;
        ViewParent viewParent = this.f67400i;
        while (true) {
            if (viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            if (viewParent == null) {
                l.b();
            }
            if (viewParent instanceof com.ss.android.ugc.aweme.discover.lynx.e.b) {
                com.ss.android.ugc.aweme.discover.lynx.e.b bVar = (com.ss.android.ugc.aweme.discover.lynx.e.b) viewParent;
                if (bVar.getTag() != null && (bVar.getTag() instanceof r)) {
                    Object tag = bVar.getTag();
                    Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.mob.ItemMobParam");
                    r rVar = (r) tag;
                    if (rVar != null) {
                        aVar3.a(rVar);
                    }
                }
            }
        }
        aVar3.a(dVar2, a(dVar2, i2));
        if (this.f67400i.getTag() != null) {
            Object tag2 = this.f67400i.getTag();
            Objects.requireNonNull(tag2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) tag2).booleanValue();
            View view = viewHolder.itemView;
            l.b(view, "");
            view.post(new e(this, view, booleanValue));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, com.ss.android.ugc.aweme.discover.alading.a.c cVar, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.utils.g gVar, RecyclerView recyclerView, f fVar) {
        super(recyclerView);
        l.d(context, "");
        l.d(cVar, "");
        l.d(aVar, "");
        l.d(gVar, "");
        l.d(recyclerView, "");
        this.f145216d = context;
        this.f145217e = cVar;
        this.f145218f = gVar;
        this.f145219g = fVar;
        recyclerView.addOnAttachStateChangeListener(new com.ss.android.ugc.aweme.autoplay.player.c(gVar, aVar, this, recyclerView));
    }
}
