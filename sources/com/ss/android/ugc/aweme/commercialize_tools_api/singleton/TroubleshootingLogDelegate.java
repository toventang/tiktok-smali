package com.ss.android.ugc.aweme.commercialize_tools_api.singleton;

import android.app.Activity;
import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.ss.android.g.a;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class TroubleshootingLogDelegate {
    public static final TroubleshootingLogDelegate INSTANCE = new TroubleshootingLogDelegate();
    private static a mLogVisualPanelImpl;

    private final void getLogVisualPanelImpl() {
    }

    public final void awesomeSplashLog(String str) {
        awesomeSplashLog$default(this, str, null, 0, 6, null);
    }

    public final void awesomeSplashLog(String str, String str2) {
        awesomeSplashLog$default(this, str, str2, 0, 4, null);
    }

    public final void ordinarySplashLog(String str) {
        ordinarySplashLog$default(this, str, null, 0, 6, null);
    }

    public final void ordinarySplashLog(String str, String str2) {
        ordinarySplashLog$default(this, str, str2, 0, 4, null);
    }

    private TroubleshootingLogDelegate() {
    }

    static {
        Covode.recordClassIndex(47105);
    }

    private final void appLogV1Log(String str) {
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#BBC1E3");
        }
    }

    private final void appLogV3Log(String str) {
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#359E7E");
        }
    }

    public static final void showLogVisualPanel(Activity activity) {
        l.d(activity, "");
        INSTANCE.getLogVisualPanelImpl();
    }

    public final void handleV3Log(String str, JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("event_name:" + str + '\n');
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                l.b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    sb.append(next + ':' + jSONObject.opt(next) + '\n');
                }
            }
            String sb2 = sb.toString();
            l.b(sb2, "");
            appLogV3Log(sb2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void awesomeSplashLog(String str, String str2, int i2) {
        l.d(str, "");
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#B6ACB1");
        }
    }

    public final void ordinarySplashLog(String str, String str2, int i2) {
        l.d(str, "");
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#fdcb6e");
        }
    }

    public final void handleV1Log(String str, String str2, Long l2, Long l3, JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("tag:" + str + '\n');
            sb.append("label:" + str2 + '\n');
            sb.append("value:" + l2 + '\n');
            sb.append("ext_value:" + l3 + '\n');
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                l.b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    sb.append(next + ':' + jSONObject.opt(next) + '\n');
                }
            }
            String sb2 = sb.toString();
            l.b(sb2, "");
            appLogV1Log(sb2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void awesomeSplashLog$default(TroubleshootingLogDelegate troubleshootingLogDelegate, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        troubleshootingLogDelegate.awesomeSplashLog(str, str2, i2);
    }

    public static /* synthetic */ void ordinarySplashLog$default(TroubleshootingLogDelegate troubleshootingLogDelegate, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        troubleshootingLogDelegate.ordinarySplashLog(str, str2, i2);
    }
}
