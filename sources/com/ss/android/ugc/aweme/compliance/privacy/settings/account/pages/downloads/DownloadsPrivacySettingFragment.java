package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.downloads;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.g;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class DownloadsPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77702a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private DownloadsViewModel f77703b;

    /* renamed from: c  reason: collision with root package name */
    private a f77704c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f77705d;

    static {
        Covode.recordClassIndex(48099);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77705d == null) {
            this.f77705d = new SparseArray();
        }
        View view = (View) this.f77705d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77705d.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77705d;
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
            Covode.recordClassIndex(48100);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d
    public final List<com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b> c() {
        a aVar = this.f77704c;
        if (aVar == null) {
            l.a("downloadsAdapter");
        }
        return n.a(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i2;
        g gVar;
        super.onDestroy();
        q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
        int i3 = 0;
        if (b2 == null || (gVar = b2.f76685a) == null) {
            i2 = 0;
        } else {
            i2 = gVar.f76663a;
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("user_id", com.ss.android.ugc.aweme.compliance.privacy.a.a.a()).a("enter_from", "account_download_setting");
        if (i2 == 3) {
            i3 = 1;
        }
        r.a("tns_video_download_use_leave", a2.a("enter_status", i3).f66730a);
    }

    static final class b extends m implements h.f.a.b<c, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77706a = new b();

        static {
            Covode.recordClassIndex(48101);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            Integer num;
            g gVar;
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show download setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "download"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_id", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (gVar = b2.f76685a) == null) {
                num = null;
            } else {
                num = Integer.valueOf(gVar.f76663a);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        int i2;
        g gVar;
        super.onCreate(bundle);
        ac a2 = new ad(this).a(DownloadsViewModel.class);
        l.b(a2, "");
        this.f77703b = (DownloadsViewModel) a2;
        DownloadsViewModel downloadsViewModel = this.f77703b;
        if (downloadsViewModel == null) {
            l.a("downloadsViewModel");
        }
        this.f77704c = new a(downloadsViewModel, this);
        e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        l.b(activity, "");
        String a3 = a(activity.getIntent(), "enter_from");
        if (a3 == null) {
            a3 = "privacy_and_safety_setting";
        }
        l.b(a3, "");
        q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
        int i3 = 0;
        if (b2 == null || (gVar = b2.f76685a) == null) {
            i2 = 0;
        } else {
            i2 = gVar.f76663a;
        }
        l.d(a3, "");
        com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("user_id", com.ss.android.ugc.aweme.compliance.privacy.a.a.a()).a("enter_from", a3);
        if (i2 == 3) {
            i3 = 1;
        }
        r.a("tns_video_download_use_show", a4.a("enter_status", i3).f66730a);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.nf);
        a aVar = this.f77704c;
        if (aVar == null) {
            l.a("downloadsAdapter");
        }
        a(aVar.d());
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", b.f77706a);
    }
}
