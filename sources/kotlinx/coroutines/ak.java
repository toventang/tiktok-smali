package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.w;

public final class ak extends h.c.a implements cv<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f159005b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f159006a;

    static {
        Covode.recordClassIndex(105523);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ak) && this.f159006a == ((ak) obj).f159006a;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f159006a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static final class a implements f.c<ak> {
        static {
            Covode.recordClassIndex(105524);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "CoroutineId(" + this.f159006a + ')';
    }

    public ak(long j2) {
        super(f159005b);
        this.f159006a = j2;
    }

    @Override // h.c.f.b, h.c.f, h.c.a
    public final <E extends f.b> E get(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // h.c.f, h.c.a
    public final f minusKey(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // h.c.f, h.c.a
    public final f plus(f fVar) {
        return f.b.a.a(this, fVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlinx.coroutines.cv
    public final /* synthetic */ void a(String str) {
        Thread.currentThread().setName(str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlinx.coroutines.cv
    public final /* synthetic */ String a(f fVar) {
        String str;
        al alVar = (al) fVar.get(al.f159007b);
        if (alVar == null || (str = alVar.f159008a) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int a2 = p.a((CharSequence) name, " @");
        if (a2 < 0) {
            a2 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + a2 + 10);
        if (name != null) {
            String substring = name.substring(0, a2);
            l.a((Object) substring, "");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(this.f159006a);
            String sb2 = sb.toString();
            l.a((Object) sb2, "");
            currentThread.setName(sb2);
            return name;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // h.c.f, h.c.a
    public final <R> R fold(R r, m<? super R, ? super f.b, ? extends R> mVar) {
        return (R) f.b.a.a(this, r, mVar);
    }
}
