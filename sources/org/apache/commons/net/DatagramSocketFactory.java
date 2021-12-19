package org.apache.commons.net;

import com.bytedance.covode.number.Covode;
import java.net.DatagramSocket;

public interface DatagramSocketFactory {
    static {
        Covode.recordClassIndex(106360);
    }

    DatagramSocket createDatagramSocket();
}
