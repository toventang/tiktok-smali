package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IHostPlugin extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(13788);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(13787);
    }

    boolean checkPluginInstalled(String str);

    String getHostModeFilePath();

    String getHostPackageName();

    int getPluginAttributeMinVersion(String str);

    boolean isFull();

    boolean loadLibrary(int i2, Context context, String str, String str2, ClassLoader classLoader);

    void preload(String str);
}
