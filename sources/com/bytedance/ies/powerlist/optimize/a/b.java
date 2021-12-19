package com.bytedance.ies.powerlist.optimize.a;

import android.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.debug.Dr;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.o;
import h.a.n;
import h.c.b.a.k;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.j.h;
import h.p;
import h.r;
import h.v;
import h.w;
import h.z;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.am;
import kotlinx.coroutines.br;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cd;
import kotlinx.coroutines.i;

public final class b extends RecyclerView.n implements am {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f34304a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final bz f34305b;

    /* renamed from: c  reason: collision with root package name */
    final OptimizeAbility f34306c;

    /* renamed from: d  reason: collision with root package name */
    public final PowerList f34307d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> f34308e;

    /* renamed from: f  reason: collision with root package name */
    private final f f34309f;

    static {
        Covode.recordClassIndex(20498);
    }

    @Override // kotlinx.coroutines.am
    public final f a() {
        return this.f34309f;
    }

    public final void b() {
        RecyclerView.a adapter = this.f34307d.getAdapter();
        if (!(adapter instanceof PowerAdapter)) {
            adapter = null;
        }
        PowerAdapter powerAdapter = (PowerAdapter) adapter;
        if (powerAdapter != null) {
            bz unused = i.a(this, null, null, new d(this, powerAdapter, null), 3);
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.a.b$b  reason: collision with other inner class name */
    static final class ThreadFactoryC0763b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34312a;

        static {
            Covode.recordClassIndex(20500);
        }

        ThreadFactoryC0763b(b bVar) {
            this.f34312a = bVar;
        }

        public final /* synthetic */ Thread newThread(Runnable runnable) {
            String str = "PowerList-" + this.f34312a.f34304a.incrementAndGet();
            return new Thread(runnable, str, runnable, str) {
                /* class com.bytedance.ies.powerlist.optimize.a.b.ThreadFactoryC0763b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Runnable f34313a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f34314b;

                static {
                    Covode.recordClassIndex(20501);
                }

                {
                    this.f34313a = r1;
                    this.f34314b = r2;
                }
            };
        }
    }

    static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ RecyclerView $recyclerView;
        int label;
        private am p$;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(20502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, RecyclerView recyclerView, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$recyclerView = recyclerView;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            c cVar = new c(this.this$0, this.$recyclerView, dVar);
            cVar.p$ = (am) obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            if (this.label == 0) {
                r.a(obj);
                RecyclerView.i layoutManager = this.$recyclerView.getLayoutManager();
                PowerList powerList = null;
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int i3 = -1;
                if (linearLayoutManager != null) {
                    i2 = h.c.b.a.b.a(linearLayoutManager.k()).intValue();
                } else {
                    i2 = -1;
                }
                RecyclerView.i layoutManager2 = this.$recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    layoutManager2 = null;
                }
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager2;
                if (linearLayoutManager2 != null) {
                    i3 = h.c.b.a.b.a(linearLayoutManager2.m()).intValue();
                }
                RecyclerView recyclerView = this.$recyclerView;
                if (recyclerView instanceof PowerList) {
                    powerList = recyclerView;
                }
                PowerList powerList2 = powerList;
                if (powerList2 != null) {
                    b bVar = this.this$0;
                    l.c(powerList2, "");
                    com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList2.getState();
                    int b2 = h.b(0, (i2 - bVar.f34306c.f34354b) - 1);
                    int c2 = h.c(state.b() - 1, (bVar.f34306c.f34354b + i3) - 1);
                    p a2 = v.a(Integer.valueOf(b2), Integer.valueOf(i2 - 1));
                    p a3 = v.a(Integer.valueOf(i3 + 1), Integer.valueOf(c2));
                    try {
                        int intValue = ((Number) a2.getFirst()).intValue();
                        int intValue2 = ((Number) a2.getSecond()).intValue();
                        if (intValue <= intValue2) {
                            while (true) {
                                bVar.a(powerList2, intValue);
                                if (intValue == intValue2) {
                                    break;
                                }
                                intValue++;
                            }
                        }
                        int intValue3 = ((Number) a3.getFirst()).intValue();
                        int intValue4 = ((Number) a3.getSecond()).intValue();
                        if (intValue3 <= intValue4) {
                            while (true) {
                                bVar.a(powerList2, intValue3);
                                if (intValue3 == intValue4) {
                                    break;
                                }
                                intValue3++;
                            }
                        }
                    } catch (Exception e2) {
                        if (Dr.f34271b) {
                            throw e2;
                        }
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ PowerAdapter $adapter;
        int label;
        private am p$;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(20503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, PowerAdapter powerAdapter, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
            this.$adapter = powerAdapter;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            d dVar2 = new d(this.this$0, this.$adapter, dVar);
            dVar2.p$ = (am) obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            int i2;
            if (this.label == 0) {
                r.a(obj);
                PowerAdapter powerAdapter = this.$adapter;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                PowerStub powerStub = powerAdapter.f34209a;
                if (powerStub == null) {
                    l.a("mainStub");
                }
                for (PowerStub powerStub2 : n.d((Collection) n.a(powerStub), (Iterable) powerAdapter.f34210b)) {
                    for (Map.Entry<Type, Integer> entry : powerStub2.f34245e.entrySet()) {
                        int intValue = entry.getValue().intValue();
                        Integer num = powerAdapter.f34212d.get(powerStub2);
                        if (num != null) {
                            i2 = num.intValue();
                        } else {
                            i2 = 0;
                        }
                        linkedHashSet.add(Integer.valueOf(intValue + i2));
                    }
                }
                for (Number number : n.k(linkedHashSet)) {
                    int intValue2 = number.intValue();
                    int i3 = this.this$0.f34306c.f34354b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        h.c.b.a.b.a(i4).intValue();
                        b bVar = this.this$0;
                        RecyclerView.ViewHolder createViewHolder = this.$adapter.createViewHolder(bVar.f34307d, intValue2);
                        l.a((Object) createViewHolder, "");
                        bVar.a(createViewHolder, intValue2);
                    }
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34310a;

        /* renamed from: b  reason: collision with root package name */
        private final b f34311b;

        static {
            Covode.recordClassIndex(20499);
        }

        public a(b bVar, b bVar2) {
            l.c(bVar2, "");
            this.f34310a = bVar;
            this.f34311b = bVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0044 A[Catch:{ all -> 0x004b }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[Catch:{ all -> 0x004b }] */
        @Override // androidx.recyclerview.widget.RecyclerView.t
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View a(androidx.recyclerview.widget.RecyclerView.o r5, int r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.c(r5, r3)
                com.bytedance.ies.powerlist.optimize.a.b r0 = r4.f34311b
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r1 = r0.f34308e
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                java.lang.Object r1 = r1.get(r0)
                java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
                r2 = 0
                if (r1 != 0) goto L_0x0022
            L_0x0016:
                r0 = r2
            L_0x0017:
                if (r0 == 0) goto L_0x0053
                int r1 = r0.getItemViewType()
                if (r1 != r6) goto L_0x0053
                android.view.View r1 = r0.itemView
                goto L_0x003a
            L_0x0022:
                h.f.b.l.a(r1, r3)
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L_0x002c
                goto L_0x0016
            L_0x002c:
                java.util.Iterator r0 = r1.iterator()
                java.lang.Object r0 = r0.next()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r0
                r1.remove(r0)
                goto L_0x0017
            L_0x003a:
                com.bytedance.ies.powerlist.optimize.a.b r0 = r4.f34310a     // Catch:{ all -> 0x004b }
                com.bytedance.ies.powerlist.PowerList r0 = r0.f34307d     // Catch:{ all -> 0x004b }
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.a(r1)     // Catch:{ all -> 0x004b }
                if (r0 == 0) goto L_0x0045
                return r1
            L_0x0045:
                h.z r0 = h.z.f158842a     // Catch:{ all -> 0x004b }
                h.q.m223constructorimpl(r0)     // Catch:{ all -> 0x004b }
                goto L_0x0053
            L_0x004b:
                r0 = move-exception
                java.lang.Object r0 = h.r.a(r0)
                h.q.m223constructorimpl(r0)
            L_0x0053:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.optimize.a.b.a.a(androidx.recyclerview.widget.RecyclerView$o, int):android.view.View");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = r5.f34307d.getLayoutManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r2 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r1 = r6.itemView;
        h.f.b.l.a((java.lang.Object) r1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if ((!(r1.getLayoutParams() instanceof androidx.recyclerview.widget.RecyclerView.j)) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r1 = r6.itemView;
        h.f.b.l.a((java.lang.Object) r1, "");
        r2 = r2.a(r1.getLayoutParams());
        r1 = r6.itemView;
        h.f.b.l.a((java.lang.Object) r1, "");
        r1.setLayoutParams(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r1 = r6.itemView;
        h.f.b.l.a((java.lang.Object) r1, "");
        com.bytedance.common.utility.reflect.Reflect.on(r1.getLayoutParams()).set("mViewHolder", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2953);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r0.printStackTrace();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2953);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.optimize.a.b.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(PowerList powerList, int i2) {
        int i3;
        RecyclerView.ViewHolder createViewHolder;
        RecyclerView.a adapter = powerList.getAdapter();
        if (adapter != null) {
            l.a((Object) adapter, "");
            int itemViewType = adapter.getItemViewType(i2);
            CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.f34308e.get(Integer.valueOf(itemViewType));
            if (copyOnWriteArrayList != null) {
                i3 = copyOnWriteArrayList.size();
            } else {
                i3 = 0;
            }
            if (i3 < this.f34306c.f34354b) {
                if (powerList.getRecycledViewPool().getRecycledViewCount(itemViewType) > 1) {
                    createViewHolder = powerList.getRecycledViewPool().getRecycledView(itemViewType);
                    if (createViewHolder != null) {
                        Class<?> cls = createViewHolder.getClass();
                        while (true) {
                            if (cls == null) {
                                break;
                            } else if (l.a(cls, RecyclerView.ViewHolder.class)) {
                                Method[] declaredMethods = cls.getDeclaredMethods();
                                l.a((Object) declaredMethods, "");
                                int length = declaredMethods.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    Method method = declaredMethods[i4];
                                    l.a((Object) method, "");
                                    if (l.a((Object) method.getName(), (Object) "resetInternal")) {
                                        method.setAccessible(true);
                                        Object[] objArr = new Object[0];
                                        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{createViewHolder, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_powerlist_optimize_preload_ViewCacheAbility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                        if (((Boolean) a2.first).booleanValue()) {
                                            Object obj = a2.second;
                                        } else {
                                            com.bytedance.helios.sdk.a.a(method.invoke(createViewHolder, objArr), method, new Object[]{createViewHolder, objArr}, "com_bytedance_ies_powerlist_optimize_preload_ViewCacheAbility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                        }
                                    } else {
                                        i4++;
                                    }
                                }
                            } else {
                                cls = cls.getSuperclass();
                                l.a((Object) cls, "");
                            }
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else {
                    createViewHolder = adapter.createViewHolder(powerList, itemViewType);
                }
                a(createViewHolder, itemViewType);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        l.c(recyclerView, "");
        super.a(recyclerView, i2, i3);
        bz unused = i.a(this, null, null, new c(this, recyclerView, null), 3);
    }

    public b(OptimizeAbility optimizeAbility, PowerList powerList, ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap) {
        l.c(optimizeAbility, "");
        l.c(powerList, "");
        l.c(concurrentHashMap, "");
        this.f34306c = optimizeAbility;
        this.f34307d = powerList;
        this.f34308e = concurrentHashMap;
        kotlinx.coroutines.z a2 = cd.a(null);
        this.f34305b = a2;
        ExecutorService a3 = g.a(com.ss.android.ugc.aweme.cw.l.a(o.FIXED).a(1).a(new ThreadFactoryC0763b(this)).a());
        l.a((Object) a3, "");
        this.f34309f = new br(a3).plus(a2);
    }
}
