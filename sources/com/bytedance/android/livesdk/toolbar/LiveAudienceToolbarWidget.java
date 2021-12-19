package com.bytedance.android.livesdk.toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.m.c;
import com.bytedance.android.live.p.h;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.p.o;
import com.bytedance.android.live.p.q;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.other.LiveTurntableUrlSetting;
import com.bytedance.android.livesdk.watch.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import java.util.ArrayList;
import java.util.List;

public class LiveAudienceToolbarWidget extends RoomRecycleWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private static final int f21654a = y.a(8.0f);

    /* renamed from: b  reason: collision with root package name */
    private static final int f21655b = y.a(4.0f);

    /* renamed from: c  reason: collision with root package name */
    private List<l> f21656c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f21657d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21658e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21659f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21660g = false;

    /* renamed from: h  reason: collision with root package name */
    private q f21661h;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bfg;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(12777);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f21656c.clear();
        ((h) a.a(h.class)).toolbarManager().a(this.dataChannel);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        o.RIGHT.onVisibility(z, this.dataChannel, this.f21656c, this.f21661h);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        this.f21658e = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f21659f = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        this.f21657d = (LinearLayout) getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        if (room != null) {
            if (c.b(this.dataChannel)) {
                l.QUESTION.setEnableClick(this.dataChannel, true);
            } else {
                l.QUESTION.unload(this.dataChannel);
            }
            List<?> audienceToolbarList = ((d) a.a(d.class)).audienceToolbarList(this.dataChannel, getContext());
            ArrayList arrayList = new ArrayList();
            if (audienceToolbarList != null) {
                for (int i2 = 0; i2 < audienceToolbarList.size(); i2++) {
                    arrayList.add(audienceToolbarList.get(i2));
                }
            }
            if (arrayList.size() > 0) {
                o.RIGHT.refreshHolder(this.dataChannel, this.f21657d, arrayList, this.f21661h);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        int i2 = 0;
        v.b((View) this.f21657d, 0);
        this.f21658e = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f21659f = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.dataChannel.b(ea.class));
        this.f21660g = equals;
        if (equals) {
            this.f21661h = q.ICON_WITH_TEXT;
        } else {
            this.f21661h = q.ICON;
        }
        this.dataChannel.a((m) this, ba.class, (b) new b(this)).b((m) this, com.bytedance.android.live.gift.d.class, (b) new c(this));
        if (TextUtils.isEmpty(LiveTurntableUrlSetting.INSTANCE.getValue())) {
            ((IGiftService) a.a(IGiftService.class)).onTurnTableUrlEmpty("The value in LiveConfigSettingKeys is empty");
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof List)) {
            this.f21656c = (List) objArr[0];
        }
        o.RIGHT.createHolder(this.dataChannel, this.f21657d, this.f21656c, this.f21661h);
        if (this.context != null && !this.f21658e && this.contentView != null && (this.contentView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.contentView.getLayoutParams();
            if (this.f21659f || !com.bytedance.android.live.uikit.c.a.a(this.context)) {
                marginLayoutParams.rightMargin = f21654a;
                if (this.f21660g) {
                    i2 = f21655b;
                }
                marginLayoutParams.leftMargin = i2;
            } else {
                marginLayoutParams.leftMargin = f21654a;
                if (this.f21660g) {
                    i2 = f21655b;
                }
                marginLayoutParams.rightMargin = i2;
            }
            this.contentView.setLayoutParams(marginLayoutParams);
        }
    }
}
