package com.bytedance.als.dsl;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.als.b;
import com.bytedance.als.c;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.bytedance.o.n;
import com.bytedance.scene.s;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class g {
    static {
        Covode.recordClassIndex(3113);
    }

    public static final <T extends j<A> & a, A extends b> Context a(T t) {
        l.d(t, "");
        return (Context) t.getDiContainer().a(Context.class, "applicationContext");
    }

    public static final <T extends j<A> & a, A extends b> Activity b(T t) {
        l.d(t, "");
        return (Activity) t.getDiContainer().a(Activity.class, (String) null);
    }

    public static final <T extends j<A> & a, A extends b> Context c(T t) {
        l.d(t, "");
        return (Context) t.getDiContainer().a(Context.class, (String) null);
    }

    public static final OCAdapterViewModel a(e eVar) {
        l.d(eVar, "");
        ac a2 = ae.a(eVar).a(AlsVMContainer.class);
        l.b(a2, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a2;
        alsVMContainer.a(eVar);
        if (alsVMContainer.f6455c == null) {
            alsVMContainer.f6455c = new OCAdapterViewModel(null, alsVMContainer.f6453a);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f6455c;
        if (oCAdapterViewModel == null) {
            l.b();
        }
        return oCAdapterViewModel;
    }

    public static final OCAdapterViewModel a(com.bytedance.als.e<?> eVar) {
        l.d(eVar, "");
        ac a2 = c.a(eVar).a(AlsVMContainer.class);
        l.b(a2, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a2;
        if (alsVMContainer.f6455c == null) {
            alsVMContainer.f6455c = new OCAdapterViewModel(eVar.f6464b, alsVMContainer.f6453a);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f6455c;
        if (oCAdapterViewModel == null) {
            l.b();
        }
        return oCAdapterViewModel;
    }

    public static final OCAdapterViewModel a(com.bytedance.scene.j jVar) {
        f fVar;
        l.d(jVar, "");
        ac a2 = s.a(jVar).a(AlsVMContainer.class);
        l.b(a2, "");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a2;
        if (alsVMContainer.f6455c == null) {
            if (jVar.o == null || !(jVar.o instanceof com.bytedance.scene.group.b)) {
                Activity t = jVar.t();
                Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                d dVar = (d) t;
                l.d(dVar, "");
                ac a3 = ae.a((e) dVar).a(AlsVMContainer.class);
                l.b(a3, "");
                if (((AlsVMContainer) a3).f6454b != null) {
                    fVar = c.b(dVar);
                } else {
                    fVar = null;
                }
            } else {
                com.bytedance.scene.j jVar2 = jVar.o;
                Objects.requireNonNull(jVar2, "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene");
                fVar = c.b((com.bytedance.scene.group.b) jVar2);
            }
            alsVMContainer.f6455c = new OCAdapterViewModel(fVar, alsVMContainer.f6453a);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.f6455c;
        if (oCAdapterViewModel == null) {
            l.b();
        }
        return oCAdapterViewModel;
    }

    public static final f a(d dVar, h.f.a.b<? super n, z> bVar) {
        l.d(dVar, "");
        l.d(bVar, "");
        OCAdapterViewModel a2 = a(dVar);
        n nVar = a2.f6457a;
        n.b a3 = nVar.a(d.class, (String) null, dVar);
        l.a((Object) a3, "");
        a3.a(e.class).a(Activity.class);
        l.a((Object) nVar.a(Context.class, (String) null, dVar), "");
        Context applicationContext = dVar.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.b(applicationContext, "");
        l.a((Object) nVar.a(Context.class, "applicationContext", applicationContext), "");
        bVar.invoke(nVar);
        a2.a();
        return a2.b();
    }

    public static final f a(com.bytedance.scene.group.b bVar, h.f.a.b<? super n, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        OCAdapterViewModel a2 = a(bVar);
        n nVar = a2.f6457a;
        l.a((Object) nVar.a(com.bytedance.scene.group.b.class, (String) null, bVar), "");
        bVar2.invoke(nVar);
        a2.a();
        f b2 = a2.b();
        if (b2 == null) {
            l.b();
        }
        return b2;
    }
}
