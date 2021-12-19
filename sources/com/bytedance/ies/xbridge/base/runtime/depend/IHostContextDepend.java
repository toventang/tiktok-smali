package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.a.b;
import java.util.List;

public interface IHostContextDepend {
    public static final a Companion = a.f35863a;

    static {
        Covode.recordClassIndex(21412);
    }

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    List<b> getSettings(List<com.bytedance.ies.xbridge.base.runtime.a.a> list);

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isPPEEnable();

    boolean isTeenMode();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f35863a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(21413);
        }
    }
}
