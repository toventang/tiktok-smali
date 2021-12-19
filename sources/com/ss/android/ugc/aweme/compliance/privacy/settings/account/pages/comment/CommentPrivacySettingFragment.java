package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.compliance.api.model.g;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class CommentPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    private CommentViewModel f77692a;

    /* renamed from: b  reason: collision with root package name */
    private a f77693b;

    /* renamed from: c  reason: collision with root package name */
    private b f77694c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f77695d;

    static {
        Covode.recordClassIndex(48088);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77695d == null) {
            this.f77695d = new SparseArray();
        }
        View view = (View) this.f77695d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77695d.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77695d;
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
    public final List<b> c() {
        b[] bVarArr = new b[2];
        a aVar = this.f77693b;
        if (aVar == null) {
            l.a("commentAdapter");
        }
        bVarArr[0] = aVar;
        b bVar = this.f77694c;
        if (bVar == null) {
            l.a("commentFilterAdapter");
        }
        bVarArr[1] = bVar;
        return n.b(bVarArr);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = new ad(this).a(CommentViewModel.class);
        l.b(a2, "");
        this.f77692a = (CommentViewModel) a2;
        CommentViewModel commentViewModel = this.f77692a;
        if (commentViewModel == null) {
            l.a("commentViewModel");
        }
        this.f77693b = new a(commentViewModel, this);
        Context context = getContext();
        if (context == null) {
            l.b();
        }
        l.b(context, "");
        this.f77694c = new b(context);
    }

    static final class a extends m implements h.f.a.b<c, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77696a = new a();

        static {
            Covode.recordClassIndex(48089);
        }

        a() {
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
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show comments setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, UGCMonitor.EVENT_COMMENT));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (gVar = b2.f76685a) == null) {
                num = null;
            } else {
                num = Integer.valueOf(gVar.f76666d);
            }
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_comment_filter", com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "filter_spam"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.nd);
        a aVar = this.f77693b;
        if (aVar == null) {
            l.a("commentAdapter");
        }
        a(aVar.d());
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", a.f77696a);
    }
}
