package com.ss.android.ugc.aweme.feed.ui;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.aq.a.a;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import h.f.b.l;
import java.util.HashMap;

final /* synthetic */ class bu implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bt f94420a;

    /* renamed from: b  reason: collision with root package name */
    private final String f94421b;

    /* renamed from: c  reason: collision with root package name */
    private final b f94422c;

    /* renamed from: d  reason: collision with root package name */
    private final IVideoGiftService f94423d;

    static {
        Covode.recordClassIndex(59974);
    }

    bu(bt btVar, String str, b bVar, IVideoGiftService iVideoGiftService) {
        this.f94420a = btVar;
        this.f94421b = str;
        this.f94422c = bVar;
        this.f94423d = iVideoGiftService;
    }

    public final void run() {
        bt btVar = this.f94420a;
        String str = this.f94421b;
        b bVar = this.f94422c;
        IVideoGiftService iVideoGiftService = this.f94423d;
        str.hashCode();
        int i2 = 1;
        switch (str.hashCode()) {
            case -1180796502:
                if (!str.equals("on_viewpager_page_selected") || !iVideoGiftService.a(btVar.L)) {
                    return;
                }
                if (be.b(btVar.L.getAid())) {
                    btVar.f94417e.setVisibility(0);
                    String aid = btVar.L.getAid();
                    l.d(aid, "");
                    be.f94339a.add(aid);
                    d a2 = new d().a("enter_from", btVar.M).a("group_id", ac.e(btVar.L)).a("author_id", ac.a(btVar.L)).a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId());
                    if (btVar.L.getFollowStatus() != 1) {
                        i2 = 0;
                    }
                    r.a("show_gift_icon", a2.a("is_follow", i2).a("is_like", btVar.L.isLike() ? 1 : 0).f66730a);
                    return;
                }
                be.a(btVar.L.getAid());
                return;
            case -330388150:
                if (str.equals("action_video_on_play_progress_change")) {
                    e eVar = (e) bVar.a();
                    if (iVideoGiftService.a(btVar.L) && btVar.f94417e.getVisibility() == 8 && eVar != null && eVar.f2397a.floatValue() > 80.0f) {
                        btVar.f94417e.setAlpha(0.0f);
                        btVar.f94417e.setVisibility(0);
                        btVar.f94417e.animate().alpha(1.0f).setDuration(600).start();
                        return;
                    }
                    return;
                }
                return;
            case -213371911:
                if (str.equals("video_open_comment_dialog") && btVar.f94416d != null) {
                    btVar.f94416d.callOnClick();
                    return;
                }
                return;
            case 281945252:
                if (!str.equals("show_festival_activity_icon")) {
                    return;
                }
                break;
            case 350216171:
                if (!str.equals("on_page_selected")) {
                    return;
                }
                break;
            default:
                return;
        }
        HashMap hashMap = new HashMap();
        if (str.equals("show_festival_activity_icon")) {
            hashMap.put("isInActivityState", Boolean.valueOf(a.a()));
        }
        btVar.a(hashMap);
    }
}
