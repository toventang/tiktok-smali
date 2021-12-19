package com.ss.android.ugc.aweme.local_test;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.g;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.local_test.b.b;
import com.ss.android.ugc.aweme.local_test.b.c;
import com.ss.android.ugc.aweme.service.d;
import java.util.List;

public interface LocalTestApi {
    static {
        Covode.recordClassIndex(69786);
    }

    String appendDeviceId(String str);

    boolean enableBoe();

    boolean enableBoeJsbBypass();

    boolean enableDeeplinkIntercept();

    boolean enableLynxSec();

    boolean enablePpe();

    boolean enableWebHttps();

    b getAccountDebugService();

    List<String> getBoeBypassHostList();

    List<String> getBoeBypassPathList();

    String getBoeLane();

    void getDebugUrlMessage(Context context, String str, String str2);

    w getInitBoeTask();

    List<String> getJsbSafeHost();

    String getPPELane();

    c getResFakerService();

    d getSpecActDebugService();

    Resources getTranslationProxyResource(Resources resources);

    g getWebViewLoadUrlInterceptorDelegate();

    void initTranslationHotSwap(Context context);

    boolean isPPEEnable();

    void jumpToMessageDebugActivity(Context context, String str, String str2);

    boolean lynxDevToolDebugEnable();

    boolean shouldBulletShowDebugTagView();

    void showDeeplinkInterceptorRemind(String str, String str2);
}
