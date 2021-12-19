package com.ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class f {
    @c(a = "operation")

    /* renamed from: a  reason: collision with root package name */
    public final int f90461a;
    @c(a = "item_archive_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f90462b;
    @c(a = "item_archive_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f90463c;
    @c(a = "item_archive_id_from")

    /* renamed from: d  reason: collision with root package name */
    public final String f90464d;
    @c(a = "item_archive_id_to")

    /* renamed from: e  reason: collision with root package name */
    public final String f90465e;
    @c(a = "add_ids")

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f90466f;
    @c(a = "remove_ids")

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f90467g;
    @c(a = "move_ids")

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f90468h;

    static {
        Covode.recordClassIndex(56784);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f90461a == fVar.f90461a && l.a(this.f90462b, fVar.f90462b) && l.a(this.f90463c, fVar.f90463c) && l.a(this.f90464d, fVar.f90464d) && l.a(this.f90465e, fVar.f90465e) && l.a(this.f90466f, fVar.f90466f) && l.a(this.f90467g, fVar.f90467g) && l.a(this.f90468h, fVar.f90468h);
    }

    public final int hashCode() {
        int i2 = this.f90461a * 31;
        String str = this.f90462b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f90463c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90464d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f90465e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f90466f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f90467g;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f90468h;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return hashCode6 + i3;
    }

    public final String toString() {
        return "CollectionManageRequest(operation=" + this.f90461a + ", collectionId=" + this.f90462b + ", collectionName=" + this.f90463c + ", moveFromCollectionId=" + this.f90464d + ", moveToCollectionId=" + this.f90465e + ", addIds=" + this.f90466f + ", removeIds=" + this.f90467g + ", moveIds=" + this.f90468h + ")";
    }

    public f(int i2, String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<String> list3) {
        this.f90461a = i2;
        this.f90462b = str;
        this.f90463c = str2;
        this.f90464d = str3;
        this.f90465e = str4;
        this.f90466f = list;
        this.f90467g = list2;
        this.f90468h = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, String str, String str2, String str3, String str4, List list, List list2, List list3, int i3) {
        this(i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : list2, (i3 & 128) == 0 ? list3 : null);
    }
}
