package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.discover.adapter.l;
import com.ss.android.ugc.aweme.feed.n.o;
import com.ss.android.ugc.aweme.q.a.a.c;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class ag extends aa implements com.ss.android.ugc.aweme.common.e.c<AnchorCell>, o {

    /* renamed from: f  reason: collision with root package name */
    public static final a f66279f = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    b f66280d;

    /* renamed from: e  reason: collision with root package name */
    public j.a.a.f f66281e;

    /* renamed from: g  reason: collision with root package name */
    private com.ss.android.ugc.aweme.common.e.b<ah> f66282g;

    /* renamed from: h  reason: collision with root package name */
    private ah f66283h;

    /* renamed from: i  reason: collision with root package name */
    private j.a.a.f f66284i;

    /* renamed from: j  reason: collision with root package name */
    private l<RecyclerView.ViewHolder> f66285j;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f66286k;

    static {
        Covode.recordClassIndex(40722);
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final View a(int i2) {
        if (this.f66286k == null) {
            this.f66286k = new SparseArray();
        }
        View view = (View) this.f66286k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f66286k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final void a() {
        SparseArray sparseArray = this.f66286k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void bh_() {
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(List<AnchorCell> list, boolean z) {
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.aa
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40723);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void aO_() {
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar != null) {
            lVar.a(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final boolean bi_() {
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar == null || lVar.f80562a != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.ss.android.ugc.aweme.common.e.b<ah> bVar = this.f66282g;
        if (bVar != null) {
            bVar.cd_();
            bVar.h();
        }
        super.onDestroy();
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        final Keva f66289a;

        /* renamed from: b  reason: collision with root package name */
        public final String f66290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ag f66291c;

        static {
            Covode.recordClassIndex(40724);
        }

        public final String[] a() {
            String[] stringArray = this.f66289a.getStringArray(this.f66290b, new String[0]);
            h.f.b.l.b(stringArray, "");
            return stringArray;
        }

        public b(ag agVar, String str) {
            h.f.b.l.d(str, "");
            this.f66291c = agVar;
            this.f66290b = str;
            this.f66289a = Keva.getRepo(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.chx);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void aS_() {
        EditText editText = (EditText) a(R.id.duo);
        h.f.b.l.b(editText, "");
        String obj = editText.getText().toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = p.b((CharSequence) obj).toString();
        com.ss.android.ugc.aweme.common.e.b<ah> bVar = this.f66282g;
        if (bVar != null) {
            bVar.a(4, obj2);
        }
    }

    public final void c() {
        String[] a2;
        b bVar = this.f66280d;
        if (bVar != null && (a2 = bVar.a()) != null) {
            List<?> k2 = h.a.i.k(a2);
            j.a.a.f fVar = this.f66281e;
            if (fVar == null) {
                h.f.b.l.a("mHistoryAdapter");
            } else {
                fVar.a(k2);
            }
            j.a.a.f fVar2 = this.f66281e;
            if (fVar2 == null) {
                h.f.b.l.a("mHistoryAdapter");
            } else {
                fVar2.notifyDataSetChanged();
            }
            if (k2.size() > 2) {
                TuxTextView tuxTextView = (TuxTextView) a(R.id.a73);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void f() {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.fb1);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.fb0);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.chx);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djp);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setVisibility(8);
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar != null) {
            lVar.a(0);
        }
    }

    public final void d() {
        com.ss.android.ugc.aweme.common.e.b<ah> bVar = this.f66282g;
        if (bVar != null) {
            EditText editText = (EditText) a(R.id.duo);
            h.f.b.l.b(editText, "");
            String obj = editText.getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = p.b((CharSequence) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                bVar.a(1, obj2);
                RecyclerView recyclerView = (RecyclerView) a(R.id.djo);
                h.f.b.l.b(recyclerView, "");
                recyclerView.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) a(R.id.a73);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                com.ss.android.ugc.aweme.commercialize.utils.l.b(getContext(), a(R.id.duo));
                b bVar2 = this.f66280d;
                if (bVar2 != null) {
                    h.f.b.l.d(obj2, "");
                    String[] strArr = {obj2};
                    String[] stringArray = bVar2.f66289a.getStringArray(bVar2.f66290b, new String[0]);
                    h.f.b.l.b(stringArray, "");
                    h.f.b.l.d(strArr, "");
                    h.f.b.l.d(stringArray, "");
                    int length = stringArray.length;
                    Object[] copyOf = Arrays.copyOf(strArr, length + 1);
                    System.arraycopy(stringArray, 0, copyOf, 1, length);
                    h.f.b.l.b(copyOf, "");
                    Object[] array = n.d((Iterable) h.a.i.m(copyOf), 10).toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    bVar2.f66289a.storeStringArray(bVar2.f66290b, (String[]) array);
                }
            }
        }
    }

    public static final class f implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f66298a;

        static {
            Covode.recordClassIndex(40728);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(ag agVar) {
            this.f66298a = agVar;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 3 && i2 != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            this.f66298a.d();
            return true;
        }
    }

    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f66299a;

        static {
            Covode.recordClassIndex(40729);
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(ag agVar) {
            this.f66299a = agVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            h.f.b.l.d(editable, "");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageView imageView = (ImageView) this.f66299a.a(R.id.dun);
                h.f.b.l.b(imageView, "");
                imageView.setVisibility(4);
                return;
            }
            ImageView imageView2 = (ImageView) this.f66299a.a(R.id.dun);
            h.f.b.l.b(imageView2, "");
            imageView2.setVisibility(0);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
            RecyclerView recyclerView = (RecyclerView) this.f66299a.a(R.id.djo);
            h.f.b.l.b(recyclerView, "");
            recyclerView.setVisibility(0);
            ag agVar = this.f66299a;
            TuxTextView tuxTextView = (TuxTextView) agVar.a(R.id.fb1);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) agVar.a(R.id.fb0);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            RecyclerView recyclerView2 = (RecyclerView) agVar.a(R.id.djp);
            h.f.b.l.b(recyclerView2, "");
            recyclerView2.setVisibility(8);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) agVar.a(R.id.chx);
            h.f.b.l.b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            this.f66299a.c();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f66297a;

        static {
            Covode.recordClassIndex(40727);
        }

        e(ag agVar) {
            this.f66297a = agVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f66297a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    public static final /* synthetic */ j.a.a.f a(ag agVar) {
        j.a.a.f fVar = agVar.f66281e;
        if (fVar == null) {
            h.f.b.l.a("mHistoryAdapter");
        }
        return fVar;
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(Exception exc) {
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar != null) {
            lVar.a(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void c(Exception exc) {
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar != null) {
            lVar.a(2);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f66300a;

        static {
            Covode.recordClassIndex(40730);
        }

        h(ag agVar) {
            this.f66300a = agVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((EditText) this.f66300a.a(R.id.duo)).setText("");
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.n.o
    public final void a(boolean z) {
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar != null) {
            lVar.a(z ? 1 : 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            EditText editText = (EditText) a(R.id.duo);
            h.f.b.l.b(editText, "");
            editText.getText().clear();
            com.ss.android.ugc.aweme.commercialize.utils.l.b(getContext(), a(R.id.duo));
        }
    }

    public static final class d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.a.a.f f66295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ag f66296b;

        static {
            Covode.recordClassIndex(40726);
        }

        @Override // com.ss.android.ugc.aweme.q.a.a.c.a
        public final void a(String str) {
            List<?> list;
            h.f.b.l.d(str, "");
            j.a.a.f fVar = this.f66295a;
            ag agVar = this.f66296b;
            b bVar = agVar.f66280d;
            if (bVar != null) {
                h.f.b.l.d(str, "");
                String[] stringArray = bVar.f66289a.getStringArray(bVar.f66290b, new String[0]);
                h.f.b.l.b(stringArray, "");
                ArrayList arrayList = new ArrayList();
                for (String str2 : stringArray) {
                    if (!TextUtils.equals(str2, str)) {
                        arrayList.add(str2);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                bVar.f66289a.storeStringArray(bVar.f66290b, strArr);
                if (strArr != null) {
                    if (strArr.length <= 2) {
                        TuxTextView tuxTextView = (TuxTextView) agVar.a(R.id.a73);
                        h.f.b.l.b(tuxTextView, "");
                        tuxTextView.setVisibility(8);
                    }
                    list = h.a.i.k(strArr);
                    fVar.a(list);
                    this.f66295a.notifyDataSetChanged();
                }
            }
            list = new ArrayList<>();
            fVar.a(list);
            this.f66295a.notifyDataSetChanged();
        }

        d(j.a.a.f fVar, ag agVar) {
            this.f66295a = fVar;
            this.f66296b = agVar;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f66301a;

        static {
            Covode.recordClassIndex(40731);
        }

        i(ag agVar) {
            this.f66301a = agVar;
        }

        public final void onClick(View view) {
            List<?> list;
            ClickAgent.onClick(view);
            ag agVar = this.f66301a;
            b bVar = agVar.f66280d;
            if (bVar != null) {
                bVar.f66289a.erase(bVar.f66290b);
            }
            TuxTextView tuxTextView = (TuxTextView) agVar.a(R.id.a73);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            j.a.a.f a2 = ag.a(this.f66301a);
            if (!(a2 == null || (list = a2.f158845b) == null)) {
                list.clear();
            }
            j.a.a.f a3 = ag.a(this.f66301a);
            if (a3 != null) {
                a3.notifyDataSetChanged();
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.f66301a.a(R.id.a73);
            h.f.b.l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.aa
    public final void onActivityCreated(Bundle bundle) {
        j.a.a.f fVar;
        super.onActivityCreated(bundle);
        j.a.a.f fVar2 = new j.a.a.f();
        androidx.fragment.app.e activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.IFragmentNavigation");
        com.ss.android.ugc.aweme.q.a.a.c cVar = new com.ss.android.ugc.aweme.q.a.a.c((bl) activity);
        cVar.f118916a = new c(fVar2, this);
        cVar.f118925d = new d(fVar2, this);
        fVar2.a(String.class, cVar);
        this.f66281e = fVar2;
        com.ss.android.ugc.aweme.b.c adapterFactory = aa.f62438b.adapterFactory((bl) getActivity());
        String str = null;
        if (adapterFactory != null) {
            fVar = new j.a.a.f();
            adapterFactory.a(fVar, adapterFactory.f67860a, "search_result");
        } else {
            fVar = null;
        }
        this.f66284i = fVar;
        this.f66282g = new com.ss.android.ugc.aweme.common.e.b<>();
        this.f66280d = new b(this, "anchor_search_history" + aa.f62438b.name());
        this.f66283h = new ah(aa.f62438b.getTYPE());
        com.ss.android.ugc.aweme.common.e.b<ah> bVar = this.f66282g;
        if (bVar != null) {
            bVar.a_(this);
        }
        com.ss.android.ugc.aweme.common.e.b<ah> bVar2 = this.f66282g;
        if (bVar2 != null) {
            bVar2.a((com.ss.android.ugc.aweme.common.b) this.f66283h);
        }
        ((TuxTextView) a(R.id.a20)).setOnClickListener(new e(this));
        EditText editText = (EditText) a(R.id.duo);
        h.f.b.l.b(editText, "");
        Context context = getContext();
        if (context != null) {
            aa.f62438b.anchorInfo();
            str = context.getString(R.string.anc);
        }
        editText.setHint(str);
        EditText editText2 = (EditText) a(R.id.duo);
        h.f.b.l.b(editText2, "");
        editText2.setImeOptions(3);
        EditText editText3 = (EditText) a(R.id.duo);
        h.f.b.l.b(editText3, "");
        editText3.setInputType(1);
        ((EditText) a(R.id.duo)).setOnEditorActionListener(new f(this));
        ((EditText) a(R.id.duo)).addTextChangedListener(new g(this));
        EditText editText4 = (EditText) a(R.id.duo);
        h.f.b.l.b(editText4, "");
        editText4.setFocusable(true);
        EditText editText5 = (EditText) a(R.id.duo);
        h.f.b.l.b(editText5, "");
        editText5.setFocusableInTouchMode(true);
        ((EditText) a(R.id.duo)).requestFocus();
        com.ss.android.ugc.aweme.commercialize.utils.l.a(getContext(), a(R.id.duo));
        ((ImageView) a(R.id.dun)).setOnClickListener(new h(this));
        ((TuxTextView) a(R.id.a73)).setOnClickListener(new i(this));
        this.f66285j = l.a(this.f66284i);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djp);
        h.f.b.l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djp);
        h.f.b.l.b(recyclerView2, "");
        recyclerView2.setAdapter(this.f66285j);
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.djp);
        h.f.b.l.b(recyclerView3, "");
        recyclerView3.setOnFlingListener(new com.ss.android.ugc.aweme.feed.n.p((RecyclerView) a(R.id.djp), this));
        RecyclerView recyclerView4 = (RecyclerView) a(R.id.djo);
        h.f.b.l.b(recyclerView4, "");
        getContext();
        recyclerView4.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView5 = (RecyclerView) a(R.id.djo);
        h.f.b.l.b(recyclerView5, "");
        j.a.a.f fVar3 = this.f66281e;
        if (fVar3 == null) {
            h.f.b.l.a("mHistoryAdapter");
        }
        recyclerView5.setAdapter(fVar3);
        c();
    }

    public static final class c implements com.ss.android.ugc.aweme.q.a<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.a.a.f f66293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ag f66294b;

        static {
            Covode.recordClassIndex(40725);
        }

        c(j.a.a.f fVar, ag agVar) {
            this.f66293a = fVar;
            this.f66294b = agVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.q.a
        public final /* synthetic */ void a(View view, String str) {
            String str2 = str;
            h.f.b.l.d(view, "");
            h.f.b.l.d(str2, "");
            ag agVar = this.f66294b;
            ((EditText) agVar.a(R.id.duo)).setText(str2);
            ((EditText) agVar.a(R.id.duo)).setSelection(str2.length());
            agVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void b(List<AnchorCell> list, boolean z) {
        j.a.a.f fVar;
        if (!(list == null || list.isEmpty() || (fVar = this.f66284i) == null)) {
            fVar.a(list);
        }
        l<RecyclerView.ViewHolder> lVar = this.f66285j;
        if (lVar != null) {
            lVar.a(z ? 1 : 0);
        }
        j.a.a.f fVar2 = this.f66284i;
        if (fVar2 != null) {
            fVar2.notifyDataSetChanged();
        }
        aa.f62438b.anchorMob();
    }

    @Override // com.ss.android.ugc.aweme.common.e.c
    public final void a(List<AnchorCell> list, boolean z) {
        TuxTextView tuxTextView = (TuxTextView) a(R.id.fb1);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.fb0);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setVisibility(8);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) a(R.id.chx);
        h.f.b.l.b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djp);
        h.f.b.l.b(recyclerView, "");
        recyclerView.setVisibility(0);
        if (list != null && !list.isEmpty()) {
            j.a.a.f fVar = this.f66284i;
            if (fVar != null) {
                fVar.a(list);
            }
            l<RecyclerView.ViewHolder> lVar = this.f66285j;
            if (lVar != null) {
                lVar.a(z ? 1 : 0);
            }
            j.a.a.f fVar2 = this.f66284i;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
            aa.f62438b.anchorMob();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.aw, viewGroup, false);
    }
}
