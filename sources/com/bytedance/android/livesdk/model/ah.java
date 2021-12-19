package com.bytedance.android.livesdk.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class ah implements Serializable {
    @c(a = "enable_dislike")
    private int dislike;
    @c(a = "enable_draw_stream")
    private int draw;
    @c(a = "event")
    private String event;
    @c(a = "feed_style")
    private int feedStyle;
    @c(a = "id")
    private long id;
    @c(a = "inter_url")
    private String innerStreamUrl;
    private boolean isChecked;
    @c(a = StringSet.name)
    private String name;
    @c(a = "req_from")
    private String reqFrom;
    @c(a = "default")
    private int showdefault;
    @c(a = "source")
    private int source;
    @c(a = "style")
    private int style;
    @c(a = StringSet.type)
    private int type;
    @c(a = "url")
    private String url;

    static {
        Covode.recordClassIndex(11309);
    }

    public final int getDislike() {
        return this.dislike;
    }

    public final String getEvent() {
        return this.event;
    }

    public final int getFeedStyle() {
        return this.feedStyle;
    }

    public final long getId() {
        return this.id;
    }

    public final String getInnerStreamUrl() {
        return this.innerStreamUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReqFrom() {
        return this.reqFrom;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final boolean enableDraw() {
        if (this.draw == 1) {
            return true;
        }
        return false;
    }

    public final boolean isDefaultItem() {
        if (this.showdefault == 1) {
            return true;
        }
        return false;
    }

    public final boolean isSinleLine() {
        if (this.style == 1) {
            return true;
        }
        return false;
    }

    public final int getShowdefault() {
        int i2 = this.showdefault;
        if (!(i2 == 1 || i2 == 0)) {
            this.showdefault = 0;
        }
        return this.showdefault;
    }

    public final int getStyle() {
        int i2 = this.style;
        if (i2 <= 0 || i2 > 4) {
            this.style = 2;
        }
        return this.style;
    }

    public final int getType() {
        int i2 = this.type;
        if (!(i2 == 1 || i2 == 2)) {
            this.type = 1;
        }
        return this.type;
    }

    public final boolean isFollowItem() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public final String getTypeString() {
        String str = this.url;
        if (str == null) {
            return null;
        }
        return Uri.parse(str).getQueryParameter(StringSet.type);
    }

    public final boolean isItemValid() {
        if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.url)) {
            return false;
        }
        return true;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setDislike(int i2) {
        this.dislike = i2;
    }

    public final void setEvent(String str) {
        this.event = str;
    }

    public final void setFeedStyle(int i2) {
        this.feedStyle = i2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setReqFrom(String str) {
        this.reqFrom = str;
    }

    public final void setShowdefault(int i2) {
        this.showdefault = i2;
    }

    public final void setSource(int i2) {
        this.source = i2;
    }

    public final void setStyle(int i2) {
        this.style = i2;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
