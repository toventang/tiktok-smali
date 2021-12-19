package com.ss.android.ugc.tools.infosticker.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final b<Effect, Boolean> f149686a = a.f149687a;

    static {
        Covode.recordClassIndex(98562);
    }

    static final class a extends m implements b<Effect, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149687a = new a();

        static {
            Covode.recordClassIndex(98563);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Effect effect) {
            l.d(effect, "");
            return true;
        }
    }
}
