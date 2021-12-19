package com.bytedance.android.livesdk.function;

import android.content.DialogInterface;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.ae;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.j.dv;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import org.json.JSONObject;

public final class StreamInfoWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    LiveTextView f17777a;

    /* renamed from: b  reason: collision with root package name */
    Object f17778b;

    static {
        Covode.recordClassIndex(9864);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.be8;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        hide();
        LiveTextView liveTextView = this.f17777a;
        if (liveTextView == null) {
            l.a("streamInfoTv");
        }
        liveTextView.setText("");
        this.f17778b = null;
    }

    static final class a extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ StreamInfoWidget this$0;

        static {
            Covode.recordClassIndex(9865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StreamInfoWidget streamInfoWidget) {
            super(1);
            this.this$0 = streamInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            StreamInfoWidget streamInfoWidget = this.this$0;
            streamInfoWidget.show();
            LiveTextView liveTextView = streamInfoWidget.f17777a;
            if (liveTextView == null) {
                l.a("streamInfoTv");
            }
            liveTextView.setText(str2);
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<q, z> {
        final /* synthetic */ StreamInfoWidget this$0;

        static {
            Covode.recordClassIndex(9866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StreamInfoWidget streamInfoWidget) {
            super(1);
            this.this$0 = streamInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(q qVar) {
            q qVar2 = qVar;
            l.d(qVar2, "");
            if (qVar2.f15140a == 8) {
                this.this$0.hide();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.ecm);
        l.b(findViewById, "");
        this.f17777a = (LiveTextView) findViewById;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StreamInfoWidget f17779a;

        static {
            Covode.recordClassIndex(9868);
        }

        d(StreamInfoWidget streamInfoWidget) {
            this.f17779a = streamInfoWidget;
        }

        public final void onClick(View view) {
            JSONObject jSONObject;
            StreamInfoWidget streamInfoWidget = this.f17779a;
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            l.b(a2, "");
            k a3 = ((com.bytedance.android.live.i.a.d) a2).getLivePlayControllerManager().a();
            StringBuilder sb = new StringBuilder();
            StringBuilder append = sb.append("duration: \n").append(String.valueOf(streamInfoWidget.f17778b)).append("\nstream info:\n");
            if (a3 != null) {
                jSONObject = a3.e();
            } else {
                jSONObject = null;
            }
            append.append(String.valueOf(jSONObject));
            b.a aVar = new b.a(streamInfoWidget.context);
            aVar.f18284a = "Stream Info";
            aVar.f18285b = sb.toString();
            aVar.o = true;
            aVar.b((CharSequence) "Confirm", (DialogInterface.OnClickListener) e.f17780a, false).a((CharSequence) "Cancel", (DialogInterface.OnClickListener) f.f17781a, false).a().show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a((m) this, ae.class, (h.f.a.b) new a(this));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.a((m) this, com.bytedance.android.live.liveinteract.api.l.class, (h.f.a.b) new b(this)).a((m) this, dv.class, (h.f.a.b) new c(this));
        }
        View view = getView();
        if (view != null) {
            view.setBackgroundDrawable(y.c(R.color.a6));
        }
        LiveTextView liveTextView = this.f17777a;
        if (liveTextView == null) {
            l.a("streamInfoTv");
        }
        liveTextView.setOnClickListener(new d(this));
    }

    static final class c extends h.f.b.m implements h.f.a.b<Object, z> {
        final /* synthetic */ StreamInfoWidget this$0;

        static {
            Covode.recordClassIndex(9867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(StreamInfoWidget streamInfoWidget) {
            super(1);
            this.this$0 = streamInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Object obj) {
            JSONObject jSONObject;
            JSONObject e2;
            l.d(obj, "");
            StreamInfoWidget streamInfoWidget = this.this$0;
            streamInfoWidget.show();
            streamInfoWidget.f17778b = obj;
            String valueOf = String.valueOf(obj);
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
            l.b(a2, "");
            k a3 = ((com.bytedance.android.live.i.a.d) a2).getLivePlayControllerManager().a();
            if (a3 != null) {
                jSONObject = a3.e();
            } else {
                jSONObject = null;
            }
            com.bytedance.android.live.core.c.a.a(4, "RoomPlayerTag", String.valueOf(jSONObject));
            if (!(a3 == null || (e2 = a3.e()) == null)) {
                String str = valueOf + "\nCodec_Type:" + e2.optString("Codec_Type:") + "\nCodec_Name:" + e2.optString("Codec_Name:") + "\nfirst_frame_time:" + e2.optInt("first_frame_time:") + "\ndns_ip:" + e2.optString("dns_ip:") + "\nresolution:" + e2.optString("resolution:") + " \nurl:" + e2.optString("url:") + "\n            ";
                LiveTextView liveTextView = streamInfoWidget.f17777a;
                if (liveTextView == null) {
                    l.a("streamInfoTv");
                }
                liveTextView.setText(str);
            }
            return z.f158842a;
        }
    }

    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f17780a = new e();

        static {
            Covode.recordClassIndex(9869);
        }

        e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f17781a = new f();

        static {
            Covode.recordClassIndex(9870);
        }

        f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }
}
