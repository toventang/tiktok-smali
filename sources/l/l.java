package l;

import com.bytedance.covode.number.Covode;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Response f159305a;

    /* renamed from: b  reason: collision with root package name */
    public final T f159306b;

    /* renamed from: c  reason: collision with root package name */
    public final ResponseBody f159307c;

    static {
        Covode.recordClassIndex(105797);
    }

    public final String toString() {
        return this.f159305a.toString();
    }

    public static <T> l<T> a(T t, Response response) {
        o.a(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new l<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    l(Response response, T t, ResponseBody responseBody) {
        this.f159305a = response;
        this.f159306b = t;
        this.f159307c = responseBody;
    }
}
