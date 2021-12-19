package com.bytedance.android.livesdk.rank.impl.view;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.l;
import com.bytedance.android.live.gift.t;
import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.android.livesdk.gift.b.b;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final SelfRankInfoView f21069a;

    /* renamed from: b  reason: collision with root package name */
    private final a.EnumC0371a f21070b;

    static {
        Covode.recordClassIndex(12439);
    }

    public c(SelfRankInfoView selfRankInfoView, a.EnumC0371a aVar) {
        this.f21069a = selfRankInfoView;
        this.f21070b = aVar;
    }

    public final void onClick(View view) {
        SelfRankInfoView selfRankInfoView = this.f21069a;
        a.EnumC0371a aVar = this.f21070b;
        if (aVar == a.EnumC0371a.GREY) {
            if (b.a(false, true, (selfRankInfoView.o == null || selfRankInfoView.o.getRoomAuthStatus() == null || !selfRankInfoView.o.getRoomAuthStatus().isEnableGift()) ? false : true) != b.a.TOAST) {
                String a2 = com.a.a(selfRankInfoView.getContext().getResources().getString(R.string.glu), new Object[]{LowAgeAnchorLimitSetting.INSTANCE.getValue()});
                b.a aVar2 = new b.a(selfRankInfoView.getContext());
                aVar2.f18296m = true;
                aVar2.f18285b = a2;
                aVar2.a(R.string.gn0, (DialogInterface.OnClickListener) new d(selfRankInfoView), false).b(R.string.gn1, e.f21072a, false).a().show();
            } else if (selfRankInfoView.o != null && selfRankInfoView.o.getRoomAuthStatus() != null && selfRankInfoView.o.getRoomAuthStatus().getRoomAuthOffReasons() != null && selfRankInfoView.o.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                ao.a(y.e(), selfRankInfoView.o.getRoomAuthStatus().getRoomAuthOffReasons().getGift(), 0);
                if (selfRankInfoView.f21029m != null) {
                    selfRankInfoView.f21029m.c(l.class, true);
                }
            }
        } else if (aVar == a.EnumC0371a.SHOW && selfRankInfoView.f21029m != null) {
            h hVar = new h();
            hVar.f17851b = "active_user_rank";
            selfRankInfoView.f21029m.c(t.class, hVar);
            selfRankInfoView.n.dismiss();
        }
    }
}
