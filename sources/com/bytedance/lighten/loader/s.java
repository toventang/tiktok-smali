package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.common.g.b;
import com.facebook.common.g.c;
import com.facebook.common.g.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class s implements d {

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArraySet<c> f40035a;

    static {
        Covode.recordClassIndex(24675);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static s f40036a = new s((byte) 0);

        static {
            Covode.recordClassIndex(24676);
        }
    }

    private s() {
        this.f40035a = new CopyOnWriteArraySet<>();
    }

    /* synthetic */ s(byte b2) {
        this();
    }

    @Override // com.facebook.common.g.d
    public final void a(c cVar) {
        this.f40035a.add(cVar);
    }

    public final void a(b bVar) {
        this.f40035a.size();
        try {
            Iterator<c> it = this.f40035a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
