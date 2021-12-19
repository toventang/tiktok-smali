package com.ss.android.ugc.aweme.journey.step.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.i;
import com.ss.android.ugc.aweme.journey.j;
import com.ss.android.ugc.aweme.journey.k;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final a f104973c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f104974a;

    /* renamed from: b  reason: collision with root package name */
    public final j f104975b;

    static {
        Covode.recordClassIndex(67301);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f104974a, eVar.f104974a) && l.a(this.f104975b, eVar.f104975b);
    }

    public final int hashCode() {
        List<i> list = this.f104974a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        j jVar = this.f104975b;
        if (jVar != null) {
            i2 = jVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ValidatedContentLanguageData(contentLanguages=" + this.f104974a + ", contentLanguagesDialog=" + this.f104975b + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67302);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(k kVar) {
            l.d(kVar, "");
            List<i> list = kVar.f104866a;
            j jVar = kVar.f104867b;
            if (list == null || jVar == null) {
                return null;
            }
            return new e(list, jVar);
        }
    }

    public e(List<i> list, j jVar) {
        l.d(list, "");
        l.d(jVar, "");
        this.f104974a = list;
        this.f104975b = jVar;
    }
}
