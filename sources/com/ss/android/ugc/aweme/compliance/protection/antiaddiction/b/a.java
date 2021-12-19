package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.c;
import f.a.t;
import f.a.z;

public final class a extends com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.i.a.a f77917a = new com.ss.android.ugc.aweme.i.a.a() {
        /* class com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(48299);
        }

        @Override // com.ss.android.ugc.aweme.i.a.a
        public final aj<Long> a() {
            return SharePrefCache.inst().getLastLockedTime();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.i.a.a f77918b = new com.ss.android.ugc.aweme.i.a.a() {
        /* class com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(48300);
        }

        @Override // com.ss.android.ugc.aweme.i.a.a
        public final aj<Long> a() {
            return SharePrefCache.inst().getLastUnlockTime();
        }
    };

    static {
        Covode.recordClassIndex(48298);
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a, com.ss.android.ugc.aweme.compliance.protection.antiaddiction.d
    public final boolean a(long j2, long j3) {
        if (!com.ss.android.ugc.aweme.compliance.protection.common.a.a()) {
            return false;
        }
        long c2 = (long) c.c();
        if (c2 < 0 || !this.f77918b.b(System.currentTimeMillis())) {
            return false;
        }
        if (this.f77917a.b(System.currentTimeMillis())) {
            SharePrefCache.inst().getTodayVideoPlayTime().b(0L);
            this.f77917a.a(System.currentTimeMillis());
        }
        long longValue = SharePrefCache.inst().getTodayVideoPlayTime().c().longValue() + c2;
        SharePrefCache.inst().getTodayVideoPlayTime().b(Long.valueOf(longValue));
        b.a();
        if (longValue <= ((long) (com.ss.android.ugc.aweme.compliance.protection.common.a.c() * 60 * 1000))) {
            return false;
        }
        t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new z<String>() {
            /* class com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(48301);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
            }

            @Override // f.a.z
            public final void onSubscribe(f.a.b.b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(String str) {
                com.ss.android.ugc.aweme.compliance.protection.timelock.a.a((com.ss.android.ugc.aweme.base.ui.session.b<Boolean>) null, str);
            }
        });
        return false;
    }
}
