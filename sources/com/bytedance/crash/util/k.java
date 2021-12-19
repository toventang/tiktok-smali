package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f28002a;

    static {
        Covode.recordClassIndex(16388);
        HashSet hashSet = new HashSet();
        f28002a = hashSet;
        hashSet.add("HeapTaskDaemon");
        hashSet.add("ThreadPlus");
        hashSet.add("ApiDispatcher");
        hashSet.add("ApiLocalDispatcher");
        hashSet.add("AsyncLoader");
        hashSet.add("AsyncTask");
        hashSet.add("Binder");
        hashSet.add("PackageProcessor");
        hashSet.add("SettingsObserver");
        hashSet.add("WifiManager");
        hashSet.add("JavaBridge");
        hashSet.add("Compiler");
        hashSet.add("Signal Catcher");
        hashSet.add("GC");
        hashSet.add("ReferenceQueueDaemon");
        hashSet.add("FinalizerDaemon");
        hashSet.add("FinalizerWatchdogDaemon");
        hashSet.add("CookieSyncManager");
        hashSet.add("RefQueueWorker");
        hashSet.add("CleanupReference");
        hashSet.add("VideoManager");
        hashSet.add("DBHelper-AsyncOp");
        hashSet.add("InstalledAppTracker2");
        hashSet.add("AppData-AsyncOp");
        hashSet.add("IdleConnectionMonitor");
        hashSet.add("LogReaper");
        hashSet.add("ActionReaper");
        hashSet.add("Okio Watchdog");
        hashSet.add("CheckWaitingQueue");
        hashSet.add("NPTH-CrashTimer");
        hashSet.add("NPTH-JavaCallback");
        hashSet.add("NPTH-LocalParser");
        hashSet.add("ANR_FILE_MODIFY");
    }

    public static boolean a(Throwable th) {
        if (th != null && !(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException) && !(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof NoRouteToHostException) && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !(th instanceof ProtocolException) && !(th instanceof SSLException)) {
            return false;
        }
        return true;
    }
}
