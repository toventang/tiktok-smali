package com.ss.android.ugc.aweme.contentlanguage.a;

import android.os.Bundle;
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
import com.ss.android.ugc.aweme.contentlanguage.a;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.i18n.language.b;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;

public final class a extends com.ss.android.ugc.aweme.base.f.a implements u<ArrayList<b>>, a.AbstractC1815a {

    /* renamed from: a  reason: collision with root package name */
    public ContentPreferenceViewModel f78148a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f78149b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f78150c;

    /* renamed from: d  reason: collision with root package name */
    public int f78151d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.contentlanguage.a f78152e;

    /* renamed from: j  reason: collision with root package name */
    private int f78153j;

    static {
        Covode.recordClassIndex(48456);
    }

    public final void a() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().c();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ContentPreferenceViewModel contentPreferenceViewModel = this.f78148a;
        if (contentPreferenceViewModel != null && contentPreferenceViewModel.f78217b) {
            contentPreferenceViewModel.e();
            contentPreferenceViewModel.f78217b = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(ArrayList<b> arrayList) {
        ArrayList<b> arrayList2 = arrayList;
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList2)) {
            com.ss.android.ugc.aweme.contentlanguage.a aVar = this.f78152e;
            if (aVar == null) {
                com.ss.android.ugc.aweme.contentlanguage.a aVar2 = new com.ss.android.ugc.aweme.contentlanguage.a(getContext(), this);
                this.f78152e = aVar2;
                aVar2.f78143a = arrayList2;
                this.f78150c.setAdapter(this.f78152e);
                return;
            }
            aVar.f78143a = arrayList2;
            this.f78152e.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.contentlanguage.a.AbstractC1815a
    public final void a(int i2) {
        b bVar;
        ArrayList<b> value;
        b bVar2;
        if (i2 != this.f78151d) {
            if (i2 == this.f78153j) {
                this.f78149b.getEndText().setTextColor(androidx.core.content.b.c(getContext(), R.color.y));
                this.f78149b.getEndText().setEnabled(false);
            } else {
                this.f78149b.getEndText().setTextColor(androidx.core.content.b.c(getContext(), R.color.bh));
                this.f78149b.getEndText().setEnabled(true);
            }
            ContentPreferenceViewModel contentPreferenceViewModel = this.f78148a;
            int i3 = this.f78151d;
            t<ArrayList<b>> d2 = contentPreferenceViewModel.d();
            if (!com.bytedance.common.utility.collection.b.a((Collection) d2.getValue())) {
                if (!(i3 < 0 || (value = d2.getValue()) == null || (bVar2 = value.get(i3)) == null)) {
                    bVar2.f99791a = false;
                }
                ArrayList<b> value2 = d2.getValue();
                if (!(value2 == null || (bVar = value2.get(i2)) == null)) {
                    bVar.f99791a = true;
                }
                contentPreferenceViewModel.f78216a = i2;
            }
            this.f78151d = i2;
            this.f78152e.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        ArrayList<b> value;
        b bVar;
        super.onCreate(bundle);
        if (getActivity() != null) {
            Integer num = null;
            ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) ae.a(getActivity(), (ad.b) null).a(ContentPreferenceViewModel.class);
            this.f78148a = contentPreferenceViewModel;
            contentPreferenceViewModel.d().observe(this, this);
            ContentPreferenceViewModel contentPreferenceViewModel2 = this.f78148a;
            l.d(getContext(), "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) contentPreferenceViewModel2.d().getValue()) && contentPreferenceViewModel2.f78216a >= 0) {
                int i2 = contentPreferenceViewModel2.f78216a;
                ArrayList<b> value2 = contentPreferenceViewModel2.d().getValue();
                if (value2 == null || (num = Integer.valueOf(value2.size())) == null) {
                    l.b();
                }
                if (!(i2 > num.intValue() - 1 || (value = contentPreferenceViewModel2.d().getValue()) == null || (bVar = value.get(contentPreferenceViewModel2.f78216a)) == null)) {
                    bVar.f99791a = false;
                }
            }
            this.f78153j = -1;
            this.f78151d = -1;
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        this.f78149b = (TextTitleBar) view.findViewById(R.id.em8);
        this.f78150c = (RecyclerView) view.findViewById(R.id.cbe);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.f78150c;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f78150c.a(com.ss.android.ugc.aweme.base.ui.l.a(getContext()));
        this.f78149b.getTitleView().setTextColor(androidx.core.content.b.c(getContext(), R.color.nq));
        this.f78149b.setTitle(getText(R.string.au6));
        this.f78149b.getEndText().setEnabled(false);
        this.f78149b.getEndText().setTextColor(androidx.core.content.b.c(getContext(), R.color.y));
        this.f78149b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {
            /* class com.ss.android.ugc.aweme.contentlanguage.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48457);
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void a(View view) {
                if (a.this.getActivity() != null) {
                    a.this.getActivity().getSupportFragmentManager().c();
                }
            }

            @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
            public final void b(View view) {
                com.ss.android.ugc.aweme.setting.serverpush.a.a aVar;
                if (a.this.f78149b == null || a.this.f78149b.getEndText() == null || a.this.f78149b.getEndText().getCurrentTextColor() == androidx.core.content.b.c(view.getContext(), R.color.y)) {
                    a.this.a();
                } else if (a.this.f78151d != -1) {
                    ContentPreferenceViewModel contentPreferenceViewModel = a.this.f78148a;
                    b bVar = a.this.f78148a.d().getValue().get(a.this.f78151d);
                    if (bVar == null) {
                        aVar = null;
                    } else {
                        aVar = new com.ss.android.ugc.aweme.setting.serverpush.a.a();
                        if (bVar.f99792b instanceof com.ss.android.ugc.aweme.i18n.language.i18n.a) {
                            com.ss.android.ugc.aweme.i18n.language.i18n.a aVar2 = (com.ss.android.ugc.aweme.i18n.language.i18n.a) bVar.f99792b;
                            aVar.setEnglishName(aVar2.f99793a);
                            aVar.setLanguageCode(aVar2.f99794b);
                            aVar.setLocalName(bVar.a());
                        } else {
                            throw new IllegalStateException("please send I18nLanguageItem");
                        }
                    }
                    contentPreferenceViewModel.a(aVar);
                    a.this.a();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.b3, viewGroup, false);
    }
}
