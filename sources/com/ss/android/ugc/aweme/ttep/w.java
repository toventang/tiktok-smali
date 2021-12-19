package com.ss.android.ugc.aweme.ttep;

import android.text.TextUtils;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.h;
import com.bytedance.creativex.recorder.filter.a.a;
import com.ss.android.ugc.aweme.common.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.util.a;
import com.ss.android.ugc.aweme.shortvideo.util.at;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import com.ss.android.ugc.aweme.shortvideo.util.z;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import dmt.av.video.d.b;
import java.lang.reflect.Type;

final /* synthetic */ class w implements m {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141451a;

    static {
        Covode.recordClassIndex(92381);
    }

    w(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141451a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141451a;
        h hVar = (h) obj;
        if (!tTEPEffectPreviewActivity.x) {
            long j2 = hVar.f28190a;
            long j3 = hVar.f28191b;
            tTEPEffectPreviewActivity.x = true;
            T value = ((a) tTEPEffectPreviewActivity.f141208f.a((Type) a.class, (String) null)).getCurSelectedFilter().f6468a.getValue();
            Effect effect = tTEPEffectPreviewActivity.f141209g.n;
            String str4 = "";
            if (effect != null) {
                str2 = effect.getEffectId();
                str = effect.getName();
            } else {
                str = str4;
                str2 = str;
            }
            long longExtra = tTEPEffectPreviewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long j4 = j2 - longExtra;
            int intExtra = tTEPEffectPreviewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            long longExtra2 = tTEPEffectPreviewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = tTEPEffectPreviewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = tTEPEffectPreviewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            q.a("So decompress: TTEPEffectPreviewActivity, decompress time:".concat(String.valueOf(longExtra3)));
            boolean a2 = b.a();
            long longExtra4 = tTEPEffectPreviewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            com.ss.android.ugc.aweme.shortvideo.util.performance.a.a("tool_performance_record_first_frame", new com.ss.android.ugc.tools.f.b().a("sdk_load_ve_so_status", intExtra).a("preload_ve_so_task_status", intExtra2).a("preload_ve_so_cost_time", longExtra2).a("extra_decompress_time", longExtra3).a("first_frame_duration", j4).a("effect_first_frame_duration", j3 - j2).a("total_first_frame_duration", j3 - longExtra).a("shoot_way", tTEPEffectPreviewActivity.f141209g.r).a("enter_from", tTEPEffectPreviewActivity.f141209g.x).a("creation_id", tTEPEffectPreviewActivity.f141209g.q).a("cold_start", a2).a("effect_download_duration", longExtra4).a("music_download_duration", tTEPEffectPreviewActivity.getIntent().getLongExtra("music_download_duration", -1)).a("video_download_duration", tTEPEffectPreviewActivity.getIntent().getLongExtra("video_download_duration", -1)).a("camera_type", z.a(tTEPEffectPreviewActivity.C.D().getCurrentCameraType())).f149193a);
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", tTEPEffectPreviewActivity.f141209g.q).a("shoot_way", tTEPEffectPreviewActivity.f141209g.r);
            if (value != null) {
                str4 = value.getEnName();
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("filter_list", str4).a("filter_id_list", value != null ? value.getId() : 0).a("enter_from", tTEPEffectPreviewActivity.f141209g.x).a("prop_id", tTEPEffectPreviewActivity.q().D().c()).a("mv_id", str2).a("mv_name", str).a("cold_start", a2).a("app_mem_use", a.C3430a.a("av_video_record_init").getFirst()).a("availble_mem", a.C3430a.a("av_video_record_init").getSecond()).a("download_res_time", tTEPEffectPreviewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).a("camera_type", z.a(tTEPEffectPreviewActivity.C.D().getCurrentCameraType()));
            if (tTEPEffectPreviewActivity.f141209g.C != 0) {
                a4.a("draft_id", tTEPEffectPreviewActivity.f141209g.C);
            }
            if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f141209g.B)) {
                a4.a("channel", tTEPEffectPreviewActivity.f141209g.B);
            }
            if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f141209g.f124763h)) {
                a4.a("open_platform_share_id", tTEPEffectPreviewActivity.f141209g.f124763h);
            }
            if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f141209g.D)) {
                a4.a("new_draft_id", tTEPEffectPreviewActivity.f141209g.D);
                if (tTEPEffectPreviewActivity.f141209g.f124758c == 0) {
                    a4.a("enter_method", "click_back_button");
                    str3 = "general_draft_list";
                } else {
                    str3 = null;
                }
                a4.a("draft_way", str3);
            }
            a4.a("brightness", e.a(tTEPEffectPreviewActivity));
            if (longExtra > 0 && j4 > 0) {
                a4 = a4;
                a4.a("duration", j4);
            }
            if (TextUtils.equals(tTEPEffectPreviewActivity.f141209g.x, "super_entrance")) {
                a4.a("is_special_icon", 1);
            }
            if (tTEPEffectPreviewActivity.f141209g.i()) {
                a4.a("shoot_entrance", tTEPEffectPreviewActivity.f141209g.r);
                a4.a("reviewed", tTEPEffectPreviewActivity.f141209g.ab.getReviewed());
                if (!TextUtils.isEmpty(tTEPEffectPreviewActivity.f141209g.ab.getOrderId())) {
                    a4.a(d.MOD_ORDER_ID, tTEPEffectPreviewActivity.f141209g.ab.getOrderId());
                }
            }
            at.a("enter_video_shoot_page");
            r.a("enter_video_shoot_page", a4.f149193a);
            r.a("tool_performance_4k_video_import", new com.ss.android.ugc.tools.f.b().a("is_4k_enable", bt.a()).f149193a);
        }
    }
}
