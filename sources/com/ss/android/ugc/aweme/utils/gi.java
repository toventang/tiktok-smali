package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;
import h.m.l;
import java.util.regex.PatternSyntaxException;

public final class gi {

    /* renamed from: a  reason: collision with root package name */
    static final h f143007a = i.a((h.f.a.a) e.f143016a);

    /* renamed from: b  reason: collision with root package name */
    private static final h f143008b = i.a((h.f.a.a) c.f143014a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f143009c = i.a((h.f.a.a) d.f143015a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f143010d = i.a((h.f.a.a) b.f143013a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f143011e = i.a((h.f.a.a) a.f143012a);

    static final class a extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143012a = new a();

        static {
            Covode.recordClassIndex(93591);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return gi.a("[a-zA-Z]+");
        }
    }

    static final class b extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143013a = new b();

        static {
            Covode.recordClassIndex(93592);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return gi.a("[\\x21-\\x7E]+");
        }
    }

    static final class c extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143014a = new c();

        static {
            Covode.recordClassIndex(93593);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return gi.a("[\\x00-\\x7F]+");
        }
    }

    static final class d extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f143015a = new d();

        static {
            Covode.recordClassIndex(93594);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return gi.a("[^\\x00-\\x7F]+");
        }
    }

    static final class e extends m implements h.f.a.a<l> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f143016a = new e();

        static {
            Covode.recordClassIndex(93595);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ l invoke() {
            return gi.a("\\s+");
        }
    }

    static {
        Covode.recordClassIndex(93590);
    }

    public static final l a(String str) {
        h.f.b.l.d(str, "");
        try {
            return new l(str);
        } catch (PatternSyntaxException unused) {
            return null;
        }
    }
}
