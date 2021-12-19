package androidx.core.app;

import androidx.core.app.f;
import com.bytedance.covode.number.Covode;

public abstract class o extends f {
    static {
        Covode.recordClassIndex(695);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public f.e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
