package com.ss.android.ugc.aweme.kids.discovery.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c;
import com.ss.android.ugc.aweme.kids.experiment.abmock.a.b;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class a extends c {

    /* renamed from: j  reason: collision with root package name */
    public static final C2715a f106464j = new C2715a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private HashMap f106465k;

    static {
        Covode.recordClassIndex(68033);
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final String c() {
        return "gallery";
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void m() {
        HashMap hashMap = this.f106465k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.a$a  reason: collision with other inner class name */
    public static final class C2715a {
        static {
            Covode.recordClassIndex(68034);
        }

        private C2715a() {
        }

        public /* synthetic */ C2715a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final boolean b() {
        Object a2 = com.ss.android.ugc.aweme.kids.experiment.abmock.a.a(new b());
        Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) a2).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final View d() {
        if (getContext() != null) {
            return com.a.a(LayoutInflater.from(getContext()), R.layout.act, null, false);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void a() {
        String str;
        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("challenge_id")) == null) {
            str = "";
        }
        f.a("end_feed_category_details_page", cVar.a("category_id", str).a());
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("challenge_id")) == null) {
            str = "";
        }
        f.a("exit_category_details_page", cVar.a("category_id", str).a());
        super.onDestroyView();
        m();
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c, com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.app.f.c a2 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "discovery");
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("mob_enter_from")) == null) {
            str = str2;
        }
        com.ss.android.ugc.aweme.app.f.c a3 = a2.a("enter_method", str);
        Bundle arguments2 = getArguments();
        if (!(arguments2 == null || (string = arguments2.getString("challenge_id")) == null)) {
            str2 = string;
        }
        f.a("show_category_details_page", a3.a("category_id", str2).a());
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.c
    public final void a(View view, Aweme aweme) {
        Context context;
        List<Aweme> list;
        t<List<Aweme>> tVar;
        if (aweme != null && (context = getContext()) != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f105947c;
            if (kidsAwemeGridViewModel == null || (tVar = kidsAwemeGridViewModel.f105926a) == null || (list = tVar.getValue()) == null) {
                list = z.INSTANCE;
            }
            l.d(list, "");
            com.ss.android.ugc.aweme.kids.discovery.b.a.f106425a = new WeakReference<>(list);
            SmartRouter.buildRoute(context, "//kids/discovery/feed").withParam("current_id", aweme.getAid().toString()).withParam("enter_from", "category_details_page").withParam("preload_from_cache", true).withParam(getArguments()).open();
        }
    }
}
