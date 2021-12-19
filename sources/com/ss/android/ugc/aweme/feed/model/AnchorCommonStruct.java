package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.a;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.a.z;
import java.io.Serializable;
import java.util.List;

public final class AnchorCommonStruct implements Serializable {
    @c(a = "actions")
    public List<AnchorPanelAction> actions = z.INSTANCE;
    @c(a = "deep_link")
    public String deepLink = "";
    @c(a = "description")
    public String description = "";
    @c(a = "extra")
    public String extra = "";
    @c(a = "general_type")
    public int generalType;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "id")
    public String id = "";
    @c(a = "keyword")
    public String keyword;
    @c(a = "language")
    public String language = "";
    @c(a = "log_extra")
    public String logExtra;
    @a
    public UrlModel newStyleBubbleIcon;
    @c(a = "real_count")
    public int realCount;
    @c(a = "schema")
    public String schema = "";
    @c(a = "show_type")
    public int showType = 1;
    @c(a = "thumbnail")
    public UrlModel thumbnail;
    @c(a = StringSet.type)
    public int type;
    @c(a = "universal_link")
    public String universalLink = "";
    @c(a = "url")
    public String url;

    static {
        Covode.recordClassIndex(59295);
    }

    public final List<AnchorPanelAction> getActions() {
        return this.actions;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final int getGeneralType() {
        return this.generalType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final UrlModel getNewStyleBubbleIcon() {
        return this.newStyleBubbleIcon;
    }

    public final int getRealCount() {
        return this.realCount;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setNewStyleBubbleIcon(UrlModel urlModel) {
        this.newStyleBubbleIcon = urlModel;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
