package com.ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "audioPath")
    private final String audioPath;
    @c(a = "endTime")
    private long endTime;
    @c(a = "isMultiBgVideo")
    private final boolean isMultiBgVideo;
    @c(a = "maxDuration")
    private final long maxDuration;
    @c(a = "uid")
    private final String uid;
    @c(a = "videoPath")
    private final String videoPath;

    static {
        Covode.recordClassIndex(88246);
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final boolean isMultiBgVideo() {
        return this.isMultiBgVideo;
    }

    public final int hashCode() {
        return this.videoPath.hashCode();
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!l.a((Object) this.videoPath, (Object) aVar.videoPath) || !l.a((Object) this.audioPath, (Object) aVar.audioPath)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public a(String str, String str2, long j2, boolean z, long j3, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.videoPath = str;
        this.audioPath = str2;
        this.maxDuration = j2;
        this.isMultiBgVideo = z;
        this.endTime = j3;
        this.uid = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r10, java.lang.String r11, long r12, boolean r14, long r15, java.lang.String r17, int r18, h.f.b.g r19) {
        /*
            r9 = this;
            r5 = r14
            r6 = r15
            r8 = r17
            r0 = r18 & 8
            if (r0 == 0) goto L_0x000a
            r0 = 0
            r5 = 0
        L_0x000a:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r6 = 0
        L_0x0012:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0023
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = ""
            h.f.b.l.b(r8, r0)
        L_0x0023:
            r0 = r9
            r3 = r12
            r2 = r11
            r1 = r10
            r0.<init>(r1, r2, r3, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.model.a.<init>(java.lang.String, java.lang.String, long, boolean, long, java.lang.String, int, h.f.b.g):void");
    }
}
