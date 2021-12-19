package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.f.b.l;
import java.util.List;

public final class InfoStickerEffect {
    private Effect loki_effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
    private Integer source;
    private ProviderEffect sticker = new ProviderEffect(null, null, null, null, null, null, null, null, 255, null);

    static {
        Covode.recordClassIndex(102503);
    }

    public final Integer getSource() {
        return this.source;
    }

    public final List<String> getBindIds() {
        return getLoki_effect().getBind_ids();
    }

    public final List<String> getChallenge() {
        return getLoki_effect().getChallenge();
    }

    public final List<Effect> getChildEffects() {
        return getLoki_effect().getChild_effects();
    }

    public final List<String> getChildren() {
        return getLoki_effect().getChildren();
    }

    public final String getClickUrl() {
        return getSticker().getClick_url();
    }

    public final String getComposerParams() {
        return getLoki_effect().getComposer_params();
    }

    public final List<String> getComposerPath() {
        return getLoki_effect().getComposerPath();
    }

    public final String getDesignerEncryptedId() {
        return getLoki_effect().getDesigner_encrypted_id();
    }

    public final String getDesignerId() {
        return getLoki_effect().getDesigner_id();
    }

    public final String getDevicePlatform() {
        return getLoki_effect().getDevice_platform();
    }

    public final String getEffectId() {
        return getLoki_effect().getEffect_id();
    }

    public final Integer getEffectType() {
        return Integer.valueOf(getLoki_effect().getEffect_type());
    }

    public final String getExtra() {
        return getLoki_effect().getExtra();
    }

    public final UrlModel getFileUrl() {
        return getLoki_effect().getFile_url();
    }

    public final String getGradeKey() {
        return getLoki_effect().getGrade_key();
    }

    public final String getHint() {
        return getLoki_effect().getHint();
    }

    public final UrlModel getHintFile() {
        return getLoki_effect().getHint_file();
    }

    public final Integer getHintFileFormat() {
        return Integer.valueOf(getLoki_effect().getHint_file_format());
    }

    public final UrlModel getHintIcon() {
        return getLoki_effect().getHint_icon();
    }

    public final UrlModel getIconUrl() {
        return getLoki_effect().getIcon_url();
    }

    public final String getIopId() {
        return getLoki_effect().getIop_id();
    }

    public final Integer getLokiEffectSource() {
        return Integer.valueOf(getLoki_effect().getSource());
    }

    public final String getModelNames() {
        return getLoki_effect().getModel_names();
    }

    public final String getModelNamesSec() {
        return getLoki_effect().getModel_names_sec();
    }

    public final List<String> getMusic() {
        return getLoki_effect().getMusic();
    }

    public final String getName() {
        return getLoki_effect().getName();
    }

    public final String getPanel() {
        return getLoki_effect().getPanel();
    }

    public final String getParent() {
        return getLoki_effect().getParent();
    }

    public final String getPath() {
        return getSticker().getPath();
    }

    public final Long getPtime() {
        return Long.valueOf(getLoki_effect().getPtime());
    }

    public final String getRecId() {
        return getLoki_effect().getRecId();
    }

    public final List<String> getRequirements() {
        return getLoki_effect().getRequirements();
    }

    public final List<String> getRequirementsSec() {
        return getLoki_effect().getRequirements_sec();
    }

    public final String getResourceId() {
        return getLoki_effect().getResource_id();
    }

    public final String getSchema() {
        return getLoki_effect().getSchema();
    }

    public final String getSdkExtra() {
        return getLoki_effect().getSdk_extra();
    }

    public final ProviderEffect.StickerBean getStickerInfo() {
        return getSticker().getSticker_info();
    }

    public final List<String> getTags() {
        return getLoki_effect().getTags();
    }

    public final String getTagsUpdatedAt() {
        return getLoki_effect().getTags_updated_at();
    }

    public final ProviderEffect.StickerBean getThumbnailSticker() {
        return getSticker().getThumbnail_sticker();
    }

    public final String getTitle() {
        return getSticker().getTitle();
    }

    public final List<String> getTypes() {
        return getLoki_effect().getTypes();
    }

    public final List<String> getTypesSec() {
        return getLoki_effect().getTypes_sec();
    }

    public final String getUnzipPath() {
        return getLoki_effect().getUnzipPath();
    }

    public final String getZipPath() {
        return getLoki_effect().getZipPath();
    }

    public final Boolean isBusi() {
        return Boolean.valueOf(getLoki_effect().is_busi());
    }

    public final Boolean isDownloaded() {
        return Boolean.valueOf(getLoki_effect().isDownloaded());
    }

    public final Boolean isIop() {
        return Boolean.valueOf(getLoki_effect().is_iop());
    }

    public final ProviderEffect getSticker() {
        ProviderEffect providerEffect = this.sticker;
        if (providerEffect == null) {
            return new ProviderEffect(null, null, null, null, null, null, null, null, 255, null);
        }
        return providerEffect;
    }

    public final String getId() {
        Integer num = this.source;
        if (num == null) {
            return "";
        }
        if (num.intValue() == 1) {
            return getLoki_effect().getId();
        }
        if (num.intValue() == 2) {
            return getSticker().getId();
        }
        return "";
    }

    public final Effect getLoki_effect() {
        Effect effect = this.loki_effect;
        if (effect == null) {
            return new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
        }
        return effect;
    }

    public final void setSource(Integer num) {
        this.source = num;
    }

    public final void setLoki_effect(Effect effect) {
        l.c(effect, "");
        this.loki_effect = effect;
    }

    public final void setSticker(ProviderEffect providerEffect) {
        l.c(providerEffect, "");
        this.sticker = providerEffect;
    }
}
