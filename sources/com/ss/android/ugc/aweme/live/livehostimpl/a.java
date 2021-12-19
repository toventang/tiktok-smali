package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b.i;
import b.j;
import com.bef.effectsdk.AssetResourceFinder;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.g.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.EffectManager;
import h.f.b.l;
import java.io.File;
import java.util.Locale;

public final class a implements IHostContext {

    /* renamed from: a  reason: collision with root package name */
    private EffectManager f108430a;

    static {
        Covode.recordClassIndex(69476);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int appId() {
        return 1233;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String appName() {
        return "musical_ly";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final void enterRecorderActivity(Activity activity) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Pair<String, String> getFreeFlowModel() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getIapKey() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi15r9zfdlMuE3zfC3ZZEA4U0ursaCpeXTw024ezGLKOVz7E+hBgbAhsONpfZ9tTqzEm+nc48hSs0gvhbWxFd8wSelqqJQhpSaVFLwC8VKA/oPDL7MAwbGfnlaAADwer4EOZ29KJFRiWWxolOvw9Vpzfrca6JvxSe87Y2buZp+z9kFxlGfUpyPpTkqh/8IuvZnQRTVnlOtZ1aV0urNjHgwj760LlCGO6Mwta82YTIrHIFO7JKhT5aXcrnrb7WnlojKtM3mNZ6q157D2fGiv+Gsule/ullOmXLvSkW0bJXCoQRnE9HxzmRKNss4ekmX3Vr+jmEcw1esSJ6V6LtY4JAeQIDAQAB";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getPackageName() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isOffline() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int liveId() {
        return 12;
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getChannel() {
        return d.s;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final void refreshClientABTestValues() {
        c.b();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Context context() {
        return d.a();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getServerDeviceId() {
        return DeviceRegisterManager.getDeviceId();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isBoe() {
        LiveHostOuterService.q();
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isPpe() {
        LiveHostOuterService.q();
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Locale currentLocale() {
        return LiveHostOuterService.q().c();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getBoeLane() {
        return LiveHostOuterService.q().l();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getPpeLane() {
        return LiveHostOuterService.q().p();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int getUpdateVersionCode() {
        try {
            return com.bytedance.common.utility.a.a.a(context(), "UPDATE_VERSION_CODE");
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getVersionCode() {
        return String.valueOf(d.h());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isLocalTest() {
        return TextUtils.equals(getChannel(), "local_test");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isNeedProtectMinor() {
        return LiveHostOuterService.q().b();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int getLastVersionCode() {
        return s.a.f66880a.v().c().intValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final EffectManager getEffectManager() {
        if (this.f108430a == null) {
            j jVar = new j();
            AVExternalServiceImpl.a().abilityService().effectService().buildEffectPlatform(context(), new b(jVar), c.f108461a);
            try {
                i<TResult> iVar = jVar.f4869a;
                iVar.f();
                if (iVar.c()) {
                    bj.b("So decompress: LiveAppContext, get effect manager wrong,  task error: " + Log.getStackTraceString(iVar.e()));
                } else {
                    this.f108430a = iVar.d();
                }
            } catch (InterruptedException e2) {
                bj.b("So decompress: LiveAppContext, get effect manager wrong, " + e2.getMessage() + "at " + Log.getStackTraceString(e2));
                e2.printStackTrace();
            }
        }
        return this.f108430a;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getTTLiveGeckoCdnUrl(String str, String str2) {
        return com.ss.android.ugc.aweme.live.g.d.a(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final File getTTLiveGeckoResourceFile(String str, String str2) {
        return com.ss.android.ugc.aweme.live.g.d.b(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getTTLiveGeckoResourcePath(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        File b2 = com.ss.android.ugc.aweme.live.g.d.b(str, str2);
        if (b2 == null || !b2.exists()) {
            return "";
        }
        return b2.getAbsolutePath();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getTTLiveGeckoResourcePathAndUrl(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        File b2 = com.ss.android.ugc.aweme.live.g.d.b(str, str2);
        if (b2 == null || !b2.exists()) {
            return com.ss.android.ugc.aweme.live.g.d.a(str, str2);
        }
        return b2.getAbsolutePath();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Object getResourceFinder(Context context, String str) {
        j jVar = new j();
        AVExternalServiceImpl.a().abilityService().effectService().provideResourceFinder(new d(this, jVar));
        i<TResult> iVar = jVar.f4869a;
        try {
            iVar.f();
            if (iVar.c()) {
                bj.b("So decompress: LiveAppContext, get resource finder wrong,  task error: " + Log.getStackTraceString(iVar.e()));
            }
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        TResult d2 = iVar.d();
        if (d2 == null) {
            return new AssetResourceFinder(context.getAssets(), str);
        }
        return d2;
    }
}
