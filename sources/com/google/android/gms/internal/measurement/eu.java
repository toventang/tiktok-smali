package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.eu;
import com.google.android.gms.internal.measurement.ev;
import java.io.IOException;

public abstract class eu<MessageType extends ev<MessageType, BuilderType>, BuilderType extends eu<MessageType, BuilderType>> implements hw {
    static {
        Covode.recordClassIndex(31769);
    }

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public abstract BuilderType a(fq fqVar, fy fyVar);

    /* renamed from: s */
    public abstract BuilderType clone();

    @Override // com.google.android.gms.internal.measurement.hw
    public final /* synthetic */ hw a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private final String a(String str) {
        String name = getClass().getName();
        return new StringBuilder(String.valueOf(name).length() + 60 + String.valueOf(str).length()).append("Reading ").append(name).append(" from a ").append(str).append(" threw an IOException (should never happen).").toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.gms.internal.measurement.eu<MessageType extends com.google.android.gms.internal.measurement.ev<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.eu<MessageType, BuilderType>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.hw
    public final /* synthetic */ hw a(ht htVar) {
        if (H_().getClass().isInstance(htVar)) {
            return a((ev) htVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType a(byte[] bArr, int i2) {
        try {
            fq a2 = fq.a(bArr, i2);
            a(a2, fy.a());
            a2.a(0);
            return this;
        } catch (gu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(a("byte array"), e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.hw
    public final /* synthetic */ hw a(byte[] bArr, fy fyVar) {
        return a(bArr, bArr.length, fyVar);
    }

    public BuilderType a(byte[] bArr, int i2, fy fyVar) {
        try {
            fq a2 = fq.a(bArr, i2);
            a(a2, fyVar);
            a2.a(0);
            return this;
        } catch (gu e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException(a("byte array"), e3);
        }
    }
}
