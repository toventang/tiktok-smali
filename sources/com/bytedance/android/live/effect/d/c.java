package com.bytedance.android.live.effect.d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.b.c;
import com.bytedance.android.live.effect.c.j;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.j.cv;
import com.bytedance.android.livesdk.j.dw;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.material.tabs.TabLayout;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.u;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class c extends v {

    /* renamed from: g  reason: collision with root package name */
    public static final a f9756g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f9757a;

    /* renamed from: b  reason: collision with root package name */
    public g f9758b;

    /* renamed from: c  reason: collision with root package name */
    public e f9759c;

    /* renamed from: d  reason: collision with root package name */
    public String f9760d;

    /* renamed from: e  reason: collision with root package name */
    public b f9761e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.effect.model.b f9762f;

    /* renamed from: h  reason: collision with root package name */
    private final ak.a f9763h = ak.a.PANEL_BEAUTY_FILTER;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f9764i;

    static {
        Covode.recordClassIndex(4970);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f9764i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f9764i == null) {
            this.f9764i = new HashMap();
        }
        View view = (View) this.f9764i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f9764i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4971);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f9763h;
    }

    static final class f implements StateLayout.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9769a;

        static {
            Covode.recordClassIndex(4976);
        }

        f(c cVar) {
            this.f9769a = cVar;
        }

        @Override // com.bytedance.android.live.core.widget.StateLayout.a
        public final void a() {
            this.f9769a.d();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7a);
        bVar.f22375b = R.style.a37;
        bVar.f22380g = 80;
        bVar.f22382i = -1;
        bVar.f22385l = 3;
        return bVar;
    }

    public final void d() {
        ((StateLayout) a_(R.id.au5)).a("LOADING");
        j.b.f9740a.a(this.p);
        com.bytedance.android.live.effect.g.a(this.p);
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        if (Build.VERSION.SDK_INT >= 21) {
            Dialog dialog = getDialog();
            if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
                window2.addFlags(Integer.MIN_VALUE);
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                window.setStatusBarColor(0);
            }
        }
    }

    public final void e() {
        ImageView imageView = (ImageView) a_(R.id.dm6);
        l.b(imageView, "");
        List<com.bytedance.android.livesdkapi.depend.model.a> b2 = c.a.a().b(com.bytedance.android.live.effect.api.a.f9639d);
        l.b(b2, "");
        ArrayList arrayList = new ArrayList();
        for (T t : b2) {
            if (l.a((Object) t.B, (Object) this.f9760d)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        boolean z = true;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.android.livesdkapi.depend.model.a aVar = (com.bytedance.android.livesdkapi.depend.model.a) it.next();
                if (!aVar.D) {
                    if (c.a.a().a(aVar)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            imageView.setEnabled(z);
        }
        z = false;
        imageView.setEnabled(z);
    }

    public static final class b extends AdjustPercentBar.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9765a;

        static {
            Covode.recordClassIndex(4972);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f9765a = cVar;
        }

        @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.b, com.bytedance.android.livesdk.widget.AdjustPercentBar.c
        public final void a(int i2) {
            String str;
            if (l.a((Object) this.f9765a.f9760d, (Object) com.bytedance.android.live.effect.api.a.f9641f)) {
                FilterModel filterModel = c.a(this.f9765a).f9751b;
                if (filterModel != null) {
                    float a2 = com.bytedance.android.live.effect.b.e.a(filterModel.filterConfig.f9871a, filterModel.filterConfig.f9872b, i2);
                    com.bytedance.android.live.effect.c.j jVar = j.b.f9740a;
                    Float valueOf = Float.valueOf(a2);
                    jVar.f9730c.put(filterModel.getFilterId(), Double.valueOf(valueOf.doubleValue()));
                    for (f.a aVar : jVar.f9731d) {
                        aVar.a(filterModel, valueOf.floatValue());
                    }
                    return;
                }
                return;
            }
            g b2 = c.b(this.f9765a);
            com.bytedance.android.livesdkapi.depend.model.a aVar2 = b2.f9777c;
            if (aVar2 != null) {
                com.bytedance.android.live.effect.api.a.i iVar = b2.f9783i;
                String str2 = com.bytedance.android.live.effect.api.a.f9639d;
                String str3 = "";
                l.b(str2, str3);
                a.b a3 = aVar2.a();
                if (!(a3 == null || (str = a3.f23010c) == null)) {
                    str3 = str;
                }
                iVar.a(str2, aVar2, str3, com.bytedance.android.live.effect.b.e.a(aVar2, i2));
            }
            this.f9765a.e();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.d.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC0145c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9766a;

        static {
            Covode.recordClassIndex(4973);
        }

        View$OnClickListenerC0145c(c cVar) {
            this.f9766a = cVar;
        }

        public final void onClick(View view) {
            this.f9766a.dismiss();
        }
    }

    public static final class d extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9767a;

        static {
            Covode.recordClassIndex(4974);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f9767a = cVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            CharSequence charSequence;
            T t;
            List<T> list;
            c cVar = this.f9767a;
            b bVar = cVar.f9761e;
            com.bytedance.android.livesdkapi.depend.model.a aVar = null;
            if (bVar != null) {
                charSequence = bVar.getPageTitle(i2);
            } else {
                charSequence = null;
            }
            cVar.f9760d = String.valueOf(charSequence);
            if (l.a((Object) this.f9767a.f9760d, (Object) com.bytedance.android.live.effect.api.a.f9641f)) {
                a a2 = c.a(this.f9767a);
                a2.a(a2.f9751b);
                p.a(this.f9767a.a_(R.id.dm6));
            } else {
                g b2 = c.b(this.f9767a);
                String str = this.f9767a.f9760d;
                b2.f9776b = str;
                com.bytedance.android.livesdkapi.depend.model.a aVar2 = b2.f9778d.get(str);
                if (aVar2 == null) {
                    Iterator<T> it = b2.f9780f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (l.a((Object) t.f9889a, (Object) b2.f9776b)) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (!(t2 == null || (list = t2.f9890b) == null)) {
                        aVar = (com.bytedance.android.livesdkapi.depend.model.a) n.b((List) list, com.bytedance.android.live.effect.f.b.a(b2.f9776b, list));
                    }
                } else {
                    aVar = aVar2;
                }
                b2.b(aVar);
                b2.a(b2.f9777c);
                p.b(this.f9767a.a_(R.id.dm6));
            }
            this.f9767a.e();
        }
    }

    static final class j extends m implements h.f.a.b<com.bytedance.android.livesdkapi.depend.model.a, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(4980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdkapi.depend.model.a aVar) {
            l.d(aVar, "");
            this.this$0.e();
            return z.f158842a;
        }
    }

    public static final /* synthetic */ a a(c cVar) {
        a aVar = cVar.f9757a;
        if (aVar == null) {
            l.a("filterHandler");
        }
        return aVar;
    }

    public static final /* synthetic */ g b(c cVar) {
        g gVar = cVar.f9758b;
        if (gVar == null) {
            l.a("smallItemBeautyHandler");
        }
        return gVar;
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9768a;

        static {
            Covode.recordClassIndex(4975);
        }

        e(c cVar) {
            this.f9768a = cVar;
        }

        public final void onClick(View view) {
            c cVar = this.f9768a;
            new b.a(cVar.getContext()).a(R.string.dx6, (DialogInterface.OnClickListener) new g(cVar), false).b(R.string.dx5, (DialogInterface.OnClickListener) h.f9771a, false).a(R.string.dx3).b(R.string.dx4).a().show();
        }
    }

    static final class k extends m implements h.f.a.b<z, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(4981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            p.a(this.this$0.a_(R.id.e6b));
            ((StateLayout) this.this$0.a_(R.id.au5)).a("ERROR");
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(4979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
            String str;
            List<? extends com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list2 = list;
            l.d(list2, "");
            if (this.this$0.f9760d == null) {
                c cVar = this.this$0;
                com.bytedance.android.live.effect.model.e eVar = (com.bytedance.android.live.effect.model.e) n.h((List) list2);
                if (eVar != null) {
                    str = eVar.f9889a;
                } else {
                    str = null;
                }
                cVar.f9760d = str;
            }
            e eVar2 = this.this$0.f9759c;
            if (eVar2 == null) {
                l.a("liveEffectTabHandler");
            }
            l.d(list2, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f9889a);
            }
            ArrayList arrayList2 = arrayList;
            if (!l.a(eVar2.f9772a, arrayList2)) {
                eVar2.f9773b.removeAllTabs();
                int i2 = 0;
                for (Object obj : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    TabLayout tabLayout = eVar2.f9773b;
                    TabLayout.f a2 = eVar2.a((String) obj, false);
                    if (i2 == 0) {
                        f.b(a2);
                    } else {
                        f.a(a2);
                    }
                    tabLayout.addTab(a2);
                    i2 = i3;
                }
                TabLayout tabLayout2 = eVar2.f9773b;
                String str2 = com.bytedance.android.live.effect.api.a.f9641f;
                l.b(str2, "");
                TabLayout.f a3 = eVar2.a(str2, j.b.f9740a.c());
                f.a(a3);
                tabLayout2.addTab(a3);
                eVar2.f9772a.addAll(arrayList2);
            }
            this.this$0.e();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String filterId;
        if (this.f9757a == null) {
            l.a("filterHandler");
        }
        com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.cT, j.b.f9740a.f9730c);
        com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.cS, Long.valueOf(System.currentTimeMillis()));
        if (this.f9758b == null) {
            l.a("smallItemBeautyHandler");
        }
        super.onDismiss(dialogInterface);
        com.bytedance.android.live.effect.b.f9657a.a(this.p, false);
        a aVar = this.f9757a;
        if (aVar == null) {
            l.a("filterHandler");
        }
        FilterModel filterModel = aVar.f9751b;
        String str2 = "";
        if (filterModel == null || (str = filterModel.getFilterId()) == null) {
            str = str2;
        }
        com.bytedance.android.live.effect.b bVar = com.bytedance.android.live.effect.b.f9657a;
        DataChannel dataChannel = this.p;
        com.bytedance.android.livesdk.ap.b<Integer> bVar2 = com.bytedance.android.livesdk.ap.a.O;
        l.b(bVar2, str2);
        bVar.a(dataChannel, false, str, true, bVar2.a().intValue() + 1);
        a aVar2 = this.f9757a;
        if (aVar2 == null) {
            l.a("filterHandler");
        }
        FilterModel filterModel2 = aVar2.f9751b;
        if (!(filterModel2 == null || (filterId = filterModel2.getFilterId()) == null)) {
            str2 = filterId;
        }
        com.bytedance.android.live.effect.b.b(str2);
        if (com.bytedance.android.live.effect.b.a(str)) {
            DataChannelGlobal.f34575d.a(cv.class, new u(str, Float.valueOf(j.b.f9740a.a(str)), Long.valueOf(System.currentTimeMillis())));
        }
    }

    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f9771a = new h();

        static {
            Covode.recordClassIndex(4978);
        }

        h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f9770a;

        static {
            Covode.recordClassIndex(4977);
        }

        g(c cVar) {
            this.f9770a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            Object obj;
            String str;
            int i3;
            c cVar = this.f9770a;
            if (!l.a((Object) cVar.f9760d, (Object) com.bytedance.android.live.effect.api.a.f9641f)) {
                g gVar = cVar.f9758b;
                if (gVar == null) {
                    l.a("smallItemBeautyHandler");
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f34575d.b(dw.class);
                if (concurrentHashMap != null) {
                    concurrentHashMap.clear();
                }
                com.bytedance.android.live.effect.api.a.i iVar = gVar.f9783i;
                String str2 = com.bytedance.android.live.effect.api.a.f9639d;
                l.b(str2, "");
                List<com.bytedance.android.livesdkapi.depend.model.a> e2 = iVar.e(str2);
                ArrayList arrayList = new ArrayList();
                for (T t : e2) {
                    if (l.a((Object) t.B, (Object) gVar.f9776b)) {
                        arrayList.add(t);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    int i4 = 0;
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.android.livesdkapi.depend.model.a aVar = (com.bytedance.android.livesdkapi.depend.model.a) it.next();
                    com.bytedance.android.live.effect.api.a.i iVar2 = gVar.f9783i;
                    String str3 = com.bytedance.android.live.effect.api.a.f9639d;
                    l.b(str3, "");
                    a.b a2 = aVar.a();
                    if (a2 == null || (str = a2.f23010c) == null) {
                        str = "";
                    }
                    a.b a3 = aVar.a();
                    if (a3 != null) {
                        i3 = a3.f23009b;
                    } else {
                        i3 = 0;
                    }
                    iVar2.a(str3, aVar, str, com.bytedance.android.live.effect.b.e.a(aVar, i3));
                    if (aVar.D) {
                        com.bytedance.android.live.effect.api.a.i iVar3 = gVar.f9783i;
                        String str4 = com.bytedance.android.live.effect.api.a.f9639d;
                        l.b(str4, "");
                        iVar3.b(str4, aVar);
                    }
                    String str5 = aVar.f22997c;
                    com.bytedance.android.livesdkapi.depend.model.a aVar2 = gVar.f9777c;
                    if (aVar2 != null) {
                        obj = aVar2.f22997c;
                    }
                    if (l.a((Object) str5, obj)) {
                        AdjustPercentBar adjustPercentBar = gVar.f9786l;
                        a.b a4 = aVar.a();
                        if (a4 != null) {
                            i4 = a4.f23009b;
                        }
                        adjustPercentBar.setPercent(i4);
                    }
                }
                b bVar = gVar.f9785k;
                Object obj2 = bVar != null ? bVar.f9754a : null;
                if (obj2 instanceof com.bytedance.android.live.effect.e.c) {
                    obj = obj2;
                }
                com.bytedance.android.live.effect.e.c cVar2 = (com.bytedance.android.live.effect.e.c) obj;
                if (cVar2 != null) {
                    cVar2.f9803b.a();
                }
                if (!gVar.f9778d.values().contains(gVar.f9777c)) {
                    gVar.f9777c = gVar.f9778d.get(gVar.f9776b);
                }
                ImageView imageView = (ImageView) cVar.a_(R.id.dm6);
                l.b(imageView, "");
                imageView.setEnabled(false);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.bytedance.android.live.effect.api.a.f9641f = y.a((int) R.string.e93);
        a_(R.id.an1).setOnClickListener(new View$OnClickListenerC0145c(this));
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        this.f9761e = new b(childFragmentManager);
        ViewPager viewPager = (ViewPager) a_(R.id.au1);
        l.b(viewPager, "");
        viewPager.setAdapter(this.f9761e);
        ((ViewPager) a_(R.id.au1)).addOnPageChangeListener(new d(this));
        TabLayout tabLayout = (TabLayout) a_(R.id.au6);
        l.b(tabLayout, "");
        ViewPager viewPager2 = (ViewPager) a_(R.id.au1);
        l.b(viewPager2, "");
        this.f9759c = new e(tabLayout, viewPager2);
        ((ImageView) a_(R.id.dm6)).setOnClickListener(new e(this));
        ((StateLayout) a_(R.id.au5)).setErrorClickListener(new f(this));
        ((AdjustPercentBar) a_(R.id.e6b)).a(y.b((int) R.color.v_), y.b((int) R.color.v8), y.b((int) R.color.v9));
        ((AdjustPercentBar) a_(R.id.e6b)).setOnLevelChangeListener(new b(this));
        d();
        DataChannel dataChannel = this.p;
        AdjustPercentBar adjustPercentBar = (AdjustPercentBar) a_(R.id.e6b);
        l.b(adjustPercentBar, "");
        this.f9757a = new a(dataChannel, this, adjustPercentBar);
        DataChannel dataChannel2 = this.p;
        ViewPager viewPager3 = (ViewPager) a_(R.id.au1);
        l.b(viewPager3, "");
        b bVar = this.f9761e;
        AdjustPercentBar adjustPercentBar2 = (AdjustPercentBar) a_(R.id.e6b);
        l.b(adjustPercentBar2, "");
        StateLayout stateLayout = (StateLayout) a_(R.id.au5);
        l.b(stateLayout, "");
        this.f9758b = new g(dataChannel2, this, viewPager3, bVar, adjustPercentBar2, stateLayout);
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 != null) {
            dataChannel3.a((androidx.lifecycle.m) this, com.bytedance.android.live.effect.a.class, (h.f.a.b) new i(this)).a((androidx.lifecycle.m) this, com.bytedance.android.live.effect.m.class, (h.f.a.b) new j(this)).a((androidx.lifecycle.m) this, com.bytedance.android.live.effect.j.class, (h.f.a.b) new k(this));
        }
    }
}
