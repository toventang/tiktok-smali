package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectPanelModel {
    private String extra;
    private UrlModel icon;
    private String id;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    static {
        Covode.recordClassIndex(102454);
    }

    public EffectPanelModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public String getText() {
        return this.text;
    }

    public final boolean checkValued() {
        if (getIcon() != null) {
            return true;
        }
        setIcon(new UrlModel(null, null, 3, null));
        return true;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTags(List<String> list) {
        l.c(list, "");
        this.tags = list;
    }

    public EffectPanelModel(String str, String str2, UrlModel urlModel, List<String> list, String str3, String str4) {
        l.c(list, "");
        this.text = str;
        this.id = str2;
        this.icon = urlModel;
        this.tags = list;
        this.tags_updated_at = str3;
        this.extra = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModel(String str, String str2, UrlModel urlModel, List list, String str3, String str4, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? new UrlModel(null, null, 3, null) : urlModel, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? null : str3, (i2 & 32) == 0 ? str4 : null);
    }
}
