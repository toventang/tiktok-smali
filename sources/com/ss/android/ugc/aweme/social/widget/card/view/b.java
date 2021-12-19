package com.ss.android.ugc.aweme.social.widget.card.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.vm.SelectedCardVM;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class b implements com.ss.android.ugc.aweme.social.widget.card.d {

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super List<? extends IMUser>, z> f133954a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<z> f133955b;

    /* renamed from: c  reason: collision with root package name */
    public PowerList f133956c;

    /* renamed from: d  reason: collision with root package name */
    public TuxButton f133957d;

    /* renamed from: e  reason: collision with root package name */
    public SelectedCardVM f133958e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.social.widget.a f133959f;

    /* renamed from: g  reason: collision with root package name */
    public final int f133960g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.tux.dialog.a f133961h;

    /* renamed from: i  reason: collision with root package name */
    private TuxTextView f133962i;

    /* renamed from: j  reason: collision with root package name */
    private TuxTextView f133963j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f133964k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f133965l = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(87640);
    }

    public final com.ss.android.ugc.aweme.social.a.d f() {
        return (com.ss.android.ugc.aweme.social.a.d) this.f133965l.getValue();
    }

    static final class f extends m implements h.f.a.a<MAFDialogController$maxHeightLayoutManager$2$1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MAFDialogController$maxHeightLayoutManager$2$1 invoke() {
            this.this$0.f133959f.a();
            return new MAFDialogController$maxHeightLayoutManager$2$1(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final void c() {
        com.bytedance.tux.dialog.a aVar = this.f133961h;
        if (aVar == null) {
            l.a("attachDialog");
        }
        aVar.dismiss();
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final void b() {
        com.bytedance.tux.dialog.a aVar = this.f133961h;
        if (aVar == null) {
            l.a("attachDialog");
        }
        if (!aVar.f44796c.isShowing()) {
            com.bytedance.tux.dialog.a aVar2 = this.f133961h;
            if (aVar2 == null) {
                l.a("attachDialog");
            }
            aVar2.b().show();
        }
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.social.a.d> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.social.a.d invoke() {
            int i2 = this.this$0.f133960g;
            if (i2 == com.ss.android.ugc.aweme.social.a.e.f133657b) {
                return com.ss.android.ugc.aweme.social.a.d.GROUP_1;
            }
            if (i2 == com.ss.android.ugc.aweme.social.a.e.f133658c) {
                return com.ss.android.ugc.aweme.social.a.d.GROUP_2;
            }
            if (i2 == com.ss.android.ugc.aweme.social.a.e.f133659d) {
                return com.ss.android.ugc.aweme.social.a.d.GROUP_3;
            }
            if (i2 == com.ss.android.ugc.aweme.social.a.e.f133660e) {
                return com.ss.android.ugc.aweme.social.a.d.GROUP_4;
            }
            throw new IllegalStateException("online version can't execute the function!");
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final boolean a() {
        com.bytedance.tux.dialog.a aVar = this.f133961h;
        if (aVar == null) {
            l.a("attachDialog");
        }
        return aVar.f44796c.isShowing();
    }

    public final com.bytedance.tux.dialog.b.f e() {
        List<com.bytedance.tux.dialog.b.f> list;
        com.bytedance.tux.dialog.a aVar = this.f133961h;
        if (aVar == null) {
            l.a("attachDialog");
        }
        com.bytedance.tux.dialog.b.g action = aVar.f44794a.getAction();
        if (!(action instanceof com.bytedance.tux.dialog.b.b)) {
            action = null;
        }
        com.bytedance.tux.dialog.b.b bVar = (com.bytedance.tux.dialog.b.b) action;
        if (bVar == null || (list = bVar.f44819a) == null) {
            return null;
        }
        return (com.bytedance.tux.dialog.b.f) n.b((List) list, 0);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final void d() {
        SelectedCardVM selectedCardVM = this.f133958e;
        if (selectedCardVM == null) {
            l.a("selectedCardVM");
        }
        selectedCardVM.f133903h.removeObservers(this.f133959f);
        selectedCardVM.f133905j.removeObservers(this.f133959f);
        selectedCardVM.f133907l.removeObservers(this.f133959f);
        selectedCardVM.n.removeObservers(this.f133959f);
        SelectedCardVM selectedCardVM2 = this.f133958e;
        if (selectedCardVM2 == null) {
            l.a("selectedCardVM");
        }
        selectedCardVM2.f133902g.postValue(h.a.z.INSTANCE);
        selectedCardVM2.f133904i.postValue(0);
        selectedCardVM2.f133906k.postValue(h.a.z.INSTANCE);
        selectedCardVM2.f133908m.postValue(false);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f133955b = aVar;
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133969a;

        static {
            Covode.recordClassIndex(87650);
        }

        i(b bVar) {
            this.f133969a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.f.a.b<? super List<? extends IMUser>, z> bVar = this.f133969a.f133954a;
            if (bVar != null) {
                l.b(obj, "");
                bVar.invoke(obj);
            }
        }
    }

    public static final /* synthetic */ SelectedCardVM a(b bVar) {
        SelectedCardVM selectedCardVM = bVar.f133958e;
        if (selectedCardVM == null) {
            l.a("selectedCardVM");
        }
        return selectedCardVM;
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87643);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            b.a(this.this$0).a("show");
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            this.this$0.f133957d = tuxButton2;
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.social.widget.card.view.b.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f133966a;

                static {
                    Covode.recordClassIndex(87646);
                }

                {
                    this.f133966a = r1;
                }

                public final void onClick(View view) {
                    ArrayList arrayList;
                    ClickAgent.onClick(view);
                    SelectedCardVM a2 = b.a(this.f133966a.this$0);
                    List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b> value = a2.f133902g.getValue();
                    if (value != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : value) {
                            if (t.f133857b) {
                                arrayList2.add(t);
                            }
                        }
                        ArrayList<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b> arrayList3 = arrayList2;
                        ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
                        for (com.ss.android.ugc.aweme.social.widget.card.rec.cell.b bVar : arrayList3) {
                            arrayList4.add(bVar.f133856a);
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = h.a.z.INSTANCE;
                    }
                    if (!arrayList.isEmpty()) {
                        a2.f133899d = true;
                        a2.a("send");
                        a2.a(arrayList);
                        bz unused = kotlinx.coroutines.i.a(a2.f133900e, bf.f159041b, null, new SelectedCardVM.b(a2, arrayList, null), 2);
                    }
                }
            });
            return z.f158842a;
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133967a;

        static {
            Covode.recordClassIndex(87648);
        }

        g(b bVar) {
            this.f133967a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                PowerList powerList = this.f133967a.f133956c;
                if (powerList == null) {
                    l.a("recPowerList");
                }
                powerList.getState().b(list);
            }
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133970a;

        static {
            Covode.recordClassIndex(87651);
        }

        j(b bVar) {
            this.f133970a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            TuxButton tuxButton = this.f133970a.f133957d;
            if (tuxButton == null) {
                l.a("primaryButton");
            }
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            tuxButton.setLoading(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final void a(h.f.a.b<? super List<? extends IMUser>, z> bVar) {
        l.d(bVar, "");
        this.f133954a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$b  reason: collision with other inner class name */
    static final class C3474b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3474b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(this.this$0.f().getPrimary(), (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            bVar2.b(this.this$0.f().getSecondary(), (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            bVar2.f44820b = this.this$0.f().getBtnForceVertical();
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(87644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            h.f.a.a<z> aVar2;
            l.d(aVar, "");
            if (!b.a(this.this$0).f133899d && (aVar2 = this.this$0.f133955b) != null) {
                aVar2.invoke();
            }
            SelectedCardVM a2 = b.a(this.this$0);
            if (!a2.f133899d) {
                a2.a("cancel");
                List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b> value = a2.f133903h.getValue();
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        com.ss.android.ugc.aweme.social.widget.card.c.c.a(it.next().f133856a, a2.f133896a, a2.f133897b, u.a.CLOSE, a2.f133898c);
                    }
                }
            }
            a2.o.clear();
            return z.f158842a;
        }
    }

    static final class h<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f133968a;

        static {
            Covode.recordClassIndex(87649);
        }

        h(b bVar) {
            this.f133968a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            com.bytedance.tux.dialog.b.f e2 = this.f133968a.e();
            if (e2 != null) {
                String string = this.f133968a.f133959f.a().getString(this.f133968a.f().getPrimary());
                l.b(string, "");
                if (num != null && num.intValue() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                e2.a(z);
                if (num.intValue() > 1) {
                    string = string + " (" + num + ')';
                }
                e2.a(string);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.d
    public final void a(List<? extends User> list) {
        int title;
        l.d(list, "");
        SelectedCardVM selectedCardVM = this.f133958e;
        if (selectedCardVM == null) {
            l.a("selectedCardVM");
        }
        l.d(list, "");
        com.ss.android.ugc.aweme.arch.widgets.base.c<List<com.ss.android.ugc.aweme.social.widget.card.rec.cell.b>> cVar = selectedCardVM.f133902g;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.ss.android.ugc.aweme.social.widget.card.rec.cell.b(it.next()));
        }
        cVar.postValue(arrayList);
        selectedCardVM.f133904i.postValue(Integer.valueOf(list.size()));
        Integer multiTitle = f().getMultiTitle();
        if (multiTitle != null) {
            title = multiTitle.intValue();
        } else {
            title = f().getTitle();
        }
        if (list.size() > 1) {
            TuxTextView tuxTextView = this.f133962i;
            if (tuxTextView == null) {
                l.a("titleView");
            }
            tuxTextView.setText(title);
            return;
        }
        TuxTextView tuxTextView2 = this.f133962i;
        if (tuxTextView2 == null) {
            l.a("titleView");
        }
        tuxTextView2.setText(f().getTitle());
    }

    public b(com.ss.android.ugc.aweme.social.widget.a aVar, int i2) {
        l.d(aVar, "");
        this.f133959f = aVar;
        this.f133960g = i2;
        h.h a2 = h.i.a((h.f.a.a) new f(this));
        this.f133964k = a2;
        PowerList powerList = new PowerList(aVar.a());
        powerList.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        powerList.setLayoutManager((LinearLayoutManager) a2.getValue());
        powerList.a(RecUserSelectCell.class);
        this.f133956c = powerList;
        View view = null;
        View a3 = com.a.a(LayoutInflater.from(aVar.a()), R.layout.arz, null, false);
        View findViewById = a3.findViewById(R.id.em2);
        l.b(findViewById, "");
        this.f133962i = (TuxTextView) findViewById;
        View findViewById2 = a3.findViewById(R.id.aiu);
        l.b(findViewById2, "");
        this.f133963j = (TuxTextView) findViewById2;
        TuxTextView tuxTextView = this.f133962i;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        tuxTextView.setText(f().getTitle());
        TuxTextView tuxTextView2 = this.f133963j;
        if (tuxTextView2 == null) {
            l.a("descView");
        }
        tuxTextView2.setText(f().getDesc());
        com.bytedance.tux.dialog.b a4 = com.bytedance.tux.dialog.c.a(aVar.a());
        l.b(a3, "");
        com.bytedance.tux.dialog.b a5 = a4.a(new com.bytedance.tux.dialog.d.a(a3));
        PowerList powerList2 = this.f133956c;
        if (powerList2 == null) {
            l.a("recPowerList");
        }
        this.f133961h = ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(com.bytedance.tux.dialog.a.c.a(a5, powerList2), new C3474b(this)).b(new c(this)).a(new d(this))).a();
        PowerList powerList3 = this.f133956c;
        if (powerList3 == null) {
            l.a("recPowerList");
        }
        ViewParent parent = powerList3.getParent();
        View view2 = parent instanceof View ? parent : view;
        if (view2 != null) {
            com.bytedance.tux.h.i.b(view2, 0, null, 0, null, false, 26);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 1.0f;
            view2.setLayoutParams(layoutParams2);
        }
        com.bytedance.tux.dialog.a aVar2 = this.f133961h;
        if (aVar2 == null) {
            l.a("attachDialog");
        }
        View findViewById3 = aVar2.f44796c.findViewById(R.id.a2f);
        l.a((Object) findViewById3, "");
        ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        LinearLayout.LayoutParams layoutParams5 = layoutParams4;
        layoutParams5.weight = 0.0f;
        layoutParams5.height = -2;
        findViewById3.setLayoutParams(layoutParams4);
        com.bytedance.tux.dialog.b.f e2 = e();
        if (e2 != null) {
            e2.a(new e(this));
        }
        ac a6 = new ad(aVar).a(SelectedCardVM.class);
        l.b(a6, "");
        SelectedCardVM selectedCardVM = (SelectedCardVM) a6;
        this.f133958e = selectedCardVM;
        if (selectedCardVM == null) {
            l.a("selectedCardVM");
        }
        String str = aVar.f133713b;
        l.d(str, "");
        selectedCardVM.f133896a = str;
        l.d("share_pop_up", "");
        selectedCardVM.f133897b = "share_pop_up";
        selectedCardVM.f133898c = u.c.POP_UP;
        SelectedCardVM selectedCardVM2 = this.f133958e;
        if (selectedCardVM2 == null) {
            l.a("selectedCardVM");
        }
        selectedCardVM2.f133903h.observe(aVar, new g(this));
        SelectedCardVM selectedCardVM3 = this.f133958e;
        if (selectedCardVM3 == null) {
            l.a("selectedCardVM");
        }
        selectedCardVM3.f133905j.observe(aVar, new h(this));
        SelectedCardVM selectedCardVM4 = this.f133958e;
        if (selectedCardVM4 == null) {
            l.a("selectedCardVM");
        }
        selectedCardVM4.f133907l.observe(aVar, new i(this));
        SelectedCardVM selectedCardVM5 = this.f133958e;
        if (selectedCardVM5 == null) {
            l.a("selectedCardVM");
        }
        selectedCardVM5.n.observe(aVar, new j(this));
    }
}
