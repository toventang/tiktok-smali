package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a;
import com.ss.android.vesdk.r;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f128794a;

    /* renamed from: b  reason: collision with root package name */
    private final long f128795b;

    /* renamed from: c  reason: collision with root package name */
    private final String f128796c;

    /* renamed from: d  reason: collision with root package name */
    private final g f128797d;

    /* renamed from: e  reason: collision with root package name */
    private final a f128798e;

    static {
        Covode.recordClassIndex(84499);
    }

    d(c cVar, long j2, String str, g gVar, a aVar) {
        this.f128794a = cVar;
        this.f128795b = j2;
        this.f128796c = str;
        this.f128797d = gVar;
        this.f128798e = aVar;
    }

    @Override // com.ss.android.vesdk.r
    public final void onCallback(int i2, int i3, float f2, String str) {
        c cVar = this.f128794a;
        String str2 = this.f128796c;
        g gVar = this.f128797d;
        a aVar = this.f128798e;
        if (i2 == 4101 && !cVar.n) {
            cVar.n = true;
            i.b(new e(cVar, gVar, str2), i.f4824a).a(new f(cVar, aVar), i.f4826c, null);
        }
    }
}
