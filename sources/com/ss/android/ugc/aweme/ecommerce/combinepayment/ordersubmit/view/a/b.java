package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.o;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.p;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.q;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t;
import com.ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f85046a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f85047b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f85048c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f85049d;

    /* renamed from: e  reason: collision with root package name */
    public int f85050e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f85051f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f85052g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f85053h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f85054i;

    /* renamed from: j  reason: collision with root package name */
    public final h.f.a.a<z> f85055j;

    /* renamed from: k  reason: collision with root package name */
    public final h.f.a.b<t, z> f85056k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap<String, Object> f85057l;

    /* renamed from: m  reason: collision with root package name */
    private TuxButton f85058m;
    private KeyBoardVisibilityUtil n;
    private final o o;

    static {
        Covode.recordClassIndex(53165);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b$b  reason: collision with other inner class name */
    public static final class C2037b extends m implements h.f.a.a<z> {
        final /* synthetic */ LinearLayout $reasonListLayout$inlined;
        final /* synthetic */ View $this_apply$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2037b(View view, LinearLayout linearLayout, b bVar) {
            super(0);
            this.$this_apply$inlined = view;
            this.$reasonListLayout$inlined = linearLayout;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ p $reason;
        final /* synthetic */ LinearLayout $reasonListLayout$inlined;
        final /* synthetic */ View $this_apply$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, View view, LinearLayout linearLayout, b bVar) {
            super(0);
            this.$reason = pVar;
            this.$this_apply$inlined = view;
            this.$reasonListLayout$inlined = linearLayout;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str = this.$reason.f84996b;
            if (str == null) {
                str = "";
            }
            HashMap<String, Object> hashMap = this.this$0.f85057l;
            int i2 = 0;
            Boolean bool = false;
            if (this.this$0.f85050e > 0) {
                i2 = 1;
            }
            l.d("quit_pay_reason", "");
            l.d(str, "");
            l.d(hashMap, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(h.f84785a);
            linkedHashMap.put("page_name", "quit_pay_reason");
            if (bool != null) {
                bool.booleanValue();
                linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            linkedHashMap.put("option_name", str);
            linkedHashMap.put("is_input_content", Integer.valueOf(i2));
            linkedHashMap.putAll(hashMap);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_input_result", linkedHashMap);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            T t;
            String str;
            q reason;
            HashMap<String, Object> hashMap = this.this$0.f85057l;
            Iterator<T> it = this.this$0.f85047b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.a()) {
                    break;
                }
            }
            T t2 = t;
            if (t2 == null || (reason = t2.getReason()) == null || (str = reason.f85000a) == null) {
                str = "";
            }
            h.a("close", "return", (HashMap) hashMap, "quit_pay_reason", str, (Boolean) false, (String) null, (Boolean) null, 192);
            b.a(this.this$0).dismissAllowingStateLoss();
            return z.f158842a;
        }
    }

    public final void b() {
        boolean z;
        List<a> list = this.f85048c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().f85038a) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        this.f85052g = z;
        if (!z || !this.f85051f) {
            int i2 = Build.VERSION.SDK_INT;
            TuxButton tuxButton = this.f85058m;
            if (tuxButton != null) {
                tuxButton.setBackground(androidx.core.content.b.a(this.f85054i, (int) R.drawable.xv));
            }
            TuxButton tuxButton2 = this.f85058m;
            if (tuxButton2 != null) {
                tuxButton2.setTextColor(androidx.core.content.b.c(this.f85054i, R.color.bz));
                return;
            }
            return;
        }
        TuxButton tuxButton3 = this.f85058m;
        if (tuxButton3 != null) {
            tuxButton3.setButtonVariant(0);
        }
    }

    public final void a() {
        String str;
        if (this.o != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap<String, Object> hashMap = this.f85057l;
            List<p> list = this.o.f84994c;
            i iVar = null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f84996b);
                }
                str = n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
            } else {
                str = null;
            }
            h.a(false, hashMap, "quit_pay_reason", null, str, null, null, 96);
            View a2 = com.a.a(LayoutInflater.from(this.f85054i), R.layout.qi, null, false);
            this.f85058m = (TuxButton) a2.findViewById(R.id.vc);
            l.b(a2, "");
            a(a2);
            TuxNavBar.a aVar = new TuxNavBar.a();
            com.bytedance.tux.navigation.a.g gVar = new com.bytedance.tux.navigation.a.g();
            String str2 = this.o.f84992a;
            if (str2 == null) {
                str2 = this.f85054i.getResources().getString(R.string.bh1);
                l.b(str2, "");
            }
            TuxNavBar.a a3 = aVar.a(gVar.a(str2));
            com.bytedance.tux.navigation.a.b a4 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small);
            a4.f45194b = true;
            TuxNavBar.a b2 = a3.b(a4.a((h.f.a.a<z>) new g(this)));
            b2.f45188d = true;
            this.f85046a = new a.C1112a().a(b2).a(new f(this, elapsedRealtime)).a(a2).a(0).a(true).b(false).f45299a;
            Context context = this.f85054i;
            if (!(context instanceof androidx.core.app.d)) {
                context = null;
            }
            androidx.core.app.d dVar = (androidx.core.app.d) context;
            if (dVar != null) {
                this.n = new KeyBoardVisibilityUtil(dVar, 16, new e(this, a2));
            }
            com.bytedance.tux.sheet.sheet.a aVar2 = this.f85046a;
            if (aVar2 == null) {
                l.a("dialog");
            }
            Context context2 = this.f85054i;
            if (!(context2 instanceof androidx.appcompat.app.d)) {
                context2 = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context2;
            if (eVar != null) {
                iVar = eVar.getSupportFragmentManager();
            }
            aVar2.show(iVar, "quit_reason_dialog");
        }
    }

    public static final class d extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85064a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f85065b;

        static {
            Covode.recordClassIndex(53169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar) {
            super(700);
            this.f85065b = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            T t;
            q reason;
            String str2;
            if (view != null && this.f85065b.f85052g && this.f85065b.f85051f) {
                List<c> list = this.f85065b.f85047b;
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    if (t2.a()) {
                        arrayList.add(t2);
                    }
                }
                ArrayList<c> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (c cVar : arrayList2) {
                    arrayList3.add(cVar.getReason());
                }
                ArrayList arrayList4 = arrayList3;
                List<a> list2 = this.f85065b.f85048c;
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it = list2.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    DmtEditText dmtEditText = (DmtEditText) next.a(R.id.dgj);
                    l.b(dmtEditText, str);
                    if (!l.a((Object) String.valueOf(dmtEditText.getText()), (Object) str)) {
                        arrayList5.add(next);
                    }
                }
                ArrayList<a> arrayList6 = arrayList5;
                ArrayList arrayList7 = new ArrayList(n.a((Iterable) arrayList6, 10));
                for (a aVar : arrayList6) {
                    arrayList7.add(aVar.getReason());
                }
                t tVar = new t(arrayList4, arrayList7);
                h.f.a.b<t, z> bVar = this.f85065b.f85056k;
                if (bVar != null) {
                    bVar.invoke(tVar);
                }
                b.a(this.f85065b).dismissAllowingStateLoss();
                HashMap<String, Object> hashMap = this.f85065b.f85057l;
                Iterator<T> it2 = this.f85065b.f85047b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it2.next();
                    if (t.a()) {
                        break;
                    }
                }
                T t3 = t;
                if (!(t3 == null || (reason = t3.getReason()) == null || (str2 = reason.f85000a) == null)) {
                    str = str2;
                }
                h.a("submit", "return", (HashMap) hashMap, "quit_pay_reason", str, (Boolean) false, (String) null, (Boolean) null, 192);
            }
        }
    }

    public static final /* synthetic */ com.bytedance.tux.sheet.sheet.a a(b bVar) {
        com.bytedance.tux.sheet.sheet.a aVar = bVar.f85046a;
        if (aVar == null) {
            l.a("dialog");
        }
        return aVar;
    }

    static final class f implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f85067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f85068b;

        static {
            Covode.recordClassIndex(53172);
        }

        f(b bVar, long j2) {
            this.f85067a = bVar;
            this.f85068b = j2;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            h.f.a.a<z> aVar = this.f85067a.f85055j;
            if (aVar != null) {
                aVar.invoke();
            }
            h.a(true, "return", (Boolean) null, (Boolean) null, this.f85067a.f85057l, Long.valueOf(SystemClock.elapsedRealtime() - this.f85068b), "quit_pay_reason", (String) null, (Boolean) false);
        }
    }

    public static final class a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f85059a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f85060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f85061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LinearLayout f85062d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f85063e;

        static {
            Covode.recordClassIndex(53166);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            T t;
            if (view != null && !this.f85060b.a()) {
                int a2 = n.a((List) this.f85063e.f85047b, (Object) view);
                String str = this.f85060b.getReason().f85000a;
                HashMap<String, Object> hashMap = this.f85063e.f85057l;
                Boolean bool = false;
                l.d("quit_pay_reason", "");
                l.d("quit_pay_reason", "");
                l.d(str, "");
                l.d(hashMap, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(h.f84785a);
                linkedHashMap.put("page_name", "quit_pay_reason");
                if (bool != null) {
                    bool.booleanValue();
                    linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
                }
                linkedHashMap.put("option_type", "quit_pay_reason");
                linkedHashMap.put("rank", Integer.valueOf(a2));
                linkedHashMap.put("option_name", str);
                linkedHashMap.putAll(hashMap);
                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_select_option", linkedHashMap);
                this.f85063e.f85051f = true;
                this.f85063e.b();
                Iterator<T> it = this.f85063e.f85047b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (l.a((Object) t.getReason().f85000a, (Object) this.f85063e.f85049d)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.setChecked(false);
                }
                this.f85060b.setChecked(true);
                this.f85063e.f85049d = this.f85060b.getReason().f85000a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view, LinearLayout linearLayout, b bVar) {
            super(700);
            this.f85060b = cVar;
            this.f85061c = view;
            this.f85062d = linearLayout;
            this.f85063e = bVar;
        }
    }

    private final void a(View view) {
        LinearLayout linearLayout;
        List<p> list;
        String string;
        MethodCollector.i(6467);
        b();
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.aem);
        l.b(constraintLayout, "");
        constraintLayout.setMaxHeight((int) (com.ss.android.ugc.aweme.ecommerce.util.h.f87569c - com.bytedance.common.utility.n.b(view.getContext(), 52.0f)));
        TuxButton tuxButton = this.f85058m;
        if (tuxButton != null) {
            o oVar = this.o;
            if (oVar == null || (string = oVar.f84993b) == null) {
                Context context = view.getContext();
                l.b(context, "");
                string = context.getResources().getString(R.string.bgy);
            }
            tuxButton.setText(string);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(R.id.di3);
        l.b(nestedScrollView, "");
        nestedScrollView.setVerticalScrollBarEnabled(false);
        NestedScrollView nestedScrollView2 = (NestedScrollView) view.findViewById(R.id.di3);
        if (nestedScrollView2 != null) {
            linearLayout = (LinearLayout) nestedScrollView2.findViewById(R.id.di2);
        } else {
            linearLayout = null;
        }
        o oVar2 = this.o;
        if (!(oVar2 == null || (list = oVar2.f84994c) == null)) {
            for (T t : list) {
                Integer num = t.f84995a;
                if (num != null && num.intValue() == 0) {
                    Context context2 = view.getContext();
                    l.b(context2, "");
                    c cVar = new c(context2, t, (byte) 0);
                    cVar.setOnClickListener(new a(cVar, view, linearLayout, this));
                    this.f85047b.add(cVar);
                    if (linearLayout != null) {
                        linearLayout.addView(cVar);
                    }
                }
                Integer num2 = t.f84995a;
                if (num2 != null && num2.intValue() == 1) {
                    Context context3 = view.getContext();
                    l.b(context3, "");
                    a aVar = new a(context3, t, new C2037b(view, linearLayout, this), new c(t, view, linearLayout, this), (byte) 0);
                    this.f85048c.add(aVar);
                    if (linearLayout != null) {
                        linearLayout.addView(aVar);
                    }
                }
            }
        }
        TuxButton tuxButton2 = this.f85058m;
        if (tuxButton2 != null) {
            tuxButton2.setOnClickListener(new d(this));
            MethodCollector.o(6467);
            return;
        }
        MethodCollector.o(6467);
    }

    static final class e extends m implements h.f.a.m<Boolean, Integer, z> {
        final /* synthetic */ View $contentView$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, View view) {
            super(2);
            this.this$0 = bVar;
            this.$contentView$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Boolean bool, Integer num) {
            Window window;
            View decorView;
            Window window2;
            boolean booleanValue = bool.booleanValue();
            int intValue = num.intValue();
            Dialog dialog = b.a(this.this$0).getDialog();
            if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
                window2.setSoftInputMode(48);
            }
            if (!booleanValue) {
                Dialog dialog2 = b.a(this.this$0).getDialog();
                if (!(dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                    decorView.setPadding(0, 0, 0, 0);
                }
                View view = this.$contentView$inlined;
                if (view != null) {
                    view.clearFocus();
                }
            } else {
                ValueAnimator duration = ValueAnimator.ofInt(0, (com.ss.android.ugc.aweme.ecommerce.util.h.f87568b - intValue) - this.this$0.f85053h).setDuration(200L);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a.b.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f85066a;

                    static {
                        Covode.recordClassIndex(53171);
                    }

                    {
                        this.f85066a = r1;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Window window;
                        View decorView;
                        Dialog dialog = b.a(this.f85066a.this$0).getDialog();
                        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                            l.b(valueAnimator, "");
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            decorView.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
                        }
                    }
                });
                duration.start();
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.t, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, o oVar, h.f.a.a<z> aVar, h.f.a.b<? super t, z> bVar, HashMap<String, Object> hashMap) {
        l.d(context, "");
        l.d(hashMap, "");
        this.f85054i = context;
        this.o = oVar;
        this.f85055j = aVar;
        this.f85056k = bVar;
        this.f85057l = hashMap;
        this.f85053h = com.bytedance.common.utility.c.b(context);
    }
}
