package okhttp3.internal.cache;

import com.bytedance.covode.number.Covode;
import okhttp3.Request;
import okhttp3.Response;

public interface InternalCache {
    static {
        Covode.recordClassIndex(106212);
    }

    Response get(Request request);

    CacheRequest put(Response response);

    void remove(Request request);

    void trackConditionalCacheHit();

    void trackResponse(CacheStrategy cacheStrategy);

    void update(Response response, Response response2);
}
