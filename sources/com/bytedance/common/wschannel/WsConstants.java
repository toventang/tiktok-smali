package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.app.b;
import com.bytedance.common.wschannel.app.d;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.b.c;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsConstants {
    private static volatile b<Boolean> optLogic = c.f27020a;
    private static b sBindWsChannelServiceListener;
    private static String sConnectionChangeListenerClassName;
    private static String sLinkProcessChangeListenerClassName;
    private static d sLinkProgressChangeListener;
    private static e sListener;
    private static Map<Integer, c> sStates = new ConcurrentHashMap();

    public static b getBindWsChannelServiceListener() {
        return sBindWsChannelServiceListener;
    }

    public static String getConnectionChangeListenerClassName() {
        return sConnectionChangeListenerClassName;
    }

    public static String getLinkProcessChangeListenerClassName() {
        return sLinkProcessChangeListenerClassName;
    }

    public static d getLinkProgressChangeListener() {
        return sLinkProgressChangeListener;
    }

    public static b<Boolean> getOptLogic() {
        return optLogic;
    }

    static {
        Covode.recordClassIndex(15934);
    }

    public static e getListener(int i2) {
        return sListener;
    }

    public static void setBindWsChannelServiceListener(b bVar) {
        sBindWsChannelServiceListener = bVar;
    }

    public static void setConnectionChangeListenerClassName(String str) {
        sConnectionChangeListenerClassName = str;
    }

    public static void setLinkProcessChangeListenerClassName(String str) {
        sLinkProcessChangeListenerClassName = str;
    }

    static void setOnLinkProgressChangeListener(d dVar) {
        sLinkProgressChangeListener = dVar;
    }

    static void setOnMessageReceiveListener(e eVar) {
        sListener = eVar;
    }

    static void setOptLogic(b<Boolean> bVar) {
        if (bVar != null) {
            optLogic = bVar;
        }
    }

    public static void remove(int i2) {
        sStates.remove(Integer.valueOf(i2));
    }

    static boolean isWsChannelConnected(int i2) {
        if (sStates.get(Integer.valueOf(i2)) == c.CONNECTED) {
            return true;
        }
        return false;
    }

    public static void setConnectionState(int i2, c cVar) {
        sStates.put(Integer.valueOf(i2), cVar);
    }
}
