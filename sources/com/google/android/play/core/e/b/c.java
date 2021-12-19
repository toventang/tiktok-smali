package com.google.android.play.core.e.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.f;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f53279a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53280b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53281c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f53282d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f53283e;

    /* renamed from: f  reason: collision with root package name */
    private final List f53284f;

    /* renamed from: g  reason: collision with root package name */
    private final List f53285g;

    static {
        Covode.recordClassIndex(32920);
    }

    c(Integer num, int i2, int i3, Long l2, Long l3, List list, List list2) {
        this.f53279a = num;
        this.f53280b = i2;
        this.f53281c = i3;
        this.f53282d = l2;
        this.f53283e = l3;
        this.f53284f = list;
        this.f53285g = list2;
    }

    @Override // com.google.android.play.core.e.b.k
    public final f a(f fVar) {
        Integer num = this.f53279a;
        int i2 = this.f53280b;
        int i3 = this.f53281c;
        Long l2 = this.f53282d;
        Long l3 = this.f53283e;
        List<String> list = this.f53284f;
        List<String> list2 = this.f53285g;
        if (fVar == null) {
            fVar = f.a(0, 0, 0, 0, 0, new ArrayList(), new ArrayList());
        }
        int a2 = num == null ? fVar.a() : num.intValue();
        long d2 = l2 == null ? fVar.d() : l2.longValue();
        long e2 = l3 == null ? fVar.e() : l3.longValue();
        if (list == null) {
            list = fVar.f();
        }
        if (list2 == null) {
            list2 = fVar.g();
        }
        return f.a(a2, i2, i3, d2, e2, list, list2);
    }
}
