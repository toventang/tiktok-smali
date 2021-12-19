package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

public class ac implements Serializable {
    @c(a = "avatar_icon")
    public UrlModel avatarIcon;
    @c(a = "background_type")
    public int backgroundType;
    @c(a = "button_style")
    public int buttonStyle;
    @c(a = "button_text")
    public String buttonText;
    @c(a = "click_track_url_list")
    public UrlModel clickTrackUrlList;
    @c(a = "comment_area")
    public a commentArea;
    @c(a = "creative_id")
    public String creativeId;
    @c(a = "description")
    public String description;
    @c(a = "download_url")
    public String downloadUrl;
    @c(a = "feed_show_type")
    public int feedShowType;
    public boolean hasDislike;
    @c(a = "image_list")
    List<UrlModel> imageList;
    @c(a = "is_preview")
    public boolean isPreview;
    @c(a = "label")
    public String label;
    @c(a = "label_type")
    public int labelType;
    public int linkType;
    @c(a = "log_extra")
    public String logExtra;
    private User mUser;
    @c(a = "mp_url")
    public String mpUrl;
    @c(a = "open_url")
    public String openUrl;
    @c(a = "package")
    public String packageName;
    @c(a = "report_enable")
    public boolean reportEnabled = true;
    @c(a = "saiyan_link_type")
    public int saiyanLinkType;
    @c(a = "show_close_tips")
    public boolean showCloseTips;
    @c(a = "show_type")
    public int showType;
    @c(a = "source")
    public String source;
    @c(a = "tips_schema")
    public String tipsSchema;
    @c(a = "tips_text")
    public String tipsText;
    @c(a = "tips_type")
    public int tipsType;
    @c(a = "title")
    public String title;
    @c(a = "track_url_list")
    public UrlModel trackUrlList;
    @c(a = StringSet.type)
    public String type;
    @c(a = "web_title")
    public String webTitle;
    @c(a = "web_url")
    public String webUrl;

    public static class a implements Serializable {
        @c(a = "avatar_icon")
        public UrlModel avatarIcon;
        @c(a = "feature_label")
        public String featureLabel;
        @c(a = "title")
        public String title;

        static {
            Covode.recordClassIndex(46148);
        }
    }

    static {
        Covode.recordClassIndex(46147);
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public User getUser() {
        return this.mUser;
    }

    public boolean isHasDislike() {
        return this.hasDislike;
    }

    public UrlModel getCommentAvatarIcon() {
        a aVar = this.commentArea;
        if (aVar == null || aVar.avatarIcon == null) {
            return this.avatarIcon;
        }
        return this.commentArea.avatarIcon;
    }

    public boolean showOnFeed() {
        int i2 = this.showType;
        if (i2 == 0 || i2 == 1) {
            return true;
        }
        return false;
    }

    public boolean showOnComment() {
        a aVar;
        int i2 = this.showType;
        if ((i2 != 0 && i2 != 2) || (aVar = this.commentArea) == null || aVar.title == null || this.commentArea.featureLabel == null) {
            return false;
        }
        return true;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setHasDislike(boolean z) {
        this.hasDislike = z;
    }

    public void setLinkType(int i2) {
        this.linkType = i2;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setUser(User user) {
        this.mUser = user;
    }
}
