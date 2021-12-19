package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class EffectCategoryModel extends EffectCategoryModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel;

    static {
        Covode.recordClassIndex(95402);
    }

    public EffectCategoryModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final com.ss.ugc.effectplatform.model.EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final boolean is_default() {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            return kCategoryModel2.is_default();
        }
        return super.is_default();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final List<String> getEffects() {
        List<String> effects;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (effects = kCategoryModel2.getEffects()) == null) {
            return super.getEffects();
        }
        return effects;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (extra = kCategoryModel2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final UrlModel getIcon() {
        UrlModel icon;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (icon = kCategoryModel2.getIcon()) == null) {
            return super.getIcon();
        }
        return icon;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final UrlModel getIcon_selected() {
        UrlModel icon_selected;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (icon_selected = kCategoryModel2.getIcon_selected()) == null) {
            return super.getIcon_selected();
        }
        return icon_selected;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (id = kCategoryModel2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getKey() {
        String key;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (key = kCategoryModel2.getKey()) == null) {
            return super.getKey();
        }
        return key;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getName() {
        String name;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (name = kCategoryModel2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags = kCategoryModel2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags_updated_at = kCategoryModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final void setIsDefault(boolean z) {
        super.setIsDefault(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setIcon(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setIcon_selected(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setIcon_selected(urlModel);
        }
        super.setIcon_selected(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setTags_updated_at(String str) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void set_default(boolean z) {
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(z);
        }
        super.set_default(z);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setEffects(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setEffects(list);
        }
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setId(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setKey(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setKey(str);
        }
        super.setKey(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setName(String str) {
        l.c(str, "");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setTags(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags(list);
        }
        super.setTags(list);
    }

    public EffectCategoryModel(com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel) {
        super(effectCategoryModel);
        this.kCategoryModel = effectCategoryModel;
        com.ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            List<String> effects = kCategoryModel2.getEffects();
            if (effects != null) {
                super.setEffects(effects);
            }
            String extra = kCategoryModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kCategoryModel2.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            UrlModel icon_selected = kCategoryModel2.getIcon_selected();
            if (icon_selected != null) {
                super.setIcon_selected(icon_selected);
            }
            String id = kCategoryModel2.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryModel2.is_default());
            String key = kCategoryModel2.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryModel2.getName();
            if (name != null) {
                super.setName(name);
            }
            List<String> tags = kCategoryModel2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kCategoryModel2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryModel(com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectCategoryModel);
    }
}
