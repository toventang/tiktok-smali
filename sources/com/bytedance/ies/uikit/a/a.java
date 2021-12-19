package com.bytedance.ies.uikit.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.d;
import com.bytedance.ies.uikit.e.b;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class a extends d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f35352c;

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f35353e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static com.bytedance.common.utility.collection.d<a> f35354f = new com.bytedance.common.utility.collection.d<>();

    /* renamed from: k  reason: collision with root package name */
    public static int f35355k = 0;

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.common.utility.collection.d<e> f35356a = new com.bytedance.common.utility.collection.d<>();

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f35357b;

    /* renamed from: d  reason: collision with root package name */
    private String f35358d;

    /* renamed from: g  reason: collision with root package name */
    private boolean f35359g;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f35360i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f35361j;

    public final boolean t() {
        return this.f35360i;
    }

    public final boolean u() {
        if (!this.f35361j) {
            return true;
        }
        return false;
    }

    private int g() {
        return getResources().getColor(R.color.f0);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        super.onStart();
        f35355k++;
    }

    static {
        Covode.recordClassIndex(21168);
    }

    /* access modifiers changed from: protected */
    public void n() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(g());
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        com.bytedance.ies.uikit.c.a.a(this, g());
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        super.onPause();
        this.f35360i = false;
        d.a a2 = d.a();
        if (a2 != null) {
            a2.b(this);
        }
        if (!this.f35356a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35356a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        super.onResume();
        this.f35360i = true;
        d.a a2 = d.a();
        if (a2 != null) {
            a2.a(this);
        }
        if (!this.f35356a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35356a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        super.onStop();
        f35355k--;
        this.f35360i = false;
        if (!this.f35356a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35356a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f35357b);
        super.onDestroy();
        this.f35361j = true;
        if (!this.f35356a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35356a.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next != null) {
                    next.a();
                }
            }
            this.f35356a.f26927a.clear();
        }
        try {
            f35353e.remove(this.f35358d);
        } catch (Throwable unused) {
        }
        Logger.debug();
    }

    @Override // androidx.appcompat.app.d
    public void onSupportContentChanged() {
        View findViewById;
        super.onSupportContentChanged();
        if (!this.f35359g && (findViewById = findViewById(R.id.c0)) != null) {
            ViewParent parent = findViewById.getParent();
            if (FrameLayout.class.isInstance(parent)) {
                View findViewById2 = findViewById(16908290);
                if (FrameLayout.class.isInstance(findViewById2)) {
                    FrameLayout frameLayout = (FrameLayout) findViewById2;
                    if (frameLayout.getChildCount() == 1) {
                        View childAt = frameLayout.getChildAt(0);
                        frameLayout.removeAllViews();
                        FrameLayout frameLayout2 = (FrameLayout) parent;
                        frameLayout2.addView(childAt);
                        findViewById2.setId(-1);
                        frameLayout2.setId(16908290);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public void setContentView(View view) {
        if (b.f35472a) {
            a(view);
        } else {
            super.setContentView(view);
        }
        n();
    }

    private void a(View view) {
        com.bytedance.ies.uikit.b.b bVar = new com.bytedance.ies.uikit.b.b(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bVar.setPadding(0, 0, 0, 0);
        bVar.setLayoutParams(layoutParams);
        super.setContentView(bVar, new ViewGroup.LayoutParams(-1, -1));
        bVar.addView(view, -1, -1);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.f35358d = bundle.getString("abs_Activity_Key");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putString("abs_Activity_Key", this.f35358d);
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    public void setContentView(int i2) {
        if (b.f35472a) {
            try {
                a(LayoutInflater.from(this).inflate(i2, (ViewGroup) null));
            } catch (InflateException unused) {
            }
            n();
        }
        super.setContentView(i2);
        n();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || !bundle.containsKey("abs_Activity_Key")) {
            StringBuilder append = new StringBuilder().append(getClass().getCanonicalName()).append("@");
            int i2 = f35352c;
            f35352c = i2 + 1;
            this.f35358d = append.append(i2).toString();
        } else {
            this.f35358d = bundle.getString("abs_Activity_Key");
        }
        this.f35357b = new BroadcastReceiver() {
            /* class com.bytedance.ies.uikit.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(21169);
            }

            public final void onReceive(Context context, Intent intent) {
                if (!a.this.isFinishing()) {
                    a.this.finish();
                }
            }
        };
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f35357b, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        try {
            f35354f.a(this);
            f35353e.add(this.f35358d);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.e
    public void onActivityResult(int i2, int i3, Intent intent) {
        d.b bVar = d.f35382c;
        if (bVar == null || !bVar.a()) {
            super.onActivityResult(i2, i3, intent);
        }
    }
}
