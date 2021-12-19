package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.f;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class HttpUrl {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String fragment;
    final String host;
    private final String password;
    private final List<String> pathSegments;
    final int port;
    private final List<String> queryNamesAndValues;
    final String scheme;
    private final String url;
    private final String username;

    public final String fragment() {
        return this.fragment;
    }

    public final String host() {
        return this.host;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int port() {
        return this.port;
    }

    public final String scheme() {
        return this.scheme;
    }

    public final String toString() {
        return this.url;
    }

    public final String username() {
        return this.username;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public static final class Builder {
        String encodedFragment;
        String encodedPassword = "";
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String encodedUsername = "";
        String host;
        int port = -1;
        String scheme;

        static {
            Covode.recordClassIndex(106154);
        }

        /* access modifiers changed from: package-private */
        public final int effectivePort() {
            int i2 = this.port;
            if (i2 != -1) {
                return i2;
            }
            return HttpUrl.defaultPort(this.scheme);
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        public final HttpUrl build() {
            if (this.scheme == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.host != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        private void pop() {
            List<String> list = this.encodedPathSegments;
            if (!list.remove(list.size() - 1).isEmpty() || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, "");
        }

        /* access modifiers changed from: package-private */
        public final Builder reencodeForUri() {
            int size = this.encodedPathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.encodedPathSegments.set(i2, HttpUrl.canonicalize(this.encodedPathSegments.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.encodedQueryNamesAndValues.get(i3);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i3, HttpUrl.canonicalize(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.encodedFragment;
            if (str2 != null) {
                this.encodedFragment = HttpUrl.canonicalize(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (!(this.port == -1 && this.scheme == null)) {
                int effectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || effectivePort != HttpUrl.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(effectivePort);
                }
            }
            HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public final Builder addEncodedPathSegments(String str) {
            Objects.requireNonNull(str, "encodedPathSegments == null");
            return addPathSegments(str, true);
        }

        public final Builder addPathSegments(String str) {
            Objects.requireNonNull(str, "pathSegments == null");
            return addPathSegments(str, false);
        }

        private boolean isDot(String str) {
            if (str.equals(".") || str.equalsIgnoreCase("%2e")) {
                return true;
            }
            return false;
        }

        public final Builder addEncodedPathSegment(String str) {
            Objects.requireNonNull(str, "encodedPathSegment == null");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addPathSegment(String str) {
            Objects.requireNonNull(str, "pathSegment == null");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder encodedFragment(String str) {
            String str2;
            if (str != null) {
                str2 = HttpUrl.canonicalize(str, "", true, false, false, false);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public final Builder encodedPassword(String str) {
            Objects.requireNonNull(str, "encodedPassword == null");
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public final Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                list = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String str) {
            Objects.requireNonNull(str, "encodedUsername == null");
            this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public final Builder fragment(String str) {
            String str2;
            if (str != null) {
                str2 = HttpUrl.canonicalize(str, "", false, false, false, false);
            } else {
                str2 = null;
            }
            this.encodedFragment = str2;
            return this;
        }

        public final Builder password(String str) {
            Objects.requireNonNull(str, "password == null");
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public final Builder port(int i2) {
            if (i2 <= 0 || i2 > 65535) {
                throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i2)));
            }
            this.port = i2;
            return this;
        }

        public final Builder query(String str) {
            List<String> list;
            if (str != null) {
                list = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, " \"'<>#", false, false, true, true));
            } else {
                list = null;
            }
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, " \"'<>#&=", true, false, true, true));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            Objects.requireNonNull(str, "name == null");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        public final Builder removePathSegment(int i2) {
            this.encodedPathSegments.remove(i2);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder username(String str) {
            Objects.requireNonNull(str, "username == null");
            this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private boolean isDotDot(String str) {
            if (str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e")) {
                return true;
            }
            return false;
        }

        private void removeAllCanonicalQueryParameters(String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        public final Builder encodedPath(String str) {
            Objects.requireNonNull(str, "encodedPath == null");
            if (str.startsWith("/")) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: ".concat(String.valueOf(str)));
        }

        public final Builder host(String str) {
            Objects.requireNonNull(str, "host == null");
            String canonicalizeHost = canonicalizeHost(str, 0, str.length());
            if (canonicalizeHost != null) {
                this.host = canonicalizeHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }

        public final Builder scheme(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.scheme = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
            }
            return this;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final Builder setQueryParameter(String str, String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        private Builder addPathSegments(String str, boolean z) {
            boolean z2;
            int i2 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, i2, str.length(), "/\\");
                if (delimiterOffset < str.length()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                push(str, i2, delimiterOffset, z2, z);
                i2 = delimiterOffset + 1;
            } while (i2 <= str.length());
            return this;
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            String str3;
            Objects.requireNonNull(str, "encodedName == null");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " \"'<>#&=", true, false, true, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if (str2 != null) {
                str3 = HttpUrl.canonicalize(str2, " \"'<>#&=", true, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return this;
        }

        public final Builder addQueryParameter(String str, String str2) {
            String str3;
            Objects.requireNonNull(str, "name == null");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if (str2 != null) {
                str3 = HttpUrl.canonicalize(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                str3 = null;
            }
            list.add(str3);
            return this;
        }

        public final Builder setEncodedPathSegment(int i2, String str) {
            Objects.requireNonNull(str, "encodedPathSegment == null");
            String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
            this.encodedPathSegments.set(i2, canonicalize);
            if (!isDot(canonicalize) && !isDotDot(canonicalize)) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str)));
        }

        public final Builder setPathSegment(int i2, String str) {
            Objects.requireNonNull(str, "pathSegment == null");
            String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
            if (isDot(canonicalize) || isDotDot(canonicalize)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str)));
            }
            this.encodedPathSegments.set(i2, canonicalize);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Builder parse(HttpUrl httpUrl, String str) {
            int delimiterOffset;
            char charAt;
            int skipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str, 0, str.length());
            int skipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, str.length());
            int schemeDelimiterOffset = schemeDelimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            if (schemeDelimiterOffset != -1) {
                if (str.regionMatches(true, skipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    skipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, skipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    this.scheme = "http";
                    skipLeadingAsciiWhitespace += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, schemeDelimiterOffset) + "'");
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int slashCount = slashCount(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace);
            char c2 = '?';
            char c3 = '#';
            if (slashCount >= 2 || httpUrl == null || !httpUrl.scheme.equals(this.scheme)) {
                int i2 = skipLeadingAsciiWhitespace + slashCount;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str, i2, skipTrailingAsciiWhitespace, "@/\\?#");
                    if (delimiterOffset == skipTrailingAsciiWhitespace || (charAt = str.charAt(delimiterOffset)) == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int portColonOffset = portColonOffset(str, i2, delimiterOffset);
                        int i3 = portColonOffset + 1;
                    } else if (charAt == '@') {
                        if (!z) {
                            int delimiterOffset2 = Util.delimiterOffset(str, i2, delimiterOffset, ':');
                            String canonicalize = HttpUrl.canonicalize(str, i2, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                canonicalize = this.encodedUsername + "%40" + canonicalize;
                            }
                            this.encodedUsername = canonicalize;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = HttpUrl.canonicalize(str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            this.encodedPassword += "%40" + HttpUrl.canonicalize(str, i2, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = delimiterOffset + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int portColonOffset2 = portColonOffset(str, i2, delimiterOffset);
                int i32 = portColonOffset2 + 1;
                if (i32 < delimiterOffset) {
                    this.host = canonicalizeHost(str, i2, portColonOffset2);
                    int parsePort = parsePort(str, i32, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i32, delimiterOffset) + '\"');
                    }
                } else {
                    this.host = canonicalizeHost(str, i2, portColonOffset2);
                    this.port = HttpUrl.defaultPort(this.scheme);
                }
                if (this.host != null) {
                    skipLeadingAsciiWhitespace = delimiterOffset;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, portColonOffset2) + '\"');
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (skipLeadingAsciiWhitespace == skipTrailingAsciiWhitespace || str.charAt(skipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int delimiterOffset3 = Util.delimiterOffset(str, skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace, "?#");
            resolvePath(str, skipLeadingAsciiWhitespace, delimiterOffset3);
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str, delimiterOffset3, skipTrailingAsciiWhitespace, '#');
                this.encodedQueryNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, delimiterOffset3 + 1, delimiterOffset4, " \"'<>#", true, false, true, true, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < skipTrailingAsciiWhitespace && str.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = HttpUrl.canonicalize(str, 1 + delimiterOffset3, skipTrailingAsciiWhitespace, "", true, false, false, false, null);
            }
            return this;
        }

        private static String canonicalizeHost(String str, int i2, int i3) {
            return Util.canonicalizeHost(HttpUrl.percentDecode(str, i2, i3, false));
        }

        private static int parsePort(String str, int i2, int i3) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.canonicalize(str, i2, i3, "", false, false, false, true, null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private static int portColonOffset(String str, int i2, int i3) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '[') {
                    do {
                        i2++;
                        if (i2 >= i3) {
                            break;
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        private static int slashCount(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[SYNTHETIC] */
        private void resolvePath(java.lang.String r10, int r11, int r12) {
            /*
                r9 = this;
                r6 = r11
                if (r6 != r12) goto L_0x0004
                return
            L_0x0004:
                r4 = r10
                char r1 = r4.charAt(r6)
                r0 = 47
                java.lang.String r3 = ""
                r2 = 1
                if (r1 == r0) goto L_0x0014
                r0 = 92
                if (r1 != r0) goto L_0x0036
            L_0x0014:
                java.util.List<java.lang.String> r0 = r9.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r9.encodedPathSegments
                r0.add(r3)
            L_0x001e:
                int r6 = r6 + 1
            L_0x0020:
                r5 = r6
                if (r5 >= r12) goto L_0x0041
                java.lang.String r0 = "/\\"
                int r6 = okhttp3.internal.Util.delimiterOffset(r4, r5, r12, r0)
                if (r6 >= r12) goto L_0x0034
                r7 = 1
            L_0x002c:
                r8 = 1
                r3 = r9
                r3.push(r4, r5, r6, r7, r8)
                if (r7 == 0) goto L_0x0020
                goto L_0x001e
            L_0x0034:
                r7 = 0
                goto L_0x002c
            L_0x0036:
                java.util.List<java.lang.String> r1 = r9.encodedPathSegments
                int r0 = r1.size()
                int r0 = r0 - r2
                r1.set(r0, r3)
                goto L_0x0020
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        private static int schemeDelimiterOffset(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char charAt = str.charAt(i2);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char charAt2 = str.charAt(i2);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i2;
                        }
                    }
                }
            }
            return -1;
        }

        private void push(String str, int i2, int i3, boolean z, boolean z2) {
            String canonicalize = HttpUrl.canonicalize(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (!isDot(canonicalize)) {
                if (isDotDot(canonicalize)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize);
                } else {
                    this.encodedPathSegments.add(canonicalize);
                }
                if (z) {
                    this.encodedPathSegments.add("");
                }
            }
        }
    }

    public final boolean isHttps() {
        return this.scheme.equals("https");
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    public final String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    public final String topPrivateDomain() {
        if (Util.verifyAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
    }

    static {
        Covode.recordClassIndex(106153);
    }

    public final String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        return this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, this.url.indexOf(64));
    }

    public final String encodedPath() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), "?#"));
    }

    public final List<String> encodedPathSegments() {
        int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < delimiterOffset) {
            int i2 = indexOf + 1;
            indexOf = Util.delimiterOffset(this.url, i2, delimiterOffset, '/');
            arrayList.add(this.url.substring(i2, indexOf));
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        String str = this.url;
        return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), '#'));
    }

    public final String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return this.url.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i2));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final Builder newBuilder() {
        int i2;
        Builder builder = new Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        if (this.port != defaultPort(this.scheme)) {
            i2 = this.port;
        } else {
            i2 = -1;
        }
        builder.port = i2;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    public static HttpUrl parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static HttpUrl get(String str) {
        return new Builder().parse(null, str).build();
    }

    public final Builder newBuilder(String str) {
        try {
            return new Builder().parse(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final HttpUrl resolve(String str) {
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpUrl) || !((HttpUrl) obj).url.equals(this.url)) {
            return false;
        }
        return true;
    }

    public final String queryParameterName(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get(i2 * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String queryParameterValue(int i2) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i2 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public static HttpUrl get(URL url2) {
        return parse(url2.toString());
    }

    public final String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(this.queryNamesAndValues.get(i2))) {
                return this.queryNamesAndValues.get(i2 + 1);
            }
        }
        return null;
    }

    public final List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(this.queryNamesAndValues.get(i2))) {
                arrayList.add(this.queryNamesAndValues.get(i2 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    HttpUrl(Builder builder) {
        List<String> list;
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        String str = null;
        if (builder.encodedQueryNamesAndValues != null) {
            list = percentDecode(builder.encodedQueryNamesAndValues, true);
        } else {
            list = null;
        }
        this.queryNamesAndValues = list;
        this.fragment = builder.encodedFragment != null ? percentDecode(builder.encodedFragment, false) : str;
        this.url = builder.toString();
    }

    static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    static String percentDecode(String str, boolean z) {
        return percentDecode(str, 0, str.length(), z);
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    private List<String> percentDecode(List<String> list, boolean z) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = list.get(i2);
            if (str2 != null) {
                str = percentDecode(str2, z);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static boolean percentEncoded(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || Util.decodeHexDigit(str.charAt(i2 + 1)) == -1 || Util.decodeHexDigit(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    static String percentDecode(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                f fVar = new f();
                fVar.a(str, i2, i4);
                percentDecode(fVar, str, i4, i3, z);
                return fVar.r();
            }
        }
        return str.substring(i2, i3);
    }

    static void percentDecode(f fVar, String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37) {
                int i4 = i2 + 2;
                if (i4 < i3) {
                    int decodeHexDigit = Util.decodeHexDigit(str.charAt(i2 + 1));
                    int decodeHexDigit2 = Util.decodeHexDigit(str.charAt(i4));
                    if (!(decodeHexDigit == -1 || decodeHexDigit2 == -1)) {
                        fVar.a((decodeHexDigit << 4) + decodeHexDigit2);
                        i2 = i4;
                    }
                }
                fVar.e(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    fVar.a(32);
                }
                fVar.e(codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    static String canonicalize(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1)) {
                if (codePointAt == 37) {
                    if (z) {
                        if (z2 && !percentEncoded(str, i4, i3)) {
                        }
                    }
                } else if (codePointAt == 43 && z3) {
                }
                i4 += Character.charCount(codePointAt);
            }
            f fVar = new f();
            fVar.a(str, i2, i4);
            canonicalize(fVar, str, i4, i3, str2, z, z2, z3, z4, charset);
            return fVar.r();
        }
        return str.substring(i2, i3);
    }

    static void canonicalize(f fVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3;
        f fVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    if (z) {
                        str3 = "+";
                    } else {
                        str3 = "%2B";
                    }
                    fVar.a(str3);
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !percentEncoded(str, i2, i3)))))) {
                    if (fVar2 == null) {
                        fVar2 = new f();
                    }
                    if (charset == null || charset.equals(Util.UTF_8)) {
                        fVar2.e(codePointAt);
                    } else {
                        fVar2.a(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!fVar2.e()) {
                        int h2 = fVar2.h() & 255;
                        fVar.a(37);
                        char[] cArr = HEX_DIGITS;
                        fVar.a((int) cArr[(h2 >> 4) & 15]);
                        fVar.a((int) cArr[h2 & 15]);
                    }
                } else {
                    fVar.e(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }
}
