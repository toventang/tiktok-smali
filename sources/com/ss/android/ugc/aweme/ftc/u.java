package com.ss.android.ugc.aweme.ftc;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.h;
import com.ss.android.ugc.aweme.common.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import com.ss.android.ugc.aweme.shortvideo.util.z;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.d.b;

final /* synthetic */ class u implements m {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98906a;

    static {
        Covode.recordClassIndex(62884);
    }

    u(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98906a = fTCVideoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        String str;
        String str2;
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98906a;
        h hVar = (h) obj;
        if (!fTCVideoRecordNewActivity.x) {
            long j2 = hVar.f28190a;
            long j3 = hVar.f28191b;
            fTCVideoRecordNewActivity.x = true;
            T value = fTCVideoRecordNewActivity.l().getCurSelectedFilter().f6468a.getValue();
            Effect effect = fTCVideoRecordNewActivity.f97381g.n;
            String str3 = "";
            if (effect != null) {
                str2 = effect.getEffectId();
                str = effect.getName();
            } else {
                str = str3;
                str2 = str;
            }
            long longExtra = fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long j4 = j2 - longExtra;
            int intExtra = fTCVideoRecordNewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = fTCVideoRecordNewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = fTCVideoRecordNewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            q.a("So decompress: VideoRecordNewActivity, decompress time:".concat(String.valueOf(longExtra3)));
            boolean a2 = b.a();
            long longExtra4 = fTCVideoRecordNewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            r.a("tool_performance_record_first_frame", new com.ss.android.ugc.tools.f.b().a("sdk_load_ve_so_status", intExtra).a("preload_ve_so_task_status", intExtra2).a("preload_ve_so_cost_time", longExtra2).a("extra_decompress_time", longExtra3).a("first_frame_duration", j4).a("effect_first_frame_duration", j3 - j2).a("total_first_frame_duration", j3 - longExtra).a("shoot_way", fTCVideoRecordNewActivity.f97381g.r).a("enter_from", fTCVideoRecordNewActivity.f97381g.x).a("creation_id", fTCVideoRecordNewActivity.f97381g.q).a("cold_start", a2).a("effect_download_duration", longExtra4).a("music_download_duration", fTCVideoRecordNewActivity.getIntent().getLongExtra("music_download_duration", -1)).a("video_download_duration", fTCVideoRecordNewActivity.getIntent().getLongExtra("video_download_duration", -1)).a("camera_type", z.a(fTCVideoRecordNewActivity.A.D().getCurrentCameraType())).f149193a);
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", fTCVideoRecordNewActivity.f97381g.q).a("shoot_way", fTCVideoRecordNewActivity.f97381g.r).a("draft_id", fTCVideoRecordNewActivity.f97381g.C);
            if (value != null) {
                str3 = value.getEnName();
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("filter_list", str3).a("filter_id_list", value != null ? value.getId() : 0).a("enter_from", fTCVideoRecordNewActivity.f97381g.x).a("prop_id", fTCVideoRecordNewActivity.m().D().c()).a("mv_id", str2).a("mv_name", str).a("cold_start", a2).a("download_res_time", fTCVideoRecordNewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).a("camera_type", z.a(fTCVideoRecordNewActivity.A.D().getCurrentCameraType()));
            a4.a("brightness", e.a(fTCVideoRecordNewActivity));
            if (longExtra > 0 && j4 > 0) {
                a4 = a4;
                a4.a("duration", j4);
            }
            r.a("enter_video_shoot_page", a4.f149193a);
            r.a("tool_performance_4k_video_import", new com.ss.android.ugc.tools.f.b().a("is_4k_enable", bt.a()).f149193a);
        }
    }
}
