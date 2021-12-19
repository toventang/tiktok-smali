package com.bytedance.android.livesdk.chatroom.viewmodule.a;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.h;
import com.bytedance.android.live.liveinteract.api.b.i;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.co;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16442a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private DataChannel f16443b;

    /* renamed from: c  reason: collision with root package name */
    private int f16444c;

    static {
        Covode.recordClassIndex(9087);
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

    public static final class a {
        static {
            Covode.recordClassIndex(9088);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void c() {
        DataChannel dataChannel = this.f16443b;
        if (dataChannel != null) {
            dataChannel.b(co.class, (Object) true);
        }
        this.f16444c++;
    }

    public final boolean d() {
        String str;
        h hVar;
        DataChannel dataChannel = this.f16443b;
        if (dataChannel == null || (hVar = (h) dataChannel.b(i.class)) == null || (str = hVar.f9995a) == null) {
            str = h.f9985b;
        }
        if (!(!l.a((Object) str, (Object) h.f9985b))) {
            return false;
        }
        ao.a(y.e(), (int) R.string.dw3);
        return true;
    }

    public final void onClick(View view) {
        int i2;
        l.d(view, "");
        if (!d()) {
            if (this.f16444c == 3) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            b.a.a("livesdk_live_pause_click").a(this.f16443b).a("is_max_pause_num", i2).b();
            if (i2 != 0) {
                ao.a(y.e(), (int) R.string.dw8);
                return;
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.aT;
            l.b(bVar, "");
            Boolean a2 = bVar.a();
            l.b(a2, "");
            if (a2.booleanValue()) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.aT;
                l.b(bVar2, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                new b.a(view.getContext()).a(R.string.dw1).b(R.string.dw0).a(R.string.dvy, (DialogInterface.OnClickListener) new b(this), false).b(R.string.dvz, (DialogInterface.OnClickListener) c.f16446a, false).a().show();
                return;
            }
            c();
        }
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16446a = new c();

        static {
            Covode.recordClassIndex(9090);
        }

        c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        l.d(view, "");
        this.f16443b = dataChannel;
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f16445a;

        static {
            Covode.recordClassIndex(9089);
        }

        b(o oVar) {
            this.f16445a = oVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (!this.f16445a.d()) {
                this.f16445a.c();
            }
            dialogInterface.dismiss();
        }
    }
}
