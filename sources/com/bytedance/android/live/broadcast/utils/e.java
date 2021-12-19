package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.w;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.bt;
import com.bytedance.android.livesdk.j.bu;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventNoPenaltySetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f8637a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(4415);
    }

    private static long a() {
        Long l2 = (Long) DataChannelGlobal.f34575d.b(bu.class);
        if (l2 != null) {
            return l2.longValue();
        }
        return -1;
    }

    public static void a(long j2) {
        DataChannelGlobal.f34575d.a(bu.class, Long.valueOf(j2));
    }

    public static boolean a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        Boolean bool = (Boolean) dataChannel.b(w.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f8640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataChannel f8641b;

        static {
            Covode.recordClassIndex(4417);
        }

        b(h.f.a.a aVar, DataChannel dataChannel) {
            this.f8640a = aVar;
            this.f8641b = dataChannel;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            this.f8640a.invoke();
            e.a(this.f8641b, "cancel");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f8638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DataChannel f8639b;

        static {
            Covode.recordClassIndex(4416);
        }

        a(h.f.a.b bVar, DataChannel dataChannel) {
            this.f8638a = bVar;
            this.f8639b = dataChannel;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            this.f8638a.invoke(PrivacyCert.Builder.Companion.with("bpea-420").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            e.a(this.f8639b, "end_now");
            dialogInterface.dismiss();
        }
    }

    public static void a(DataChannel dataChannel, String str) {
        Long l2;
        User owner;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_event_end_early");
        Room room = (Room) dataChannel.b(df.class);
        Long l3 = null;
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        } else {
            l2 = null;
        }
        com.bytedance.android.livesdk.ab.b a3 = a2.a("room_id", (Number) l2).a("live_event_id", (Number) DataChannelGlobal.f34575d.b(bt.class));
        Room room2 = (Room) dataChannel.b(df.class);
        if (!(room2 == null || (owner = room2.getOwner()) == null)) {
            l3 = Long.valueOf(owner.getId());
        }
        a3.a("anchor_id", (Number) l3).a("action_type", str).b();
    }

    public static boolean a(Context context, DataChannel dataChannel, h.f.a.b<? super PrivacyCert, z> bVar, h.f.a.a<z> aVar) {
        int i2;
        l.d(context, "");
        l.d(dataChannel, "");
        l.d(bVar, "");
        l.d(aVar, "");
        if (a() <= 0 || SystemClock.elapsedRealtime() >= a() + 600000) {
            return false;
        }
        a(dataChannel, "show");
        b.a a2 = new b.a(context).a(R.string.dwa);
        if (LiveEventNoPenaltySetting.INSTANCE.getValue()) {
            i2 = R.string.e8p;
        } else {
            i2 = R.string.e8u;
        }
        a2.b(i2).a(R.string.dwc, (DialogInterface.OnClickListener) new a(bVar, dataChannel), false).b(R.string.dwb, (DialogInterface.OnClickListener) new b(aVar, dataChannel), false).a().show();
        return true;
    }
}
