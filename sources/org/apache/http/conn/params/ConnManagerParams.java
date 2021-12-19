package org.apache.http.conn.params;

import com.bytedance.covode.number.Covode;
import org.apache.http.params.HttpParams;

public final class ConnManagerParams {
    private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE = new ConnPerRoute() {
        /* class org.apache.http.conn.params.ConnManagerParams.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106383);
        }
    };

    static {
        Covode.recordClassIndex(106382);
    }

    public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams httpParams) {
        if (httpParams != null) {
            ConnPerRoute connPerRoute = (ConnPerRoute) httpParams.getParameter("http.conn-manager.max-per-route");
            if (connPerRoute == null) {
                return DEFAULT_CONN_PER_ROUTE;
            }
            return connPerRoute;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static int getMaxTotalConnections(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter("http.conn-manager.max-total", 20);
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static void setMaxConnectionsPerRoute(HttpParams httpParams, ConnPerRoute connPerRoute) {
        if (httpParams != null) {
            httpParams.setParameter("http.conn-manager.max-per-route", connPerRoute);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i2) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.conn-manager.max-total", i2);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }
}
