package com.ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class g implements Serializable {
    @c(a = "avatar_thumb")
    public UrlModel avatarThumb;
    @c(a = "challenge_guide")
    public b challengeGuide;
    @c(a = "children")
    public List<String> children;
    @c(a = "commerce_sticker")
    public c commerceSticker;
    @c(a = "desc")
    public String desc;
    @c(a = "effect_id")
    public String effectId;
    @c(a = "effect_source")
    public int effectSource;
    @c(a = "effect_creator_type")
    public int effectType;
    @c(a = "extra")
    public String extra;
    @c(a = "icon_url")
    public UrlModel iconUrl;
    @c(a = "id")
    public String id;
    @c(a = "is_favorite")
    public boolean isFavorite;
    @c(a = "linked_anchors")
    public List<e> linkedAnchors;
    public boolean mIsSelect;
    @c(a = "sec_uid")
    public String mSecUid;
    @c(a = "tags")
    public List<String> mTags;
    @c(a = StringSet.name)
    public String name;
    @c(a = "owner_id")
    public String ownerId;
    @c(a = "owner_nickname")
    public String ownerName;
    @c(a = "owner_verified_type")
    public int ownerVerifiedType;
    @c(a = "related_aweme")
    public Aweme relatedAweme;
    @c(a = "share_info")
    public ShareInfo shareInfo = new ShareInfo();
    @c(a = "user_count")
    public long userCount;
    @c(a = "vv_count")
    public long viewCount;

    static {
        Covode.recordClassIndex(88252);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.id});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return com.ss.android.ugc.aweme.base.utils.g.a(this.id, ((g) obj).id);
    }
}
