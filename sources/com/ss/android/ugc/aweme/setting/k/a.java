package com.ss.android.ugc.aweme.setting.k;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.model.e;
import java.util.Collection;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.common.e.a<User, e> {

    /* renamed from: a  reason: collision with root package name */
    private int f122247a;

    /* renamed from: b  reason: collision with root package name */
    private int f122248b;

    static {
        Covode.recordClassIndex(80150);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean needCheckEmptyForQueryType() {
        return false;
    }

    public a() {
        this((byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((e) this.mData).f122319a;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((e) this.mData).f122321c) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a(0, 0, 0);
    }

    private a(byte b2) {
        this.f122248b = 0;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a(this.f122247a, ((e) this.mData).f122322d, ((e) this.mData).f122323e);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        e eVar = (e) obj;
        if (eVar == null || b.a((Collection) eVar.f122319a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i2 = this.mListQueryType;
        if (i2 == 1) {
            this.mData = eVar;
            if (!this.mIsNewDataEmpty || (eVar != null && isHasMore())) {
                this.f122247a = eVar.f122320b;
            }
        } else if (i2 == 4) {
            if (eVar != null) {
                ((e) this.mData).f122322d = eVar.f122322d;
                ((e) this.mData).f122323e = eVar.f122323e;
                ((e) this.mData).f122324f = eVar.f122324f;
            }
            if (!this.mIsNewDataEmpty || (eVar != null && isHasMore())) {
                ((e) this.mData).f122319a.addAll(eVar.f122319a);
                ((e) this.mData).f122321c = eVar.f122321c;
                this.f122247a = eVar.f122320b;
                return;
            }
            ((e) this.mData).f122321c = false;
        }
    }

    private void a(int i2, int i3, int i4) {
        n.a().a(this.mHandler, new b(this, i2, i3, i4), 0);
    }
}
