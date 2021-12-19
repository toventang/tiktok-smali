package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class ac {
    private final Map<String, Object> mBagOfTags = new HashMap();
    private volatile boolean mCleared = false;

    static {
        Covode.recordClassIndex(1298);
    }

    public void onCleared() {
    }

    /* access modifiers changed from: package-private */
    public final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.mBagOfTags.values()) {
                    closeWithRuntimeException(obj);
                }
            }
        }
        onCleared();
    }

    private static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T getTag(String str) {
        T t;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.mBagOfTags.get(str);
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    public <T> T setTagIfAbsent(String str, T t) {
        Object obj;
        synchronized (this.mBagOfTags) {
            obj = this.mBagOfTags.get(str);
            if (obj == null) {
                this.mBagOfTags.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.mCleared) {
            closeWithRuntimeException(t);
        }
        return t;
    }
}
