package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.compliance.api.model.f;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class TagMentionPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    private c f77811a;

    /* renamed from: b  reason: collision with root package name */
    private a f77812b;

    /* renamed from: c  reason: collision with root package name */
    private b f77813c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f77814d;

    static {
        Covode.recordClassIndex(48215);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77814d == null) {
            this.f77814d = new SparseArray();
        }
        View view = (View) this.f77814d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77814d.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77814d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d
    public final List<com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b> c() {
        com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a[] aVarArr = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a[3];
        c cVar = this.f77811a;
        if (cVar == null) {
            l.a("tagAdapter");
        }
        aVarArr[0] = cVar;
        a aVar = this.f77812b;
        if (aVar == null) {
            l.a("mentionAdapter");
        }
        aVarArr[1] = aVar;
        b bVar = this.f77813c;
        if (bVar == null) {
            l.a("mentionNoticeAdapter");
        }
        aVarArr[2] = bVar;
        return n.b(aVarArr);
    }

    static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77815a = new a();

        static {
            Covode.recordClassIndex(48216);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            Integer num;
            f fVar;
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show mention setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "mention"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (fVar = b2.f76690f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f76658a);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
        }
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77816a = new b();

        static {
            Covode.recordClassIndex(48217);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            Integer num;
            f fVar;
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show mention notice setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "mention_notice"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (fVar = b2.f76690f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f76659b);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77817a = new c();

        static {
            Covode.recordClassIndex(48218);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            Integer num;
            f fVar;
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show tag setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "tag"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (fVar = b2.f76690f) == null) {
                num = null;
            } else {
                num = Integer.valueOf(fVar.f76660c);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = new ad(this).a(TagViewModel.class);
        l.b(a2, "");
        this.f77811a = new c((TagViewModel) a2, this);
        ac a3 = new ad(this).a(MentionViewModel.class);
        l.b(a3, "");
        this.f77812b = new a((MentionViewModel) a3, this);
        ac a4 = new ad(this).a(MentionNoticeViewModel.class);
        l.b(a4, "");
        this.f77813c = new b((MentionNoticeViewModel) a4, this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        c cVar = this.f77811a;
        if (cVar == null) {
            l.a("tagAdapter");
        }
        if (!com.ss.android.ugc.aweme.compliance.privacy.settings.a.b(cVar.b()).f77440b || !g.b()) {
            i2 = R.string.d3c;
        } else {
            i2 = R.string.d3d;
        }
        b(i2);
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", a.f77815a);
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", b.f77816a);
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", c.f77817a);
    }
}
