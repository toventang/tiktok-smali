package com.ss.android.ugc.aweme.ax.a.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f67724a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f67725b;

    static {
        Covode.recordClassIndex(41682);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41683);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public h(List<b> list) {
        l.d(list, "");
        this.f67725b = list;
    }

    public final d a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        Iterator<b> it = this.f67725b.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (TextUtils.equals(it.next().f67710b, str)) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() == -1) {
            z = true;
        }
        if (!z && valueOf != null) {
            b bVar = this.f67725b.get(valueOf.intValue());
            long optLong = jSONObject.optLong(str) - jSONObject.optLong(bVar.f67709a);
            if (optLong > 0) {
                return new d(bVar.f67711c, optLong);
            }
        }
        return null;
    }
}
