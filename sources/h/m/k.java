package h.m;

import com.bytedance.covode.number.Covode;
import h.a.d;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.j.g;
import h.j.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* access modifiers changed from: package-private */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    final Matcher f158827a;

    /* renamed from: b  reason: collision with root package name */
    private final h f158828b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    private List<String> f158829c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f158830d;

    static {
        Covode.recordClassIndex(105350);
    }

    @Override // h.m.j
    public final h c() {
        return this.f158828b;
    }

    public static final class a extends d<String> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f158831b;

        static {
            Covode.recordClassIndex(105351);
        }

        @Override // h.a.a
        public final int a() {
            return this.f158831b.f158827a.groupCount() + 1;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(k kVar) {
            this.f158831b = kVar;
        }

        @Override // h.a.a
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains(obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.List, h.a.d
        public final /* synthetic */ String get(int i2) {
            String group = this.f158831b.f158827a.group(i2);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // h.a.d
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf(obj);
        }

        @Override // h.a.d
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf(obj);
        }
    }

    public static final class b extends h.a.a<g> implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f158832a;

        static {
            Covode.recordClassIndex(105352);
        }

        @Override // h.a.a
        public final boolean isEmpty() {
            return false;
        }

        @Override // h.a.a
        public final int a() {
            return this.f158832a.f158827a.groupCount() + 1;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<g> iterator() {
            return h.l.k.e(n.t(n.a((Collection<?>) this)), new a(this)).a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(k kVar) {
            this.f158832a = kVar;
        }

        static final class a extends m implements h.f.a.b<Integer, g> {
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(105353);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar) {
                super(1);
                this.this$0 = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ g invoke(Integer num) {
                return this.this$0.a(num.intValue());
            }
        }

        @Override // h.a.a
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof g)) {
                return super.contains(obj);
            }
            return false;
        }

        @Override // h.m.h
        public final g a(int i2) {
            Matcher matcher = this.f158832a.f158827a;
            g a2 = h.a(matcher.start(i2), matcher.end(i2));
            if (Integer.valueOf(a2.f158747a).intValue() < 0) {
                return null;
            }
            String group = this.f158832a.f158827a.group(i2);
            l.b(group, "");
            return new g(group, a2);
        }
    }

    @Override // h.m.j
    public final g a() {
        Matcher matcher = this.f158827a;
        return h.a(matcher.start(), matcher.end());
    }

    @Override // h.m.j
    public final String b() {
        String group = this.f158827a.group();
        l.b(group, "");
        return group;
    }

    @Override // h.m.j
    public final List<String> d() {
        if (this.f158829c == null) {
            this.f158829c = new a(this);
        }
        List<String> list = this.f158829c;
        if (list == null) {
            l.b();
        }
        return list;
    }

    @Override // h.m.j
    public final j e() {
        int i2;
        int end = this.f158827a.end();
        if (this.f158827a.end() == this.f158827a.start()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = end + i2;
        if (i3 > this.f158830d.length()) {
            return null;
        }
        Matcher matcher = this.f158827a.pattern().matcher(this.f158830d);
        l.b(matcher, "");
        return m.a(matcher, i3, this.f158830d);
    }

    public k(Matcher matcher, CharSequence charSequence) {
        l.d(matcher, "");
        l.d(charSequence, "");
        this.f158827a = matcher;
        this.f158830d = charSequence;
    }
}
