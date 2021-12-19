package com.ss.android.ugc.aweme;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.d;
import com.ss.android.ugc.aweme.common.e.f;
import com.ss.android.ugc.aweme.common.e.i;
import java.util.List;

public final class ae extends c<ak, bh> implements f {

    /* renamed from: a  reason: collision with root package name */
    public d f66261a;

    /* renamed from: b  reason: collision with root package name */
    public aj f66262b;

    static {
        Covode.recordClassIndex(40709);
    }

    @Override // com.ss.android.ugc.aweme.common.e.f
    public final boolean a(i iVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void cd_() {
        super.cd_();
        this.f66261a = null;
    }

    private void d() {
        if (((ak) this.f76396h).f66354d) {
            ((bh) this.f76397i).d();
        } else {
            ((bh) this.f76397i).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        if (this.f76396h != null && this.f76397i != null) {
            int i2 = ((a) this.f76396h).mListQueryType;
            if (i2 == 1) {
                ((bh) this.f76397i).b();
            } else if (i2 == 2) {
                ((bh) this.f76397i).bh_();
            } else if (i2 == 4) {
                ((bh) this.f76397i).aO_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76396h != null && this.f76397i != null) {
            d();
            int i2 = ((a) this.f76396h).mListQueryType;
            boolean z = false;
            if (i2 == 1) {
                List<com.ss.android.ugc.aweme.api.model.a> list = ((ak) this.f76396h).f66352b;
                if (list == null || list.isEmpty()) {
                    ((bh) this.f76397i).f();
                } else {
                    ((bh) this.f76397i).a(((a) this.f76396h).getItems(), ((a) this.f76396h).isHasMore());
                }
                String str = ((ak) this.f76396h).f66355e;
                if (this.f66262b != null && !TextUtils.isEmpty(str)) {
                    this.f66262b.a(str);
                }
            } else if (i2 == 2) {
                ((bh) this.f76397i).c(((a) this.f76396h).getItems(), true ^ ((a) this.f76396h).isNewDataEmpty());
            } else if (i2 == 4) {
                bh bhVar = (bh) this.f76397i;
                List items = ((a) this.f76396h).getItems();
                if (((a) this.f76396h).isHasMore() && !((a) this.f76396h).isNewDataEmpty()) {
                    z = true;
                }
                bhVar.b(items, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.f
    public final void a(int i2) {
        d dVar = this.f66261a;
        if (dVar != null) {
            dVar.b(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76396h != null && this.f76397i != null) {
            d();
            int i2 = ((a) this.f76396h).mListQueryType;
            if (i2 == 1) {
                ((bh) this.f76397i).b(exc);
            } else if (i2 == 2) {
                ((bh) this.f76397i).a(exc);
            } else if (i2 == 4) {
                ((bh) this.f76397i).c(exc);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.f
    public final void a(List list, int i2) {
        d dVar = this.f66261a;
        if (dVar != null) {
            dVar.a(list, i2);
        }
    }
}
