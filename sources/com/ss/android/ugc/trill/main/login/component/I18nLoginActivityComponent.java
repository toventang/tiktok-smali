package com.ss.android.ugc.trill.main.login.component;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.trill.a.a.a;

public class I18nLoginActivityComponent extends BaseLoginActivityComponent implements c<Boolean>, c {

    /* renamed from: a  reason: collision with root package name */
    public Activity f150500a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f150501b;

    /* renamed from: c  reason: collision with root package name */
    public f f150502c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f150503d;

    /* renamed from: e  reason: collision with root package name */
    public String f150504e;

    /* renamed from: f  reason: collision with root package name */
    public String f150505f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f150506g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private Runnable f150507h = new Runnable() {
        /* class com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent.AnonymousClass1 */

        static {
            Covode.recordClassIndex(98978);
        }

        public final void run() {
            Activity activity;
            if (I18nLoginActivityComponent.this.f150500a != null || (I18nLoginActivityComponent.this.f150501b != null && I18nLoginActivityComponent.this.f150501b.getActivity() != null)) {
                if (I18nLoginActivityComponent.this.f150500a == null) {
                    activity = I18nLoginActivityComponent.this.f150501b.getActivity();
                } else {
                    activity = I18nLoginActivityComponent.this.f150500a;
                }
                bo b2 = b.b();
                IAccountService.d dVar = new IAccountService.d();
                dVar.f62401a = activity;
                dVar.f62402b = I18nLoginActivityComponent.this.f150504e;
                dVar.f62403c = I18nLoginActivityComponent.this.f150505f;
                dVar.f62404d = I18nLoginActivityComponent.this.f150503d;
                dVar.f62405e = new com.ss.android.ugc.trill.a.a.b(I18nLoginActivityComponent.this.f150502c);
                dVar.f62406f = new a(I18nLoginActivityComponent.this.f150500a);
                b2.showLoginAndRegisterView(dVar.a());
            }
        }
    };

    static {
        Covode.recordClassIndex(98977);
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent
    public void onDestroy() {
        super.onDestroy();
        Activity activity = this.f150500a;
        if (activity instanceof m) {
            ((m) activity).getLifecycle().b(this);
        }
        this.f150500a = null;
        this.f150501b = null;
        this.f150503d = null;
        this.f150502c = null;
    }

    @Override // com.ss.android.ugc.aweme.base.c
    public final /* synthetic */ void a(Object obj) {
        Handler handler;
        Fragment fragment;
        Boolean bool = (Boolean) obj;
        if (this.f150500a != null || ((fragment = this.f150501b) != null && fragment.getActivity() != null)) {
            Activity activity = this.f150500a;
            if (activity == null) {
                activity = this.f150501b.getActivity();
            }
            if (bool != null && !bool.booleanValue() && activity != null && !activity.isFinishing() && (handler = this.f150506g) != null) {
                handler.removeCallbacks(this.f150507h);
                this.f150506g.post(this.f150507h);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, com.ss.android.ugc.aweme.base.component.e
    public final void a(Activity activity, String str, String str2, Bundle bundle, f fVar) {
        Bundle bundle2 = bundle;
        if (activity != null && !activity.isFinishing()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            super.a(activity, str, str2, bundle2, fVar);
            this.f150501b = null;
            this.f150500a = activity;
            this.f150503d = bundle2;
            this.f150504e = str;
            this.f150505f = str2;
            this.f150502c = fVar;
            if (bundle2.getBoolean("is_disable_animation", false)) {
                this.f150507h.run();
                return;
            }
            this.f150506g.removeCallbacks(this.f150507h);
            this.f150506g.post(this.f150507h);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, com.ss.android.ugc.aweme.base.component.e
    public final void a(Fragment fragment, String str, String str2, Bundle bundle, f fVar) {
        Bundle bundle2 = bundle;
        if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            super.a(fragment, str, str2, bundle2, fVar);
            this.f150501b = fragment;
            this.f150500a = fragment.getActivity();
            this.f150503d = bundle2;
            this.f150504e = str;
            this.f150505f = str2;
            this.f150502c = fVar;
            if (bundle2.getBoolean("is_disable_animation", false)) {
                this.f150507h.run();
                return;
            }
            this.f150506g.removeCallbacks(this.f150507h);
            this.f150506g.post(this.f150507h);
        }
    }
}
