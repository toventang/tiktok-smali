package org.apache.http.conn.scheme;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SchemeSocketFactoryAdaptor implements SchemeSocketFactory {
    private final SocketFactory factory;

    static {
        Covode.recordClassIndex(106401);
    }

    public int hashCode() {
        return this.factory.hashCode();
    }

    SchemeSocketFactoryAdaptor(SocketFactory socketFactory) {
        this.factory = socketFactory;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SchemeSocketFactoryAdaptor) {
            return this.factory.equals(((SchemeSocketFactoryAdaptor) obj).factory);
        }
        return this.factory.equals(obj);
    }
}
