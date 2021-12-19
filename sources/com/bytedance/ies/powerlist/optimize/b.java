package com.bytedance.ies.powerlist.optimize;

import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.debug.Dr;
import com.bytedance.ies.powerlist.optimize.a.b;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.ies.powerlist.page.config.c;
import f.a.d.f;
import h.f.b.l;
import h.z;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f34315a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.powerlist.optimize.a.b f34316b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.b f34317c;

    /* renamed from: d  reason: collision with root package name */
    public final PowerList f34318d;

    /* renamed from: e  reason: collision with root package name */
    public final f.a.l.b<c> f34319e;

    /* renamed from: f  reason: collision with root package name */
    public final m f34320f;

    /* renamed from: g  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> f34321g;

    static {
        Covode.recordClassIndex(20504);
    }

    public static final class a<T> implements f<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f34322a;

        static {
            Covode.recordClassIndex(20505);
        }

        public a(b bVar) {
            this.f34322a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(c cVar) {
            com.bytedance.ies.powerlist.debug.a aVar;
            h.f.a.b<com.bytedance.ies.powerlist.debug.b, z> bVar;
            c cVar2 = cVar;
            l.a((Object) cVar2, "");
            a aVar2 = new a(cVar2, this.f34322a.f34318d);
            a aVar3 = this.f34322a.f34315a;
            if (aVar3 != null) {
                aVar3.c();
                aVar3.f34298a.b(aVar3);
            }
            this.f34322a.f34315a = aVar2;
            a aVar4 = this.f34322a.f34315a;
            if (aVar4 != null) {
                String a2 = aVar4.a();
                if (!(a2 == null || a2.length() <= 0 || (aVar = Dr.f34270a) == null || (bVar = aVar.f34283a) == null)) {
                    bVar.invoke(new com.bytedance.ies.powerlist.debug.b(aVar4.f34298a, a2));
                }
                if (Dr.f34271b) {
                    aVar4.f34298a.a(aVar4);
                    aVar4.b().a(aVar4);
                }
            }
            OptimizeAbility optimizeAbility = cVar2.f34363h;
            if (optimizeAbility != null && optimizeAbility.f34353a) {
                com.bytedance.ies.powerlist.optimize.a.b bVar2 = new com.bytedance.ies.powerlist.optimize.a.b(optimizeAbility, this.f34322a.f34318d, this.f34322a.f34321g);
                com.bytedance.ies.powerlist.optimize.a.b bVar3 = this.f34322a.f34316b;
                if (bVar3 != null) {
                    bVar3.f34308e.clear();
                    bVar3.f34305b.o();
                    bVar3.f34307d.b(bVar3);
                    bVar3.f34307d.setViewCacheExtension(null);
                }
                this.f34322a.f34316b = bVar2;
                bVar2.b();
                bVar2.f34307d.a(bVar2);
                bVar2.f34307d.setViewCacheExtension(new b.a(bVar2, bVar2));
            }
        }
    }

    public /* synthetic */ b(PowerList powerList, f.a.l.b bVar, m mVar) {
        this(powerList, bVar, mVar, new ConcurrentHashMap());
    }

    private b(PowerList powerList, f.a.l.b<c> bVar, m mVar, ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap) {
        l.c(powerList, "");
        l.c(bVar, "");
        l.c(mVar, "");
        l.c(concurrentHashMap, "");
        this.f34318d = powerList;
        this.f34319e = bVar;
        this.f34320f = mVar;
        this.f34321g = concurrentHashMap;
    }
}
