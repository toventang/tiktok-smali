package com.ss.android.ugc.aweme.bullet;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.bullet.ui.common.a;
import com.bytedance.ies.bullet.ui.common.k;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.base.a.b;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.base.a.i;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize.utils.ay;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.d.c;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.gw;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class BulletContainerActivity extends a implements f, com.ss.android.ugc.aweme.base.a.f, g {

    /* renamed from: l  reason: collision with root package name */
    public boolean f68822l;

    /* renamed from: m  reason: collision with root package name */
    private c f68823m;
    private b n;
    private com.bytedance.ies.bullet.service.f.a.b o;
    private List<com.ss.android.ugc.aweme.base.a.a> p;
    private final d.b q = b.a().a();
    private long r;
    private boolean s;
    private String t;
    private SparseArray u;

    static {
        Covode.recordClassIndex(42395);
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public View a(int i2) {
        if (this.u == null) {
            this.u = new SparseArray();
        }
        View view = (View) this.u.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.u.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public final View a(ViewGroup viewGroup, Uri uri) {
        l.d(viewGroup, "");
        l.d(uri, "");
        return null;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.bullet.ui.common.j
    public final d.b s() {
        return this.q;
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public final k.b j() {
        return new com.bytedance.ies.bullet.ui.common.view.a();
    }

    private final boolean x() {
        return getIntent().getBooleanExtra("from_promote_live", false);
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public final CharSequence i() {
        String string = getString(R.string.g4z);
        l.b(string, "");
        return string;
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public final View k() {
        return BulletService.f().a(this);
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public final boolean l() {
        g().c();
        return true;
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public final boolean m() {
        g().d();
        return true;
    }

    /* access modifiers changed from: protected */
    public int v() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra("activity_translation_type", 0);
        }
        return 0;
    }

    private final boolean w() {
        if (isFinishing()) {
            return false;
        }
        if (this.f68823m != null) {
            return true;
        }
        c cVar = new c(this);
        this.f68823m = cVar;
        cVar.f96685g = false;
        return true;
    }

    @Override // com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public final void n() {
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            com.bytedance.ies.bullet.ui.common.d.d.a(this, getWindow(), false);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        c cVar = this.f68823m;
        if (cVar != null) {
            cVar.a();
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.crossplatform.b.d(System.currentTimeMillis() - this.r));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        c cVar = this.f68823m;
        if (cVar != null) {
            cVar.b();
        }
        com.bytedance.tux.g.d.b(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", true);
        super.onResume();
        c cVar = this.f68823m;
        if (cVar != null) {
            cVar.f96684f = false;
        }
        this.f68822l = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.bullet.ui.common.a
    public void finish() {
        com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar;
        com.ss.android.ugc.aweme.commercialize.utils.l.a(this);
        super.finish();
        Boolean bool = null;
        ay.f75622a = null;
        if (!x()) {
            com.bytedance.ies.bullet.service.f.a.b bVar = this.o;
            if (!(bVar == null || (dVar = bVar.F) == null)) {
                bool = dVar.b();
            }
            if (!l.a((Object) bool, (Object) true)) {
                com.ss.android.ugc.aweme.base.a.d.a(this, v(), false);
            }
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.ss.android.ugc.aweme.i18n.language.a.a(this);
    }

    @Override // com.ss.android.ugc.aweme.base.a.f
    public void setActivityResultListener(b bVar) {
        l.d(bVar, "");
        this.n = bVar;
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void unRegisterActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(aVar, "");
        List<com.ss.android.ugc.aweme.base.a.a> list = this.p;
        if (list != null) {
            list.remove(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        com.ss.android.ugc.aweme.bz.a.a(context);
        Context b2 = com.ss.android.ugc.aweme.i18n.language.i18n.c.b(context);
        com.google.android.play.core.d.a.a(b2, false);
        IPluginService d2 = AabPluginServiceImpl.d();
        l.b(d2, "");
        d2.c().a(b2);
        super.attachBaseContext(b2);
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void registerActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(aVar, "");
        if (this.p == null) {
            this.p = new ArrayList();
        }
        List<com.ss.android.ugc.aweme.base.a.a> list = this.p;
        if (list != null && !list.contains(aVar)) {
            list.add(aVar);
        }
    }

    private final void b(int i2) {
        if (!this.s && this.t != null) {
            JSONObject jSONObject = new JSONObject(this.t);
            try {
                jSONObject.put("status", String.valueOf(i2)).put("duration", System.currentTimeMillis() - this.r);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            r.a("request_anchor_detail", jSONObject);
            this.s = true;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        String str;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", true);
        Intent intent = getIntent();
        Uri uri = null;
        if (intent != null) {
            str = a(intent, "resso_key");
        } else {
            str = null;
        }
        this.t = str;
        this.r = System.currentTimeMillis();
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            setTheme(R.style.ol);
            i.a(this);
        }
        this.f33058h = true;
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("from_promote_live", false)) {
            o();
            overridePendingTransition(0, 0);
        }
        getLifecycle().a(new BulletEventObserver(((a) this).f33052b, this));
        gw a2 = gw.a();
        Intent intent2 = getIntent();
        if (intent2 != null) {
            uri = intent2.getData();
        }
        a2.a(uri);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", false);
        com.ss.android.ugc.aweme.i18n.language.a.a(this);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.utility.f
    public void showCustomLongToast(int i2, String str) {
        c cVar;
        l.d(str, "");
        if (w() && (cVar = this.f68823m) != null) {
            cVar.a(i2, str);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.a
    public final void a(Uri uri, Throwable th) {
        l.d(uri, "");
        l.d(th, "");
        super.a(uri, th);
        b(0);
    }

    @Override // androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        List<com.ss.android.ugc.aweme.base.a.a> list = this.p;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(i2, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.uikit.a.a, com.bytedance.ies.bullet.ui.common.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        b bVar = this.n;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.a
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        super.a(view, uri, iVar);
        b(1);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.a
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
        super.a(iVar, uri, qVar);
        if (qVar instanceof com.bytedance.ies.bullet.service.f.a.b) {
            com.bytedance.ies.bullet.service.f.a.b bVar = (com.bytedance.ies.bullet.service.f.a.b) qVar;
            this.o = bVar;
            if (!x() && (!l.a((Object) bVar.F.b(), (Object) true))) {
                com.ss.android.ugc.aweme.base.a.d.a(this, v(), true);
            }
        }
    }

    @Override // com.bytedance.common.utility.f
    public void showCustomToast(int i2, String str, int i3, int i4) {
        c cVar;
        l.d(str, "");
        if (w() && (cVar = this.f68823m) != null) {
            cVar.a(i2, str, i3);
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b, com.bytedance.ies.bullet.ui.common.a
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        t b2;
        com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar;
        com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar2;
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
        super.a(list, uri, iVar, z);
        if (iVar.b() == com.bytedance.ies.bullet.service.f.a.b.b.RN) {
            com.bytedance.ies.bullet.service.f.a.b bVar = this.o;
            if (!(bVar == null || (dVar2 = bVar.C) == null)) {
                dVar2.a((Boolean) true);
            }
            com.bytedance.ies.bullet.service.f.a.b bVar2 = this.o;
            if (!(bVar2 == null || (dVar = bVar2.f32687c) == null)) {
                dVar.a((Boolean) true);
            }
            o();
        }
        com.bytedance.ies.bullet.service.f.a.b bVar3 = this.o;
        if (bVar3 != null && bVar3.f32690f.b() == com.bytedance.ies.bullet.service.f.a.b.r.AUTO && (b2 = bVar3.f32689e.b()) != null && b2.f32728a == -2) {
            l.d(this, "");
            ez.a(this, androidx.core.content.b.c(this, R.color.bz));
        }
    }
}
