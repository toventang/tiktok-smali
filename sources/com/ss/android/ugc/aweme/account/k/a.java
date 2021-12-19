package com.ss.android.ugc.aweme.account.k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.q;
import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final String f63113a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f63114b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f63115c = false;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f63116d = new HashMap();

    static {
        Covode.recordClassIndex(38871);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$a  reason: collision with other inner class name */
    public interface AbstractC1400a {

        /* renamed from: a  reason: collision with root package name */
        public static final AbstractC1400a f63117a = new AbstractC1400a() {
            /* class com.ss.android.ugc.aweme.account.k.a.AbstractC1400a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(38873);
            }

            @Override // com.ss.android.ugc.aweme.account.k.a.AbstractC1400a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        /* renamed from: b  reason: collision with root package name */
        public static final AbstractC1400a f63118b = new AbstractC1400a() {
            /* class com.ss.android.ugc.aweme.account.k.a.AbstractC1400a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(38874);
            }

            @Override // com.ss.android.ugc.aweme.account.k.a.AbstractC1400a
            public final String a(String str) {
                if (TextUtils.isEmpty(str) || "null".equals(str) || "0".equals(str)) {
                    return "";
                }
                return str;
            }
        };

        String a(String str);

        static {
            Covode.recordClassIndex(38872);
        }
    }

    public final void a() {
        b();
        this.f63114b.putAll(this.f63116d);
        com.ss.android.b.a.a.a.a(new b(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        try {
            if (this.f63115c) {
                com.ss.android.common.c.a.a(this.f63113a, c.a(this.f63114b));
                return;
            }
            q.a(this.f63113a, this.f63114b);
        } catch (Throwable unused) {
        }
    }

    a(String str) {
        this.f63113a = str;
    }

    public final void a(String str, String str2, AbstractC1400a aVar) {
        this.f63114b.put(str, aVar.a(str2));
    }
}
