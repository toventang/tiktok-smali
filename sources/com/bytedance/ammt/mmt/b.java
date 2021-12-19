package com.bytedance.ammt.mmt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.ammt.mmt.impl.NativeMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

public final class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static String f6478a = "com.bytedance.ammt.mmt.DUMP";

    /* renamed from: b  reason: collision with root package name */
    public static String f6479b = "com.bytedance.ammt.mmt.START";

    static {
        Covode.recordClassIndex(3128);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        GraphicMMTPlugin c2;
        NativeMMTPlugin c3;
        if ("com.bytedance.ammt.mmt.DUMP".equals(intent.getAction())) {
            if (a(intent, StringSet.type).equals("native") && (c3 = NativeMMTPlugin.c()) != null && c3.f6477c) {
                a.a();
                String b2 = a.b(context);
                String a2 = a(intent, "output");
                if (a2 != null) {
                    c3.a(b2, a2);
                }
                c3.b();
            }
            if (a(intent, StringSet.type).equals("graphic") && (c2 = GraphicMMTPlugin.c()) != null && c2.f6477c) {
                a.a();
                String b3 = a.b(context);
                String a3 = a(intent, "output");
                if (a3 != null) {
                    c2.a(b3, a3);
                }
                c2.b();
            }
        }
    }
}
