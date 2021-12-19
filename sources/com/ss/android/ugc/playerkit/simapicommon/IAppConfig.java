package com.ss.android.ugc.playerkit.simapicommon;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IAppConfig {
    static {
        Covode.recordClassIndex(98025);
    }

    String defaultHost();

    int getAppID();

    String getAppName();

    String getAppVersion();

    String getChannel();

    boolean isDebug();

    List<String> redirectHosts();
}
