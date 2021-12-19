package h.m;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.u;
import h.f.b.j;
import h.f.b.m;
import h.l.f;
import h.l.h;
import h.l.k;
import h.m.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l implements Serializable {
    public static final a Companion = new a((byte) 0);
    private Set<? extends n> _options;
    public final Pattern nativePattern;

    static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f158833a = new a((byte) 0);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        static {
            Covode.recordClassIndex(105356);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(105357);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            h.f.b.l.b(compile, "");
            return new l(compile);
        }

        public b(String str, int i2) {
            h.f.b.l.d(str, "");
            this.pattern = str;
            this.flags = i2;
        }
    }

    static {
        Covode.recordClassIndex(105354);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105355);
        }

        public static int a(int i2) {
            return (i2 & 2) != 0 ? i2 | 64 : i2;
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<j> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $startIndex;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(105358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(l lVar, CharSequence charSequence, int i2) {
            super(0);
            this.this$0 = lVar;
            this.$input = charSequence;
            this.$startIndex = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return this.this$0.find(this.$input, this.$startIndex);
        }
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        h.f.b.l.b(pattern, "");
        return pattern;
    }

    public final String toString() {
        String pattern = this.nativePattern.toString();
        h.f.b.l.b(pattern, "");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        h.f.b.l.b(pattern, "");
        return new b(pattern, this.nativePattern.flags());
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Set<? extends h.m.n>, java.util.Set<h.m.n> */
    public final Set<n> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(n.class);
        m.a aVar = new m.a(flags);
        h.f.b.l.d(allOf, "");
        h.f.b.l.d(aVar, "");
        u.a(allOf, aVar, false);
        Set<n> unmodifiableSet = Collections.unmodifiableSet(allOf);
        h.f.b.l.b(unmodifiableSet, "");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements h.f.a.b<j, j> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f158834a = new d();

        static {
            Covode.recordClassIndex(105359);
        }

        d() {
            super(1, j.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ j invoke(j jVar) {
            j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            return jVar2.e();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3)
            h.f.b.l.b(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.l.<init>(java.lang.String):void");
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        h.f.b.l.d(charSequence, "");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final boolean matches(CharSequence charSequence) {
        h.f.b.l.d(charSequence, "");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final j matchEntire(CharSequence charSequence) {
        h.f.b.l.d(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        h.f.b.l.b(matcher, "");
        if (!matcher.matches()) {
            return null;
        }
        return new k(matcher, charSequence);
    }

    public l(Pattern pattern) {
        h.f.b.l.d(pattern, "");
        this.nativePattern = pattern;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.c.b.a.j implements h.f.a.m<h.l.j<? super String>, h.c.d<? super z>, Object> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ l this$0;

        static {
            Covode.recordClassIndex(105360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar, CharSequence charSequence, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = lVar;
            this.$input = charSequence;
            this.$limit = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            e eVar = new e(this.this$0, this.$input, this.$limit, dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(h.l.j<? super String> jVar, h.c.d<? super z> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: h.m.l.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(java.lang.String r3, h.m.n r4) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            h.f.b.l.d(r4, r1)
            int r0 = r4.getValue()
            int r0 = h.m.l.a.a(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3, r0)
            h.f.b.l.b(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.l.<init>(java.lang.String, h.m.n):void");
    }

    public final j find(CharSequence charSequence, int i2) {
        h.f.b.l.d(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        h.f.b.l.b(matcher, "");
        return m.a(matcher, i2, charSequence);
    }

    public final String replace(CharSequence charSequence, String str) {
        h.f.b.l.d(charSequence, "");
        h.f.b.l.d(str, "");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        h.f.b.l.b(replaceAll, "");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        h.f.b.l.d(charSequence, "");
        h.f.b.l.d(str, "");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        h.f.b.l.b(replaceFirst, "");
        return replaceFirst;
    }

    public final h<String> splitToSequence(CharSequence charSequence, int i2) {
        h.f.b.l.d(charSequence, "");
        p.a(i2);
        return k.a(new e(this, charSequence, i2, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(java.lang.String r3, java.util.Set<? extends h.m.n> r4) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            h.f.b.l.d(r4, r1)
            int r0 = h.m.m.a(r4)
            int r0 = h.m.l.a.a(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3, r0)
            h.f.b.l.b(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.m.l.<init>(java.lang.String, java.util.Set):void");
    }

    public final j matchAt(CharSequence charSequence, int i2) {
        h.f.b.l.d(charSequence, "");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i2, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        h.f.b.l.b(region, "");
        return new k(region, charSequence);
    }

    public final boolean matchesAt(CharSequence charSequence, int i2) {
        h.f.b.l.d(charSequence, "");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i2, charSequence.length()).lookingAt();
    }

    public final h<j> findAll(CharSequence charSequence, int i2) {
        h.f.b.l.d(charSequence, "");
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i2 + ", input length: " + charSequence.length());
        }
        c cVar = new c(this, charSequence, i2);
        d dVar = d.f158834a;
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(dVar, "");
        return new f(cVar, dVar);
    }

    public final String replace(CharSequence charSequence, h.f.a.b<? super j, ? extends CharSequence> bVar) {
        h.f.b.l.d(charSequence, "");
        h.f.b.l.d(bVar, "");
        int i2 = 0;
        j find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i2, Integer.valueOf(find$default.a().f158747a).intValue());
            sb.append((CharSequence) bVar.invoke(find$default));
            i2 = Integer.valueOf(find$default.a().f158748b).intValue() + 1;
            find$default = find$default.e();
            if (i2 >= length) {
                break;
            }
        } while (find$default != null);
        if (i2 < length) {
            sb.append(charSequence, i2, length);
        }
        String sb2 = sb.toString();
        h.f.b.l.b(sb2, "");
        return sb2;
    }

    public final List<String> split(CharSequence charSequence, int i2) {
        h.f.b.l.d(charSequence, "");
        p.a(i2);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i2 == 1 || !matcher.find()) {
            return n.a(charSequence.toString());
        }
        int i3 = 10;
        if (i2 > 0) {
            i3 = h.j.h.c(i2, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = i2 - 1;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i5 >= 0 && arrayList.size() == i5) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ j find$default(l lVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lVar.find(charSequence, i2);
    }

    public static /* synthetic */ h findAll$default(l lVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lVar.findAll(charSequence, i2);
    }

    public static /* synthetic */ List split$default(l lVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lVar.split(charSequence, i2);
    }

    public static /* synthetic */ h splitToSequence$default(l lVar, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return lVar.splitToSequence(charSequence, i2);
    }
}
