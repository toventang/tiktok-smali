package com.ss.android.ugc.aweme.account.login.v2.base;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public abstract class b extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private Fragment f64717a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64718b;

    final /* synthetic */ class c implements u {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f64719a;

        static {
            Covode.recordClassIndex(39769);
        }

        c(h.f.a.b bVar) {
            this.f64719a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            l.b(this.f64719a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(39766);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f64718b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f64718b == null) {
            this.f64718b = new HashMap();
        }
        View view = (View) this.f64718b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f64718b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void b(Bundle bundle);

    private final void c() {
        if (isActive()) {
            getSupportFragmentManager().c();
        }
    }

    public void a() {
        setContentView(R.layout.gs);
    }

    /* access modifiers changed from: protected */
    public final c d() {
        return (c) getSupportFragmentManager().a(R.id.b94);
    }

    public final String e() {
        String a2 = a(getIntent(), "enter_from");
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    public final String f() {
        String a2 = a(getIntent(), "enter_method");
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final String g() {
        String a2 = a(getIntent(), "enter_type");
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    public void b() {
        getWindow().setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this, R.color.f159928l)));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        c d2 = d();
        if (d2 == null || !d2.q()) {
            i supportFragmentManager = getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            if (supportFragmentManager.e() == 1) {
                finish();
            } else {
                c();
            }
        }
    }

    static final /* synthetic */ class a extends j implements h.f.a.b<Bundle, z> {
        static {
            Covode.recordClassIndex(39767);
        }

        a(b bVar) {
            super(1, bVar, b.class, "handleActionTransition", "handleActionTransition(Landroid/os/Bundle;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bundle bundle) {
            ((b) this.receiver).a(bundle);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b$b  reason: collision with other inner class name */
    static final /* synthetic */ class C1441b extends j implements h.f.a.b<Bundle, z> {
        static {
            Covode.recordClassIndex(39768);
        }

        C1441b(b bVar) {
            super(1, bVar, b.class, "handleSuccess", "handleSuccess(Landroid/os/Bundle;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Bundle bundle) {
            ((b) this.receiver).b(bundle);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
        a();
        ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a.observe(this, new c(new a(this)));
        ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64699b.observe(this, new c(new C1441b(this)));
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Fragment fragment = this.f64717a;
        if (fragment != null) {
            fragment.onActivityResult(i2, i3, intent);
        }
    }

    public static /* synthetic */ void a(b bVar, c cVar, Bundle bundle) {
        String str = "";
        l.d(cVar, str);
        l.d(bundle, str);
        i supportFragmentManager = bVar.getSupportFragmentManager();
        l.b(supportFragmentManager, str);
        int e2 = supportFragmentManager.e();
        if (bundle.getBoolean("finish_before_jump", false)) {
            e2--;
            bundle.putBoolean("finish_before_jump", false);
            bVar.c();
        }
        bVar.f64717a = cVar;
        cVar.setArguments(bundle);
        n a2 = bVar.getSupportFragmentManager().a();
        l.b(a2, str);
        if (e2 > 0 && bundle.getBoolean("open_page_without_animation", false)) {
            a2.a(R.anim.dq, R.anim.a8, R.anim.f354do, R.anim.a9);
        }
        String Z_ = cVar.Z_();
        if (TextUtils.isEmpty(Z_)) {
            int i2 = bundle.getInt("current_page", -10);
            if (i2 != -10) {
                str = String.valueOf(i2);
            }
            Z_ = str;
        }
        a2.b(R.id.b94, cVar, Z_);
        if (l.a((Object) true, (Object) true)) {
            a2.a((String) null);
        }
        a2.c();
        if (cVar instanceof com.ss.android.ugc.aweme.account.login.v2.ui.a.a) {
            com.bytedance.analytics.b.a((com.bytedance.analytics.page.b) cVar);
        }
    }
}
