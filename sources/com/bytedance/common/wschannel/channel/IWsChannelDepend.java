package com.bytedance.common.wschannel.channel;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IWsChannelDepend {
    static {
        Covode.recordClassIndex(15966);
    }

    int getNetworkType(Context context);

    void loadLibrary(Context context, String str);

    void loggerD(String str, String str2);

    boolean loggerDebug();

    void setAdapter(IWsChannelDepend iWsChannelDepend);
}
