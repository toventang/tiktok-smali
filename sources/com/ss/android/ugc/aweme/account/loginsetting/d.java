package com.ss.android.ugc.aweme.account.loginsetting;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f65138a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f65139b = false;

    private d() {
    }

    static {
        Covode.recordClassIndex(40043);
    }

    /* access modifiers changed from: package-private */
    public static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65140a;

        static {
            Covode.recordClassIndex(40044);
        }

        a(a aVar) {
            this.f65140a = aVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            if (!ai.a(iVar)) {
                a aVar = this.f65140a;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else {
                l.b(iVar, "");
                b bVar = (b) iVar.d();
                a aVar2 = this.f65140a;
                if (aVar2 != null) {
                    aVar2.a(bVar.f65135a.f65137a);
                }
            }
            return z.f158842a;
        }
    }

    public static final void a(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.a(false);
            return;
        }
        i<b> a2 = AccountApiInModule.a(str);
        if (a2 == null) {
            aVar.a(false);
        } else {
            a2.a(new a(aVar));
        }
    }
}
