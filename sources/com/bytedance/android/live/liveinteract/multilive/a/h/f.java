package com.bytedance.android.live.liveinteract.multilive.a.h;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f11584a;
    @d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11585b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.e.b f11586c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.common.e.a.a f11587d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11588e = true;

    /* renamed from: f  reason: collision with root package name */
    public final DataChannel f11589f;

    /* renamed from: g  reason: collision with root package name */
    private final h f11590g = i.a((h.f.a.a) b.f11592a);

    static {
        Covode.recordClassIndex(6286);
    }

    private final List<View> c() {
        return (List) this.f11590g.getValue();
    }

    static final class b extends m implements h.f.a.a<ArrayList<View>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f11592a = new b();

        static {
            Covode.recordClassIndex(6288);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ArrayList<View> invoke() {
            return new ArrayList();
        }
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a a() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11585b;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        return aVar;
    }

    public final n b() {
        n c2;
        com.bytedance.android.live.liveinteract.multilive.e.b bVar = this.f11586c;
        if (bVar == null || (c2 = bVar.c()) == null) {
            return n.NORMAL;
        }
        return c2;
    }

    public f(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f11589f = dataChannel;
        e.f10014a.a(this);
    }

    public static void a(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar) {
        aVar.setPosInMultiLive((int) g.a.f14199a.c(g.a.f14199a.a(aVar.getInteractId())));
    }

    public final void a(View view) {
        l.d(view, "");
        com.bytedance.android.live.liveinteract.multilive.e.b bVar = this.f11586c;
        if (bVar != null) {
            bVar.a(view);
            c().remove(view);
        }
    }

    public final void a(boolean z) {
        com.bytedance.android.live.liveinteract.multilive.e.b bVar = this.f11586c;
        if (bVar instanceof a) {
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.window.BaseGuestLayout");
            ((a) bVar).a(z);
        }
    }

    public final boolean a(n nVar) {
        n nVar2;
        com.bytedance.android.live.liveinteract.multilive.e.b bVar;
        com.bytedance.android.live.liveinteract.multilive.e.b bVar2;
        MethodCollector.i(6397);
        l.d(nVar, "");
        com.bytedance.android.live.liveinteract.multilive.e.b bVar3 = this.f11586c;
        if (bVar3 != null) {
            nVar2 = bVar3.c();
        } else {
            nVar2 = null;
        }
        if (nVar2 == nVar) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11585b;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            aVar.a(nVar);
            MethodCollector.o(6397);
            return false;
        }
        for (T t : c()) {
            if (t instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                t.setAdjustParent(true);
            }
        }
        com.bytedance.android.live.liveinteract.multilive.e.b bVar4 = this.f11586c;
        if (bVar4 != null) {
            ViewGroup viewGroup = this.f11584a;
            if (viewGroup == null) {
                l.a("mContentView");
            }
            bVar4.b(viewGroup);
        }
        int i2 = g.f11594a[nVar.ordinal()];
        if (i2 == 1) {
            bVar = new c(this.f11589f);
        } else if (i2 == 2) {
            bVar = new b(this.f11589f);
        } else if (i2 == 3) {
            bVar = new e(this.f11589f);
        } else if (i2 == 4) {
            bVar = new d(this.f11589f);
        } else if (i2 != 5) {
            MethodCollector.o(6397);
            return false;
        } else {
            bVar = new com.bytedance.android.live.liveinteract.multilive.anchor.f.h(this.f11589f);
        }
        this.f11586c = bVar;
        ViewGroup viewGroup2 = this.f11584a;
        if (viewGroup2 == null) {
            l.a("mContentView");
        }
        bVar.a(viewGroup2);
        com.bytedance.android.live.liveinteract.multilive.e.b bVar5 = this.f11586c;
        if (bVar5 != null) {
            bVar5.b(this.f11588e);
        }
        if (c().size() > 1) {
            List<View> c2 = c();
            if (c2.size() > 1) {
                h.a.n.a((List) c2, (Comparator) new a(this));
            }
        } else if (c().size() == 1) {
            View view = c().get(0);
            if (view instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                a((com.bytedance.android.live.liveinteract.multiguest.g.b.a) view);
            }
        }
        for (T t2 : c()) {
            int i3 = -1;
            boolean z = t2 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a;
            if (z) {
                T t3 = t2;
                i3 = t3.getPosInMultiLive();
                t3.setAdjustParent(true);
            }
            ViewParent parent = t2.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(t2);
            }
            com.bytedance.android.live.liveinteract.multilive.e.b bVar6 = this.f11586c;
            if (bVar6 != null) {
                bVar6.a(t2, i3);
            }
            if (z) {
                t2.setAdjustParent(false);
            }
        }
        if (c().isEmpty() && (bVar2 = this.f11586c) != null) {
            bVar2.p();
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11585b;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        aVar2.a(nVar);
        this.f11589f.c(com.bytedance.android.live.liveinteract.multilive.c.h.class);
        MethodCollector.o(6397);
        return true;
    }

    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11591a;

        static {
            Covode.recordClassIndex(6287);
        }

        public a(f fVar) {
            this.f11591a = fVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i2;
            T t3 = t;
            int i3 = -1;
            if (t3 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                T t4 = t3;
                f.a((com.bytedance.android.live.liveinteract.multiguest.g.b.a) t4);
                i2 = t4.getPosInMultiLive();
            } else {
                i2 = -1;
            }
            Integer valueOf = Integer.valueOf(i2);
            T t5 = t2;
            if (t5 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                T t6 = t5;
                f.a((com.bytedance.android.live.liveinteract.multiguest.g.b.a) t6);
                i3 = t6.getPosInMultiLive();
            }
            return h.b.a.a(valueOf, Integer.valueOf(i3));
        }
    }

    public static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f11593a;

        static {
            Covode.recordClassIndex(6289);
        }

        public c(f fVar) {
            this.f11593a = fVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i2;
            String str;
            String str2;
            T t3 = t;
            List<com.bytedance.android.livesdk.chatroom.model.b.c> list = this.f11593a.a().n;
            int i3 = 0;
            if (list != null) {
                Iterator<com.bytedance.android.livesdk.chatroom.model.b.c> it = list.iterator();
                i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.android.livesdk.chatroom.model.b.c next = it.next();
                    if (t3 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                        str2 = t3.getInteractId();
                    } else {
                        str2 = "";
                    }
                    if (l.a((Object) next.f15716g, (Object) str2)) {
                        break;
                    }
                    i2++;
                }
            }
            i2 = -1;
            int i4 = Integer.MAX_VALUE;
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i2);
            T t4 = t2;
            List<com.bytedance.android.livesdk.chatroom.model.b.c> list2 = this.f11593a.a().n;
            if (list2 != null) {
                Iterator<com.bytedance.android.livesdk.chatroom.model.b.c> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.bytedance.android.livesdk.chatroom.model.b.c next2 = it2.next();
                    if (t4 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                        str = t4.getInteractId();
                    } else {
                        str = "";
                    }
                    if (!l.a((Object) next2.f15716g, (Object) str)) {
                        i3++;
                    } else if (i3 != -1) {
                        i4 = i3;
                    }
                }
            }
            return h.b.a.a(valueOf, Integer.valueOf(i4));
        }
    }

    public final void a(View view, int i2) {
        MethodCollector.i(6524);
        l.d(view, "");
        com.bytedance.android.live.liveinteract.multilive.e.b bVar = this.f11586c;
        if (bVar == null || (bVar instanceof com.bytedance.android.live.liveinteract.multilive.anchor.f.h)) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11585b;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            a(aVar.q);
        }
        com.bytedance.android.live.liveinteract.multilive.e.b bVar2 = this.f11586c;
        if (bVar2 != null) {
            bVar2.a(view, i2);
            c().add(view);
        }
        if (!this.f11588e && c().size() > 1) {
            com.bytedance.android.live.liveinteract.multilive.e.b bVar3 = this.f11586c;
            if (bVar3 == null) {
                MethodCollector.o(6524);
                return;
            } else if (bVar3.d()) {
                MethodCollector.o(6524);
                return;
            } else {
                ArrayList arrayList = new ArrayList(c());
                if (c().size() > 1) {
                    List<View> c2 = c();
                    if (c2.size() > 1) {
                        h.a.n.a((List) c2, (Comparator) new c(this));
                    }
                }
                boolean z = false;
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h.a.n.a();
                    }
                    if (!l.a(obj, c().get(i3))) {
                        z = true;
                    }
                    i3 = i4;
                }
                if (z) {
                    int i5 = 0;
                    for (T t : c()) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            h.a.n.a();
                        }
                        T t2 = t;
                        if (t2 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                            T t3 = t2;
                            t3.setAdjustParent(true);
                            t3.setPosInMultiLive(i6);
                        }
                        ViewParent parent = t2.getParent();
                        if (parent != null) {
                            ((ViewGroup) parent).removeView(t2);
                        }
                        i5 = i6;
                    }
                    int i7 = 0;
                    for (T t4 : c()) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            h.a.n.a();
                        }
                        T t5 = t4;
                        com.bytedance.android.live.liveinteract.multilive.e.b bVar4 = this.f11586c;
                        if (bVar4 != null) {
                            bVar4.a(t5, i8);
                        }
                        if (t5 instanceof com.bytedance.android.live.liveinteract.multiguest.g.b.a) {
                            t5.setAdjustParent(false);
                        }
                        i7 = i8;
                    }
                }
            }
        }
        MethodCollector.o(6524);
    }
}
