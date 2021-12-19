package com.ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class EffectPointModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<EffectPointModel> CREATOR = new Parcelable.Creator<EffectPointModel>() {
        /* class com.ss.android.ugc.aweme.effect.EffectPointModel.AnonymousClass1 */

        static {
            Covode.recordClassIndex(55834);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EffectPointModel[] newArray(int i2) {
            return new EffectPointModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EffectPointModel createFromParcel(Parcel parcel) {
            return new EffectPointModel(parcel);
        }
    };
    private String adjustParams;
    private String category;
    private int duration;
    private int endPoint;
    private String extra;
    private int index;
    private boolean isFromEnd;
    private Boolean isNewEngineEffect;
    private String key;
    private String name;
    private int originalEndTime;
    private int originalStartTime;
    private String resDir;
    private int selectedColor;
    private int startPoint;
    private int type;
    private int uiEndPoint;
    private int uiStartPoint;
    private String uuid;

    public int describeContents() {
        return 0;
    }

    public String getAdjustParams() {
        return this.adjustParams;
    }

    public String getCategory() {
        return this.category;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getIndex() {
        return this.index;
    }

    public Boolean getIsNewEngineEffect() {
        return this.isNewEngineEffect;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public int getOriginalEndTime() {
        return this.originalEndTime;
    }

    public int getOriginalStartTime() {
        return this.originalStartTime;
    }

    public String getResDir() {
        return this.resDir;
    }

    public int getSelectedColor() {
        return this.selectedColor;
    }

    public int getStartPoint() {
        return this.startPoint;
    }

    public int getType() {
        return this.type;
    }

    public int getUiEndPoint() {
        return this.uiEndPoint;
    }

    public int getUiStartPoint() {
        return this.uiStartPoint;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isFromEnd() {
        return this.isFromEnd;
    }

    static {
        Covode.recordClassIndex(55833);
    }

    @Override // java.lang.Object
    public EffectPointModel clone() {
        try {
            return (EffectPointModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public EffectPointModel() {
        this.key = "0";
        this.category = "filter";
        this.isNewEngineEffect = false;
    }

    public String toString() {
        return "EffectPointModel{index=" + this.index + ", startPoint=" + this.startPoint + ", endPoint=" + this.endPoint + ", uiStartPoint=" + this.uiStartPoint + ", uiEndPoint=" + this.uiEndPoint + ", selectedColor=" + this.selectedColor + ", key='" + this.key + '\'' + ", type=" + this.type + ", isFromEnd=" + this.isFromEnd + ", resDir='" + this.resDir + '\'' + ", name='" + this.name + '\'' + ", duration=" + this.duration + ", category='" + this.category + '\'' + ", extra='" + this.extra + '\'' + '}';
    }

    public void setAdjustParams(String str) {
        this.adjustParams = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDuration(int i2) {
        this.duration = i2;
    }

    public void setEndPoint(int i2) {
        this.endPoint = i2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFromEnd(boolean z) {
        this.isFromEnd = z;
    }

    public EffectPointModel setIndex(int i2) {
        this.index = i2;
        return this;
    }

    public void setIsNewEngineEffect(Boolean bool) {
        this.isNewEngineEffect = bool;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriginalEndTime(int i2) {
        this.originalEndTime = i2;
    }

    public void setOriginalStartTime(int i2) {
        this.originalStartTime = i2;
    }

    public void setResDir(String str) {
        this.resDir = str;
    }

    public void setSelectedColor(int i2) {
        this.selectedColor = i2;
    }

    public void setStartPoint(int i2) {
        this.startPoint = i2;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUiEndPoint(int i2) {
        this.uiEndPoint = i2;
    }

    public void setUiStartPoint(int i2) {
        this.uiStartPoint = i2;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    protected EffectPointModel(Parcel parcel) {
        boolean z;
        this.key = "0";
        this.category = "filter";
        boolean z2 = false;
        this.isNewEngineEffect = false;
        this.startPoint = parcel.readInt();
        this.endPoint = parcel.readInt();
        this.uiStartPoint = parcel.readInt();
        this.uiEndPoint = parcel.readInt();
        this.selectedColor = parcel.readInt();
        this.key = parcel.readString();
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromEnd = z;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        this.category = parcel.readString();
        this.duration = parcel.readInt();
        this.extra = parcel.readString();
        this.adjustParams = parcel.readString();
        this.isNewEngineEffect = Boolean.valueOf(parcel.readByte() != 0 ? true : z2);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.startPoint);
        parcel.writeInt(this.endPoint);
        parcel.writeInt(this.uiStartPoint);
        parcel.writeInt(this.uiEndPoint);
        parcel.writeInt(this.selectedColor);
        parcel.writeString(this.key);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isFromEnd ? (byte) 1 : 0);
        parcel.writeString(this.resDir);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeInt(this.duration);
        parcel.writeString(this.extra);
        parcel.writeString(this.adjustParams);
        parcel.writeByte(this.isNewEngineEffect.booleanValue() ? (byte) 1 : 0);
    }
}
