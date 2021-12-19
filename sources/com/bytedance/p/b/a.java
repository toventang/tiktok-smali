package com.bytedance.p.b;

import com.bytedance.covode.number.Covode;

public final class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    public String f41748a;

    /* renamed from: b  reason: collision with root package name */
    public long f41749b;

    static {
        Covode.recordClassIndex(25546);
    }

    public final String toString() {
        return "AnrEntry{stack='" + this.f41748a + '\'' + " stackCost=" + this.f41749b + '}';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(a aVar) {
        long j2 = this.f41749b;
        long j3 = aVar.f41749b;
        if (j2 > j3) {
            return -1;
        }
        if (j2 < j3) {
            return 1;
        }
        return 0;
    }

    public a(String str, long j2) {
        this.f41748a = str;
        this.f41749b = j2;
    }
}
