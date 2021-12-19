package com.ss.android.ugc.aweme.dd;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.ba;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Collection;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f79377a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f79378b = i.a((h.f.a.a) a.f79379a);

    public static ba a() {
        return (ba) f79378b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<ba> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f79379a = new a();

        static {
            Covode.recordClassIndex(49295);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ba invoke() {
            return new ba();
        }
    }

    static {
        Covode.recordClassIndex(49294);
    }

    public static boolean a(List<String> list, String str, boolean z) {
        l.d(list, "");
        l.d(str, "");
        boolean z2 = false;
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return false;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            String str2 = list.get(size);
            if (TextUtils.equals(str2, "zh-hant")) {
                list.set(size, "zh-Hant");
            }
            if (p.a(str2, str, true)) {
                if (z) {
                    list.remove(str2);
                }
                z2 = true;
            }
        }
        return z2;
    }
}
