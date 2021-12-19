package com.ss.android.ugc.tiktok.seclink.impl.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class d {
    @c(a = "seclink_white_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f149011a;

    static {
        Covode.recordClassIndex(98148);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f149011a, ((d) obj).f149011a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f149011a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SecLinkLocalConfig(whiteList=" + this.f149011a + ")";
    }

    public /* synthetic */ d() {
        this(n.c(".tiktok.com", ".whatsapp.com", ".twitter.com", ".twitch.com", ".youtube.com", ".amazon.com", ".google.com", ".snapchat.com", ".sgsnssdk.com"));
    }

    private d(List<String> list) {
        l.d(list, "");
        this.f149011a = list;
    }
}
