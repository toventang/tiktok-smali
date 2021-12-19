package org.apache.http.impl.conn;

import com.bytedance.covode.number.Covode;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;

public abstract class AbstractPoolEntry {
    public final OperatedClientConnection connection;
    public volatile HttpRoute route;
    protected volatile Object state;

    static {
        Covode.recordClassIndex(106416);
    }

    public Object getState() {
        return this.state;
    }
}
