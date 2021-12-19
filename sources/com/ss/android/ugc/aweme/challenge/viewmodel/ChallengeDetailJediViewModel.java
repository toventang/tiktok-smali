package com.ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.challenge.b.a;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import f.a.ab;
import f.a.ad;
import f.a.af;
import h.f.b.l;
import h.f.b.m;

public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {
    static {
        Covode.recordClassIndex(43320);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ ChallengeDetailState d() {
        return new ChallengeDetailState(null, 1, null);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f70238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f70239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f70240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f70241d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f70242e;

        static {
            Covode.recordClassIndex(43321);
        }

        a(boolean z, String str, int i2, boolean z2, String str2) {
            this.f70238a = z;
            this.f70239b = str;
            this.f70240c = i2;
            this.f70241d = z2;
            this.f70242e = str2;
        }

        @Override // f.a.af
        public final void subscribe(ad<ChallengeDetail> adVar) {
            ChallengeDetail challengeDetail;
            l.d(adVar, "");
            try {
                if (!this.f70238a) {
                    String str = this.f70239b;
                    a.b a2 = com.ss.android.ugc.aweme.challenge.b.a.f69908b.a(str + '&' + this.f70240c + '&' + this.f70241d);
                    if (!(a2 == null || System.currentTimeMillis() - a2.f69914b >= ((long) com.ss.android.ugc.aweme.challenge.b.a.f69907a) || (challengeDetail = a2.f69913a) == null)) {
                        adVar.a(challengeDetail);
                        return;
                    }
                }
                ChallengeDetail a3 = ChallengeApi.a(this.f70239b, this.f70240c, this.f70241d, this.f70242e);
                adVar.a(a3);
                String str2 = this.f70239b;
                int i2 = this.f70240c;
                boolean z = this.f70241d;
                l.b(a3, "");
                l.d(a3, "");
                com.ss.android.ugc.aweme.challenge.b.a.f69908b.a(str2 + '&' + i2 + '&' + z, new a.b(a3, System.currentTimeMillis()));
            } catch (Throwable th) {
                if (!adVar.isDisposed()) {
                    adVar.a(th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<ChallengeDetailState, com.bytedance.jedi.arch.a<? extends ChallengeDetail>, ChallengeDetailState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f70243a = new b();

        static {
            Covode.recordClassIndex(43322);
        }

        b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ ChallengeDetailState invoke(ChallengeDetailState challengeDetailState, com.bytedance.jedi.arch.a<? extends ChallengeDetail> aVar) {
            ChallengeDetailState challengeDetailState2 = challengeDetailState;
            com.bytedance.jedi.arch.a<? extends ChallengeDetail> aVar2 = aVar;
            l.d(challengeDetailState2, "");
            l.d(aVar2, "");
            return challengeDetailState2.copy(aVar2);
        }
    }

    public final void a(String str, int i2, boolean z, boolean z2, String str2) {
        ab b2 = ab.a((af) new a(z2, str, i2, z, str2)).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        a(b2, b.f70243a);
    }
}
