package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

public final class y {
    static {
        Covode.recordClassIndex(33675);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static <V> V a(Future<V> future) {
        boolean z = false;
        V v = future;
        while (true) {
            try {
                v = (V) v.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                v = v;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
