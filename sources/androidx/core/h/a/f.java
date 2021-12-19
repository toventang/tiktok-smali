package androidx.core.h.a;

import android.view.accessibility.AccessibilityRecord;
import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityRecord f2504a;

    static {
        Covode.recordClassIndex(821);
    }

    public static f a() {
        return new f(AccessibilityRecord.obtain());
    }

    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f2504a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    private f(Object obj) {
        this.f2504a = (AccessibilityRecord) obj;
    }

    public final void a(int i2) {
        this.f2504a.setItemCount(i2);
    }

    public final void b(int i2) {
        this.f2504a.setFromIndex(i2);
    }

    public final void c(int i2) {
        this.f2504a.setToIndex(i2);
    }

    public final void a(boolean z) {
        this.f2504a.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityRecord accessibilityRecord = this.f2504a;
        if (accessibilityRecord == null) {
            if (fVar.f2504a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(fVar.f2504a)) {
            return false;
        }
        return true;
    }
}
