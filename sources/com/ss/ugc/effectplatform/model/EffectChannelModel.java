package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class EffectChannelModel {
    private List<? extends EffectCategoryModel> category;
    private List<? extends Effect> collection;
    private List<? extends Effect> effects;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    static {
        Covode.recordClassIndex(102452);
    }

    public EffectChannelModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public final List<EffectCategoryModel> getCategory_list() {
        return this.category;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final EffectPanelModel getPanel_model() {
        return this.panel;
    }

    public String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public final boolean checkValued() {
        return getPanel_model().checkValued();
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public final void setCategory_list(List<? extends EffectCategoryModel> list) {
        l.c(list, "");
        this.category = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        l.c(list, "");
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.c(list, "");
        this.effects = list;
    }

    public final void setPanel_model(EffectPanelModel effectPanelModel) {
        l.c(effectPanelModel, "");
        this.panel = effectPanelModel;
    }

    public void setUrl_prefix(List<String> list) {
        l.c(list, "");
        this.url_prefix = list;
    }

    public EffectChannelModel(String str, List<? extends Effect> list, List<? extends EffectCategoryModel> list2, EffectPanelModel effectPanelModel, String str2, String str3, List<? extends Effect> list3, List<String> list4) {
        l.c(list, "");
        l.c(list2, "");
        l.c(effectPanelModel, "");
        l.c(list3, "");
        l.c(list4, "");
        this.version = str;
        this.effects = list;
        this.category = list2;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.collection = list3;
        this.url_prefix = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelModel(String str, List list, List list2, EffectPanelModel effectPanelModel, String str2, String str3, List list3, List list4, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? new ArrayList() : list, (i2 & 4) != 0 ? new ArrayList() : list2, (i2 & 8) != 0 ? new EffectPanelModel(null, null, null, null, null, null, 63, null) : effectPanelModel, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? str3 : null, (i2 & 64) != 0 ? new ArrayList() : list3, (i2 & 128) != 0 ? new ArrayList() : list4);
    }
}
