package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8646a = new a((byte) 0);

    static {
        Covode.recordClassIndex(4422);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4423);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Context context, String str) {
            SharedPreferences a2;
            String string;
            if (context == null || (a2 = d.a(context, "live_mode", 0)) == null || (string = a2.getString(l.a(str, (Object) "live_start_live_mode"), com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO.name())) == null) {
                return "";
            }
            return string;
        }

        public static void a(Context context, String str, String str2) {
            SharedPreferences a2;
            SharedPreferences.Editor edit;
            l.d(str, "");
            if (context != null && (a2 = d.a(context, "live_mode", 0)) != null && (edit = a2.edit()) != null) {
                edit.putString(l.a(str2, (Object) "live_start_live_mode"), str);
                edit.apply();
            }
        }

        public static void a(Context context, String str, String str2, boolean z) {
            SharedPreferences a2;
            SharedPreferences.Editor edit;
            l.d(str, "");
            l.d(str2, "");
            if (context != null && (a2 = d.a(context, "Congrats", 0)) != null && (edit = a2.edit()) != null) {
                edit.putBoolean(str2 + str + "apply_status", z);
                edit.apply();
            }
        }
    }
}
