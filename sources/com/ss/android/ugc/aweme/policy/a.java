package com.ss.android.ugc.aweme.policy;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.b.b;
import f.a.z;

public final class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private WeakHandler f115557a = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    private Activity f115558b;

    static {
        Covode.recordClassIndex(74481);
    }

    public final void a() {
        if (this.f115558b != null) {
            PolicyApi.f115556a.acceptPrivacyPolicy().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new z<BaseResponse>() {
                /* class com.ss.android.ugc.aweme.policy.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(74482);
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
                public final /* synthetic */ void onNext(BaseResponse baseResponse) {
                    BaseResponse baseResponse2 = baseResponse;
                    if (baseResponse2 != null && baseResponse2.status_code == 0) {
                        com.ss.android.ugc.aweme.account.b.g().getCurUser().setAcceptPrivatePolicy(true);
                    }
                }
            });
        }
    }

    public a(Activity activity) {
        this.f115558b = activity;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 2 && message.obj != null && (message.obj instanceof BaseResponse) && ((BaseResponse) message.obj).status_code == 0) {
            com.ss.android.ugc.aweme.account.b.g().queryUser();
        }
    }
}
