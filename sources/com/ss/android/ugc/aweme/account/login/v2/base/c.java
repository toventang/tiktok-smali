package com.ss.android.ugc.aweme.account.login.v2.base;

import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class c extends com.ss.android.ugc.aweme.base.f.a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f64720a = i.a((h.f.a.a) new h(this));

    /* renamed from: b  reason: collision with root package name */
    private final h.h f64721b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f64722c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f64723d = i.a((h.f.a.a) new C1442c(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f64724e = i.a((h.f.a.a) new d(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f64725j = i.a((h.f.a.a) new e(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f64726k = i.a((h.f.a.a) new f(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f64727l = i.a((h.f.a.a) new g(this));

    /* renamed from: m  reason: collision with root package name */
    private HashMap f64728m;
    public long t = System.currentTimeMillis();
    public ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> u;

    static {
        Covode.recordClassIndex(39770);
    }

    public final j A() {
        return (j) this.f64727l.getValue();
    }

    public final k V_() {
        return (k) this.f64720a.getValue();
    }

    public String Z_() {
        return "";
    }

    public abstract void a(int i2, String str);

    public abstract void b_(int i2);

    public View c(int i2) {
        if (this.f64728m == null) {
            this.f64728m = new HashMap();
        }
        View view = (View) this.f64728m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64728m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void h() {
        HashMap hashMap = this.f64728m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract boolean q();

    public final k v() {
        return (k) this.f64721b.getValue();
    }

    public final String w() {
        return (String) this.f64722c.getValue();
    }

    public final String x() {
        return (String) this.f64723d.getValue();
    }

    public final String y() {
        return (String) this.f64724e.getValue();
    }

    public final com.bytedance.sdk.a.a.e z() {
        return (com.bytedance.sdk.a.a.e) this.f64726k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final Bundle aa_() {
        return getArguments();
    }

    static final class f extends m implements h.f.a.a<com.bytedance.sdk.a.a.e> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.sdk.a.a.e invoke() {
            return com.bytedance.sdk.a.f.d.a(this.this$0.getContext());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String W_() {
        String w = w();
        l.b(w, "");
        return w;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String X_() {
        String x = x();
        l.b(x, "");
        return x;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.g
    public final String Y_() {
        String y = y();
        l.b(y, "");
        return y;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onDestroyView() {
        B();
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.t = System.currentTimeMillis();
    }

    static final class a extends m implements h.f.a.a<k> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            int value;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                value = arguments.getInt("child_page", k.NONE.getValue());
            } else {
                value = k.NONE.getValue();
            }
            return k.a.a(value);
        }
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_from")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.c$c  reason: collision with other inner class name */
    static final class C1442c extends m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1442c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_method")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class d extends m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("enter_type")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class e extends m implements h.f.a.a<k> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            int value;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                value = arguments.getInt("previous_page", k.NONE.getValue());
            } else {
                value = k.NONE.getValue();
            }
            return k.a.a(value);
        }
    }

    static final class h extends m implements h.f.a.a<k> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            int value;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                value = arguments.getInt("current_page", k.NONE.getValue());
            } else {
                value = k.NONE.getValue();
            }
            return k.a.a(value);
        }
    }

    static final class g extends m implements h.f.a.a<j> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(39777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            int value;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                value = arguments.getInt("current_scene", j.NONE.getValue());
            } else {
                value = j.NONE.getValue();
            }
            j jVar = j.VALUES_MAP.get(Integer.valueOf(value));
            if (jVar == null) {
                return j.SIGN_UP;
            }
            return jVar;
        }
    }

    public final void B() {
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.u)) {
            ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList = this.u;
            if (arrayList == null) {
                l.b();
            }
            for (int size = arrayList.size() - 1; size <= 0; size++) {
                ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList2 = this.u;
                if (arrayList2 == null) {
                    l.b();
                }
                com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b> aVar = arrayList2.get(size);
                l.b(aVar, "");
                com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b> aVar2 = aVar;
                if (!aVar2.f43069a) {
                    aVar2.a();
                }
                ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList3 = this.u;
                if (arrayList3 == null) {
                    l.b();
                }
                arrayList3.remove(size);
            }
        }
    }

    public final void a(Bundle bundle) {
        l.d(bundle, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) ae.a(activity, (ad.b) null).a(ActionResultModel.class)).f64698a.postValue(bundle);
        }
    }

    public final void b(Bundle bundle) {
        l.d(bundle, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) ae.a(activity, (ad.b) null).a(ActionResultModel.class)).f64699b.postValue(bundle);
        }
    }

    public final void a(IBinder iBinder) {
        Object obj;
        l.d(iBinder, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            obj = a(activity, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }

    public final <T extends com.bytedance.sdk.a.a.a.b> void b(com.bytedance.sdk.a.a.a.a<T> aVar) {
        l.d(aVar, "");
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList = this.u;
        if (arrayList == null) {
            l.b();
        }
        arrayList.add(aVar);
    }

    private static Object a(androidx.fragment.app.e eVar, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return eVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return eVar.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return eVar.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = eVar.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }
}
