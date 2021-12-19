package com.ss.android.ugc.aweme.kids.commonfeed.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public abstract class a extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.commonfeed.c.a f106230a;

    /* renamed from: b  reason: collision with root package name */
    private b f106231b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f106232c;

    static {
        Covode.recordClassIndex(67919);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106232c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f106232c == null) {
            this.f106232c = new HashMap();
        }
        View view = (View) this.f106232c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106232c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public abstract com.ss.android.ugc.aweme.kids.commonfeed.c.a a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    public String f() {
        return null;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        super.onPause();
        b bVar = this.f106231b;
        if (bVar != null) {
            bVar.f106236a.f();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        super.onResume();
        b bVar = this.f106231b;
        if (bVar != null) {
            bVar.a();
        }
        b bVar2 = this.f106231b;
        if (bVar2 != null) {
            View view = bVar2.f106242k;
            if (view == null) {
                l.a("bottomSpaceView");
            }
            view.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.a$a  reason: collision with other inner class name */
    static final class C2710a extends m implements b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2710a f106233a = new C2710a();

        static {
            Covode.recordClassIndex(67920);
        }

        C2710a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106234a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C2710a.f106233a);
        super.onCreate(bundle);
        setContentView(R.layout.acu);
        this.f106230a = a();
        Fragment a2 = getSupportFragmentManager().a(b());
        if (!(a2 instanceof b)) {
            a2 = null;
        }
        b bVar = (b) a2;
        this.f106231b = bVar;
        if (bVar == null) {
            String d2 = d();
            String c2 = c();
            String e2 = e();
            com.ss.android.ugc.aweme.kids.commonfeed.c.a aVar = this.f106230a;
            if (aVar == null) {
                l.a("feedDelegate");
            }
            String f2 = f();
            l.d(d2, "");
            l.d(c2, "");
            l.d(aVar, "");
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from", c2);
            if (e2 != null) {
                bundle2.putString("current_id", e2);
            }
            bundle2.putString("title", d2);
            b bVar2 = new b();
            bVar2.f106237b = aVar;
            bVar2.f106238c = f2;
            bVar2.setArguments(bundle2);
            n a3 = getSupportFragmentManager().a();
            l.b(a3, "");
            a3.b(R.id.b94, bVar2, b());
            a3.c(bVar2).b();
            this.f106231b = bVar2;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z;
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (i2 == 24) {
            z = true;
        } else {
            z = false;
        }
        c.a(new com.ss.android.ugc.aweme.kids.common.b.c(z));
        return true;
    }
}
