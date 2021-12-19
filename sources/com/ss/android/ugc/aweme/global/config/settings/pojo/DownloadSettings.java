package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class DownloadSettings {
    @c(a = "download_dialog_config")
    private DownloadDialogSettings downloadDialogConfig;
    @c(a = "download_lib_switch")
    private Integer downloadLibSwitch;

    static {
        Covode.recordClassIndex(63030);
    }

    public DownloadDialogSettings getDownloadDialogConfig() {
        DownloadDialogSettings downloadDialogSettings = this.downloadDialogConfig;
        if (downloadDialogSettings != null) {
            return downloadDialogSettings;
        }
        throw new a();
    }

    public Integer getDownloadLibSwitch() {
        Integer num = this.downloadLibSwitch;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
