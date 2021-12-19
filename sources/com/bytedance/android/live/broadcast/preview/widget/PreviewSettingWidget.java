package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.ae;
import com.bytedance.android.live.broadcast.api.BroadcastSettingApi;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.util.HashMap;

public final class PreviewSettingWidget extends PreviewToolBaseWidget implements com.bytedance.ies.xbridge.e.d, au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8393a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f8394b = com.bytedance.android.livesdkapi.m.d.a(d.f8400a);

    /* renamed from: c  reason: collision with root package name */
    private final int f8395c = R.string.gt8;

    /* renamed from: d  reason: collision with root package name */
    private final int f8396d = 2131234712;

    /* renamed from: e  reason: collision with root package name */
    private final i f8397e;

    static {
        Covode.recordClassIndex(4294);
    }

    private final com.bytedance.android.live.broadcast.preview.b.a c() {
        return (com.bytedance.android.live.broadcast.preview.b.a) this.f8394b.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4295);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return this.f8395c;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return this.f8396d;
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.broadcast.preview.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f8400a = new d();

        static {
            Covode.recordClassIndex(4298);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.broadcast.preview.b.a invoke() {
            return new com.bytedance.android.live.broadcast.preview.b.a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        com.bytedance.ies.xbridge.e.b.b("ttlive_show_setting_dialog", this);
    }

    private final void f() {
        b.a.a("livesdk_live_take_page_settings_click").a(this.dataChannel).b();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bH;
        l.b(bVar, "");
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
        e();
        if (!c().n()) {
            c().show(this.f8397e, "PreviewSettingWidget");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ((BroadcastSettingApi) e.a().a(BroadcastSettingApi.class)).fetchBroadcastSetting().a(new f()).a(new b(this), new c(this));
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bH;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            d();
        }
        com.bytedance.ies.xbridge.e.b.a("ttlive_show_setting_dialog", this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        l.d(view, "");
        f();
    }

    public PreviewSettingWidget(androidx.fragment.app.i iVar) {
        l.d(iVar, "");
        this.f8397e = iVar;
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(com.bytedance.ies.xbridge.e.c cVar) {
        l.d(cVar, "");
        if (l.a((Object) cVar.f35926a, (Object) "ttlive_show_setting_dialog")) {
            f();
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewSettingWidget f8398a;

        static {
            Covode.recordClassIndex(4296);
        }

        b(PreviewSettingWidget previewSettingWidget) {
            this.f8398a = previewSettingWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.broadcast.model.f fVar = (com.bytedance.android.live.broadcast.model.f) ((com.bytedance.android.live.network.response.d) obj).data;
            if (fVar != null) {
                DataChannel dataChannel = this.f8398a.dataChannel;
                if (dataChannel != null) {
                    dataChannel.b(com.bytedance.android.live.broadcast.c.class, fVar);
                }
                DataChannel dataChannel2 = this.f8398a.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.b(com.bytedance.android.live.broadcast.l.class, Integer.valueOf(fVar.f7906a));
                }
                DataChannel dataChannel3 = this.f8398a.dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.b(ae.class, Integer.valueOf(fVar.f7911f));
                }
            }
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewSettingWidget f8399a;

        static {
            Covode.recordClassIndex(4297);
        }

        c(PreviewSettingWidget previewSettingWidget) {
            this.f8399a = previewSettingWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "";
            l.b(th, str);
            HashMap hashMap = new HashMap();
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            hashMap.put("error_msg", str);
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                hashMap.put("error_code", Integer.valueOf(((com.bytedance.android.live.a.a.a) th).getErrorCode()));
            } else {
                hashMap.put("error_code", -1);
            }
            com.bytedance.android.live.core.d.c.a("ttlive_live_replay_faq_show_all", 1, hashMap);
            com.bytedance.android.live.core.d.c.a("ttlive_live_replay_faq_show_error", 1, hashMap);
        }
    }
}
