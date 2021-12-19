package com.ss.android.ugc.aweme.im.sdk.share.b.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f103374a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Boolean> f103375b;

    /* renamed from: c  reason: collision with root package name */
    public final SharePackage f103376c;

    /* renamed from: d  reason: collision with root package name */
    public final List<IMContact> f103377d;

    static {
        Covode.recordClassIndex(66248);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f103374a, fVar.f103374a) && l.a(this.f103375b, fVar.f103375b) && l.a(this.f103376c, fVar.f103376c) && l.a(this.f103377d, fVar.f103377d);
    }

    public final int hashCode() {
        String str = this.f103374a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Boolean> map = this.f103375b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        SharePackage sharePackage = this.f103376c;
        int hashCode3 = (hashCode2 + (sharePackage != null ? sharePackage.hashCode() : 0)) * 31;
        List<IMContact> list = this.f103377d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ShareState(type=" + this.f103374a + ", conversationMap=" + this.f103375b + ", sharePackage=" + this.f103376c + ", list=" + this.f103377d + ")";
    }

    public f(String str, Map<String, Boolean> map, SharePackage sharePackage, List<IMContact> list) {
        l.d(str, "");
        l.d(map, "");
        l.d(sharePackage, "");
        l.d(list, "");
        this.f103374a = str;
        this.f103375b = map;
        this.f103376c = sharePackage;
        this.f103377d = list;
    }
}
