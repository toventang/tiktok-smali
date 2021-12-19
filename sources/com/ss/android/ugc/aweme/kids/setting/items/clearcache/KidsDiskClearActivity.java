package com.ss.android.ugc.aweme.kids.setting.items.clearcache;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.uikit.dialog.b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.ui.Divider;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class KidsDiskClearActivity extends com.bytedance.ies.foundation.activity.a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106859a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f106860b = h.i.a(h.m.NONE, new d(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f106861c = h.i.a(h.m.NONE, new f(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f106862d = h.i.a(h.m.NONE, new e(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f106863e = h.i.a(h.m.NONE, new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f106864f = h.i.a(h.m.NONE, new n(this));

    /* renamed from: g  reason: collision with root package name */
    private a f106865g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f106866h;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class o implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.m f106877a;

        static {
            Covode.recordClassIndex(68359);
        }

        o(h.f.a.m mVar) {
            this.f106877a = mVar;
        }

        public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.b(this.f106877a.invoke(dialogInterface, Integer.valueOf(i2)), "");
        }
    }

    final /* synthetic */ class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f106878a;

        static {
            Covode.recordClassIndex(68360);
        }

        p(h.f.a.b bVar) {
            this.f106878a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.b.l.b(this.f106878a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(68337);
    }

    private final DiskManagerItemView e() {
        return (DiskManagerItemView) this.f106860b.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f106866h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f106866h == null) {
            this.f106866h = new HashMap();
        }
        View view = (View) this.f106866h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f106866h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final DiskManagerItemView a() {
        return (DiskManagerItemView) this.f106861c.getValue();
    }

    public final DiskManagerItemView b() {
        return (DiskManagerItemView) this.f106862d.getValue();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68338);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsDiskClearActivity f106867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bundle f106868b;

        static {
            Covode.recordClassIndex(68339);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        b(KidsDiskClearActivity kidsDiskClearActivity, Bundle bundle) {
            this.f106867a = kidsDiskClearActivity;
            this.f106868b = bundle;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            h.f.b.l.d(asyncAVService, "");
            asyncAVService.uiService().draftService().enterDraftBoxActivity(this.f106867a, this.f106868b);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Divider> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Divider invoke() {
            return this.this$0._$_findCachedViewById(R.id.fli);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<DiskManagerItemView> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DiskManagerItemView invoke() {
            return this.this$0._$_findCachedViewById(R.id.a6a);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<DiskManagerItemView> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DiskManagerItemView invoke() {
            return this.this$0._$_findCachedViewById(R.id.a6b);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<DiskManagerItemView> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DiskManagerItemView invoke() {
            return this.this$0._$_findCachedViewById(R.id.a6c);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Divider> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(KidsDiskClearActivity kidsDiskClearActivity) {
            super(0);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Divider invoke() {
            return this.this$0._$_findCachedViewById(R.id.dm4);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        a aVar = this.f106865g;
        if (aVar == null || !aVar.isShowing()) {
            super.onBackPressed();
        }
    }

    public final void c() {
        if (this.f106865g == null) {
            a aVar = new a(this);
            aVar.setCancelable(false);
            this.f106865g = aVar;
        }
        a aVar2 = this.f106865g;
        if (aVar2 != null) {
            aVar2.show();
        }
    }

    public final void d() {
        a aVar;
        a aVar2 = this.f106865g;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f106865g) != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        int i2;
        int i3;
        String str;
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onResume", true);
        super.onResume();
        e().setLeftText(getString(R.string.fpm));
        e().f();
        e().h();
        a().setLeftText(getString(R.string.fq0));
        a().f();
        a().h();
        b().setLeftText(getString(R.string.fph));
        b().f();
        b().h();
        DiskManagerItemView e2 = e();
        h.f.b.l.b(e2, "");
        a("DRAFT", e2);
        DiskManagerItemView a2 = a();
        h.f.b.l.b(a2, "");
        a("CACHE", a2);
        DiskManagerItemView b2 = b();
        h.f.b.l.b(b2, "");
        a("RESOURCE", b2);
        int size = AVExternalServiceImpl.a().draftService().draftList(false).size();
        DiskManagerItemView e3 = e();
        h.f.b.l.b(e3, "");
        int i4 = 8;
        if (size <= 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        e3.setVisibility(i2);
        Divider divider = (Divider) this.f106863e.getValue();
        h.f.b.l.b(divider, "");
        DiskManagerItemView e4 = e();
        h.f.b.l.b(e4, "");
        divider.setVisibility(e4.getVisibility());
        List<com.bytedance.u.a> b3 = com.bytedance.u.d.b();
        if (b3 == null || ((b3 instanceof Collection) && b3.isEmpty())) {
            i3 = 0;
        } else {
            i3 = 0;
            for (T t : b3) {
                if (t != null) {
                    str = t.a();
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) "RESOURCE") && (i3 = i3 + 1) < 0) {
                    h.a.n.b();
                }
            }
        }
        DiskManagerItemView b4 = b();
        h.f.b.l.b(b4, "");
        if (i3 > 0) {
            i4 = 0;
        }
        b4.setVisibility(i4);
        Divider divider2 = (Divider) this.f106864f.getValue();
        h.f.b.l.b(divider2, "");
        DiskManagerItemView b5 = b();
        h.f.b.l.b(b5, "");
        divider2.setVisibility(b5.getVisibility());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onResume", false);
    }

    static final class i extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f106875a = new i();

        static {
            Covode.recordClassIndex(68352);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f106876a);
            return z.f158842a;
        }
    }

    public final void exit(View view) {
        h.f.b.l.d(view, "");
        finish();
    }

    static final /* synthetic */ class k extends h.f.b.j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(68355);
        }

        k(KidsDiskClearActivity kidsDiskClearActivity) {
            super(1, kidsDiskClearActivity, KidsDiskClearActivity.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            h.f.b.l.d(view2, "");
            ((KidsDiskClearActivity) this.receiver).onClick(view2);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class l extends h.f.b.j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(68356);
        }

        l(KidsDiskClearActivity kidsDiskClearActivity) {
            super(1, kidsDiskClearActivity, KidsDiskClearActivity.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            h.f.b.l.d(view2, "");
            ((KidsDiskClearActivity) this.receiver).onClick(view2);
            return z.f158842a;
        }
    }

    static final /* synthetic */ class m extends h.f.b.j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(68357);
        }

        m(KidsDiskClearActivity kidsDiskClearActivity) {
            super(1, kidsDiskClearActivity, KidsDiskClearActivity.class, "onClick", "onClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            h.f.b.l.d(view2, "");
            ((KidsDiskClearActivity) this.receiver).onClick(view2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiskManagerItemView f106881a;

        static {
            Covode.recordClassIndex(68362);
        }

        r(DiskManagerItemView diskManagerItemView) {
            this.f106881a = diskManagerItemView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106881a.i();
            this.f106881a.g();
            this.f106881a.setLeftText((String) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsDiskClearActivity f106882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DiskManagerItemView f106883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f106884c;

        static {
            Covode.recordClassIndex(68363);
        }

        s(KidsDiskClearActivity kidsDiskClearActivity, DiskManagerItemView diskManagerItemView, String str) {
            this.f106882a = kidsDiskClearActivity;
            this.f106883b = diskManagerItemView;
            this.f106884c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f106883b.g();
            this.f106883b.setLeftText(this.f106882a.a(this.f106884c));
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h.f.b.l.d(view, "");
        int id = view.getId();
        if (id == R.id.a6a) {
            if (!e().e()) {
                IExternalService a2 = AVExternalServiceImpl.a();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_disk_manage_mode", true);
                a2.asyncService("CleanDraft", new b(this, bundle));
            }
        } else if (id == R.id.a6c) {
            if (!a().e()) {
                a(R.string.fpd, new g(this));
            }
        } else if (id == R.id.a6b && !b().e()) {
            a(R.string.fpc, new h(this));
        }
    }

    public final String a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 63879010) {
            if (hashCode == 65307009 && str.equals("DRAFT")) {
                String string = getString(R.string.fpk, new Object[]{Float.valueOf(0.0f)});
                h.f.b.l.b(string, "");
                return string;
            }
        } else if (str.equals("CACHE")) {
            String string2 = getString(R.string.fpz, new Object[]{Float.valueOf(0.0f)});
            h.f.b.l.b(string2, "");
            return string2;
        }
        String string3 = getString(R.string.fpf, new Object[]{Float.valueOf(0.0f)});
        h.f.b.l.b(string3, "");
        return string3;
    }

    /* access modifiers changed from: package-private */
    public static final class q<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsDiskClearActivity f106879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f106880b;

        static {
            Covode.recordClassIndex(68361);
        }

        q(KidsDiskClearActivity kidsDiskClearActivity, String str) {
            this.f106879a = kidsDiskClearActivity;
            this.f106880b = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            String string;
            String string2;
            String string3;
            h.f.b.l.d(obj, "");
            List<com.bytedance.u.a> b2 = com.bytedance.u.d.b();
            if (b2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b2) {
                    T t2 = t;
                    if (h.f.b.l.a((Object) this.f106880b, (Object) (t2 != null ? t2.a() : null))) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                for (T t3 : arrayList2) {
                    h.f.b.l.b(t3, "");
                    long e2 = t3.e();
                    t3.getClass().getSimpleName();
                    File c2 = t3.c();
                    h.f.b.l.b(c2, "");
                    c2.getAbsolutePath();
                    arrayList3.add(Long.valueOf(e2));
                }
                Long valueOf = Long.valueOf(h.a.n.v(arrayList3));
                if (valueOf != null) {
                    KidsDiskClearActivity kidsDiskClearActivity = this.f106879a;
                    String str = this.f106880b;
                    double longValue = (double) valueOf.longValue();
                    int hashCode = str.hashCode();
                    if (hashCode != 65307009) {
                        if (hashCode == 441562126 && str.equals("RESOURCE")) {
                            Double.isNaN(longValue);
                            double d2 = longValue / 1.073741824E9d;
                            if (d2 > 1.0d) {
                                string3 = kidsDiskClearActivity.getString(R.string.fpg, new Object[]{Double.valueOf(d2)});
                            } else {
                                Double.isNaN(longValue);
                                string3 = kidsDiskClearActivity.getString(R.string.fpf, new Object[]{Double.valueOf(longValue / 1048576.0d)});
                            }
                            h.f.b.l.b(string3, "");
                            return string3;
                        }
                    } else if (str.equals("DRAFT")) {
                        Double.isNaN(longValue);
                        double d3 = longValue / 1.073741824E9d;
                        if (d3 > 1.0d) {
                            string = kidsDiskClearActivity.getString(R.string.fpl, new Object[]{Double.valueOf(d3)});
                        } else {
                            Double.isNaN(longValue);
                            string = kidsDiskClearActivity.getString(R.string.fpk, new Object[]{Double.valueOf(longValue / 1048576.0d)});
                        }
                        h.f.b.l.b(string, "");
                        return string;
                    }
                    Double.isNaN(longValue);
                    double d4 = longValue / 1048576.0d;
                    if (d4 < 30.0d) {
                        string2 = kidsDiskClearActivity.getString(R.string.fpz, new Object[]{Float.valueOf(0.0f)});
                    } else {
                        string2 = kidsDiskClearActivity.getString(R.string.fpz, new Object[]{Double.valueOf(d4)});
                    }
                    h.f.b.l.b(string2, "");
                    return string2;
                }
            }
            return this.f106879a.a(this.f106880b);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", true);
        activityConfiguration(i.f106875a);
        super.onCreate(bundle);
        setContentView(R.layout.ac1);
        int b2 = (int) com.bytedance.common.utility.n.b(this, 18.0f);
        int b3 = (int) com.bytedance.common.utility.n.b(this, 4.0f);
        DiskManagerItemView a2 = a();
        h.f.b.l.b(a2, "");
        TextView tvwRight = a2.getTvwRight();
        h.f.b.l.b(tvwRight, "");
        tvwRight.setTextSize(12.0f);
        DiskManagerItemView a3 = a();
        h.f.b.l.b(a3, "");
        TextView tvwRight2 = a3.getTvwRight();
        DiskManagerItemView a4 = a();
        h.f.b.l.b(a4, "");
        TextView tvwRight3 = a4.getTvwRight();
        h.f.b.l.b(tvwRight3, "");
        tvwRight2.setTextColor(androidx.core.content.b.c(tvwRight3.getContext(), R.color.bi));
        DiskManagerItemView a5 = a();
        h.f.b.l.b(a5, "");
        a5.getTvwRight().setBackgroundResource(R.drawable.az5);
        DiskManagerItemView a6 = a();
        h.f.b.l.b(a6, "");
        TextView tvwRight4 = a6.getTvwRight();
        if (tvwRight4 != null) {
            ((DmtTextView) tvwRight4).setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
            DiskManagerItemView a7 = a();
            h.f.b.l.b(a7, "");
            a7.getTvwRight().setPadding(b2, b3, b2, b3);
            DiskManagerItemView b4 = b();
            h.f.b.l.b(b4, "");
            TextView tvwRight5 = b4.getTvwRight();
            h.f.b.l.b(tvwRight5, "");
            tvwRight5.setTextSize(12.0f);
            DiskManagerItemView b5 = b();
            h.f.b.l.b(b5, "");
            TextView tvwRight6 = b5.getTvwRight();
            DiskManagerItemView b6 = b();
            h.f.b.l.b(b6, "");
            TextView tvwRight7 = b6.getTvwRight();
            h.f.b.l.b(tvwRight7, "");
            tvwRight6.setTextColor(androidx.core.content.b.c(tvwRight7.getContext(), R.color.bi));
            DiskManagerItemView b7 = b();
            h.f.b.l.b(b7, "");
            b7.getTvwRight().setBackgroundResource(R.drawable.az5);
            DiskManagerItemView b8 = b();
            h.f.b.l.b(b8, "");
            TextView tvwRight8 = b8.getTvwRight();
            if (tvwRight8 != null) {
                ((DmtTextView) tvwRight8).setFontType(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
                DiskManagerItemView b9 = b();
                h.f.b.l.b(b9, "");
                b9.getTvwRight().setPadding(b2, b3, b2, b3);
                TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.em8);
                com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
                String string = getString(R.string.c18);
                h.f.b.l.b(string, "");
                tuxNavBar.a(gVar.a(string));
                tuxNavBar.a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new j(this)));
                tuxNavBar.a(true);
                findViewById(R.id.a6a).setOnClickListener(new p(new k(this)));
                findViewById(R.id.a6c).setOnClickListener(new p(new l(this)));
                findViewById(R.id.a6b).setOnClickListener(new p(new m(this)));
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity", "onCreate", false);
        throw nullPointerException2;
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.m<Object, Object, z> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(KidsDiskClearActivity kidsDiskClearActivity) {
            super(2);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(obj2, "");
            this.this$0.c();
            t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).d(AnonymousClass1.f106869a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f106870a;

                static {
                    Covode.recordClassIndex(68346);
                }

                {
                    this.f106870a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f106870a.this$0.d();
                    this.f106870a.this$0.a().setLeftText(this.f106870a.this$0.getString(R.string.fpz, new Object[]{Float.valueOf(0.0f)}));
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.g.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f106871a;

                static {
                    Covode.recordClassIndex(68347);
                }

                {
                    this.f106871a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f106871a.this$0.d();
                    this.f106871a.this$0.a().setLeftText(this.f106871a.this$0.getString(R.string.fpz, new Object[]{Float.valueOf(0.0f)}));
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.m<Object, Object, z> {
        final /* synthetic */ KidsDiskClearActivity this$0;

        static {
            Covode.recordClassIndex(68348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(KidsDiskClearActivity kidsDiskClearActivity) {
            super(2);
            this.this$0 = kidsDiskClearActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Object obj, Object obj2) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(obj2, "");
            this.this$0.c();
            t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).d(AnonymousClass1.f106872a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.h.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f106873a;

                static {
                    Covode.recordClassIndex(68350);
                }

                {
                    this.f106873a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f106873a.this$0.d();
                    this.f106873a.this$0.b().setLeftText(this.f106873a.this$0.getString(R.string.fpf, new Object[]{Float.valueOf(0.0f)}));
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity.h.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f106874a;

                static {
                    Covode.recordClassIndex(68351);
                }

                {
                    this.f106874a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f106874a.this$0.d();
                    this.f106874a.this$0.b().setLeftText(this.f106874a.this$0.getString(R.string.fpf, new Object[]{Float.valueOf(0.0f)}));
                }
            });
            return z.f158842a;
        }
    }

    private final void a(String str, DiskManagerItemView diskManagerItemView) {
        t.b(this).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new q(this, str)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new r(diskManagerItemView), new s(this, diskManagerItemView, str));
    }

    private final void a(int i2, h.f.a.m<Object, Object, z> mVar) {
        String string = getResources().getString(R.string.a9e);
        h.f.b.l.b(string, "");
        String string2 = getResources().getString(R.string.fpb);
        h.f.b.l.b(string2, "");
        try {
            new b.a(this, 2).a(i2).a(string2, new o(mVar)).c(string).a().b().show();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
