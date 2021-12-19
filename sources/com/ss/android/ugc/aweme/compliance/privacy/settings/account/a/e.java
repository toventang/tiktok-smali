package com.ss.android.ugc.aweme.compliance.privacy.settings.account.a;

import android.content.Context;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class e extends b implements m {

    public interface a {
        static {
            Covode.recordClassIndex(47926);
        }

        void a(e eVar);
    }

    static {
        Covode.recordClassIndex(47925);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b
    public final void a(c cVar) {
        l.d(cVar, "");
        super.a(cVar);
        if (cVar instanceof a) {
            ((a) cVar).a(this);
        }
    }
}
