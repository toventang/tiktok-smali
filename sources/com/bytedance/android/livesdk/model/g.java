package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Objects;

public class g {
    @c(a = "custom_verify")

    /* renamed from: a  reason: collision with root package name */
    public String f19065a;
    @c(a = "enterprise_verify_reason")

    /* renamed from: b  reason: collision with root package name */
    public String f19066b;
    @c(a = "authentication_badge")

    /* renamed from: c  reason: collision with root package name */
    public ImageModel f19067c;

    static {
        Covode.recordClassIndex(11378);
    }

    public int hashCode() {
        return Objects.hash(this.f19065a, this.f19066b, this.f19067c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!Objects.equals(this.f19065a, gVar.f19065a) || !Objects.equals(this.f19066b, gVar.f19066b) || !Objects.equals(this.f19067c, gVar.f19067c)) {
            return false;
        }
        return true;
    }
}
