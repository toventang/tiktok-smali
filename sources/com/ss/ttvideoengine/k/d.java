package com.ss.ttvideoengine.k;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.b;
import com.ss.ttvideoengine.s.j;
import java.net.InetAddress;
import java.net.UnknownHostException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f153021a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile long f153022b;

    static {
        Covode.recordClassIndex(101688);
    }

    public static void a() {
        if (SystemClock.elapsedRealtime() - f153022b >= 300000) {
            b.a(new Runnable() {
                /* class com.ss.ttvideoengine.k.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101689);
                }

                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            d.f153021a = byName.getHostAddress();
                            d.f153022b = SystemClock.elapsedRealtime();
                            j.a("DNSServerIP", "update dns server ip:" + d.f153021a);
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }
}
