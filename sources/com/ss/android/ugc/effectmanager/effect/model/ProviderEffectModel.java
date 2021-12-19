package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class ProviderEffectModel extends ProviderEffectModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect;

    static {
        Covode.recordClassIndex(95417);
    }

    public ProviderEffectModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final com.ss.ugc.effectplatform.model.ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final String getSearchTips() {
        return super.getSearchTips();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final List<ProviderEffect> getStickerList() {
        return super.getStickerList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final int getCursor() {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final boolean getHas_more() {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (extra = kProviderEffect2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final String getSearch_tips() {
        String search_tips;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (search_tips = kProviderEffect2.getSearch_tips()) == null) {
            return super.getSearch_tips();
        }
        return search_tips;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final List<ProviderEffect> getSticker_list() {
        List<ProviderEffect> sticker_list;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (sticker_list = kProviderEffect2.getSticker_list()) == null) {
            return super.getSticker_list();
        }
        return sticker_list;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final String getSubtitle() {
        String subtitle;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (subtitle = kProviderEffect2.getSubtitle()) == null) {
            return super.getSubtitle();
        }
        return subtitle;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final void setSearchTips(String str) {
        super.setSearchTips(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setCursor(int i2) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setCursor(i2);
        }
        super.setCursor(i2);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setExtra(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setSearch_tips(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final void setStickerList(List<ProviderEffect> list) {
        l.c(list, "");
        super.setStickerList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setSubtitle(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSubtitle(str);
        }
        super.setSubtitle(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setSticker_list(List<? extends ProviderEffect> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_list(list);
        }
        super.setSticker_list(list);
    }

    public ProviderEffectModel(com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel) {
        super(providerEffectModel);
        this.kProviderEffect = providerEffectModel;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            super.setCursor(kProviderEffect2.getCursor());
            String extra = kProviderEffect2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            super.setHas_more(kProviderEffect2.getHas_more());
            String search_tips = kProviderEffect2.getSearch_tips();
            if (search_tips != null) {
                super.setSearch_tips(search_tips);
            }
            List<ProviderEffect> sticker_list = kProviderEffect2.getSticker_list();
            if (sticker_list != null) {
                super.setSticker_list(sticker_list);
            }
            String subtitle = kProviderEffect2.getSubtitle();
            if (subtitle != null) {
                super.setSubtitle(subtitle);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModel(com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : providerEffectModel);
    }
}
