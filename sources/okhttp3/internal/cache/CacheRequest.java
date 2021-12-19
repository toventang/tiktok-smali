package okhttp3.internal.cache;

import com.bytedance.covode.number.Covode;
import k.y;

public interface CacheRequest {
    static {
        Covode.recordClassIndex(106200);
    }

    void abort();

    y body();
}
