package dagger.hilt.android.internal.b;

import androidx.core.app.d;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class a {

    /* renamed from: dagger.hilt.android.internal.b.a$a  reason: collision with other inner class name */
    public interface AbstractC4137a {
        static {
            Covode.recordClassIndex(104043);
        }

        Set<ad.b> i();
    }

    public interface b {
        static {
            Covode.recordClassIndex(104044);
        }

        Set<ad.b> a();
    }

    static {
        Covode.recordClassIndex(104042);
    }

    public static ad.b a(d dVar) {
        return a(((AbstractC4137a) dagger.hilt.a.a(dVar, AbstractC4137a.class)).i());
    }

    public static ad.b a(com.bytedance.assem.arch.core.a aVar) {
        return a(((b) dagger.hilt.a.a(aVar, b.class)).a());
    }

    private static ad.b a(Set<ad.b> set) {
        if (set.isEmpty()) {
            return null;
        }
        if (set.size() <= 1) {
            ad.b next = set.iterator().next();
            if (next != null) {
                return next;
            }
            throw new IllegalStateException("Default view model factory must not be null.");
        }
        throw new IllegalStateException("At most one default view model factory is expected. Found ".concat(String.valueOf(set)));
    }
}
