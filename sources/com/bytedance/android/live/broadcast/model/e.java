package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class e {
    @c(a = "enable_live_audio")

    /* renamed from: a  reason: collision with root package name */
    public boolean f7901a;
    @c(a = "enable_live_third_party")

    /* renamed from: b  reason: collision with root package name */
    public boolean f7902b;
    @c(a = "enable_live_screenshot")

    /* renamed from: c  reason: collision with root package name */
    public boolean f7903c;
    @c(a = "toast")

    /* renamed from: d  reason: collision with root package name */
    public a f7904d;

    public static class a {
        @c(a = "new_anchor")

        /* renamed from: a  reason: collision with root package name */
        public boolean f7905a;

        static {
            Covode.recordClassIndex(3917);
        }
    }

    static {
        Covode.recordClassIndex(3916);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f7901a == eVar.f7901a && this.f7902b == eVar.f7902b && this.f7903c == eVar.f7903c) {
                return true;
            }
            return false;
        }
        return false;
    }
}
