package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Map;

final /* synthetic */ class bd implements bl {

    /* renamed from: a  reason: collision with root package name */
    private final bm f52867a;

    /* renamed from: b  reason: collision with root package name */
    private final String f52868b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52869c;

    /* renamed from: d  reason: collision with root package name */
    private final long f52870d;

    static {
        Covode.recordClassIndex(32696);
    }

    bd(bm bmVar, String str, int i2, long j2) {
        this.f52867a = bmVar;
        this.f52868b = str;
        this.f52869c = i2;
        this.f52870d = j2;
    }

    @Override // com.google.android.play.core.assetpacks.bl
    public final Object a() {
        bm bmVar = this.f52867a;
        String str = this.f52868b;
        int i2 = this.f52869c;
        long j2 = this.f52870d;
        bj bjVar = (bj) ((Map) bmVar.a(new be(bmVar, Arrays.asList(str)))).get(str);
        if (bjVar == null || bw.b(bjVar.f52885c.f52880c)) {
            bm.f52892a.b(a.a("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        bmVar.f52893b.g(str, i2, j2);
        bjVar.f52885c.f52880c = 4;
        return null;
    }
}
