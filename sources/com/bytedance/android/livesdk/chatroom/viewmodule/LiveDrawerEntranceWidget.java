package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import androidx.core.content.b;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.s;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.android.livesdk.chatroom.d;
import com.bytedance.android.livesdk.chatroom.g.k;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.j.cl;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtFeedDrawerShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtForyouEntranceShowMoreLiveSetting;
import com.bytedance.android.livesdk.widget.roundcorner.RoundCornerFrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.TimeZone;
import org.json.JSONObject;

public class LiveDrawerEntranceWidget extends RoomRecycleWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private RoundCornerFrameLayout f16317a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f16318b;

    /* renamed from: c  reason: collision with root package name */
    private HSImageView f16319c;

    /* renamed from: d  reason: collision with root package name */
    private View f16320d;

    static {
        Covode.recordClassIndex(9030);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b5g;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public boolean shouldAttach() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.dataChannel == null) {
            return false;
        }
        if (!LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (!k.a(this.dataChannel) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            if (!k.b(this.dataChannel) || !LiveMtForyouEntranceShowMoreLiveSetting.INSTANCE.getValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!k.c(this.dataChannel) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                return true;
            }
            return false;
        } else if (!((Boolean) this.dataChannel.b(cl.class)).booleanValue() || LiveDrawerSettings.INSTANCE.getValue().getEnableDrawerRepeatJump()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f16318b = (ImageView) getView().findViewById(R.id.ax7);
        if (s.b(this.dataChannel)) {
            this.f16318b.setImageDrawable(b.a(getContext(), 2131234344));
        }
        this.f16317a = (RoundCornerFrameLayout) getView().findViewById(R.id.ax2);
        this.f16320d = getView().findViewById(R.id.ax5);
        int a2 = y.a(8.0f);
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            a2 = y.a(2.0f);
        }
        if (a.a(getContext())) {
            this.f16317a.setBackground(getContext().getResources().getDrawable(R.drawable.bo6));
            this.f16320d.setPadding(0, 0, a2, 0);
        } else {
            this.f16317a.setBackground(getContext().getResources().getDrawable(R.drawable.bo5));
            this.f16320d.setPadding(a2, 0, 0, 0);
        }
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", 0L);
        com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", "load drawer widget");
        com.bytedance.android.live.core.d.a.a(jSONObject, "enter_method", d.a().c());
        c.a("ttlive_audience_room_with_drawer", 0, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b2  */
    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoad(java.lang.Object[] r13) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget.onLoad(java.lang.Object[]):void");
    }

    private static long a(long j2, TimeZone timeZone) {
        return (((long) timeZone.getOffset(j2)) + j2) / 86400000;
    }
}
