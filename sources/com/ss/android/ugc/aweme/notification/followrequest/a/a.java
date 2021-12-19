package com.ss.android.ugc.aweme.notification.followrequest.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;

public final class a extends c<com.ss.android.ugc.aweme.notification.followrequest.model.a, b> {
    static {
        Covode.recordClassIndex(72948);
    }

    private final boolean d() {
        if (this.f76396h == null || this.f76397i == null) {
            return false;
        }
        return true;
    }

    private boolean e() {
        T t;
        b bVar = this.f76396h;
        if (bVar == null || (t = bVar.mData) == null) {
            return false;
        }
        return t.hasMore;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        if (d()) {
            if (((com.ss.android.ugc.aweme.notification.followrequest.model.a) this.f76396h).f113475c) {
                ((b) this.f76397i).b(true);
            } else {
                ((b) this.f76397i).b(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        boolean z;
        if (d()) {
            b bVar = this.f76396h;
            l.b(bVar, "");
            List<User> list = bVar.mData.userRequestList;
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (((com.ss.android.ugc.aweme.notification.followrequest.model.a) this.f76396h).f113475c) {
                b bVar2 = (b) this.f76397i;
                l.b(list, "");
                if (e() && !z) {
                    z2 = true;
                }
                bVar2.a(list, true, z2);
            } else if (z) {
                ((b) this.f76397i).a();
            } else if (((com.ss.android.ugc.aweme.notification.followrequest.model.a) this.f76396h).f113476d) {
                l.b(list, "");
                b bVar3 = this.f76396h;
                l.b(bVar3, "");
                ((b) this.f76397i).a(list, bVar3.mData.total);
            } else {
                l.b(list, "");
                ((b) this.f76397i).a(list, false, e());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (d()) {
            if (((com.ss.android.ugc.aweme.notification.followrequest.model.a) this.f76396h).f113475c) {
                ((b) this.f76397i).a(true);
            } else {
                ((b) this.f76397i).a(false);
            }
        }
    }
}
