package com.bytedance.android.livesdk.function;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.ay;
import com.bytedance.android.livesdk.chatroom.detail.j;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;

public class UserPermissionCheckWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    Room f17782a;

    /* renamed from: b  reason: collision with root package name */
    String f17783b;

    /* renamed from: c  reason: collision with root package name */
    String f17784c;

    /* renamed from: d  reason: collision with root package name */
    String f17785d;

    /* renamed from: e  reason: collision with root package name */
    private j f17786e;

    /* renamed from: f  reason: collision with root package name */
    private b f17787f;

    static {
        Covode.recordClassIndex(9871);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        b bVar = this.f17787f;
        if (bVar != null && !bVar.isDisposed()) {
            this.f17787f.dispose();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.f17782a = (Room) this.dataChannel.b(df.class);
        j jVar = (j) this.dataChannel.b(ay.class);
        this.f17786e = jVar;
        if (jVar != null) {
            this.f17783b = jVar.t;
            this.f17784c = this.f17786e.f15277h;
            this.f17785d = this.f17786e.u;
        }
        this.f17787f = u.a().b().h().b(new n(this));
    }
}
