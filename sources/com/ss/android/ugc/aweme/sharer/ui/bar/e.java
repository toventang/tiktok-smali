package com.ss.android.ugc.aweme.sharer.ui.bar;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class e implements f {

    /* renamed from: d  reason: collision with root package name */
    public final Context f124647d;

    /* renamed from: e  reason: collision with root package name */
    public final SharePackage f124648e;

    static {
        Covode.recordClassIndex(81903);
    }

    public abstract void a(b bVar);

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ b $channel;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(81904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, b bVar) {
            super(0);
            this.this$0 = eVar;
            this.$channel = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(this.$channel);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
    public final void a_(b bVar) {
        l.d(bVar, "");
        SharePackage sharePackage = this.f124648e;
        if (sharePackage != null) {
            sharePackage.a(this.f124647d, bVar, new a(this, bVar));
        } else {
            a(bVar);
        }
    }

    public e(Context context, SharePackage sharePackage) {
        l.d(context, "");
        this.f124647d = context;
        this.f124648e = sharePackage;
    }
}
