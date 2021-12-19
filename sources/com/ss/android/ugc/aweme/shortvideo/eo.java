package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.core.upload.d;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.aweme.shortvideo.upload.a.a;
import com.ss.android.ugc.aweme.shortvideo.upload.c.b;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.ss.android.ugc.aweme.utils.hn;
import com.ss.android.ugc.gamora.editor.c;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.aj;
import dmt.av.video.f;
import dmt.av.video.m;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class eo {

    /* renamed from: a  reason: collision with root package name */
    public long f128437a;

    /* renamed from: b  reason: collision with root package name */
    private double f128438b;

    /* renamed from: c  reason: collision with root package name */
    private o f128439c;

    /* renamed from: d  reason: collision with root package name */
    private final j f128440d;

    /* renamed from: e  reason: collision with root package name */
    private final int f128441e;

    /* renamed from: f  reason: collision with root package name */
    private final String f128442f;

    /* renamed from: g  reason: collision with root package name */
    private final String f128443g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f128444h;

    /* renamed from: i  reason: collision with root package name */
    private final String f128445i;

    /* renamed from: j  reason: collision with root package name */
    private final b f128446j;

    /* renamed from: k  reason: collision with root package name */
    private final int f128447k;

    static {
        Covode.recordClassIndex(84220);
    }

    public static boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.hasStickers() || videoPublishEditModel.mTimeEffect != null || h.b(videoPublishEditModel.mEffectList) || videoPublishEditModel.mSelectedId != 0) {
            return true;
        }
        return false;
    }

    public final void a(boolean z, List<d> list) {
        String str;
        float f2;
        this.f128439c = o.b(hn.f143067b);
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("resolution", "");
        String str2 = "0";
        String str3 = "1";
        if (com.ss.android.ugc.aweme.property.b.a()) {
            str = str3;
        } else {
            str = str2;
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("is_hardcode", str).a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("video_quality", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.d()).toString()).a("_perf_monitor", str3).a("publish_type", this.f128447k);
        if (z) {
            str2 = str3;
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("is_click_publish", str2).a("fps", new StringBuilder().append(this.f128438b).toString());
        int i2 = 0;
        if (this.f128441e == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f128444h;
            a4.a("creation_id", videoPublishEditModel.creationId);
            a4.a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed());
            bl.a(a4, videoPublishEditModel);
            a4.a("source_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
            String str4 = this.f128445i;
            l.d(a4, "");
            l.d(str4, "");
            l.d(videoPublishEditModel, "");
            if (list != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long c2 = a.c();
                long j2 = -1;
                if (c2 != -1) {
                    j2 = (currentTimeMillis - c2) / 1000;
                }
                com.ss.android.ugc.tools.f.b a5 = a4.a("publish_id", str4);
                UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.uploadSpeedInfo;
                if (uploadSpeedInfo != null) {
                    f2 = (float) uploadSpeedInfo.getSpeed();
                } else {
                    f2 = -1.0f;
                }
                com.ss.android.ugc.tools.f.b a6 = a5.a("upload_probe_speed", Float.valueOf(f2));
                ax axVar = c.r;
                l.b(axVar, "");
                com.ss.android.ugc.tools.f.b a7 = a6.a("internet_speed", axVar.d()).a("last_upload_speed", a.b() / 1024).a("last_time_diff", j2);
                d dVar = (d) n.h((List) list);
                if (dVar != null) {
                    i2 = dVar.a();
                }
                a7.a("adapt_chunk_size", i2);
            }
        }
        if (c.u.a()) {
            str3 = "2";
        }
        a4.a("is_child_mode", str3);
        r.a("video_publish_start", a4.f149193a);
    }

    public final void a(boolean z, String str, String str2, boolean z2, com.ss.android.ugc.aweme.publish.f.d dVar) {
        String str3;
        String str4;
        String str5;
        int i2;
        int i3;
        int i4;
        String str6;
        String str7;
        String str8;
        int bitrate;
        String str9;
        String resolution;
        int fps;
        long j2;
        a.a().storeLong("upload_finish_timestamp", System.currentTimeMillis());
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        String str10 = "0";
        if (z) {
            str3 = "1";
        } else {
            str3 = str10;
        }
        com.ss.android.ugc.tools.f.b a2 = bVar.a("status", str3).a("fail_info", str);
        if (com.ss.android.ugc.aweme.property.b.a()) {
            str4 = "1";
        } else {
            str4 = str10;
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("record_code_type", str4);
        if (com.ss.android.ugc.aweme.property.b.b()) {
            str5 = "1";
        } else {
            str5 = str10;
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("compose_code_type", str5).a("bite_rate", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.c()).toString()).a("video_quality", new StringBuilder().append(com.ss.android.ugc.aweme.property.b.d()).toString()).a("_perf_monitor", "1").a("publish_type", this.f128447k).a("fps", new StringBuilder().append(this.f128438b).toString()).a("is_hd_setting", m.a(this.f128444h) ? 1 : 0).a("content_source", this.f128442f).a("content_type", this.f128443g);
        if (dVar != null) {
            if (dVar.f118722a != null) {
                a4.a("video_https_type", dVar.f118722a.f118759j);
            }
            if (dVar.f118724c != null) {
                a4.a("image_https_type", dVar.f118724c.f118735j);
            }
            if (dVar.f118725d != null) {
                a4.a("frame_https_type", dVar.f118725d.f118735j);
            }
        }
        if (this.f128439c.f53699a) {
            this.f128439c.c();
        }
        long a5 = this.f128439c.a(TimeUnit.MILLISECONDS);
        this.f128437a = a5;
        a4.a("origin_upload_dur_ms", a5);
        a4.a("download_internet_speed_kbps", c.r.d());
        b bVar2 = this.f128446j;
        if (bVar2 != null) {
            a4.a("synthetic_dur_ms", bVar2.d()).a("upload_wait_time_ms", this.f128446j.b().c());
            this.f128437a -= this.f128446j.f132096a.a(TimeUnit.MILLISECONDS);
        }
        a4.a("duration", this.f128437a);
        if (this.f128437a - this.f128446j.b().c() > 0) {
            this.f128437a -= this.f128446j.b().c();
        }
        long d2 = (this.f128440d.d(this.f128444h) * 1000) / this.f128437a;
        a.a().storeLong("upload_speed", d2);
        int i5 = 0;
        a4.a("upload_speed", com.a.a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) d2) / 1024.0f)}));
        if (!z) {
            a4.a("error_code", str2);
        }
        if (this.f128441e == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f128444h;
            VideoFileInfo b2 = aj.b(videoPublishEditModel.mOutputFile);
            if (b2 != null) {
                i2 = b2.getCodecType();
            } else {
                i2 = -1;
            }
            int[] a6 = bb.a(videoPublishEditModel.getPreviewInfo());
            if (a6 != null) {
                i3 = a6[8];
            } else {
                i3 = -1;
            }
            p<Integer, Integer> a7 = com.ss.android.ugc.tools.utils.m.a(videoPublishEditModel);
            if (a7.getFirst().intValue() + a7.getSecond().intValue() > 1) {
                i4 = 1;
            } else if (a7.getFirst().intValue() + a7.getSecond().intValue() == 1) {
                i4 = 0;
            } else {
                i4 = -1;
            }
            if (i.a(videoPublishEditModel.mParallelUploadOutputFile)) {
                str6 = com.a.a(Locale.US, "%d", new Object[]{Long.valueOf(com.ss.android.ugc.tools.utils.h.i(videoPublishEditModel.mParallelUploadOutputFile) / 1024)});
            } else if (i.a(videoPublishEditModel.mOutputFile)) {
                str6 = com.a.a(Locale.US, "%d", new Object[]{Long.valueOf(com.ss.android.ugc.tools.utils.h.i(videoPublishEditModel.mOutputFile) / 1024)});
            } else {
                str6 = null;
            }
            if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay) && !TextUtils.isEmpty(videoPublishEditModel.clientId) && !TextUtils.isEmpty(videoPublishEditModel.shareId)) {
                a4.a("shoot_way", videoPublishEditModel.mShootWay);
                a4.a("channel", videoPublishEditModel.clientId);
                a4.a("open_platform_share_id", videoPublishEditModel.shareId);
            }
            com.ss.android.ugc.tools.f.b a8 = a4.a("creation_id", videoPublishEditModel.creationId).a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds)).a("prop_list", videoPublishEditModel.mStickerID);
            if (z2) {
                str7 = "1";
            } else {
                str7 = str10;
            }
            com.ss.android.ugc.tools.f.b a9 = a8.a("is_click_publish", str7).a("effect_list", videoPublishEditModel.getEditEffectList()).a("original_resolution", bp.o(videoPublishEditModel)).a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            if (videoPublishEditModel.mSelectedId == 0) {
                str8 = str10;
            } else {
                str8 = "1";
            }
            com.ss.android.ugc.tools.f.b a10 = a9.a("video_edit_page_filter", str8);
            if (b2 == null) {
                bitrate = 0;
            } else {
                bitrate = b2.getBitrate();
            }
            com.ss.android.ugc.tools.f.b a11 = a10.a("file_bitrate", bitrate);
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str9 = "hardcoding";
            } else {
                str9 = "softcoding";
            }
            com.ss.android.ugc.tools.f.b a12 = a11.a("compose_coding", str9);
            if (f.d(videoPublishEditModel)) {
                str10 = "1";
            }
            com.ss.android.ugc.tools.f.b a13 = a12.a("is_reencode", str10).a("is_open_foreground", videoPublishEditModel.isOpenForegroundPublish ? 1 : 0).a("is_background_publish", videoPublishEditModel.isBackgroundPublish ? 1 : 0).a("file_size", str6).a("codec_type", i2).a("source_codec_type", i3).a("is_multi_content", i4);
            if (b2 == null) {
                resolution = "";
            } else {
                resolution = b2.getResolution();
            }
            com.ss.android.ugc.tools.f.b a14 = a13.a("resolution", resolution).a("beautify_used", videoPublishEditModel.faceBeautyOpen).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.f68624a).a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed());
            if (b2 == null) {
                fps = 0;
            } else {
                fps = b2.getFps();
            }
            com.ss.android.ugc.tools.f.b a15 = a14.a("file_fps", fps).a("is_filter", a(videoPublishEditModel) ? 1 : 0).a("is_multi_video", !c.a.a(videoPublishEditModel) ? 1 : 0).a("sw_conf_preset", -1).a("is_hd_video", m.b(videoPublishEditModel) ? 1 : 0).a("sw_conf_crf", -1);
            if (b2 != null) {
                j2 = b2.getDuration();
            } else {
                j2 = -1;
            }
            a15.a("source_duration", j2);
            m.a(videoPublishEditModel, a4);
            m.b(videoPublishEditModel, a4);
            if (videoPublishEditModel.hardcodeAdaptiveResult != null) {
                a4.a("hw_opt_bitrate_set_result", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getHwOptBitrate()));
                a4.a("pre_bitrate_status", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
            a4.a("select_gear_by_upload_speed", videoPublishEditModel.getUploadSpeedSettingsIndex());
            if (videoPublishEditModel.getPreviewInfo() != null && !videoPublishEditModel.getPreviewInfo().getVideoList().isEmpty()) {
                EditVideoSegment editVideoSegment = videoPublishEditModel.getPreviewInfo().getVideoList().get(0);
                VideoFileInfo videoFileInfo = editVideoSegment.getVideoFileInfo();
                a4.a("src_resolution", videoFileInfo.getWidth() + "*" + videoFileInfo.getHeight());
                a4.a("pre_resolution", videoFileInfo.getWidth() + "*" + videoFileInfo.getHeight());
                a4.a("src_fps", videoFileInfo.getFps());
                a4.a("pre_fps", videoFileInfo.getFps());
                a4.a("src_bitrate", videoFileInfo.getBitrate());
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo != null) {
                    a4.a("src_duration", videoCutInfo.getEnd() - videoCutInfo.getStart());
                } else {
                    a4.a("src_duration", videoFileInfo.getDuration());
                }
                bl.a(a4, videoPublishEditModel);
            }
        }
        if (g.a().o().c()) {
            i5 = g.a().o().d();
        }
        a4.a("publish_cnt", i5);
        com.ss.android.ugc.aweme.shortvideo.v.b.a.a(a4, this.f128444h);
        r.a("video_publish_end", a4.f149193a);
        q.d("PublishDurationMonitor VideoUploadDurationInMs: " + this.f128437a);
    }

    public eo(Object obj, j jVar, int i2, b bVar, String str, int i3) {
        this.f128440d = jVar;
        this.f128441e = i2;
        this.f128444h = obj;
        this.f128447k = i3;
        this.f128446j = bVar;
        if (obj instanceof VideoPublishEditModel) {
            this.f128443g = es.c((VideoPublishEditModel) obj);
        } else {
            this.f128443g = com.ss.android.ugc.aweme.photo.a.b.b(i2);
        }
        this.f128442f = com.ss.android.ugc.aweme.photo.a.b.a(i2, obj);
        if (i2 == 0) {
            this.f128438b = (double) ((VideoPublishEditModel) obj).videoFps();
        }
        this.f128445i = str;
    }
}
