package com.ss.android.ugc.aweme.specact.popup.c;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.specact.popup.b.g;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.util.List;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final h f134584i = i.a(m.SYNCHRONIZED, b.f134595a);

    /* renamed from: j  reason: collision with root package name */
    public static final C3498a f134585j = new C3498a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.specact.popup.a.i> f134586a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.popup.a.i f134587b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.popup.a.i f134588c;

    /* renamed from: d  reason: collision with root package name */
    public String f134589d = "";

    /* renamed from: e  reason: collision with root package name */
    public Long f134590e = 0L;

    /* renamed from: f  reason: collision with root package name */
    public boolean f134591f;

    /* renamed from: g  reason: collision with root package name */
    public int f134592g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f134593h;

    /* renamed from: k  reason: collision with root package name */
    private final h f134594k = i.a((h.f.a.a) c.f134596a);

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.c.a$a  reason: collision with other inner class name */
    public static final class C3498a {
        static {
            Covode.recordClassIndex(87946);
        }

        public static a a() {
            return (a) a.f134584i.getValue();
        }

        private C3498a() {
        }

        public /* synthetic */ C3498a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134595a = new b();

        static {
            Covode.recordClassIndex(87947);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134596a = new c();

        static {
            Covode.recordClassIndex(87948);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("spec_act_popup");
        }
    }

    static {
        Covode.recordClassIndex(87945);
    }

    private final void b() {
        String str;
        String str2;
        d dVar = new d();
        com.ss.android.ugc.aweme.specact.popup.a.i iVar = this.f134588c;
        if (iVar != null) {
            str = iVar.f134433c;
        } else {
            str = null;
        }
        d a2 = dVar.a("pop_name", str).a("result", "wrong_info");
        if (com.ss.android.ugc.aweme.specact.pendant.h.d.a()) {
            str2 = "feed";
        } else {
            str2 = "others";
        }
        r.a("pop_filtered_reason", a2.a("position", str2).f66730a);
    }

    public final void a() {
        List<com.ss.android.ugc.aweme.specact.popup.a.i> list = this.f134586a;
        if (!(list == null || list.isEmpty())) {
            List<com.ss.android.ugc.aweme.specact.popup.a.i> list2 = this.f134586a;
            if (list2 == null) {
                l.b();
            }
            for (com.ss.android.ugc.aweme.specact.popup.a.i iVar : list2) {
                if (l.a((Object) (String.valueOf(iVar.f134431a) + "-" + iVar.f134432b), (Object) "3-0")) {
                    this.f134587b = iVar;
                    return;
                }
            }
        }
    }

    private static void c(Activity activity, com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        com.ss.android.ugc.aweme.specact.popup.b.d.b(activity, iVar);
    }

    private static void b(Activity activity, com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        new com.ss.android.ugc.aweme.specact.popup.b.h(activity, iVar).show();
    }

    private static void d(Activity activity, com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        new com.ss.android.ugc.aweme.specact.popup.b.i(activity, iVar).show();
    }

    private static void e(Activity activity, com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        new g(activity, iVar).show();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Activity activity, com.ss.android.ugc.aweme.specact.popup.a.i iVar) {
        l.d(activity, "");
        l.d(iVar, "");
        String str = String.valueOf(iVar.f134431a) + "-" + iVar.f134432b;
        this.f134589d = str;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case 48532:
                if (str.equals("1-0")) {
                    b(activity, iVar);
                    break;
                }
                b();
                break;
            case 49493:
                if (str.equals("2-0")) {
                    e(activity, iVar);
                    break;
                }
                b();
                break;
            case 51415:
                if (str.equals("4-0")) {
                    d(activity, iVar);
                    break;
                }
                b();
                break;
            case 53337:
                if (str.equals("6-0")) {
                    c(activity, iVar);
                    break;
                }
                b();
                break;
            default:
                switch (hashCode) {
                    case 52377:
                        if (str.equals("5-1")) {
                            com.ss.android.ugc.aweme.specact.popup.b.d.c(activity, iVar);
                            break;
                        }
                        b();
                        break;
                    case 52378:
                        if (str.equals("5-2")) {
                            com.ss.android.ugc.aweme.specact.popup.b.d.e(activity, iVar);
                            break;
                        }
                        b();
                        break;
                    case 52379:
                        if (str.equals("5-3")) {
                            com.ss.android.ugc.aweme.specact.popup.b.d.d(activity, iVar);
                            break;
                        }
                        b();
                        break;
                    case 52380:
                        if (str.equals("5-4")) {
                            com.ss.android.ugc.aweme.specact.popup.b.d.a(activity, iVar);
                            break;
                        }
                        b();
                        break;
                    case 52381:
                        if (str.equals("5-5")) {
                            com.ss.android.ugc.aweme.specact.popup.b.d.f(activity, iVar);
                            break;
                        }
                        b();
                        break;
                    default:
                        b();
                        break;
                }
        }
        this.f134591f = true;
    }

    public final void a(Activity activity, Aweme aweme) {
        if (this.f134588c == null) {
            LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
            l.b(localTestApi, "");
            localTestApi.getSpecActDebugService().a("SpecPopup", "highestPopup is null, return");
            return;
        }
        String str = "feed";
        String str2 = null;
        if (com.ss.android.ugc.aweme.specact.pendant.h.c.a(aweme)) {
            LocalTestApi localTestApi2 = a.C2792a.f108997a.f108996a;
            l.b(localTestApi2, "");
            localTestApi2.getSpecActDebugService().a("SpecPopup", "aweme is AD, return");
            d dVar = new d();
            com.ss.android.ugc.aweme.specact.popup.a.i iVar = this.f134588c;
            if (iVar != null) {
                str2 = iVar.f134433c;
            }
            d a2 = dVar.a("pop_name", str2).a("result", "popup_occupied");
            if (!com.ss.android.ugc.aweme.specact.pendant.h.d.a()) {
                str = "others";
            }
            r.a("pop_filtered_reason", a2.a("position", str).f66730a);
        } else if (com.ss.android.ugc.aweme.specact.pendant.h.c.b(aweme)) {
            LocalTestApi localTestApi3 = a.C2792a.f108997a.f108996a;
            l.b(localTestApi3, "");
            localTestApi3.getSpecActDebugService().a("SpecPopup", "aweme is live, return");
            d dVar2 = new d();
            com.ss.android.ugc.aweme.specact.popup.a.i iVar2 = this.f134588c;
            if (iVar2 != null) {
                str2 = iVar2.f134433c;
            }
            d a3 = dVar2.a("pop_name", str2).a("result", "popup_occupied");
            if (!com.ss.android.ugc.aweme.specact.pendant.h.d.a()) {
                str = "others";
            }
            r.a("pop_filtered_reason", a3.a("position", str).f66730a);
        } else if (this.f134591f) {
            LocalTestApi localTestApi4 = a.C2792a.f108997a.f108996a;
            l.b(localTestApi4, "");
            localTestApi4.getSpecActDebugService().a("SpecPopup", "this cold launch has popped, so can not pop again");
            if (!this.f134593h) {
                d dVar3 = new d();
                com.ss.android.ugc.aweme.specact.popup.a.i iVar3 = this.f134588c;
                if (iVar3 != null) {
                    str2 = iVar3.f134433c;
                }
                d a4 = dVar3.a("pop_name", str2).a("result", "have_popped");
                if (!com.ss.android.ugc.aweme.specact.pendant.h.d.a()) {
                    str = "others";
                }
                r.a("pop_filtered_reason", a4.a("position", str).f66730a);
                this.f134593h = true;
            }
        } else if (this.f134592g > 0) {
            LocalTestApi localTestApi5 = a.C2792a.f108997a.f108996a;
            l.b(localTestApi5, "");
            localTestApi5.getSpecActDebugService().a("SpecPopup", "when launch, there are some more important dialog showing, so return");
            d dVar4 = new d();
            com.ss.android.ugc.aweme.specact.popup.a.i iVar4 = this.f134588c;
            if (iVar4 != null) {
                str2 = iVar4.f134433c;
            }
            d a5 = dVar4.a("pop_name", str2).a("result", "popup_occupied");
            if (!com.ss.android.ugc.aweme.specact.pendant.h.d.a()) {
                str = "others";
            }
            r.a("pop_filtered_reason", a5.a("position", str).f66730a);
        } else if (activity == null || !com.ss.android.ugc.aweme.specact.pendant.h.d.a()) {
            d dVar5 = new d();
            com.ss.android.ugc.aweme.specact.popup.a.i iVar5 = this.f134588c;
            if (iVar5 != null) {
                str2 = iVar5.f134433c;
            }
            r.a("pop_filtered_reason", dVar5.a("pop_name", str2).a("result", "not_in_feed").a("position", "others").f66730a);
        } else {
            com.ss.android.ugc.aweme.specact.popup.a.i iVar6 = this.f134588c;
            if (iVar6 == null) {
                l.b();
            }
            a(activity, iVar6);
        }
    }
}
