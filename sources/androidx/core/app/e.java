package androidx.core.app;

import androidx.core.app.f;
import com.bytedance.covode.number.Covode;

public abstract class e extends f {
    static {
        Covode.recordClassIndex(660);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.core.app.f
    public f.e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
