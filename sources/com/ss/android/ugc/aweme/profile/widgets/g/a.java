package com.ss.android.ugc.aweme.profile.widgets.g;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.profile.f.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.u;
import h.v;
import h.w;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends com.bytedance.assem.arch.d.a implements x, e, i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final C2997a f117827j = new C2997a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private ae f117828k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f117829l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f117830m;
    private ProfileViewModel n;

    static {
        Covode.recordClassIndex(76323);
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z) {
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(169, new g(a.class, "onClickGuideCardEvent", com.ss.android.ugc.aweme.profile.a.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a$a  reason: collision with other inner class name */
    public static final class C2997a {
        static {
            Covode.recordClassIndex(76324);
        }

        private C2997a() {
        }

        public /* synthetic */ C2997a(byte b2) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.b
    public final /* synthetic */ d e() {
        return new d();
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        EventBus.a().b(this);
    }

    private final ae w() {
        if (this.f117828k == null) {
            ae aeVar = new ae();
            this.f117828k = aeVar;
            aeVar.f116520c = this;
        }
        ae aeVar2 = this.f117828k;
        if (aeVar2 == null) {
            l.b();
        }
        return aeVar2;
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((m) this);
        if (a2 != null) {
            this.n = ProfileViewModel.a.a(a2);
        }
        EventBus.a(EventBus.a(), this);
    }

    public final void u() {
        if (o.f()) {
            TextView textView = this.f117829l;
            if (textView != null) {
                textView.setText(R.string.bkd);
                return;
            }
            return;
        }
        TextView textView2 = this.f117829l;
        if (textView2 != null) {
            textView2.setText(R.string.bke);
        }
    }

    public final void v() {
        o.g();
        j.a.a((com.ss.android.ugc.aweme.profile.widgets.common.j) com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class)), null, 3);
        ProfileViewModel profileViewModel = this.n;
        if (profileViewModel != null) {
            profileViewModel.b(o.e());
        }
        u();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.g.e
    public final void b(String str) {
        w().d(str);
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            if (aVar != null) {
                this.this$0.u();
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<d, d> {
        final /* synthetic */ Exception $e;
        final /* synthetic */ int $type;

        static {
            Covode.recordClassIndex(76325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Exception exc, int i2) {
            super(1);
            this.$e = exc;
            this.$type = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            if (dVar != null) {
                return new d(new com.bytedance.assem.arch.extensions.a(v.a(this.$e, Integer.valueOf(this.$type))));
            }
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends u<? extends Integer, ? extends Integer, ? extends Intent>>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends u<? extends Integer, ? extends Integer, ? extends Intent>> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends u<? extends Integer, ? extends Integer, ? extends Intent>> aVar2 = aVar;
            if (aVar2 != null) {
                T t = aVar2.f25631b;
                int intValue = ((Number) t.component1()).intValue();
                ((Number) t.component2()).intValue();
                Object component3 = t.component3();
                if (intValue == 10002 && component3 != null) {
                    this.this$0.v();
                }
            }
            return z.f158842a;
        }
    }

    @r
    public final void onClickGuideCardEvent(com.ss.android.ugc.aweme.profile.a.d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.f115834a == 2) {
            String str = dVar.f115835b;
            l.d(str, "");
            w().b(str);
        } else if (dVar.f115834a == 3) {
            a(dVar.f115835b);
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        TextView textView;
        l.d(view, "");
        this.f117829l = (TextView) view.findViewById(R.id.cs4);
        this.f117830m = (TextView) view.findViewById(R.id.fdt);
        TextView textView2 = this.f117829l;
        if (textView2 != null) {
            textView2.setOnClickListener(new c(this));
        }
        if (in.d() && (textView = this.f117829l) != null) {
            textView.setVisibility(8);
        }
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.x.class), b.f117868a, new d(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), c.f117872a, new e(this));
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117846a;

        static {
            Covode.recordClassIndex(76326);
        }

        c(a aVar) {
            this.f117846a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = "click_edit_profile";
            com.ss.android.ugc.aweme.common.r.a("enter_profile_edit", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", str).f66730a);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("is_child_mode", in.d() ? 1 : 0);
            if (o.f()) {
                str = "click_set_up_profile";
            }
            com.ss.android.ugc.aweme.common.r.a("edit_profile", a2.a("enter_method", str).a("fans_1K", o.d() ? 1 : 0).f66730a);
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.f117846a);
            if (b2 != null) {
                if (in.d()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(b2).a(b2.getString(R.string.add)).a();
                    return;
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(b2, "aweme://profile_edit");
                l.b(buildRoute, "");
                buildRoute.open();
                SharePrefCache inst = SharePrefCache.inst();
                l.b(inst, "");
                aj<Boolean> isProfileBubbleShown = inst.getIsProfileBubbleShown();
                l.b(isProfileBubbleShown, "");
                isProfileBubbleShown.b(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.g.e
    public final boolean a(String str) {
        String str2;
        User curUser;
        l.d(str, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        if (g2 == null || (curUser = g2.getCurUser()) == null) {
            str2 = null;
        } else {
            str2 = curUser.getSignature();
        }
        if (!TextUtils.equals(str, str2)) {
            String replace = new h.m.l("\n+").replace(str, "\n");
            if (replace == null) {
                l.b();
            }
            int length = replace.length() - 1;
            if (length >= 0 && replace.charAt(length) == '\n') {
                replace = replace.substring(0, length);
                l.b(replace, "");
            }
            w().c(replace);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(User user, int i2) {
        String str;
        if (i2 == 0) {
            v();
        } else if (i2 == 2) {
            com.ss.android.ugc.aweme.profile.widgets.l.d dVar = (com.ss.android.ugc.aweme.profile.widgets.l.d) com.bytedance.assem.arch.service.d.e(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.l.d.class));
            if (dVar != null) {
                if (user != null) {
                    str = user.getSignature();
                } else {
                    str = null;
                }
                dVar.a(str);
            }
            v();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        if (i2 == 4) {
            b bVar = new b(exc, i2);
            Class<a> cls = a.class;
            Class<?>[] interfaces = cls.getInterfaces();
            l.a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        l.a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (com.bytedance.assem.arch.service.b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    com.bytedance.assem.arch.core.e eVar = bx_().f25534g;
                    Object g2 = n.g((List) arrayList2);
                    if (g2 != null) {
                        eVar.a((Class) g2, bVar);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
