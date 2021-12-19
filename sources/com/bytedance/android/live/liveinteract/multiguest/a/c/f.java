package com.bytedance.android.live.liveinteract.multiguest.a.c;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguest.a.b.b;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.f.h;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public d f11105a;

    /* renamed from: b  reason: collision with root package name */
    public a f11106b;

    /* renamed from: c  reason: collision with root package name */
    public List<b.a> f11107c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Room f11108d;

    /* renamed from: e  reason: collision with root package name */
    private final d.a f11109e = new d.a() {
        /* class com.bytedance.android.live.liveinteract.multiguest.a.c.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(5969);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a() {
            for (b.a aVar : f.this.f11107c) {
                e a2 = f.this.f11105a.a(aVar.c(), aVar.b());
                if (a2 != null) {
                    aVar.a(a2);
                }
            }
            f.this.f11106b.a();
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a(long j2, long j3) {
            if (j2 > 0) {
                for (b.a aVar : f.this.f11107c) {
                    if (aVar.b() == j2) {
                        aVar.a(j3);
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(long r6, java.lang.String r8) {
            /*
                r5 = this;
                com.bytedance.android.live.liveinteract.multiguest.a.c.f r0 = com.bytedance.android.live.liveinteract.multiguest.a.c.f.this
                java.util.List<com.bytedance.android.live.liveinteract.multiguest.a.b.b$a> r0 = r0.f11107c
                java.util.Iterator r4 = r0.iterator()
            L_0x0008:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x0033
                java.lang.Object r3 = r4.next()
                com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r3 = (com.bytedance.android.live.liveinteract.multiguest.a.b.b.a) r3
                r1 = 0
                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
                long r1 = r3.b()
                int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x002c
            L_0x0022:
                java.lang.String r0 = r3.c()
                boolean r0 = android.text.TextUtils.equals(r0, r8)
                if (r0 == 0) goto L_0x0008
            L_0x002c:
                com.bytedance.android.live.liveinteract.multiguest.a.c.f r0 = com.bytedance.android.live.liveinteract.multiguest.a.c.f.this
                java.util.List<com.bytedance.android.live.liveinteract.multiguest.a.b.b$a> r0 = r0.f11107c
                r0.remove(r3)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.a.c.f.AnonymousClass1.a(long, java.lang.String):void");
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(5970);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(5968);
    }

    public final void a() {
        this.f11105a.a(this.f11109e);
    }

    public final void b() {
        this.f11105a.b(this.f11109e);
    }

    public final b.a a(String str) {
        b.a hVar;
        e a2 = this.f11105a.a(str, 0);
        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue() && a2 == null && g.a.f14199a.a(str) == u.a().b().c()) {
            a2 = new e();
            a2.f15722c = User.from(u.a().b().a());
            a2.f15729j = str;
        }
        Iterator<b.a> it = this.f11107c.iterator();
        while (true) {
            if (it.hasNext()) {
                hVar = it.next();
                if (TextUtils.equals(hVar.c(), str)) {
                    hVar.a(a2);
                    break;
                }
            } else {
                hVar = new h(this.f11108d, str, a2);
                Iterator<b.a> it2 = this.f11107c.iterator();
                d dVar = (d) com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("LINK_USER_INFO_CENTER");
                if (dVar != null) {
                    while (it2.hasNext()) {
                        if (dVar.b(it2.next().c()) == 0) {
                            it2.remove();
                        }
                    }
                }
                this.f11107c.add(hVar);
            }
        }
        return hVar;
    }

    public f(Room room, d dVar, a aVar) {
        this.f11108d = room;
        this.f11106b = aVar;
        this.f11105a = dVar;
    }
}
