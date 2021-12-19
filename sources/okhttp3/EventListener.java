package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

public abstract class EventListener {
    public static final EventListener NONE = new EventListener() {
        /* class okhttp3.EventListener.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106145);
        }
    };

    public interface Factory {
        static {
            Covode.recordClassIndex(106147);
        }

        EventListener create(Call call);
    }

    public void callEnd(Call call) {
    }

    public void callFailed(Call call, IOException iOException) {
    }

    public void callStart(Call call) {
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(Call call, Connection connection) {
    }

    public void connectionReleased(Call call, Connection connection) {
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
    }

    public void dnsStart(Call call, String str) {
    }

    public void requestBodyEnd(Call call, long j2) {
    }

    public void requestBodyStart(Call call) {
    }

    public void requestHeadersEnd(Call call, Request request) {
    }

    public void requestHeadersStart(Call call) {
    }

    public void responseBodyEnd(Call call, long j2) {
    }

    public void responseBodyStart(Call call) {
    }

    public void responseHeadersEnd(Call call, Response response) {
    }

    public void responseHeadersStart(Call call) {
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
    }

    public void secureConnectStart(Call call) {
    }

    static {
        Covode.recordClassIndex(106144);
    }

    static Factory factory(EventListener eventListener) {
        return new Factory(eventListener) {
            /* class okhttp3.EventListener.AnonymousClass2 */
            final /* synthetic */ EventListener val$listener;

            static {
                Covode.recordClassIndex(106146);
            }

            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return this.val$listener;
            }

            {
                this.val$listener = r1;
            }
        };
    }
}
