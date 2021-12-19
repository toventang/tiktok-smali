package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class b implements Serializable {
    @c(a = "display_name")
    private String displayName;
    @c(a = "icon_url")
    private String iconUrl;
    @c(a = "id")
    private long id;
    private int optional;
    @c(a = "resource_url")
    private String resourceUrl;
    private String type;
    @c(a = "version")
    private String version;

    static {
        Covode.recordClassIndex(56107);
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.id;
    }

    public int getOptional() {
        return this.optional;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return String.valueOf(this.id).hashCode();
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setOptional(int i2) {
        this.optional = i2;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof b) && this.id == ((b) obj).getId()) {
            return true;
        }
        return false;
    }
}
