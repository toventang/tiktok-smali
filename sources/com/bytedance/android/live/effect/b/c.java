package com.bytedance.android.live.effect.b;

import android.content.Context;
import android.os.Looper;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.effect.api.a.i;
import com.bytedance.android.live.effect.api.a.l;
import com.bytedance.android.live.effect.g;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableEffectNewEngineSetting;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.h;
import h.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f9681a = h.i.a(m.SYNCHRONIZED, b.f9694a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f9682b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private String f9683c;

    /* renamed from: d  reason: collision with root package name */
    private String f9684d;

    /* renamed from: e  reason: collision with root package name */
    private l f9685e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.bytedance.android.live.effect.api.a.d> f9686f;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.bytedance.android.live.effect.api.a.c> f9687g;

    /* renamed from: h  reason: collision with root package name */
    private final List<com.bytedance.android.live.effect.model.a.a> f9688h;

    /* renamed from: i  reason: collision with root package name */
    private final List<com.bytedance.android.live.effect.model.a.a> f9689i;

    /* renamed from: j  reason: collision with root package name */
    private final List<com.bytedance.android.live.effect.model.a.a> f9690j;

    /* renamed from: k  reason: collision with root package name */
    private final List<com.bytedance.android.live.effect.model.a.a> f9691k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, List<com.bytedance.android.livesdkapi.depend.model.a>> f9692l;

    /* renamed from: m  reason: collision with root package name */
    private final h f9693m;
    private final ArrayList<com.bytedance.android.live.effect.model.a.a> n;

    private final d f() {
        return (d) this.f9693m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4928);
        }

        public static c a() {
            return (c) c.f9681a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final String d() {
        return this.f9683c;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final String e() {
        return this.f9684d;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(com.bytedance.android.live.effect.api.a.d dVar) {
        h.f.b.l.d(dVar, "");
        if (!this.f9686f.contains(dVar)) {
            this.f9686f.add(dVar);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final Map<String, Map<String, com.bytedance.android.livesdkapi.depend.model.a>> a() {
        List<com.bytedance.android.livesdkapi.depend.model.a> list;
        T t;
        HashMap hashMap = new HashMap();
        List<com.bytedance.android.live.effect.model.a.a> list2 = this.f9688h;
        ArrayList<com.bytedance.android.live.effect.model.a.a> arrayList = new ArrayList();
        for (T t2 : list2) {
            T t3 = t2;
            if (this.f9692l.containsKey(t3.f9875a) && t3.f9882h) {
                arrayList.add(t2);
            }
        }
        for (com.bytedance.android.live.effect.model.a.a aVar : arrayList) {
            if (!hashMap.containsKey(aVar.f9875a)) {
                hashMap.put(aVar.f9875a, new HashMap());
            }
            Object obj = hashMap.get(aVar.f9875a);
            if (obj == null) {
                h.f.b.l.b();
            }
            Map map = (Map) obj;
            if (!map.containsKey(aVar.f9876b) && (list = this.f9692l.get(aVar.f9875a)) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f22997c, (Object) aVar.f9876b)) {
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    String str = t4.f22997c;
                    if (str == null) {
                        h.f.b.l.b();
                    }
                    map.put(str, t4);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        h.f.b.l.b(mainLooper, "");
        if (!h.f.b.l.a(currentThread, mainLooper.getThread())) {
            f.a.a.a.a.a(f.a.a.b.a.f157156a).a(new RunnableC0144c(this, str, aVar));
        } else {
            a(this, str, aVar, true, false, 24);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.i
    public final void a(String str, List<com.bytedance.android.livesdkapi.depend.model.a> list) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(list, "");
        l lVar = this.f9685e;
        if (lVar != null) {
            List list2 = lVar.f9647b;
            if (list2 == null) {
                list2 = new ArrayList();
            }
            if (list2.contains(str) && !this.f9690j.isEmpty()) {
                ArrayList<com.bytedance.android.livesdkapi.depend.model.a> arrayList = new ArrayList();
                for (T t : this.f9690j) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (h.f.b.l.a((Object) t.f9876b, (Object) next.f22997c)) {
                            if (next != null) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                for (com.bytedance.android.livesdkapi.depend.model.a aVar : arrayList) {
                    d(str, aVar);
                }
                List<com.bytedance.android.live.effect.model.a.a> list3 = this.f9690j;
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : list3) {
                    if (h.f.b.l.a((Object) t2.f9875a, (Object) str)) {
                        arrayList2.add(t2);
                    }
                }
                this.f9690j.removeAll(arrayList2);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.i
    public final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar, String str2, float f2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(str2, "");
        a(str, aVar, f2, (Long) null);
    }

    @Override // com.bytedance.android.live.effect.api.a.i
    public final Float a(String str, String str2) {
        T t;
        T t2;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        Iterator<T> it = this.f9688h.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (h.f.b.l.a((Object) t.f9876b, (Object) str)) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null) {
            return null;
        }
        Iterator<T> it2 = t3.f9881g.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (h.f.b.l.a((Object) t2.f9884b, (Object) str2)) {
                break;
            }
        }
        T t4 = t2;
        if (t4 == null) {
            return null;
        }
        return t4.f9883a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0158, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0193, code lost:
        r2.add(r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a(boolean r16) {
        /*
        // Method dump skipped, instructions count: 614
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.c.a(boolean):void");
    }

    private static boolean a(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (Integer num : list) {
            if (list2.contains(Integer.valueOf(num.intValue()))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(String str) {
        h.f.b.l.d(str, "");
        List<com.bytedance.android.live.effect.model.a.a> list = this.f9688h;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (h.f.b.l.a((Object) t.f9875a, (Object) str)) {
                arrayList.add(t);
            }
        }
        ArrayList<com.bytedance.android.live.effect.model.a.a> arrayList2 = arrayList;
        ArrayList<com.bytedance.android.livesdkapi.depend.model.a> arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (com.bytedance.android.live.effect.model.a.a aVar : arrayList2) {
            arrayList3.add(a(aVar));
        }
        for (com.bytedance.android.livesdkapi.depend.model.a aVar2 : arrayList3) {
            if (aVar2 != null) {
                c(str, aVar2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072 A[RETURN] */
    @Override // com.bytedance.android.live.effect.api.a.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.bytedance.android.livesdkapi.depend.model.a r7) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.c.a(com.bytedance.android.livesdkapi.depend.model.a):boolean");
    }

    static final class b extends h.f.b.m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9694a = new b();

        static {
            Covode.recordClassIndex(4929);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c((byte) 0);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.b.c$c  reason: collision with other inner class name */
    static final class RunnableC0144c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9696b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.a f9697c;

        static {
            Covode.recordClassIndex(4930);
        }

        RunnableC0144c(c cVar, String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
            this.f9695a = cVar;
            this.f9696b = str;
            this.f9697c = aVar;
        }

        public final void run() {
            c.a(this.f9695a, this.f9696b, this.f9697c, true, false, 24);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f9698a = new d();

        static {
            Covode.recordClassIndex(4931);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            Context e2 = y.e();
            h.f.b.l.b(e2, "");
            return new d(e2);
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void c() {
        this.n.clear();
        this.f9689i.clear();
        a(true);
    }

    static {
        Covode.recordClassIndex(4927);
    }

    private c() {
        this.f9686f = new CopyOnWriteArrayList();
        this.f9687g = new ArrayList();
        this.f9688h = new ArrayList();
        this.f9689i = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f9690j = arrayList;
        this.f9691k = new ArrayList();
        this.f9692l = new HashMap();
        this.f9693m = h.i.a((h.f.a.a) d.f9698a);
        arrayList.addAll(f().a());
        this.n = new ArrayList<>();
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void b() {
        com.bytedance.android.live.effect.api.a.b bVar;
        com.bytedance.android.live.effect.api.a.b bVar2;
        List list;
        if (this.f9685e != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f9688h) {
                if (!arrayList.contains(t.f9875a)) {
                    arrayList.add(t.f9875a);
                }
            }
            for (T t2 : this.f9690j) {
                if (!arrayList.contains(t2.f9875a)) {
                    this.f9688h.add(t2);
                }
            }
            this.f9690j.clear();
            List<com.bytedance.android.live.effect.model.a.a> list2 = this.f9690j;
            List<com.bytedance.android.live.effect.model.a.a> list3 = this.f9688h;
            ArrayList arrayList2 = new ArrayList();
            for (T t3 : list3) {
                T t4 = t3;
                l lVar = this.f9685e;
                if (lVar == null || (list = lVar.f9647b) == null) {
                    list = new ArrayList();
                }
                if (list.contains(t4.f9875a)) {
                    arrayList2.add(t3);
                }
            }
            list2.addAll(arrayList2);
            l lVar2 = this.f9685e;
            if (!(lVar2 == null || lVar2.f9648c == null)) {
                try {
                    l lVar3 = this.f9685e;
                    if (!(lVar3 == null || (bVar2 = lVar3.f9648c) == null)) {
                        bVar2.a(new String[0]);
                    }
                    l lVar4 = this.f9685e;
                    if (!(lVar4 == null || (bVar = lVar4.f9648c) == null)) {
                        bVar.a();
                    }
                } catch (Throwable th) {
                    com.bytedance.android.live.core.c.a.a("LiveComposerManagerB", th);
                }
            }
            this.f9688h.clear();
            this.f9692l.clear();
            f().a(this.f9690j);
            this.f9686f.clear();
            this.f9687g.clear();
            this.f9689i.clear();
            this.n.clear();
            this.f9685e = null;
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void c(String str) {
        this.f9683c = str;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(l lVar) {
        h.f.b.l.d(lVar, "");
        this.f9685e = lVar;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void d(String str) {
        this.f9684d = str;
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void b(com.bytedance.android.live.effect.api.a.c cVar) {
        h.f.b.l.d(cVar, "");
        this.f9687g.remove(cVar);
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void a(com.bytedance.android.live.effect.api.a.c cVar) {
        h.f.b.l.d(cVar, "");
        if (!this.f9687g.contains(cVar)) {
            this.f9687g.add(cVar);
        }
    }

    private final com.bytedance.android.livesdkapi.depend.model.a a(com.bytedance.android.live.effect.model.a.a aVar) {
        List<com.bytedance.android.livesdkapi.depend.model.a> list = this.f9692l.get(aVar.f9875a);
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (h.f.b.l.a((Object) next.f22997c, (Object) aVar.f9876b)) {
                t = next;
                break;
            }
        }
        return t;
    }

    private final void b(List<com.bytedance.android.live.effect.model.a.a> list) {
        com.bytedance.android.live.effect.api.a.b bVar;
        float f2;
        for (T t : list) {
            for (T t2 : t.f9881g) {
                l lVar = this.f9685e;
                if (!(lVar == null || (bVar = lVar.f9648c) == null)) {
                    String str = t.f9877c;
                    String str2 = t2.f9884b;
                    Float f3 = t2.f9883a;
                    if (f3 != null) {
                        f2 = f3.floatValue();
                    } else {
                        f2 = 0.0f;
                    }
                    bVar.a(str, str2, f2);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final void b(com.bytedance.android.live.effect.api.a.d dVar) {
        h.f.b.l.d(dVar, "");
        this.f9686f.remove(dVar);
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    public final List<com.bytedance.android.livesdkapi.depend.model.a> b(String str) {
        List<com.bytedance.android.livesdkapi.depend.model.a> list;
        T t;
        float f2;
        Float f3;
        h.f.b.l.d(str, "");
        HashMap hashMap = new HashMap();
        if (!this.f9692l.containsKey(str)) {
            return n.k(hashMap.values());
        }
        List<com.bytedance.android.live.effect.model.a.a> list2 = this.f9688h;
        ArrayList<com.bytedance.android.live.effect.model.a.a> arrayList = new ArrayList();
        for (T t2 : list2) {
            T t3 = t2;
            if (h.f.b.l.a((Object) t3.f9875a, (Object) str) && this.f9692l.containsKey(t3.f9875a) && t3.f9882h) {
                arrayList.add(t2);
            }
        }
        for (com.bytedance.android.live.effect.model.a.a aVar : arrayList) {
            if (!hashMap.containsKey(aVar.f9876b) && (list = this.f9692l.get(str)) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f22997c, (Object) aVar.f9876b)) {
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    hashMap.put(t4.f22997c, t4);
                    for (T t5 : t4.n) {
                        com.bytedance.android.live.effect.model.a.b bVar = (com.bytedance.android.live.effect.model.a.b) n.h((List) aVar.f9881g);
                        if (bVar == null || (f3 = bVar.f9883a) == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = f3.floatValue();
                        }
                        t5.f23014g = e.a((com.bytedance.android.livesdkapi.depend.model.a) t4, f2);
                    }
                }
            }
        }
        return n.k(hashMap.values());
    }

    @Override // com.bytedance.android.live.effect.api.a.i
    public final List<com.bytedance.android.livesdkapi.depend.model.a> e(String str) {
        List<com.bytedance.android.livesdkapi.depend.model.a> list;
        T t;
        h.f.b.l.d(str, "");
        HashMap hashMap = new HashMap();
        if (!this.f9692l.containsKey(str)) {
            return n.k(hashMap.values());
        }
        List<com.bytedance.android.live.effect.model.a.a> list2 = this.f9688h;
        ArrayList<com.bytedance.android.live.effect.model.a.a> arrayList = new ArrayList();
        for (T t2 : list2) {
            T t3 = t2;
            if (h.f.b.l.a((Object) t3.f9875a, (Object) str) && this.f9692l.containsKey(t3.f9875a)) {
                arrayList.add(t2);
            }
        }
        for (com.bytedance.android.live.effect.model.a.a aVar : arrayList) {
            if (!hashMap.containsKey(aVar.f9876b) && (list = this.f9692l.get(str)) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (h.f.b.l.a((Object) t.f22997c, (Object) aVar.f9876b)) {
                        break;
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    hashMap.put(t4.f22997c, t4);
                }
            }
        }
        return n.k(hashMap.values());
    }

    private final void a(List<com.bytedance.android.live.effect.model.a.a> list) {
        com.bytedance.android.live.effect.api.a.b bVar;
        com.bytedance.android.live.effect.api.a.b bVar2;
        if (LiveEnableEffectNewEngineSetting.INSTANCE.getValue()) {
            String[] a2 = e.a(list, false);
            String[] a3 = e.a(this.f9692l, a2);
            l lVar = this.f9685e;
            if (lVar != null && (bVar2 = lVar.f9648c) != null) {
                bVar2.b(a2, a3);
                return;
            }
            return;
        }
        l lVar2 = this.f9685e;
        if (lVar2 != null && (bVar = lVar2.f9648c) != null) {
            bVar.b(e.a(list, false));
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.i
    public final int b(String str, String str2) {
        com.bytedance.android.live.effect.api.a.b bVar;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        int[] iArr = new int[1];
        l lVar = this.f9685e;
        if (!(lVar == null || (bVar = lVar.f9648c) == null)) {
            bVar.a(str, str2, iArr);
        }
        return iArr[0];
    }

    private final void c(String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
        T t;
        List list;
        if (this.f9685e != null) {
            Iterator<T> it = this.f9688h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (h.f.b.l.a((Object) t.f9876b, (Object) aVar.f22997c)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                this.f9688h.remove(t2);
                l lVar = this.f9685e;
                if (lVar == null || (list = lVar.f9650e) == null) {
                    list = new ArrayList();
                }
                if (list.contains(t2.f9875a)) {
                    t2.f9882h = false;
                    this.f9688h.add(t2);
                }
                a(false);
                Iterator<T> it2 = this.f9686f.iterator();
                while (it2.hasNext()) {
                    it2.next().a(false, str, aVar);
                }
            }
        }
    }

    private static ArrayList<com.bytedance.android.live.effect.model.a.b> a(com.bytedance.android.livesdkapi.depend.model.a aVar, List<com.bytedance.android.live.effect.model.a.b> list) {
        ArrayList<com.bytedance.android.live.effect.model.a.b> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        List<a.b> list2 = aVar.n;
        ArrayList<a.b> arrayList2 = new ArrayList();
        for (T t : list2) {
            T t2 = t;
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t3 = next;
                if (h.f.b.l.a((Object) t3.f9884b, (Object) t2.f23010c) && t3.f9883a != null) {
                    if (next != null) {
                    }
                }
            }
            arrayList2.add(t);
        }
        for (a.b bVar : arrayList2) {
            Iterator<com.bytedance.android.live.effect.model.a.b> it2 = arrayList.iterator();
            h.f.b.l.b(it2, "");
            while (it2.hasNext()) {
                if (h.f.b.l.a((Object) it2.next().f9884b, (Object) bVar.f23010c)) {
                    it2.remove();
                }
            }
            com.bytedance.android.live.effect.model.a.b bVar2 = new com.bytedance.android.live.effect.model.a.b(bVar.f23010c);
            bVar2.f9883a = Float.valueOf(e.a(bVar, bVar.f23009b));
            arrayList.add(bVar2);
        }
        ArrayList<String> arrayList3 = aVar.p;
        ArrayList<String> arrayList4 = new ArrayList();
        for (T t4 : arrayList3) {
            Iterator<T> it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next2 = it3.next();
                if (h.f.b.l.a((Object) next2.f9884b, (Object) t4)) {
                    if (next2 != null) {
                    }
                }
            }
            arrayList4.add(t4);
        }
        for (String str : arrayList4) {
            arrayList.add(new com.bytedance.android.live.effect.model.a.b(str));
        }
        return arrayList;
    }

    private void d(String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
        T t;
        float f2;
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        if (com.bytedance.android.live.effect.f.b.a(aVar)) {
            List<com.bytedance.android.livesdkapi.depend.model.a> list = aVar.o;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    d(str, it.next());
                }
                return;
            }
            return;
        }
        Iterator<T> it2 = this.f9690j.iterator();
        while (true) {
            t = null;
            if (!it2.hasNext()) {
                break;
            }
            t = it2.next();
            T t2 = t;
            if (!g.a(aVar)) {
                if (h.f.b.l.a((Object) t2.f9876b, (Object) aVar.f22997c)) {
                    this.f9691k.add(t2);
                }
            } else if (h.f.b.l.a((Object) t2.f9876b, (Object) aVar.f22997c)) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            Iterator<T> it3 = t3.f9881g.iterator();
            while (it3.hasNext()) {
                aVar.p.add(it3.next().f9884b);
            }
            Iterator<T> it4 = t3.f9881g.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                if (next.f9883a != null) {
                    if (next != null) {
                        a(str, aVar, false, t3.f9882h, Long.valueOf(t3.f9879e));
                        List<com.bytedance.android.live.effect.model.a.b> list2 = t3.f9881g;
                        ArrayList<com.bytedance.android.live.effect.model.a.b> arrayList = new ArrayList();
                        for (T t4 : list2) {
                            if (t4.f9883a != null) {
                                arrayList.add(t4);
                            }
                        }
                        for (com.bytedance.android.live.effect.model.a.b bVar : arrayList) {
                            Float f3 = bVar.f9883a;
                            if (f3 != null) {
                                f2 = f3.floatValue();
                            } else {
                                f2 = 0.0f;
                            }
                            a(str, aVar, f2, Long.valueOf(t3.f9879e));
                        }
                        return;
                    }
                }
            }
            a(str, aVar, t3.f9882h, t3.f9882h, Long.valueOf(t3.f9879e));
        }
    }

    @Override // com.bytedance.android.live.effect.api.a.i
    public final void b(String str, com.bytedance.android.livesdkapi.depend.model.a aVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        c(str, aVar);
    }

    private final void a(String str, com.bytedance.android.live.effect.model.a.a aVar, com.bytedance.android.livesdkapi.depend.model.a aVar2) {
        float f2;
        for (com.bytedance.android.live.effect.model.a.b bVar : aVar.f9881g) {
            if (bVar.f9883a != null) {
                Iterator<T> it = aVar2.n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (h.f.b.l.a((Object) next.f23010c, (Object) bVar.f9884b)) {
                        if (next != null) {
                            Float f3 = bVar.f9883a;
                            if (f3 != null) {
                                f2 = f3.floatValue();
                            } else {
                                f2 = 0.0f;
                            }
                            a(str, aVar2, f2, Long.valueOf(aVar.f9879e));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r2 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        r5 = false;
        a(r12, r13, r14, false, false, 16);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r13, com.bytedance.android.livesdkapi.depend.model.a r14, float r15, java.lang.Long r16) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.c.a(java.lang.String, com.bytedance.android.livesdkapi.depend.model.a, float, java.lang.Long):void");
    }

    private final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar, boolean z, boolean z2, Long l2) {
        T t;
        T t2;
        long currentTimeMillis;
        long currentTimeMillis2;
        boolean z3;
        List<String> list;
        l lVar;
        List<com.bytedance.android.live.effect.api.a.a> list2;
        if (this.f9685e != null) {
            if (!(!aVar.r.isEmpty() || (lVar = this.f9685e) == null || (list2 = lVar.f9646a) == null)) {
                ArrayList<com.bytedance.android.live.effect.api.a.a> arrayList = new ArrayList();
                for (T t3 : list2) {
                    if (h.f.b.l.a((Object) t3.f9643b, (Object) str)) {
                        arrayList.add(t3);
                    }
                }
                for (com.bytedance.android.live.effect.api.a.a aVar2 : arrayList) {
                    aVar.r.addAll(aVar2.f9642a);
                }
            }
            if (aVar.s == null) {
                l lVar2 = this.f9685e;
                if (lVar2 == null || (list = lVar2.f9649d) == null) {
                    z3 = false;
                } else {
                    z3 = list.contains(str);
                }
                aVar.s = Boolean.valueOf(z3);
            }
            if (!this.f9692l.containsKey(str)) {
                this.f9692l.put(str, new ArrayList());
            }
            List<com.bytedance.android.livesdkapi.depend.model.a> list3 = this.f9692l.get(str);
            if (list3 != null) {
                list3.remove(aVar);
                list3.add(aVar);
            }
            Iterator<T> it = this.f9688h.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (h.f.b.l.a((Object) t2.f9876b, (Object) aVar.f22997c)) {
                    break;
                }
            }
            T t4 = t2;
            if (t4 == null) {
                String str2 = aVar.f22997c;
                String str3 = aVar.f23001g;
                Boolean bool = aVar.s;
                if (bool == null) {
                    h.f.b.l.b();
                }
                boolean booleanValue = bool.booleanValue();
                if (l2 != null) {
                    currentTimeMillis = l2.longValue();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                com.bytedance.android.live.effect.model.a.a aVar3 = new com.bytedance.android.live.effect.model.a.a(str, str2, str3, booleanValue, currentTimeMillis);
                aVar3.f9882h = z2;
                aVar3.f9880f.addAll(aVar.r);
                ArrayList<com.bytedance.android.live.effect.model.a.b> a2 = a(aVar, aVar3.f9881g);
                aVar3.f9881g.clear();
                aVar3.f9881g.addAll(a2);
                this.f9688h.add(aVar3);
            } else if (t4.f9882h != z2 || l2 != null) {
                boolean z4 = t4.f9882h;
                this.f9688h.remove(t4);
                ArrayList<com.bytedance.android.live.effect.model.a.b> a3 = a(aVar, t4.f9881g);
                t4.f9881g.clear();
                t4.f9881g.addAll(a3);
                if (l2 != null) {
                    currentTimeMillis2 = l2.longValue();
                } else {
                    currentTimeMillis2 = System.currentTimeMillis();
                }
                t4.f9879e = currentTimeMillis2;
                t4.f9882h = z2;
                this.f9688h.add(t4);
                if (z4 == z2) {
                    return;
                }
            } else {
                return;
            }
            Iterator<T> it2 = this.f9691k.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (h.f.b.l.a((Object) next.f9876b, (Object) aVar.f22997c)) {
                    t = next;
                    break;
                }
            }
            T t5 = t;
            if (t5 != null) {
                a(str, t5, aVar);
                this.f9691k.remove(t5);
            }
            if (z) {
                a(false);
            }
            Iterator<T> it3 = this.f9686f.iterator();
            while (it3.hasNext()) {
                it3.next().a(true, str, aVar);
            }
        }
    }

    static /* synthetic */ void a(c cVar, String str, com.bytedance.android.livesdkapi.depend.model.a aVar, boolean z, boolean z2, int i2) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        cVar.a(str, aVar, z, z2, null);
    }
}
