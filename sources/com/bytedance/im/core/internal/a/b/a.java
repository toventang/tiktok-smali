package com.bytedance.im.core.internal.a.b;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.a.b.b;
import com.bytedance.im.core.internal.utils.x;
import java.util.List;

public class a implements x.a {

    /* renamed from: b  reason: collision with root package name */
    private static a f38190b;

    /* renamed from: a  reason: collision with root package name */
    public x f38191a;

    /* renamed from: com.bytedance.im.core.internal.a.b.a$a  reason: collision with other inner class name */
    public class C0923a {

        /* renamed from: a  reason: collision with root package name */
        public List<com.bytedance.im.core.d.b.a> f38192a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f38193b;

        /* renamed from: c  reason: collision with root package name */
        String f38194c;

        /* renamed from: d  reason: collision with root package name */
        int f38195d;

        static {
            Covode.recordClassIndex(22871);
        }
    }

    static {
        Covode.recordClassIndex(22870);
    }

    public a() {
        d.a();
    }

    public static a a() {
        MethodCollector.i(11252);
        if (f38190b == null) {
            synchronized (a.class) {
                try {
                    f38190b = new a();
                } catch (Throwable th) {
                    MethodCollector.o(11252);
                    throw th;
                }
            }
        }
        a aVar = f38190b;
        MethodCollector.o(11252);
        return aVar;
    }

    @Override // com.bytedance.im.core.internal.utils.x.a
    public final void a(Message message) {
        if (message.obj instanceof C0923a) {
            C0923a aVar = (C0923a) message.obj;
            switch (message.what) {
                case 101:
                    b.a(aVar.f38192a);
                    return;
                case 102:
                    List<com.bytedance.im.core.d.b.a> list = aVar.f38192a;
                    if (!(b.f38196a || list == null || list.isEmpty())) {
                        StringBuilder sb = new StringBuilder();
                        for (com.bytedance.im.core.d.b.a aVar2 : list) {
                            if (aVar2 != null && !TextUtils.isEmpty(aVar2.a())) {
                                sb.append(",\"").append(aVar2.a()).append('\"');
                            }
                        }
                        String sb2 = sb.toString();
                        if (sb2.length() > 0) {
                            if (b.b("delete from fts_entity where " + b.a.COLUMN_ID.key + " in " + ("(" + sb2.substring(1) + ")"))) {
                                b.a(list);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 103:
                    b.b(aVar.f38192a);
                    return;
                case 104:
                    b.a(aVar.f38193b, aVar.f38194c);
                    return;
                case 105:
                    b.a(aVar.f38193b, aVar.f38194c, aVar.f38195d);
                    return;
                default:
                    return;
            }
        }
    }
}
