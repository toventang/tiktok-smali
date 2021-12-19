package com.ss.android.ugc.trill.language.b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.ss.android.ugc.aweme.base.ui.l;
import com.ss.android.ugc.aweme.i18n.language.b;
import com.ss.android.ugc.aweme.i18n.language.i18n.b;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.language.a.a;
import com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements u<ArrayList<b>>, a.AbstractC4054a {

    /* renamed from: a  reason: collision with root package name */
    TextTitleBar f150491a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f150492b;

    /* renamed from: c  reason: collision with root package name */
    public int f150493c;

    /* renamed from: d  reason: collision with root package name */
    private AppLanguageViewModel f150494d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.trill.language.a.a f150495e;

    /* renamed from: j  reason: collision with root package name */
    private int f150496j;

    static {
        Covode.recordClassIndex(98973);
    }

    public final void a() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(ArrayList<b> arrayList) {
        ArrayList<b> arrayList2 = arrayList;
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList2)) {
            com.ss.android.ugc.trill.language.a.a aVar = this.f150495e;
            if (aVar == null) {
                com.ss.android.ugc.trill.language.a.a aVar2 = new com.ss.android.ugc.trill.language.a.a(getContext(), this);
                this.f150495e = aVar2;
                aVar2.f150484a = arrayList2;
                this.f150492b.setAdapter(this.f150495e);
                return;
            }
            aVar.f150484a = arrayList2;
            this.f150495e.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.trill.language.a.a.AbstractC4054a
    public final void b(int i2) {
        if (i2 != this.f150493c) {
            if (i2 == this.f150496j) {
                this.f150491a.getEndText().setTextColor(androidx.core.content.b.c(getContext(), R.color.y));
                this.f150491a.getEndText().setEnabled(false);
            } else {
                this.f150491a.getEndText().setTextColor(androidx.core.content.b.c(getContext(), R.color.bh));
                this.f150491a.getEndText().setEnabled(true);
            }
            AppLanguageViewModel appLanguageViewModel = this.f150494d;
            int i3 = this.f150493c;
            t<ArrayList<b>> tVar = appLanguageViewModel.f150498a;
            if (!com.bytedance.common.utility.collection.b.a((Collection) tVar.getValue())) {
                if (i3 >= 0) {
                    tVar.getValue().get(i3).f99791a = false;
                }
                tVar.getValue().get(i2).f99791a = true;
                appLanguageViewModel.f150499b = i2;
            }
            this.f150493c = i2;
            this.f150495e.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) ae.a(getActivity(), (ad.b) null).a(AppLanguageViewModel.class);
            this.f150494d = appLanguageViewModel;
            if (appLanguageViewModel.f150498a == null) {
                appLanguageViewModel.f150498a = new t<>();
            }
            appLanguageViewModel.f150498a.observe(this, this);
            AppLanguageViewModel appLanguageViewModel2 = this.f150494d;
            int i2 = -1;
            String b2 = com.ss.android.ugc.aweme.i18n.language.a.b(getContext());
            ArrayList<b> arrayList = new ArrayList<>();
            for (com.ss.android.ugc.aweme.language.b bVar : SettingServiceImpl.v().j().values()) {
                if (TextUtils.equals(bVar.e(), b2)) {
                    arrayList.add(new b(bVar, true));
                    i2 = arrayList.size() - 1;
                } else {
                    arrayList.add(new b(bVar, false));
                }
            }
            appLanguageViewModel2.f150498a.postValue(arrayList);
            this.f150496j = i2;
            this.f150493c = i2;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        this.f150491a = (TextTitleBar) view.findViewById(R.id.em8);
        this.f150492b = (RecyclerView) view.findViewById(R.id.cbe);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.f150492b;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f150492b.a(l.a(getContext()));
        this.f150491a.getTitleView().setTextColor(androidx.core.content.b.c(this.f150491a.getContext(), R.color.nq));
        this.f150491a.setTitle(getText(R.string.ue));
        this.f150491a.getEndText().setEnabled(false);
        this.f150491a.getEndText().setTextColor(androidx.core.content.b.c(this.f150491a.getContext(), R.color.y));
        this.f150491a.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.trill.language.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98974);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                a.this.a();
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
                if (a.this.f150491a == null || a.this.f150491a.getEndText() == null || a.this.f150491a.getEndText().getCurrentTextColor() == androidx.core.content.b.c(a.this.f150491a.getContext(), R.color.y)) {
                    a.this.a();
                    return;
                }
                b.a.f99809a.a(SettingServiceImpl.v().i().get(a.this.f150493c).a(), SettingServiceImpl.v().i().get(a.this.f150493c).f(), a.this.getContext());
                AVExternalServiceImpl.a().configService().cacheConfig().clearFilterCache();
                com.ss.android.ugc.aweme.utils.e.a.f142843a = 0.0f;
            }
        });
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.ay0, viewGroup, false);
    }
}
