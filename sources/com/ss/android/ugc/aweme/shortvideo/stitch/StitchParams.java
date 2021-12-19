package com.ss.android.ugc.aweme.shortvideo.stitch;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class StitchParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<StitchParams> CREATOR = new a();
    @c(a = "aweme_id", b = {"i"})
    private String awemeId;
    @c(a = "chain", b = {"j"})
    private String chain;
    @c(a = "concat_audio_path", b = {"m"})
    private String concatAudioPath;
    @c(a = "concat_video_path", b = {"l"})
    private String concatVideoPath;
    @c(a = "duration", b = {"k"})
    private long duration;
    @c(a = "enable_mic", b = {"n"})
    private boolean enableMic;
    @c(a = "endTime", b = {"q"})
    private long endTime;
    @c(a = "from_user", b = {"h"})
    private User fromUser;
    @c(a = "is_muted", b = {"o"})
    private boolean isMuted;
    @c(a = "is_pgc_music", b = {"f"})
    private boolean isPGCMusic;
    @c(a = "music", b = {"c"})
    private com.ss.android.ugc.aweme.shortvideo.c music;
    @c(a = "music_id", b = {"g"})
    private String musicId;
    @c(a = "music_path", b = {"d"})
    private String musicPath;
    @c(a = "music_start", b = {"e"})
    private int musicStart;
    @c(a = "startTime", b = {"p"})
    private long startTime;
    @c(a = "video_path", b = {"b"})
    private String videoPath;
    @c(a = "video_segment", b = {"a"})
    private EditVideoSegment videoSegment;

    static {
        Covode.recordClassIndex(85716);
    }

    public StitchParams() {
        this(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 0, 0, 131071, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ StitchParams copy$default(StitchParams stitchParams, EditVideoSegment editVideoSegment, String str, com.ss.android.ugc.aweme.shortvideo.c cVar, String str2, int i2, boolean z, String str3, User user, String str4, String str5, long j2, String str6, String str7, boolean z2, boolean z3, long j3, long j4, int i3, Object obj) {
        String str8 = str3;
        boolean z4 = z;
        int i4 = i2;
        EditVideoSegment editVideoSegment2 = editVideoSegment;
        String str9 = str;
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
        String str10 = str2;
        String str11 = str6;
        String str12 = str7;
        User user2 = user;
        String str13 = str4;
        String str14 = str5;
        long j5 = j2;
        long j6 = j4;
        boolean z5 = z3;
        long j7 = j3;
        boolean z6 = z2;
        if ((i3 & 1) != 0) {
            editVideoSegment2 = stitchParams.videoSegment;
        }
        if ((i3 & 2) != 0) {
            str9 = stitchParams.videoPath;
        }
        if ((i3 & 4) != 0) {
            cVar2 = stitchParams.music;
        }
        if ((i3 & 8) != 0) {
            str10 = stitchParams.musicPath;
        }
        if ((i3 & 16) != 0) {
            i4 = stitchParams.musicStart;
        }
        if ((i3 & 32) != 0) {
            z4 = stitchParams.isPGCMusic;
        }
        if ((i3 & 64) != 0) {
            str8 = stitchParams.musicId;
        }
        if ((i3 & 128) != 0) {
            user2 = stitchParams.fromUser;
        }
        if ((i3 & 256) != 0) {
            str13 = stitchParams.awemeId;
        }
        if ((i3 & 512) != 0) {
            str14 = stitchParams.chain;
        }
        if ((i3 & 1024) != 0) {
            j5 = stitchParams.duration;
        }
        if ((i3 & 2048) != 0) {
            str11 = stitchParams.concatVideoPath;
        }
        if ((i3 & 4096) != 0) {
            str12 = stitchParams.concatAudioPath;
        }
        if ((i3 & 8192) != 0) {
            z6 = stitchParams.enableMic;
        }
        if ((i3 & 16384) != 0) {
            z5 = stitchParams.isMuted;
        }
        if ((32768 & i3) != 0) {
            j7 = stitchParams.startTime;
        }
        if ((i3 & 65536) != 0) {
            j6 = stitchParams.endTime;
        }
        return stitchParams.copy(editVideoSegment2, str9, cVar2, str10, i4, z4, str8, user2, str13, str14, j5, str11, str12, z6, z5, j7, j6);
    }

    public final EditVideoSegment component1() {
        return this.videoSegment;
    }

    public final String component10() {
        return this.chain;
    }

    public final long component11() {
        return this.duration;
    }

    public final String component12() {
        return this.concatVideoPath;
    }

    public final String component13() {
        return this.concatAudioPath;
    }

    public final boolean component14() {
        return this.enableMic;
    }

    public final boolean component15() {
        return this.isMuted;
    }

    public final long component16() {
        return this.startTime;
    }

    public final long component17() {
        return this.endTime;
    }

    public final String component2() {
        return this.videoPath;
    }

    public final com.ss.android.ugc.aweme.shortvideo.c component3() {
        return this.music;
    }

    public final String component4() {
        return this.musicPath;
    }

    public final int component5() {
        return this.musicStart;
    }

    public final boolean component6() {
        return this.isPGCMusic;
    }

    public final String component7() {
        return this.musicId;
    }

    public final User component8() {
        return this.fromUser;
    }

    public final String component9() {
        return this.awemeId;
    }

    public final StitchParams copy(EditVideoSegment editVideoSegment, String str, com.ss.android.ugc.aweme.shortvideo.c cVar, String str2, int i2, boolean z, String str3, User user, String str4, String str5, long j2, String str6, String str7, boolean z2, boolean z3, long j3, long j4) {
        return new StitchParams(editVideoSegment, str, cVar, str2, i2, z, str3, user, str4, str5, j2, str6, str7, z2, z3, j3, j4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchParams)) {
            return false;
        }
        StitchParams stitchParams = (StitchParams) obj;
        return l.a(this.videoSegment, stitchParams.videoSegment) && l.a(this.videoPath, stitchParams.videoPath) && l.a(this.music, stitchParams.music) && l.a(this.musicPath, stitchParams.musicPath) && this.musicStart == stitchParams.musicStart && this.isPGCMusic == stitchParams.isPGCMusic && l.a(this.musicId, stitchParams.musicId) && l.a(this.fromUser, stitchParams.fromUser) && l.a(this.awemeId, stitchParams.awemeId) && l.a(this.chain, stitchParams.chain) && this.duration == stitchParams.duration && l.a(this.concatVideoPath, stitchParams.concatVideoPath) && l.a(this.concatAudioPath, stitchParams.concatAudioPath) && this.enableMic == stitchParams.enableMic && this.isMuted == stitchParams.isMuted && this.startTime == stitchParams.startTime && this.endTime == stitchParams.endTime;
    }

    public final int hashCode() {
        EditVideoSegment editVideoSegment = this.videoSegment;
        int i2 = 0;
        int hashCode = (editVideoSegment != null ? editVideoSegment.hashCode() : 0) * 31;
        String str = this.videoPath;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.shortvideo.c cVar = this.music;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.musicPath;
        int hashCode4 = (((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.musicStart)) * 31;
        boolean z = this.isPGCMusic;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode4 + i4) * 31;
        String str3 = this.musicId;
        int hashCode5 = (i7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.fromUser;
        int hashCode6 = (hashCode5 + (user != null ? user.hashCode() : 0)) * 31;
        String str4 = this.awemeId;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.chain;
        int hashCode8 = (((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duration)) * 31;
        String str6 = this.concatVideoPath;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.concatAudioPath;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i8 = (hashCode9 + i2) * 31;
        boolean z2 = this.enableMic;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        if (!this.isMuted) {
            i3 = 0;
        }
        return ((((i12 + i3) * 31) + com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime);
    }

    public final String toString() {
        return "StitchParams(videoSegment=" + this.videoSegment + ", videoPath=" + this.videoPath + ", music=" + this.music + ", musicPath=" + this.musicPath + ", musicStart=" + this.musicStart + ", isPGCMusic=" + this.isPGCMusic + ", musicId=" + this.musicId + ", fromUser=" + this.fromUser + ", awemeId=" + this.awemeId + ", chain=" + this.chain + ", duration=" + this.duration + ", concatVideoPath=" + this.concatVideoPath + ", concatAudioPath=" + this.concatAudioPath + ", enableMic=" + this.enableMic + ", isMuted=" + this.isMuted + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.videoSegment, i2);
        parcel.writeString(this.videoPath);
        parcel.writeSerializable(this.music);
        parcel.writeString(this.musicPath);
        parcel.writeInt(this.musicStart);
        parcel.writeInt(this.isPGCMusic ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeSerializable(this.fromUser);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.chain);
        parcel.writeLong(this.duration);
        parcel.writeString(this.concatVideoPath);
        parcel.writeString(this.concatAudioPath);
        parcel.writeInt(this.enableMic ? 1 : 0);
        parcel.writeInt(this.isMuted ? 1 : 0);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getChain() {
        return this.chain;
    }

    public final String getConcatAudioPath() {
        return this.concatAudioPath;
    }

    public final String getConcatVideoPath() {
        return this.concatVideoPath;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableMic() {
        return this.enableMic;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final com.ss.android.ugc.aweme.shortvideo.c getMusic() {
        return this.music;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final EditVideoSegment getVideoSegment() {
        return this.videoSegment;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPGCMusic() {
        return this.isPGCMusic;
    }

    public static class a implements Parcelable.Creator<StitchParams> {
        static {
            Covode.recordClassIndex(85717);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StitchParams[] newArray(int i2) {
            return new StitchParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StitchParams createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StitchParams((EditVideoSegment) parcel.readParcelable(StitchParams.class.getClassLoader()), parcel.readString(), (com.ss.android.ugc.aweme.shortvideo.c) parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), (User) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
        }
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setChain(String str) {
        this.chain = str;
    }

    public final void setConcatAudioPath(String str) {
        this.concatAudioPath = str;
    }

    public final void setConcatVideoPath(String str) {
        this.concatVideoPath = str;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setEnableMic(boolean z) {
        this.enableMic = z;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setFromUser(User user) {
        this.fromUser = user;
    }

    public final void setMusic(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        this.music = cVar;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicStart(int i2) {
        this.musicStart = i2;
    }

    public final void setMuted(boolean z) {
        this.isMuted = z;
    }

    public final void setPGCMusic(boolean z) {
        this.isPGCMusic = z;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setVideoSegment(EditVideoSegment editVideoSegment) {
        this.videoSegment = editVideoSegment;
    }

    public StitchParams(EditVideoSegment editVideoSegment, String str, com.ss.android.ugc.aweme.shortvideo.c cVar, String str2, int i2, boolean z, String str3, User user, String str4, String str5, long j2, String str6, String str7, boolean z2, boolean z3, long j3, long j4) {
        this.videoSegment = editVideoSegment;
        this.videoPath = str;
        this.music = cVar;
        this.musicPath = str2;
        this.musicStart = i2;
        this.isPGCMusic = z;
        this.musicId = str3;
        this.fromUser = user;
        this.awemeId = str4;
        this.chain = str5;
        this.duration = j2;
        this.concatVideoPath = str6;
        this.concatAudioPath = str7;
        this.enableMic = z2;
        this.isMuted = z3;
        this.startTime = j3;
        this.endTime = j4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StitchParams(EditVideoSegment editVideoSegment, String str, com.ss.android.ugc.aweme.shortvideo.c cVar, String str2, int i2, boolean z, String str3, User user, String str4, String str5, long j2, String str6, String str7, boolean z2, boolean z3, long j3, long j4, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : editVideoSegment, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : cVar, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : user, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? 0 : j2, (i3 & 2048) != 0 ? null : str6, (i3 & 4096) != 0 ? null : str7, (i3 & 8192) != 0 ? true : z2, (i3 & 16384) != 0 ? false : z3, (32768 & i3) != 0 ? 0 : j3, (i3 & 65536) != 0 ? 0 : j4);
    }
}
