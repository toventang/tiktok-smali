package com.ss.android.ugc.aweme.compliance.privacy.settings.account.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c;
import h.f.b.l;

public abstract class f extends c implements i {
    static {
        Covode.recordClassIndex(47927);
    }

    public abstract int b();

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public boolean c() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i
    public boolean d() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    public c.a a() {
        return new a(b());
    }

    public static final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f77470a;

        static {
            Covode.recordClassIndex(47928);
        }

        a(int i2) {
            this.f77470a = i2;
        }

        @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c.a
        public final h a(Context context, ViewGroup viewGroup) {
            l.d(context, "");
            l.d(viewGroup, "");
            View a2 = com.a.a(LayoutInflater.from(context), this.f77470a, viewGroup, false);
            l.b(a2, "");
            return new h(a2);
        }
    }
}
