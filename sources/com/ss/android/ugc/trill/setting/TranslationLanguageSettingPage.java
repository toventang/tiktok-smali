package com.ss.android.ugc.trill.setting;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.language.b;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.language.a.a;
import com.ss.android.ugc.trill.setting.TranslationLanguageViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@com.bytedance.ies.powerpage.a.a
public final class TranslationLanguageSettingPage extends com.ss.android.ugc.aweme.setting.page.a implements u<ArrayList<b>>, a.AbstractC4054a {

    /* renamed from: e  reason: collision with root package name */
    public TextTitleBar f150545e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f150546f;

    /* renamed from: g  reason: collision with root package name */
    public TranslationLanguageViewModel f150547g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> f150548h;

    /* renamed from: i  reason: collision with root package name */
    public String f150549i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.trill.language.a.a f150550j;

    /* renamed from: k  reason: collision with root package name */
    public int f150551k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f150552l = -1;

    /* renamed from: m  reason: collision with root package name */
    public String f150553m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(99001);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.az7;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public final TextTitleBar d() {
        TextTitleBar textTitleBar = this.f150545e;
        if (textTitleBar == null) {
            l.a("mBtnFinish");
        }
        return textTitleBar;
    }

    public static final class a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslationLanguageSettingPage f150554a;

        static {
            Covode.recordClassIndex(99002);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(TranslationLanguageSettingPage translationLanguageSettingPage) {
            this.f150554a = translationLanguageSettingPage;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            l.d(view, "");
            this.f150554a.h();
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            com.ss.android.ugc.aweme.setting.serverpush.a.a aVar;
            l.d(view, "");
            if (this.f150554a.d().getEndText() != null) {
                DmtTextView endText = this.f150554a.d().getEndText();
                l.b(endText, "");
                if (endText.getCurrentTextColor() != androidx.core.content.b.c(this.f150554a.d().getContext(), R.color.y)) {
                    Intent intent = new Intent();
                    ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> arrayList = this.f150554a.f150548h;
                    if (!(arrayList == null || (aVar = arrayList.get(this.f150554a.f150552l)) == null)) {
                        TranslationLanguageViewModel translationLanguageViewModel = this.f150554a.f150547g;
                        if (translationLanguageViewModel != null) {
                            l.b(aVar, "");
                            String languageCode = aVar.getLanguageCode();
                            l.b(languageCode, "");
                            l.d(languageCode, "");
                            translationLanguageViewModel.f150558c.setTranslationLanguage("selected_translation_language", languageCode).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(TranslationLanguageViewModel.b.f150559a, TranslationLanguageViewModel.c.f150560a);
                        }
                        l.b(aVar, "");
                        intent.putExtra("updated_language_name", aVar.getLocalName());
                        intent.putExtra("updated_language_code", aVar.getLanguageCode());
                        r.a("save_transl_lang", new d().a("enter_from", "settings_page").a("enter_method", "translate_subtitle").a("lang", aVar.getLanguageCode()).f66730a);
                    }
                    e activity = this.f150554a.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, intent);
                    }
                    this.f150554a.h();
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(ArrayList<b> arrayList) {
        ArrayList<b> arrayList2 = arrayList;
        if (!com.bytedance.common.utility.collection.b.a((Collection) arrayList2)) {
            com.ss.android.ugc.trill.language.a.a aVar = this.f150550j;
            if (aVar == null) {
                com.ss.android.ugc.trill.language.a.a aVar2 = new com.ss.android.ugc.trill.language.a.a(getContext(), this);
                this.f150550j = aVar2;
                aVar2.f150484a = arrayList2;
                RecyclerView recyclerView = this.f150546f;
                if (recyclerView == null) {
                    l.a("mTranslationListLanguageView");
                }
                recyclerView.setAdapter(this.f150550j);
                return;
            }
            aVar.f150484a = arrayList2;
            com.ss.android.ugc.trill.language.a.a aVar3 = this.f150550j;
            if (aVar3 == null) {
                l.b();
            }
            aVar3.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.trill.language.a.a.AbstractC4054a
    public final void b(int i2) {
        if (i2 != this.f150552l) {
            if (i2 == this.f150551k) {
                TextTitleBar textTitleBar = this.f150545e;
                if (textTitleBar == null) {
                    l.a("mBtnFinish");
                }
                DmtTextView endText = textTitleBar.getEndText();
                TextTitleBar textTitleBar2 = this.f150545e;
                if (textTitleBar2 == null) {
                    l.a("mBtnFinish");
                }
                endText.setTextColor(androidx.core.content.b.c(textTitleBar2.getContext(), R.color.y));
                TextTitleBar textTitleBar3 = this.f150545e;
                if (textTitleBar3 == null) {
                    l.a("mBtnFinish");
                }
                DmtTextView endText2 = textTitleBar3.getEndText();
                l.b(endText2, "");
                endText2.setEnabled(false);
            } else {
                TextTitleBar textTitleBar4 = this.f150545e;
                if (textTitleBar4 == null) {
                    l.a("mBtnFinish");
                }
                DmtTextView endText3 = textTitleBar4.getEndText();
                TextTitleBar textTitleBar5 = this.f150545e;
                if (textTitleBar5 == null) {
                    l.a("mBtnFinish");
                }
                endText3.setTextColor(androidx.core.content.b.c(textTitleBar5.getContext(), R.color.bh));
                TextTitleBar textTitleBar6 = this.f150545e;
                if (textTitleBar6 == null) {
                    l.a("mBtnFinish");
                }
                DmtTextView endText4 = textTitleBar6.getEndText();
                l.b(endText4, "");
                endText4.setEnabled(true);
            }
            TranslationLanguageViewModel translationLanguageViewModel = this.f150547g;
            if (translationLanguageViewModel != null) {
                int i3 = this.f150552l;
                t<ArrayList<b>> tVar = translationLanguageViewModel.f150556a;
                if (tVar != null && !com.bytedance.common.utility.collection.b.a((Collection) tVar.getValue())) {
                    if (i3 >= 0) {
                        ArrayList<b> value = tVar.getValue();
                        if (value == null) {
                            l.b();
                        }
                        b bVar = value.get(i3);
                        l.b(bVar, "");
                        bVar.f99791a = false;
                    }
                    ArrayList<b> value2 = tVar.getValue();
                    if (value2 == null) {
                        l.b();
                    }
                    b bVar2 = value2.get(i2);
                    l.b(bVar2, "");
                    bVar2.f99791a = true;
                    translationLanguageViewModel.f150557b = i2;
                }
            }
            this.f150552l = i2;
            com.ss.android.ugc.trill.language.a.a aVar = this.f150550j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        View findViewById = view.findViewById(R.id.em8);
        l.b(findViewById, "");
        this.f150545e = (TextTitleBar) findViewById;
        View findViewById2 = view.findViewById(R.id.cbe);
        l.b(findViewById2, "");
        this.f150546f = (RecyclerView) findViewById2;
        super.onViewCreated(view, bundle);
        ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> arrayList = null;
        TranslationLanguageViewModel translationLanguageViewModel = (TranslationLanguageViewModel) ae.a(this, (ad.b) null).a(TranslationLanguageViewModel.class);
        this.f150547g = translationLanguageViewModel;
        if (translationLanguageViewModel != null) {
            if (translationLanguageViewModel.f150556a == null) {
                translationLanguageViewModel.f150556a = new t<>();
            }
            t<ArrayList<b>> tVar = translationLanguageViewModel.f150556a;
            if (tVar == null) {
                l.b();
            } else {
                tVar.observe(this, this);
            }
        }
        e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("translation_language");
                if (serializableExtra instanceof ArrayList) {
                    arrayList = serializableExtra;
                }
                this.f150548h = arrayList;
                this.f150549i = a(intent, "selected_translation_language_code");
                this.f150553m = a(intent, "enter_method");
            }
        }
        ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> arrayList2 = this.f150548h;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            h();
        }
        TranslationLanguageViewModel translationLanguageViewModel2 = this.f150547g;
        int i2 = -1;
        if (translationLanguageViewModel2 != null) {
            ArrayList<com.ss.android.ugc.aweme.setting.serverpush.a.a> arrayList3 = this.f150548h;
            String str = this.f150549i;
            ArrayList<b> arrayList4 = new ArrayList<>();
            if (arrayList3 != null) {
                int i3 = 0;
                i2 = -1;
                for (T t : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (p.a(str, t2.getLanguageCode(), false)) {
                        arrayList4.add(new b(new com.ss.android.ugc.aweme.i18n.language.i18n.a("", t2.getEnglishName(), t2.getLanguageCode(), t2.getLocalName()), true));
                        i2 = i3;
                    } else {
                        arrayList4.add(new b(new com.ss.android.ugc.aweme.i18n.language.i18n.a("", t2.getEnglishName(), t2.getLanguageCode(), t2.getLocalName()), false));
                    }
                    i3 = i4;
                }
            }
            t<ArrayList<b>> tVar2 = translationLanguageViewModel2.f150556a;
            if (tVar2 != null) {
                tVar2.postValue(arrayList4);
            }
        }
        this.f150551k = i2;
        this.f150552l = i2;
        RecyclerView recyclerView = this.f150546f;
        if (recyclerView == null) {
            l.a("mTranslationListLanguageView");
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        com.ss.android.ugc.aweme.base.ui.l a2 = com.ss.android.ugc.aweme.base.ui.l.a(getContext());
        l.b(a2, "");
        RecyclerView recyclerView2 = this.f150546f;
        if (recyclerView2 == null) {
            l.a("mTranslationListLanguageView");
        }
        recyclerView2.b(a2);
        TextTitleBar textTitleBar = this.f150545e;
        if (textTitleBar == null) {
            l.a("mBtnFinish");
        }
        DmtTextView titleView = textTitleBar.getTitleView();
        TextTitleBar textTitleBar2 = this.f150545e;
        if (textTitleBar2 == null) {
            l.a("mBtnFinish");
        }
        titleView.setTextColor(androidx.core.content.b.c(textTitleBar2.getContext(), R.color.nq));
        TextTitleBar textTitleBar3 = this.f150545e;
        if (textTitleBar3 == null) {
            l.a("mBtnFinish");
        }
        textTitleBar3.setTitle("Translation Language");
        TextTitleBar textTitleBar4 = this.f150545e;
        if (textTitleBar4 == null) {
            l.a("mBtnFinish");
        }
        DmtTextView endText = textTitleBar4.getEndText();
        l.b(endText, "");
        endText.setEnabled(false);
        TextTitleBar textTitleBar5 = this.f150545e;
        if (textTitleBar5 == null) {
            l.a("mBtnFinish");
        }
        DmtTextView endText2 = textTitleBar5.getEndText();
        TextTitleBar textTitleBar6 = this.f150545e;
        if (textTitleBar6 == null) {
            l.a("mBtnFinish");
        }
        endText2.setTextColor(androidx.core.content.b.c(textTitleBar6.getContext(), R.color.y));
        TextTitleBar textTitleBar7 = this.f150545e;
        if (textTitleBar7 == null) {
            l.a("mBtnFinish");
        }
        textTitleBar7.setOnTitleBarClickListener(new a(this));
    }
}
