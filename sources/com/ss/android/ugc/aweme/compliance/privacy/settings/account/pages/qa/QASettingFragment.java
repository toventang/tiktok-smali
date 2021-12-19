package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.compliance.api.model.f;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa.QAProfileEntranceViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class QASettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77751a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private a f77752b;

    /* renamed from: c  reason: collision with root package name */
    private b f77753c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f77754d;

    static {
        Covode.recordClassIndex(48149);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77754d == null) {
            this.f77754d = new SparseArray();
        }
        View view = (View) this.f77754d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77754d.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77754d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48150);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d
    public final List<com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b> c() {
        com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b[] bVarArr = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b[2];
        b bVar = this.f77753c;
        if (bVar == null) {
            l.a("qaProfileEntranceAdapter");
        }
        bVarArr[0] = bVar;
        a aVar = this.f77752b;
        if (aVar == null) {
            l.a("qaInviteAdapter");
        }
        bVarArr[1] = aVar;
        return n.b(bVarArr);
    }

    static final class b extends m implements h.f.a.b<c, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77755a = new b();

        static {
            Covode.recordClassIndex(48151);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            Integer num;
            f fVar;
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show qa setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "qna_invite"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (fVar = b2.f76690f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f76662e);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = new ad(this).a(QAProfileEntranceViewModel.class);
        l.b(a2, "");
        QAProfileEntranceViewModel qAProfileEntranceViewModel = (QAProfileEntranceViewModel) a2;
        e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        if (activity.getIntent().hasExtra("enable_qna_on_profile")) {
            e activity2 = getActivity();
            if (activity2 == null) {
                l.b();
            }
            l.b(activity2, "");
            qAProfileEntranceViewModel.f77673d.postValue(Integer.valueOf(activity2.getIntent().getIntExtra("enable_qna_on_profile", -1)));
        } else {
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.b.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(QAProfileEntranceViewModel.a.f77747a).a(QAProfileEntranceViewModel.b.f77748a).a(new QAProfileEntranceViewModel.c(qAProfileEntranceViewModel), QAProfileEntranceViewModel.d.f77750a);
        }
        this.f77753c = new b(qAProfileEntranceViewModel, this);
        ac a3 = new ad(this).a(QAInviteViewModel.class);
        l.b(a3, "");
        this.f77752b = new a((QAInviteViewModel) a3, this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.f5w);
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", b.f77755a);
    }
}
