package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.i;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.k;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.l;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.inbox.f;
import f.a.t;
import h.a.ag;
import h.a.n;
import h.c.d;
import h.f.b.m;
import h.r;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class FocusedSessionListViewModelImpl extends ac implements a, k<com.ss.android.ugc.aweme.im.service.k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.b<List<com.ss.android.ugc.aweme.im.service.k.a>, z> f101945a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.common.data.a.b<Boolean> f101946b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.l.b<List<com.ss.android.ugc.aweme.im.service.k.a>> f101947c;

    /* renamed from: d  reason: collision with root package name */
    private final am f101948d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f101949e;

    /* renamed from: f  reason: collision with root package name */
    private a f101950f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.b f101951g;

    /* renamed from: h  reason: collision with root package name */
    private final l f101952h;

    static {
        Covode.recordClassIndex(65235);
    }

    public FocusedSessionListViewModelImpl() {
        this((byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a
    public final com.ss.android.ugc.aweme.im.sdk.common.data.a.b<Boolean> a() {
        return this.f101946b;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a
    public final void b() {
        this.f101952h.f();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a
    public final void d() {
        com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.a(this.f101950f.f101953a, this.f101950f.f101954b);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f101952h.b(this);
        an.b(this.f101948d);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a
    public final t<List<com.ss.android.ugc.aweme.im.service.k.a>> c() {
        t<List<com.ss.android.ugc.aweme.im.service.k.a>> a2 = this.f101947c.c().a(f.a.e.b.a.f157188a);
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class b extends m implements h.f.a.b<e.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f101955a = new b();

        static {
            Covode.recordClassIndex(65238);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.c();
            return z.f158842a;
        }
    }

    static final class c extends h.c.b.a.k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ List $result;
        int label;
        final /* synthetic */ FocusedSessionListViewModelImpl this$0;

        static {
            Covode.recordClassIndex(65239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FocusedSessionListViewModelImpl focusedSessionListViewModelImpl, List list, d dVar) {
            super(2, dVar);
            this.this$0 = focusedSessionListViewModelImpl;
            this.$result = list;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new c(this.this$0, this.$result, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.f101945a.invoke(this.$result);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private /* synthetic */ FocusedSessionListViewModelImpl(byte b2) {
        this(new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.c(), l.a.a(), new h.f.a.b<List<? extends com.ss.android.ugc.aweme.im.service.k.a>, z>(i.f102258b) {
            /* class com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(65236);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.im.service.k.a> list) {
                i.a(list);
                return z.f158842a;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a
    public final int b(int i2) {
        List<com.ss.android.ugc.aweme.im.service.k.a> i3;
        if (i2 < 0 || (i3 = this.f101947c.i()) == null) {
            return -1;
        }
        h.f.b.l.b(i3, "");
        int size = i3.size();
        while (i2 < size) {
            if (i3.get(i2).q > 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.a
    public final void a(int i2) {
        this.f101946b.setValue(true);
        f.a(b.f101955a);
        a.C2538a aVar = a.C2538a.f101910a;
        h.f.b.l.d(aVar, "");
        aVar.invoke("click_see_all_activities", ag.a(v.a("tab_name", "chat"), v.a("enter_from", "notification_page"), v.a("notice_type", "previous"), v.a("show_cnt", String.valueOf(i2))));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.controller.e.k
    public final void a(List<com.ss.android.ugc.aweme.im.service.k.a> list) {
        h.f.b.l.d(list, "");
        boolean z = false;
        if (this.f101949e) {
            this.f101949e = false;
            bz unused = kotlinx.coroutines.i.a(this.f101948d, bf.f159041b, null, new c(this, list, null), 2);
        }
        if (h.f.b.l.a((Object) this.f101946b.getValue(), (Object) true)) {
            this.f101950f = new a(list.size(), list.size());
        } else {
            List<com.ss.android.ugc.aweme.im.service.k.a> g2 = n.g((Collection) this.f101951g.a(list));
            this.f101950f = new a(list.size(), g2.size());
            if (g2.size() < list.size()) {
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.b bVar = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.b();
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (!g2.contains(t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList<com.ss.android.ugc.aweme.im.service.k.a> arrayList2 = arrayList;
                ArrayList<Number> arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (com.ss.android.ugc.aweme.im.service.k.a aVar : arrayList2) {
                    arrayList3.add(Integer.valueOf(aVar.q));
                }
                int i2 = 0;
                for (Number number : arrayList3) {
                    i2 += number.intValue();
                }
                bVar.q = i2;
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((com.ss.android.ugc.aweme.im.service.k.a) next).r) {
                        if (next != null) {
                            z = true;
                        }
                    }
                }
                bVar.r = z;
                g2.add(bVar);
            }
            list = g2;
        }
        this.f101947c.onNext(list);
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f101953a;

        /* renamed from: b  reason: collision with root package name */
        public final int f101954b;

        static {
            Covode.recordClassIndex(65237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f101953a == aVar.f101953a && this.f101954b == aVar.f101954b;
        }

        public final int hashCode() {
            return (this.f101953a * 31) + this.f101954b;
        }

        public final String toString() {
            return "SessionListCount(totalChatCount=" + this.f101953a + ", showChatCount=" + this.f101954b + ")";
        }

        public a(int i2, int i3) {
            this.f101953a = i2;
            this.f101954b = i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.im.service.k.a>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private FocusedSessionListViewModelImpl(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.b bVar, l lVar, h.f.a.b<? super List<com.ss.android.ugc.aweme.im.service.k.a>, z> bVar2) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(lVar, "");
        h.f.b.l.d(bVar2, "");
        this.f101951g = bVar;
        this.f101952h = lVar;
        this.f101945a = bVar2;
        com.ss.android.ugc.aweme.im.sdk.common.data.a.b<Boolean> bVar3 = new com.ss.android.ugc.aweme.im.sdk.common.data.a.b<>();
        this.f101946b = bVar3;
        f.a.l.b<List<com.ss.android.ugc.aweme.im.service.k.a>> a2 = f.a.l.b.a((Object) h.a.z.INSTANCE);
        h.f.b.l.b(a2, "");
        this.f101947c = a2;
        this.f101948d = an.a(bf.f159040a);
        this.f101949e = true;
        this.f101950f = new a(0, 0);
        bVar3.setValue(false);
        lVar.a(this);
    }
}
