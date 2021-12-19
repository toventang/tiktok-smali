package com.bytedance.android.live.broadcast.preview.c.a;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.c.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.i;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAndCoHostAddAgeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class f implements com.bytedance.android.live.broadcast.preview.c.a {

    /* renamed from: a  reason: collision with root package name */
    public final User f8153a;

    static {
        Covode.recordClassIndex(4078);
    }

    public f() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        com.bytedance.android.live.base.model.user.b a2 = b2.a();
        Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
        this.f8153a = (User) a2;
    }

    @Override // com.bytedance.android.live.broadcast.preview.c.a
    public final boolean a(a.C0122a aVar) {
        l.d(aVar, "");
        Context context = aVar.f8150a;
        i iVar = new i();
        boolean b2 = i.b(context, "saved_uid_start", this.f8153a.getId());
        if (!LiveLowAgeCountrySetting.INSTANCE.getValue() || UserWithAgeSetting.INSTANCE.getValue() || b2 || LiveHostAndCoHostAddAgeSetting.INSTANCE.getValue() != 0) {
            return false;
        }
        b.a aVar2 = new b.a(context);
        aVar2.f18284a = y.a((int) R.string.e7m, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        aVar2.f18285b = y.a((int) R.string.e7k);
        b.a b3 = aVar2.a((CharSequence) y.a((int) R.string.e7l), (DialogInterface.OnClickListener) new a(this, aVar, iVar, context), false).b((CharSequence) y.a((int) R.string.e7j), (DialogInterface.OnClickListener) new b(this, aVar), false);
        b3.f18296m = false;
        b3.a().show();
        b.a.a("livesdk_live_age_popup_show").a(aVar.f8151b).b("live").d("start_broadcast").c("show").b();
        return true;
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f8158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C0122a f8159b;

        static {
            Covode.recordClassIndex(4080);
        }

        b(f fVar, a.C0122a aVar) {
            this.f8158a = fVar;
            this.f8159b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            f.a("cancel", this.f8159b.f8151b);
            dialogInterface.dismiss();
        }
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f8154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C0122a f8155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f8156c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f8157d;

        static {
            Covode.recordClassIndex(4079);
        }

        a(f fVar, a.C0122a aVar, i iVar, Context context) {
            this.f8154a = fVar;
            this.f8155b = aVar;
            this.f8156c = iVar;
            this.f8157d = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            f.a("continue", this.f8155b.f8151b);
            i.a(this.f8157d, "saved_uid_start", this.f8154a.f8153a.getId());
            this.f8155b.f8152c.invoke();
        }
    }

    public static void a(String str, DataChannel dataChannel) {
        b.a.a("livesdk_live_age_popup_click").a(dataChannel).b("live").d("start_broadcast").c("click").a("click_icon", str).b();
    }
}
