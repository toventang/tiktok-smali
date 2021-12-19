package androidx.core.h.a;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;

public final class c {

    public interface a {
        static {
            Covode.recordClassIndex(812);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(811);
    }

    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final a f2482a;

        static {
            Covode.recordClassIndex(813);
        }

        public final int hashCode() {
            return this.f2482a.hashCode();
        }

        public b(a aVar) {
            this.f2482a = aVar;
        }

        public final void onTouchExplorationStateChanged(boolean z) {
            this.f2482a.a(z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f2482a.equals(((b) obj).f2482a);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
