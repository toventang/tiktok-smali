package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages;

import android.app.Activity;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import java.lang.ref.WeakReference;

public abstract class BasePrivacySettingViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f77670a;

    /* renamed from: b  reason: collision with root package name */
    public String f77671b = "";

    /* renamed from: c  reason: collision with root package name */
    public Integer f77672c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Integer> f77673d;

    /* renamed from: e  reason: collision with root package name */
    public final t<Boolean> f77674e;

    static {
        Covode.recordClassIndex(48064);
    }

    public abstract f.a.t<BaseResponse> b(int i2);

    public BasePrivacySettingViewModel() {
        t<Integer> tVar = new t<>();
        tVar.setValue(-1);
        this.f77673d = tVar;
        t<Boolean> tVar2 = new t<>();
        tVar2.setValue(false);
        this.f77674e = tVar2;
    }

    public static final class c implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BasePrivacySettingViewModel f77675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77676b;

        static {
            Covode.recordClassIndex(48067);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            this.f77675a.f77672c = null;
            this.f77675a.f77674e.postValue(false);
            this.f77675a.a(this.f77676b, baseResponse2);
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            Activity activity;
            l.d(th, "");
            WeakReference<Activity> weakReference = this.f77675a.f77670a;
            if (!(weakReference == null || (activity = weakReference.get()) == null)) {
                l.b(activity, "");
                new com.bytedance.tux.g.b(activity).e(R.string.de9).b();
            }
            Integer num = this.f77675a.f77672c;
            if (num != null) {
                num.intValue();
                this.f77675a.f77673d.postValue(this.f77675a.f77672c);
                this.f77675a.f77672c = null;
            }
            this.f77675a.f77674e.postValue(false);
            BasePrivacySettingViewModel basePrivacySettingViewModel = this.f77675a;
            l.d(th, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new a(basePrivacySettingViewModel, th));
        }

        c(BasePrivacySettingViewModel basePrivacySettingViewModel, int i2) {
            this.f77675a = basePrivacySettingViewModel;
            this.f77676b = i2;
        }
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {
        final /* synthetic */ Throwable $throwable;
        final /* synthetic */ BasePrivacySettingViewModel this$0;

        static {
            Covode.recordClassIndex(48065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BasePrivacySettingViewModel basePrivacySettingViewModel, Throwable th) {
            super(1);
            this.this$0 = basePrivacySettingViewModel;
            this.$throwable = th;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Change " + this.this$0.f77671b + "} setting fail");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(this.$throwable));
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cause", com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(this.$throwable));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {
        final /* synthetic */ BaseResponse $response;
        final /* synthetic */ BasePrivacySettingViewModel this$0;

        static {
            Covode.recordClassIndex(48066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BasePrivacySettingViewModel basePrivacySettingViewModel, BaseResponse baseResponse) {
            super(1);
            this.this$0 = basePrivacySettingViewModel;
            this.$response = baseResponse;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Change " + this.this$0.f77671b + " setting success");
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(cVar2, com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(this.$response));
        }
    }

    public final void a(int i2) {
        Integer value = this.f77673d.getValue();
        if (value == null || value.intValue() != i2) {
            b(i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new c(this, i2));
            if (this.f77672c == null) {
                this.f77672c = this.f77673d.getValue();
            }
            this.f77674e.postValue(true);
            this.f77673d.postValue(Integer.valueOf(i2));
        }
    }

    public void a(int i2, BaseResponse baseResponse) {
        l.d(baseResponse, "");
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", new b(this, baseResponse));
    }
}
