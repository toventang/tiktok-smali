package org.apache.http.impl.conn.tsccm;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpParams;

public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected final ClientConnectionOperator connOperator;
    protected final ConnPerRouteBean connPerRoute;
    protected final AbstractConnPool connectionPool;
    public final Log log;
    protected final ConnPoolByRoute pool;
    protected final SchemeRegistry schemeRegistry;

    static {
        Covode.recordClassIndex(106425);
    }

    public ThreadSafeClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public void shutdown() {
        this.log.debug("Shutting down");
        this.pool.shutdown();
    }

    /* access modifiers changed from: protected */
    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    /* access modifiers changed from: protected */
    public AbstractConnPool createConnectionPool(HttpParams httpParams) {
        return new ConnPoolByRoute(this.connOperator, httpParams);
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry2) {
        this(schemeRegistry2, -1, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    public ConnPoolByRoute createConnectionPool(long j2, TimeUnit timeUnit) {
        return new ConnPoolByRoute(this.connOperator, this.connPerRoute, 20, j2, timeUnit);
    }

    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.log = LogFactory.getLog(getClass());
            this.schemeRegistry = schemeRegistry2;
            this.connPerRoute = new ConnPerRouteBean();
            this.connOperator = createConnectionOperator(schemeRegistry2);
            ConnPoolByRoute connPoolByRoute = (ConnPoolByRoute) createConnectionPool(httpParams);
            this.pool = connPoolByRoute;
            this.connectionPool = connPoolByRoute;
            return;
        }
        throw new IllegalArgumentException("Scheme registry may not be null");
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry2, long j2, TimeUnit timeUnit) {
        this(schemeRegistry2, j2, timeUnit, new ConnPerRouteBean());
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry2, long j2, TimeUnit timeUnit, ConnPerRouteBean connPerRouteBean) {
        if (schemeRegistry2 != null) {
            this.log = LogFactory.getLog(getClass());
            this.schemeRegistry = schemeRegistry2;
            this.connPerRoute = connPerRouteBean;
            this.connOperator = createConnectionOperator(schemeRegistry2);
            ConnPoolByRoute createConnectionPool = createConnectionPool(j2, timeUnit);
            this.pool = createConnectionPool;
            this.connectionPool = createConnectionPool;
            return;
        }
        throw new IllegalArgumentException("Scheme registry may not be null");
    }
}
