package com.ss.android.ugc.trill.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.i18n.language.i18n.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final e<b> f150464c = new e<b>() {
        /* class com.ss.android.ugc.trill.abtest.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(98948);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.ugc.aweme.i18n.language.i18n.e
        public final /* synthetic */ b a() {
            return new b((byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f150465a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f150466b;

    static {
        Covode.recordClassIndex(98947);
    }

    private b() {
        this.f150465a = new HashMap();
    }

    public static b a() {
        return f150464c.b();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final boolean a(String str) {
        a aVar = this.f150465a.get(str);
        if (aVar == null) {
            return false;
        }
        if (this.f150466b == null) {
            try {
                this.f150466b = new JSONObject((String) com.ss.android.ugc.aweme.setting.b.b().a(d.a(), "ab_test_model", String.class));
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
        Object opt = this.f150466b.opt(str);
        if (opt == null) {
            opt = aVar.a();
        }
        return aVar.a(opt);
    }

    public final void a(String str, a aVar) {
        this.f150465a.put(str, aVar);
    }
}
