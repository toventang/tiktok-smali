package com.ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f67957a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f67958b;
    @c(a = "anchor_list")

    /* renamed from: c  reason: collision with root package name */
    public final List<AnchorPublishStruct> f67959c;
    @c(a = "register_region")

    /* renamed from: d  reason: collision with root package name */
    public final String f67960d;

    static {
        Covode.recordClassIndex(41838);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67957a == aVar.f67957a && l.a(this.f67958b, aVar.f67958b) && l.a(this.f67959c, aVar.f67959c) && l.a(this.f67960d, aVar.f67960d);
    }

    public final int hashCode() {
        int i2 = this.f67957a * 31;
        String str = this.f67958b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<AnchorPublishStruct> list = this.f67959c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f67960d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "AnchorListResp(statusCode=" + this.f67957a + ", statusMsg=" + this.f67958b + ", anchorList=" + this.f67959c + ", registerRegion=" + this.f67960d + ")";
    }
}
