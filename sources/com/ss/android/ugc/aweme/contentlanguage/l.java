package com.ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.contentlanguage.api.b;
import f.a.z;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.a f78210a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public a f78211b;

    /* renamed from: c  reason: collision with root package name */
    private LanguageApi f78212c = b.a();

    public interface a {
        static {
            Covode.recordClassIndex(48497);
        }

        void a();

        void a(Throwable th);
    }

    static {
        Covode.recordClassIndex(48495);
    }

    private void b(com.ss.android.ugc.aweme.setting.serverpush.a.a aVar, int i2) {
        if (i2 == 0) {
            ContentLanguageServiceImpl.f().a(aVar.getLanguageCode());
        } else {
            ContentLanguageServiceImpl.f().a(aVar);
        }
        this.f78211b.a();
    }

    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.a aVar, int i2) {
        if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            b(aVar, i2);
        } else {
            this.f78212c.setContentLanguage("content_language", aVar.getLanguageCode(), i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new z<BaseResponse>() {
                /* class com.ss.android.ugc.aweme.contentlanguage.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48496);
                }

                @Override // f.a.z
                public final void onComplete() {
                }

                @Override // f.a.z
                public final void onSubscribe(f.a.b.b bVar) {
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                    if (l.this.f78211b != null) {
                        l.this.f78211b.a(th);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(BaseResponse baseResponse) {
                    BaseResponse baseResponse2 = baseResponse;
                    if (baseResponse2 != null && baseResponse2.status_code == 0 && l.this.f78211b != null) {
                        l.this.f78211b.a();
                    }
                }
            });
        }
    }
}
