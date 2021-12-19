package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.c;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.d;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import f.a.b.b;
import f.a.t;
import f.a.z;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a f106903a = ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a) com.ss.android.ugc.aweme.base.b.a.d.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.a.class));

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a f106904b = new com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a() {
        /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(68378);
        }

        @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a
        public final Long a() {
            return Long.valueOf(a.this.f106903a.b());
        }

        @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a
        public final void c(long j2) {
            a.this.f106903a.b(j2);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a f106905c = new com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a() {
        /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(68379);
        }

        @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a
        public final Long a() {
            return Long.valueOf(a.this.f106903a.a());
        }

        @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a
        public final void c(long j2) {
            a.this.f106903a.a(j2);
        }
    };

    static {
        Covode.recordClassIndex(68377);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.d
    public final boolean a() {
        if (!TimeLockRuler.isRuleValid() || !TimeLockRuler.isTimeLockOn()) {
            return false;
        }
        long c2 = (long) c.c();
        if (c2 < 0 || !this.f106905c.b(System.currentTimeMillis())) {
            return false;
        }
        if (this.f106904b.b(System.currentTimeMillis())) {
            this.f106903a.c(0);
            this.f106904b.a(System.currentTimeMillis());
        }
        long c3 = this.f106903a.c() + c2;
        this.f106903a.c(c3);
        com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a();
        int lockTimeInMin = TimeLockRuler.getLockTimeInMin() * 60 * 1000;
        if (com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.b()) {
            lockTimeInMin /= 10;
        }
        if (c3 <= ((long) lockTimeInMin)) {
            return false;
        }
        t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new z<String>() {
            /* class com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(68380);
            }

            @Override // f.a.z
            public final void onComplete() {
            }

            @Override // f.a.z
            public final void onError(Throwable th) {
            }

            @Override // f.a.z
            public final void onSubscribe(b bVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.z
            public final /* synthetic */ void onNext(String str) {
                com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.b.a((com.ss.android.ugc.aweme.base.ui.session.b<Boolean>) null, str);
            }
        });
        return false;
    }
}
