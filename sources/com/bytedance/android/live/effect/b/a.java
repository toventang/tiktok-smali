package com.bytedance.android.live.effect.b;

import com.bytedance.android.live.effect.api.a.b;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<e> f9662a;

    static {
        Covode.recordClassIndex(4925);
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a(boolean z) {
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a() {
        return b();
    }

    private final int b() {
        if (this.f9662a.get() == null) {
            return -1;
        }
        return 0;
    }

    public a(e eVar) {
        this.f9662a = new WeakReference<>(eVar);
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int b(String[] strArr) {
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.b(strArr);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int c(String[] strArr) {
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.c(strArr);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a(String[] strArr) {
        l.d(strArr, "");
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.a(strArr);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a(String str, boolean z) {
        l.d(str, "");
        return b();
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int b(String[] strArr, String[] strArr2) {
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.b(strArr, strArr2);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a(String[] strArr, String[] strArr2) {
        l.d(strArr, "");
        l.d(strArr2, "");
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.a(strArr, strArr2);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.a(str, str2, f2);
        }
        return -1;
    }

    @Override // com.bytedance.android.live.effect.api.a.b
    public final int a(String str, String str2, int[] iArr) {
        l.d(str, "");
        l.d(str2, "");
        l.d(iArr, "");
        e eVar = this.f9662a.get();
        if (eVar != null) {
            return eVar.a(str, str2, iArr);
        }
        return -1;
    }
}
