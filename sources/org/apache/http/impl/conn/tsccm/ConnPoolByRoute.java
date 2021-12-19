package org.apache.http.impl.conn.tsccm;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

public class ConnPoolByRoute extends AbstractConnPool {
    protected final ConnPerRoute connPerRoute;
    private final long connTTL;
    private final TimeUnit connTTLTimeUnit;
    protected final Queue<BasicPoolEntry> freeConnections;
    protected final Set<BasicPoolEntry> leasedConnections;
    private final Log log;
    protected volatile int maxTotalConnections;
    protected final ClientConnectionOperator operator;
    public final Lock poolLock;
    protected final Map<HttpRoute, Object> routeToPool;
    protected volatile boolean shutdown;
    protected final Queue<WaitingThread> waitingThreads;

    static {
        Covode.recordClassIndex(106424);
    }

    /* access modifiers changed from: protected */
    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    public Map<HttpRoute, Object> createRouteToPoolMap() {
        return new HashMap();
    }

    /* access modifiers changed from: protected */
    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    @Override // org.apache.http.impl.conn.tsccm.AbstractConnPool
    public void shutdown() {
        this.poolLock.lock();
        try {
            if (!this.shutdown) {
                this.shutdown = true;
                Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
                while (it.hasNext()) {
                    it.remove();
                    closeConnection(it.next());
                }
                Iterator<BasicPoolEntry> it2 = this.freeConnections.iterator();
                while (it2.hasNext()) {
                    BasicPoolEntry next = it2.next();
                    it2.remove();
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("Closing connection [" + next.getPlannedRoute() + "][" + next.getState() + "]");
                    }
                    closeConnection(next);
                }
                Iterator<WaitingThread> it3 = this.waitingThreads.iterator();
                while (it3.hasNext()) {
                    it3.remove();
                    it3.next().wakeup();
                }
                this.routeToPool.clear();
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    private void closeConnection(BasicPoolEntry basicPoolEntry) {
        OperatedClientConnection connection = basicPoolEntry.getConnection();
        if (connection != null) {
            try {
                connection.close();
            } catch (IOException e2) {
                this.log.debug("I/O error closing connection", e2);
            }
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        this(clientConnectionOperator, ConnManagerParams.getMaxConnectionsPerRoute(httpParams), ConnManagerParams.getMaxTotalConnections(httpParams));
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute2, int i2) {
        this(clientConnectionOperator, connPerRoute2, i2, -1, TimeUnit.MILLISECONDS);
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, ConnPerRoute connPerRoute2, int i2, long j2, TimeUnit timeUnit) {
        this.log = LogFactory.getLog(getClass());
        if (clientConnectionOperator == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        } else if (connPerRoute2 != null) {
            this.poolLock = super.poolLock;
            this.leasedConnections = super.leasedConnections;
            this.operator = clientConnectionOperator;
            this.connPerRoute = connPerRoute2;
            this.maxTotalConnections = i2;
            this.freeConnections = createFreeConnQueue();
            this.waitingThreads = createWaitingThreadQueue();
            this.routeToPool = createRouteToPoolMap();
            this.connTTL = j2;
            this.connTTLTimeUnit = timeUnit;
        } else {
            throw new IllegalArgumentException("Connections per route may not be null");
        }
    }
}
