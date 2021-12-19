package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

public interface Interceptor {

    public interface Chain {
        static {
            Covode.recordClassIndex(106156);
        }

        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request);

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i2, TimeUnit timeUnit);

        Chain withReadTimeout(int i2, TimeUnit timeUnit);

        Chain withWriteTimeout(int i2, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    static {
        Covode.recordClassIndex(106155);
    }

    Response intercept(Chain chain);
}
