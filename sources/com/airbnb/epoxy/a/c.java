package com.airbnb.epoxy.a;

import android.content.Context;
import android.view.View;
import androidx.core.h.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.a.d;
import com.airbnb.epoxy.a.g;
import com.airbnb.epoxy.aa;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.u;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.a.n;
import h.f.a.m;
import h.f.b.ab;
import h.f.b.l;
import h.j.e;
import h.j.g;
import h.j.h;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c<P extends d> extends RecyclerView.n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4970b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final e<P> f4971a;

    /* renamed from: c  reason: collision with root package name */
    private g f4972c;

    /* renamed from: d  reason: collision with root package name */
    private e f4973d;

    /* renamed from: e  reason: collision with root package name */
    private int f4974e;

    /* renamed from: f  reason: collision with root package name */
    private int f4975f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<? extends s<?>>, a<?, ?, ? extends P>> f4976g;

    /* renamed from: h  reason: collision with root package name */
    private final g f4977h;

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.epoxy.d f4978i;

    /* renamed from: j  reason: collision with root package name */
    private final int f4979j;

    static {
        Covode.recordClassIndex(2087);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(2088);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean a(int i2) {
        if (Math.abs(i2) > 75) {
            return true;
        }
        return false;
    }

    private final boolean b(int i2) {
        if (i2 == -1 || i2 >= this.f4974e) {
            return true;
        }
        return false;
    }

    private final int c(int i2) {
        return Math.min(this.f4974e - 1, Math.max(i2, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2) {
        l.c(recyclerView, "");
        this.f4975f = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(RecyclerView recyclerView, int i2, int i3) {
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        Object obj;
        View view;
        ArrayList arrayList;
        c<P> cVar = this;
        l.c(recyclerView, "");
        if (!(i2 == 0 && i3 == 0) && !a(i2) && !a(i3)) {
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i4 = adapter.getItemCount();
            } else {
                i4 = 0;
            }
            cVar.f4974e = i4;
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int k2 = linearLayoutManager.k();
                int m2 = linearLayoutManager.m();
                if (cVar.b(k2) || cVar.b(m2)) {
                    cVar.f4972c = g.f158754e;
                    cVar.f4973d = g.f158754e;
                    return;
                }
                g gVar = new g(k2, m2);
                if (!l.a(gVar, cVar.f4972c)) {
                    if (gVar.f158747a > cVar.f4972c.f158747a || gVar.f158748b > cVar.f4972c.f158748b) {
                        z = true;
                        i5 = m2 + 1;
                    } else {
                        z = false;
                        i5 = k2 - 1;
                    }
                    int i8 = cVar.f4979j;
                    if (z) {
                        i6 = i8 - 1;
                    } else {
                        i6 = 1 - i8;
                    }
                    int c2 = cVar.c(i5);
                    int c3 = cVar.c(i6 + i5);
                    if (z) {
                        i7 = 1;
                    } else {
                        i7 = -1;
                    }
                    e a2 = e.a.a(c2, c3, i7);
                    for (Number number : n.c(a2, cVar.f4973d)) {
                        int intValue = number.intValue();
                        com.airbnb.epoxy.d dVar = cVar.f4978i;
                        l.c(dVar, "");
                        s<?> a3 = dVar.a(intValue);
                        if ((a3 instanceof s) && a3 != null) {
                            a<?, ?, ? extends P> aVar = cVar.f4976g.get(a3.getClass());
                            if (!(aVar instanceof a)) {
                                aVar = null;
                            }
                            a<?, ?, ? extends P> aVar2 = aVar;
                            if (aVar2 != null) {
                                g gVar2 = cVar.f4977h;
                                l.c(aVar2, "");
                                l.c(a3, "");
                                g.a a4 = gVar2.a(a3);
                                Map<g.a, List<h<?>>> map = gVar2.f4981a;
                                ArrayList arrayList2 = map.get(a4);
                                if (arrayList2 == null) {
                                    com.airbnb.epoxy.e a5 = aa.a(gVar2.f4982b);
                                    l.a((Object) a5, "");
                                    Iterator it = a5.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it.next();
                                        u uVar = (u) obj;
                                        l.a((Object) uVar, "");
                                        s<?> b2 = uVar.b();
                                        if (l.a(ab.a(b2.getClass()), ab.a(a3.getClass())) && v.y(uVar.itemView) && v.v(uVar.itemView)) {
                                            uVar.getAdapterPosition();
                                            if (l.a(gVar2.a(b2), a4)) {
                                                break;
                                            }
                                        }
                                    }
                                    u uVar2 = (u) obj;
                                    if (uVar2 == null || (view = uVar2.itemView) == null) {
                                        arrayList2 = null;
                                    } else {
                                        l.a((Object) view, "");
                                        l.c(uVar2, "");
                                        Object a6 = uVar2.a();
                                        l.a(a6, "");
                                        if (!aVar2.f4969b.isEmpty()) {
                                            List<Integer> list = aVar2.f4969b;
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator<T> it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                int intValue2 = it2.next().intValue();
                                                View findViewById = view.findViewById(intValue2);
                                                if (findViewById == null) {
                                                    m<Context, RuntimeException, z> mVar = gVar2.f4983c;
                                                    Context context = view.getContext();
                                                    l.a((Object) context, "");
                                                    mVar.invoke(context, new b("View with id " + intValue2 + " in " + a3.getClass().getSimpleName() + " could not be found."));
                                                } else {
                                                    arrayList3.add(findViewById);
                                                }
                                            }
                                            arrayList = arrayList3;
                                        } else if (view instanceof f) {
                                            arrayList = ((f) view).a();
                                        } else if (a6 instanceof f) {
                                            arrayList = ((f) a6).a();
                                        } else {
                                            arrayList = h.a.z.INSTANCE;
                                        }
                                        if (arrayList.isEmpty()) {
                                            m<Context, RuntimeException, z> mVar2 = gVar2.f4983c;
                                            Context context2 = view.getContext();
                                            l.a((Object) context2, "");
                                            mVar2.invoke(context2, new b("No preloadable views were found in " + a3.getClass().getSimpleName()));
                                        }
                                        ArrayList<View> arrayList4 = new ArrayList();
                                        for (View view2 : arrayList) {
                                            n.a((Collection) arrayList4, (Iterable) gVar2.a(view2));
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        for (View view3 : arrayList4) {
                                            int width = (view3.getWidth() - view3.getPaddingLeft()) - view3.getPaddingRight();
                                            int height = (view3.getHeight() - view3.getPaddingTop()) - view3.getPaddingBottom();
                                            if (width <= 0 || height <= 0) {
                                                m<Context, RuntimeException, z> mVar3 = gVar2.f4983c;
                                                Context context3 = view3.getContext();
                                                l.a((Object) context3, "");
                                                mVar3.invoke(context3, new b(view3.getClass().getSimpleName() + " in " + a3.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
                                            } else {
                                                arrayList5.add(new h<>(view3.getId(), width, height, aVar2.a()));
                                            }
                                        }
                                        arrayList2 = arrayList5;
                                    }
                                    map.put(a4, arrayList2);
                                }
                                if (!(arrayList2 instanceof List)) {
                                    arrayList2 = null;
                                }
                                List<h<?>> list2 = arrayList2;
                                if (list2 == null) {
                                    list2 = h.a.z.INSTANCE;
                                }
                                Iterator<T> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    it3.next();
                                    e<P> eVar = this.f4971a;
                                    P poll = eVar.f4980a.poll();
                                    eVar.f4980a.offer(poll);
                                    l.a((Object) poll, "");
                                }
                                cVar = this;
                            }
                        }
                    }
                    cVar.f4972c = gVar;
                    cVar.f4973d = a2;
                    return;
                }
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(com.airbnb.epoxy.l lVar, h.f.a.a<? extends P> aVar, m<? super Context, ? super RuntimeException, z> mVar, int i2, List<? extends a<?, ?, ? extends P>> list) {
        this((com.airbnb.epoxy.d) lVar, (h.f.a.a) aVar, mVar, i2, (List) list);
        l.c(lVar, "");
        l.c(aVar, "");
        l.c(mVar, "");
        l.c(list, "");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.airbnb.epoxy.n r7, h.f.a.a<? extends P> r8, h.f.a.m<? super android.content.Context, ? super java.lang.RuntimeException, h.z> r9, int r10, java.util.List<? extends com.airbnb.epoxy.a.a<?, ?, ? extends P>> r11) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            h.f.b.l.c(r7, r0)
            r2 = r8
            h.f.b.l.c(r2, r0)
            r3 = r9
            h.f.b.l.c(r3, r0)
            r5 = r11
            h.f.b.l.c(r5, r0)
            com.airbnb.epoxy.o r1 = r7.getAdapter()
            h.f.b.l.a(r1, r0)
            r0 = r6
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.a.c.<init>(com.airbnb.epoxy.n, h.f.a.a, h.f.a.m, int, java.util.List):void");
    }

    private c(com.airbnb.epoxy.d dVar, h.f.a.a<? extends P> aVar, m<? super Context, ? super RuntimeException, z> mVar, int i2, List<? extends a<?, ?, ? extends P>> list) {
        this.f4978i = dVar;
        this.f4979j = i2;
        this.f4972c = h.j.g.f158754e;
        this.f4973d = h.j.g.f158754e;
        this.f4974e = -1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(n.a((Iterable) list, 10)), 16));
        for (T t : list) {
            linkedHashMap.put(t.f4968a, t);
        }
        this.f4976g = linkedHashMap;
        this.f4971a = new e<>(this.f4979j, aVar);
        this.f4977h = new g(this.f4978i, mVar);
        if (this.f4979j <= 0) {
            throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.f4979j).toString());
        }
    }
}
