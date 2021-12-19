package com.bytedance.android.livesdk.ae;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.b.i;
import com.bytedance.android.live.b.j;
import com.bytedance.android.live.b.k;
import com.bytedance.android.live.b.l;
import com.bytedance.android.live.b.m;
import com.bytedance.android.livesdk.browser.b;
import com.bytedance.android.livesdk.browser.d;
import com.bytedance.android.livesdk.browser.d.h;
import com.bytedance.android.livesdk.browser.e;
import com.bytedance.android.livesdk.browser.g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ao;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ca;
import com.bytedance.android.livesdk.chatroom.interaction.PopHalfWebDialogHelper;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.k.e;
import com.bytedance.android.livesdk.lynx.c;
import com.bytedance.android.livesdk.lynx.e;
import com.bytedance.android.livesdk.lynx.ui.e;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

public class a implements f {
    c mLynxService = new e();

    static {
        Covode.recordClassIndex(7595);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    public void removeNotifyBoxOpenedCallbacks() {
        ao.f14511a = null;
    }

    @Override // com.bytedance.android.live.b.f
    public j getHybridDialogManager() {
        return d.b.f14346a;
    }

    @Override // com.bytedance.android.live.b.f
    public k getHybridPageManager() {
        return e.b.f14410a;
    }

    @Override // com.bytedance.android.live.b.f
    public l getLynxCardViewManager() {
        return g.b.f14420a;
    }

    @Override // com.bytedance.android.live.b.f
    public i getHybridContainerManager() {
        return new b();
    }

    public List<String> getSafeHost() {
        return com.bytedance.android.livesdk.browser.jsbridge.c.e();
    }

    @Override // com.bytedance.android.live.b.f
    public String getWebDialogTag() {
        return com.bytedance.android.livesdk.browser.d.a.class.getCanonicalName();
    }

    @Override // com.bytedance.android.live.b.f
    public com.bytedance.android.livesdk.browser.c.d webViewManager() {
        return com.bytedance.android.livesdk.browser.c.g.b();
    }

    public void setNotifyBoxOpenedCallback(com.bytedance.android.livesdk.i.b bVar) {
        ao.f14511a = bVar;
    }

    @Override // com.bytedance.android.live.b.f
    public void setUserSilent(boolean z) {
        ca.f14660a = z;
    }

    @Override // com.bytedance.android.live.b.f
    public com.bytedance.android.livesdk.container.e createHybridDialog(PopupConfig popupConfig) {
        return e.a.a(popupConfig);
    }

    public m createH5DialogBuilder(String str) {
        return new com.bytedance.android.livesdk.lynx.ui.e(str).a(e.b.H5);
    }

    @Override // com.bytedance.android.live.b.f
    public com.bytedance.android.livesdkapi.b.d createLiveBrowserFragment(Bundle bundle) {
        com.bytedance.android.livesdk.browser.g.a.a(bundle.getString("url", ""));
        h hVar = new h();
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // com.bytedance.android.live.b.f
    public Fragment createLynxFragment(Context context, Bundle bundle) {
        return this.mLynxService.createLynxFragment(context, bundle);
    }

    @Override // com.bytedance.android.live.b.f
    public <T> void xClearStorageItem(Context context, String str) {
        com.bytedance.ies.xbridge.base.a.b.a(context).b(str);
    }

    @Override // com.bytedance.android.live.b.f
    public m createLynxDialogBuilder(String str, String str2) {
        return new com.bytedance.android.livesdk.lynx.ui.e(str, str2).a(e.b.LYNX);
    }

    public <T> T xGetStorageItem(Context context, String str) {
        return (T) com.bytedance.ies.xbridge.base.a.b.a(context).a(str);
    }

    public void openHybridDialog(Context context, PopupConfig popupConfig) {
        com.bytedance.android.livesdk.container.e createHybridDialog = createHybridDialog(popupConfig);
        if (context != null) {
            if (!(context instanceof Activity)) {
                context = ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getTopActivity();
            }
            androidx.fragment.app.e b2 = com.bytedance.android.live.core.f.a.b(context);
            if (b2 != null) {
                createHybridDialog.a(b2);
            }
        }
    }

    @Override // com.bytedance.android.live.b.f
    public <T> void xSetStorageItem(Context context, String str, T t) {
        com.bytedance.ies.xbridge.base.a.b.a(context).a(str, t);
    }

    public com.bytedance.android.livesdk.lynx.b createLynxComponent(Activity activity, int i2, com.bytedance.android.livesdk.lynx.d dVar) {
        return this.mLynxService.create(activity, Integer.valueOf(i2), "", dVar, null);
    }

    @Override // com.bytedance.android.live.b.f
    public void configWebDialogHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, boolean z, androidx.lifecycle.m mVar) {
        new PopHalfWebDialogHelper(aVar, dataChannel, z, mVar);
    }
}
