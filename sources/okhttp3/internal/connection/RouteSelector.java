package okhttp3.internal.connection;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

public final class RouteSelector {
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<InetSocketAddress> inetSocketAddresses = Collections.emptyList();
    private int nextProxyIndex;
    private final List<Route> postponedRoutes = new ArrayList();
    private List<Proxy> proxies = Collections.emptyList();
    private final RouteDatabase routeDatabase;

    static {
        Covode.recordClassIndex(106222);
    }

    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        static {
            Covode.recordClassIndex(106223);
        }

        public final List<Route> getAll() {
            return new ArrayList(this.routes);
        }

        public final boolean hasNext() {
            if (this.nextRouteIndex < this.routes.size()) {
                return true;
            }
            return false;
        }

        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i2 = this.nextRouteIndex;
                this.nextRouteIndex = i2 + 1;
                return list.get(i2);
            }
            throw new NoSuchElementException();
        }

        Selection(List<Route> list) {
            this.routes = list;
        }
    }

    private boolean hasNextProxy() {
        if (this.nextProxyIndex < this.proxies.size()) {
            return true;
        }
        return false;
    }

    public final boolean hasNext() {
        if (hasNextProxy() || !this.postponedRoutes.isEmpty()) {
            return true;
        }
        return false;
    }

    private Proxy nextProxy() {
        if (hasNextProxy()) {
            List<Proxy> list = this.proxies;
            int i2 = this.nextProxyIndex;
            this.nextProxyIndex = i2 + 1;
            Proxy proxy = list.get(i2);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    public final Selection next() {
        if (hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                int size = this.inetSocketAddresses.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Route route = new Route(this.address, nextProxy, this.inetSocketAddresses.get(i2));
                    if (this.routeDatabase.shouldPostpone(route)) {
                        this.postponedRoutes.add(route);
                    } else {
                        arrayList.add(route);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }

    static String getHostString(InetSocketAddress inetSocketAddress) {
        InetAddress address2 = inetSocketAddress.getAddress();
        if (address2 == null) {
            return inetSocketAddress.getHostName();
        }
        return address2.getHostAddress();
    }

    private void resetNextInetSocketAddress(Proxy proxy) {
        int i2;
        String str;
        this.inetSocketAddresses = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.address.url().host();
            i2 = this.address.url().port();
        } else {
            SocketAddress address2 = proxy.address();
            if (address2 instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                str = getHostString(inetSocketAddress);
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address2.getClass());
            }
        }
        if (i2 <= 0 || i2 > 65535) {
            throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.inetSocketAddresses.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            this.eventListener.dnsStart(this.call, str);
            List<InetAddress> lookup = this.address.dns().lookup(str);
            if (!lookup.isEmpty()) {
                this.eventListener.dnsEnd(this.call, str, lookup);
                int size = lookup.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.inetSocketAddresses.add(new InetSocketAddress(lookup.get(i3), i2));
                }
                return;
            }
            throw new UnknownHostException(this.address.dns() + " returned no addresses for " + str);
        }
    }

    private void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        List<Proxy> immutableList;
        if (proxy != null) {
            immutableList = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.address.proxySelector().select(httpUrl.uri());
            if (select == null || select.isEmpty()) {
                immutableList = Util.immutableList(Proxy.NO_PROXY);
            } else {
                immutableList = Util.immutableList(select);
            }
        }
        this.proxies = immutableList;
        this.nextProxyIndex = 0;
    }

    public final void connectFailed(Route route, IOException iOException) {
        if (!(route.proxy().type() == Proxy.Type.DIRECT || this.address.proxySelector() == null)) {
            this.address.proxySelector().connectFailed(this.address.url().uri(), route.proxy().address(), iOException);
        }
        this.routeDatabase.failed(route);
    }

    public RouteSelector(Address address2, RouteDatabase routeDatabase2, Call call2, EventListener eventListener2) {
        this.address = address2;
        this.routeDatabase = routeDatabase2;
        this.call = call2;
        this.eventListener = eventListener2;
        resetNextProxy(address2.url(), address2.proxy());
    }
}
