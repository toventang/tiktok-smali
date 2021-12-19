package com.ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.framework.d.c;
import java.util.List;

public class a extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private c f108089a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f108090b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f108091c;

    /* access modifiers changed from: protected */
    public int e() {
        return -1;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void dismissCustomToast() {
        c cVar = this.f108089a;
        if (cVar != null) {
            cVar.c();
        }
    }

    static {
        Covode.recordClassIndex(69301);
        Live.getService();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f108089a;
        if (cVar != null) {
            cVar.a();
        }
    }

    private boolean a() {
        if (isDestroyed()) {
            return false;
        }
        if (this.f108089a != null) {
            return true;
        }
        c cVar = new c(this);
        this.f108089a = cVar;
        cVar.f96685g = this.f108090b;
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        super.onPause();
        c cVar = this.f108089a;
        if (cVar != null) {
            cVar.b();
        }
        com.bytedance.ies.dmt.ui.f.a.f33482a = this.f108091c;
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(-1);
        }
    }

    /* access modifiers changed from: protected */
    public final void f() {
        List<Fragment> f2 = getSupportFragmentManager().f();
        if (!f2.isEmpty()) {
            n a2 = getSupportFragmentManager().a();
            for (Fragment fragment : f2) {
                a2.a(fragment);
            }
            a2.e();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        super.onResume();
        c cVar = this.f108089a;
        if (cVar != null) {
            cVar.f96684f = false;
        }
        this.f108091c = com.bytedance.ies.dmt.ui.f.a.f33482a;
        com.bytedance.ies.dmt.ui.f.a.f33482a = true;
        IHostApp iHostApp = (IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(e());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void showCustomToast(String str) {
        if (a()) {
            this.f108089a.a(str);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context a2 = d.a();
        if (a2 != null) {
            com.ss.android.ugc.aweme.i18n.language.a.a(a2);
        }
        this.f108090b = false;
        if (Build.VERSION.SDK_INT >= 21 && Live.getService() != null && ((Boolean) Live.getService().a("live_nav_black", (Object) false)).booleanValue()) {
            Window window = getWindow();
            window.getDecorView().setSystemUiVisibility(256);
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(-16777216);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.common.utility.f
    public void showCustomLongToast(int i2, String str) {
        if (a()) {
            this.f108089a.a(i2, str);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void showCustomToast(int i2, String str) {
        if (a()) {
            this.f108089a.b(i2, str);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void showCustomToast(String str, int i2, int i3) {
        if (a()) {
            this.f108089a.a(0, str, i2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.common.utility.f
    public void showCustomToast(int i2, String str, int i3, int i4) {
        if (a()) {
            this.f108089a.a(i2, str, i3);
        }
    }
}
