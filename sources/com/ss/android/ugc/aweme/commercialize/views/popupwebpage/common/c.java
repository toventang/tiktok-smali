package com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final b f76249f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f76250a;

    /* renamed from: b  reason: collision with root package name */
    public final String f76251b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f76252c;

    /* renamed from: d  reason: collision with root package name */
    public final int f76253d;

    /* renamed from: e  reason: collision with root package name */
    public final int f76254e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f76255a;

        /* renamed from: b  reason: collision with root package name */
        public String f76256b;

        /* renamed from: c  reason: collision with root package name */
        public HashMap<String, String> f76257c = new HashMap<>();

        static {
            Covode.recordClassIndex(47015);
        }
    }

    static {
        Covode.recordClassIndex(47014);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(47016);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private c(Context context, String str, Map<String, String> map) {
        l.d(map, "");
        this.f76250a = context;
        this.f76251b = str;
        this.f76252c = map;
        this.f76253d = 0;
        this.f76254e = 2;
    }

    public /* synthetic */ c(Context context, String str, Map map, byte b2) {
        this(context, str, map);
    }
}
