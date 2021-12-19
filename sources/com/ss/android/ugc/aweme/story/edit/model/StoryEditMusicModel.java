package com.ss.android.ugc.aweme.story.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class StoryEditMusicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryEditMusicModel> CREATOR = new a();
    private final c currentMusic;
    private final boolean isMusicLoop;
    private final int musicEnd;
    private final String musicId;
    private final int musicLength;
    private final String musicOrigin;
    private final String musicPath;
    private final int musicRecType;
    private final int musicShowRank;
    private final int musicStart;

    static {
        Covode.recordClassIndex(90013);
    }

    public StoryEditMusicModel() {
        this(null, null, null, 0, 0, 0, 0, 0, false, null, 1023, null);
    }

    public static int com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ StoryEditMusicModel copy$default(StoryEditMusicModel storyEditMusicModel, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = storyEditMusicModel.musicPath;
        }
        if ((i7 & 2) != 0) {
            str2 = storyEditMusicModel.musicId;
        }
        if ((i7 & 4) != 0) {
            str3 = storyEditMusicModel.musicOrigin;
        }
        if ((i7 & 8) != 0) {
            i2 = storyEditMusicModel.musicStart;
        }
        if ((i7 & 16) != 0) {
            i3 = storyEditMusicModel.musicEnd;
        }
        if ((i7 & 32) != 0) {
            i4 = storyEditMusicModel.musicLength;
        }
        if ((i7 & 64) != 0) {
            i5 = storyEditMusicModel.musicShowRank;
        }
        if ((i7 & 128) != 0) {
            i6 = storyEditMusicModel.musicRecType;
        }
        if ((i7 & 256) != 0) {
            z = storyEditMusicModel.isMusicLoop;
        }
        if ((i7 & 512) != 0) {
            cVar = storyEditMusicModel.currentMusic;
        }
        return storyEditMusicModel.copy(str, str2, str3, i2, i3, i4, i5, i6, z, cVar);
    }

    public final String component1() {
        return this.musicPath;
    }

    public final c component10() {
        return this.currentMusic;
    }

    public final String component2() {
        return this.musicId;
    }

    public final String component3() {
        return this.musicOrigin;
    }

    public final int component4() {
        return this.musicStart;
    }

    public final int component5() {
        return this.musicEnd;
    }

    public final int component6() {
        return this.musicLength;
    }

    public final int component7() {
        return this.musicShowRank;
    }

    public final int component8() {
        return this.musicRecType;
    }

    public final boolean component9() {
        return this.isMusicLoop;
    }

    public final StoryEditMusicModel copy(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z, c cVar) {
        return new StoryEditMusicModel(str, str2, str3, i2, i3, i4, i5, i6, z, cVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditMusicModel)) {
            return false;
        }
        StoryEditMusicModel storyEditMusicModel = (StoryEditMusicModel) obj;
        return l.a(this.musicPath, storyEditMusicModel.musicPath) && l.a(this.musicId, storyEditMusicModel.musicId) && l.a(this.musicOrigin, storyEditMusicModel.musicOrigin) && this.musicStart == storyEditMusicModel.musicStart && this.musicEnd == storyEditMusicModel.musicEnd && this.musicLength == storyEditMusicModel.musicLength && this.musicShowRank == storyEditMusicModel.musicShowRank && this.musicRecType == storyEditMusicModel.musicRecType && this.isMusicLoop == storyEditMusicModel.isMusicLoop && l.a(this.currentMusic, storyEditMusicModel.currentMusic);
    }

    public final int hashCode() {
        String str = this.musicPath;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.musicId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.musicOrigin;
        int hashCode3 = (((((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicStart)) * 31) + com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicEnd)) * 31) + com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicLength)) * 31) + com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicShowRank)) * 31) + com_ss_android_ugc_aweme_story_edit_model_StoryEditMusicModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicRecType)) * 31;
        boolean z = this.isMusicLoop;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        c cVar = this.currentMusic;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "StoryEditMusicModel(musicPath=" + this.musicPath + ", musicId=" + this.musicId + ", musicOrigin=" + this.musicOrigin + ", musicStart=" + this.musicStart + ", musicEnd=" + this.musicEnd + ", musicLength=" + this.musicLength + ", musicShowRank=" + this.musicShowRank + ", musicRecType=" + this.musicRecType + ", isMusicLoop=" + this.isMusicLoop + ", currentMusic=" + this.currentMusic + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.musicPath);
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicOrigin);
        parcel.writeInt(this.musicStart);
        parcel.writeInt(this.musicEnd);
        parcel.writeInt(this.musicLength);
        parcel.writeInt(this.musicShowRank);
        parcel.writeInt(this.musicRecType);
        parcel.writeInt(this.isMusicLoop ? 1 : 0);
        parcel.writeSerializable(this.currentMusic);
    }

    public final c getCurrentMusic() {
        return this.currentMusic;
    }

    public final int getMusicEnd() {
        return this.musicEnd;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getMusicLength() {
        return this.musicLength;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getMusicRecType() {
        return this.musicRecType;
    }

    public final int getMusicShowRank() {
        return this.musicShowRank;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final boolean isMusicLoop() {
        return this.isMusicLoop;
    }

    public static class a implements Parcelable.Creator<StoryEditMusicModel> {
        static {
            Covode.recordClassIndex(90014);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditMusicModel[] newArray(int i2) {
            return new StoryEditMusicModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditMusicModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StoryEditMusicModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, (c) parcel.readSerializable());
        }
    }

    public StoryEditMusicModel(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z, c cVar) {
        this.musicPath = str;
        this.musicId = str2;
        this.musicOrigin = str3;
        this.musicStart = i2;
        this.musicEnd = i3;
        this.musicLength = i4;
        this.musicShowRank = i5;
        this.musicRecType = i6;
        this.isMusicLoop = z;
        this.currentMusic = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryEditMusicModel(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z, c cVar, int i7, g gVar) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? -1 : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6, (i7 & 256) == 0 ? z : false, (i7 & 512) == 0 ? cVar : null);
    }
}
