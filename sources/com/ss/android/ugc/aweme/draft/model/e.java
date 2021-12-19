package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;

public final class e {
    @c(a = "matrix")

    /* renamed from: a  reason: collision with root package name */
    public final String[] f83203a;
    @c(a = "duration")

    /* renamed from: b  reason: collision with root package name */
    public final double[] f83204b;
    @c(a = "seg_user_cher")

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f83205c;

    static {
        Covode.recordClassIndex(51877);
    }

    public final String toString() {
        return "DraftCherEffectParam(matrix=" + Arrays.toString(this.f83203a) + ", duration=" + Arrays.toString(this.f83204b) + ", segUseCher=" + Arrays.toString(this.f83205c) + ")";
    }

    private /* synthetic */ e() {
        this(new String[0], new double[0], new boolean[0]);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f83203a) * 31) + Arrays.hashCode(this.f83204b)) * 31) + Arrays.hashCode(this.f83205c);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam");
        e eVar = (e) obj;
        if (Arrays.equals(this.f83203a, eVar.f83203a) && Arrays.equals(this.f83204b, eVar.f83204b) && Arrays.equals(this.f83205c, eVar.f83205c)) {
            return true;
        }
        return false;
    }

    public e(String[] strArr, double[] dArr, boolean[] zArr) {
        l.d(strArr, "");
        l.d(dArr, "");
        l.d(zArr, "");
        this.f83203a = strArr;
        this.f83204b = dArr;
        this.f83205c = zArr;
    }
}
