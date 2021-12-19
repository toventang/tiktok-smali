package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import java.util.Collections;
import java.util.List;

public class v {
    @c(a = "event_namespace")

    /* renamed from: a  reason: collision with root package name */
    final e f156129a;
    @c(a = "ts")

    /* renamed from: b  reason: collision with root package name */
    final String f156130b;
    @c(a = "format_version")

    /* renamed from: c  reason: collision with root package name */
    final String f156131c = "2";
    @c(a = "_category_")

    /* renamed from: d  reason: collision with root package name */
    final String f156132d;
    @c(a = "items")

    /* renamed from: e  reason: collision with root package name */
    final List<Object> f156133e;

    static {
        Covode.recordClassIndex(103701);
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = this.f156129a;
        int i6 = 0;
        if (eVar != null) {
            i2 = eVar.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        String str = this.f156130b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.f156131c;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.f156132d;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        List<Object> list = this.f156133e;
        if (list != null) {
            i6 = list.hashCode();
        }
        return i10 + i6;
    }

    public String toString() {
        return "event_namespace=" + this.f156129a + ", ts=" + this.f156130b + ", format_version=" + this.f156131c + ", _category_=" + this.f156132d + ", items=" + ("[" + TextUtils.join(", ", this.f156133e) + "]");
    }

    public static class a implements f<v> {

        /* renamed from: a  reason: collision with root package name */
        private final f f156134a;

        static {
            Covode.recordClassIndex(103702);
        }

        public a(f fVar) {
            this.f156134a = fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.twitter.sdk.android.core.internal.scribe.f
        public final /* synthetic */ byte[] a(v vVar) {
            return this.f156134a.b(vVar).getBytes("UTF-8");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        String str = this.f156132d;
        if (str == null ? vVar.f156132d != null : !str.equals(vVar.f156132d)) {
            return false;
        }
        e eVar = this.f156129a;
        if (eVar == null ? vVar.f156129a != null : !eVar.equals(vVar.f156129a)) {
            return false;
        }
        String str2 = this.f156131c;
        if (str2 == null ? vVar.f156131c != null : !str2.equals(vVar.f156131c)) {
            return false;
        }
        String str3 = this.f156130b;
        if (str3 == null ? vVar.f156130b != null : !str3.equals(vVar.f156130b)) {
            return false;
        }
        List<Object> list = this.f156133e;
        List<Object> list2 = vVar.f156133e;
        if (list == null ? list2 == null : list.equals(list2)) {
            return true;
        }
        return false;
    }

    public v(String str, e eVar, long j2, List<Object> list) {
        this.f156132d = str;
        this.f156129a = eVar;
        this.f156130b = String.valueOf(j2);
        this.f156133e = Collections.unmodifiableList(list);
    }
}
