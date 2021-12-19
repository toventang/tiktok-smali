package okhttp3.logging;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import k.f;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;

public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    public final Level getLevel() {
        return this.level;
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() {
            /* class okhttp3.logging.HttpLoggingInterceptor.Logger.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106335);
            }

            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(String str) {
                Platform.get().log(4, str, null);
            }
        };

        void log(String str);

        static {
            Covode.recordClassIndex(106334);
        }
    }

    static {
        Covode.recordClassIndex(106332);
    }

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY;

        static {
            Covode.recordClassIndex(106333);
        }
    }

    public final HttpLoggingInterceptor setLevel(Level level2) {
        Objects.requireNonNull(level2, "level == null. Use Level.NONE instead.");
        this.level = level2;
        return this;
    }

    public HttpLoggingInterceptor(Logger logger2) {
        this.headersToRedact = Collections.emptySet();
        this.level = Level.NONE;
        this.logger = logger2;
    }

    private static boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) {
            return false;
        }
        return true;
    }

    public final void redactHeader(String str) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        treeSet.addAll(this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    static boolean isPlaintext(f fVar) {
        long j2;
        try {
            f fVar2 = new f();
            if (fVar.f158864b < 64) {
                j2 = fVar.f158864b;
            } else {
                j2 = 64;
            }
            fVar.a(fVar2, 0, j2);
            int i2 = 0;
            while (!fVar2.e()) {
                int t = fVar2.t();
                if (Character.isISOControl(t) && !Character.isWhitespace(t)) {
                    return false;
                }
                i2++;
                if (i2 >= 16) {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Long] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0380  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // okhttp3.Interceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r19) {
        /*
        // Method dump skipped, instructions count: 917
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private void logHeader(Headers headers, int i2) {
        String value;
        if (this.headersToRedact.contains(headers.name(i2))) {
            value = "██";
        } else {
            value = headers.value(i2);
        }
        this.logger.log(headers.name(i2) + ": " + value);
    }
}
