package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PlatformBindInfo {
    @c(a = "allow_sync")
    private boolean allowSync;
    @c(a = "bind_user_name")
    private String bindUserName;
    @c(a = "platform")
    private String platform;
    @c(a = "publish_sync_tips_cnt")
    private int publishSyncTipsCnt;
    @c(a = "tigger_full_sync")
    private boolean tiggerFullSync;

    static {
        Covode.recordClassIndex(3625);
    }

    public String getBindUserName() {
        return this.bindUserName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int getPublishSyncTipsCnt() {
        return this.publishSyncTipsCnt;
    }

    public boolean isAllowSync() {
        return this.allowSync;
    }

    public boolean isTiggerFullSync() {
        return this.tiggerFullSync;
    }

    public int hashCode() {
        int i2;
        String str = this.platform;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = ((((i2 * 31) + (this.allowSync ? 1 : 0)) * 31) + (this.tiggerFullSync ? 1 : 0)) * 31;
        String str2 = this.bindUserName;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + this.publishSyncTipsCnt;
    }

    public void setAllowSync(boolean z) {
        this.allowSync = z;
    }

    public void setBindUserName(String str) {
        this.bindUserName = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setPublishSyncTipsCnt(int i2) {
        this.publishSyncTipsCnt = i2;
    }

    public void setTiggerFullSync(boolean z) {
        this.tiggerFullSync = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlatformBindInfo platformBindInfo = (PlatformBindInfo) obj;
            if (this.allowSync != platformBindInfo.allowSync || this.tiggerFullSync != platformBindInfo.tiggerFullSync || this.publishSyncTipsCnt != platformBindInfo.publishSyncTipsCnt) {
                return false;
            }
            String str = this.platform;
            if (str == null ? platformBindInfo.platform != null : !str.equals(platformBindInfo.platform)) {
                return false;
            }
            String str2 = this.bindUserName;
            String str3 = platformBindInfo.bindUserName;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }
}
