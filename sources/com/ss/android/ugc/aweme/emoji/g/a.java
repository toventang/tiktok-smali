package com.ss.android.ugc.aweme.emoji.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.HashMap;

public class a implements Serializable {
    @c(a = "animate_type")
    private String animateType;
    @c(a = "animate_url")
    private UrlModel animateUrl;
    @c(a = "display_name")
    private String displayName;
    @c(a = "display_name_lang")
    private HashMap<String, String> displayNameLangs;
    @c(a = "height")
    private int height;
    @c(a = "id")
    private long id;
    @c(a = "joker_sticker_id")
    private String jokerId;
    @c(a = "log_pb")
    private LogPbBean mLogPb;
    @c(a = "origin_package_id")
    private long resourcesId;
    @c(a = "static_type")
    private String staticType;
    @c(a = "static_url")
    private UrlModel staticUrl;
    @c(a = "sticker_id")
    private String stickerId;
    @c(a = "sticker_type")
    private int stickerType;
    @c(a = "version")
    private String version;
    @c(a = "width")
    private int width;

    static {
        Covode.recordClassIndex(56125);
    }

    public String getAnimateType() {
        return this.animateType;
    }

    public UrlModel getAnimateUrl() {
        return this.animateUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public HashMap<String, String> getDisplayNameLangs() {
        return this.displayNameLangs;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.id;
    }

    public String getJokerId() {
        return this.jokerId;
    }

    public LogPbBean getLogPb() {
        return this.mLogPb;
    }

    public long getResourcesId() {
        return this.resourcesId;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public UrlModel getStaticUrl() {
        return this.staticUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return String.valueOf(this.id).hashCode();
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(UrlModel urlModel) {
        this.animateUrl = urlModel;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setDisplayNameLangs(HashMap<String, String> hashMap) {
        this.displayNameLangs = hashMap;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setJokerId(String str) {
        this.jokerId = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.mLogPb = logPbBean;
    }

    public void setResourcesId(long j2) {
        this.resourcesId = j2;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(UrlModel urlModel) {
        this.staticUrl = urlModel;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i2) {
        this.stickerType = i2;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        long j2 = aVar.id;
        if (j2 > 0 && j2 == this.id) {
            return true;
        }
        if (aVar.getAnimateUrl() == null || getAnimateUrl() == null || !TextUtils.equals(aVar.getAnimateUrl().getUri(), this.animateUrl.getUri())) {
            return false;
        }
        return true;
    }
}
