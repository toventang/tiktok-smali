package org.apache.http.conn.scheme;

import com.bytedance.covode.number.Covode;
import java.util.Locale;
import org.apache.http.util.LangUtils;

public final class Scheme {
    private final int defaultPort;
    private final boolean layered;
    private final String name;
    private final SchemeSocketFactory socketFactory;
    private String stringRep;

    static {
        Covode.recordClassIndex(106395);
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.defaultPort), this.name), this.layered);
    }

    public final String toString() {
        if (this.stringRep == null) {
            this.stringRep = this.name + ':' + Integer.toString(this.defaultPort);
        }
        return this.stringRep;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scheme) {
            Scheme scheme = (Scheme) obj;
            if (this.name.equals(scheme.name) && this.defaultPort == scheme.defaultPort && this.layered == scheme.layered) {
                return true;
            }
            return false;
        }
        return false;
    }

    public Scheme(String str, int i2, SchemeSocketFactory schemeSocketFactory) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        } else if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException("Port is invalid: ".concat(String.valueOf(i2)));
        } else if (schemeSocketFactory != null) {
            this.name = str.toLowerCase(Locale.ENGLISH);
            this.defaultPort = i2;
            if (schemeSocketFactory instanceof SchemeLayeredSocketFactory) {
                this.layered = true;
                this.socketFactory = schemeSocketFactory;
            } else if (schemeSocketFactory instanceof LayeredSchemeSocketFactory) {
                this.layered = true;
                this.socketFactory = new SchemeLayeredSocketFactoryAdaptor2((LayeredSchemeSocketFactory) schemeSocketFactory);
            } else {
                this.layered = false;
                this.socketFactory = schemeSocketFactory;
            }
        } else {
            throw new IllegalArgumentException("Socket factory may not be null");
        }
    }

    public Scheme(String str, SocketFactory socketFactory2, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        } else if (socketFactory2 == null) {
            throw new IllegalArgumentException("Socket factory may not be null");
        } else if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException("Port is invalid: ".concat(String.valueOf(i2)));
        } else {
            this.name = str.toLowerCase(Locale.ENGLISH);
            if (socketFactory2 instanceof LayeredSocketFactory) {
                this.socketFactory = new SchemeLayeredSocketFactoryAdaptor((LayeredSocketFactory) socketFactory2);
                this.layered = true;
            } else {
                this.socketFactory = new SchemeSocketFactoryAdaptor(socketFactory2);
                this.layered = false;
            }
            this.defaultPort = i2;
        }
    }
}
