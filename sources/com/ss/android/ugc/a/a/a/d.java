package com.ss.android.ugc.a.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.a.a.b.a;
import java.util.HashMap;

public enum d {
    INSTANCE;
    
    public HashMap<String, a> idToPresenter = new HashMap<>();
    public HashMap<a, String> presenterToId = new HashMap<>();

    public final void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    static {
        Covode.recordClassIndex(38058);
    }

    public final <P> P getPresenter(String str) {
        return (P) this.idToPresenter.get(str);
    }

    public final String getId(a aVar) {
        return this.presenterToId.get(aVar);
    }

    private d(String str) {
    }

    public final void add(final a aVar) {
        String str = aVar.getClass().getSimpleName() + "/" + System.nanoTime() + "/" + ((int) (Math.random() * 2.147483647E9d));
        this.idToPresenter.put(str, aVar);
        this.presenterToId.put(aVar, str);
        aVar.f61890b.add(new a.AbstractC1348a() {
            /* class com.ss.android.ugc.a.a.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(38059);
            }

            @Override // com.ss.android.ugc.a.a.b.a.AbstractC1348a
            public final void a() {
                d.this.idToPresenter.remove(d.this.presenterToId.remove(aVar));
            }
        });
    }
}
