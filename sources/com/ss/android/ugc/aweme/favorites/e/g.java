package com.ss.android.ugc.aweme.favorites.e;

import com.bytedance.covode.number.Covode;
import com.google.c.c.l;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.favorites.b.b;
import com.ss.android.ugc.aweme.utils.in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class g extends a<com.ss.android.ugc.aweme.sticker.model.g, b> {
    static {
        Covode.recordClassIndex(56920);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<com.ss.android.ugc.aweme.sticker.model.g> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((b) this.mData).f90475a;
    }

    public g() {
        b bVar = new b();
        bVar.f90475a = new ArrayList();
        bVar.a(false);
        this.mData = bVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((b) this.mData).a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a(0, 12);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a(((b) this.mData).f90476b, 10);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        boolean z2;
        b bVar = (b) obj;
        boolean z3 = false;
        if (bVar == null || com.bytedance.common.utility.collection.b.a((Collection) bVar.f90475a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = bVar;
            } else if (i2 == 4) {
                if (this.mData == null) {
                    this.mData = bVar;
                    return;
                }
                List<com.ss.android.ugc.aweme.sticker.model.g> list = ((b) this.mData).f90475a;
                List<com.ss.android.ugc.aweme.sticker.model.g> list2 = bVar.f90475a;
                List<com.ss.android.ugc.aweme.sticker.model.g> list3 = ((b) this.mData).f90475a;
                if (list3 == null || list3.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.addAll(l.a((Collection) list2, (com.google.c.a.l) new i(z2, list3)));
                ((b) this.mData).f90476b = bVar.f90476b;
                b bVar2 = (b) this.mData;
                if (bVar.a() && ((b) this.mData).a()) {
                    z3 = true;
                }
                bVar2.a(z3);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((b) this.mData).f90475a.clear();
            }
            ((b) this.mData).a(false);
        }
    }

    private void a(int i2, int i3) {
        if (!in.d()) {
            n.a().a(this.mHandler, new h(i2, i3), 0);
        }
    }
}
