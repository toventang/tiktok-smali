package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import java.util.Objects;

public final class hd {

    /* renamed from: a  reason: collision with root package name */
    static final h.f.a.b<String, String> f143055a = b.f143057a;

    static {
        Covode.recordClassIndex(93622);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143056a = new a();

        static {
            Covode.recordClassIndex(93623);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            String obj = p.b((CharSequence) str2).toString();
            if (p.b(obj, ",", false)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(1);
                l.b(substring, "");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                obj = p.b((CharSequence) substring).toString();
            }
            return hd.f143055a.invoke(obj) + "\n";
        }
    }

    static final class b extends m implements h.f.a.b<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f143057a = new b();

        static {
            Covode.recordClassIndex(93624);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return "| " + p.b((CharSequence) str2).toString() + p.a((CharSequence) " ", Math.max(0, 197 - p.b((CharSequence) str2).toString().length())) + '|';
        }
    }

    public static void a(Object[] objArr) {
        l.d(objArr, "");
        Object[] array = i.g(objArr).toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String.valueOf(objArr[0]);
        p.a((CharSequence) "-", 198);
        String a2 = i.a(array, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.CharSequence");
        n.a(p.c(p.b((CharSequence) a2).toString(), new String[]{"\n"}), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f143056a, 30);
    }
}
