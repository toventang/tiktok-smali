package com.ss.android.ugc.aweme.contentlanguage.api;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.setting.serverpush.a.a> f78157a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.setting.serverpush.a.a> f78158b;

    static {
        Covode.recordClassIndex(48461);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f78157a, aVar.f78157a) && l.a(this.f78158b, aVar.f78158b);
    }

    public final int hashCode() {
        List<com.ss.android.ugc.aweme.setting.serverpush.a.a> list = this.f78157a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<com.ss.android.ugc.aweme.setting.serverpush.a.a> list2 = this.f78158b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ContentLanguageResult(selected=" + this.f78157a + ", unselect=" + this.f78158b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> list, List<? extends com.ss.android.ugc.aweme.setting.serverpush.a.a> list2) {
        this.f78157a = list;
        this.f78158b = list2;
    }
}
