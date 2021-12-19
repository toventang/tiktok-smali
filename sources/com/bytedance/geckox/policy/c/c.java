package com.bytedance.geckox.policy.c;

import com.bytedance.covode.number.Covode;

public abstract class c implements Comparable<c>, Runnable {

    /* renamed from: e  reason: collision with root package name */
    public int f29963e;

    /* renamed from: f  reason: collision with root package name */
    public String f29964f;

    static {
        Covode.recordClassIndex(17393);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(c cVar) {
        int i2 = this.f29963e;
        int i3 = cVar.f29963e;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return 0;
    }

    public c(int i2, String str) {
        this.f29963e = i2;
        this.f29964f = str;
    }
}
