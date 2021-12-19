package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.f;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final u f65534a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.foundation.activity.a f65535b;

    static {
        Covode.recordClassIndex(40313);
    }

    public static final class a extends m implements b<BaseActivityViewModel, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(40314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.getConfiguration().b().remove(this.this$0);
            return z.f158842a;
        }
    }

    private d(com.bytedance.ies.foundation.activity.a aVar, u uVar) {
        l.d(aVar, "");
        l.d(uVar, "");
        this.f65535b = aVar;
        this.f65534a = uVar;
    }

    public /* synthetic */ d(com.bytedance.ies.foundation.activity.a aVar, u uVar, byte b2) {
        this(aVar, uVar);
    }
}
