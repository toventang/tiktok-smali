package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import com.google.gson.a.c;
import java.util.HashMap;
import java.util.Map;

public final class XAudioSrc implements f {
    @c(a = "album_title")
    private final String mAlbumName;
    @c(a = "artist")
    private final String mArtistName;
    @c(a = "can_background_play")
    private final Boolean mCanBackgroundPlay;
    @c(a = "artwork_url")
    private final String mCoverUrl;
    @c(a = "playback_duration")
    private final Long mDuration;
    @c(a = "event_data")
    private final Map<String, String> mEventData;
    @c(a = "local_path")
    private final String mLocalPath;
    @c(a = "play_model")
    private final PlayModel mPlayModel;
    @c(a = "play_url")
    private final String mPlayUrl;
    @c(a = "id")
    private final String mSongId;
    @c(a = "title")
    private final String mSongName;

    static {
        Covode.recordClassIndex(22252);
    }

    public XAudioSrc() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String getMAlbumName() {
        return this.mAlbumName;
    }

    public final String getMArtistName() {
        return this.mArtistName;
    }

    public final Boolean getMCanBackgroundPlay() {
        return this.mCanBackgroundPlay;
    }

    public final String getMCoverUrl() {
        return this.mCoverUrl;
    }

    public final Long getMDuration() {
        return this.mDuration;
    }

    public final Map<String, String> getMEventData() {
        return this.mEventData;
    }

    public final String getMLocalPath() {
        return this.mLocalPath;
    }

    public final PlayModel getMPlayModel() {
        return this.mPlayModel;
    }

    public final String getMPlayUrl() {
        return this.mPlayUrl;
    }

    public final String getMSongId() {
        return this.mSongId;
    }

    public final String getMSongName() {
        return this.mSongName;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getAlbumName() {
        String str = this.mAlbumName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getArtistName() {
        String str = this.mArtistName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getCoverUrl() {
        String str = this.mCoverUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getId() {
        String str = this.mSongId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getLocalPath() {
        String str = this.mLocalPath;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getPlayUrl() {
        String str = this.mPlayUrl;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final String getSongName() {
        String str = this.mSongName;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final long getDuration() {
        Long l2 = this.mDuration;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0;
    }

    public final Map<String, String> getExtras() {
        Map<String, String> map = this.mEventData;
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.f
    public final PlayModel getPlayModel() {
        PlayModel playModel = this.mPlayModel;
        if (playModel == null) {
            return new PlayModel(null, null, null, 7, null);
        }
        return playModel;
    }

    public final String toString() {
        return "XAudioDataSource(mSongId=" + this.mSongId + ", mSongName=" + this.mSongName + ", mCoverUrl=" + this.mCoverUrl + ", mArtistName=" + this.mArtistName + ", mPlayUrl=" + this.mPlayUrl + ", mCoverUrl=" + this.mCoverUrl + ", mAlbumName=" + this.mAlbumName + ", mDuration=" + this.mDuration + ", mCanBackgroundPlay=" + this.mCanBackgroundPlay + ", mEventData=" + this.mEventData + ")";
    }

    public XAudioSrc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, Boolean bool, Map<String, String> map, PlayModel playModel) {
        this.mSongId = str;
        this.mSongName = str2;
        this.mCoverUrl = str3;
        this.mArtistName = str4;
        this.mPlayUrl = str5;
        this.mLocalPath = str6;
        this.mAlbumName = str7;
        this.mDuration = l2;
        this.mCanBackgroundPlay = bool;
        this.mEventData = map;
        this.mPlayModel = playModel;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ XAudioSrc(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.Boolean r23, java.util.Map r24, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel r25, int r26, h.f.b.g r27) {
        /*
            r14 = this;
            r11 = r23
            r12 = r24
            r8 = r20
            r7 = r19
            r3 = r15
            r4 = r16
            r10 = r22
            r5 = r17
            r2 = r26
            r6 = r18
            r0 = r2 & 1
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x001a
            r3 = r9
        L_0x001a:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x001f
            r4 = r9
        L_0x001f:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x0024
            r5 = r9
        L_0x0024:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0029
            r6 = r9
        L_0x0029:
            r0 = r2 & 16
            if (r0 == 0) goto L_0x002e
            r7 = r9
        L_0x002e:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0033
            r8 = r9
        L_0x0033:
            r0 = r2 & 64
            if (r0 == 0) goto L_0x005c
        L_0x0037:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            r0 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x0041:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
        L_0x004a:
            r0 = r2 & 512(0x200, float:7.175E-43)
            r13 = 0
            if (r0 == 0) goto L_0x0050
            r12 = r13
        L_0x0050:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0059
        L_0x0054:
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0059:
            r13 = r25
            goto L_0x0054
        L_0x005c:
            r9 = r21
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.util.Map, com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel, int, h.f.b.g):void");
    }
}
