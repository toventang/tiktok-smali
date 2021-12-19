package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.bo;
import com.ss.android.ugc.aweme.effect.c.b.b;
import com.ss.android.ugc.aweme.port.internal.f;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.zhiliaoapp.musically.R;
import dmt.av.video.w;
import h.f.b.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public final class y extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    boolean f88995a = true;

    /* renamed from: b  reason: collision with root package name */
    private bo f88996b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f88997c;

    static {
        Covode.recordClassIndex(55973);
    }

    public final View a(int i2) {
        if (this.f88997c == null) {
            this.f88997c = new HashMap();
        }
        View view = (View) this.f88997c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f88997c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f88997c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int a() {
        LiveData<g> e2;
        g value;
        e activity = getActivity();
        if (activity == null) {
            return 0;
        }
        l.b(activity, "");
        ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
        l.b(a2, "");
        com.ss.android.ugc.aweme.effect.e.a a3 = ((EditEffectVideoModel) a2).a();
        if (a3 == null || (e2 = a3.e()) == null || (value = e2.getValue()) == null) {
            return 0;
        }
        return value.G();
    }

    public final VideoPublishEditModel b() {
        e activity = getActivity();
        if (activity == null) {
            return null;
        }
        l.b(activity, "");
        ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
        l.b(a2, "");
        com.ss.android.ugc.aweme.effect.e.a a3 = ((EditEffectVideoModel) a2).a();
        if (a3 != null) {
            return a3.b();
        }
        return null;
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f89002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bo f89003b;

        static {
            Covode.recordClassIndex(55976);
        }

        c(y yVar, bo boVar) {
            this.f89002a = yVar;
            this.f89003b = boVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bo boVar = this.f89003b;
                if (boVar.f88886c == 1) {
                    boVar.notifyItemChanged(1);
                }
                if (!bool.booleanValue()) {
                    bo boVar2 = this.f89003b;
                    if (boVar2.f88886c == 1) {
                        boVar2.f88886c = 0;
                        boVar2.notifyItemRangeChanged(0, 2);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        e activity = getActivity();
        if (activity != null) {
            ac a2 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
            l.b(a2, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a2;
            if (!editEffectVideoModel.b()) {
                f f2 = com.ss.android.ugc.aweme.port.in.g.a().f();
                l.b(activity, "");
                editEffectVideoModel.a(f2.a(activity));
            }
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f89000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bo f89001b;

        static {
            Covode.recordClassIndex(55975);
        }

        b(y yVar, bo boVar) {
            this.f89000a = yVar;
            this.f89001b = boVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            w wVar = (w) obj;
            if (wVar != null) {
                String str = wVar.f156971a;
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            this.f89001b.a(1);
                            return;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            this.f89001b.a(2);
                            return;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            this.f89001b.a(3);
                            return;
                        }
                        break;
                }
                bo boVar = this.f89001b;
                if (boVar.f88886c != 0) {
                    boVar.f88886c = 0;
                    boVar.notifyDataSetChanged();
                }
            }
        }
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f88998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bo f88999b;

        static {
            Covode.recordClassIndex(55974);
        }

        a(y yVar, bo boVar) {
            this.f88998a = yVar;
            this.f88999b = boVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            String string;
            com.ss.android.ugc.aweme.effect.c.b.b bVar = (com.ss.android.ugc.aweme.effect.c.b.b) obj;
            if (bVar != null) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f88998a.a(R.id.eut);
                l.b(aVDmtTextView, "");
                int i3 = bVar.f88924a;
                if (i3 == 0) {
                    y yVar = this.f88998a;
                    if (!com.ss.android.ugc.aweme.effect.c.b.a.a((long) bVar.f88925b)) {
                        i2 = R.string.blx;
                    } else if (yVar.f88995a) {
                        yVar.f88995a = false;
                        i2 = R.string.blz;
                    } else {
                        i2 = R.string.bly;
                    }
                    string = yVar.getString(i2);
                    l.b(string, "");
                } else if (i3 == 1) {
                    String a2 = com.a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(bVar.f88925b)}, 1));
                    l.b(a2, "");
                    string = this.f88998a.getString(R.string.bl5, a2);
                } else {
                    throw new IllegalArgumentException("unexpected TimeEffectHintOp, op = " + bVar.f88924a);
                }
                aVDmtTextView.setText(string);
            }
        }
    }

    static final class d implements bo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f89004a;

        static {
            Covode.recordClassIndex(55977);
        }

        d(y yVar) {
            this.f89004a = yVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
        @Override // com.ss.android.ugc.aweme.effect.bo.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(int r11, boolean r12) {
            /*
            // Method dump skipped, instructions count: 132
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.y.d.a(int, boolean):boolean");
        }
    }

    public final void a(boolean z, boolean z2) {
        bo boVar = this.f88996b;
        if (boVar != null) {
            boVar.f88884a = i.b();
            boVar.f88884a.get(1).isEnabled = z;
            boVar.f88884a.get(2).isEnabled = z2;
            boVar.f88884a.get(3).isEnabled = z2;
            boVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) a(R.id.eup);
        l.b(aVDmtHorizontalImageTextLayout, "");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        RecyclerView recyclerView = (RecyclerView) a(R.id.djw);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        bo boVar = new bo();
        this.f88996b = boVar;
        boolean a2 = com.ss.android.ugc.aweme.effect.c.b.a.a((long) a());
        boVar.f88884a = i.b();
        if (a2) {
            boVar.f88884a.get(2).isEnabled = false;
            boVar.f88884a.get(3).isEnabled = false;
        }
        boVar.f88885b = new d(this);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djw);
        l.b(recyclerView2, "");
        recyclerView2.setAdapter(boVar);
        e activity = getActivity();
        if (activity != null) {
            ac a3 = ae.a(activity, (ad.b) null).a(EditEffectVideoModel.class);
            l.b(a3, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a3;
            editEffectVideoModel.f().observe(this, new a(this, boVar));
            editEffectVideoModel.f().setValue(b.a.b((float) a()));
            editEffectVideoModel.a().l().observe(this, new b(this, boVar));
            editEffectVideoModel.a().f().observe(this, new c(this, boVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a10, viewGroup, false);
    }
}
