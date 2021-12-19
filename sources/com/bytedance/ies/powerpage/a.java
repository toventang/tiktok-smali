package com.bytedance.ies.powerpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import h.z;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class a extends d implements b {
    public static final C0766a Companion = new C0766a((byte) 0);
    private HashMap _$_findViewCache;
    private Fragment mRootFragment;

    static {
        Covode.recordClassIndex(20572);
    }

    public static int com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onBeforeActivityCreated(Activity activity) {
    }

    /* renamed from: com.bytedance.ies.powerpage.a$a  reason: collision with other inner class name */
    public static final class C0766a {
        static {
            Covode.recordClassIndex(20573);
        }

        private C0766a() {
        }

        public /* synthetic */ C0766a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onBackPressed_Activity() {
        super.onBackPressed();
    }

    public final String getRootFragmentClsName() {
        return com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
    }

    public final Fragment getRootFragment() {
        Fragment fragment = this.mRootFragment;
        if (fragment != null) {
            return fragment;
        }
        i supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            return supportFragmentManager.a(R.id.d7y);
        }
        return null;
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        Fragment fragment = this.mRootFragment;
        if (!(fragment instanceof b)) {
            super.onBackPressed();
        } else if (fragment != null) {
            ((b) fragment).onBackPressed_Activity();
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }

    public static Bundle com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Fragment fragment = this.mRootFragment;
        if (fragment != null) {
            injectFields(fragment, intent);
            if (!(fragment instanceof b)) {
                fragment = null;
            }
            b bVar = (b) fragment;
            if (bVar != null) {
                bVar.onNewIntent(intent);
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
        if (com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
            Fragment a2 = getSupportFragmentManager().a(R.id.d7y);
            b bVar = null;
            if (a2 != null) {
                this.mRootFragment = a2;
                l.a((Object) a2, "");
                injectFields(a2, getIntent());
            } else {
                Object newInstance = Class.forName(com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra).newInstance();
                if (!(newInstance instanceof Fragment)) {
                    newInstance = null;
                }
                Fragment fragment = (Fragment) newInstance;
                if (fragment != null) {
                    this.mRootFragment = fragment;
                    injectFields(fragment, getIntent());
                    getSupportFragmentManager().a().a(R.id.d7y, fragment).c();
                }
            }
            Fragment fragment2 = this.mRootFragment;
            if (fragment2 instanceof b) {
                bVar = fragment2;
            }
            b bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.onBeforeActivityCreated(this);
            }
            setContentView(R.layout.bv);
        }
    }

    public static String com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void injectFields(Fragment fragment, Intent intent) {
        Class<?> loadClass;
        Constructor<?> constructor;
        if (intent != null) {
            Class<?> cls = fragment.getClass();
            String name = cls.getName();
            com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i("PowerActivity", "injecting fields for ".concat(String.valueOf(name)));
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (!(classLoader == null || (loadClass = classLoader.loadClass(name + "__BindExtra")) == null || (constructor = loadClass.getConstructor(cls, Intent.class)) == null)) {
                    constructor.newInstance(fragment, intent);
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("injecting fields field\n");
                e2.printStackTrace();
                com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e("PowerActivity", sb.append(z.f158842a.toString()).toString());
            }
            if (fragment.getArguments() == null) {
                fragment.setArguments(new Bundle());
            }
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                arguments.putAll(com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
            }
        }
    }

    @Override // com.bytedance.ies.powerpage.b
    public void onActivityResult_Activity(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        Fragment fragment = this.mRootFragment;
        if (!(fragment instanceof b)) {
            fragment = null;
        }
        b bVar = (b) fragment;
        if (bVar != null) {
            bVar.onActivityResult_Activity(i2, i3, intent);
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }
}
