package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.y;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<ad, y> f3506a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(1295);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ e $activity;
        final /* synthetic */ ad $provider;

        static {
            Covode.recordClassIndex(1296);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ab.f3506a.put(this.$provider, new y.a(y.c.Activity, new WeakReference(this.$activity)));
            this.$activity.getLifecycle().a(new VScopeOwnerKt$putActivityProvider$1$1(this));
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ Fragment $fragment$inlined;
        final /* synthetic */ ad $provider$inlined;

        static {
            Covode.recordClassIndex(1297);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ab.f3506a.put(this.$provider$inlined, new y.b(y.c.Fragment, new WeakReference(this.$fragment$inlined)));
            this.$fragment$inlined.getLifecycle().a(new VScopeOwnerKt$putFragmentProvider$$inlined$let$lambda$1$1(this));
            return z.f158842a;
        }
    }

    public static final void a(ac acVar, ad adVar) {
        l.c(acVar, "");
        l.c(adVar, "");
        acVar.setTagIfAbsent("v_scope_vm_key", adVar);
    }
}
