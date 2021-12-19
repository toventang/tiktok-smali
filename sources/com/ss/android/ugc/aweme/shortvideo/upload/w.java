package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.google.c.h.a.k;
import com.ss.android.ugc.aweme.publish.g.b.e;
import com.ss.android.ugc.aweme.publish.g.c.a;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.r;
import com.ss.android.ugc.aweme.shortvideo.publish.s;
import com.ss.android.ugc.aweme.shortvideo.publish.u;
import com.ss.android.ugc.aweme.shortvideo.upload.c.b;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.utils.q;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class w implements k<SynthetiseResult> {

    /* renamed from: a  reason: collision with root package name */
    public String f132154a;

    /* renamed from: b  reason: collision with root package name */
    private final o f132155b = o.a();

    /* renamed from: c  reason: collision with root package name */
    private final String f132156c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f132157d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f132158e;

    /* renamed from: f  reason: collision with root package name */
    private final b f132159f;

    /* renamed from: g  reason: collision with root package name */
    private final VideoPublishEditModel f132160g;

    static {
        Covode.recordClassIndex(86557);
    }

    private com.ss.android.ugc.aweme.publish.g.b a(ar arVar) {
        return new com.ss.android.ugc.aweme.publish.g.b(arVar).a(this.f132156c).a(this.f132160g).a(r.COMPILE).a(u.VIDEO).a().a(this.f132157d);
    }

    @Override // com.google.c.h.a.k
    public final void onFailure(Throwable th) {
        String str;
        String str2;
        q.a("PublishDurationMonitor Synthetise end failed");
        int b2 = a.b(th);
        ar a2 = a(new ar()).b().c().a(new e(th)).a(s.FAILED);
        String str3 = "1";
        if (this.f132159f.f132102g) {
            str = str3;
        } else {
            str = "0";
        }
        JSONObject a3 = a2.a("click_publish", str).a();
        if (this.f132160g.isMvThemeVideoType() && i.a()) {
            try {
                a3.put("mv_id", this.f132154a);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("aweme_mv_edit_error_rate", b2, a3);
        }
        if (i.a()) {
            com.bytedance.apm.b.a("aweme_synthesis_error_rate_parallel", b2, a3);
        }
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", b2, a3);
        com.ss.android.ugc.tools.f.b a4 = bl.a(this.f132160g);
        if (this.f132157d) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("retry_publish", str2).a("publish_step", 11).a("shoot_way", this.f132160g.mShootWay).a("error_code", b2);
        if (!this.f132159f.f132102g) {
            str3 = "0";
        }
        d.a("parallel_publish_result", a5.a("click_publish", str3).a("video_editor_type", this.f132160g.videoEditorType).a("publish_id", this.f132156c).f149193a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.h.a.k
    public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
        String str;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        long a2 = this.f132155b.a(TimeUnit.MILLISECONDS);
        q.a("PublishDurationMonitor Synthetise end success durationMs:".concat(String.valueOf(a2)));
        ar a3 = a(new ar()).b().c().a(s.SUCCESS);
        String str2 = "1";
        if (this.f132159f.f132102g) {
            str = str2;
        } else {
            str = "0";
        }
        ar a4 = a3.a("click_publish", str);
        if (new File(this.f132160g.mParallelUploadOutputFile).exists()) {
            a4.a("speed", Float.valueOf(((float) this.f132160g.getVideoLength()) / ((float) a2))).a("duration", Long.valueOf(a2));
        }
        if (synthetiseResult2 != null && synthetiseResult2.audioLength - synthetiseResult2.videoLength > 3000.0f) {
            a4.a("compile_lost_video", (Boolean) true).a("fileInfo", synthetiseResult2.toString());
        }
        if (!this.f132158e.isEmpty()) {
            a4.a("compile_skip_frame", this.f132158e.toString()).a("compile_skip_frame_size", Integer.valueOf(this.f132158e.size()));
        }
        JSONObject a5 = a4.a();
        if (this.f132160g.isMvThemeVideoType() && i.a()) {
            com.bytedance.apm.b.a("aweme_mv_edit_error_rate", 0, a5);
        }
        if (i.a()) {
            com.bytedance.apm.b.a("aweme_synthesis_error_rate_parallel", 0, a5);
        }
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", 0, a5);
        com.ss.android.ugc.tools.f.b a6 = bl.a(this.f132160g);
        if (!this.f132157d) {
            str2 = "0";
        }
        d.a("parallel_publish_result", a6.a("retry_publish", str2).a("shoot_way", this.f132160g.mShootWay).a("publish_step", 11).a("video_editor_type", this.f132160g.videoEditorType).a("publish_id", this.f132156c).f149193a);
    }

    public w(String str, boolean z, VideoPublishEditModel videoPublishEditModel, b bVar, List<String> list) {
        String str2;
        this.f132156c = str;
        this.f132157d = z;
        this.f132159f = bVar;
        this.f132160g = videoPublishEditModel;
        this.f132158e = list;
        JSONObject a2 = a(new ar()).b().c().a(s.START).a();
        if (i.a()) {
            com.bytedance.apm.b.a("aweme_synthesis_error_rate_parallel", -1, a2);
        }
        com.bytedance.apm.b.a("aweme_movie_publish_error_rate_parallel", -1, a2);
        com.ss.android.ugc.tools.f.b a3 = bl.a(videoPublishEditModel);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        d.a("parallel_publish_result", a3.a("retry_publish", str2).a("shoot_way", videoPublishEditModel.mShootWay).a("publish_step", 10).a("video_editor_type", videoPublishEditModel.videoEditorType).a("publish_id", str).f149193a);
    }
}
