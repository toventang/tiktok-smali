package org.apache.http.impl.conn;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

public class IdleConnectionHandler {
    private final Map<HttpConnection, Object> connectionToTimes = new HashMap();
    private final Log log = LogFactory.getLog(getClass());

    static {
        Covode.recordClassIndex(106418);
    }

    public void removeAll() {
        this.connectionToTimes.clear();
    }
}
