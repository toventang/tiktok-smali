package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public final class q implements Iterable<Intent> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Intent> f2265a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f2266b;

    public interface a {
        static {
            Covode.recordClassIndex(699);
        }

        Intent getSupportParentActivityIntent();
    }

    static {
        Covode.recordClassIndex(698);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.f2265a.iterator();
    }

    public q(Context context) {
        this.f2266b = context;
    }

    public final q a(ComponentName componentName) {
        int size = this.f2265a.size();
        try {
            Intent a2 = g.a(this.f2266b, componentName);
            while (a2 != null) {
                this.f2265a.add(size, a2);
                a2 = g.a(this.f2266b, a2.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
