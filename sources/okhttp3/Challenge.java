package okhttp3;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.Util;

public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    static {
        Covode.recordClassIndex(106128);
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return Util.ISO_8859_1;
    }

    public final int hashCode() {
        return ((this.scheme.hashCode() + 899) * 31) + this.authParams.hashCode();
    }

    public final String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        if (!challenge.scheme.equals(this.scheme) || !challenge.authParams.equals(this.authParams)) {
            return false;
        }
        return true;
    }

    public final Challenge withCharset(Charset charset) {
        Objects.requireNonNull(charset, "charset == null");
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.authParams);
        linkedHashMap.put("charset", charset.name());
        return new Challenge(this.scheme, linkedHashMap);
    }

    public Challenge(String str, String str2) {
        Objects.requireNonNull(str, "scheme == null");
        Objects.requireNonNull(str2, "realm == null");
        this.scheme = str;
        this.authParams = Collections.singletonMap("realm", str2);
    }

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        Objects.requireNonNull(str, "scheme == null");
        Objects.requireNonNull(map, "authParams == null");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                lowerCase = null;
            } else {
                lowerCase = entry.getKey().toLowerCase(Locale.US);
            }
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        this.authParams = Collections.unmodifiableMap(linkedHashMap);
    }
}
