package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.MinorSettingData;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.b;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.r;
import h.h.c;
import h.h.e;
import h.k.i;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f77961a = {new r(a.class, "restrictModeState", "getRestrictModeState()Lcom/ss/android/ugc/aweme/compliance/protection/digitalwellbeing/RestrictModeState;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a f77962b = f();

    /* renamed from: c  reason: collision with root package name */
    public static String f77963c = "";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f77964d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f77965e = new a();

    /* renamed from: f  reason: collision with root package name */
    private static final b f77966f;

    /* renamed from: g  reason: collision with root package name */
    private static final e f77967g;

    public static void a(b bVar) {
        l.d(bVar, "");
        f77967g.a(f77961a[0], bVar);
    }

    public final b a() {
        return (b) f77967g.a(this, f77961a[0]);
    }

    private a() {
    }

    public static boolean b() {
        com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar = f77962b;
        if (aVar != null) {
            return aVar.isRestrictModeSelf();
        }
        return false;
    }

    public static boolean c() {
        if (d() > 0) {
            return true;
        }
        return false;
    }

    public static int d() {
        com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar = f77962b;
        if (aVar != null) {
            return aVar.getTimeLockSelfInMin();
        }
        return 0;
    }

    public static boolean e() {
        if (b() || c()) {
            return true;
        }
        return false;
    }

    private static com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a f() {
        String a2 = f77966f.a();
        l.b(a2, "");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return (com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a) new f().a(a2, com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0030, code lost:
        if (r1 != null) goto L_0x0032;
     */
    static {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.<clinit>():void");
    }

    public static void a(com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar) {
        f77966f.a(new f().b(aVar));
        Bundle bundle = new Bundle();
        bundle.putInt("filter_warn", com.ss.android.ugc.aweme.compliance.protection.common.a.d());
        AppLog.setCustomerHeader(bundle);
    }

    public static String a(String str) {
        l.d(str, "");
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int parseInt = Integer.parseInt(str);
            String str2 = String.valueOf(parseInt * parseInt) + "dmt";
            Charset forName = Charset.forName("UTF-8");
            l.b(forName, "");
            if (str2 != null) {
                byte[] bytes = str2.getBytes(forName);
                l.b(bytes, "");
                int length = bytes.length;
                for (int i2 = 0; i2 < length; i2++) {
                    bytes[i2] = (byte) (bytes[i2] ^ 5);
                }
                String a2 = d.a(bytes, bytes.length);
                l.b(a2, "");
                return a2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a$a  reason: collision with other inner class name */
    public static final class C1809a extends c<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f77968a;

        static {
            Covode.recordClassIndex(48327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1809a(Object obj, Object obj2) {
            super(obj2);
            this.f77968a = obj;
        }

        @Override // h.h.c
        public final void a(i<?> iVar, b bVar, b bVar2) {
            l.d(iVar, "");
            bVar.name();
            bVar2.name();
        }
    }

    public static void a(androidx.fragment.app.e eVar, int i2, boolean z) {
        int i3;
        if (z) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.ggr).a();
        } else {
            if (i2 != 0) {
                com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar = f77962b;
                if (aVar != null) {
                    aVar.setRestrictModeSelf(true);
                }
                if (com.ss.android.ugc.aweme.compliance.protection.restrictmode.a.a()) {
                    a(b.OPEN);
                }
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                com.ss.android.ugc.aweme.common.r.a("open_teen_mode_finish", dVar.a("is_login", g2.isLogin() ? 1 : 0).f66730a);
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.feg).a();
                com.ss.android.ugc.aweme.compliance.protection.common.a.e();
                com.ss.android.ugc.aweme.compliance.protection.common.a.a(null);
            } else if (eVar != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.ggx).a();
                ac a2 = ae.a(eVar, (ad.b) null).a(TimeLockOptionViewModel.class);
                l.b(a2, "");
                t<l.a> tVar = ((TimeLockOptionViewModel) a2).f78093a;
                h.f.b.l.b(tVar, "");
                l.a value = tVar.getValue();
                com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a aVar2 = f77962b;
                int i4 = 0;
                if (aVar2 != null) {
                    if (value != null) {
                        i3 = value.f78057b;
                    } else {
                        i3 = 0;
                    }
                    aVar2.setTimeLockSelfInMin(i3);
                }
                com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                if (value != null) {
                    i4 = value.f78057b;
                }
                com.ss.android.ugc.aweme.common.r.a("open_time_lock_finish", dVar2.a("set_time", i4).f66730a);
            }
            a(f77962b);
        }
        if (eVar != null) {
            com.ss.android.ugc.aweme.compliance.protection.timelock.a.a(eVar, i2);
        }
    }

    public static String a(int i2, boolean z, String str, boolean z2, androidx.fragment.app.e eVar) {
        int i3;
        h.f.b.l.d(str, "");
        h.f.b.l.d(eVar, "");
        if (z2) {
            String a2 = a(str);
            MinorSettingData minorSettingData = new MinorSettingData();
            minorSettingData.setEventType(3);
            minorSettingData.setEventValue(a2);
            minorSettingData.setPassword(a(f77963c));
            String b2 = new f().b(n.a(minorSettingData));
            h.f.b.l.b(b2, "");
            return b2;
        } else if (i2 == 0) {
            String a3 = a(str);
            MinorSettingData minorSettingData2 = new MinorSettingData();
            minorSettingData2.setEventType(2);
            if (z) {
                ac a4 = ae.a(eVar, (ad.b) null).a(TimeLockOptionViewModel.class);
                h.f.b.l.b(a4, "");
                t<l.a> tVar = ((TimeLockOptionViewModel) a4).f78093a;
                h.f.b.l.b(tVar, "");
                l.a value = tVar.getValue();
                if (value != null) {
                    i3 = value.f78057b;
                    minorSettingData2.setEventValue(String.valueOf(i3));
                    minorSettingData2.setPassword(a3);
                    String b3 = new f().b(n.a(minorSettingData2));
                    h.f.b.l.b(b3, "");
                    return b3;
                }
            }
            i3 = 0;
            minorSettingData2.setEventValue(String.valueOf(i3));
            minorSettingData2.setPassword(a3);
            String b32 = new f().b(n.a(minorSettingData2));
            h.f.b.l.b(b32, "");
            return b32;
        } else {
            String a5 = a(str);
            MinorSettingData minorSettingData3 = new MinorSettingData();
            minorSettingData3.setEventType(1);
            minorSettingData3.setEventValue(String.valueOf(z ? 1 : 0));
            minorSettingData3.setPassword(a5);
            ArrayList arrayList = new ArrayList();
            arrayList.add(minorSettingData3);
            String b4 = new f().b(arrayList);
            h.f.b.l.b(b4, "");
            return b4;
        }
    }
}
