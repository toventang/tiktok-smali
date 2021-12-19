package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public DataChannel f16420a;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f16421b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f16422c;

    static {
        Covode.recordClassIndex(9076);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
    }

    public final void c() {
        String str;
        DataChannel dataChannel = this.f16420a;
        if (dataChannel == null) {
            l.a("dataChannel");
        }
        dataChannel.c(com.bytedance.android.live.j.class, new ap());
        DataChannel dataChannel2 = this.f16420a;
        if (dataChannel2 == null) {
            l.a("dataChannel");
        }
        Object b2 = dataChannel2.b(bx.class);
        if (b2 == null) {
            b2 = i.VIDEO;
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_anchor_comment_click").a();
        if (b2 == i.VIDEO) {
            str = "video_live";
        } else {
            str = "third_party";
        }
        a2.a(str).b();
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16424a = new b();

        static {
            Covode.recordClassIndex(9078);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ao.a(y.e(), (int) R.string.e8a);
        }
    }

    public j(Context context) {
        l.d(context, "");
        this.f16422c = context;
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f16423a;

        static {
            Covode.recordClassIndex(9077);
        }

        a(j jVar) {
            this.f16423a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((com.bytedance.android.live.network.response.d) obj).statusCode == 0) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_set_comment_status");
                DataChannel dataChannel = this.f16423a.f16420a;
                if (dataChannel == null) {
                    l.a("dataChannel");
                }
                a2.a(dataChannel).a("status", "open").a("situation", "comment_popup").b();
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bR;
                l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.b(true));
                this.f16423a.c();
                return;
            }
            ao.a(y.e(), (int) R.string.e8a);
        }
    }

    public final void onClick(View view) {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bR;
        l.b(bVar, "");
        if (!bVar.a().booleanValue()) {
            if (this.f16421b == null) {
                b.a aVar = new b.a(this.f16422c);
                aVar.f18293j = true;
                this.f16421b = aVar.b(R.string.e8d).a(R.string.eca, (DialogInterface.OnClickListener) new c(this), false).b(R.string.gle, (DialogInterface.OnClickListener) d.f16426a, false).a();
            }
            Dialog dialog = this.f16421b;
            if (dialog != null) {
                p.a(dialog);
                return;
            }
            return;
        }
        c();
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16426a = new d();

        static {
            Covode.recordClassIndex(9080);
        }

        d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        l.d(view, "");
        l.d(dataChannel, "");
        this.f16420a = dataChannel;
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f16425a;

        static {
            Covode.recordClassIndex(9079);
        }

        c(j jVar) {
            this.f16425a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            j jVar = this.f16425a;
            DataChannel dataChannel = jVar.f16420a;
            if (dataChannel == null) {
                l.a("dataChannel");
            }
            Long l2 = (Long) dataChannel.b(di.class);
            if (l2 != null) {
                ((RoomSwitchApi) e.a().a(RoomSwitchApi.class)).updateSwitch(l2.longValue(), 3, true).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a(jVar), b.f16424a);
            }
        }
    }
}
