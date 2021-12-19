package d.a.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f156644a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(104012);
    }

    public static String a(String str) {
        l.c(str, "");
        try {
            InetAddress byName = InetAddress.getByName(new URL(str).getHost());
            if (byName == null) {
                return "";
            }
            String hostAddress = byName.getHostAddress();
            if (hostAddress == null) {
                return "";
            }
            return hostAddress;
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            return null;
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
