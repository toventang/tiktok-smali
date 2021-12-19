package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsHelpPageSetting;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class PreviewHelpWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8354a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final int f8355b = R.string.eal;

    /* renamed from: c  reason: collision with root package name */
    private final int f8356c = 2131234574;

    static {
        Covode.recordClassIndex(4269);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4270);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8355b;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8356c;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        com.bytedance.android.livesdkapi.depend.model.live.i iVar;
        l.d(view, "");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel.b(x.class)) != null) {
            if (j.f(iVar)) {
                d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
                Context context = getContext();
                d.a b2 = e.b("https://webcast.tiktokv.com/falcon/webcast_mt/page/screen_share_intro/index.html");
                b2.f14291b = y.a((int) R.string.eal);
                b2.f14298i = false;
                webViewManager.a(context, b2);
                return;
            }
            d webViewManager2 = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
            Context context2 = this.context;
            d.a b3 = e.b(LiveObsHelpPageSetting.INSTANCE.getValue());
            b3.f14291b = y.a((int) R.string.gsi);
            webViewManager2.a(context2, b3);
            b c2 = b.a.a("thirdparty_take_guide").a(this.dataChannel).b("live_take").c("click");
            l.d(c2, "");
            l.d("live_start", "");
            c2.a("request_page", "live_start");
            c2.b();
        }
    }
}
