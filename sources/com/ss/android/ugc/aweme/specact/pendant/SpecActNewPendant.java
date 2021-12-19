package com.ss.android.ugc.aweme.specact.pendant;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView;
import com.ss.android.ugc.aweme.pendant.b;
import com.ss.android.ugc.aweme.pendant.j;
import com.ss.android.ugc.aweme.specact.pendant.a.a;
import com.ss.android.ugc.aweme.specact.pendant.e.e;
import com.ss.android.ugc.aweme.specact.pendant.e.f;
import com.ss.android.ugc.aweme.specact.pendant.e.g;
import com.ss.android.ugc.aweme.specact.pendant.f.a;
import com.ss.android.ugc.aweme.specact.pendant.f.b;
import com.ss.android.ugc.aweme.specact.pendant.h.i;
import com.ss.android.ugc.aweme.specact.pendant.views.b;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import com.ss.android.ugc.aweme.specact.popup.c.a;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class SpecActNewPendant extends BasePendant implements View.OnClickListener, au, e {

    /* renamed from: j  reason: collision with root package name */
    public static final h f134077j = i.a(m.SYNCHRONIZED, b.f134081a);

    /* renamed from: k  reason: collision with root package name */
    public static final a f134078k = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f134079h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f134080i;

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87703);
        }

        public static SpecActNewPendant a() {
            return (SpecActNewPendant) SpecActNewPendant.f134077j.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements f {
        static {
            Covode.recordClassIndex(87705);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.e.f
        public final void a() {
            com.ss.android.ugc.aweme.specact.pendant.f.a a2 = a.C3487a.a();
            UgActivityTasks h2 = a2.h();
            if (h2 != null) {
                if (a2.f134222d > 0) {
                    h2 = h2.clone(Integer.valueOf(a2.f134222d));
                }
                l.b(h2, "");
                a2.a(h2);
            }
        }
    }

    private SpecActNewPendant() {
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final boolean c() {
        return this.f134079h;
    }

    static final class b extends h.f.b.m implements h.f.a.a<SpecActNewPendant> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134081a = new b();

        static {
            Covode.recordClassIndex(87704);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SpecActNewPendant invoke() {
            return new SpecActNewPendant((byte) 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void q() {
        a().f();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void r() {
        a().b();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final com.ss.android.ugc.aweme.specact.pendant.e.a k() {
        com.ss.android.ugc.aweme.specact.pendant.i.a aVar = new com.ss.android.ugc.aweme.specact.pendant.i.a();
        l.d(this, "");
        aVar.f134318b = this;
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final com.ss.android.ugc.aweme.specact.pendant.e.d l() {
        return (com.ss.android.ugc.aweme.specact.pendant.d.a) com.ss.android.ugc.aweme.specact.pendant.d.a.f134205a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final boolean n() {
        return a().j();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final boolean o() {
        return a().a();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final boolean p() {
        return a().d();
    }

    static {
        Covode.recordClassIndex(87702);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final boolean h() {
        boolean f2 = a.C3487a.a().f();
        boolean f3 = b.a.a().f();
        if (f2 || f3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final void e() {
        super.e();
        if (this.f134079h) {
            com.ss.android.ugc.aweme.specact.pendant.f.a a2 = a.C3487a.a();
            a2.f134221c = false;
            a2.f134220b = false;
            a2.e().a(false);
        }
        if (this.f134080i) {
            com.ss.android.ugc.aweme.specact.pendant.f.b a3 = b.a.a();
            a3.f134240c = false;
            a3.f134242e = false;
            a3.e().a(false);
        }
        a().a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134068a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(this.f134068a));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final void i() {
        LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
        l.b(localTestApi, "");
        localTestApi.getSpecActDebugService().a("SpecPendant", "--  activatePendant ");
        com.ss.android.ugc.aweme.specact.pendant.h.i a2 = i.b.a();
        Activity g2 = g();
        if (g2 == null) {
            l.b();
        }
        a2.a(g2, new d(this));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void s() {
        com.ss.android.ugc.aweme.specact.pendant.e.a a2 = a();
        if (a2 != null && a2.a() && a2.d()) {
            Iterator<com.ss.android.ugc.aweme.specact.pendant.c.c> it = com.ss.android.ugc.aweme.specact.pendant.c.b.f134128a.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.specact.pendant.c.c next = it.next();
                if (next instanceof com.ss.android.ugc.aweme.specact.pendant.c.d.c) {
                    next.a(a2, 0);
                }
            }
        }
    }

    public static final class d implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpecActNewPendant f134082a;

        static {
            Covode.recordClassIndex(87706);
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void a() {
            String str;
            if (this.f134082a.f134079h && !this.f134082a.f134080i) {
                com.ss.android.ugc.aweme.specact.pendant.f.a a2 = a.C3487a.a();
                e eVar = a2.f134227i;
                if (eVar != null) {
                    eVar.a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(a2.f134219a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(a2.f134219a));
                }
                e eVar2 = a2.f134227i;
                if (eVar2 != null) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = a2.f134219a;
                    if (ugAwemeActivitySetting == null) {
                        l.b();
                    }
                    boolean v = com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting);
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = a2.f134219a;
                    if (ugAwemeActivitySetting2 == null) {
                        l.b();
                    }
                    eVar2.a(v, com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting2));
                }
                e eVar3 = a2.f134227i;
                if (eVar3 != null && eVar3.n()) {
                    b.C2935b.f114627a.a(com.bytedance.ies.ugc.appcontext.d.a());
                    boolean a3 = l.a((Object) a2.f134226h, (Object) true);
                    if (a2.f()) {
                        str = "ongoing";
                    } else {
                        str = "finished";
                    }
                    com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", a3 ? 1 : 0, str, a2.f134219a);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void b() {
            a.C3498a.a().a(this.f134082a.g(), com.ss.android.ugc.aweme.specact.pendant.h.c.a());
            if (!this.f134082a.f134079h && !this.f134082a.f134080i) {
                this.f134082a.a().a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134082a.f134068a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(this.f134082a.f134068a));
                com.ss.android.ugc.aweme.specact.pendant.e.a a2 = this.f134082a.a();
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f134082a.f134068a;
                if (ugAwemeActivitySetting == null) {
                    l.b();
                }
                boolean v = com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting);
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134082a.f134068a;
                if (ugAwemeActivitySetting2 == null) {
                    l.b();
                }
                a2.b(v, com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting2));
                if (this.f134082a.a().j()) {
                    b.C2935b.f114627a.a(com.bytedance.ies.ugc.appcontext.d.a());
                    com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", 0, "finished", this.f134082a.f134068a);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(SpecActNewPendant specActNewPendant) {
            this.f134082a = specActNewPendant;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void a(List<k.i> list) {
            UgActivityTasks i2;
            a.C3477a.a().a(list);
            if (this.f134082a.f134080i) {
                if (!this.f134082a.f134079h) {
                    this.f134082a.a().a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134082a.f134068a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(this.f134082a.f134068a));
                    com.ss.android.ugc.aweme.specact.pendant.e.a a2 = this.f134082a.a();
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f134082a.f134068a;
                    if (ugAwemeActivitySetting == null) {
                        l.b();
                    }
                    boolean v = com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting);
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134082a.f134068a;
                    if (ugAwemeActivitySetting2 == null) {
                        l.b();
                    }
                    a2.b(v, com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting2));
                    if (this.f134082a.a().j()) {
                        b.C2935b.f114627a.a(com.bytedance.ies.ugc.appcontext.d.a());
                        com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", 0, "finished", this.f134082a.f134068a);
                    }
                }
                com.ss.android.ugc.aweme.specact.pendant.f.b a3 = b.a.a();
                if (!a3.f134241d.isEmpty()) {
                    a3.f134240c = true;
                    a3.e().a(true);
                    if (list != null && !list.isEmpty()) {
                        Iterator<? extends UgActivityTasks> it = a3.f134241d.iterator();
                        loop0:
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            UgActivityTasks ugActivityTasks = (UgActivityTasks) it.next();
                            if (l.a((Object) ugActivityTasks.getTaskId(), (Object) "read_and_like_video")) {
                                for (k.i iVar : list) {
                                    if (l.a((Object) iVar.f134487c, (Object) "read_and_like_video")) {
                                        ugActivityTasks.setTime(Integer.valueOf(iVar.b()));
                                        break loop0;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    if (!(a3.c() || (i2 = a3.i()) == null)) {
                        a3.a(i2);
                    }
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void a(int i2, String str, Boolean bool, Integer num) {
            boolean z;
            if (this.f134082a.f134079h) {
                com.ss.android.ugc.aweme.specact.pendant.f.a a2 = a.C3487a.a();
                a2.e().b(a2.f134220b);
                a2.f134221c = true;
                a2.f134222d = i2;
                a2.f134224f = num;
                a2.f134226h = bool;
                if (!l.a((Object) bool, (Object) true) || !(num == null || a2.d().getInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_click_time"), 0) == 0 || com.ss.android.ugc.aweme.specact.pendant.h.k.a() - a2.d().getInt(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_click_time"), 0) < num.intValue() * 24 * 3600)) {
                    z = false;
                } else {
                    z = true;
                }
                a2.f134223e = Boolean.valueOf(z);
                if (str != null) {
                    a2.f134225g = str;
                }
                a2.e().a(true);
                String str2 = "ongoing";
                if (a2.f134220b) {
                    e eVar = a2.f134227i;
                    if (eVar != null) {
                        eVar.d(a2.f134225g);
                    }
                    boolean a3 = l.a((Object) a2.f134226h, (Object) true);
                    if (!a2.f()) {
                        str2 = "finished";
                    }
                    com.ss.android.ugc.aweme.specact.pendant.h.h.a("tracker", a3 ? 1 : 0, str2, a2.f134219a);
                } else if (l.a((Object) a2.f134223e, (Object) false)) {
                    e eVar2 = a2.f134227i;
                    if (eVar2 != null) {
                        eVar2.a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(a2.f134219a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(a2.f134219a));
                    }
                    e eVar3 = a2.f134227i;
                    if (eVar3 != null) {
                        UgAwemeActivitySetting ugAwemeActivitySetting = a2.f134219a;
                        if (ugAwemeActivitySetting == null) {
                            l.b();
                        }
                        boolean v = com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting);
                        UgAwemeActivitySetting ugAwemeActivitySetting2 = a2.f134219a;
                        if (ugAwemeActivitySetting2 == null) {
                            l.b();
                        }
                        eVar3.a(v, com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting2));
                    }
                    e eVar4 = a2.f134227i;
                    if (eVar4 != null && eVar4.n()) {
                        b.C2935b.f114627a.a(com.bytedance.ies.ugc.appcontext.d.a());
                        boolean a4 = l.a((Object) a2.f134226h, (Object) true);
                        if (!a2.f()) {
                            str2 = "finished";
                        }
                        com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", a4 ? 1 : 0, str2, a2.f134219a);
                    }
                } else if (!a2.c()) {
                    a2.a(true, false);
                } else {
                    e eVar5 = a2.f134227i;
                    if (eVar5 != null) {
                        eVar5.a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(a2.f134219a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(a2.f134219a));
                    }
                    e eVar6 = a2.f134227i;
                    if (eVar6 != null) {
                        UgAwemeActivitySetting ugAwemeActivitySetting3 = a2.f134219a;
                        if (ugAwemeActivitySetting3 == null) {
                            l.b();
                        }
                        boolean v2 = com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting3);
                        UgAwemeActivitySetting ugAwemeActivitySetting4 = a2.f134219a;
                        if (ugAwemeActivitySetting4 == null) {
                            l.b();
                        }
                        eVar6.a(v2, com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting4));
                    }
                    e eVar7 = a2.f134227i;
                    if (eVar7 != null && eVar7.n()) {
                        b.C2935b.f114627a.a(com.bytedance.ies.ugc.appcontext.d.a());
                        boolean a5 = l.a((Object) a2.f134226h, (Object) true);
                        if (!a2.f()) {
                            str2 = "finished";
                        }
                        com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", a5 ? 1 : 0, str2, a2.f134219a);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void m() {
        com.ss.android.ugc.aweme.specact.pendant.e.a a2 = a();
        if (a2 == null || !a2.a() || !a2.j()) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("BubbleManager.tryShowBubble, notShow, b: widget not bound or not showing");
            return;
        }
        com.ss.android.ugc.aweme.specact.pendant.c.b.f134129b++;
        if (com.ss.android.ugc.aweme.specact.popup.d.b.f134625i) {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("BubbleManager.tryShowBubble, notShow, b: inAppPushIsShow");
        } else if (!com.ss.android.ugc.aweme.specact.pendant.c.b.f134130c || !com.ss.android.ugc.aweme.specact.pendant.c.b.f134131d) {
            Iterator<com.ss.android.ugc.aweme.specact.pendant.c.c> it = com.ss.android.ugc.aweme.specact.pendant.c.b.f134128a.iterator();
            while (it.hasNext()) {
                com.ss.android.ugc.aweme.specact.pendant.c.c next = it.next();
                if (next.a() == a2.d() && !(next instanceof com.ss.android.ugc.aweme.specact.pendant.c.d.c)) {
                    if (next.a()) {
                        if (!com.ss.android.ugc.aweme.specact.pendant.c.b.f134131d && next.a(a2, com.ss.android.ugc.aweme.specact.pendant.c.b.f134129b)) {
                            com.ss.android.ugc.aweme.specact.pendant.c.b.f134131d = true;
                            return;
                        }
                    } else if (!com.ss.android.ugc.aweme.specact.pendant.c.b.f134130c && next.a(a2, com.ss.android.ugc.aweme.specact.pendant.c.b.f134129b)) {
                        com.ss.android.ugc.aweme.specact.pendant.c.b.f134130c = true;
                        return;
                    }
                }
            }
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("BubbleManager.tryShowBubble, notShow ~~");
        } else {
            com.ss.android.ugc.aweme.specact.pendant.c.b.a("BubbleManager.tryShowBubble, notShow, b: staticBubble and dynamic all show");
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final void j() {
        e eVar;
        if (a.C3487a.a().f()) {
            com.ss.android.ugc.aweme.specact.pendant.f.a a2 = a.C3487a.a();
            if (a2.f()) {
                if (a2.f134220b && (eVar = a2.f134227i) != null) {
                    eVar.d(a2.f134225g);
                }
                com.ss.android.ugc.aweme.specact.pendant.h.h.a("tracker", l.a(a2.f134226h, true) ? 1 : 0, "ongoing", a2.f134219a);
            }
        } else if (b.a.a().f()) {
            com.ss.android.ugc.aweme.specact.pendant.f.b a3 = b.a.a();
            e eVar2 = a3.f134243f;
            if (eVar2 != null) {
                eVar2.a(false, com.ss.android.ugc.aweme.specact.pendant.h.a.p(a3.f134238a), com.ss.android.ugc.aweme.specact.pendant.h.a.q(a3.f134238a));
            }
            e eVar3 = a3.f134243f;
            if (eVar3 != null) {
                UgAwemeActivitySetting ugAwemeActivitySetting = a3.f134238a;
                if (ugAwemeActivitySetting == null) {
                    l.b();
                }
                boolean v = com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting);
                UgAwemeActivitySetting ugAwemeActivitySetting2 = a3.f134238a;
                if (ugAwemeActivitySetting2 == null) {
                    l.b();
                }
                eVar3.a(v, com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting2));
            }
            e eVar4 = a3.f134243f;
            if (eVar4 != null && eVar4.n()) {
                b.C2935b.f114627a.a(com.bytedance.ies.ugc.appcontext.d.a());
                com.ss.android.ugc.aweme.specact.pendant.h.h.a("non_tracker", 0, "finished", a3.f134238a);
            }
        }
    }

    public /* synthetic */ SpecActNewPendant(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void e(String str) {
        a().a(str);
    }

    private final boolean f(String str) {
        if (l.a((Object) "ForYou", (Object) str) || a().d()) {
            return true;
        }
        if (l.a((Object) "Follow", (Object) str)) {
            return com.ss.android.ugc.aweme.specact.pendant.h.a.k(this.f134068a);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void c(String str) {
        l.d(str, "");
        a(str);
        if (a().a() && !a().d()) {
            if (!f(str)) {
                a().i();
            } else if (b(this.f134072e)) {
                a().h();
            }
        }
    }

    private final boolean b(Aweme aweme) {
        if (com.ss.android.ugc.aweme.specact.pendant.h.c.a(aweme)) {
            return false;
        }
        if ((aweme != null && aweme.getAwemeType() == 101) || com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            return false;
        }
        if (a().d()) {
            return true;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
        if (ugAwemeActivitySetting == null) {
            l.b();
        }
        if (com.ss.android.ugc.aweme.specact.pendant.h.a.v(ugAwemeActivitySetting)) {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134068a;
            if (ugAwemeActivitySetting2 == null) {
                l.b();
            }
            if (com.ss.android.ugc.aweme.specact.pendant.h.a.u(ugAwemeActivitySetting2)) {
                com.ss.android.ugc.aweme.specact.pendant.e.a a2 = a();
                UgAwemeActivitySetting ugAwemeActivitySetting3 = this.f134068a;
                if (ugAwemeActivitySetting3 == null) {
                    l.b();
                }
                if (!a2.a(com.ss.android.ugc.aweme.specact.pendant.h.a.t(ugAwemeActivitySetting3))) {
                    if (!a().g()) {
                        return true;
                    }
                    return c(aweme);
                }
            }
        }
        return false;
    }

    private final boolean c(Aweme aweme) {
        if (!(aweme == null || aweme.getTextExtra() == null || aweme.getTextExtra().isEmpty())) {
            List<String> j2 = com.ss.android.ugc.aweme.specact.pendant.h.a.j(this.f134068a);
            if (!j2.isEmpty()) {
                for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    l.b(textExtraStruct, "");
                    if (j2.contains(textExtraStruct.getCid())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void a(Aweme aweme) {
        String str;
        if (!a().a()) {
            return;
        }
        if (com.ss.android.ugc.aweme.specact.pendant.h.d.a() || com.ss.android.ugc.aweme.specact.pendant.h.d.b()) {
            this.f134072e = aweme;
            boolean c2 = c(aweme);
            if (c2 && f(this.f134073f)) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (this.f134072e == null) {
                    str = "";
                } else {
                    Aweme aweme2 = this.f134072e;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                }
                r.a("widget_time_tracker_show_tiktok_bonus", dVar.a("group_id", str).f66730a);
            }
            if (f(this.f134073f)) {
                a().a(b(aweme), c2);
                if (a().a() && !a().d()) {
                    com.ss.android.ugc.aweme.specact.pendant.e.a a2 = a();
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
                    if (ugAwemeActivitySetting == null) {
                        l.b();
                    }
                    String q = com.ss.android.ugc.aweme.specact.pendant.h.a.q(ugAwemeActivitySetting);
                    UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134068a;
                    if (ugAwemeActivitySetting2 == null) {
                        l.b();
                    }
                    a2.a(q, com.ss.android.ugc.aweme.specact.pendant.h.a.s(ugAwemeActivitySetting2), com.ss.android.ugc.aweme.specact.pendant.h.a.l(this.f134068a));
                    return;
                }
                return;
            }
            a().i();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void b(String str) {
        UgActivityTasks a2;
        l.d(str, "");
        if (this.f134080i) {
            com.ss.android.ugc.aweme.specact.pendant.f.b a3 = b.a.a();
            l.d(str, "");
            if (a3.f134242e && (a2 = com.ss.android.ugc.aweme.specact.pendant.f.b.a(a3.f134241d)) != null) {
                a3.d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), true);
                e.a.f91018a.a(com.ss.android.ugc.aweme.specact.pendant.h.m.a("do_like_or_comment_action"), (Object) "true");
                long e2 = a3.e().e();
                Integer time = a2.getTime();
                l.b(time, "");
                if (e2 < ((long) time.intValue())) {
                    r.a("interact_task_complete", new com.ss.android.ugc.aweme.app.f.d().a("task_name", str).f66730a);
                } else if (!a3.d().getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("has_report_read_and_like_task"), false)) {
                    g.a.a(a3, a2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.BasePendant
    public final void d(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        if (!com.ss.android.ugc.aweme.specact.pendant.h.a.e(ugAwemeActivitySetting).isEmpty()) {
            this.f134080i = true;
            com.ss.android.ugc.aweme.specact.pendant.f.b a2 = b.a.a();
            l.d(ugAwemeActivitySetting, "");
            a2.f134238a = ugAwemeActivitySetting;
            UgAwemeActivitySetting ugAwemeActivitySetting2 = a2.f134238a;
            if (ugAwemeActivitySetting2 == null) {
                l.b();
            }
            a2.f134241d = com.ss.android.ugc.aweme.specact.pendant.h.a.e(ugAwemeActivitySetting2);
            a2.f134239b = a2.g() + 1;
            a2.f134242e = a2.d().getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("pendant_has_active"), false);
            if (!a2.e().d()) {
                a2.f134242e = false;
                a2.d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("pendant_has_active"), a2.f134242e);
            }
            a2.e().b(a2.f134242e);
            b.a.a().f134243f = this;
        }
        if (com.ss.android.ugc.aweme.specact.pendant.h.a.f(ugAwemeActivitySetting) != null) {
            this.f134079h = true;
            com.ss.android.ugc.aweme.specact.pendant.f.a a3 = a.C3487a.a();
            l.d(ugAwemeActivitySetting, "");
            a3.f134219a = ugAwemeActivitySetting;
            a3.f134220b = a3.d().getBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_has_active_manual"), false);
            if (!a3.e().d()) {
                a3.f134220b = false;
                a3.d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("new_pendant_has_active_manual"), a3.f134220b);
                a3.d().storeBoolean(com.ss.android.ugc.aweme.specact.pendant.h.m.a("task_finish"), false);
            }
            a3.e().b(a3.f134220b);
            a.C3487a.a().f134227i = this;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void d(String str) {
        InputStream inputStream;
        l.d(str, "");
        c cVar = new c();
        l.d(str, "");
        try {
            com.ss.android.ugc.aweme.specact.pendant.e.a a2 = a();
            if (a2 != null) {
                com.ss.android.ugc.aweme.specact.pendant.i.a aVar = (com.ss.android.ugc.aweme.specact.pendant.i.a) a2;
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
                if (ugAwemeActivitySetting == null) {
                    l.b();
                }
                if (com.ss.android.ugc.aweme.specact.pendant.h.a.b(ugAwemeActivitySetting) == 1) {
                    com.ss.android.ugc.aweme.specact.pendant.views.b bVar = aVar.f134317a;
                    if (bVar != null) {
                        bVar.setProgressBackgroundColor(com.ss.android.ugc.aweme.specact.pendant.h.a.o(ugAwemeActivitySetting));
                    }
                    com.ss.android.ugc.aweme.specact.pendant.views.b bVar2 = aVar.f134317a;
                    if (bVar2 != null) {
                        bVar2.setProgressForegroundColor(com.ss.android.ugc.aweme.specact.pendant.h.a.n(ugAwemeActivitySetting));
                    }
                }
                com.ss.android.ugc.aweme.specact.pendant.e.d b2 = b();
                if (b2 != null) {
                    j a3 = ((com.ss.android.ugc.aweme.specact.pendant.d.a) b2).a();
                    l.d(str, "");
                    if (a3.f114692b) {
                        com.ss.android.ugc.aweme.pendant.f fVar = a3.f114691a;
                        if (fVar != null) {
                            inputStream = fVar.a(str);
                        } else {
                            inputStream = null;
                        }
                        String a4 = a3.a();
                        if (inputStream != null && a4 != null) {
                            com.ss.android.ugc.aweme.specact.pendant.e.a a5 = a();
                            if (a5 != null) {
                                l.d(inputStream, "");
                                l.d(a4, "");
                                com.ss.android.ugc.aweme.specact.pendant.views.b bVar3 = ((com.ss.android.ugc.aweme.specact.pendant.i.a) a5).f134317a;
                                if (bVar3 != null) {
                                    l.d(inputStream, "");
                                    l.d(a4, "");
                                    try {
                                        OptimizedLottieAnimationView lottieView = bVar3.getLottieView();
                                        com.airbnb.lottie.f.a(inputStream, "bigLottie").a((com.airbnb.lottie.i<com.airbnb.lottie.e>) new b.d(lottieView, inputStream, cVar)).c(new b.e(lottieView));
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.widget.SpecActWidget");
                            }
                        }
                    } else {
                        throw new Throwable("HAS NOT inited");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.helper.PendantResourceLoader");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.widget.SpecActWidget");
            }
        } catch (Throwable unused) {
            com.ss.android.ugc.aweme.specact.pendant.e.d b3 = b();
            Objects.requireNonNull(b3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.specact.pendant.helper.PendantResourceLoader");
            ((com.ss.android.ugc.aweme.specact.pendant.d.a) b3).a().b();
            LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
            l.b(localTestApi, "");
            localTestApi.getSpecActDebugService().a("SpecPendant", "setWidgetResource error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r0.length() == 0) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.pendant.SpecActNewPendant.onClick(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void a(int i2, int i3) {
        a().a(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void a(boolean z, boolean z2) {
        a().b(z, z2);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.e
    public final void a(boolean z, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a().a(z, str, str2);
    }
}
