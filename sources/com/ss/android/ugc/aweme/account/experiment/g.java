package com.ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import h.f.b.m;
import h.h;
import h.i;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private final h f62994a = i.a((h.f.a.a) a.f62995a);

    static {
        Covode.recordClassIndex(38804);
    }

    static final class a extends m implements h.f.a.a<IGuestModeService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62995a = new a();

        static {
            Covode.recordClassIndex(38805);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IGuestModeService invoke() {
            return GuestModeServiceImpl.d();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        if (((IGuestModeService) this.f62994a.getValue()).c()) {
            return false;
        }
        return true;
    }
}
