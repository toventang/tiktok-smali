package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.preload.api.k;
import com.ss.android.ugc.aweme.video.preload.api.l;
import com.ss.android.ugc.aweme.video.preload.n;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import h.a.z;
import h.f.a.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<i, k.a> f143700a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<i, k.a> f143701b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f143702c;

    /* renamed from: d  reason: collision with root package name */
    private final l f143703d;

    static {
        Covode.recordClassIndex(94019);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a() {
    }

    public final void b() {
        if (!this.f143702c) {
            e();
        }
    }

    private final void d() {
        List<k.a> list;
        this.f143700a.clear();
        l lVar = this.f143703d;
        if (lVar == null || (list = lVar.a()) == null) {
            list = z.INSTANCE;
        }
        for (T t : list) {
            if (!this.f143701b.containsKey(t.f143623a)) {
                this.f143700a.put(t.f143623a, t);
            }
        }
        list.size();
        this.f143700a.size();
    }

    public final void c() {
        for (Map.Entry<i, k.a> entry : this.f143700a.entrySet()) {
            s.b().i(entry.getKey());
        }
        this.f143702c = false;
    }

    private final void e() {
        T t;
        boolean booleanValue;
        d();
        Collection<k.a> values = this.f143700a.values();
        h.f.b.l.a((Object) values, "");
        Iterator<T> it = values.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
            T t2 = t;
            booleanValue = t2.f143626d.invoke(t2.f143623a).booleanValue();
            t2.f143623a.getSourceId();
        } while (!booleanValue);
        T t3 = t;
        if (t3 != null) {
            t3.f143623a.getSourceId();
            s.b().a(t3.f143623a, t3.f143624b, n.a.f143759b);
            m<k.a, k.c, h.z> mVar = t3.f143627e;
            h.f.b.l.a((Object) t3, "");
            mVar.invoke(t3, k.c.Loading);
            this.f143702c = true;
            return;
        }
        this.f143702c = false;
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<i, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143704a = new a();

        static {
            Covode.recordClassIndex(94020);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(i iVar) {
            h.f.b.l.c(iVar, "");
            return true;
        }
    }

    public g(l lVar) {
        this.f143703d = lVar;
    }

    public final boolean a(i iVar) {
        h.f.b.l.c(iVar, "");
        boolean containsKey = this.f143700a.containsKey(iVar);
        boolean containsKey2 = this.f143701b.containsKey(iVar);
        if (containsKey || containsKey2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements m<k.a, k.c, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143705a = new b();

        static {
            Covode.recordClassIndex(94021);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(k.a aVar, k.c cVar) {
            h.f.b.l.c(aVar, "");
            h.f.b.l.c(cVar, "");
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a(i iVar, int i2) {
        h.f.b.l.c(iVar, "");
        iVar.getSourceId();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a(i iVar, b bVar) {
        k.c cVar;
        h.f.b.l.c(iVar, "");
        h.f.b.l.c(bVar, "");
        k.a remove = this.f143700a.remove(iVar);
        if (remove == null) {
            remove = new k.a(iVar);
        }
        h.f.b.l.a((Object) remove, "");
        if (bVar != b.Success) {
            remove = k.a.a(remove, null, -1, null, null, null, 29);
        }
        iVar.getSourceId();
        int i2 = h.f143706a[bVar.ordinal()];
        if (i2 == 1) {
            cVar = k.c.Success;
        } else if (i2 == 2) {
            cVar = k.c.Cancel;
        } else if (i2 == 3) {
            cVar = k.c.Failed;
        } else {
            throw new h.n();
        }
        remove.f143627e.invoke(remove, cVar);
        l lVar = this.f143703d;
        if (lVar != null) {
            lVar.a(remove);
        }
        if (cVar == k.c.Success) {
            this.f143701b.put(remove.f143623a, k.a.a(remove, null, 0, null, a.f143704a, b.f143705a, 7));
        }
        e();
    }
}
