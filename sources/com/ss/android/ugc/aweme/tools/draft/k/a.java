package com.ss.android.ugc.aweme.tools.draft.k;

import com.bytedance.common.utility.d.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import h.m.p;
import h.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139807a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(91386);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.k.a$a  reason: collision with other inner class name */
    public static final class CallableC3691a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f139808a;

        static {
            Covode.recordClassIndex(91387);
        }

        public CallableC3691a(c cVar) {
            this.f139808a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (this.f139808a.W.N != null) {
                b.a(this.f139808a.W.N.getVideoCoverImgPath());
                b.a(this.f139808a.W.N.getEffectPath());
                String bgPath = this.f139808a.W.N.getBgPath();
                if (p.a((CharSequence) bgPath, (CharSequence) "status/resizeImage", false)) {
                    b.a(bgPath);
                }
                b.a(this.f139808a.W.N.getMusicPath());
            }
            return z.f158842a;
        }
    }
}
