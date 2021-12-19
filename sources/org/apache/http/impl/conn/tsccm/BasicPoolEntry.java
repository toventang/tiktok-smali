package org.apache.http.impl.conn.tsccm;

import com.bytedance.covode.number.Covode;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;

public class BasicPoolEntry extends AbstractPoolEntry {
    static {
        Covode.recordClassIndex(106423);
    }

    /* access modifiers changed from: protected */
    public final OperatedClientConnection getConnection() {
        return this.connection;
    }

    /* access modifiers changed from: protected */
    public final HttpRoute getPlannedRoute() {
        return this.route;
    }
}
