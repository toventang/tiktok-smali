package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.g.a;
import com.facebook.common.g.d;
import com.facebook.imagepipeline.memory.a;

public class o extends a<byte[]> implements a {

    /* renamed from: g  reason: collision with root package name */
    private final int[] f48099g;

    static {
        Covode.recordClassIndex(29063);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final int d(int i2) {
        return i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* bridge */ /* synthetic */ byte[] b(int i2) {
        return new byte[i2];
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ void b(byte[] bArr) {
        i.a(bArr);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final /* synthetic */ int c(byte[] bArr) {
        byte[] bArr2 = bArr;
        i.a(bArr2);
        return bArr2.length;
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    public final int c(int i2) {
        if (i2 > 0) {
            int[] iArr = this.f48099g;
            for (int i3 : iArr) {
                if (i3 >= i2) {
                    return i3;
                }
            }
            return i2;
        }
        throw new a.b(Integer.valueOf(i2));
    }

    public o(d dVar, ad adVar, ae aeVar) {
        super(dVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f48064c;
        this.f48099g = new int[sparseIntArray.size()];
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            this.f48099g[i2] = sparseIntArray.keyAt(i2);
        }
        a();
    }
}
