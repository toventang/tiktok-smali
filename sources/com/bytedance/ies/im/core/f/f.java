package com.bytedance.ies.im.core.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.utils.k;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private Keva f34145a;

    static {
        Covode.recordClassIndex(20335);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final void a() {
        this.f34145a.clear();
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final int a(String str) {
        l.d(str, "");
        return this.f34145a.getInt(str, 0);
    }

    public f(String str) {
        l.d(str, "");
        d a2 = d.a();
        l.b(a2, "");
        Keva repoFromSp = Keva.getRepoFromSp(a2.f37561a, str, 0);
        l.b(repoFromSp, "");
        this.f34145a = repoFromSp;
        com.bytedance.im.core.c.f.b("imsdk", "SDKSP constructor, spName:".concat(String.valueOf(str)), (Throwable) null);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final boolean b(String str) {
        l.d(str, "");
        return this.f34145a.getBoolean(str, false);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final /* synthetic */ long b(String str, Long l2) {
        long longValue = l2.longValue();
        l.d(str, "");
        return this.f34145a.getLong(str, longValue);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final void a(String str, int i2) {
        l.d(str, "");
        this.f34145a.storeInt(str, i2);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final /* synthetic */ Float b(String str, Float f2) {
        float floatValue = f2.floatValue();
        l.d(str, "");
        return Float.valueOf(this.f34145a.getFloat(str, floatValue));
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final /* synthetic */ void a(String str, Float f2) {
        float floatValue = f2.floatValue();
        l.d(str, "");
        this.f34145a.storeFloat(str, floatValue);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final String b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        String string = this.f34145a.getString(str, str2);
        l.b(string, "");
        return string;
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final /* synthetic */ void a(String str, Long l2) {
        long longValue = l2.longValue();
        l.d(str, "");
        this.f34145a.storeLong(str, longValue);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f34145a.storeString(str, str2);
    }

    @Override // com.bytedance.im.core.internal.utils.k
    public final void a(String str, boolean z) {
        l.d(str, "");
        this.f34145a.storeBoolean(str, z);
    }
}
