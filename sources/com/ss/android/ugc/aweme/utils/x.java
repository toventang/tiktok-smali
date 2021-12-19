package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final String f143193a;

    /* renamed from: b  reason: collision with root package name */
    public final a f143194b;

    /* renamed from: c  reason: collision with root package name */
    public final int f143195c;

    public interface a {
        static {
            Covode.recordClassIndex(93730);
        }

        String a(Aweme aweme, String str, dm dmVar);

        boolean a(Aweme aweme, String str);
    }

    static {
        Covode.recordClassIndex(93729);
    }

    public final int hashCode() {
        return (this.f143193a.hashCode() * 31) + this.f143195c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f143195c != xVar.f143195c) {
            return false;
        }
        return this.f143193a.equals(xVar.f143193a);
    }

    public x(String str, a aVar, int i2) {
        this.f143193a = str;
        this.f143194b = aVar;
        this.f143195c = i2;
    }
}
