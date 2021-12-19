package com.ss.android.ugc.aweme.notification.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.notification.model.LikeListModel;
import h.f.b.l;
import java.util.List;

public final class a extends c<LikeListModel, com.ss.android.ugc.aweme.common.e.c<com.ss.android.ugc.aweme.notification.bean.c>> {
    static {
        Covode.recordClassIndex(72943);
    }

    private final boolean f() {
        if (this.f76396h == null || this.f76397i == null) {
            return false;
        }
        return true;
    }

    public final int d() {
        T t;
        b bVar = this.f76396h;
        if (bVar == null || (t = bVar.mData) == null) {
            return 0;
        }
        return t.f113244e;
    }

    public final void e() {
        LikeListModel likeListModel = (LikeListModel) this.f76396h;
        if (likeListModel != null) {
            likeListModel.refresh();
        }
        b();
    }

    private boolean g() {
        T t;
        b bVar = this.f76396h;
        if (bVar == null || (t = bVar.mData) == null || t.f113240a != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        if (f()) {
            if (((LikeListModel) this.f76396h).isLoadMore) {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).aO_();
            } else {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (f()) {
            boolean z = false;
            if (((LikeListModel) this.f76396h).isLoadMore) {
                com.ss.android.ugc.aweme.common.e.c cVar = (com.ss.android.ugc.aweme.common.e.c) this.f76397i;
                b bVar = this.f76396h;
                l.b(bVar, "");
                List<com.ss.android.ugc.aweme.notification.bean.c> list = bVar.mData.f113245f;
                if (g()) {
                    b bVar2 = this.f76396h;
                    l.b(bVar2, "");
                    List<com.ss.android.ugc.aweme.notification.bean.c> list2 = bVar2.mData.f113245f;
                    if (list2 != null && !list2.isEmpty()) {
                        z = true;
                    }
                }
                cVar.b(list, z);
                return;
            }
            b bVar3 = this.f76396h;
            l.b(bVar3, "");
            List<com.ss.android.ugc.aweme.notification.bean.c> list3 = bVar3.mData.f113245f;
            if (list3 == null || list3.isEmpty()) {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).f();
                return;
            }
            b bVar4 = this.f76396h;
            l.b(bVar4, "");
            ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).a(bVar4.mData.f113245f, g());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (f()) {
            if (((LikeListModel) this.f76396h).isLoadMore) {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).c(exc);
            } else {
                ((com.ss.android.ugc.aweme.common.e.c) this.f76397i).b(exc);
            }
        }
    }
}
