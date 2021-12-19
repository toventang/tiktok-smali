package com.ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class ThirdBindSettingsResponse {
    public List<BindSetting> data;
    public int status_code;
    public String status_msg;

    public static class BindSetting {
        public int bind_platform;
        public int bind_switch;
        public String bind_toast;

        static {
            Covode.recordClassIndex(40039);
        }
    }

    static {
        Covode.recordClassIndex(40038);
    }
}
