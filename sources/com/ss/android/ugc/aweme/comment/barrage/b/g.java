package com.ss.android.ugc.aweme.comment.barrage.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import h.f.b.l;

public final class g extends i {

    /* renamed from: a  reason: collision with root package name */
    public final int f71562a;

    /* renamed from: b  reason: collision with root package name */
    public final int f71563b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f71564c;

    static {
        Covode.recordClassIndex(44031);
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.i
    public final boolean b(a aVar) {
        l.d(aVar, "");
        return aVar instanceof g;
    }

    @Override // com.bytedance.ies.powerlist.b.a, com.ss.android.ugc.aweme.comment.barrage.b.i
    public final boolean a(a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof g) || ((g) aVar).f71562a != this.f71562a) {
            return false;
        }
        return true;
    }

    public g(int i2, int i3, DataCenter dataCenter) {
        this.f71562a = i2;
        this.f71563b = i3;
        this.f71564c = dataCenter;
    }
}
