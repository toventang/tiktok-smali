package com.ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.tools.utils.d;
import java.util.ArrayList;
import java.util.List;

public class FaceStickerBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerBean> CREATOR = new Parcelable.Creator<FaceStickerBean>() {
        /* class com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88243);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceStickerBean[] newArray(int i2) {
            return new FaceStickerBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceStickerBean createFromParcel(Parcel parcel) {
            return new FaceStickerBean(parcel);
        }
    };
    public static final FaceStickerBean NONE = new FaceStickerBean();
    public static String sCurPropSource;
    public static String sCurPropSourceKey;
    @c(a = "ad_raw_data")
    private String adRawData;
    @c(a = "children")
    List<String> children;
    @c(a = "designer_id")
    private String designerId;
    @c(a = "effect_type")
    int effectType;
    @c(a = "extra")
    private String extra;
    FaceStickerCommerceBean faceStickerCommerceBean;
    @c(a = "file_url")
    UrlModel fileUrl;
    @c(a = "force_bind_music_path")
    private String forceBindMusicPath;
    @c(a = "grade_key")
    private String gradeKey;
    @c(a = "hint")
    String hint;
    @c(a = "hint_icon")
    UrlModel hintIcon;
    @c(a = "icon_url")
    UrlModel iconUrl;
    @c(a = "id")
    String id;
    @c(a = "is_busi")
    private boolean isBusi;
    @c(a = "is_force_bind_music")
    private boolean isForceBind;
    public boolean isSelected;
    public String mLocalPath;
    @c(a = "mention_user")
    private String mentionUserInfo;
    List<String> musicIds;
    @c(a = StringSet.name)
    String name;
    @c(a = "parent")
    String parentId;
    String propSource;
    @c(a = "rec_id")
    String recId;
    @c(a = "requirements")
    private List<String> requirements;
    @c(a = "schema")
    private String schema;
    @c(a = "sdk_extra")
    private String sdkExtra;
    @c(a = "source")
    private int source;
    @c(a = "sticker_id")
    long stickerId;
    List<String> tags;
    @c(a = StringSet.type)
    long type;
    List<String> types;
    @c(a = "usage_scenario")
    int usageScenario;

    public int describeContents() {
        return 0;
    }

    public String getAdRawData() {
        return this.adRawData;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public String getExtra() {
        return this.extra;
    }

    public FaceStickerCommerceBean getFaceStickerCommerceBean() {
        return this.faceStickerCommerceBean;
    }

    public UrlModel getFileUrl() {
        return this.fileUrl;
    }

    public String getForceBindMusicPath() {
        return this.forceBindMusicPath;
    }

    public String getGradeKey() {
        return this.gradeKey;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hintIcon;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public String getMentionUserInfo() {
        return this.mentionUserInfo;
    }

    public List<String> getMusicIds() {
        return this.musicIds;
    }

    public String getName() {
        return this.name;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getRecId() {
        return this.recId;
    }

    public List<String> getRequirements() {
        return this.requirements;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdkExtra;
    }

    public int getSource() {
        return this.source;
    }

    public long getStickerId() {
        return this.stickerId;
    }

    public long getType() {
        return this.type;
    }

    public boolean isBusi() {
        return this.isBusi;
    }

    public boolean isForceBind() {
        return this.isForceBind;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public String getPropSource() {
        String str = this.propSource;
        if (str == null) {
            return "";
        }
        return str;
    }

    public FaceStickerBean() {
        this.requirements = new ArrayList();
        this.isSelected = false;
    }

    public int hashCode() {
        long j2 = this.stickerId;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public boolean suportLive() {
        int i2 = this.usageScenario;
        if (i2 == 0 || i2 == 2) {
            return true;
        }
        return false;
    }

    public boolean supportVideo() {
        int i2 = this.usageScenario;
        if (i2 == 0 || i2 == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(88242);
    }

    public List<String> getTags() {
        if (d.a(this.tags)) {
            return new ArrayList();
        }
        return this.tags;
    }

    public List<String> getTypes() {
        if (d.a(this.types)) {
            return new ArrayList();
        }
        return this.types;
    }

    public void setAdRawData(String str) {
        this.adRawData = str;
    }

    public void setBusi(boolean z) {
        this.isBusi = z;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setDesignerId(String str) {
        this.designerId = str;
    }

    public void setEffectType(int i2) {
        this.effectType = i2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFaceStickerCommerceBean(FaceStickerCommerceBean faceStickerCommerceBean2) {
        this.faceStickerCommerceBean = faceStickerCommerceBean2;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.fileUrl = urlModel;
    }

    public void setForceBind(boolean z) {
        this.isForceBind = z;
    }

    public void setForceBindMusicPath(String str) {
        this.forceBindMusicPath = str;
    }

    public void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hintIcon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public void setMentionUserInfo(String str) {
        this.mentionUserInfo = str;
    }

    public void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setPropSource(String str) {
        this.propSource = str;
    }

    public void setRecId(String str) {
        this.recId = str;
    }

    public void setRequirements(List<String> list) {
        this.requirements = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdkExtra = str;
    }

    public void setSource(int i2) {
        this.source = i2;
    }

    public void setStickerId(long j2) {
        this.stickerId = j2;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setType(long j2) {
        this.type = j2;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FaceStickerBean) && this.stickerId == ((FaceStickerBean) obj).stickerId) {
            return true;
        }
        return false;
    }

    protected FaceStickerBean(Parcel parcel) {
        boolean z;
        this.requirements = new ArrayList();
        boolean z2 = false;
        this.isSelected = false;
        this.id = parcel.readString();
        this.stickerId = parcel.readLong();
        this.name = parcel.readString();
        this.iconUrl = (UrlModel) parcel.readSerializable();
        this.fileUrl = (UrlModel) parcel.readSerializable();
        this.hint = parcel.readString();
        this.hintIcon = (UrlModel) parcel.readSerializable();
        this.type = parcel.readLong();
        this.usageScenario = parcel.readInt();
        this.types = parcel.createStringArrayList();
        this.mLocalPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSelected = z;
        this.tags = parcel.createStringArrayList();
        this.effectType = parcel.readInt();
        this.schema = parcel.readString();
        this.source = parcel.readInt();
        this.designerId = parcel.readString();
        this.extra = parcel.readString();
        this.sdkExtra = parcel.readString();
        this.musicIds = parcel.createStringArrayList();
        this.adRawData = parcel.readString();
        this.forceBindMusicPath = parcel.readString();
        this.isForceBind = parcel.readByte() != 0 ? true : z2;
        this.gradeKey = parcel.readString();
        this.recId = parcel.readString();
        this.requirements = parcel.createStringArrayList();
        this.mentionUserInfo = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.id);
        parcel.writeLong(this.stickerId);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.iconUrl);
        parcel.writeSerializable(this.fileUrl);
        parcel.writeString(this.hint);
        parcel.writeSerializable(this.hintIcon);
        parcel.writeLong(this.type);
        parcel.writeInt(this.usageScenario);
        parcel.writeStringList(this.types);
        parcel.writeString(this.mLocalPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : 0);
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.effectType);
        parcel.writeString(this.schema);
        parcel.writeInt(this.source);
        parcel.writeString(this.designerId);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkExtra);
        parcel.writeStringList(this.musicIds);
        parcel.writeString(this.adRawData);
        parcel.writeString(this.forceBindMusicPath);
        parcel.writeByte(this.isForceBind ? (byte) 1 : 0);
        parcel.writeString(this.gradeKey);
        parcel.writeString(this.recId);
        parcel.writeStringList(this.requirements);
        parcel.writeString(this.mentionUserInfo);
    }
}
