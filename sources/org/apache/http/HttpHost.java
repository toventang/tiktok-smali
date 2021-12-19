package org.apache.http;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Locale;
import org.apache.http.util.LangUtils;

public final class HttpHost implements Serializable, Cloneable {
    private static final long serialVersionUID = -7529410654042457626L;
    protected final String hostname;
    protected final String lcHostname;
    protected final int port;
    protected final String schemeName;

    static {
        Covode.recordClassIndex(106370);
    }

    public final String getHostName() {
        return this.hostname;
    }

    public final int getPort() {
        return this.port;
    }

    public final String getSchemeName() {
        return this.schemeName;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final String toString() {
        return toURI();
    }

    public final int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.lcHostname), this.port), this.schemeName);
    }

    public final String toHostString() {
        if (this.port == -1) {
            return this.hostname;
        }
        StringBuilder sb = new StringBuilder(this.hostname.length() + 6);
        sb.append(this.hostname);
        sb.append(":");
        sb.append(Integer.toString(this.port));
        return sb.toString();
    }

    public final String toURI() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.schemeName);
        sb.append("://");
        sb.append(this.hostname);
        if (this.port != -1) {
            sb.append(':');
            sb.append(Integer.toString(this.port));
        }
        return sb.toString();
    }

    public HttpHost(String str) {
        this(str, -1, null);
    }

    public HttpHost(HttpHost httpHost) {
        this(httpHost.hostname, httpHost.port, httpHost.schemeName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpHost) {
            HttpHost httpHost = (HttpHost) obj;
            if (!this.lcHostname.equals(httpHost.lcHostname) || this.port != httpHost.port || !this.schemeName.equals(httpHost.schemeName)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public HttpHost(String str, int i2) {
        this(str, i2, null);
    }

    public HttpHost(String str, int i2, String str2) {
        if (str != null) {
            this.hostname = str;
            this.lcHostname = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.schemeName = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.schemeName = "http";
            }
            this.port = i2;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
