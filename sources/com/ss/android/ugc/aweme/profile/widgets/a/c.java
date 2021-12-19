package com.ss.android.ugc.aweme.profile.widgets.a;

import android.view.View;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ui.v2.x;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends com.bytedance.assem.arch.d.a {
    static {
        Covode.recordClassIndex(75997);
    }

    static final class a extends m implements b<Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f117569a = new a();

        static {
            Covode.recordClassIndex(75998);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                com.ss.android.ugc.d.a.c.a(new b());
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        d.a(this, ab.a(x.class), d.f117570a, a.f117569a);
    }
}
