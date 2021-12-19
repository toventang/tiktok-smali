package com.bytedance.android.livesdk.h;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public enum a {
    LiveResource("com.ss.android.ies.live.liveresource") {
        @Override // com.bytedance.android.livesdk.h.a
        public final void load(Context context, boolean z) {
            try {
                IHostPlugin iHostPlugin = (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class);
                if (z) {
                    try {
                        iHostPlugin.loadLibrary(0, context, a.LiveResource.getPackageName(), "lens", getClass().getClassLoader());
                    } catch (Throwable unused) {
                    }
                    try {
                        iHostPlugin.loadLibrary(0, context, a.LiveResource.getPackageName(), "ttquic", getClass().getClassLoader());
                    } catch (Throwable unused2) {
                    }
                    iHostPlugin.loadLibrary(0, context, a.LiveResource.getPackageName(), "avframework", getClass().getClassLoader());
                    iHostPlugin.loadLibrary(0, context, a.LiveResource.getPackageName(), "ies_render", getClass().getClassLoader());
                    try {
                        iHostPlugin.loadLibrary(0, context, a.LiveResource.getPackageName(), "bytertc", getClass().getClassLoader());
                    } catch (Throwable unused3) {
                    }
                }
            } catch (Throwable unused4) {
            }
        }
    },
    Camera("camera", true, "com.ss.android.ugc.live.liveshortvideo_so"),
    LiveSDK("live_sdk", true, "com.ss.android.ies.live.sdk"),
    Player("player", false, "com.ss.android.ugc.live.player"),
    XGPlayer("player", false, "com.ss.ttm"),
    LITE_PLAYER_CONTAINER("player", false, "com.bytedance.common.plugin.lite"),
    Live("liveplugin", false, "com.bytedance.android.liveplugin");
    
    private final boolean mNeedPreload;
    private final String mPackageName;
    private final String mType;

    public void load(Context context, boolean z) {
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getType() {
        return this.mType;
    }

    public boolean isNeedPreload() {
        return this.mNeedPreload;
    }

    public void preload() {
        ((IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class)).preload(getPackageName());
    }

    public boolean isInstalled() {
        IHostPlugin iHostPlugin = (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class);
        if (iHostPlugin.isFull() || iHostPlugin.checkPluginInstalled(getPackageName())) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(10042);
    }

    public static JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", "2160");
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void checkInstall(Context context, IHostPlugin.a aVar) {
        checkInstall(context, "", aVar);
    }

    public void checkInstall(Context context, String str, IHostPlugin.a aVar) {
        if (isInstalled() && aVar != null) {
            aVar.a(getPackageName());
        }
    }

    /* synthetic */ a(String str) {
        this(r8, true, str);
    }

    private a(String str, boolean z, String str2) {
        this.mType = str;
        this.mNeedPreload = z;
        this.mPackageName = str2;
    }
}
