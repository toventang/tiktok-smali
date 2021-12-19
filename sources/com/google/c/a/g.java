package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f53686a;

    static {
        Covode.recordClassIndex(33240);
    }

    private g(g gVar) {
        this.f53686a = gVar.f53686a;
    }

    public static g a(String str) {
        return new g(str);
    }

    public g(String str) {
        this.f53686a = (String) k.a(str);
    }

    /* access modifiers changed from: package-private */
    public CharSequence a(Object obj) {
        k.a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public g b(final String str) {
        k.a(str);
        return new g(this) {
            /* class com.google.c.a.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33241);
            }

            @Override // com.google.c.a.g
            public final g b(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.a.g
            public final CharSequence a(Object obj) {
                if (obj == null) {
                    return str;
                }
                return g.this.a(obj);
            }
        };
    }

    public final String a(Iterable<?> iterable) {
        return a(new StringBuilder(), iterable.iterator()).toString();
    }

    public final String a(Object[] objArr) {
        return a((Iterable<?>) Arrays.asList(objArr));
    }

    /* synthetic */ g(g gVar, byte b2) {
        this(gVar);
    }

    private StringBuilder a(StringBuilder sb, Iterator<?> it) {
        try {
            k.a(sb);
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f53686a);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
