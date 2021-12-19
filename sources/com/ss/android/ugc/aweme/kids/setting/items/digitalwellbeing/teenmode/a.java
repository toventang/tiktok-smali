package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode;

import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.b.a.d;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.MinorSettingData;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.b;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.e;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.i;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.viewmodel.TimeLockOptionViewModel;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.nio.charset.Charset;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static TeenageModeSetting f106920a = d();

    /* renamed from: b  reason: collision with root package name */
    public static String f106921b = "";

    /* renamed from: c  reason: collision with root package name */
    public static final a f106922c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.a f106923d;

    private a() {
    }

    public static int b() {
        TeenageModeSetting teenageModeSetting = f106920a;
        if (teenageModeSetting != null) {
            return teenageModeSetting.getTimeLockSelfInMin();
        }
        return 0;
    }

    public static boolean c() {
        if (a()) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        if (b() > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(68388);
        Object a2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.a.class);
        l.b(a2, "");
        f106923d = (com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.a) a2;
    }

    private static TeenageModeSetting d() {
        String a2 = f106923d.a();
        l.b(a2, "");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return (TeenageModeSetting) new f().a(a2, TeenageModeSetting.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(TeenageModeSetting teenageModeSetting) {
        f106923d.a(new f().b(teenageModeSetting));
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
                String a2 = com.bytedance.common.utility.d.a(bytes, bytes.length);
                l.b(a2, "");
                return a2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(e eVar, boolean z) {
        int i2;
        if (z) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.ggr).a();
        } else {
            if (eVar != null) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(eVar.getResources().getString(R.string.ggx)).a();
                ac a2 = ae.a(eVar, (ad.b) null).a(TimeLockOptionViewModel.class);
                l.b(a2, "");
                t<e.a> tVar = ((TimeLockOptionViewModel) a2).f107004a;
                l.b(tVar, "");
                e.a value = tVar.getValue();
                TeenageModeSetting teenageModeSetting = f106920a;
                if (teenageModeSetting != null) {
                    if (value != null) {
                        i2 = value.f106973b;
                    } else {
                        i2 = 0;
                    }
                    teenageModeSetting.setTimeLockSelfInMin(i2);
                }
            }
            a(f106920a);
        }
        if (eVar != null) {
            b.a(eVar);
            ((com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a) eVar).a(i.b());
        }
    }

    public static String a(boolean z, String str, boolean z2, androidx.fragment.app.e eVar) {
        int i2;
        l.d(str, "");
        l.d(eVar, "");
        if (z2) {
            String a2 = a(str);
            MinorSettingData minorSettingData = new MinorSettingData();
            minorSettingData.setEventType(2);
            minorSettingData.setEventValue(a2);
            minorSettingData.setPassword(a(f106921b));
            String b2 = new f().b(n.a(minorSettingData));
            l.b(b2, "");
            return b2;
        }
        String a3 = a(str);
        MinorSettingData minorSettingData2 = new MinorSettingData();
        minorSettingData2.setEventType(1);
        if (z) {
            ac a4 = ae.a(eVar, (ad.b) null).a(TimeLockOptionViewModel.class);
            l.b(a4, "");
            t<e.a> tVar = ((TimeLockOptionViewModel) a4).f107004a;
            l.b(tVar, "");
            e.a value = tVar.getValue();
            if (value != null) {
                i2 = value.f106973b;
                minorSettingData2.setEventValue(String.valueOf(i2));
                minorSettingData2.setPassword(a3);
                String b3 = new f().b(n.a(minorSettingData2));
                l.b(b3, "");
                return b3;
            }
        }
        i2 = 0;
        minorSettingData2.setEventValue(String.valueOf(i2));
        minorSettingData2.setPassword(a3);
        String b32 = new f().b(n.a(minorSettingData2));
        l.b(b32, "");
        return b32;
    }
}
