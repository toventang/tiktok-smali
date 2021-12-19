package com.bytedance.sdk.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.h.a.i;

public abstract class e<T extends d<K>, K extends i> extends c<T> {
    static {
        Covode.recordClassIndex(26468);
    }

    /* renamed from: a */
    public abstract void e(T t);

    public abstract void a(T t, int i2);

    @Override // com.bytedance.sdk.a.c
    public final /* bridge */ /* synthetic */ String d(b bVar) {
        d dVar = (d) bVar;
        if (dVar == null || dVar.f43081j == null) {
            return null;
        }
        return dVar.f43081j.f43282k;
    }

    @Override // com.bytedance.sdk.a.c
    public final /* bridge */ /* synthetic */ boolean b(b bVar) {
        d dVar = (d) bVar;
        if (!(dVar == null || dVar.f43081j == null)) {
            T t = dVar.f43081j;
            if (t.f43279h <= 1100 || t.f43279h >= 1199) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.a.c
    public final /* synthetic */ boolean c(b bVar) {
        d dVar = (d) bVar;
        if (!(dVar == null || dVar.f43081j == null)) {
            T t = dVar.f43081j;
            if ((t.f43279h == 1101 || t.f43279h == 1102 || t.f43279h == 1103) && !TextUtils.isEmpty(t.f43282k)) {
                return true;
            }
        }
        return false;
    }
}
