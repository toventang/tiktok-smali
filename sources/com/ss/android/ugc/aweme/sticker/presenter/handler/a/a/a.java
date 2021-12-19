package com.ss.android.ugc.aweme.sticker.presenter.handler.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.tools.utils.j;
import h.f.b.l;
import java.util.List;

public final class a implements m.a {

    /* renamed from: a  reason: collision with root package name */
    private int f135362a;

    /* renamed from: b  reason: collision with root package name */
    private final List<m> f135363b;

    /* renamed from: c  reason: collision with root package name */
    private final int f135364c;

    /* renamed from: d  reason: collision with root package name */
    private final j f135365d;

    static {
        Covode.recordClassIndex(88426);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m.a
    public final b a(c cVar) {
        j jVar;
        l.d(cVar, "");
        boolean z = false;
        if (this.f135364c < this.f135363b.size()) {
            int i2 = this.f135362a + 1;
            this.f135362a = i2;
            if (i2 <= 1) {
                z = true;
            }
            if (z) {
                a aVar = new a(this.f135363b, this.f135364c + 1, this.f135365d);
                m mVar = this.f135363b.get(this.f135364c);
                b a2 = mVar.a(cVar, aVar);
                if (this.f135364c + 1 < this.f135363b.size() && aVar.f135362a <= 0 && (jVar = this.f135365d) != null) {
                    jVar.c("handler:" + mVar + " must call proceed() at least once");
                }
                return a2;
            }
            throw new IllegalStateException(("handler:" + this.f135363b.get(this.f135364c - 1) + " must called useSticker() exactly once").toString());
        }
        throw new IllegalStateException("chain response beyond handlers size".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.sticker.presenter.handler.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends m> list, int i2, j jVar) {
        l.d(list, "");
        this.f135363b = list;
        this.f135364c = i2;
        this.f135365d = jVar;
    }
}
