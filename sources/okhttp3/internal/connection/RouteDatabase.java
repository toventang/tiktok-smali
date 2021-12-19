package okhttp3.internal.connection;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    static {
        Covode.recordClassIndex(106220);
    }

    public final synchronized void connected(Route route) {
        MethodCollector.i(5392);
        this.failedRoutes.remove(route);
        MethodCollector.o(5392);
    }

    public final synchronized void failed(Route route) {
        MethodCollector.i(5266);
        this.failedRoutes.add(route);
        MethodCollector.o(5266);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        boolean contains;
        MethodCollector.i(5394);
        contains = this.failedRoutes.contains(route);
        MethodCollector.o(5394);
        return contains;
    }
}
