package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import h.f.b.l;
import h.z;

public abstract class n extends f {

    /* renamed from: f  reason: collision with root package name */
    public Aweme f94901f;

    /* renamed from: g  reason: collision with root package name */
    public String f94902g;

    static {
        Covode.recordClassIndex(60192);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(a aVar, f fVar) {
        super(new h.f.a.a<z>(fVar) {
            /* class com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60193);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                ((f) this.receiver).dismiss();
                return z.f158842a;
            }
        });
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94901f = aVar.f94865b;
        this.f94902g = aVar.f94866c;
    }
}
