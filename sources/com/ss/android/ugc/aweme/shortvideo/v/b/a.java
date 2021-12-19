package com.ss.android.ugc.aweme.shortvideo.v.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.property.ei;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.br;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f132464a = new a();

    private static boolean a(int i2) {
        return i2 == 1;
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(86717);
    }

    public static boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.isPhotoMvMode && cy.a.a().f118429a) {
            return true;
        }
        bq a2 = br.a(videoPublishEditModel);
        if (Math.min(a2.b(false), a2.a(false)) >= 1080) {
            return true;
        }
        return false;
    }

    private static void a(b bVar, SynthetiseResult synthetiseResult) {
        VideoFileInfo videoFileInfo;
        if (synthetiseResult != null && (videoFileInfo = synthetiseResult.outputVideoFileInfo) != null) {
            bVar.a("compose_fps", String.valueOf(videoFileInfo.getFps()));
            bVar.a("compose_resolution", videoFileInfo.getResolution());
            bVar.a("compose_file_bitrate", videoFileInfo.getBitrate());
            if (e.b(synthetiseResult.outputFile)) {
                String a2 = com.a.a(Locale.US, "%d", Arrays.copyOf(new Object[]{Long.valueOf(new File(synthetiseResult.outputFile).length() / 1024)}, 1));
                l.b(a2, "");
                bVar.a("compose_file_size", a2);
            }
            bVar.a("compose_file_duration", String.valueOf(videoFileInfo.getDuration()));
            bVar.a("compose_bitrate", Float.valueOf(ei.a()));
        }
    }

    public static final void a(b bVar, Object obj) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        l.d(bVar, "");
        if (!(obj instanceof VideoPublishEditModel)) {
            obj = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel != null) {
            bVar.a("source_fps", String.valueOf(videoPublishEditModel.videoFps()));
            bVar.a("source_resolution", videoPublishEditModel.getVideoResolution());
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (!(previewInfo == null || (videoList = previewInfo.getVideoList()) == null || !(!videoList.isEmpty()) || (editVideoSegment = videoList.get(0)) == null)) {
                bVar.a("source_file_bitrate", String.valueOf(editVideoSegment.getVideoFileInfo().getBitrate()));
                File file = new File(editVideoSegment.getVideoPath());
                if (file.isFile() && file.exists()) {
                    String a2 = com.a.a(Locale.US, "%d", Arrays.copyOf(new Object[]{Long.valueOf(file.length() / 1024)}, 1));
                    l.b(a2, "");
                    bVar.a("source_file_size", a2);
                }
            }
            bl.a(bVar, videoPublishEditModel);
        }
    }

    public static final void a(b bVar, SynthetiseResult synthetiseResult, Object obj) {
        l.d(bVar, "");
        a(bVar, obj);
        a(bVar, synthetiseResult);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03f1, code lost:
        if (r4 > 0) goto L_0x03f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.Object r57, int r58, long r59, int r61, java.lang.String r62, long r63, long r65, long r67, long r69, long r71, long r73, boolean r75, boolean r76, int r77, boolean r78, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r79, com.ss.android.ugc.aweme.shortvideo.j r80, com.ss.android.ugc.aweme.shortvideo.eo r81) {
        /*
        // Method dump skipped, instructions count: 1263
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.v.b.a.a(java.lang.Object, int, long, int, java.lang.String, long, long, long, long, long, long, boolean, boolean, int, boolean, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, com.ss.android.ugc.aweme.shortvideo.j, com.ss.android.ugc.aweme.shortvideo.eo):void");
    }
}
