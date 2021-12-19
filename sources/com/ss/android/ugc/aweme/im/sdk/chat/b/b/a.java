package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "preload_chat_scroll_count")

    /* renamed from: a  reason: collision with root package name */
    public final int f100117a = 3;
    @c(a = "preload_max_count_per_conversation")

    /* renamed from: b  reason: collision with root package name */
    public final int f100118b = 4;
    @c(a = "preload_image_monitor_switch_on")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f100119c = false;

    static {
        Covode.recordClassIndex(63818);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f100117a == aVar.f100117a && this.f100118b == aVar.f100118b && this.f100119c == aVar.f100119c;
    }

    public final int hashCode() {
        int i2 = ((this.f100117a * 31) + this.f100118b) * 31;
        boolean z = this.f100119c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "IMPreloadConfig(chatScrollCount=" + this.f100117a + ", maxCountPerConversation=" + this.f100118b + ", preloadImageMonitorSwitchOn=" + this.f100119c + ")";
    }
}
