package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class FloatingCardInfo implements Serializable {
    static final long serialVersionUID = 42;
    @c(a = "button_bg")
    public UrlModel buttonBackground;
    @c(a = "button_desc")
    public String buttonDesc;
    @c(a = "description")
    public String description;
    @c(a = "icons")
    public List<UrlModel> icons;
    @c(a = "schema")
    public String schema;
    @c(a = "schema_desc")
    public String schemaDesc;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(59384);
    }

    public UrlModel getButtonBackground() {
        return this.buttonBackground;
    }

    public String getButtonDesc() {
        return this.buttonDesc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getIcons() {
        return this.icons;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSchemaDesc() {
        return this.schemaDesc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtonBackground(UrlModel urlModel) {
        this.buttonBackground = urlModel;
    }

    public void setButtonDesc(String str) {
        this.buttonDesc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcons(List<UrlModel> list) {
        this.icons = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaDesc(String str) {
        this.schemaDesc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
