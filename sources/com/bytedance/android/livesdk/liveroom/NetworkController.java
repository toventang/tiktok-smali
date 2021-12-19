package com.bytedance.android.livesdk.liveroom;

import android.content.Context;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ag.a;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRemoveTrafficDialogSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public class NetworkController implements ISubController {
    private a mNetworkBroadcastReceiver = new a();
    private a.AbstractC0288a mShowNetworkToast = new a.AbstractC0288a() {
        /* class com.bytedance.android.livesdk.liveroom.NetworkController.AnonymousClass1 */

        static {
            Covode.recordClassIndex(10480);
        }

        @Override // com.bytedance.android.livesdk.ag.a.AbstractC0288a
        public final void a(NetworkUtils.h hVar) {
            NetworkController.this.showNetworkToastWhenUseCellular(hVar, "change_to_cellular");
        }
    };

    static {
        Covode.recordClassIndex(10479);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestory() {
        if (LiveMtRemoveTrafficDialogSetting.INSTANCE.getValue() == 2) {
            this.mNetworkBroadcastReceiver.a();
            this.mNetworkBroadcastReceiver.b(this.mShowNetworkToast);
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        if (LiveMtRemoveTrafficDialogSetting.INSTANCE.getValue() == 2) {
            this.mNetworkBroadcastReceiver.a(y.e());
            this.mNetworkBroadcastReceiver.a(this.mShowNetworkToast);
            showNetworkToastWhenUseCellular(com_bytedance_android_livesdk_liveroom_NetworkController_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1(y.e()), "enter_live");
        }
    }

    public static NetworkUtils.h com_bytedance_android_livesdk_liveroom_NetworkController_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1(Context context) {
        if (j.f107228g != NetworkUtils.h.NONE && j.b() && !j.c()) {
            return j.f107228g;
        }
        NetworkUtils.h networkType = NetworkUtils.getNetworkType(context);
        j.f107228g = networkType;
        return networkType;
    }

    public void showNetworkToastWhenUseCellular(NetworkUtils.h hVar, String str) {
        if (hVar != NetworkUtils.h.WIFI && hVar != NetworkUtils.h.NONE) {
            ao.a(y.e(), y.a((int) R.string.dxu), 0);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str);
            b.a.a("using_cellular_toast_show").a((Map<String, String>) hashMap).c("show").a().b();
        }
    }
}
