package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

public interface CookieJar {
    public static final CookieJar NO_COOKIES = new CookieJar() {
        /* class okhttp3.CookieJar.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106139);
        }

        @Override // okhttp3.CookieJar
        public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        }

        @Override // okhttp3.CookieJar
        public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
            return Collections.emptyList();
        }
    };

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);

    static {
        Covode.recordClassIndex(106138);
    }
}
