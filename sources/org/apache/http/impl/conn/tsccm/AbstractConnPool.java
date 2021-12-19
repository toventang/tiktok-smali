package org.apache.http.impl.conn.tsccm;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.conn.IdleConnectionHandler;

public abstract class AbstractConnPool {
    protected IdleConnectionHandler idleConnHandler = new IdleConnectionHandler();
    protected volatile boolean isShutDown;
    protected Set<BasicPoolEntry> leasedConnections = new HashSet();
    private final Log log = LogFactory.getLog(getClass());
    protected final Lock poolLock = new ReentrantLock();

    static {
        Covode.recordClassIndex(106422);
    }

    protected AbstractConnPool() {
    }

    public void shutdown() {
        this.poolLock.lock();
        try {
            if (!this.isShutDown) {
                Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
                while (it.hasNext()) {
                    it.remove();
                    closeConnection(it.next().getConnection());
                }
                this.idleConnHandler.removeAll();
                this.isShutDown = true;
            }
        } finally {
            this.poolLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public void closeConnection(OperatedClientConnection operatedClientConnection) {
        if (operatedClientConnection != null) {
            try {
                operatedClientConnection.close();
            } catch (IOException e2) {
                this.log.debug("I/O error closing connection", e2);
            }
        }
    }
}
