package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class BottomBarModel implements Serializable {
    @c(a = "content")
    public String content;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(59352);
    }

    public BottomBarModel() {
        this(null, 0, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_BottomBarModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ BottomBarModel copy$default(BottomBarModel bottomBarModel, String str, int i2, UrlModel urlModel, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bottomBarModel.content;
        }
        if ((i3 & 2) != 0) {
            i2 = bottomBarModel.type;
        }
        if ((i3 & 4) != 0) {
            urlModel = bottomBarModel.icon;
        }
        return bottomBarModel.copy(str, i2, urlModel);
    }

    public final String component1() {
        return this.content;
    }

    public final int component2() {
        return this.type;
    }

    public final UrlModel component3() {
        return this.icon;
    }

    public final BottomBarModel copy(String str, int i2, UrlModel urlModel) {
        l.d(str, "");
        l.d(urlModel, "");
        return new BottomBarModel(str, i2, urlModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarModel)) {
            return false;
        }
        BottomBarModel bottomBarModel = (BottomBarModel) obj;
        return l.a(this.content, bottomBarModel.content) && this.type == bottomBarModel.type && l.a(this.icon, bottomBarModel.icon);
    }

    public final int hashCode() {
        String str = this.content;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_BottomBarModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i2 = urlModel.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BottomBarModel(content=" + this.content + ", type=" + this.type + ", icon=" + this.icon + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final int getType() {
        return this.type;
    }

    public BottomBarModel(String str, int i2, UrlModel urlModel) {
        l.d(str, "");
        l.d(urlModel, "");
        this.content = str;
        this.type = i2;
        this.icon = urlModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomBarModel(String str, int i2, UrlModel urlModel, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new UrlModel() : urlModel);
    }
}
