package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

final class bi {
    static {
        Covode.recordClassIndex(33472);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Field f54005a;

        static {
            Covode.recordClassIndex(33473);
        }

        private a(Field field) {
            this.f54005a = field;
            field.setAccessible(true);
        }

        /* synthetic */ a(Field field, byte b2) {
            this(field);
        }

        /* access modifiers changed from: package-private */
        public final void a(T t, Object obj) {
            try {
                this.f54005a.set(t, obj);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(T t, int i2) {
            try {
                this.f54005a.set(t, Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static <T> a<T> a(Class<T> cls, String str) {
        try {
            return new a<>(cls.getDeclaredField(str), (byte) 0);
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    static <K, V> void a(ar<K, V> arVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(arVar.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : arVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }
}
