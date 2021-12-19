package com.ss.android.ugc.aweme.translation.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.bw.a.a;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import java.util.concurrent.Callable;

public final class b extends a<c> {
    static {
        Covode.recordClassIndex(92056);
    }

    public final void a(String str, String str2, String str3, String str4) {
        n.a().a(this.mHandler, new Callable(str, str2, str3, str4, 1) {
            /* class com.ss.android.ugc.aweme.translation.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f141009a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f141010b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f141011c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f141012d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f141013e = 1;

            static {
                Covode.recordClassIndex(92057);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TranslationApi.a(this.f141009a, this.f141010b, this.f141011c, this.f141012d, this.f141013e);
            }

            {
                this.f141009a = r3;
                this.f141010b = r4;
                this.f141011c = r5;
                this.f141012d = r6;
            }
        }, 0);
    }
}
