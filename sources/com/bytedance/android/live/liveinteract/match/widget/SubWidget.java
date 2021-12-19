package com.bytedance.android.live.liveinteract.match.widget;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;

public abstract class SubWidget extends LiveWidget implements au {
    public Room A;
    public boolean B;
    public b z;

    static {
        Covode.recordClassIndex(5922);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        this.z = b.a.a();
        this.A = (Room) this.dataChannel.b(df.class);
        this.B = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
    }

    public SubWidget(View view) {
        this.contentView = view;
    }
}
