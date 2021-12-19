package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.application.o;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import org.json.JSONObject;

public final class ab implements IHostPlugin {
    static {
        Covode.recordClassIndex(69479);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean checkPluginInstalled(String str) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final String getHostModeFilePath() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final String getHostPackageName() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final int getPluginAttributeMinVersion(String str) {
        return 0;
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final void preload(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean isFull() {
        LiveHostOuterService.q();
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPlugin
    public final boolean loadLibrary(int i2, Context context, String str, String str2, ClassLoader classLoader) {
        JSONObject jSONObject;
        try {
            if (o.f66957b.get(str2) == null) {
                Librarian.a(str2);
            }
            return true;
        } catch (Throwable unused) {
        }
        b.a("plugin_bug_track", 1, jSONObject);
        return false;
    }
}
