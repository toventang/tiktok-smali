package com.bytedance.android.live.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.e;
import com.bytedance.android.livesdk.lynx.b;
import com.bytedance.android.livesdkapi.b.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class a implements f {
    static {
        Covode.recordClassIndex(3533);
    }

    @Override // com.bytedance.android.live.b.f
    public void configWebDialogHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, boolean z, m mVar) {
    }

    public m createH5DialogBuilder(String str) {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public e createHybridDialog(PopupConfig popupConfig) {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public d createLiveBrowserFragment(Bundle bundle) {
        return null;
    }

    public b createLynxComponent(Activity activity, int i2, com.bytedance.android.livesdk.lynx.d dVar) {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public m createLynxDialogBuilder(String str, String str2) {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public Fragment createLynxFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public i getHybridContainerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public j getHybridDialogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public k getHybridPageManager() {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public l getLynxCardViewManager() {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public String getWebDialogTag() {
        return "";
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    public void openHybridDialog(Context context, PopupConfig popupConfig) {
    }

    public void removeNotifyBoxOpenedCallbacks() {
    }

    public void setNotifyBoxOpenedCallback(com.bytedance.android.livesdk.i.b bVar) {
    }

    @Override // com.bytedance.android.live.b.f
    public void setUserSilent(boolean z) {
    }

    @Override // com.bytedance.android.live.b.f
    public com.bytedance.android.livesdk.browser.c.d webViewManager() {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public <T> void xClearStorageItem(Context context, String str) {
    }

    public <T> T xGetStorageItem(Context context, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.b.f
    public <T> void xSetStorageItem(Context context, String str, T t) {
        l.d(context, "");
    }

    public List<String> getSafeHost() {
        return new ArrayList();
    }
}
