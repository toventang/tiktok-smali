package com.ss.android.ugc.aweme.activity.processor;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.d;
import com.bytedance.immersionbar.f;
import com.bytedance.tux.e.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.k.h;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

public final class m extends com.bytedance.ies.foundation.activity.d {

    /* renamed from: d  reason: collision with root package name */
    private final x f65547d = new x(0, false, false, 7);

    static {
        Covode.recordClassIndex(40327);
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
            return this.f65547d;
        }
        return t3;
    }

    static final class b extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(40329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar, e eVar) {
            super(1);
            this.this$0 = mVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            com.bytedance.tux.e.a a2 = this.this$0.a(this.$activity);
            if (intValue != -1) {
                a2.d(intValue);
            }
            a2.f44923a.d();
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(40330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, e eVar) {
            super(1);
            this.this$0 = mVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            com.bytedance.tux.e.a a2 = this.this$0.a(this.$activity);
            if (intValue != -1) {
                a2.f(intValue);
            }
            a2.f44923a.d();
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(40331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m mVar, e eVar) {
            super(1);
            this.this$0 = mVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            int intValue = num.intValue();
            com.bytedance.tux.e.a a2 = this.this$0.a(this.$activity);
            if (intValue != -1) {
                a2.c(intValue);
            }
            a2.f44923a.d();
            return z.f158842a;
        }
    }

    public final com.bytedance.tux.e.a a(e eVar) {
        com.bytedance.tux.e.a a2 = a.C1099a.a(eVar);
        if (!c().f65555a) {
            a2.a(c().f65562h);
        }
        return a2;
    }

    static final class a extends h.f.b.m implements h.f.a.m<Integer, Boolean, z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(40328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, e eVar) {
            super(2);
            this.this$0 = mVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Boolean bool) {
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            com.bytedance.tux.e.a a2 = this.this$0.a(this.$activity);
            if (intValue != -1) {
                a2.a(intValue);
            }
            if (booleanValue) {
                a2.b(true);
            } else {
                a2.a(this.this$0.c().f65562h);
            }
            a2.f44923a.d();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void b(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        com.bytedance.ies.foundation.activity.a aVar2;
        com.bytedance.ies.foundation.activity.a aVar3;
        com.bytedance.ies.foundation.activity.a aVar4;
        com.bytedance.ies.foundation.activity.a aVar5;
        boolean z;
        int i2;
        l.d(aVar, "");
        super.b(aVar, bundle);
        l.c(aVar, "");
        if (f.f38913a == 26) {
            TypedValue typedValue = new TypedValue();
            Window window = aVar.getWindow();
            if (!aVar.getTheme().resolveAttribute(R.attr.au_, typedValue, true) || typedValue.data == 0) {
                z = false;
            } else {
                z = true;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(Integer.MIN_VALUE);
                i2 = systemUiVisibility | 16;
            } else {
                i2 = systemUiVisibility & -17;
            }
            if (i2 != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i2);
            }
        }
        if (!c().f65563i) {
            com.bytedance.tux.e.a a2 = a((e) aVar);
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
            if (c().f65558d != -1) {
                a2.d(c().f65558d);
            }
            if (c().f65559e != -1) {
                a2.c(c().f65559e);
            }
            if (c().f65560f != -1) {
                a2.f(c().f65560f);
            }
            a2.f44923a.d();
            h hVar = n.f65548a;
            h hVar2 = o.f65549a;
            a aVar6 = new a(this, aVar);
            z.e eVar = new z.e();
            eVar.element = null;
            WeakReference<com.bytedance.ies.foundation.activity.a> weakReference = this.f33849a;
            if (!(weakReference == null || (aVar5 = weakReference.get()) == null)) {
                l.b(aVar5, "");
                com.bytedance.ies.foundation.base.d subscribeStore = aVar5.getViewModel().getSubscribeStore();
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
                    aa.a(tVar, new d.b(hVar, hVar2, aVar5, eVar, aVar6)).observe(aVar5, new d.c(hVar, hVar2, aVar5, eVar, aVar6));
                }
            }
            h hVar3 = p.f65550a;
            b bVar = new b(this, aVar);
            z.e eVar2 = new z.e();
            eVar2.element = null;
            WeakReference<com.bytedance.ies.foundation.activity.a> weakReference2 = this.f33849a;
            if (!(weakReference2 == null || (aVar4 = weakReference2.get()) == null)) {
                l.b(aVar4, "");
                com.bytedance.ies.foundation.base.d subscribeStore2 = aVar4.getViewModel().getSubscribeStore();
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
                    aa.a(tVar2, new d.C0739d(hVar3, aVar4, eVar2, bVar)).observe(aVar4, new d.e(hVar3, aVar4, eVar2, bVar));
                }
            }
            h hVar4 = q.f65551a;
            c cVar = new c(this, aVar);
            z.e eVar3 = new z.e();
            eVar3.element = null;
            WeakReference<com.bytedance.ies.foundation.activity.a> weakReference3 = this.f33849a;
            if (!(weakReference3 == null || (aVar3 = weakReference3.get()) == null)) {
                l.b(aVar3, "");
                com.bytedance.ies.foundation.base.d subscribeStore3 = aVar3.getViewModel().getSubscribeStore();
                if (!subscribeStore3.f33894a.containsKey(x.class)) {
                    subscribeStore3.f33894a.put(x.class, new t<>());
                }
                Map<Class<?>, t<? extends com.bytedance.ies.foundation.base.a>> map3 = subscribeStore3.f33894a;
                t<? extends com.bytedance.ies.foundation.base.a> tVar3 = map3.get(x.class);
                if (map3.containsKey(x.class) && tVar3 == null) {
                    tVar3 = new t<>();
                    map3.put(x.class, tVar3);
                }
                if ((tVar3 instanceof LiveData) && tVar3 != null) {
                    aa.a(tVar3, new d.f(hVar4, aVar3, eVar3, cVar)).observe(aVar3, new d.g(hVar4, aVar3, eVar3, cVar));
                }
            }
            h hVar5 = r.f65552a;
            d dVar = new d(this, aVar);
            z.e eVar4 = new z.e();
            eVar4.element = null;
            WeakReference<com.bytedance.ies.foundation.activity.a> weakReference4 = this.f33849a;
            if (weakReference4 != null && (aVar2 = weakReference4.get()) != null) {
                l.b(aVar2, "");
                com.bytedance.ies.foundation.base.d subscribeStore4 = aVar2.getViewModel().getSubscribeStore();
                if (!subscribeStore4.f33894a.containsKey(x.class)) {
                    subscribeStore4.f33894a.put(x.class, new t<>());
                }
                Map<Class<?>, t<? extends com.bytedance.ies.foundation.base.a>> map4 = subscribeStore4.f33894a;
                t<? extends com.bytedance.ies.foundation.base.a> tVar4 = map4.get(x.class);
                if (map4.containsKey(x.class) && tVar4 == null) {
                    tVar4 = new t<>();
                    map4.put(x.class, tVar4);
                }
                if ((tVar4 instanceof LiveData) && tVar4 != null) {
                    aa.a(tVar4, new d.h(hVar5, aVar2, eVar4, dVar)).observe(aVar2, new d.i(hVar5, aVar2, eVar4, dVar));
                }
            }
        }
    }
}
