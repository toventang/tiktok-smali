package ms.bd.o;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class o0 extends b.a {
    static {
        Covode.recordClassIndex(105938);
    }

    o0() {
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(13579);
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                            if (name.startsWith((String) h.a(16777217, 0, 0, "9fe6d9", new byte[]{58, 105, 24, 71, 79}))) {
                                h.a(16777217, 0, 0, "aafc13", new byte[]{121, 109, 16, 3, 47, 32, 102, 82, 50, 32, 99, 35, 27, 22, 3, 33, 56});
                                nextElement.getName();
                                String name2 = nextElement.getName();
                                MethodCollector.o(13579);
                                return name2;
                            }
                        }
                    }
                }
            }
            MethodCollector.o(13579);
            return "";
        } catch (SocketException unused) {
            h.a(16777217, 0, 0, "7b67b4", new byte[]{33, 101, 81, 3, 116, 51, 21, 71, 99, 117, 35, 115, 86, 3, 91, 34, 61, 79, 61});
            MethodCollector.o(13579);
            return "";
        }
    }
}
