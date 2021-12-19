package com.ss.android.ugc.aweme.anchor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.ss.android.ugc.aweme.aa;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.ae;
import com.ss.android.ugc.aweme.af;
import com.ss.android.ugc.aweme.ag;
import com.ss.android.ugc.aweme.ai;
import com.ss.android.ugc.aweme.ak;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.bh;
import com.ss.android.ugc.aweme.bl;
import com.ss.android.ugc.aweme.liveevent.j;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class AnchorBaseActivity extends com.bytedance.ies.foundation.activity.a implements bl {

    /* renamed from: a  reason: collision with root package name */
    private af f66395a;

    /* renamed from: b  reason: collision with root package name */
    private ag f66396b;

    /* renamed from: c  reason: collision with root package name */
    private ai f66397c;

    /* renamed from: d  reason: collision with root package name */
    private String f66398d;

    /* renamed from: e  reason: collision with root package name */
    private String f66399e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f66400f;

    static {
        Covode.recordClassIndex(40794);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f66400f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f66400f == null) {
            this.f66400f = new SparseArray();
        }
        View view = (View) this.f66400f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f66400f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.bl
    public void a(j jVar) {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.bl
    public final void c() {
        finish();
    }

    @Override // com.ss.android.ugc.aweme.bl
    public final String d() {
        String str = this.f66398d;
        if (str == null) {
            l.a("shootWay");
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.bl
    public final String e() {
        String str = this.f66399e;
        if (str == null) {
            l.a("creationId");
        }
        return str;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.ce, R.anim.cf);
    }

    @Override // com.ss.android.ugc.aweme.bl
    public final void a() {
        n a2 = getSupportFragmentManager().a();
        l.b(a2, "");
        if (this.f66396b == null) {
            this.f66396b = new ag();
        }
        ag agVar = this.f66396b;
        if (agVar != null) {
            if (!agVar.isAdded()) {
                a2.a(R.id.b91, agVar);
            }
            ai aiVar = this.f66397c;
            if (aiVar != null) {
                a2.c(agVar);
                a2.b(aiVar);
                a2.a((String) null);
                a2.c();
            }
        }
    }

    public void f() {
        n a2 = getSupportFragmentManager().a();
        l.b(a2, "");
        if (this.f66397c == null) {
            this.f66397c = new ai();
        }
        ai aiVar = this.f66397c;
        if (aiVar != null) {
            a2.a(R.id.b91, aiVar);
            a2.c();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        af afVar;
        i supportFragmentManager = getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        if (supportFragmentManager.e() == 0) {
            super.onBackPressed();
            return;
        }
        af afVar2 = this.f66395a;
        if (afVar2 == null || !afVar2.isVisible() || (afVar = this.f66395a) == null || !afVar.f66265d) {
            getSupportFragmentManager().c();
            return;
        }
        af afVar3 = this.f66395a;
        if (afVar3 != null) {
            afVar3.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.bl
    public final void b() {
        ae aeVar;
        T t;
        Integer num;
        p pVar;
        ArrayList<AnchorCell> arrayList;
        ai aiVar = this.f66397c;
        if (aiVar != null && (aeVar = aiVar.f66322d) != null) {
            ak akVar = (ak) aeVar.f76396h;
            Iterator<T> it = akVar.f66352b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                Integer num2 = t.f66463a;
                if (num2 != null && num2.intValue() == 2) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (arrayList = t2.f66467e) == null)) {
                arrayList.clear();
            }
            int a2 = akVar.a();
            Iterator<Object> it2 = akVar.f66351a.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it2.next();
                if ((next instanceof com.ss.android.ugc.aweme.api.model.a) && (num = ((com.ss.android.ugc.aweme.api.model.a) next).f66463a) != null && num.intValue() == 1) {
                    break;
                }
                i2++;
            }
            if (a2 > i2) {
                com.ss.android.ugc.aweme.framework.a.a.b(3, null, "error module range, from=" + a2 + ", to=" + i2);
                pVar = new p(0, 0);
            } else {
                pVar = new p(Integer.valueOf(a2), Integer.valueOf(i2));
            }
            akVar.f66351a.subList(((Number) pVar.getFirst()).intValue(), ((Number) pVar.getSecond()).intValue()).clear();
            ((bh) aeVar.f76397i).b(((ak) aeVar.f76396h).a());
        }
    }

    static final class a extends m implements b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66401a = new a();

        static {
            Covode.recordClassIndex(40795);
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
            baseActivityViewModel2.config(AnonymousClass1.f66402a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.bl
    public final void a(ArrayList<AnchorCell> arrayList) {
        n a2 = getSupportFragmentManager().a();
        l.b(a2, "");
        if (this.f66395a == null) {
            this.f66395a = new af();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("recently_add", arrayList);
            af afVar = this.f66395a;
            if (afVar != null) {
                afVar.setArguments(bundle);
            }
        }
        af afVar2 = this.f66395a;
        if (afVar2 != null) {
            if (!afVar2.isAdded()) {
                a2.a(R.id.b91, afVar2);
            }
            ai aiVar = this.f66397c;
            if (aiVar != null) {
                a2.c(afVar2);
                a2.b(aiVar);
                a2.a((String) null);
                a2.c();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        int type;
        String str;
        String str2;
        String queryParameter;
        Integer e2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", true);
        activityConfiguration(a.f66401a);
        super.onCreate(bundle);
        setContentView(R.layout.av);
        if (getIntent().getData() == null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("anchor_type");
            if (!(serializableExtra instanceof ab)) {
                serializableExtra = null;
            }
            ab abVar = (ab) serializableExtra;
            if (abVar == null) {
                abVar = ab.NO_TYPE;
            }
            aa.a.a(abVar);
            String a2 = a(getIntent(), "shoot_way");
            if (a2 == null) {
                a2 = "";
            }
            this.f66398d = a2;
            String a3 = a(getIntent(), "creation_id");
            if (a3 == null) {
                a3 = "";
            }
            this.f66399e = a3;
        } else {
            Uri data = getIntent().getData();
            if (data == null || (queryParameter = data.getQueryParameter("business_type")) == null || (e2 = h.m.p.e(queryParameter)) == null) {
                type = ab.COMMON_TYPE.getTYPE();
            } else {
                type = e2.intValue();
            }
            ab abVar2 = ab.COMMON_TYPE;
            abVar2.setTYPE(type);
            aa.a.a(abVar2);
            String a4 = a(getIntent(), "shoot_way");
            if (a4 == null) {
                a4 = "";
            }
            this.f66398d = a4;
            if (a4.length() == 0) {
                if (data == null || (str2 = data.getQueryParameter("shoot_way")) == null) {
                    str2 = "";
                }
                this.f66398d = str2;
            }
            String a5 = a(getIntent(), "creation_id");
            if (a5 == null) {
                a5 = "";
            }
            this.f66399e = a5;
            if (a5.length() == 0) {
                if (data == null || (str = data.getQueryParameter("creation_id")) == null) {
                    str = "";
                }
                this.f66399e = str;
            }
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.e_f);
        l.b(_$_findCachedViewById, "");
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
        layoutParams.height = com.bytedance.common.utility.n.e(this);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.e_f);
        l.b(_$_findCachedViewById2, "");
        _$_findCachedViewById2.setLayoutParams(layoutParams);
        f();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.anchor.AnchorBaseActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
