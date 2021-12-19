package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LiveCommentTranslationConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final i DEFAULT;
    public static final LiveCommentTranslationConfigSetting INSTANCE = new LiveCommentTranslationConfigSetting();

    private LiveCommentTranslationConfigSetting() {
    }

    public final i getValue() {
        i iVar = (i) SettingsManager.INSTANCE.getValueSafely(LiveCommentTranslationConfigSetting.class);
        if (iVar == null) {
            return DEFAULT;
        }
        return iVar;
    }

    static {
        Covode.recordClassIndex(10921);
        i iVar = new i();
        iVar.f15780a = false;
        iVar.f15781b = 1;
        iVar.f15782c = 3;
        iVar.f15783d = 5;
        l.b(iVar, "");
        DEFAULT = iVar;
    }
}
