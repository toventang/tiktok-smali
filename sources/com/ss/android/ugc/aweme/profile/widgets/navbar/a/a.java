package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c>> f117957a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c>> f117958b;

    static {
        Covode.recordClassIndex(76460);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f117957a, aVar.f117957a) && l.a(this.f117958b, aVar.f117958b);
    }

    public final int hashCode() {
        Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c>> map = this.f117957a;
        int i2 = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c>> map2 = this.f117958b;
        if (map2 != null) {
            i2 = map2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NavActionData(hideOthersMap=" + this.f117957a + ", hiddenByOthersMap=" + this.f117958b + ")";
    }

    public /* synthetic */ a() {
        this(new LinkedHashMap(), new LinkedHashMap());
    }

    private a(Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c>> map, Map<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c, List<com.ss.android.ugc.aweme.profile.widgets.navbar.b.c>> map2) {
        l.d(map, "");
        l.d(map2, "");
        this.f117957a = map;
        this.f117958b = map2;
    }
}
