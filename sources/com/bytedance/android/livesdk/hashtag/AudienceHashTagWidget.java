package com.bytedance.android.livesdk.hashtag;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.j.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.as;
import com.bytedance.android.livesdk.j.dd;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashtagAudienceShowEntranceSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public final class AudienceHashTagWidget extends BaseHashTagWidget implements au {

    /* renamed from: d  reason: collision with root package name */
    private boolean f18113d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18114e;

    static {
        Covode.recordClassIndex(10045);
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void a(Hashtag hashtag) {
        l.d(hashtag, "");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean shouldAttach() {
        return LiveHashtagAudienceShowEntranceSetting.INSTANCE.enable();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void a() {
        b.a.a("livesdk_viewer_topic_click").a(this.dataChannel).b();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void b() {
        if (this.f18114e && !this.f18113d) {
            this.f18113d = true;
            b.a.a("livesdk_viewer_topic_show").a(this.dataChannel).b();
        }
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        attach();
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget
    public final void a(androidx.fragment.app.i iVar) {
        l.d(iVar, "");
        h hVar = new h();
        String simpleName = BaseHashTagWidget.class.getSimpleName();
        l.b(simpleName, "");
        hVar.show(iVar, simpleName);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        this.f18114e = z;
        if (!z) {
            this.f18113d = false;
        }
        if (isShowing()) {
            b();
        }
    }

    @Override // com.bytedance.android.livesdk.hashtag.BaseHashTagWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        super.onLoad(objArr);
        a aVar = (a) com.bytedance.android.live.t.a.a(a.class);
        if (aVar != null) {
            bool = Boolean.valueOf(aVar.isMicRoomForCurrentRoom());
        } else {
            bool = null;
        }
        if (l.a((Object) bool, (Object) true)) {
            this.dataChannel.a(as.class, (Object) false);
            hide();
        } else {
            this.dataChannel.a(as.class, (Object) true);
            c();
        }
        this.dataChannel.c(dd.class);
    }
}
