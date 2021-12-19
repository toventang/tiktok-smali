package com.ss.android.ugc.effectmanager.effect.model.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EffectTemplate extends Effect implements Parcelable, Serializable {
    public static final CREATOR CREATOR = new CREATOR(null);
    private String adRawData;
    private List<String> bindIds;
    private List<? extends EffectTemplate> childEffects_Own;
    private String composerParams;
    private String designerEncryptedId;
    private String designerId;
    private String devicePlatform;
    private String effectId;
    private int effectType;
    private UrlModel fileUrl;
    private String gradeKey;
    private UrlModel hintFile;
    private int hintFileFormat;
    private UrlModel hintIcon;
    private UrlModel iconUrl;
    private String iopId;
    private boolean isBusiness;
    private boolean isIsIop;
    private final transient Effect kEffect;
    private String modelNames;
    private String parentId;
    private long publishTime;
    private String resourceId;
    private String sdkExtra;
    private String tagsUpdatedAt;

    static {
        Covode.recordClassIndex(95449);
    }

    public EffectTemplate() {
        this(null, 1, null);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int describeContents() {
        return 0;
    }

    public static final class CREATOR implements Parcelable.Creator<EffectTemplate> {
        static {
            Covode.recordClassIndex(95450);
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        public final EffectTemplate[] newArray(int i2) {
            return new EffectTemplate[i2];
        }

        public /* synthetic */ CREATOR(g gVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final EffectTemplate createFromParcel(Parcel parcel) {
            Object obj;
            l.c(parcel, "");
            Effect effect = null;
            try {
                Object obj2 = Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof Effect)) {
                    obj = null;
                }
                effect = (Effect) obj;
            } catch (Exception unused) {
            }
            return new EffectTemplate(effect);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate>, java.util.List<com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate> */
    public final List<EffectTemplate> getChildEffects_Own() {
        return this.childEffects_Own;
    }

    public Effect getKEffect() {
        return this.kEffect;
    }

    public int getEffectType() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getEffect_type();
        }
        return super.getEffect_type();
    }

    public int getHintFileFormat() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getHint_file_format();
        }
        return super.getHint_file_format();
    }

    public long getPublishTime() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.getPtime();
        }
        return super.getPtime();
    }

    public boolean isBusiness() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_busi();
        }
        return super.is_busi();
    }

    public boolean isIsIop() {
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            return kEffect2.is_iop();
        }
        return super.is_iop();
    }

    public String getAdRawData() {
        String ad_raw_data;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (ad_raw_data = kEffect2.getAd_raw_data()) == null) {
            return super.getAd_raw_data();
        }
        return ad_raw_data;
    }

    public List<String> getBindIds() {
        List<String> bind_ids;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (bind_ids = kEffect2.getBind_ids()) == null) {
            return super.getBind_ids();
        }
        return bind_ids;
    }

    public String getComposerParams() {
        String composer_params;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (composer_params = kEffect2.getComposer_params()) == null) {
            return super.getComposer_params();
        }
        return composer_params;
    }

    public String getDesignerEncryptedId() {
        String designer_encrypted_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_encrypted_id = kEffect2.getDesigner_encrypted_id()) == null) {
            return super.getDesigner_encrypted_id();
        }
        return designer_encrypted_id;
    }

    public String getDesignerId() {
        String designer_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (designer_id = kEffect2.getDesigner_id()) == null) {
            return super.getDesigner_id();
        }
        return designer_id;
    }

    public String getDevicePlatform() {
        String device_platform;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (device_platform = kEffect2.getDevice_platform()) == null) {
            return super.getDevice_platform();
        }
        return device_platform;
    }

    public String getEffectId() {
        String effect_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (effect_id = kEffect2.getEffect_id()) == null) {
            return super.getEffect_id();
        }
        return effect_id;
    }

    public String getGradeKey() {
        String grade_key;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (grade_key = kEffect2.getGrade_key()) == null) {
            return super.getGrade_key();
        }
        return grade_key;
    }

    public String getIopId() {
        String iop_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (iop_id = kEffect2.getIop_id()) == null) {
            return super.getIop_id();
        }
        return iop_id;
    }

    public String getModelNames() {
        String model_names;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (model_names = kEffect2.getModel_names()) == null) {
            return super.getModel_names();
        }
        return model_names;
    }

    public String getParentId() {
        String parent;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (parent = kEffect2.getParent()) == null) {
            return super.getParent();
        }
        return parent;
    }

    public String getResourceId() {
        String resource_id;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (resource_id = kEffect2.getResource_id()) == null) {
            return super.getResource_id();
        }
        return resource_id;
    }

    public String getSdkExtra() {
        String sdk_extra;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (sdk_extra = kEffect2.getSdk_extra()) == null) {
            return super.getSdk_extra();
        }
        return sdk_extra;
    }

    public String getTagsUpdatedAt() {
        String tags_updated_at;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (tags_updated_at = kEffect2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    public UrlModel getFileUrl() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getFile_url()) == null) {
            urlModel = super.getFile_url();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setFile_url(urlModel2);
        }
        super.setFile_url(urlModel2);
        return urlModel2;
    }

    public UrlModel getHintFile() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getHint_file()) == null) {
            urlModel = super.getHint_file();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setHint_file(urlModel2);
        }
        super.setHint_file(urlModel2);
        return urlModel2;
    }

    public UrlModel getHintIcon() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getHint_icon()) == null) {
            urlModel = super.getHint_icon();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setHint_icon(urlModel2);
        }
        super.setHint_icon(urlModel2);
        return urlModel2;
    }

    public UrlModel getIconUrl() {
        com.ss.ugc.effectplatform.model.UrlModel urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 == null || (urlModel = kEffect2.getIcon_url()) == null) {
            urlModel = super.getIcon_url();
        }
        if (urlModel instanceof UrlModel) {
            return (UrlModel) urlModel;
        }
        UrlModel urlModel2 = new UrlModel(urlModel);
        Effect kEffect3 = getKEffect();
        if (kEffect3 != null) {
            kEffect3.setIcon_url(urlModel2);
        }
        super.setIcon_url(urlModel2);
        return urlModel2;
    }

    public final void setChildEffects_Own(List<? extends EffectTemplate> list) {
        l.c(list, "");
        this.childEffects_Own = list;
    }

    public void setAdRawData(String str) {
        l.c(str, "");
        this.adRawData = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setAd_raw_data(str);
                return;
            }
            return;
        }
        super.setAd_raw_data(str);
    }

    public void setBindIds(List<String> list) {
        this.bindIds = list;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setBind_ids(list);
                return;
            }
            return;
        }
        super.setBind_ids(list);
    }

    public void setBusiness(boolean z) {
        this.isBusiness = z;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.set_busi(z);
                return;
            }
            return;
        }
        super.set_busi(z);
    }

    public void setComposerParams(String str) {
        l.c(str, "");
        this.composerParams = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setComposer_params(str);
                return;
            }
            return;
        }
        super.setComposer_params(str);
    }

    public void setDesignerEncryptedId(String str) {
        l.c(str, "");
        this.designerEncryptedId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setDesigner_encrypted_id(str);
                return;
            }
            return;
        }
        super.setDesigner_encrypted_id(str);
    }

    public void setDesignerId(String str) {
        l.c(str, "");
        this.designerId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setDesigner_id(str);
                return;
            }
            return;
        }
        super.setDesigner_id(str);
    }

    public void setDevicePlatform(String str) {
        l.c(str, "");
        this.devicePlatform = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setDevice_platform(str);
                return;
            }
            return;
        }
        super.setDevice_platform(str);
    }

    public void setEffectId(String str) {
        l.c(str, "");
        this.effectId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setEffect_id(str);
                return;
            }
            return;
        }
        super.setEffect_id(str);
    }

    public void setEffectType(int i2) {
        this.effectType = i2;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setEffect_type(i2);
                return;
            }
            return;
        }
        super.setEffect_type(i2);
    }

    public void setFileUrl(UrlModel urlModel) {
        l.c(urlModel, "");
        this.fileUrl = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setFile_url(urlModel);
        }
        super.setFile_url(urlModel);
    }

    public void setGradeKey(String str) {
        l.c(str, "");
        this.gradeKey = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setGrade_key(str);
                return;
            }
            return;
        }
        super.setGrade_key(str);
    }

    public void setHintFile(UrlModel urlModel) {
        l.c(urlModel, "");
        this.hintFile = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_file(urlModel);
        }
        super.setHint_file(urlModel);
    }

    public void setHintFileFormat(int i2) {
        this.hintFileFormat = i2;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setHint_file_format(i2);
                return;
            }
            return;
        }
        super.setHint_file_format(i2);
    }

    public void setHintIcon(UrlModel urlModel) {
        l.c(urlModel, "");
        this.hintIcon = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setHint_icon(urlModel);
        }
        super.setHint_icon(urlModel);
    }

    public void setIconUrl(UrlModel urlModel) {
        l.c(urlModel, "");
        this.iconUrl = urlModel;
        Effect kEffect2 = getKEffect();
        if (kEffect2 != null) {
            kEffect2.setIcon_url(urlModel);
        }
        super.setIcon_url(urlModel);
    }

    public void setIopId(String str) {
        l.c(str, "");
        this.iopId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setIop_id(str);
                return;
            }
            return;
        }
        super.setIop_id(str);
    }

    public void setIsIop(boolean z) {
        this.isIsIop = z;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.set_iop(z);
                return;
            }
            return;
        }
        super.set_iop(z);
    }

    public void setModelNames(String str) {
        this.modelNames = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setModel_names(str);
                return;
            }
            return;
        }
        super.setModel_names(str);
    }

    public void setParentId(String str) {
        this.parentId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setParent(str);
                return;
            }
            return;
        }
        super.setParent(str);
    }

    public void setPublishTime(long j2) {
        this.publishTime = j2;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setPtime(j2);
                return;
            }
            return;
        }
        super.setPtime(j2);
    }

    public void setResourceId(String str) {
        l.c(str, "");
        this.resourceId = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setResource_id(str);
                return;
            }
            return;
        }
        super.setResource_id(str);
    }

    public void setSdkExtra(String str) {
        l.c(str, "");
        this.sdkExtra = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setSdk_extra(str);
                return;
            }
            return;
        }
        super.setSdk_extra(str);
    }

    public void setTagsUpdatedAt(String str) {
        l.c(str, "");
        this.tagsUpdatedAt = str;
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.setTags_updated_at(str);
                return;
            }
            return;
        }
        super.setTags_updated_at(str);
    }

    public EffectTemplate(Effect effect) {
        super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
        this.kEffect = effect;
        this.effectId = "";
        this.fileUrl = new UrlModel(null, 1, null);
        this.iconUrl = new UrlModel(null, 1, null);
        this.hintIcon = new UrlModel(null, 1, null);
        this.hintFile = new UrlModel(null, 1, null);
        this.tagsUpdatedAt = "";
        this.childEffects_Own = new ArrayList();
        this.designerId = "";
        this.designerEncryptedId = "";
        this.sdkExtra = "";
        this.adRawData = "";
        this.iopId = "";
        this.resourceId = "";
        this.gradeKey = "";
        this.devicePlatform = "";
        this.composerParams = "";
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public void writeToParcel(Parcel parcel, int i2) {
        l.c(parcel, "");
        if (getKEffect() != null) {
            Effect kEffect2 = getKEffect();
            if (kEffect2 != null) {
                kEffect2.writeToParcel(parcel, i2);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectTemplate(Effect effect, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effect);
    }
}
