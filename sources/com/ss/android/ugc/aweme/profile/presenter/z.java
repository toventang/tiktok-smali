package com.ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.e.c;
import java.util.List;

public final class z extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    public String f116611a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f116612b;

    static {
        Covode.recordClassIndex(75337);
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.common.e.b
    public final void c() {
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
            } else if (TextUtils.equals(this.f116611a, ((b) this.f76396h).f116543c)) {
                ((c) this.f76397i).a(((a) this.f76396h).getItems(), ((a) this.f76396h).isHasMore());
            } else {
                Object[] objArr = this.f116612b;
                if (objArr != null && objArr.length > 2 && (objArr[2] instanceof String) && TextUtils.equals((String) objArr[2], this.f116611a)) {
                    super.a(this.f116612b);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final boolean a(Object... objArr) {
        this.f116612b = objArr;
        return super.a(objArr);
    }
}
