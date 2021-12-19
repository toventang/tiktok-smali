package com.ss.android.ugc.aweme.profile.widgets.redpoint;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import h.f.b.l;

public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final BlockStruct f118088a;

    /* renamed from: b  reason: collision with root package name */
    public final Exception f118089b;

    static {
        Covode.recordClassIndex(76670);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f118088a, aVar.f118088a) && l.a(this.f118089b, aVar.f118089b);
    }

    public final int hashCode() {
        BlockStruct blockStruct = this.f118088a;
        int i2 = 0;
        int hashCode = (blockStruct != null ? blockStruct.hashCode() : 0) * 31;
        Exception exc = this.f118089b;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileBlockState(blockStruct=" + this.f118088a + ", exception=" + this.f118089b + ")";
    }

    public /* synthetic */ a() {
        this(null, null);
    }

    private a(BlockStruct blockStruct, Exception exc) {
        this.f118088a = blockStruct;
        this.f118089b = exc;
    }

    public static /* synthetic */ a a(a aVar, BlockStruct blockStruct, Exception exc, int i2) {
        if ((i2 & 1) != 0) {
            blockStruct = aVar.f118088a;
        }
        if ((i2 & 2) != 0) {
            exc = aVar.f118089b;
        }
        return new a(blockStruct, exc);
    }
}
