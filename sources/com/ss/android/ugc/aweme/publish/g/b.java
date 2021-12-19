package com.ss.android.ugc.aweme.publish.g;

import android.app.Application;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.common.d.m;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.d;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.a;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.publish.r;
import com.ss.android.ugc.aweme.shortvideo.publish.s;
import com.ss.android.ugc.aweme.shortvideo.publish.u;
import h.n;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private String f118787a;

    /* renamed from: b  reason: collision with root package name */
    private VideoPublishEditModel f118788b;

    /* renamed from: c  reason: collision with root package name */
    private r f118789c;

    /* renamed from: d  reason: collision with root package name */
    private u f118790d = u.VIDEO;

    /* renamed from: e  reason: collision with root package name */
    private final ar f118791e;

    static {
        Covode.recordClassIndex(77145);
    }

    public final b a() {
        String str;
        ar arVar = this.f118791e;
        Application application = i.f115645a;
        if (j.f107225d == l.a.UNKNOWN || !j.b() || j.c()) {
            j.f107225d = l.c(application);
        }
        l.a aVar = j.f107225d;
        if (aVar != null) {
            switch (c.f118799a[aVar.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                    str = "mobile";
                    break;
                case 4:
                    str = "2G";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = "3G";
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str = "4G";
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str = "5G";
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str = "wifi";
                    break;
                default:
                    throw new n();
            }
            arVar.a("network_type", str);
            return this;
        }
        str = "unknown";
        arVar.a("network_type", str);
        return this;
    }

    public final b c() {
        int i2;
        String str;
        ar arVar = this.f118791e;
        VideoPublishEditModel videoPublishEditModel = this.f118788b;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("editModel");
        }
        if (videoPublishEditModel.ttStoryUploadModel != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        arVar.a("is_story", Integer.valueOf(i2));
        VideoPublishEditModel videoPublishEditModel2 = this.f118788b;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("editModel");
        }
        if (videoPublishEditModel2.isStoryEditMode) {
            str = "story_shoot_page";
        } else {
            str = "video_shoot_page";
        }
        arVar.a("shoot_page", str);
        VideoPublishEditModel videoPublishEditModel3 = this.f118788b;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("editModel");
        }
        TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel3.ttStoryUploadModel;
        if (tTStoryUploadModel != null) {
            arVar.a("clip_index", Integer.valueOf(tTStoryUploadModel.getIndex()));
            arVar.a("clips_cnt", Integer.valueOf(tTStoryUploadModel.getTotalCount()));
        }
        return this;
    }

    public final b b() {
        ar arVar = this.f118791e;
        VideoPublishEditModel videoPublishEditModel = this.f118788b;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("content_type", es.c(videoPublishEditModel));
        VideoPublishEditModel videoPublishEditModel2 = this.f118788b;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("content_source", es.d(videoPublishEditModel2));
        VideoPublishEditModel videoPublishEditModel3 = this.f118788b;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("shoot_way", videoPublishEditModel3.mShootWay);
        arVar.a("is_long_video_allowed", Boolean.valueOf(d.a()));
        arVar.a("long_video_threshold", Long.valueOf(com.ss.android.ugc.aweme.setting.d.a()));
        VideoPublishEditModel videoPublishEditModel4 = this.f118788b;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("videoLength", Integer.valueOf(videoPublishEditModel4.getVideoLength()));
        VideoPublishEditModel videoPublishEditModel5 = this.f118788b;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("duration", Long.valueOf(a.b(videoPublishEditModel5.getPreviewInfo())));
        VideoPublishEditModel videoPublishEditModel6 = this.f118788b;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("editModel");
        }
        if (videoPublishEditModel6.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel7 = this.f118788b;
            if (videoPublishEditModel7 == null) {
                h.f.b.l.a("editModel");
            }
            if (videoPublishEditModel7.uploadMiscInfoStruct != null) {
                VideoPublishEditModel videoPublishEditModel8 = this.f118788b;
                if (videoPublishEditModel8 == null) {
                    h.f.b.l.a("editModel");
                }
                arVar.a("mv_id", videoPublishEditModel8.uploadMiscInfoStruct.mvThemeId);
            }
        }
        VideoPublishEditModel videoPublishEditModel9 = this.f118788b;
        if (videoPublishEditModel9 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("is_fast_import", Boolean.valueOf(es.p(videoPublishEditModel9)));
        VideoPublishEditModel videoPublishEditModel10 = this.f118788b;
        if (videoPublishEditModel10 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("has_subtitle", Boolean.valueOf(videoPublishEditModel10.hasSubtitle()));
        VideoPublishEditModel videoPublishEditModel11 = this.f118788b;
        if (videoPublishEditModel11 == null) {
            h.f.b.l.a("editModel");
        }
        arVar.a("segment_count", Integer.valueOf(videoPublishEditModel11.segmentCounts()));
        return this;
    }

    public final b a(VideoPublishEditModel videoPublishEditModel) {
        h.f.b.l.d(videoPublishEditModel, "");
        this.f118788b = videoPublishEditModel;
        return this;
    }

    public b(ar arVar) {
        h.f.b.l.d(arVar, "");
        this.f118791e = arVar;
    }

    public final b a(r rVar) {
        h.f.b.l.d(rVar, "");
        this.f118789c = rVar;
        return this;
    }

    public final b a(u uVar) {
        h.f.b.l.d(uVar, "");
        this.f118790d = uVar;
        return this;
    }

    public final b a(String str) {
        h.f.b.l.d(str, "");
        this.f118787a = str;
        return this;
    }

    public final b a(com.ss.android.ugc.aweme.publish.g.b.d dVar) {
        h.f.b.l.d(dVar, "");
        ar arVar = this.f118791e;
        arVar.a("error_code", Integer.valueOf(dVar.a()));
        arVar.a("error_source", dVar.b().getDesc());
        String c2 = m.c(dVar.f118796a);
        h.f.b.l.b(c2, "");
        arVar.a("exception", c2);
        arVar.a("server_log_id", com.ss.android.ugc.aweme.publish.g.c.a.e(dVar.f118796a));
        String c3 = dVar.c();
        if (c3.length() > 0) {
            arVar.a("error_cause", c3);
        }
        return this;
    }

    public final b a(boolean z) {
        ar arVar = this.f118791e;
        String str = this.f118787a;
        if (str == null) {
            h.f.b.l.a("publishId");
        }
        arVar.a("publish_id", str);
        arVar.a("publish_scene", this.f118790d.getDesc());
        r rVar = this.f118789c;
        if (rVar == null) {
            h.f.b.l.a("publishNode");
        }
        arVar.a("publish_node", rVar.getDesc());
        arVar.a("retry_publish", Boolean.valueOf(z));
        return this;
    }

    public final ar a(s sVar) {
        h.f.b.l.d(sVar, "");
        ar arVar = this.f118791e;
        arVar.a("event_type", sVar.getDesc());
        com.ss.android.ugc.aweme.publish.j k2 = g.a().o().k();
        StringBuilder append = new StringBuilder("Publish Node: ").append(sVar.getDesc()).append(", thread: ");
        Thread currentThread = Thread.currentThread();
        h.f.b.l.b(currentThread, "");
        k2.a("build_publish_monitor_metrics", append.append(currentThread.getName()).toString());
        return arVar;
    }
}
