package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.io.File;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(83797);
    }

    public static final long b(EditPreviewInfo editPreviewInfo) {
        long j2 = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            j2 += editVideoSegment.getVideoFileInfo().getDuration();
        }
        return j2;
    }

    public static final long c(EditPreviewInfo editPreviewInfo) {
        long j2 = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            j2 += new File(editVideoSegment.getVideoPath()).length();
        }
        return j2;
    }

    public static final long d(EditPreviewInfo editPreviewInfo) {
        long j2 = 0;
        if (editPreviewInfo == null) {
            return 0;
        }
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            j2 += new File(editVideoSegment.getAudioPath()).length();
        }
        return j2;
    }

    public static final String a(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        int i2 = 0;
        for (T t : videoList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            sb.append("the " + i2 + " video path =>{" + t.getVideoPath() + "} \n");
            i2 = i3;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final String e(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        int i2 = 0;
        for (T t : videoList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            sb.append("the " + i2 + " audio path => {" + t.getAudioPath() + "} \n");
            i2 = i3;
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
