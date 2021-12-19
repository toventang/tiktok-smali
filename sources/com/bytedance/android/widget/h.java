package com.bytedance.android.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.covode.number.Covode;
import h.a.am;
import h.f.b.l;
import java.util.Set;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f24341a = am.a((Object[]) new String[]{"GiftWidget", "LiveNewVideoGiftWidget", "LiveNewSpecialGiftWidget", "NormalGiftAnimWidget", "LiveNewGiftBottomWidget", "LiveNewGiftGuestInfoWidget", "LiveNewGiftPageIndicatorWidget", "LiveNewGiftPanelWidget", "LiveGiftBottomWidget", "LiveGiftPanelWidget", "LiveGiftGuestInfoWidget", "LiveFirstRechargeWidget", "LiveGiftTrayWidget", "SocialAnchorWidget", "SocialGuestWidget", "FrameSlotWidget", "FrameL2SlotWidget", "FrameL3SlotWidget", "LiveMaskLayerWidget", "OnlineAudienceRankWidget", "HourlyRankWidget", "RankEntranceWidget", "SurveyCardWidget"});

    static {
        Covode.recordClassIndex(14292);
    }

    public static final boolean a(Widget widget) {
        l.c(widget, "");
        return a((Class<? extends Widget>) widget.getClass());
    }

    public static final boolean a(Context context) {
        l.c(context, "");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean a(Class<? extends Widget> cls) {
        l.c(cls, "");
        return f24341a.contains(cls.getSimpleName());
    }
}
