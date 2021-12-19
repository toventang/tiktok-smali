package okhttp3;

import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType {
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    public final String subtype() {
        return this.subtype;
    }

    public final String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    public final Charset charset() {
        return charset(null);
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    static {
        Covode.recordClassIndex(106159);
    }

    public static MediaType parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final Charset charset(Charset charset2) {
        try {
            String str = this.charset;
            if (str != null) {
                return Charset.forName(str);
            }
            return charset2;
        } catch (IllegalArgumentException unused) {
            return charset2;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaType) || !((MediaType) obj).mediaType.equals(this.mediaType)) {
            return false;
        }
        return true;
    }

    public static MediaType get(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = PARAMETER.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new MediaType(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }
}
