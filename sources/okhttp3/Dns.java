package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface Dns {
    public static final Dns SYSTEM = new Dns() {
        /* class okhttp3.Dns.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106143);
        }

        @Override // okhttp3.Dns
        public final List<InetAddress> lookup(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(String.valueOf(str)));
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    };

    List<InetAddress> lookup(String str);

    static {
        Covode.recordClassIndex(106142);
    }
}
