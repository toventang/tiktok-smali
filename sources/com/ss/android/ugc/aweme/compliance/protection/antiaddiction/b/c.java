package com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAweme;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAwemeApi;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.f;
import f.a.b.b;
import f.a.z;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.i.a.a f77924a = new com.ss.android.ugc.aweme.i.a.a() {
        /* class com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(48304);
        }

        @Override // com.ss.android.ugc.aweme.i.a.a
        public final aj<Long> a() {
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<Long> lastGetRelieveAwemeTime = inst.getLastGetRelieveAwemeTime();
            l.b(lastGetRelieveAwemeTime, "");
            return lastGetRelieveAwemeTime;
        }
    };

    static {
        Covode.recordClassIndex(48303);
    }

    public static final class a implements z<TiktokRelieveAweme> {
        static {
            Covode.recordClassIndex(48305);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(b bVar) {
            l.d(bVar, "");
        }

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(TiktokRelieveAweme tiktokRelieveAweme) {
            TiktokRelieveAweme tiktokRelieveAweme2 = tiktokRelieveAweme;
            l.d(tiktokRelieveAweme2, "");
            if (!TextUtils.isEmpty(tiktokRelieveAweme2.getAwemeId())) {
                com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a().f77915e = true;
                f.f77934a = tiktokRelieveAweme2.getAwemeId();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a, com.ss.android.ugc.aweme.compliance.protection.antiaddiction.d
    public final boolean a(long j2, long j3) {
        int i2;
        if (!f.a()) {
            return false;
        }
        com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b a2 = com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a();
        if (a2.a(j2)) {
            i2 = a2.f77913c;
        } else {
            i2 = a2.f77912b;
        }
        long j4 = (long) (i2 * 1000);
        if (j4 <= 0 || j3 <= j4 || !this.f77924a.b(j2)) {
            return false;
        }
        this.f77924a.a(j2);
        try {
            TiktokRelieveAwemeApi.f77908a.getTiktokRelieveAweme(!com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.a().a(System.currentTimeMillis())).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new a());
        } catch (Exception unused) {
        }
        return true;
    }
}
