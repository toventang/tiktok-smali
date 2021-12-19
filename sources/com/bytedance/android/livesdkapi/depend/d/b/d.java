package com.bytedance.android.livesdkapi.depend.d.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public View f22949a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f22950b = new HashMap();

    static {
        Covode.recordClassIndex(13589);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public View f22951a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f22952b = new HashMap();

        static {
            Covode.recordClassIndex(13590);
        }

        public final d a() {
            d dVar = new d();
            dVar.f22949a = this.f22951a;
            dVar.a(this.f22952b);
            return dVar;
        }

        public final a a(View view) {
            l.d(view, "");
            this.f22951a = view;
            return this;
        }

        public final a a(Map<String, String> map) {
            l.d(map, "");
            this.f22952b.putAll(map);
            return this;
        }
    }

    public final void a(Map<String, String> map) {
        l.d(map, "");
        this.f22950b = map;
    }
}
