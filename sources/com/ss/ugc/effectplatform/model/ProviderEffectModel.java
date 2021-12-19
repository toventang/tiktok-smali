package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class ProviderEffectModel {
    private int cursor;
    private String extra;
    private boolean has_more;
    private String search_tips;
    private List<? extends ProviderEffect> sticker_list;
    private String subtitle;

    static {
        Covode.recordClassIndex(102462);
    }

    public ProviderEffectModel() {
        this(null, 0, false, null, null, null, 63, null);
    }

    public int getCursor() {
        return this.cursor;
    }

    public String getExtra() {
        return this.extra;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.ProviderEffect>, java.util.List<com.ss.ugc.effectplatform.model.ProviderEffect> */
    public List<ProviderEffect> getSticker_list() {
        return this.sticker_list;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setCursor(int i2) {
        this.cursor = i2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setSticker_list(List<? extends ProviderEffect> list) {
        l.c(list, "");
        this.sticker_list = list;
    }

    public ProviderEffectModel(String str, int i2, boolean z, List<? extends ProviderEffect> list, String str2, String str3) {
        l.c(list, "");
        this.search_tips = str;
        this.cursor = i2;
        this.has_more = z;
        this.sticker_list = list;
        this.subtitle = str2;
        this.extra = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModel(String str, int i2, boolean z, List list, String str2, String str3, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) == 0 ? z : false, (i3 & 8) != 0 ? new ArrayList() : list, (i3 & 16) != 0 ? null : str2, (i3 & 32) == 0 ? str3 : null);
    }
}
