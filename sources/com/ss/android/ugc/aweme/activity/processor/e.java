package com.ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.d;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class e extends d {
    static {
        Covode.recordClassIndex(40315);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(int i2, Intent intent) {
        a((Object) null, new a(i2, intent));
    }

    static final class a extends m implements h.f.a.m<d, z, z> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $resultCode;

        static {
            Covode.recordClassIndex(40316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2, Intent intent) {
            super(2);
            this.$resultCode = i2;
            this.$data = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(d dVar, z zVar) {
            d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.f65534a.a(this.$resultCode, this.$data);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final boolean a(int i2, KeyEvent keyEvent) {
        Boolean bool = (Boolean) a((Object) false, (h.f.a.m) new b(i2, keyEvent));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    static final class b extends m implements h.f.a.m<d, Boolean, Boolean> {
        final /* synthetic */ KeyEvent $event;
        final /* synthetic */ int $keyCode;

        static {
            Covode.recordClassIndex(40317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2, KeyEvent keyEvent) {
            super(2);
            this.$keyCode = i2;
            this.$event = keyEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(d dVar, Boolean bool) {
            boolean z;
            d dVar2 = dVar;
            Boolean bool2 = bool;
            l.d(dVar2, "");
            u uVar = dVar2.f65534a;
            boolean z2 = false;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            if (uVar.a()) {
                if (uVar.a(this.$keyCode, this.$event) || z) {
                    z2 = true;
                }
                z = z2;
            }
            return Boolean.valueOf(z);
        }
    }

    private final <T> T a(T t, h.f.a.m<? super d, ? super T, ? extends T> mVar) {
        List<com.bytedance.ies.foundation.base.a> b2 = b().b();
        ArrayList arrayList = new ArrayList();
        for (T t2 : b2) {
            if (t2 instanceof d) {
                arrayList.add(t2);
            }
        }
        for (T t3 : n.h((Iterable) arrayList)) {
            t = (T) mVar.invoke(t3, t);
        }
        return t;
    }
}
