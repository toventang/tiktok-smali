package com.ss.ugc.live.a.a;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.e.a;
import com.ss.ugc.live.a.a.e.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static f f154041a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, k> f154042b;

    /* renamed from: c  reason: collision with root package name */
    public final e f154043c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f154044d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Pair<Boolean, Long>> f154045e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    final Handler f154046f;

    /* renamed from: g  reason: collision with root package name */
    int f154047g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f154048h = 0;

    /* renamed from: i  reason: collision with root package name */
    private final Deque<c> f154049i = new ArrayDeque();

    static {
        Covode.recordClassIndex(102723);
    }

    public static f a() {
        f fVar = f154041a;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    private void c() {
        this.f154049i.iterator();
        while (this.f154049i.peek() != null) {
            c poll = this.f154049i.poll();
            k kVar = this.f154042b.get(poll.f154004a);
            if (kVar != null) {
                for (d dVar : kVar.f154061b) {
                    dVar.a();
                }
                this.f154042b.remove(poll.f154004a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        c poll;
        if (this.f154047g < this.f154043c.f154028d && !this.f154049i.isEmpty() && (poll = this.f154049i.poll()) != null) {
            if (this.f154043c.f154029e <= 0 || this.f154048h < this.f154043c.f154029e) {
                this.f154047g++;
                c(poll);
                return;
            }
            c();
            this.f154048h = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(c cVar) {
        this.f154043c.f154026b.a(cVar, this.f154043c).a(cVar, this);
    }

    public f(e eVar) {
        this.f154043c = eVar;
        this.f154042b = new HashMap();
        this.f154046f = new Handler(Looper.getMainLooper());
    }

    public final String a(c cVar) {
        if (cVar == null) {
            return null;
        }
        if (b(cVar)) {
            return d(cVar);
        }
        String str = cVar.f154004a;
        if (!this.f154042b.containsKey(str)) {
            this.f154042b.put(str, new k(cVar));
            cVar.b();
            c(cVar);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final String d(c cVar) {
        String a2 = b.a(this.f154043c.f154025a.a(cVar));
        if (cVar.f154009f) {
            return a2;
        }
        try {
            a2 = a2 + a.a(cVar.f154006c[0]);
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return a2;
        }
    }

    private boolean e(c cVar) {
        if (cVar == null) {
            return false;
        }
        boolean exists = new File(b.a(this.f154043c.f154025a.a(cVar)) + ".fetched").exists();
        this.f154045e.put(cVar.f154004a, new Pair<>(Boolean.valueOf(exists), Long.valueOf(System.currentTimeMillis())));
        return exists;
    }

    public final boolean b(c cVar) {
        if (cVar == null) {
            return false;
        }
        Pair<Boolean, Long> pair = this.f154045e.get(cVar.f154004a);
        if (pair == null || this.f154043c.f154030f <= 0 || System.currentTimeMillis() - ((Long) pair.second).longValue() >= this.f154043c.f154030f) {
            return e(cVar);
        }
        return ((Boolean) pair.first).booleanValue();
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(c cVar, int i2) {
        this.f154046f.post(new j(this, cVar, i2));
    }

    @Override // com.ss.ugc.live.a.a.a
    public final void a(c cVar, com.ss.ugc.live.a.a.c.a aVar) {
        this.f154046f.post(new h(this, cVar, aVar));
    }

    public final void a(c cVar, d dVar) {
        if (cVar != null) {
            if (!b(cVar)) {
                String str = cVar.f154004a;
                if (this.f154042b.containsKey(str)) {
                    if (cVar.f154010g) {
                        c cVar2 = this.f154042b.get(str).f154060a;
                        if (cVar2 != null) {
                            this.f154049i.remove(cVar2);
                        }
                        cVar.b();
                        this.f154049i.addFirst(cVar);
                    }
                    if (dVar != null) {
                        this.f154042b.get(str).a(dVar);
                        return;
                    }
                    return;
                }
                k kVar = new k(cVar);
                if (dVar != null) {
                    kVar.a(dVar);
                }
                this.f154042b.put(str, kVar);
                cVar.b();
                if (cVar.f154010g) {
                    this.f154049i.addFirst(cVar);
                } else {
                    this.f154049i.add(cVar);
                }
                b();
            } else if (dVar != null) {
                dVar.a(d(cVar));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.ugc.live.a.a.c, java.lang.Object] */
    @Override // com.ss.ugc.live.a.a.a
    public final /* synthetic */ void a(c cVar, String str) {
        try {
            new File(b.a(this.f154043c.f154025a.a(cVar)) + ".fetched").createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.f154045e.put(cVar.f154004a, new Pair<>(true, Long.valueOf(System.currentTimeMillis())));
        this.f154046f.post(new g(this, cVar));
    }
}
