package com.ss.android.ugc.aweme.video.simcommon;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.player.b;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import java.util.List;

public class SimAppConfig implements IAppConfig {
    static {
        Covode.recordClassIndex(94067);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String defaultHost() {
        return "tiktokv.com";
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public int getAppID() {
        return d.n;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getChannel() {
        return d.s;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public List<String> redirectHosts() {
        return b.f115050a;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppName() {
        return d.b();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppVersion() {
        return d.i();
    }

    public String getNetworkTypeDetail(Context context) {
        return com_ss_android_ugc_aweme_video_simcommon_SimAppConfig_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkTypeDetail(d.a());
    }

    public static String com_ss_android_ugc_aweme_video_simcommon_SimAppConfig_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkTypeDetail(Context context) {
        if (!TextUtils.isEmpty(j.f107223b) && j.b() && !j.c()) {
            return j.f107223b;
        }
        String e2 = l.e(context);
        j.f107223b = e2;
        return e2;
    }
}
