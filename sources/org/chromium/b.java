package org.chromium;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.k;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import com.ttnet.org.chromium.net.v;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

public class b extends v {

    /* renamed from: a  reason: collision with root package name */
    private static b f159755a;

    static {
        Covode.recordClassIndex(106441);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(12196);
        if (f159755a == null) {
            synchronized (b.class) {
                try {
                    if (f159755a == null) {
                        f159755a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12196);
                    throw th;
                }
            }
        }
        b bVar = f159755a;
        MethodCollector.o(12196);
        return bVar;
    }

    @Override // com.ttnet.org.chromium.net.v
    public final void a(String str, String str2) {
        c.a().a(str, str2);
    }

    @Override // com.ttnet.org.chromium.net.v
    public final void a(boolean z, String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, boolean z2, long j12, long j13, String str4, String str5, String str6, int i2, int i3, String str7) {
        int i4 = i2;
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "handleApiResult ");
        }
        try {
            if (a2.f159757a != null) {
                Object obj = null;
                if (!z) {
                    switch (i4) {
                        case 1:
                            i4 = 1;
                            break;
                        case 2:
                            i4 = 2;
                            break;
                        case 3:
                            i4 = 3;
                            break;
                        case 4:
                            i4 = 4;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            i4 = 5;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            i4 = 6;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            i4 = 7;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            i4 = 8;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            i4 = 9;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            i4 = 10;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            i4 = 11;
                            break;
                        default:
                            if (d.a().loggerDebug()) {
                                d.a().loggerD("monitor", "Unknown error code: ".concat(String.valueOf(i4)));
                                break;
                            }
                            break;
                    }
                    NetworkExceptionImpl networkExceptionImpl = new NetworkExceptionImpl("Exception in CronetUrlRequest: ".concat(String.valueOf(str7)), i4, i3);
                    switch (networkExceptionImpl.getErrorCode()) {
                        case 1:
                            obj = new UnknownHostException(networkExceptionImpl.getMessage());
                            break;
                        case 2:
                        case 3:
                            obj = new ConnectException(networkExceptionImpl.getMessage());
                            break;
                        case 4:
                            obj = new SocketTimeoutException(networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            obj = new ConnectException(networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            obj = new ConnectTimeoutException(networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            obj = new SocketException("reset by peer " + networkExceptionImpl.getMessage());
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            obj = new NoRouteToHostException(networkExceptionImpl.getMessage());
                            break;
                        default:
                            obj = networkExceptionImpl;
                            break;
                    }
                }
                k.a(a2.f159757a).a("handleApiResult", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class, Exception.class}, Boolean.valueOf(z), str, str2, str3, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z2), Long.valueOf(j12), Long.valueOf(j13), str4, str5, str6, obj);
            }
        } catch (Throwable unused) {
        }
    }
}
