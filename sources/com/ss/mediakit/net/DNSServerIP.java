package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    static {
        Covode.recordClassIndex(101156);
    }

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (System.currentTimeMillis() - mServerIPTime >= 300000) {
            AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.mediakit.net.DNSServerIP.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101157);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            DNSServerIP.mServerIP = byName.getHostAddress();
                            DNSServerIP.mServerIPTime = System.currentTimeMillis();
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}
