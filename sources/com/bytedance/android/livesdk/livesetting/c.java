package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsDataProvider;
import com.bytedance.android.livesettings.LiveSettingsCollector_livebase;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;

public final class c implements SettingsDataProvider {
    static {
        Covode.recordClassIndex(10595);
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final HashMap<String, LiveSettingModel> getLiveSettingMap() {
        HashMap<String, LiveSettingModel> hashMap = LiveSettingsCollector_livebase.modelMaps;
        l.b(hashMap, "");
        return hashMap;
    }

    @Override // com.bytedance.android.live_settings.SettingsDataProvider
    public final ArrayList<LiveSettingModel> getLiveSettings() {
        ArrayList<LiveSettingModel> liveSettingModels = LiveSettingsCollector_livebase.getLiveSettingModels();
        l.b(liveSettingModels, "");
        return liveSettingModels;
    }
}
