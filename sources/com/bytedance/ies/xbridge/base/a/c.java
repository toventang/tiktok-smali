package com.bytedance.ies.xbridge.base.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class c implements com.bytedance.ies.xbridge.b.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35772b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f35773a;

    static {
        Covode.recordClassIndex(21366);
    }

    public static final class a extends e<c, Context> {
        static {
            Covode.recordClassIndex(21367);
        }

        private a() {
            super(AnonymousClass1.f35774a);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final SharedPreferences.Editor b() {
        SharedPreferences.Editor edit = this.f35773a.edit();
        l.a((Object) edit, "");
        return edit;
    }

    @Override // com.bytedance.ies.xbridge.b.c
    public final Set<String> a() {
        return this.f35773a.getAll().keySet();
    }

    private c(Context context) {
        SharedPreferences a2 = d.a(context, "xbridge-storage", 0);
        l.a((Object) a2, "");
        this.f35773a = a2;
    }

    @Override // com.bytedance.ies.xbridge.b.c
    public final boolean b(String str) {
        if (str == null) {
            return false;
        }
        b().remove(str).apply();
        return true;
    }

    @Override // com.bytedance.ies.xbridge.b.c
    public final Object a(String str) {
        if (str == null || !this.f35773a.contains(str)) {
            return null;
        }
        String string = this.f35773a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string == null) {
            l.a();
        }
        f fVar = (f) a.a(string, f.class);
        String str2 = fVar.f35779b;
        switch (d.f35775a[o.valueOf(fVar.f35778a).ordinal()]) {
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            case 2:
                return Integer.valueOf(Integer.parseInt(str2));
            case 3:
                return Double.valueOf(Double.parseDouble(str2));
            case 4:
                return str2;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return a.a(str2, List.class);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return a.a(str2, Map.class);
            default:
                return null;
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    @Override // com.bytedance.ies.xbridge.b.c
    public final boolean a(String str, Object obj) {
        String a2;
        if (str == null || obj == null) {
            return false;
        }
        SharedPreferences.Editor b2 = b();
        while (true) {
            new LinkedHashMap();
            if (obj instanceof Boolean) {
                a2 = a.a(new f(o.Boolean.name(), obj.toString()));
                break;
            } else if (obj instanceof Integer) {
                a2 = a.a(new f(o.Int.name(), obj.toString()));
                break;
            } else if (obj instanceof Double) {
                a2 = a.a(new f(o.Number.name(), obj.toString()));
                break;
            } else if (obj instanceof String) {
                a2 = a.a(new f(o.String.name(), obj.toString()));
                break;
            } else if (obj instanceof m) {
                obj = ((m) obj).b();
            } else if (obj instanceof n) {
                obj = ((n) obj).b();
            } else if (obj instanceof List) {
                a2 = a.a(new f(o.Array.name(), a.a(obj)));
            } else if (obj instanceof Map) {
                a2 = a.a(new f(o.Map.name(), a.a(obj)));
            } else {
                a2 = "";
            }
        }
        b2.putString(str, a2).apply();
        return true;
    }
}
