package com.google.android.play.core.e.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.e.z;
import java.util.List;

/* access modifiers changed from: package-private */
public final class j implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f53303a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f53304b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f53305c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f53306d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List f53307e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a f53308f;

    static {
        Covode.recordClassIndex(32927);
    }

    j(a aVar, List list, List list2, long j2, boolean z, List list3) {
        this.f53308f = aVar;
        this.f53303a = list;
        this.f53304b = list2;
        this.f53305c = j2;
        this.f53306d = z;
        this.f53307e = list3;
    }

    @Override // com.google.android.play.core.e.z
    public final void a() {
        this.f53308f.f53270f.addAll(this.f53303a);
        this.f53308f.f53271g.addAll(this.f53304b);
        this.f53308f.a(5, 0, Long.valueOf(this.f53305c), Long.valueOf(this.f53305c), null, null, null);
    }

    @Override // com.google.android.play.core.e.z
    public final void b() {
        if (!this.f53306d) {
            this.f53308f.a(this.f53307e, this.f53303a, this.f53304b, this.f53305c, true);
        }
    }

    @Override // com.google.android.play.core.e.z
    public final void a(int i2) {
        this.f53308f.c(i2);
    }
}
