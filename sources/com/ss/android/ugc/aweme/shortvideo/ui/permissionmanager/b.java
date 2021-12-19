package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f131863a = ag.a(v.a("android.permission.RECORD_AUDIO", "microphone"), v.a("android.permission.CAMERA", "camera"), v.a("android.permission.WRITE_EXTERNAL_STORAGE", UGCMonitor.TYPE_PHOTO));

    static {
        Covode.recordClassIndex(86392);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void b(String[] strArr, e eVar) {
        l.d(strArr, "");
        l.d(eVar, "");
        r.a("go_to_settings_show", a(strArr, eVar, (Boolean) null));
    }

    public static final void c(String[] strArr, e eVar) {
        l.d(strArr, "");
        l.d(eVar, "");
        r.a("permission_rationale_page_show", a(strArr, eVar, (Boolean) null));
    }

    public static final void a(String[] strArr, e eVar) {
        l.d(strArr, "");
        l.d(eVar, "");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            r.a("asking_permission_show", a(new String[]{strArr[i2]}, eVar, (Boolean) null));
        }
    }

    public static final void a(String[] strArr, e eVar, boolean z) {
        l.d(strArr, "");
        l.d(eVar, "");
        r.a("go_to_settings_action", a(strArr, eVar, Boolean.valueOf(z)));
    }

    public static final Map<String, String> a(String[] strArr, e eVar, Boolean bool) {
        Intent intent = eVar.getIntent();
        l.b(intent, "");
        Bundle a2 = a(intent);
        String str = null;
        com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("shoot_way", a2 != null ? a2.getString("shoot_way") : null);
        if (a2 != null) {
            str = a2.getString("creation_id");
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("creation_id", str);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            arrayList.add(f131863a.get(str2));
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a(StringSet.type, n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
        if (bool != null) {
            bool.booleanValue();
            a5.a("status", bool.booleanValue() ? 1 : 0);
        }
        Map<String, String> map = a5.f149193a;
        l.b(map, "");
        return map;
    }

    public static final void a(String[] strArr, int[] iArr, e eVar) {
        l.d(eVar, "");
        p<String, Boolean>[] b2 = f.b(strArr, iArr);
        if (b2 != null) {
            for (p<String, Boolean> pVar : b2) {
                r.a("asking_permission_action", a(new String[]{pVar.getFirst()}, eVar, pVar.getSecond()));
            }
        }
    }
}
