package com.ss.android.ugc.aweme.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import h.f.b.l;

public final class a {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f66440a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f66441b;
    @c(a = "anchor")

    /* renamed from: c  reason: collision with root package name */
    public final CreateAnchorInfo f66442c;
    @c(a = "can_user_remove")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f66443d;
    @c(a = "added_icon")

    /* renamed from: e  reason: collision with root package name */
    public final f f66444e;

    static {
        Covode.recordClassIndex(40835);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66440a == aVar.f66440a && l.a(this.f66441b, aVar.f66441b) && l.a(this.f66442c, aVar.f66442c) && l.a(this.f66443d, aVar.f66443d) && l.a(this.f66444e, aVar.f66444e);
    }

    public final int hashCode() {
        int i2 = this.f66440a * 31;
        String str = this.f66441b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        CreateAnchorInfo createAnchorInfo = this.f66442c;
        int hashCode2 = (hashCode + (createAnchorInfo != null ? createAnchorInfo.hashCode() : 0)) * 31;
        Boolean bool = this.f66443d;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        f fVar = this.f66444e;
        if (fVar != null) {
            i3 = fVar.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        return "AnchorAutoSelectionResponse(status=" + this.f66440a + ", statusMsg=" + this.f66441b + ", anchor=" + this.f66442c + ", canRemove=" + this.f66443d + ", addedIcon=" + this.f66444e + ")";
    }
}
