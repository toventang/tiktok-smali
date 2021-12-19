package com.ss.android.ugc.aweme.kids.setting.items.language;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.kids.setting.items.language.a.a;
import com.ss.android.ugc.aweme.kids.setting.items.language.c.b;
import com.ss.android.ugc.aweme.kids.setting.items.language.d.a;
import com.ss.android.ugc.aweme.kids.setting.items.language.viewmodel.AppLanguageViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements u<ArrayList<b>>, a.AbstractC2747a {

    /* renamed from: a  reason: collision with root package name */
    public int f107035a;

    /* renamed from: b  reason: collision with root package name */
    private AppLanguageViewModel f107036b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.setting.items.language.a.a f107037c;

    /* renamed from: d  reason: collision with root package name */
    private int f107038d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f107039e;

    static {
        Covode.recordClassIndex(68463);
    }

    public final View b(int i2) {
        if (this.f107039e == null) {
            this.f107039e = new HashMap();
        }
        View view = (View) this.f107039e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f107039e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f107039e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void a() {
        if (getActivity() != null) {
            e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a$a  reason: collision with other inner class name */
    public static final class C2746a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107043a;

        static {
            Covode.recordClassIndex(68464);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2746a(a aVar) {
            this.f107043a = aVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            l.d(view, "");
            this.f107043a.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
            if (r3 == androidx.core.content.b.c(r1, com.zhiliaoapp.musically.R.color.y)) goto L_0x004b;
         */
        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 291
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.setting.items.language.a.C2746a.b(android.view.View):void");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(ArrayList<b> arrayList) {
        ArrayList<b> arrayList2 = arrayList;
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList2)) {
            com.ss.android.ugc.aweme.kids.setting.items.language.a.a aVar = this.f107037c;
            if (aVar == null) {
                Context context = getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                com.ss.android.ugc.aweme.kids.setting.items.language.a.a aVar2 = new com.ss.android.ugc.aweme.kids.setting.items.language.a.a(context, this);
                this.f107037c = aVar2;
                aVar2.f107040a = arrayList2;
                RecyclerView recyclerView = (RecyclerView) b(R.id.cbe);
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f107037c);
                    return;
                }
                return;
            }
            aVar.f107040a = arrayList2;
            com.ss.android.ugc.aweme.kids.setting.items.language.a.a aVar3 = this.f107037c;
            if (aVar3 != null) {
                aVar3.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.items.language.a.a.AbstractC2747a
    public final void a(int i2) {
        DmtTextView endText;
        DmtTextView endText2;
        DmtTextView endText3;
        DmtTextView endText4;
        if (i2 != this.f107035a) {
            if (i2 == this.f107038d) {
                TextTitleBar textTitleBar = (TextTitleBar) b(R.id.em8);
                if (!(textTitleBar == null || (endText4 = textTitleBar.getEndText()) == null)) {
                    Context context = getContext();
                    if (context == null) {
                        l.b();
                    }
                    endText4.setTextColor(androidx.core.content.b.c(context, R.color.y));
                }
                TextTitleBar textTitleBar2 = (TextTitleBar) b(R.id.em8);
                if (!(textTitleBar2 == null || (endText3 = textTitleBar2.getEndText()) == null)) {
                    endText3.setEnabled(false);
                }
            } else {
                TextTitleBar textTitleBar3 = (TextTitleBar) b(R.id.em8);
                if (!(textTitleBar3 == null || (endText2 = textTitleBar3.getEndText()) == null)) {
                    Context context2 = getContext();
                    if (context2 == null) {
                        l.b();
                    }
                    endText2.setTextColor(androidx.core.content.b.c(context2, R.color.bh));
                }
                TextTitleBar textTitleBar4 = (TextTitleBar) b(R.id.em8);
                if (!(textTitleBar4 == null || (endText = textTitleBar4.getEndText()) == null)) {
                    endText.setEnabled(true);
                }
            }
            AppLanguageViewModel appLanguageViewModel = this.f107036b;
            if (appLanguageViewModel != null) {
                int i3 = this.f107035a;
                t<ArrayList<b>> tVar = appLanguageViewModel.f107079a;
                if (tVar == null) {
                    l.b();
                }
                if (!com.bytedance.common.utility.collection.b.a((Collection) tVar.getValue())) {
                    if (i3 >= 0) {
                        ArrayList<b> value = tVar.getValue();
                        if (value == null) {
                            l.b();
                        }
                        value.get(i3).f107059b = false;
                    }
                    ArrayList<b> value2 = tVar.getValue();
                    if (value2 == null) {
                        l.b();
                    }
                    value2.get(i2).f107059b = true;
                    appLanguageViewModel.f107080b = i2;
                }
            }
            this.f107035a = i2;
            com.ss.android.ugc.aweme.kids.setting.items.language.a.a aVar = this.f107037c;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) ae.a(activity, (ad.b) null).a(AppLanguageViewModel.class);
            this.f107036b = appLanguageViewModel;
            if (appLanguageViewModel != null) {
                if (appLanguageViewModel.f107079a == null) {
                    appLanguageViewModel.f107079a = new t<>();
                }
                t<ArrayList<b>> tVar = appLanguageViewModel.f107079a;
                if (tVar == null) {
                    l.b();
                } else {
                    tVar.observe(this, this);
                }
            }
            AppLanguageViewModel appLanguageViewModel2 = this.f107036b;
            if (appLanguageViewModel2 == null) {
                l.b();
            }
            getContext();
            int i2 = -1;
            com.ss.android.ugc.aweme.language.b a2 = a.b.f107065a.a();
            if (a2 == null) {
                l.b();
            }
            String e2 = a2.e();
            l.b(e2, "");
            ArrayList<b> arrayList = new ArrayList<>();
            for (com.ss.android.ugc.aweme.language.b bVar : a.b.f107065a.f107063a.values()) {
                if (TextUtils.equals(bVar.e(), e2)) {
                    arrayList.add(new b(bVar, true));
                    i2 = arrayList.size() - 1;
                } else {
                    arrayList.add(new b(bVar, false));
                }
            }
            t<ArrayList<b>> tVar2 = appLanguageViewModel2.f107079a;
            if (tVar2 != null) {
                tVar2.postValue(arrayList);
            }
            this.f107038d = i2;
            this.f107035a = i2;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        DmtTextView endText;
        DmtTextView endText2;
        DmtTextView titleView;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) b(R.id.cbe);
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        }
        com.ss.android.ugc.aweme.base.ui.l a2 = com.ss.android.ugc.aweme.base.ui.l.a(getContext());
        l.b(a2, "");
        RecyclerView recyclerView2 = (RecyclerView) b(R.id.cbe);
        if (recyclerView2 != null) {
            recyclerView2.a(a2);
        }
        com.bytedance.ies.dmt.ui.titlebar.a aVar = (com.bytedance.ies.dmt.ui.titlebar.a) b(R.id.em8);
        if (!(aVar == null || (titleView = aVar.getTitleView()) == null)) {
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            titleView.setTextColor(androidx.core.content.b.c(context, R.color.nq));
        }
        com.bytedance.ies.dmt.ui.titlebar.a aVar2 = (com.bytedance.ies.dmt.ui.titlebar.a) b(R.id.em8);
        if (aVar2 != null) {
            aVar2.setTitle(getText(R.string.ue));
        }
        TextTitleBar textTitleBar = (TextTitleBar) b(R.id.em8);
        if (!(textTitleBar == null || (endText2 = textTitleBar.getEndText()) == null)) {
            endText2.setEnabled(false);
        }
        TextTitleBar textTitleBar2 = (TextTitleBar) b(R.id.em8);
        if (!(textTitleBar2 == null || (endText = textTitleBar2.getEndText()) == null)) {
            Context context2 = getContext();
            if (context2 == null) {
                l.b();
            }
            endText.setTextColor(androidx.core.content.b.c(context2, R.color.y));
        }
        TextTitleBar textTitleBar3 = (TextTitleBar) b(R.id.em8);
        if (textTitleBar3 != null) {
            textTitleBar3.setOnTitleBarClickListener(new C2746a(this));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.adx, viewGroup, false);
        l.b(a2, "");
        return a2;
    }
}
