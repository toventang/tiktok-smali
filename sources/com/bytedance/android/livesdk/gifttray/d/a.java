package com.bytedance.android.livesdk.gifttray.d;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPerformanceSettings;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18075a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(10022);
    }

    public static void a(com.bytedance.android.livesdk.gifttray.a.a aVar) {
        String str;
        if (LiveGiftPerformanceSettings.INSTANCE.useNewQueue()) {
            str = "1";
        } else {
            str = "0";
        }
        aVar.b(str);
    }

    public static com.bytedance.android.livesdk.gifttray.a.a a(y yVar, long j2) {
        String str;
        String str2;
        l.d(yVar, "");
        com.bytedance.android.livesdk.gifttray.a.a aVar = new com.bytedance.android.livesdk.gifttray.a.a(yVar);
        u findGiftById = GiftManager.inst().findGiftById(yVar.f19707i);
        if (findGiftById == null || (str = findGiftById.f19760c) == null) {
            str = "";
        }
        int i2 = 0;
        if (yVar.f19706h != null) {
            User user = yVar.f19706h;
            l.b(user, "");
            if (user.getId() > 0) {
                User user2 = yVar.f19706h;
                l.b(user2, "");
                if (user2.getId() != j2) {
                    str = com.bytedance.android.live.core.f.y.a((int) R.string.goi, g.a(yVar.f19706h));
                    l.b(str, "");
                }
            }
        }
        aVar.a(b.d(aVar));
        User user3 = yVar.f19705g;
        if (user3 != null) {
            str2 = user3.displayId;
        } else {
            str2 = null;
        }
        aVar.v = str2;
        aVar.A = yVar.s;
        aVar.f17997d = yVar.n;
        aVar.a((CharSequence) str);
        int i3 = yVar.n;
        u uVar = yVar.t;
        if (uVar != null) {
            i2 = uVar.f19763f;
        }
        aVar.f17995b = i3 * i2;
        aVar.f18006m = com.bytedance.android.livesdk.utils.a.a.a();
        a(aVar);
        return aVar;
    }
}
