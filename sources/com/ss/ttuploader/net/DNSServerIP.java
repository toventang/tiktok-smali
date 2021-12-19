package com.ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSServerIP {
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;

    static {
        Covode.recordClassIndex(101415);
    }

    public static String getDNSServerIP() {
        updateDNSServerIP();
        return mServerIP;
    }

    public static void updateDNSServerIP() {
        if (System.currentTimeMillis() - mServerIPTime >= 300000) {
            TTUploadThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.ttuploader.net.DNSServerIP.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101416);
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
