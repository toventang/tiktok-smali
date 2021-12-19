package com.ss.bytertc.base.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.bytertc.base.utils.NetworkUtils;
import com.ss.bytertc.engine.utils.LogUtil;

public class NetworkConnectChangeReceiver extends BroadcastReceiver {
    private Callback mCallback;
    private NetworkUtils.NetworkType sNetworkType = NetworkUtils.NetworkType.NONE;

    public interface Callback {
        static {
            Covode.recordClassIndex(100723);
        }

        void call(int i2);
    }

    static {
        Covode.recordClassIndex(100721);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.bytertc.base.utils.NetworkConnectChangeReceiver$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100722(0x18972, float:1.41142E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType[] r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType = r2
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.bytertc.base.utils.NetworkUtils$NetworkType r0 = com.ss.bytertc.base.utils.NetworkUtils.NetworkType.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.base.utils.NetworkConnectChangeReceiver.AnonymousClass1.<clinit>():void");
        }
    }

    public NetworkConnectChangeReceiver(Callback callback) {
        this.mCallback = callback;
    }

    private int getConstantNetworkType(NetworkUtils.NetworkType networkType) {
        if (!networkType.isAvailable()) {
            return 0;
        }
        return getType(networkType);
    }

    private int getType(NetworkUtils.NetworkType networkType) {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$base$utils$NetworkUtils$NetworkType[networkType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return 5;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return 6;
            default:
                return -1;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkUtils.NetworkType networkType = NetworkUtils.getNetworkType(context);
            LogUtil.d("NetworkConnectChangeReceiver", "this: " + hashCode() + " before: " + this.sNetworkType + " now: " + networkType);
            if (this.sNetworkType == NetworkUtils.NetworkType.NONE || networkType != NetworkUtils.NetworkType.UNKNOWN) {
                if (this.sNetworkType != networkType) {
                    int constantNetworkType = getConstantNetworkType(networkType);
                    Callback callback = this.mCallback;
                    if (callback != null) {
                        callback.call(constantNetworkType);
                    }
                }
                this.sNetworkType = networkType;
            }
        }
    }
}
