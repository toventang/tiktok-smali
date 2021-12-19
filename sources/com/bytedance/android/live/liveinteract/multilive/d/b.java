package com.bytedance.android.live.liveinteract.multilive.d;

import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.f.f;
import com.bytedance.android.live.liveinteract.multilive.c.m;
import com.bytedance.android.live.liveinteract.multilive.c.n;
import com.bytedance.android.live.liveinteract.multilive.c.o;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11777c = new a((byte) 0);
    @d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11778a;
    @d(a = "LINK_USER_INFO_CENTER")

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d f11779b;

    /* renamed from: d  reason: collision with root package name */
    private final f.a f11780d;

    static {
        Covode.recordClassIndex(6424);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6425);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ b() {
        this(null);
    }

    public final List<o> a() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11779b;
        if (dVar == null) {
            l.a("mInfoCenter");
        }
        for (e eVar : dVar.f11074b) {
            String str = eVar.f15729j;
            l.b(str, "");
            String str2 = eVar.f15729j;
            l.b(str2, "");
            int b2 = b(str2);
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11778a;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            Boolean bool = aVar.a().get(eVar.f15729j);
            if (bool == null) {
                bool = false;
            }
            l.b(bool, "");
            arrayList.add(new o(str, b2, bool.booleanValue()));
        }
        return arrayList;
    }

    public b(f.a aVar) {
        this.f11780d = aVar;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    private final int b(String str) {
        f.a aVar = this.f11780d;
        if (aVar != null) {
            return aVar.g(str);
        }
        return -1;
    }

    public final m a(String str) {
        l.d(str, "");
        m mVar = new m();
        mVar.a();
        mVar.a("onSyncVideoMuteStatus");
        n nVar = new n();
        List<o> a2 = a();
        ArrayList arrayList = new ArrayList();
        for (T t : a2) {
            if (!l.a((Object) t.f11769a, (Object) str)) {
                arrayList.add(t);
            }
        }
        nVar.f11768b.addAll(arrayList);
        mVar.f11764b = nVar;
        return mVar;
    }
}
