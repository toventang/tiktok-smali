package com.ss.android.ugc.aweme.feed.assem.report;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Locale;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final h f92403a = i.a((h.f.a.a) a.f92404a);

    public static final boolean a() {
        return ((Boolean) f92403a.getValue()).booleanValue();
    }

    static {
        Covode.recordClassIndex(58468);
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92404a = new a();

        static {
            Covode.recordClassIndex(58469);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            String str;
            String a2 = d.a();
            if (a2 != null) {
                Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
                str = a2.toUpperCase(Locale.ROOT);
                l.b(str, "");
            } else {
                str = null;
            }
            return Boolean.valueOf(l.a((Object) str, (Object) "ID"));
        }
    }
}
