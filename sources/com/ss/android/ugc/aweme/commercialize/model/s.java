package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;

public class s extends Comment implements Serializable {
    private static final long serialVersionUID = 1075399560205544614L;
    private String aid;
    @c(a = "avatar_icon")
    private UrlModel avatarIcon;
    private AwemeRawAd awemeRawAd;
    @c(a = "button_text")
    private String buttonText;
    @c(a = "comment_info")
    private String commentInfo;
    @c(a = "comment_nickname")
    private String commentNickName;
    @c(a = "comment_style")
    private int commentStyle;
    @c(a = "comment_time")
    private long commentTime;
    private boolean isAdFake;
    @c(a = "mock_count")
    private int mockCount;
    @c(a = "mock_creator")
    private int mockCreator;
    @c(a = "show_button_number")
    private int showButtonNumber;
    @c(a = "show_comment_number")
    private int showCommentNumber;
    @c(a = "source")
    private String source;
    @c(a = "tag_text")
    private String tagText;
    @c(a = "title")
    private String title;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(46188);
    }

    public String getAid() {
        return this.aid;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getCommentInfo() {
        return this.commentInfo;
    }

    public String getCommentNickName() {
        return this.commentNickName;
    }

    public int getCommentStyle() {
        return this.commentStyle;
    }

    public long getCommentTime() {
        return this.commentTime;
    }

    public int getShowButtonNumber() {
        return this.showButtonNumber;
    }

    public int getShowCommentNumber() {
        return this.showCommentNumber;
    }

    public String getSource() {
        return this.source;
    }

    public String getTagText() {
        return this.tagText;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public boolean isAdFake() {
        return this.isAdFake;
    }

    public boolean showAsDefault() {
        if (this.mockCount == 1) {
            return true;
        }
        return false;
    }

    public boolean showCreatorTag() {
        if (this.mockCreator == 1) {
            return true;
        }
        return false;
    }

    public s setAdFake(boolean z) {
        this.isAdFake = z;
        return this;
    }

    public s setAid(String str) {
        this.aid = str;
        return this;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public s setAwemeRawAd(AwemeRawAd awemeRawAd2) {
        this.awemeRawAd = awemeRawAd2;
        return this;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCommentInfo(String str) {
        this.commentInfo = str;
    }

    public void setCommentNickName(String str) {
        this.commentNickName = str;
    }

    public void setCommentStyle(int i2) {
        this.commentStyle = i2;
    }

    public void setCommentTime(long j2) {
        this.commentTime = j2;
    }

    public void setShowButtonNumber(int i2) {
        this.showButtonNumber = i2;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
