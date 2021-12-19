package com.ss.android.ugc.aweme;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.AnchorApi;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import j.a.a.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class af extends aa {

    /* renamed from: d  reason: collision with root package name */
    public boolean f66265d;

    /* renamed from: e  reason: collision with root package name */
    public f f66266e;

    /* renamed from: f  reason: collision with root package name */
    private List<AnchorCell> f66267f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f66268g;

    static {
        Covode.recordClassIndex(40712);
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final View a(int i2) {
        if (this.f66268g == null) {
            this.f66268g = new SparseArray();
        }
        View view = (View) this.f66268g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f66268g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.aa
    public final void a() {
        SparseArray sparseArray = this.f66268g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.aa
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f66271a;

        static {
            Covode.recordClassIndex(40713);
        }

        a(af afVar) {
            this.f66271a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f66271a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f66272a;

        static {
            Covode.recordClassIndex(40714);
        }

        b(af afVar) {
            this.f66272a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f66272a.a(true);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f66277a;

        static {
            Covode.recordClassIndex(40718);
        }

        d(af afVar) {
            this.f66277a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f66277a.a(false);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f66278a;

        static {
            Covode.recordClassIndex(40719);
        }

        e(af afVar) {
            this.f66278a = afVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f66278a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ af f66273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bl f66274b;

        static {
            Covode.recordClassIndex(40715);
        }

        c(af afVar, bl blVar) {
            this.f66273a = afVar;
            this.f66274b = blVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            a.C0731a aVar = new a.C0731a(this.f66273a.getContext());
            Context context = this.f66273a.getContext();
            if (context != null) {
                str = context.getString(R.string.an4);
            } else {
                str = null;
            }
            aVar.f33402b = str;
            aVar.I = 17;
            Context context2 = this.f66273a.getContext();
            if (context2 != null) {
                str2 = context2.getString(R.string.an3);
            } else {
                str2 = null;
            }
            aVar.a(str2, (DialogInterface.OnClickListener) new a(this), false);
            Context context3 = this.f66273a.getContext();
            if (context3 != null) {
                str3 = context3.getString(R.string.an2);
            } else {
                str3 = null;
            }
            aVar.b(str3, (DialogInterface.OnClickListener) null, false);
            aVar.a().c();
        }

        static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f66275a;

            static {
                Covode.recordClassIndex(40716);
            }

            a(c cVar) {
                this.f66275a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                int type = aa.f62438b.getTYPE();
                l.d("", "");
                ((AnchorApi.RealApi) AnchorApi.f66431a.a(AnchorApi.RealApi.class)).getAnchorDeleteHistoryResponse(type, "", true).a(new g(this) {
                    /* class com.ss.android.ugc.aweme.af.c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f66276a;

                    static {
                        Covode.recordClassIndex(40717);
                    }

                    {
                        this.f66276a = r1;
                    }

                    @Override // b.g
                    public final /* synthetic */ Object then(i iVar) {
                        List<?> list;
                        l.b(iVar, "");
                        if (((com.ss.android.ugc.aweme.api.resp.a) iVar.d()).status_code == 0) {
                            f fVar = this.f66276a.f66275a.f66273a.f66266e;
                            if (!(fVar == null || (list = fVar.f158845b) == null)) {
                                list.clear();
                            }
                            f fVar2 = this.f66276a.f66275a.f66273a.f66266e;
                            if (fVar2 != null) {
                                fVar2.notifyDataSetChanged();
                            }
                            bl blVar = this.f66276a.f66275a.f66274b;
                            if (blVar != null) {
                                blVar.b();
                            }
                            this.f66276a.f66275a.f66273a.a(false);
                            androidx.fragment.app.e activity = this.f66276a.f66275a.f66273a.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                        }
                        return z.f158842a;
                    }
                }, i.f4826c, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z) {
        this.f66265d = z;
        ViewSwitcher viewSwitcher = (ViewSwitcher) a(R.id.fb_);
        l.b(viewSwitcher, "");
        viewSwitcher.setDisplayedChild(z ? 1 : 0);
        ViewSwitcher viewSwitcher2 = (ViewSwitcher) a(R.id.bnk);
        l.b(viewSwitcher2, "");
        viewSwitcher2.setDisplayedChild(z);
        Iterator<T> it = this.f66267f.iterator();
        while (it.hasNext()) {
            it.next().f66460h = z;
        }
        f fVar = this.f66266e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Collection<? extends AnchorCell> collection;
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        f fVar = null;
        if (arguments != null) {
            collection = arguments.getParcelableArrayList("recently_add");
        } else {
            collection = null;
        }
        this.f66267f.clear();
        List<AnchorCell> list = this.f66267f;
        if (collection == null) {
            collection = h.a.z.INSTANCE;
        }
        list.addAll(collection);
        Iterator<T> it = this.f66267f.iterator();
        while (it.hasNext()) {
            it.next().f66460h = false;
        }
        ((TuxIconView) a(R.id.bmp)).setOnClickListener(new a(this));
        TuxTextView tuxTextView = (TuxTextView) a(R.id.fb7);
        l.b(tuxTextView, "");
        Context context = getContext();
        if (context != null) {
            str = context.getString(aa.f62438b.anchorInfo().b());
        } else {
            str = null;
        }
        tuxTextView.setText(str);
        bl blVar = (bl) getActivity();
        if (getActivity() != null) {
            com.ss.android.ugc.aweme.b.c adapterFactory = aa.f62438b.adapterFactory(blVar);
            if (adapterFactory != null) {
                fVar = new f();
                adapterFactory.a(fVar, adapterFactory.f67860a, "recently_Add");
            }
            this.f66266e = fVar;
            if (fVar != null) {
                List<?> list2 = this.f66267f;
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                fVar.a(list2);
            }
        }
        RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
        l.b(recyclerView, "");
        recyclerView.setAdapter(this.f66266e);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djs);
        l.b(recyclerView2, "");
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ViewSwitcher viewSwitcher = (ViewSwitcher) a(R.id.fb_);
        l.b(viewSwitcher, "");
        viewSwitcher.setDisplayedChild(0);
        ((TuxTextView) a(R.id.fal)).setOnClickListener(new b(this));
        ((TuxTextView) a(R.id.faj)).setOnClickListener(new c(this, blVar));
        ((TuxIconView) a(R.id.bmp)).setOnClickListener(new d(this));
        ((TuxIconView) a(R.id.bmt)).setOnClickListener(new e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0p, viewGroup, false);
    }
}
