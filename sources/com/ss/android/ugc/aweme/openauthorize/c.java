package com.ss.android.ugc.aweme.openauthorize;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public class c extends com.bytedance.ies.foundation.activity.a {
    private SparseArray _$_findViewCache;
    private Fragment currentFragment;
    private String mCallerSignature;

    static {
        Covode.recordClassIndex(73701);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(i2, findViewById);
        return findViewById;
    }

    public static Bundle com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class a extends m implements b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f114512a = new a();

        static {
            Covode.recordClassIndex(73702);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f114513a);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        com.ss.android.ugc.aweme.i18n.language.a.a(this);
    }

    private final void getCallerInfo(Intent intent) {
        String callingPackage;
        if (intent != null && (callingPackage = getCallingPackage()) != null) {
            intent.putExtra("_bytedance_params_type_caller_package", callingPackage);
            List<String> a2 = com.bytedance.sdk.a.c.b.b.a(this, callingPackage);
            if (a2 != null && !a2.isEmpty()) {
                this.mCallerSignature = a2.get(0);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        Bundle com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        activityConfiguration(a.f114512a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.i18n.language.a.a(this);
        setContentView(R.layout.az);
        getCallerInfo(getIntent());
        try {
            Intent intent = getIntent();
            if (intent != null && (com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent)) != null) {
                l.b(com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "");
                String str = this.mCallerSignature;
                l.d(com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "");
                com.ss.android.ugc.aweme.authorize.b bVar = new com.ss.android.ugc.aweme.authorize.b();
                com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.putString("caller_signature_key", str);
                bVar.setArguments(com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
                this.currentFragment = bVar;
                getSupportFragmentManager().a().a(R.id.b94, bVar).c();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return true;
        }
        Fragment fragment = this.currentFragment;
        if (fragment == null || !(fragment instanceof com.ss.android.ugc.aweme.authorize.b)) {
            finish();
            return false;
        }
        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment");
        ((com.ss.android.ugc.aweme.authorize.b) fragment).b();
        return false;
    }
}
