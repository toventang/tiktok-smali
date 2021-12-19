package com.ss.android.ugc.aweme.shortvideo.ui;

import android.text.TextUtils;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.h;
import com.bytedance.creativex.recorder.filter.a.a;
import com.ss.android.ugc.aweme.common.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.util.a;
import com.ss.android.ugc.aweme.shortvideo.util.at;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import com.ss.android.ugc.aweme.shortvideo.util.z;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.d.b;
import java.lang.reflect.Type;

final /* synthetic */ class fz implements m {

    /* renamed from: a  reason: collision with root package name */
    private final VideoRecordNewActivity f131775a;

    static {
        Covode.recordClassIndex(86315);
    }

    fz(VideoRecordNewActivity videoRecordNewActivity) {
        this.f131775a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        VideoRecordNewActivity videoRecordNewActivity = this.f131775a;
        h hVar = (h) obj;
        if (!videoRecordNewActivity.z) {
            long j2 = hVar.f28190a;
            long j3 = hVar.f28191b;
            videoRecordNewActivity.z = true;
            T value = ((a) videoRecordNewActivity.f131227f.a((Type) a.class, (String) null)).getCurSelectedFilter().f6468a.getValue();
            Effect effect = videoRecordNewActivity.f131228g.n;
            String str4 = "";
            if (effect != null) {
                str2 = effect.getEffectId();
                str = effect.getName();
            } else {
                str = str4;
                str2 = str;
            }
            long longExtra = videoRecordNewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long j4 = j2 - longExtra;
            int intExtra = videoRecordNewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = videoRecordNewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = videoRecordNewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = videoRecordNewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            q.a("So decompress: VideoRecordNewActivity, decompress time:".concat(String.valueOf(longExtra3)));
            boolean a2 = b.a();
            long longExtra4 = videoRecordNewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            com.ss.android.ugc.aweme.shortvideo.util.performance.a.a("tool_performance_record_first_frame", new com.ss.android.ugc.tools.f.b().a("sdk_load_ve_so_status", intExtra).a("preload_ve_so_task_status", intExtra2).a("preload_ve_so_cost_time", longExtra2).a("extra_decompress_time", longExtra3).a("first_frame_duration", j4).a("effect_first_frame_duration", j3 - j2).a("total_first_frame_duration", j3 - longExtra).a("shoot_way", videoRecordNewActivity.f131228g.r).a("enter_from", videoRecordNewActivity.f131228g.x).a("creation_id", videoRecordNewActivity.f131228g.q).a("cold_start", a2).a("effect_download_duration", longExtra4).a("music_download_duration", videoRecordNewActivity.getIntent().getLongExtra("music_download_duration", -1)).a("video_download_duration", videoRecordNewActivity.getIntent().getLongExtra("video_download_duration", -1)).a("camera_type", z.a(videoRecordNewActivity.F.D().getCurrentCameraType())).f149193a);
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoRecordNewActivity.f131228g.q).a("shoot_way", videoRecordNewActivity.f131228g.r);
            if (value != null) {
                str4 = value.getEnName();
            }
            int i2 = 0;
            com.ss.android.ugc.tools.f.b a4 = a3.a("filter_name", str4).a("filter_id", value != null ? value.getId() : 0).a("enter_from", videoRecordNewActivity.f131228g.x).a("prop_id", videoRecordNewActivity.r().D().c()).a("mv_id", str2).a("mv_name", str).a("cold_start", a2).a("app_mem_use", a.C3430a.a("av_video_record_init").getFirst()).a("availble_mem", a.C3430a.a("av_video_record_init").getSecond()).a("download_res_time", videoRecordNewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).a("camera_type", z.a(videoRecordNewActivity.F.D().getCurrentCameraType()));
            if (videoRecordNewActivity.f131228g.C != 0) {
                a4.a("draft_id", videoRecordNewActivity.f131228g.C);
            }
            if (!TextUtils.isEmpty(videoRecordNewActivity.f131228g.B)) {
                a4.a("channel", videoRecordNewActivity.f131228g.B);
            }
            if (!TextUtils.isEmpty(videoRecordNewActivity.f131228g.f124763h)) {
                a4.a("open_platform_share_id", videoRecordNewActivity.f131228g.f124763h);
            }
            if (!TextUtils.isEmpty(videoRecordNewActivity.f131228g.D)) {
                a4.a("new_draft_id", videoRecordNewActivity.f131228g.D);
                if (videoRecordNewActivity.f131228g.f124758c == 0) {
                    a4.a("enter_method", "click_back_button");
                    str3 = "general_draft_list";
                } else {
                    str3 = null;
                }
                a4.a("draft_way", str3);
            }
            a4.a("brightness", e.a(videoRecordNewActivity));
            if (longExtra > 0 && j4 > 0) {
                a4.a("duration", j4);
            }
            if (TextUtils.equals(videoRecordNewActivity.f131228g.x, "super_entrance")) {
                a4.a("is_special_icon", 1);
            }
            if (videoRecordNewActivity.f131228g.i()) {
                a4.a("shoot_entrance", videoRecordNewActivity.f131228g.r);
                a4.a("reviewed", videoRecordNewActivity.f131228g.ab.getReviewed());
                if (!TextUtils.isEmpty(videoRecordNewActivity.f131228g.ab.getOrderId())) {
                    a4.a(d.MOD_ORDER_ID, videoRecordNewActivity.f131228g.ab.getOrderId());
                }
            }
            if ("story".equals(videoRecordNewActivity.f131228g.r)) {
                a4.a("shoot_entrance", "story").a("enter_method", videoRecordNewActivity.f131228g.y);
            }
            a4.a("shoot_page", "video_shoot_page").a("is_from_duet_button", videoRecordNewActivity.f131228g.aU);
            a4.a("is_westwindow_exist", videoRecordNewActivity.f131228g.aR);
            if (videoRecordNewActivity.f131228g.q()) {
                a4.a("is_restore_crash", 1);
                if (g.a().d().f()) {
                    a4.a("enter_method", "click_continue_popup");
                } else {
                    a4.a("enter_method", "click_back_button");
                }
            }
            if (g.a().o().c()) {
                i2 = g.a().o().d();
            }
            a4.a("publish_cnt", i2);
            at.a("enter_video_shoot_page");
            r.a("enter_video_shoot_page", a4.f149193a);
            r.a("tool_performance_4k_video_import", new com.ss.android.ugc.tools.f.b().a("is_4k_enable", bt.a()).f149193a);
        }
    }
}
