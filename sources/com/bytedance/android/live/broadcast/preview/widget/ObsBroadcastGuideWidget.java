package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.ab;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBroadcastGuideStrategySetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class ObsBroadcastGuideWidget extends LiveWidget implements au {
    static {
        Covode.recordClassIndex(4240);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b((m) this, x.class, (b) new a(this));
        }
        if (LiveObsBroadcastGuideStrategySetting.INSTANCE.getValue() == 2) {
            ((ImageView) findViewById(R.id.dwj)).setImageResource(R.drawable.c97);
            View findViewById = findViewById(R.id.dwh);
            l.b(findViewById, "");
            ((LiveTextView) findViewById).setText(y.a((int) R.string.e_1));
            View findViewById2 = findViewById(R.id.dwi);
            l.b(findViewById2, "");
            ((LiveTextView) findViewById2).setText(y.a((int) R.string.e_0));
            View findViewById3 = findViewById(R.id.ekl);
            l.b(findViewById3, "");
            ((LiveTextView) findViewById3).setText(y.a((int) R.string.e_8));
        }
    }

    static final class a extends h.f.b.m implements b<com.bytedance.android.livesdkapi.depend.model.live.i, z> {
        final /* synthetic */ ObsBroadcastGuideWidget this$0;

        static {
            Covode.recordClassIndex(4241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ObsBroadcastGuideWidget obsBroadcastGuideWidget) {
            super(1);
            this.this$0 = obsBroadcastGuideWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            DataChannel dataChannel;
            l.d(iVar, "");
            if (iVar == com.bytedance.android.livesdkapi.depend.model.live.i.THIRD_PARTY && ((dataChannel = this.this$0.dataChannel) == null || dataChannel.b(ab.class) == null)) {
                this.this$0.show();
            } else {
                this.this$0.hide();
            }
            return z.f158842a;
        }
    }
}
