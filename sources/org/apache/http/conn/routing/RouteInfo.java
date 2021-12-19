package org.apache.http.conn.routing;

import com.bytedance.covode.number.Covode;

public interface RouteInfo {
    static {
        Covode.recordClassIndex(106388);
    }

    public enum LayerType {
        PLAIN,
        LAYERED;

        static {
            Covode.recordClassIndex(106389);
        }
    }

    public enum TunnelType {
        PLAIN,
        TUNNELLED;

        static {
            Covode.recordClassIndex(106390);
        }
    }
}
