package com.ss.android.ugc.aweme.discover.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.m.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final h f81623a = i.a((h.f.a.a) a.f81625a);

    /* renamed from: b  reason: collision with root package name */
    public int f81624b;

    static {
        Covode.recordClassIndex(50718);
    }

    public final List<WeakReference<b.a<?>>> a() {
        return (List) this.f81623a.getValue();
    }

    static final class a extends m implements h.f.a.a<List<WeakReference<b.a<?>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81625a = new a();

        static {
            Covode.recordClassIndex(50719);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<WeakReference<b.a<?>>> invoke() {
            return new ArrayList();
        }
    }

    public final void a(b.a<?> aVar) {
        l.d(aVar, "");
        a().add(new WeakReference<>(aVar));
    }

    public final void a(Object obj) {
        l.d(obj, "");
        for (WeakReference<b.a<?>> weakReference : a()) {
            b.a<?> aVar = weakReference.get();
            if (aVar == null) {
                a().remove(weakReference);
            } else if (l.a(aVar.a(), obj.getClass()) && (obj instanceof Object)) {
                aVar.a(obj);
            }
        }
    }
}
