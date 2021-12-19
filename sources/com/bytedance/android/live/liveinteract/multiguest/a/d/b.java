package com.bytedance.android.live.liveinteract.multiguest.a.d;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.multiguest.a.d.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.i;
import com.bytedance.android.livesdk.g.e;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.android.livesdk.l.b f11117b;

    static {
        Covode.recordClassIndex(5974);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.d.a
    public final void a() {
        com.bytedance.android.livesdk.l.b bVar = this.f11117b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.d.a
    public final boolean a(a.C0211a aVar) {
        l.d(aVar, "");
        Context context = aVar.f11112a;
        f b2 = u.a().b();
        l.b(b2, "");
        long c2 = b2.c();
        i iVar = new i();
        boolean b3 = i.b(context, "saved_uid_start", c2);
        if (!LiveLowAgeCountrySetting.INSTANCE.getValue() || UserWithAgeSetting.INSTANCE.getValue() || b3 || e.f17824b) {
            return false;
        }
        b.a aVar2 = new b.a(context);
        aVar2.f18284a = y.a((int) R.string.e7m, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        aVar2.f18285b = y.a((int) R.string.e7k);
        b.a b4 = aVar2.a((CharSequence) y.a((int) R.string.e7l), (DialogInterface.OnClickListener) new a(this, iVar, context, c2, aVar), false).b((CharSequence) y.a((int) R.string.e7j), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC0212b(this, aVar), false);
        b4.f18296m = false;
        com.bytedance.android.livesdk.l.b a2 = b4.a();
        this.f11117b = a2;
        if (a2 != null) {
            a2.show();
        }
        b.a.a("livesdk_live_age_popup_show").a(aVar.f11113b).b("live_interact").d("guest_connect").c("show").b();
        return true;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.d.b$b  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC0212b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C0211a f11124b;

        static {
            Covode.recordClassIndex(5976);
        }

        DialogInterface$OnClickListenerC0212b(b bVar, a.C0211a aVar) {
            this.f11123a = bVar;
            this.f11124b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f11124b.f11115d.invoke();
            b.a("cancel", this.f11124b.f11113b);
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f11119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f11120c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f11121d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.C0211a f11122e;

        static {
            Covode.recordClassIndex(5975);
        }

        a(b bVar, i iVar, Context context, long j2, a.C0211a aVar) {
            this.f11118a = bVar;
            this.f11119b = iVar;
            this.f11120c = context;
            this.f11121d = j2;
            this.f11122e = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            i.a(this.f11120c, "saved_uid_start", this.f11121d);
            this.f11122e.f11114c.invoke();
            b.a("continue", this.f11122e.f11113b);
        }
    }

    public static void a(String str, DataChannel dataChannel) {
        b.a.a("livesdk_live_age_popup_click").a(dataChannel).b("live_interact").d("guest_connect").c("click").a("click_icon", str).b();
    }
}
