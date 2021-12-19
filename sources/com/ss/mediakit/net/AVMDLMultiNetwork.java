package com.ss.mediakit.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.reflect.Field;

public class AVMDLMultiNetwork {
    private static Network mCellularNetwork;
    private static ConnectivityManager mCm;
    private static long mCurNetId;
    private static Network mCurNetwork;
    protected static Handler mHandler;
    private static HandlerThread mThread;

    static {
        Covode.recordClassIndex(101142);
    }

    public static Network getCellularNetwork() {
        Network network;
        MethodCollector.i(1200);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                network = mCellularNetwork;
            } finally {
                MethodCollector.o(1200);
            }
        }
        return network;
    }

    public static Network getCurNetwork() {
        Network network;
        MethodCollector.i(1198);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                network = mCurNetwork;
            } finally {
                MethodCollector.o(1198);
            }
        }
        return network;
    }

    public static void switchToCellularNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 1;
            mHandler.sendMessage(message);
            AVMDLLog.d("AVMDLMultiNetwork", "send msg of switch to cellular network");
        }
    }

    public static void switchToDefaultNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 2;
            mHandler.sendMessage(message);
            AVMDLLog.d("AVMDLMultiNetwork", "send msg of switch to default network");
        }
    }

    public static void switchToDefaultNetworkInternal() {
        AVMDLLog.d("AVMDLMultiNetwork", "try switch to default network");
        if (mCurNetId != 0) {
            AVMDLLog.d("AVMDLMultiNetwork", "do switch");
            IPCache.getInstance().clear();
            AVMDLDataLoader.getInstance().onCellularAlwaysUp(0);
            mCurNetId = 0;
            setCurNetwork(null);
        }
        AVMDLLog.d("AVMDLMultiNetwork", "end try switch to default network");
    }

    public static void switchToCellularNetworkInternal() {
        int i2;
        Network cellularNetwork = getCellularNetwork();
        if (cellularNetwork != null) {
            long netId = getNetId(cellularNetwork);
            AVMDLLog.d("AVMDLMultiNetwork", "try switch to cellular curNetId: " + mCurNetId + " netId:" + netId);
            if (mCurNetId != netId) {
                AVMDLLog.d("AVMDLMultiNetwork", "do switch");
                IPCache.getInstance().clear();
                i2 = AVMDLDataLoader.getInstance().onCellularAlwaysUp(NetUtils.getNetId(cellularNetwork));
                mCurNetId = netId;
                setCurNetwork(cellularNetwork);
            } else {
                AVMDLLog.d("AVMDLMultiNetwork", "cur is cellular, not need switch");
                i2 = 0;
            }
            AVMDLLog.d("AVMDLMultiNetwork", "end switch to cellular, ret:".concat(String.valueOf(i2)));
        }
    }

    private static long getNetId(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    public static void onCellularNetwork(Network network) {
        MethodCollector.i(1197);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mCellularNetwork = network;
            } finally {
                MethodCollector.o(1197);
            }
        }
    }

    public static void setCurNetwork(Network network) {
        MethodCollector.i(1199);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mCurNetwork = network;
            } finally {
                MethodCollector.o(1199);
            }
        }
    }

    private static void initHandler(Context context) {
        MethodCollector.i(1182);
        synchronized (AVMDLMultiNetwork.class) {
            try {
                if (mThread == null) {
                    HandlerThread handlerThread = new HandlerThread("AVMDLMultiNetwork");
                    mThread = handlerThread;
                    handlerThread.start();
                    mHandler = new Handler(mThread.getLooper()) {
                        /* class com.ss.mediakit.net.AVMDLMultiNetwork.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(101144);
                        }

                        public final void handleMessage(Message message) {
                            Network network;
                            if (message.obj != null) {
                                network = (Network) message.obj;
                            } else {
                                network = null;
                            }
                            AVMDLLog.d("AVMDLMultiNetwork", a.a("----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                            int i2 = message.what;
                            if (i2 == 0) {
                                AVMDLMultiNetwork.onAvailableInternal(network);
                            } else if (i2 == 1) {
                                AVMDLMultiNetwork.switchToCellularNetworkInternal();
                            } else if (i2 == 2) {
                                AVMDLMultiNetwork.switchToDefaultNetworkInternal();
                            }
                            AVMDLLog.d("AVMDLMultiNetwork", a.a("****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                        }
                    };
                }
                if (context != null && mCm == null) {
                    mCm = (ConnectivityManager) com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity");
                }
            } finally {
                MethodCollector.o(1182);
            }
        }
    }

    public static boolean alwayUpCellular(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            AVMDLLog.d("AVMDLMultiNetwork", "build version not support:" + Build.VERSION.SDK_INT);
            return false;
        }
        initHandler(context);
        if (mCm == null) {
            AVMDLLog.d("AVMDLMultiNetwork", "cm is null");
            return false;
        }
        try {
            mCm.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() {
                /* class com.ss.mediakit.net.AVMDLMultiNetwork.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101143);
                }

                public final void onAvailable(Network network) {
                    Message message = new Message();
                    message.obj = network;
                    message.what = 0;
                    AVMDLMultiNetwork.mHandler.sendMessage(message);
                    AVMDLLog.d("AVMDLMultiNetwork", "send msg of onavailable ");
                }
            });
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void onAvailableInternal(Network network) {
        ConnectivityManager connectivityManager;
        if (network != null && (connectivityManager = mCm) != null) {
            NetworkInfo com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo = com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo(connectivityManager, network);
            AVMDLLog.d("AVMDLMultiNetwork", "start on available");
            AVMDLLog.d("AVMDLMultiNetwork", "network name: " + com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo.getTypeName() + "[" + com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo.getSubtypeName() + "], state: " + com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo.getDetailedState() + " netid:" + getNetId(network));
            NetworkCapabilities networkCapabilities = mCm.getNetworkCapabilities(network);
            if (networkCapabilities == null || !networkCapabilities.hasTransport(0) || !networkCapabilities.hasCapability(12)) {
                AVMDLDataLoader.getInstance().onCellularAlwaysUp(0);
            } else {
                onCellularNetwork(network);
                AVMDLDataLoader.getInstance().onInitMultiNetworkEnv();
            }
            AVMDLLog.d("AVMDLMultiNetwork", "end on available");
        }
    }

    public static NetworkInfo com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static Object com_ss_mediakit_net_AVMDLMultiNetwork_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(1185);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1185);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
