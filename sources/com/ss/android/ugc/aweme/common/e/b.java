package com.ss.android.ugc.aweme.common.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.e.a;
import java.util.List;

public class b<T extends a> extends c<T, c> implements f {

    /* renamed from: k  reason: collision with root package name */
    protected d f76409k;

    static {
        Covode.recordClassIndex(47164);
    }

    @Override // com.ss.android.ugc.aweme.common.e.f
    public boolean a(i iVar) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public void cd_() {
        super.cd_();
        this.f76409k = null;
        if (this.f76396h != null) {
            ((a) this.f76396h).mListAdapter = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public void b() {
        if (this.f76396h != null && this.f76397i != null) {
            int i2 = ((a) this.f76396h).mListQueryType;
            if (i2 == 1) {
                ((c) this.f76397i).b();
            } else if (i2 == 2) {
                ((c) this.f76397i).bh_();
            } else if (i2 == 4) {
                ((c) this.f76397i).aO_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void c() {
        if (this.f76396h != null && this.f76397i != null) {
            int i2 = ((a) this.f76396h).mListQueryType;
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((c) this.f76397i).c(((a) this.f76396h).getItems(), true ^ ((a) this.f76396h).isNewDataEmpty());
                } else if (i2 == 4) {
                    c cVar = (c) this.f76397i;
                    List items = ((a) this.f76396h).getItems();
                    if (!((a) this.f76396h).isHasMore() || ((a) this.f76396h).isNewDataEmpty()) {
                        z = false;
                    }
                    cVar.b(items, z);
                }
            } else if (((a) this.f76396h).isDataEmpty()) {
                ((c) this.f76397i).f();
            } else {
                ((c) this.f76397i).a(((a) this.f76396h).getItems(), ((a) this.f76396h).isHasMore());
            }
        }
    }

    public void a(d dVar) {
        this.f76409k = dVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.f
    public void a(int i2) {
        d dVar = this.f76409k;
        if (dVar != null) {
            dVar.b(i2);
        }
    }

    public boolean a(Object obj) {
        if (this.f76396h == null || !((a) this.f76396h).deleteItem(obj)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public void a_(Exception exc) {
        if (this.f76396h != null && this.f76397i != null) {
            int i2 = ((a) this.f76396h).mListQueryType;
            if (i2 == 1) {
                ((c) this.f76397i).b(exc);
            } else if (i2 == 2) {
                ((c) this.f76397i).a(exc);
            } else if (i2 == 4) {
                ((c) this.f76397i).c(exc);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.f
    public void a(List list, int i2) {
        d dVar = this.f76409k;
        if (dVar != null) {
            dVar.a(list, i2);
        }
    }

    public boolean a(Object obj, int i2) {
        if (this.f76396h == null || !((a) this.f76396h).insertItem(obj, i2)) {
            return false;
        }
        return true;
    }
}
