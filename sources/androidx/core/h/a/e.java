package androidx.core.h.a;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2502a;

    static {
        Covode.recordClassIndex(818);
    }

    public e() {
        int i2 = Build.VERSION.SDK_INT;
        this.f2502a = new b(this);
    }

    static class b extends a {
        static {
            Covode.recordClassIndex(820);
        }

        public final AccessibilityNodeInfo findFocus(int i2) {
            return null;
        }

        b(e eVar) {
            super(eVar);
        }
    }

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final e f2503a;

        static {
            Covode.recordClassIndex(819);
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            return null;
        }

        public boolean performAction(int i2, int i3, Bundle bundle) {
            return false;
        }

        a(e eVar) {
            this.f2503a = eVar;
        }
    }

    public e(Object obj) {
        this.f2502a = obj;
    }
}
