package com.bytedance.android.livesdk.share;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.eh;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import f.a.b.a;
import h.f.a.b;

public class LiveShareWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    boolean f21438a;

    /* renamed from: b  reason: collision with root package name */
    public Room f21439b;

    /* renamed from: c  reason: collision with root package name */
    User f21440c;

    /* renamed from: d  reason: collision with root package name */
    private final a f21441d = new a();

    static {
        Covode.recordClassIndex(12623);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f21441d.a();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.f21438a = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f21439b = (Room) this.dataChannel.b(df.class);
        this.f21440c = (User) this.dataChannel.b(dn.class);
        this.dataChannel.a((m) this, eh.class, (b) new a(this));
    }
}
