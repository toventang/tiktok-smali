package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class as<K0, V0> {
    static {
        Covode.recordClassIndex(33427);
    }

    public static abstract class d<K0> {
        static {
            Covode.recordClassIndex(33433);
        }

        /* access modifiers changed from: package-private */
        public abstract <K extends K0, V> Map<K, Collection<V>> a();

        d() {
        }

        public final c<K0, Object> b() {
            k.a(2, "expectedValuesPerKey");
            return new c<K0, Object>() {
                /* class com.google.c.c.as.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f53942a = 2;

                static {
                    Covode.recordClassIndex(33434);
                }

                @Override // com.google.c.c.as.c
                public final <K extends K0, V> ao<K, V> b() {
                    return at.a(d.this.a(), new a(this.f53942a));
                }
            };
        }
    }

    private as() {
    }

    static final class a<V> implements q<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        static {
            Covode.recordClassIndex(33430);
        }

        @Override // com.google.c.a.q
        public final /* synthetic */ Object b() {
            return new ArrayList(this.expectedValuesPerKey);
        }

        a(int i2) {
            this.expectedValuesPerKey = k.a(i2, "expectedValuesPerKey");
        }
    }

    enum b implements q<List<Object>> {
        INSTANCE;

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.c.a.q
        public final /* synthetic */ List<Object> b() {
            return new LinkedList();
        }

        static {
            Covode.recordClassIndex(33431);
        }
    }

    public static abstract class c<K0, V0> extends as<K0, V0> {
        static {
            Covode.recordClassIndex(33432);
        }

        public abstract <K extends K0, V extends V0> ao<K, V> b();

        c() {
            super((byte) 0);
        }
    }

    public static d<Object> a() {
        k.a(8, "expectedKeys");
        return new d<Object>() {
            /* class com.google.c.c.as.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f53939a = 8;

            static {
                Covode.recordClassIndex(33429);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.as.d
            public final <K, V> Map<K, Collection<V>> a() {
                return new o(this.f53939a);
            }
        };
    }

    /* synthetic */ as(byte b2) {
        this();
    }
}
