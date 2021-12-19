package com.bytedance.ies.bullet.kit.lynx.a;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.lynx.a.a;

public final class b<K, V extends a> extends LruCache<K, V> {
    static {
        Covode.recordClassIndex(18940);
    }

    public b(int i2) {
        super(i2);
    }

    @Override // android.util.LruCache
    public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar.b();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        super.entryRemoved(z, obj, aVar, obj3);
        if (aVar != null) {
            aVar.a();
        }
    }
}
