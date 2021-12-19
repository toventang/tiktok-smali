package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;

public class PublishExtensionModel {
    @c(a = "anchor_business_type")
    public int anchorBusinessType = -1;
    @c(a = "anchor_content")
    public String anchorContent;
    @c(a = "anchor_icon")
    public UrlModel anchorIcon;
    @c(a = "anchor_id")
    public String anchorId = "";
    @c(a = "subtype")
    public String anchorSubtype = "";
    @c(a = "anchor_tag")
    public String anchorTag;
    @c(a = "anchor_title")
    public String anchorTitle;
    @c(a = "branded_content_type")
    public String brandedContentType = "0";
    @c(a = "anchors")
    public List<CreateAnchorInfo> createAnchorInfos;
    public String dataType;
    @c(a = "is_from_commercial_sound_page")
    public boolean fromCommercialSoundPage;
    @c(a = "is_star_atlas")
    public boolean isStarAtlas;
    @c(a = "mission")
    public Mission mission;
    @c(a = "mp_url")
    public String mpUrl;
    @c(a = "open_url")
    public String openUrl;
    @c(a = "outer_star_atlas")
    public String outerStarAtlas;
    @c(a = "poi_data")
    public PoiData poiData;
    @c(a = "recommend_anchor")
    public List<AnchorPublishStruct> recommendAnchor;
    public String referSeedId;
    public String referSeedName;
    @c(a = "related_hot_sentence")
    public String relatedHotSentence;
    public String seedId;
    public String seedName;
    @c(a = "sentence_id")
    public String sentenceId;
    @c(a = "shop_order_share_structinfo")
    public ShopOrderShareStructInfo shopOrderShareStructInfo;
    @c(a = "source")
    public int source;
    @c(a = "star_atlas_content")
    public String starAtlasContent;
    @c(a = "tcm_tag_ba_info")
    public List<TagBAUser> tcmTagBaInfo;
    @c(a = "web_url")
    public String webUrl;
    @c(a = "zip_uri")
    public String zipUri;

    static {
        Covode.recordClassIndex(84469);
    }

    public static String toString(PublishExtensionModel publishExtensionModel) {
        if (publishExtensionModel == null) {
            return null;
        }
        return new f().b(publishExtensionModel);
    }

    public static PublishExtensionModel fromContext(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || TextUtils.isEmpty(baseShortVideoContext.commerceData)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) new f().a(baseShortVideoContext.commerceData, PublishExtensionModel.class);
    }

    public static PublishExtensionModel fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) new f().a(str, PublishExtensionModel.class);
    }
}
