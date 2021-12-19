package com.bytedance.android.livesdk.function;

import android.net.Uri;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.e;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.b;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

final /* synthetic */ class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f17793a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17794b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17795c;

    static {
        Covode.recordClassIndex(9877);
    }

    f(Uri uri, String str, String str2) {
        this.f17793a = uri;
        this.f17794b = str;
        this.f17795c = str2;
    }

    @Override // com.bytedance.android.livesdk.rank.api.d.a
    public final void a(ArrayList arrayList) {
        Uri uri = this.f17793a;
        String str = this.f17794b;
        String str2 = this.f17795c;
        f.a.f23366a.a().a(new Event("weekly_rank_jump_other_room", 37888, b.BussinessApiCall));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f23299c.L = "weekly_rank_notice";
        enterRoomConfig.f23299c.J = uri.getQueryParameter("enter_from_merge");
        enterRoomConfig.f23299c.ab = "click";
        enterRoomConfig.f23298b.f23310b = str;
        if (!arrayList.isEmpty()) {
            long[] jArr = new long[arrayList.size()];
            int i2 = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jArr[i2] = ((Long) it.next()).longValue();
                i2++;
            }
            enterRoomConfig.f23299c.H = jArr;
        }
        EnterRoomLinkSession.a(enterRoomConfig).a(new Event("weekly_rank_jump_to_live", 5120, b.BussinessApiCall));
        a.a().a(new e(Long.parseLong(str2), enterRoomConfig));
    }
}
