package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class RecordPresetResource implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordPresetResource> CREATOR = new Creator();
    private Effect effect;
    private String effectId;
    private String musicId;
    private MusicModel musicModel;

    public static class Creator implements Parcelable.Creator<RecordPresetResource> {
        static {
            Covode.recordClassIndex(84473);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new RecordPresetResource(parcel.readString(), (Effect) parcel.readParcelable(RecordPresetResource.class.getClassLoader()), parcel.readString(), (MusicModel) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordPresetResource[] newArray(int i2) {
            return new RecordPresetResource[i2];
        }
    }

    static {
        Covode.recordClassIndex(84472);
    }

    public RecordPresetResource() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RecordPresetResource copy$default(RecordPresetResource recordPresetResource, String str, Effect effect2, String str2, MusicModel musicModel2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recordPresetResource.effectId;
        }
        if ((i2 & 2) != 0) {
            effect2 = recordPresetResource.effect;
        }
        if ((i2 & 4) != 0) {
            str2 = recordPresetResource.musicId;
        }
        if ((i2 & 8) != 0) {
            musicModel2 = recordPresetResource.musicModel;
        }
        return recordPresetResource.copy(str, effect2, str2, musicModel2);
    }

    public final String component1() {
        return this.effectId;
    }

    public final Effect component2() {
        return this.effect;
    }

    public final String component3() {
        return this.musicId;
    }

    public final MusicModel component4() {
        return this.musicModel;
    }

    public final RecordPresetResource copy(String str, Effect effect2, String str2, MusicModel musicModel2) {
        return new RecordPresetResource(str, effect2, str2, musicModel2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPresetResource)) {
            return false;
        }
        RecordPresetResource recordPresetResource = (RecordPresetResource) obj;
        return l.a(this.effectId, recordPresetResource.effectId) && l.a(this.effect, recordPresetResource.effect) && l.a(this.musicId, recordPresetResource.musicId) && l.a(this.musicModel, recordPresetResource.musicModel);
    }

    public final int hashCode() {
        String str = this.effectId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Effect effect2 = this.effect;
        int hashCode2 = (hashCode + (effect2 != null ? effect2.hashCode() : 0)) * 31;
        String str2 = this.musicId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        MusicModel musicModel2 = this.musicModel;
        if (musicModel2 != null) {
            i2 = musicModel2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.effect, i2);
        parcel.writeString(this.musicId);
        parcel.writeSerializable(this.musicModel);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String toString() {
        return "effectId: " + this.effectId + ", musicId: " + this.musicId + ", effect: " + String.valueOf(this.effect) + ", musicModel: " + String.valueOf(this.musicModel);
    }

    public final void setEffect(Effect effect2) {
        this.effect = effect2;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel2) {
        this.musicModel = musicModel2;
    }

    public RecordPresetResource(String str, Effect effect2, String str2, MusicModel musicModel2) {
        this.effectId = str;
        this.effect = effect2;
        this.musicId = str2;
        this.musicModel = musicModel2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordPresetResource(String str, Effect effect2, String str2, MusicModel musicModel2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : effect2, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : musicModel2);
    }
}
