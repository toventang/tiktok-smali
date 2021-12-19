package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class EffectPanelModel extends EffectPanelModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel;

    static {
        Covode.recordClassIndex(95408);
    }

    public EffectPanelModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate
    public final com.ss.ugc.effectplatform.model.EffectPanelModel getKPanelModel() {
        return this.kPanelModel;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (extra = kPanelModel2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final UrlModel getIcon() {
        UrlModel icon;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (icon = kPanelModel2.getIcon()) == null) {
            return super.getIcon();
        }
        return icon;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final String getId() {
        String id;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (id = kPanelModel2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final List<String> getTags() {
        List<String> tags;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (tags = kPanelModel2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final String getTags_updated_at() {
        String tags_updated_at;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (tags_updated_at = kPanelModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final String getText() {
        String text;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (text = kPanelModel2.getText()) == null) {
            return super.getText();
        }
        return text;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final void setExtra(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final void setIcon(UrlModel urlModel) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final void setId(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final void setTags_updated_at(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final void setText(String str) {
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setText(str);
        }
        super.setText(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectPanelModel
    public final void setTags(List<String> list) {
        l.c(list, "");
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setTags(list);
        }
        super.setTags(list);
    }

    public EffectPanelModel(com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel) {
        super(effectPanelModel);
        this.kPanelModel = effectPanelModel;
        com.ss.ugc.effectplatform.model.EffectPanelModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            String extra = kPanelModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kPanelModel2.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            String id = kPanelModel2.getId();
            if (id != null) {
                super.setId(id);
            }
            List<String> tags = kPanelModel2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kPanelModel2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
            String text = kPanelModel2.getText();
            if (text != null) {
                super.setText(text);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModel(com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectPanelModel);
    }
}
