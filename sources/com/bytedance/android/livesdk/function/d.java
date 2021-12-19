package com.bytedance.android.livesdk.function;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget f17791a;

    static {
        Covode.recordClassIndex(9875);
    }

    d(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f17791a = liveRoomNotifyWidget;
    }

    public final void onClick(View view) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f17791a;
        if (liveRoomNotifyWidget.f17767g != null && liveRoomNotifyWidget.dataChannel != null) {
            String str = liveRoomNotifyWidget.f17767g.f19389h;
            if (!TextUtils.isEmpty(str)) {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter("gift_enter_from", "announcements");
                Uri build = buildUpon.build();
                if ("webcast_gift_dialog".equals(build.getHost())) {
                    ((IGiftService) a.a(IGiftService.class)).monitorBroadcastClicked(Long.parseLong(build.getQueryParameter("gift_id")));
                    ((IActionHandlerService) a.a(IActionHandlerService.class)).handle(liveRoomNotifyWidget.context, build);
                } else if (!"webcast_room".equals(build.getHost())) {
                    ((IActionHandlerService) a.a(IActionHandlerService.class)).handle(liveRoomNotifyWidget.context, build);
                } else if (TextUtils.equals(build.getQueryParameter("enter_method"), "weekly_rank_notice")) {
                    String queryParameter = build.getQueryParameter("room_id");
                    if (TextUtils.equals(queryParameter, String.valueOf(liveRoomNotifyWidget.dataChannel.b(di.class)))) {
                        return;
                    }
                    if (liveRoomNotifyWidget.dataChannel == null || liveRoomNotifyWidget.dataChannel.b(ee.class) == null || !((Boolean) liveRoomNotifyWidget.dataChannel.b(ee.class)).booleanValue()) {
                        String queryParameter2 = build.getQueryParameter("anchor_id");
                        try {
                            ((com.bytedance.android.livesdk.rank.api.d) a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankRoomIds(Long.parseLong(queryParameter2), Long.parseLong(queryParameter), j.WEEKLY_RANK.getType(), liveRoomNotifyWidget.widgetCallback.getFragment(), liveRoomNotifyWidget.provideDataChannel(), new f(build, queryParameter2, queryParameter));
                        } catch (NumberFormatException e2) {
                            com.bytedance.android.live.core.c.a.a(6, "LiveRoomNotifyWidget", e2.getStackTrace());
                        }
                    } else {
                        ao.a(y.e(), (int) R.string.e8k);
                    }
                }
            }
        }
    }
}
