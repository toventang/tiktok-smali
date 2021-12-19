package com.ss.android.ugc.aweme.childhook;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class d {
    @c(a = "LaunchActivity")

    /* renamed from: a  reason: collision with root package name */
    public final String f70252a;
    @c(a = "Activity")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f70253b;
    @c(a = "ContentProvider")

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f70254c;
    @c(a = "BroadcastReceiver")

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f70255d;

    static {
        Covode.recordClassIndex(43343);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f70252a, dVar.f70252a) && l.a(this.f70253b, dVar.f70253b) && l.a(this.f70254c, dVar.f70254c) && l.a(this.f70255d, dVar.f70255d);
    }

    public final int hashCode() {
        String str = this.f70252a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f70253b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f70254c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f70255d;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MajorComponentsAllowList(launchActivity=" + this.f70252a + ", activities=" + this.f70253b + ", contentProviders=" + this.f70254c + ", broadcastReceivers=" + this.f70255d + ")";
    }

    private /* synthetic */ d() {
        this("", z.INSTANCE, z.INSTANCE, z.INSTANCE);
    }

    private d(String str, List<String> list, List<String> list2, List<String> list3) {
        l.d(str, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        this.f70252a = str;
        this.f70253b = list;
        this.f70254c = list2;
        this.f70255d = list3;
    }
}
