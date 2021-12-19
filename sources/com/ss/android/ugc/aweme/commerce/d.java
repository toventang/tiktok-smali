package com.ss.android.ugc.aweme.commerce;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    public static final a Companion = new a((byte) 0);
    @c(a = "android_download_app_link")
    private String androidDownloadAppLink;
    @c(a = "ios_download_app_link")
    private String iosDownloadAppLink;
    @c(a = "permission_list")
    private List<String> permissionList;
    @c(a = "suggested_accounts_entrance_tip_type")
    private int suggestedAccountsEntranceTipType;
    @c(a = "suggested_accounts_lynx_schema")
    private String suggestedAccountsLynxSchema;

    static {
        Covode.recordClassIndex(45192);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45193);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getAndroidDownloadAppLink() {
        return this.androidDownloadAppLink;
    }

    public final String getIosDownloadAppLink() {
        return this.iosDownloadAppLink;
    }

    public final List<String> getPermissionList() {
        return this.permissionList;
    }

    public final int getSuggestedAccountsEntranceTipType() {
        return this.suggestedAccountsEntranceTipType;
    }

    public final String getSuggestedAccountsLynxSchema() {
        return this.suggestedAccountsLynxSchema;
    }

    public final boolean enableAutoMsg() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("001002");
        }
        return false;
    }

    public final boolean enableBrandedContent() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("006001");
        }
        return false;
    }

    public final boolean enableBrandedContentRemoveMe() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("006202");
        }
        return false;
    }

    public final boolean enableBrandedContentViewInsights() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("006201");
        }
        return false;
    }

    public final boolean enableBusinessRegistration() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("007001");
        }
        return false;
    }

    public final boolean enableCreativeHub() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("002001");
        }
        return false;
    }

    public final boolean enableDM() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("001001");
        }
        return false;
    }

    public final boolean enableLiveLinks() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("005001");
        }
        return false;
    }

    public final boolean enableShowCategory() {
        List<String> list = this.permissionList;
        if (list != null) {
            return list.contains("007002");
        }
        return false;
    }

    public final String getDownloadAppLinkToShowInEditProfile() {
        if (!TextUtils.isEmpty(this.androidDownloadAppLink)) {
            return this.androidDownloadAppLink;
        }
        return this.iosDownloadAppLink;
    }

    public final boolean enableSuggestedAccounts() {
        List<String> list = this.permissionList;
        if (list == null || !list.contains("008001") || this.suggestedAccountsEntranceTipType == 0) {
            return false;
        }
        return true;
    }

    public final void setAndroidDownloadAppLink(String str) {
        this.androidDownloadAppLink = str;
    }

    public final void setIosDownloadAppLink(String str) {
        this.iosDownloadAppLink = str;
    }

    public final void setPermissionList(List<String> list) {
        this.permissionList = list;
    }

    public final void setSuggestedAccountsEntranceTipType(int i2) {
        this.suggestedAccountsEntranceTipType = i2;
    }

    public final void setSuggestedAccountsLynxSchema(String str) {
        this.suggestedAccountsLynxSchema = str;
    }
}
