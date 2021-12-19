package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;
import java.util.List;

public final class AwemeACLShare implements Serializable {
    public static final Companion Companion = new Companion(null);
    @c(a = "download_general")
    public ACLCommonShare downloadGeneral;
    @c(a = "download_mask_panel")
    public ACLCommonShare downloadMaskPanel;
    @c(a = "download_share_panel")
    public ACLCommonShare downloadSharePanel;
    @c(a = "platform_list")
    public List<ACLCommonShare> platformList;
    @c(a = "share_general")
    public ACLCommonShare shareGeneral;
    @c(a = "share_list_status")
    public int shareListStatus;
    @c(a = "share_third_platform")
    public ACLCommonShare shareThirdPlatform;

    static {
        Covode.recordClassIndex(59310);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(59311);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final ACLCommonShare getDownloadGeneral() {
        return this.downloadGeneral;
    }

    public final ACLCommonShare getDownloadMaskPanel() {
        return this.downloadMaskPanel;
    }

    public final ACLCommonShare getDownloadSharePanel() {
        return this.downloadSharePanel;
    }

    public final List<ACLCommonShare> getPlatformList() {
        return this.platformList;
    }

    public final ACLCommonShare getShareGeneral() {
        return this.shareGeneral;
    }

    public final int getShareListStatus() {
        return this.shareListStatus;
    }

    public final ACLCommonShare getShareThirdPlatform() {
        return this.shareThirdPlatform;
    }

    public final void setDownloadGeneral(ACLCommonShare aCLCommonShare) {
        this.downloadGeneral = aCLCommonShare;
    }

    public final void setDownloadMaskPanel(ACLCommonShare aCLCommonShare) {
        this.downloadMaskPanel = aCLCommonShare;
    }

    public final void setDownloadSharePanel(ACLCommonShare aCLCommonShare) {
        this.downloadSharePanel = aCLCommonShare;
    }

    public final void setPlatformList(List<ACLCommonShare> list) {
        this.platformList = list;
    }

    public final void setShareGeneral(ACLCommonShare aCLCommonShare) {
        this.shareGeneral = aCLCommonShare;
    }

    public final void setShareListStatus(int i2) {
        this.shareListStatus = i2;
    }

    public final void setShareThirdPlatform(ACLCommonShare aCLCommonShare) {
        this.shareThirdPlatform = aCLCommonShare;
    }
}
