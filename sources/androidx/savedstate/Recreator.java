package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.savedstate.a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

public final class Recreator implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f4368a;

    static {
        Covode.recordClassIndex(1684);
    }

    public Recreator(c cVar) {
        this.f4368a = cVar;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            mVar.getLifecycle().b(this);
            a a2 = this.f4368a.a();
            if (!a2.f4372c) {
                throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            } else if (a2.f4371b != null) {
                Bundle bundle = a2.f4371b.getBundle("androidx.savedstate.Restarter");
                a2.f4371b.remove("androidx.savedstate.Restarter");
                if (a2.f4371b.isEmpty()) {
                    a2.f4371b = null;
                }
                if (bundle != null) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            try {
                                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.AbstractC0064a.class);
                                try {
                                    Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        declaredConstructor.newInstance(new Object[0]);
                                    } catch (Exception e2) {
                                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(next)), e2);
                                    }
                                } catch (NoSuchMethodException e3) {
                                    throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                                }
                            } catch (ClassNotFoundException e4) {
                                throw new RuntimeException("Class " + next + " wasn't found", e4);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
            }
        } else {
            throw new AssertionError("Next event must be ON_CREATE");
        }
    }
}
