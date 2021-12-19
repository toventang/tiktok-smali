package com.bytedance.android.livesdk.browser.g;

import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.a.a;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.e;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14418a = new a();

    private a() {
    }

    /* renamed from: com.bytedance.android.livesdk.browser.g.a$a  reason: collision with other inner class name */
    static final class C0312a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0312a f14419a = new C0312a();

        static {
            Covode.recordClassIndex(7992);
        }

        C0312a() {
        }

        @Override // com.bytedance.ies.web.jsbridge2.e.b
        public final e<Object, Object> a() {
            return new ai();
        }
    }

    static {
        Covode.recordClassIndex(7991);
    }

    public static void a(com.bytedance.android.livesdk.browser.c.a aVar) {
        l.d(aVar, "");
        aVar.a().a("__prefetch", (e.b) C0312a.f14419a);
    }

    public static void a(String str) {
        long j2;
        String str2;
        String valueOf;
        if (str != null) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                j2 = room.getOwnerUserId();
            } else {
                j2 = 0;
            }
            if (room == null) {
                str2 = String.valueOf(j2);
            } else if (room.getOwner() != null) {
                User owner = room.getOwner();
                l.b(owner, "");
                str2 = owner.getSecUid();
            } else {
                str2 = "";
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (j2 == 0) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(j2);
            }
            buildUpon.appendQueryParameter("anchor_id", valueOf);
            buildUpon.appendQueryParameter("sec_anchor_id", str2);
            a.C0726a aVar = com.bytedance.ies.d.a.a.a.f33163g;
            String builder = buildUpon.toString();
            l.b(builder, "");
            aVar.a(builder);
        }
    }
}
