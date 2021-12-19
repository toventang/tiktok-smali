package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final IMUser f100588a;

    /* renamed from: b  reason: collision with root package name */
    public final int f100589b;

    static {
        Covode.recordClassIndex(64343);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f100588a, bVar.f100588a) && this.f100589b == bVar.f100589b;
    }

    public final int hashCode() {
        IMUser iMUser = this.f100588a;
        return ((iMUser != null ? iMUser.hashCode() : 0) * 31) + this.f100589b;
    }

    public final String toString() {
        return "GroupGreetingItem(user=" + this.f100588a + ", count=" + this.f100589b + ")";
    }

    public /* synthetic */ b(IMUser iMUser) {
        this(iMUser, 0);
    }

    public b(IMUser iMUser, int i2) {
        this.f100588a = iMUser;
        this.f100589b = i2;
    }
}
