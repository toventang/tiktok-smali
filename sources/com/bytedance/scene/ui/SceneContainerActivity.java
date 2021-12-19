package com.bytedance.scene.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.c.f;
import com.bytedance.scene.c.g;
import com.bytedance.scene.d.e;
import com.bytedance.scene.i;
import com.bytedance.scene.j;
import com.bytedance.scene.n;
import com.bytedance.scene.v;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SceneContainerActivity extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<g> f43040a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final List<SceneContainerActivity> f43041b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f43042c = -1;

    /* renamed from: d  reason: collision with root package name */
    private n f43043d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f43044e;

    @Override // androidx.fragment.app.e
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    static class b extends com.bytedance.scene.a.d {
        static {
            Covode.recordClassIndex(26382);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.scene.a.d
        public final void a(com.bytedance.scene.a.a aVar, com.bytedance.scene.a.a aVar2, Runnable runnable, com.bytedance.scene.d.b bVar) {
            runnable.run();
        }

        @Override // com.bytedance.scene.a.d
        public final void b(com.bytedance.scene.a.a aVar, com.bytedance.scene.a.a aVar2, Runnable runnable, com.bytedance.scene.d.b bVar) {
            MethodCollector.i(2005);
            View view = aVar.f42664b;
            View view2 = aVar2.f42664b;
            com.bytedance.scene.d.a.a(view);
            com.bytedance.scene.d.a.a(view2);
            view.setVisibility(0);
            int i2 = Build.VERSION.SDK_INT;
            this.f42680a.getOverlay().add(view);
            runnable.run();
            MethodCollector.o(2005);
        }
    }

    @Override // androidx.fragment.app.e
    public void onBackPressed() {
        if (!this.f43043d.a()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        f43041b.remove(this);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        this.f43044e = true;
    }

    static {
        Covode.recordClassIndex(26379);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        this.f43044e = false;
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public static class a extends j {
        static {
            Covode.recordClassIndex(26380);
        }

        @Override // com.bytedance.scene.j
        public final void a(Bundle bundle) {
            super.a(bundle);
            e<? extends Class<? extends j>, Bundle> a2 = SceneContainerActivity.a(t().getIntent());
            f.a aVar = new f.a();
            aVar.f42754c = new b((byte) 0);
            aVar.f42753b = new g() {
                /* class com.bytedance.scene.ui.SceneContainerActivity.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(26381);
                }

                @Override // com.bytedance.scene.c.g
                public final void a(Object obj) {
                    v a2 = v.a(a.this.t().getIntent());
                    Message obtain = Message.obtain();
                    obtain.obj = obj;
                    try {
                        a2.f43062a.send(obtain);
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                    a.this.t().finish();
                }
            };
            com.bytedance.scene.navigation.e.b(this).a(a2.f42770a, a2.f42771b, aVar.b());
        }

        @Override // com.bytedance.scene.j
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            MethodCollector.i(1401);
            View view = new View(t());
            MethodCollector.o(1401);
            return view;
        }
    }

    public static e<? extends Class<? extends j>, Bundle> a(Intent intent) {
        try {
            Class<?> cls = Class.forName(a(intent, "class_name"));
            Bundle bundleExtra = intent.getBundleExtra("arguments");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            return e.a(cls, bundleExtra);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        this.f43042c = intExtra;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        }
        f43041b.add(this);
        if (v.a(getIntent()) != null) {
            this.f43043d = i.a(this, new com.bytedance.scene.navigation.g(a.class, (Bundle) null));
            return;
        }
        e<? extends Class<? extends j>, Bundle> a2 = a(getIntent());
        this.f43043d = i.a(this, new com.bytedance.scene.navigation.g((Class<? extends j>) a2.f42770a, a2.f42771b));
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
