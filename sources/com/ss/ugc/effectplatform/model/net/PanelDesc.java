package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class PanelDesc {
    private String extra;
    private UrlModel icon;
    private List<String> tags;
    private String tags_updated_at;
    private String text;

    static {
        Covode.recordClassIndex(102507);
    }

    public PanelDesc() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.PanelDesc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PanelDesc copy$default(PanelDesc panelDesc, String str, UrlModel urlModel, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = panelDesc.text;
        }
        if ((i2 & 2) != 0) {
            urlModel = panelDesc.icon;
        }
        if ((i2 & 4) != 0) {
            str2 = panelDesc.tags_updated_at;
        }
        if ((i2 & 8) != 0) {
            str3 = panelDesc.extra;
        }
        if ((i2 & 16) != 0) {
            list = panelDesc.tags;
        }
        return panelDesc.copy(str, urlModel, str2, str3, list);
    }

    public final String component1() {
        return this.text;
    }

    public final UrlModel component2() {
        return this.icon;
    }

    public final String component3() {
        return this.tags_updated_at;
    }

    public final String component4() {
        return this.extra;
    }

    public final List<String> component5() {
        return this.tags;
    }

    public final PanelDesc copy(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        return new PanelDesc(str, urlModel, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelDesc)) {
            return false;
        }
        PanelDesc panelDesc = (PanelDesc) obj;
        return l.a(this.text, panelDesc.text) && l.a(this.icon, panelDesc.icon) && l.a(this.tags_updated_at, panelDesc.tags_updated_at) && l.a(this.extra, panelDesc.extra) && l.a(this.tags, panelDesc.tags);
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.icon;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.tags_updated_at;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.extra;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.tags;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "PanelDesc(text=" + this.text + ", icon=" + this.icon + ", tags_updated_at=" + this.tags_updated_at + ", extra=" + this.extra + ", tags=" + this.tags + ")";
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final String getText() {
        return this.text;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTags_updated_at(String str) {
        this.tags_updated_at = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public PanelDesc(String str, UrlModel urlModel, String str2, String str3, List<String> list) {
        this.text = str;
        this.icon = urlModel;
        this.tags_updated_at = str2;
        this.extra = str3;
        this.tags = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelDesc(String str, UrlModel urlModel, String str2, String str3, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : urlModel, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? list : null);
    }
}
