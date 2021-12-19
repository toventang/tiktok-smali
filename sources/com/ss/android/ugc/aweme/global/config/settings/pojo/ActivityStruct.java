package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class ActivityStruct {
    @c(a = "activity_name")
    private String activityName;
    @c(a = "activity_sticker_id_array")
    private List<String> activityStickerIdArray = new ArrayList();
    @c(a = "comment_icon")
    private UrlModel commentIcon;
    @c(a = "digg_icon")
    private UrlModel diggIcon;
    @c(a = "hash_tags")
    private List<String> hashTags = new ArrayList();
    @c(a = "in_activity")
    private Boolean inActivity;
    @c(a = "share_icon")
    private UrlModel shareIcon;
    @c(a = "share_tip_icon")
    private UrlModel shareTipIcon;
    @c(a = "shot_icon")
    private UrlModel shotIcon;
    @c(a = "undigg_icon")
    private UrlModel undiggIcon;
    @c(a = "watermark_struct")
    private WatermarkStruct watermarkStruct;

    static {
        Covode.recordClassIndex(63006);
    }

    public List<String> getActivityStickerIdArray() {
        return this.activityStickerIdArray;
    }

    public List<String> getHashTags() {
        return this.hashTags;
    }

    public String getActivityName() {
        String str = this.activityName;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public UrlModel getCommentIcon() {
        UrlModel urlModel = this.commentIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public UrlModel getDiggIcon() {
        UrlModel urlModel = this.diggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public Boolean getInActivity() {
        Boolean bool = this.inActivity;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public UrlModel getShareIcon() {
        UrlModel urlModel = this.shareIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public UrlModel getShareTipIcon() {
        UrlModel urlModel = this.shareTipIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public UrlModel getShotIcon() {
        UrlModel urlModel = this.shotIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public UrlModel getUndiggIcon() {
        UrlModel urlModel = this.undiggIcon;
        if (urlModel != null) {
            return urlModel;
        }
        throw new a();
    }

    public WatermarkStruct getWatermarkStruct() {
        WatermarkStruct watermarkStruct2 = this.watermarkStruct;
        if (watermarkStruct2 != null) {
            return watermarkStruct2;
        }
        throw new a();
    }
}
