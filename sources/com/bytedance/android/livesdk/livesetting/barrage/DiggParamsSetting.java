package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DiggParamsSetting {
    @Group(isDefault = true, value = "default group")
    private static final h DEFAULT;
    public static final DiggParamsSetting INSTANCE = new DiggParamsSetting();

    private DiggParamsSetting() {
    }

    public final h getValue() {
        h hVar = (h) SettingsManager.INSTANCE.getValueSafely(DiggParamsSetting.class);
        if (hVar == null) {
            return DEFAULT;
        }
        return hVar;
    }

    static {
        Covode.recordClassIndex(10501);
        h hVar = new h();
        hVar.f15772a = 0;
        hVar.f15773b = 500;
        hVar.f15774c = 15;
        hVar.f15775d = 15;
        hVar.f15776e = 80;
        hVar.f15777f = 1;
        hVar.f15778g = false;
        hVar.f15779h = 300;
        l.b(hVar, "");
        DEFAULT = hVar;
    }
}
