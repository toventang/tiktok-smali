package com.ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.profile.api.c;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.api.h;

public final class d implements com.bytedance.assem.arch.a.a<f> {

    /* renamed from: a  reason: collision with root package name */
    public final f f117699a = new a();

    static {
        Covode.recordClassIndex(76179);
    }

    public static final class a implements f {
        static {
            Covode.recordClassIndex(76180);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.profile.widgets.common.f
        public final Object a(int i2) {
            e.a();
            String a2 = c.a(b.g().getCurSecUserId(), b.g().getCurUserId(), null, i2, false);
            h.a(a2);
            return c.a(a2, null);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ f a() {
        return this.f117699a;
    }
}
