package com.bytedance.o;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Map.Entry f41718a;

    static {
        Covode.recordClassIndex(25529);
    }

    l(Map.Entry entry) {
        this.f41718a = entry;
    }

    @Override // com.bytedance.o.c
    public final Object a() {
        return this.f41718a.getValue();
    }
}
