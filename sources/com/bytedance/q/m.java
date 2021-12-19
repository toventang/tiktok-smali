package com.bytedance.q;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

final class m<IN> implements b<IN>, Serializable {
    private b<IN> mChain;

    static {
        Covode.recordClassIndex(25908);
    }

    @Override // com.bytedance.q.b
    public final Object a() {
        return this.mChain.a();
    }

    public m(b<IN> bVar) {
        this.mChain = bVar;
    }

    @Override // com.bytedance.q.b
    public final <O> O b(Class<? extends d<?, O>> cls) {
        return (O) this.mChain.b(cls);
    }

    @Override // com.bytedance.q.b
    public final <I> I a(Class<? extends d<I, ?>> cls) {
        return (I) this.mChain.a((Class) cls);
    }

    @Override // com.bytedance.q.b
    public final Object a(IN in) {
        return this.mChain.a((Object) in);
    }

    @Override // com.bytedance.q.b
    public final Object a(String str) {
        return this.mChain.a(str);
    }

    @Override // com.bytedance.q.b
    public final void a(String str, Object obj) {
        this.mChain.a(str, obj);
    }
}
