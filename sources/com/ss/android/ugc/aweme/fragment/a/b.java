package com.ss.android.ugc.aweme.fragment.a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.d;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.activity.processor.x;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.k.h;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

public final class b extends d {

    /* renamed from: d  reason: collision with root package name */
    private final x f96668d = new x(0, false, false, 7);

    static {
        Covode.recordClassIndex(61332);
    }

    public final x c() {
        T t;
        T t2;
        Iterator<T> it = b().b().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2 instanceof x) {
                break;
            }
        }
        if (t2 instanceof x) {
            t = t2;
        }
        T t3 = t;
        if (t3 == null) {
            return this.f96668d;
        }
        return t3;
    }

    public final com.bytedance.tux.e.a a(Fragment fragment) {
        return a.C1099a.a(fragment).a(c().f65562h);
    }

    static final class a extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61333);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, Fragment fragment) {
            super(1);
            this.this$0 = bVar;
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (this.this$0.c().f65561g != -1) {
                this.this$0.a(this.$fragment).a(intValue).f44923a.d();
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fragment.a.b$b  reason: collision with other inner class name */
    static final class C2328b extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ Fragment $fragment;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2328b(b bVar, Fragment fragment) {
            super(1);
            this.this$0 = bVar;
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            if (this.this$0.c().f65559e != -1) {
                this.this$0.a(this.$fragment).c(intValue).f44923a.d();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.base.c, com.bytedance.ies.foundation.fragment.c
    public final void a(i iVar, com.bytedance.ies.foundation.fragment.a aVar, View view, Bundle bundle) {
        com.bytedance.ies.foundation.fragment.a aVar2;
        com.bytedance.ies.foundation.fragment.a aVar3;
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(view, "");
        super.a(iVar, aVar, view, bundle);
        if (!c().f65563i && !(aVar.getParentFragment() instanceof com.bytedance.tux.sheet.sheet.a)) {
            com.bytedance.tux.e.a a2 = a(aVar);
            if (c().f65561g != -1) {
                a2.a(c().f65561g);
            }
            if (c().f65557c) {
                a2.b();
            }
            if (c().f65556b) {
                a2.a();
            }
            if (c().f65555a) {
                a2.b(true);
            } else {
                a2.a(c().f65562h);
            }
            if (c().f65559e != -1) {
                a2.c(c().f65559e);
            }
            a2.f44923a.d();
            h hVar = c.f96669a;
            a aVar4 = new a(this, aVar);
            z.e eVar = new z.e();
            eVar.element = null;
            WeakReference<com.bytedance.ies.foundation.fragment.a> weakReference = this.f33904a;
            if (!(weakReference == null || (aVar3 = weakReference.get()) == null)) {
                l.b(aVar3, "");
                com.bytedance.ies.foundation.base.d subscribeStore = aVar3.ba_().getSubscribeStore();
                if (!subscribeStore.f33894a.containsKey(x.class)) {
                    subscribeStore.f33894a.put(x.class, new t<>());
                }
                Map<Class<?>, t<? extends com.bytedance.ies.foundation.base.a>> map = subscribeStore.f33894a;
                t<? extends com.bytedance.ies.foundation.base.a> tVar = map.get(x.class);
                if (map.containsKey(x.class) && tVar == null) {
                    tVar = new t<>();
                    map.put(x.class, tVar);
                }
                if ((tVar instanceof LiveData) && tVar != null) {
                    aa.a(tVar, new d.b(hVar, aVar3, eVar, aVar4)).observe(aVar3, new d.c(hVar, aVar3, eVar, aVar4));
                }
            }
            h hVar2 = d.f96670a;
            C2328b bVar = new C2328b(this, aVar);
            z.e eVar2 = new z.e();
            eVar2.element = null;
            WeakReference<com.bytedance.ies.foundation.fragment.a> weakReference2 = this.f33904a;
            if (weakReference2 != null && (aVar2 = weakReference2.get()) != null) {
                l.b(aVar2, "");
                com.bytedance.ies.foundation.base.d subscribeStore2 = aVar2.ba_().getSubscribeStore();
                if (!subscribeStore2.f33894a.containsKey(x.class)) {
                    subscribeStore2.f33894a.put(x.class, new t<>());
                }
                Map<Class<?>, t<? extends com.bytedance.ies.foundation.base.a>> map2 = subscribeStore2.f33894a;
                t<? extends com.bytedance.ies.foundation.base.a> tVar2 = map2.get(x.class);
                if (map2.containsKey(x.class) && tVar2 == null) {
                    tVar2 = new t<>();
                    map2.put(x.class, tVar2);
                }
                if ((tVar2 instanceof LiveData) && tVar2 != null) {
                    aa.a(tVar2, new d.C0743d(hVar2, aVar2, eVar2, bVar)).observe(aVar2, new d.e(hVar2, aVar2, eVar2, bVar));
                }
            }
        }
    }
}
