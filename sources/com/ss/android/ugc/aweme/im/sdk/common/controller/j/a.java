package com.ss.android.ugc.aweme.im.sdk.common.controller.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.service.a.c;
import h.f.b.l;
import java.util.List;
import java.util.Vector;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f102338a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<ai> f102339b = new Vector();

    /* renamed from: c  reason: collision with root package name */
    public static final a f102340c = new a();

    private a() {
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(65487);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.j.a$a  reason: collision with other inner class name */
    public static final class C2563a implements c {
        static {
            Covode.recordClassIndex(65488);
        }

        @Override // com.ss.android.ugc.aweme.im.service.a.c
        public final void a() {
            a.f102338a = false;
        }

        @Override // com.ss.android.ugc.aweme.im.service.a.c
        public final void a(boolean z, String str) {
            l.d(str, "");
            if (z) {
                for (ai aiVar : a.f102339b) {
                    t.b(aiVar);
                }
            }
            a.f102339b.clear();
        }
    }
}
