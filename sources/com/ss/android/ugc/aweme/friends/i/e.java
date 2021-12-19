package com.ss.android.ugc.aweme.friends.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.ds;
import com.ss.android.ugc.aweme.experiment.ey;
import com.ss.android.ugc.aweme.experiment.ez;
import com.ss.android.ugc.aweme.experiment.fi;
import com.ss.android.ugc.aweme.experiment.fj;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.c.a;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.ss.android.ugc.aweme.ufr.g;
import com.ss.android.ugc.aweme.utils.in;
import f.a.d.f;
import h.f.b.l;
import h.p;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static f.a.b.b f96881a;

    /* renamed from: b  reason: collision with root package name */
    static f.a.b.b f96882b;

    /* renamed from: c  reason: collision with root package name */
    static f.a.b.b f96883c;

    /* renamed from: d  reason: collision with root package name */
    static Keva f96884d = a.C3111a.a().f120367a;

    /* renamed from: e  reason: collision with root package name */
    public static final e f96885e = new e();

    /* renamed from: f  reason: collision with root package name */
    private static final fj f96886f = ez.a();

    private e() {
    }

    public final fi a(int i2) {
        fj fjVar;
        if (ds.a()) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin() && (fjVar = f96886f) != null && fjVar.f90050d == 4) {
                return a(i2, Integer.valueOf(fjVar.f90050d));
            }
        }
        return new fi();
    }

    public final void a(fi fiVar, String str, String str2, androidx.fragment.app.e eVar) {
        l.d(fiVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(eVar, "");
        if (a()) {
            a.C0732a.f33434a.a(b.a.FRIENDSLIST_PERMISSION);
        } else if (ey.a()) {
            b(fiVar, str, str2, eVar);
        } else {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            f96881a = com.ss.android.ugc.aweme.ufr.b.a(eVar, ContactUFR.class, g2.getCurUserId(), str, str2, true, true, null).d(new c(fiVar, str, str2, eVar));
        }
    }

    public final void a(boolean z, String str, String str2, androidx.fragment.app.e eVar, int i2) {
        if (!z) {
            a(str, 1);
        } else if (a(i2, 2)) {
            User c2 = in.c();
            l.b(c2, "");
            f96882b = com.ss.android.ugc.aweme.ufr.b.a(eVar, com.ss.android.ugc.aweme.ufr.a.a.class, c2.getUid(), str, str2, true, true, null).d(new b(str));
        }
    }

    static {
        Covode.recordClassIndex(61481);
    }

    private static boolean a() {
        if (c(1) || c(2)) {
            return true;
        }
        return false;
    }

    private final fi b(int i2) {
        return new fi(a(i2, 1), a(i2, 2), i2);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f96887a;

        static {
            Covode.recordClassIndex(61482);
        }

        a(String str) {
            this.f96887a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.AUTHORIZED) {
                e.a(this.f96887a, 1);
                e.f96884d.storeBoolean("finish_contact_permission_process", true);
                f.a.b.b bVar = e.f96881a;
                if (bVar != null) {
                    bVar.dispose();
                }
                e.f96881a = null;
            }
            if ((dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) && !dVar.f141690b.f141691a) {
                e.a(this.f96887a, 1);
                f.a.b.b bVar2 = e.f96881a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                e.f96881a = null;
            }
        }
    }

    private static boolean c(int i2) {
        long j2;
        com.ss.android.ugc.aweme.friends.service.b q = com.ss.android.ugc.aweme.friends.service.a.f97047a.q();
        if (q != null) {
            p<Boolean, Long> a2 = q.a(i2);
            if (a2.getFirst().booleanValue()) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = a2.getSecond().longValue();
                fj fjVar = f96886f;
                if (fjVar != null) {
                    j2 = ((long) fjVar.f90048b) * 86400000;
                } else {
                    j2 = 604800000;
                }
                if (currentTimeMillis < longValue + j2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f96888a;

        static {
            Covode.recordClassIndex(61483);
        }

        b(String str) {
            this.f96888a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.AUTHORIZED) {
                e.a(this.f96888a, 2);
                e.f96884d.storeBoolean("finish_facebook_permission_process", true);
                f.a.b.b bVar = e.f96882b;
                if (bVar != null) {
                    bVar.dispose();
                }
                e.f96882b = null;
            }
            if ((dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) && !dVar.f141690b.f141691a) {
                e.a(this.f96888a, 2);
                f.a.b.b bVar2 = e.f96882b;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                e.f96882b = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fi f96889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f96890b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f96891c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f96892d;

        static {
            Covode.recordClassIndex(61484);
        }

        c(fi fiVar, String str, String str2, androidx.fragment.app.e eVar) {
            this.f96889a = fiVar;
            this.f96890b = str;
            this.f96891c = str2;
            this.f96892d = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.AUTHORIZED) {
                e.f96885e.a(this.f96889a.f90045b, this.f96890b, this.f96891c, this.f96892d, this.f96889a.f90046c);
                e.f96884d.storeBoolean("finish_contact_permission_process", true);
                f.a.b.b bVar = e.f96881a;
                if (bVar != null) {
                    bVar.dispose();
                }
                e.f96881a = null;
            }
            if ((dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) && !dVar.f141690b.f141691a) {
                e.a(this.f96890b, 1);
                f.a.b.b bVar2 = e.f96881a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                e.f96881a = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f96893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f96894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f96895c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f96896d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f96897e;

        static {
            Covode.recordClassIndex(61485);
        }

        d(int i2, String str, String str2, androidx.fragment.app.e eVar, int i3) {
            this.f96893a = i2;
            this.f96894b = str;
            this.f96895c = str2;
            this.f96896d = eVar;
            this.f96897e = i3;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.AUTHORIZED) {
                if (this.f96893a == 2) {
                    e.a(this.f96894b, this.f96895c, this.f96896d);
                    e.f96884d.storeBoolean("finish_facebook_permission_process", true);
                } else {
                    e.f96885e.a(true, this.f96894b, this.f96895c, this.f96896d, this.f96897e);
                    e.f96884d.storeBoolean("finish_contact_permission_process", true);
                }
                f.a.b.b bVar = e.f96883c;
                if (bVar != null) {
                    bVar.dispose();
                }
                e.f96883c = null;
            }
            if ((dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION || dVar.f141689a == g.REQUEST_UID_PERMISSION) && !dVar.f141690b.f141691a) {
                e.a(this.f96894b, this.f96893a);
                f.a.b.b bVar2 = e.f96883c;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                e.f96883c = null;
            }
        }
    }

    private final fi a(int i2, Integer num) {
        if (ey.a()) {
            return b(i2);
        }
        boolean z = true;
        boolean a2 = a(i2, 1);
        if (num == null || (!(num.intValue() == 4 || num.intValue() == 5) || c.b.f141662a.b())) {
            z = false;
        }
        return new fi(a2, z, i2);
    }

    private static void a(Integer num, int i2) {
        f96884d.storeInt("contact_pop_up_count", f96884d.getInt("contact_pop_up_count", 0) + 1);
        f96884d.storeLong("last_show_contact_time", System.currentTimeMillis());
        f96884d.storeInt("last_permission_pop_up_type", i2);
        if (num == null || num.intValue() != 0) {
            f96884d.storeInt("rules_major_stage", f96884d.getInt("rules_major_stage", 0) + 1);
        }
    }

    public static void a(String str, int i2) {
        Integer num;
        fj fjVar = f96886f;
        if (fjVar != null) {
            num = Integer.valueOf(fjVar.f90050d);
        } else {
            num = null;
        }
        a(num, i2);
        if (l.a((Object) str, (Object) "personal_homepage")) {
            ae.f115954a.updateProfilePermission(false);
        }
        a.C0732a.f33434a.a(b.a.FRIENDSLIST_PERMISSION);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r1 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        h.f.b.l.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r11 <= (((long) r1.intValue()) * 86400000)) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        r6 = com.ss.android.ugc.aweme.friends.i.e.f96886f;
        r0 = r6.f90047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r0 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        r0 = r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r0 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r0 = r0.f90135a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r0 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        h.f.b.l.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r4 >= (r0.size() - 1)) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        r11 = r11 - (((long) r1.intValue()) * 86400000);
        r4 = r4 + 1;
        r0 = r6.f90047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r0 = r0.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00be, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        r0 = r0.f90136b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cb, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.i.e.a(int, int):boolean");
    }

    public static void a(String str, String str2, androidx.fragment.app.e eVar) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        f96881a = com.ss.android.ugc.aweme.ufr.b.a(eVar, ContactUFR.class, g2.getCurUserId(), str, str2, true, true, null).d(new a(str));
    }

    private final void b(fi fiVar, String str, String str2, androidx.fragment.app.e eVar) {
        int i2 = f96884d.getInt("last_permission_pop_up_type", 0);
        int i3 = f96884d.getInt("contact_pop_up_count", 0);
        int i4 = 1;
        if (i2 == 1 || (i2 == 0 && i3 != 0)) {
            i4 = 2;
        }
        if (fiVar.f90044a && fiVar.f90045b) {
            a(i4, str, str2, eVar, fiVar.f90046c);
        } else if (fiVar.f90044a) {
            a(str, str2, eVar);
        } else if (fiVar.f90045b) {
            a(true, str, str2, eVar, fiVar.f90046c);
        }
    }

    private static void a(int i2, String str, String str2, androidx.fragment.app.e eVar, int i3) {
        Class cls;
        if (i2 == 2) {
            cls = com.ss.android.ugc.aweme.ufr.a.a.class;
        } else {
            cls = ContactUFR.class;
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        f96883c = com.ss.android.ugc.aweme.ufr.b.a(eVar, cls, g2.getCurUserId(), str, str2, true, true, null).d(new d(i2, str, str2, eVar, i3));
    }
}
