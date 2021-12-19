package org.apache.commons.net;

import com.bytedance.covode.number.Covode;
import java.net.DatagramSocket;

public class DefaultDatagramSocketFactory implements DatagramSocketFactory {
    static {
        Covode.recordClassIndex(106361);
    }

    @Override // org.apache.commons.net.DatagramSocketFactory
    public DatagramSocket createDatagramSocket() {
        return new DatagramSocket();
    }
}
