package com.ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f119707a = n.b("v16.tiktokv.com", "v.tiktok.com", "vt.tiktok.com", "vm.tiktok.com");

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f119708b = n.b("tiktok.com", "tiktokv.com");

    /* renamed from: c  reason: collision with root package name */
    public static final a f119709c = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77765);
    }

    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        Iterator<T> it = f119708b.iterator();
        while (it.hasNext()) {
            if (p.a((CharSequence) str, (CharSequence) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
