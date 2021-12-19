package com.bytedance.android.live.broadcast.preview.widget;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.i;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.broadcast.z;
import com.bytedance.android.livesdk.j.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class PreviewApplyWidget extends LiveWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8327a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.l.a f8328b = ((com.bytedance.android.livesdkapi.l.a) DataChannelGlobal.f34575d.b(e.class));

    static {
        Covode.recordClassIndex(4242);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4243);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final String b() {
        Object b2 = this.dataChannel.b(x.class);
        if (b2 == null) {
            l.b();
        }
        String modeFromServer = ((com.bytedance.android.livesdkapi.depend.model.live.i) b2).getModeFromServer();
        l.b(modeFromServer, "");
        return modeFromServer;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a(x.class, (h.f.a.b) new b(this)).b(z.class, (h.f.a.b) new c(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 518
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget.a():void");
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.live.i, h.z> {
        final /* synthetic */ PreviewApplyWidget this$0;

        static {
            Covode.recordClassIndex(4244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewApplyWidget previewApplyWidget) {
            super(1);
            this.this$0 = previewApplyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdkapi.depend.model.live.i iVar) {
            l.d(iVar, "");
            this.this$0.a();
            return h.z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Map<String, ? extends i.a>, h.z> {
        final /* synthetic */ PreviewApplyWidget this$0;

        static {
            Covode.recordClassIndex(4245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewApplyWidget previewApplyWidget) {
            super(1);
            this.this$0 = previewApplyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Map<String, ? extends i.a> map) {
            l.d(map, "");
            this.this$0.a();
            return h.z.f158842a;
        }
    }
}
