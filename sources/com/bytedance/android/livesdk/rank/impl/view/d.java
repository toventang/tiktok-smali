package com.bytedance.android.livesdk.rank.impl.view;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final SelfRankInfoView f21071a;

    static {
        Covode.recordClassIndex(12440);
    }

    d(SelfRankInfoView selfRankInfoView) {
        this.f21071a = selfRankInfoView;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        IGiftService iGiftService;
        SelfRankInfoView selfRankInfoView = this.f21071a;
        dialogInterface.dismiss();
        if (TextUtils.isEmpty(LiveSdkAppealWebviewSetting.INSTANCE.getValue()) && (iGiftService = (IGiftService) a.a(IGiftService.class)) != null) {
            ((IActionHandlerService) a.a(IActionHandlerService.class)).handle(selfRankInfoView.n.getContext(), iGiftService.getLowAgeReportUrl());
        }
        if (u.a().b() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(u.a().b().c()));
            b.a.a("livesdk_anchor_click_contact_us").a(selfRankInfoView.f21029m).a((Map<String, String>) hashMap).b();
        }
    }
}
