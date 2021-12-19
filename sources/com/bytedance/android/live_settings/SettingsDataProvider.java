package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;

public interface SettingsDataProvider {
    static {
        Covode.recordClassIndex(7361);
    }

    HashMap<String, LiveSettingModel> getLiveSettingMap();

    ArrayList<LiveSettingModel> getLiveSettings();
}
