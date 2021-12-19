package com.bytedance.ies.foundation.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.c;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.ies.foundation.base.e;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.activity.processor.v;
import com.ss.android.ugc.aweme.utils.ft;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class a extends com.bytedance.ies.powerpage.a implements e, v {
    public static final C0737a Companion = new C0737a((byte) 0);
    public static final c callback;
    public static h.f.a.a<? extends List<? extends d>> processGenerator;
    public static Class<? extends BaseActivityViewModel> viewModelClass = BaseActivityViewModel.class;
    private final /* synthetic */ com.ss.android.ugc.aweme.activity.processor.b $$delegate_0 = new com.ss.android.ugc.aweme.activity.processor.b();
    private SparseArray _$_findViewCache;
    private WeakReference<a> activityRef;
    private final h baseViewModel$delegate = i.a((h.f.a.a) new b(this));
    public final List<d> innerProcessors;

    private final BaseActivityViewModel getBaseViewModel() {
        return (BaseActivityViewModel) this.baseViewModel$delegate.getValue();
    }

    @Override // com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.powerpage.a
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

    public void buildCommonIntent() {
    }

    public void dismissCustomToast() {
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause(this);
    }

    @Override // com.bytedance.common.utility.f
    public void showCustomLongToast(int i2, String str) {
        this.$$delegate_0.showCustomLongToast(i2, str);
    }

    public void showCustomToast(int i2, String str) {
        this.$$delegate_0.b(str);
    }

    @Override // com.bytedance.common.utility.f
    public void showCustomToast(int i2, String str, int i3, int i4) {
        this.$$delegate_0.showCustomToast(i2, str, i3, i4);
    }

    public void showCustomToast(String str) {
        this.$$delegate_0.a(str);
    }

    /* renamed from: com.bytedance.ies.foundation.activity.a$a  reason: collision with other inner class name */
    public static final class C0737a {
        static {
            Covode.recordClassIndex(20075);
        }

        private C0737a() {
        }

        public /* synthetic */ C0737a(byte b2) {
            this();
        }

        public static void a(b bVar) {
            l.d(bVar, "");
            c cVar = a.callback;
            l.d(bVar, "");
            cVar.f33830a.add(bVar);
        }
    }

    static final class b extends m implements h.f.a.a<BaseActivityViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BaseActivityViewModel invoke() {
            return this.this$0.getViewModel();
        }
    }

    @Override // com.bytedance.ies.foundation.base.e
    public BaseViewModel provideBaseViewModel() {
        return getBaseViewModel();
    }

    public final BaseActivityViewModel getViewModel() {
        return (BaseActivityViewModel) com_bytedance_ies_foundation_activity_BaseActivity_androidx_lifecycle_VScopeLancet_of(this).a(viewModelClass);
    }

    public void BaseActivity__onPause$___twin___() {
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.u.f33844a, 6);
        super.onPause();
        l.d(this, "");
        c.a(cVar, this, false, null, c.n.f33839a, 6);
    }

    public void finish() {
        super.finish();
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.a.f33831a, 6);
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null && (!SmartRouter.isSmartIntent(intent))) {
            intent = SmartRouter.smartIntent(intent);
            setIntent(intent);
        }
        l.b(intent, "");
        return intent;
    }

    public final boolean isActive() {
        i.b bVar;
        androidx.lifecycle.i lifecycle = getLifecycle();
        if (lifecycle != null) {
            bVar = lifecycle.a();
        } else {
            bVar = null;
        }
        if (bVar == i.b.RESUMED) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.t.f33843a, 6);
        super.onDestroy();
        l.d(this, "");
        c.a(cVar, this, false, null, c.m.f33838a, 6);
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.v.f33845a, 6);
        super.onResume();
        l.d(this, "");
        c.a(cVar, this, false, null, c.o.f33840a, 6);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.x.f33846a, 6);
        super.onStart();
        l.d(this, "");
        c.a(cVar, this, false, null, c.q.f33841a, 6);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.y.f33847a, 6);
        super.onStop();
        l.d(this, "");
        c.a(cVar, this, false, null, c.r.f33842a, 6);
    }

    @Override // androidx.appcompat.app.d
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, c.ac.f33832a, 6);
    }

    static {
        Covode.recordClassIndex(20074);
        c cVar = new c();
        callback = cVar;
        Context a2 = d.a();
        if (!(a2 instanceof Application)) {
            a2 = null;
        }
        Application application = (Application) a2;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(cVar);
        }
    }

    public a() {
        List<d> list;
        h.f.a.a<? extends List<? extends d>> aVar = processGenerator;
        if (aVar != null) {
            list = (List) aVar.invoke();
        } else {
            list = null;
        }
        this.innerProcessors = list;
    }

    @Override // androidx.appcompat.app.d
    public Resources getResources() {
        T t = (T) super.getResources();
        c cVar = callback;
        l.b(t, "");
        l.d(this, "");
        l.d(t, "");
        z.e eVar = new z.e();
        eVar.element = t;
        Resources resources = (Resources) cVar.a(this, false, eVar.element, new c.b(eVar));
        return resources == null ? t : resources;
    }

    public static ad com_bytedance_ies_foundation_activity_BaseActivity_androidx_lifecycle_VScopeLancet_of(androidx.fragment.app.e eVar) {
        return ae.a(eVar, (ad.b) null);
    }

    public static void com_bytedance_ies_foundation_activity_BaseActivity_com_ss_android_ugc_aweme_lancet_CommonUILancet_onBaseAcitivtyPause(a aVar) {
        aVar.BaseActivity__onPause$___twin___();
        ft.f142952a = aVar.getClass();
    }

    public final void activityConfiguration(h.f.a.b<? super BaseActivityViewModel, h.z> bVar) {
        l.d(bVar, "");
        bVar.invoke(getViewModel());
    }

    public void setActivityRef(WeakReference<a> weakReference) {
        l.d(weakReference, "");
        com.ss.android.ugc.aweme.activity.processor.b bVar = this.$$delegate_0;
        l.d(weakReference, "");
        bVar.f65533a = weakReference;
    }

    @Override // android.view.ContextThemeWrapper, androidx.appcompat.app.d, android.app.Activity
    public void setTheme(int i2) {
        try {
            super.setTheme(i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "");
        super.onConfigurationChanged(configuration);
        c cVar = callback;
        l.d(this, "");
        l.d(configuration, "");
        c.a(cVar, this, false, null, new c.z(configuration), 6);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onRestoreInstanceState(bundle);
        c cVar = callback;
        l.d(this, "");
        l.d(bundle, "");
        c.a(cVar, this, false, null, new c.ab(bundle), 6);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, new c.ad(z), 6);
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public void setContentView(int i2) {
        super.setContentView(i2);
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, new c.ae(this, i2), 6);
    }

    public void attachBaseContext(Context context) {
        Iterator<b> it = callback.f33830a.iterator();
        while (it.hasNext()) {
            context = it.next().a(context);
        }
        super.attachBaseContext(context);
        c cVar = callback;
        l.d(this, "");
        Iterator<b> it2 = cVar.f33830a.iterator();
        while (it2.hasNext()) {
            it2.next().a((Activity) this);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        this.activityRef = new WeakReference<>(this);
        BaseActivityViewModel baseViewModel = getBaseViewModel();
        if (!baseViewModel.initialized) {
            buildCommonIntent();
            baseViewModel.init();
        }
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, true, null, new c.s(bundle), 4);
        super.onCreate(bundle);
        l.d(this, "");
        c.a(cVar, this, false, null, new c.l(bundle), 6);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        c cVar = callback;
        l.d(this, "");
        l.d(bundle, "");
        c.a(cVar, this, false, null, new c.w(bundle), 6);
        super.onSaveInstanceState(bundle);
        l.d(this, "");
        l.d(bundle, "");
        c.a(cVar, this, false, null, new c.p(bundle), 6);
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, new c.af(this, view), 6);
    }

    public void onActivityReenter(int i2, Intent intent) {
        super.onActivityReenter(i2, intent);
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, new c.f(i2, intent), 6);
    }

    @Override // androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        c cVar = callback;
        l.d(this, "");
        Boolean bool = (Boolean) c.a(cVar, this, false, false, new c.aa(i2, keyEvent), 2);
        if (bool == null || !bool.booleanValue()) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        c cVar = callback;
        l.d(this, "");
        c.a(cVar, this, false, null, new c.g(i2, i3, intent), 6);
    }

    public void showCustomToast(String str, int i2, int i3) {
        this.$$delegate_0.a(str);
    }

    @Override // androidx.fragment.app.e
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        l.d(this, "");
        Iterator<com.bytedance.ies.foundation.base.c> it = getViewModel().getProcessors().iterator();
        while (it.hasNext()) {
            it.next();
            l.d(this, "");
            l.d(this, "");
        }
        super.startActivityForResult(intent, i2, bundle);
    }
}
