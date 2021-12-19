package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.eu;
import com.google.android.gms.internal.measurement.ev;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ev<MessageType extends ev<MessageType, BuilderType>, BuilderType extends eu<MessageType, BuilderType>> implements ht {
    protected int zza;

    static {
        Covode.recordClassIndex(31770);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.ht
    public final fe g() {
        try {
            fn b2 = fe.b(m());
            a(b2.f50864a);
            return b2.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e2);
        }
    }

    public final byte[] h() {
        try {
            byte[] bArr = new byte[m()];
            ft a2 = ft.a(bArr);
            a(a2);
            a2.b();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i2) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void a(Iterable<T> iterable, List<? super T> list) {
        gp.a(iterable);
        if (iterable instanceof he) {
            List<?> d2 = ((he) iterable).d();
            he heVar = (he) list;
            int size = list.size();
            for (Object obj : d2) {
                if (obj == null) {
                    String sb = new StringBuilder(37).append("Element at index ").append(heVar.size() - size).append(" is null.").toString();
                    for (int size2 = heVar.size() - 1; size2 >= size; size2--) {
                        heVar.remove(size2);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof fe) {
                    heVar.a((fe) obj);
                } else {
                    heVar.add(obj);
                }
            }
        } else if (iterable instanceof Cif) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    String sb2 = new StringBuilder(37).append("Element at index ").append(list.size() - size3).append(" is null.").toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb2);
                }
                list.add(t);
            }
        }
    }
}
