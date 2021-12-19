package com.bytedance.android.livesdk.chatroom.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.android.live.n.n;
import com.bytedance.android.live.p.l;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.widget.ObsKeyCreatedPromptWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.widget.WidgetContainer;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class db extends al implements n {
    private final i n = i.THIRD_PARTY;
    private LiveWidget o;
    private HashMap p;

    static {
        Covode.recordClassIndex(8916);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final View b(int i2) {
        if (this.p == null) {
            this.p = new HashMap();
        }
        View view = (View) this.p.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final void o() {
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        o();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final i h() {
        return this.n;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final Object[] k() {
        return new Object[]{h.a.n.d(l.SLOT, l.CLOSE_ROOM, l.MORE)};
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.chatroom.ui.al
    public final void a(View view, Bundle bundle) {
        Boolean bool;
        f().load(R.id.cyg, ObsKeyCreatedPromptWidget.class);
        LiveWidget liveWidget = this.o;
        if (liveWidget != null) {
            bool = Boolean.valueOf(liveWidget.isShowing());
        } else {
            bool = null;
        }
        if (p.a(bool)) {
            b.a.a("livesdk_live_center_icon").a().f("click").b();
        }
        super.a(view, bundle);
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.ui.al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() == 2) {
            WidgetContainer widgetContainer = (WidgetContainer) b(R.id.cyg);
            h.f.b.l.b(widgetContainer, "");
            widgetContainer.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return a.a(layoutInflater, R.layout.b9r, viewGroup, false);
    }
}
