package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.g;
import java.util.List;

public class SearchEffectModel {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private String search_id;
    private String search_tips;
    private Boolean use_hot;

    static {
        Covode.recordClassIndex(102519);
    }

    public SearchEffectModel() {
        this(false, 0, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getEffects() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getSearch_id() {
        return this.search_id;
    }

    public String getSearch_tips() {
        return this.search_tips;
    }

    public Boolean getUse_hot() {
        return this.use_hot;
    }

    public void setBind_effects(List<? extends Effect> list) {
        this.bind_effects = list;
    }

    public void setCollection(List<? extends Effect> list) {
        this.collection = list;
    }

    public void setCursor(int i2) {
        this.cursor = i2;
    }

    public void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setSearch_id(String str) {
        this.search_id = str;
    }

    public void setSearch_tips(String str) {
        this.search_tips = str;
    }

    public void setUse_hot(Boolean bool) {
        this.use_hot = bool;
    }

    public SearchEffectModel(boolean z, int i2, String str, String str2, Boolean bool, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3) {
        this.has_more = z;
        this.cursor = i2;
        this.search_id = str;
        this.search_tips = str2;
        this.use_hot = bool;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectModel(boolean z, int i2, String str, String str2, Boolean bool, List list, List list2, List list3, int i3, g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : list2, (i3 & 128) == 0 ? list3 : null);
    }
}
