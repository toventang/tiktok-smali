package com.bytedance.android.live.b;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.e;
import com.bytedance.android.livesdkapi.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public interface f extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(3544);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(3543);
    }

    void configWebDialogHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, boolean z, m mVar);

    e createHybridDialog(PopupConfig popupConfig);

    d createLiveBrowserFragment(Bundle bundle);

    m createLynxDialogBuilder(String str, String str2);

    Fragment createLynxFragment(Context context, Bundle bundle);

    i getHybridContainerManager();

    j getHybridDialogManager();

    k getHybridPageManager();

    l getLynxCardViewManager();

    String getWebDialogTag();

    void setUserSilent(boolean z);

    com.bytedance.android.livesdk.browser.c.d webViewManager();

    <T> void xClearStorageItem(Context context, String str);

    <T> void xSetStorageItem(Context context, String str, T t);
}
