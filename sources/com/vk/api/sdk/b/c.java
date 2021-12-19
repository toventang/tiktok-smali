package com.vk.api.sdk.b;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.d;
import com.vk.api.sdk.f.b;
import h.f.b.l;

public final class c<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f156251b;

    /* renamed from: d  reason: collision with root package name */
    private final b f156252d = new b(1000, 60000, 1.5f, 0.0f, 8);

    static {
        Covode.recordClassIndex(103767);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x000b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0059 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x000b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable, com.vk.api.sdk.c.b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Throwable, com.vk.api.sdk.c.c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable, com.vk.api.sdk.c.d] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.vk.api.sdk.c.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.vk.api.sdk.b.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T a(com.vk.api.sdk.b.a r6) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.b.c.a(com.vk.api.sdk.b.a):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, int i2, b<? extends T> bVar) {
        super(dVar, i2);
        l.c(dVar, "");
        l.c(bVar, "");
        this.f156251b = bVar;
    }
}
