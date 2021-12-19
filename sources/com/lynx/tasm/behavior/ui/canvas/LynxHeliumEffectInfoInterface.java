package com.lynx.tasm.behavior.ui.canvas;

import com.bytedance.covode.number.Covode;

public interface LynxHeliumEffectInfoInterface {
    static {
        Covode.recordClassIndex(35086);
    }

    void backendPreloadLibrary();

    String getEffectAppId();

    String getEffectResourceDownloadUrl();

    boolean getUseLocalEffectPlatformAndRender();

    void setEffectLibraryUrlFallback(String str, boolean z);

    void setEffectResourceDownloadInfo(String str, String str2, boolean z);

    void setSmashUrlFallback(String str, boolean z);

    void setUseExternalEffectLibrary(String str, boolean z);

    void setUseLocalEffectPlatformAndRender(boolean z);

    void updateEffectPathToHelium();

    boolean validateLibrary(boolean z);
}
