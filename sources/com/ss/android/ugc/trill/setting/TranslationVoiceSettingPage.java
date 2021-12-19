package com.ss.android.ugc.trill.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.setting.j;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class TranslationVoiceSettingPage extends com.ss.android.ugc.aweme.setting.page.a implements j.a {

    /* renamed from: e  reason: collision with root package name */
    public TextTitleBar f150561e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f150562f;

    /* renamed from: g  reason: collision with root package name */
    public j f150563g;

    /* renamed from: h  reason: collision with root package name */
    public int f150564h = -1;

    /* renamed from: i  reason: collision with root package name */
    public String f150565i = "";

    /* renamed from: j  reason: collision with root package name */
    public final List<Integer> f150566j = n.b(Integer.valueOf((int) R.string.hap), Integer.valueOf((int) R.string.haq));

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f150567k;

    static {
        Covode.recordClassIndex(99007);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f150567k == null) {
            this.f150567k = new SparseArray();
        }
        View view = (View) this.f150567k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f150567k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f150567k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.az8;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    private final List<j.c> d() {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t : this.f150566j) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            int intValue = t.intValue();
            Context context = getContext();
            if (context == null || (str = context.getString(intValue)) == null) {
                str = "";
            }
            l.b(str, "");
            if (i2 == this.f150564h) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new j.c(str, z));
            i2 = i3;
        }
        return arrayList;
    }

    public static final class a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslationVoiceSettingPage f150568a;

        static {
            Covode.recordClassIndex(99008);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(TranslationVoiceSettingPage translationVoiceSettingPage) {
            this.f150568a = translationVoiceSettingPage;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            int i2;
            l.d(view, "");
            this.f150568a.h();
            String f2 = TranslatedCaptionCacheServiceImpl.j().f();
            int hashCode = f2.hashCode();
            if (hashCode != 50) {
                if (hashCode == 51 && f2.equals("3")) {
                    i2 = 3;
                    r.a("save_transl_voice", new d().a("enter_from", "settings_page").a("enter_method", this.f150568a.f150565i).a("voice", i2).f66730a);
                }
            } else if (f2.equals("2")) {
                i2 = 2;
                r.a("save_transl_voice", new d().a("enter_from", "settings_page").a("enter_method", this.f150568a.f150565i).a("voice", i2).f66730a);
            }
            i2 = 0;
            r.a("save_transl_voice", new d().a("enter_from", "settings_page").a("enter_method", this.f150568a.f150565i).a("voice", i2).f66730a);
        }
    }

    @Override // com.ss.android.ugc.trill.setting.j.a
    public final void b(int i2) {
        if (i2 != this.f150564h) {
            this.f150564h = i2;
            j jVar = this.f150563g;
            if (jVar != null) {
                jVar.a(d());
            }
            j jVar2 = this.f150563g;
            if (jVar2 != null) {
                jVar2.notifyDataSetChanged();
            }
            if (i2 == 0) {
                i.a("2");
            } else if (i2 == 1) {
                i.a("3");
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
        this.f150561e = (TextTitleBar) findViewById;
        View findViewById2 = view.findViewById(R.id.cbj);
        l.b(findViewById2, "");
        this.f150562f = (RecyclerView) findViewById2;
        super.onViewCreated(view, bundle);
        e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.f150565i = a(intent, "enter_method");
            }
        }
        TextTitleBar textTitleBar = this.f150561e;
        if (textTitleBar == null) {
            l.a("mBtnFinish");
        }
        textTitleBar.setOnTitleBarClickListener(new a(this));
        this.f150564h = TextUtils.equals(i.c(), "3") ? 1 : 0;
        RecyclerView recyclerView = this.f150562f;
        if (recyclerView == null) {
            l.a("mTranslationVoiceView");
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        j jVar = new j(getContext(), this);
        this.f150563g = jVar;
        jVar.a(d());
        RecyclerView recyclerView2 = this.f150562f;
        if (recyclerView2 == null) {
            l.a("mTranslationVoiceView");
        }
        recyclerView2.setAdapter(this.f150563g);
    }
}
