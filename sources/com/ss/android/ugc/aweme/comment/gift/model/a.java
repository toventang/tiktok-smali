package com.ss.android.ugc.aweme.comment.gift.model;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.e;
import com.ss.ugc.live.a.a.k;
import h.f.b.l;
import h.j.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a implements com.ss.ugc.live.a.a.a<String> {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, k> f71935a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    static final List<com.ss.ugc.live.a.a.b> f71936b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    static final Handler f71937c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    static int f71938d;

    /* renamed from: e  reason: collision with root package name */
    static int f71939e;

    /* renamed from: f  reason: collision with root package name */
    public static e f71940f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f71941g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final Deque<com.ss.ugc.live.a.a.c> f71942h = new ArrayDeque();

    private a() {
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.a.a.c f71948a;

        static {
            Covode.recordClassIndex(44229);
        }

        d(com.ss.ugc.live.a.a.c cVar) {
            this.f71948a = cVar;
        }

        public final void run() {
            this.f71948a.b();
            a.f71941g.a(this.f71948a);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.a.a.c f71945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f71946b;

        static {
            Covode.recordClassIndex(44227);
        }

        b(com.ss.ugc.live.a.a.c cVar, int i2) {
            this.f71945a = cVar;
            this.f71946b = i2;
        }

        public final void run() {
            k kVar = a.f71935a.get(this.f71945a.f154004a);
            if (kVar != null) {
                Iterator<com.ss.ugc.live.a.a.d> it = kVar.f154061b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(44225);
    }

    public final void a() {
        int i2;
        int i3;
        int i4 = f71938d;
        e eVar = f71940f;
        if (eVar != null) {
            i2 = eVar.f154028d;
        } else {
            i2 = 0;
        }
        if (i4 < i2) {
            Deque<com.ss.ugc.live.a.a.c> deque = f71942h;
            if (!deque.isEmpty()) {
                int i5 = f71939e;
                e eVar2 = f71940f;
                if (eVar2 != null) {
                    i3 = eVar2.f154029e;
                } else {
                    i3 = 0;
                }
                if (1 <= i3 && i5 >= i3) {
                    c();
                    f71939e = 0;
                    return;
                }
                f71938d++;
                a(deque.poll());
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.a.a.c f71947a;

        static {
            Covode.recordClassIndex(44228);
        }

        c(com.ss.ugc.live.a.a.c cVar) {
            this.f71947a = cVar;
        }

        public final void run() {
            a aVar = a.f71941g;
            com.ss.ugc.live.a.a.c cVar = this.f71947a;
            String str = cVar.f154004a;
            String b2 = a.b(cVar);
            k kVar = a.f71935a.get(str);
            if (kVar != null) {
                for (com.ss.ugc.live.a.a.d dVar : kVar.f154061b) {
                    dVar.a(b2);
                }
            }
            a.f71935a.remove(str);
            for (com.ss.ugc.live.a.a.b bVar : a.f71936b) {
                bVar.a(cVar.f154005b, cVar);
            }
            a.f71938d--;
            a.f71939e = 0;
            aVar.a();
        }
    }

    private static void b() {
        e eVar = f71940f;
        if (eVar == null) {
            throw new IllegalStateException("Gift Resource config has to be initialized");
        } else if (eVar.f154025a != null) {
            e eVar2 = f71940f;
            if (eVar2 == null || eVar2.f154026b == null) {
                throw new IllegalStateException("Producer Factory has to be initialized");
            }
        } else {
            throw new IllegalStateException("File Cache Factory has to be initialized");
        }
    }

    private static void c() {
        f71942h.iterator();
        while (true) {
            Deque<com.ss.ugc.live.a.a.c> deque = f71942h;
            if (deque.peek() != null) {
                com.ss.ugc.live.a.a.c poll = deque.poll();
                Map<String, k> map = f71935a;
                if (poll == null) {
                    l.b();
                }
                k kVar = map.get(poll.f154004a);
                if (kVar != null) {
                    for (com.ss.ugc.live.a.a.d dVar : kVar.f154061b) {
                        dVar.a();
                    }
                    f71935a.remove(poll.f154004a);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.model.a$a  reason: collision with other inner class name */
    static final class RunnableC1618a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.a.a.c f71943a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.ugc.live.a.a.c.a f71944b;

        static {
            Covode.recordClassIndex(44226);
        }

        RunnableC1618a(com.ss.ugc.live.a.a.c cVar, com.ss.ugc.live.a.a.c.a aVar) {
            this.f71943a = cVar;
            this.f71944b = aVar;
        }

        public final void run() {
            int i2;
            k kVar = a.f71935a.get(this.f71943a.f154004a);
            if (kVar != null) {
                int length = this.f71943a.f154006c.length;
                e eVar = a.f71940f;
                int i3 = 0;
                if (eVar != null) {
                    i2 = eVar.f154027c;
                } else {
                    i2 = 0;
                }
                if (this.f71943a.f154011h < h.b(length, i2) - 1) {
                    com.ss.ugc.live.a.a.c cVar = this.f71943a;
                    Handler handler = a.f71937c;
                    d dVar = new d(cVar);
                    e eVar2 = a.f71940f;
                    if (eVar2 != null) {
                        i3 = eVar2.a();
                    }
                    handler.postDelayed(dVar, (long) i3);
                    return;
                }
                for (com.ss.ugc.live.a.a.d dVar2 : kVar.f154061b) {
                    dVar2.a(this.f71944b);
                }
            }
            a.f71935a.remove(this.f71943a.f154004a);
            for (com.ss.ugc.live.a.a.b bVar : a.f71936b) {
                bVar.a(this.f71944b);
            }
            a.f71938d--;
            a.f71939e++;
            a.f71941g.a();
        }
    }

    public final void a(com.ss.ugc.live.a.a.c cVar) {
        com.ss.ugc.live.a.a.d.d dVar;
        com.ss.ugc.live.a.a.d.a aVar;
        e eVar = f71940f;
        if (eVar == null || (aVar = eVar.f154026b) == null) {
            dVar = null;
        } else {
            dVar = aVar.a(cVar, f71940f);
        }
        Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.ugc.live.gift.resource.producer.Producer<kotlin.String>");
        dVar.a(cVar, this);
    }

    static String b(com.ss.ugc.live.a.a.c cVar) {
        String str;
        com.ss.ugc.live.a.a.a.b bVar;
        e eVar = f71940f;
        if (eVar == null || (bVar = eVar.f154025a) == null) {
            str = null;
        } else {
            str = bVar.a(cVar);
        }
        String a2 = com.ss.ugc.live.a.a.e.b.a(str);
        if (!cVar.f154009f) {
            try {
                a2 = a2 + com.ss.ugc.live.a.a.e.a.a(cVar.f154006c[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(com.ss.ugc.live.a.a.c cVar, int i2) {
        l.d(cVar, "");
        f71937c.post(new b(cVar, i2));
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(com.ss.ugc.live.a.a.c cVar, com.ss.ugc.live.a.a.c.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        f71937c.post(new RunnableC1618a(cVar, aVar));
    }

    public final void a(com.ss.ugc.live.a.a.c cVar, com.ss.ugc.live.a.a.d dVar) {
        e eVar;
        String str;
        l.d(cVar, "");
        l.d(dVar, "");
        b();
        if (!(cVar == null || (eVar = f71940f) == null)) {
            com.ss.ugc.live.a.a.a.b bVar = eVar.f154025a;
            if (bVar != null) {
                str = bVar.a(cVar);
            } else {
                str = null;
            }
            if (new File(com.ss.ugc.live.a.a.e.b.a(str) + ".fetched").exists()) {
                dVar.a(b(cVar));
                return;
            }
        }
        String str2 = cVar.f154004a;
        Map<String, k> map = f71935a;
        if (map.containsKey(str2)) {
            if (cVar.f154010g) {
                k kVar = map.get(str2);
                if (kVar == null) {
                    l.b();
                }
                com.ss.ugc.live.a.a.c cVar2 = kVar.f154060a;
                if (cVar2 != null) {
                    Deque<com.ss.ugc.live.a.a.c> deque = f71942h;
                    if (deque.contains(cVar2)) {
                        deque.remove(cVar2);
                    }
                }
                cVar.b();
                f71942h.addFirst(cVar);
            }
            k kVar2 = map.get(str2);
            if (kVar2 == null) {
                l.b();
            }
            kVar2.a(dVar);
            return;
        }
        k kVar3 = new k(cVar);
        kVar3.a(dVar);
        l.b(str2, "");
        map.put(str2, kVar3);
        cVar.b();
        if (cVar.f154010g) {
            f71942h.addFirst(cVar);
        } else {
            f71942h.add(cVar);
        }
        a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.ss.ugc.live.a.a.a
    public final /* synthetic */ void a(com.ss.ugc.live.a.a.c cVar, String str) {
        String str2;
        com.ss.ugc.live.a.a.a.b bVar;
        l.d(cVar, "");
        b();
        e eVar = f71940f;
        if (eVar == null || (bVar = eVar.f154025a) == null) {
            str2 = null;
        } else {
            str2 = bVar.a(cVar);
        }
        try {
            new File(com.ss.ugc.live.a.a.e.b.a(str2) + ".fetched").createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        f71937c.post(new c(cVar));
    }
}
