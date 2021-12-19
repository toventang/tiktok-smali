package com.ss.android.ugc.aweme.notice.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.c;
import com.ss.android.ugc.aweme.notice.api.count.NoticeCountService;
import com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f112666a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f112667b = i.a((h.f.a.a) C2884b.f112670a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f112668c = i.a((h.f.a.a) a.f112669a);

    public static NoticeCountService a() {
        return (NoticeCountService) f112667b.getValue();
    }

    public static IMainServiceHelper b() {
        return (IMainServiceHelper) f112668c.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<IMainServiceHelper> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112669a = new a();

        static {
            Covode.recordClassIndex(72405);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IMainServiceHelper invoke() {
            return MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.b$b  reason: collision with other inner class name */
    static final class C2884b extends m implements h.f.a.a<NoticeCountService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2884b f112670a = new C2884b();

        static {
            Covode.recordClassIndex(72406);
        }

        C2884b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NoticeCountService invoke() {
            return NoticeCountServiceImpl.d();
        }
    }

    public static final void c() {
        a().b();
    }

    static {
        Covode.recordClassIndex(72404);
    }

    private static int a(int i2) {
        return a().a(i2);
    }

    private static int b(int i2) {
        return a().b(i2);
    }

    public static final void d(int... iArr) {
        l.d(iArr, "");
        a().a((c) null, iArr);
    }

    public static final int a(String str) {
        l.d(str, "");
        return a().a(str);
    }

    public static final int a(int... iArr) {
        l.d(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(a(i2)));
        }
        return n.u(arrayList);
    }

    public static final int b(int... iArr) {
        l.d(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(b(i2)));
        }
        return n.u(arrayList);
    }

    public static final boolean c(int... iArr) {
        l.d(iArr, "");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(a(i2)));
        }
        if (n.u(arrayList) > 0) {
            return true;
        }
        return false;
    }

    public static final void a(boolean z) {
        a().a(z);
    }

    public static final void a(int i2, int i3) {
        a().a(i2, i3);
    }

    public static final void a(c cVar, int... iArr) {
        l.d(cVar, "");
        l.d(iArr, "");
        a().a(cVar, iArr);
    }

    public static final void a(List<String> list, String str) {
        l.d(list, "");
        l.d(str, "");
        a().a(list, str);
    }

    public static final void a(boolean z, int i2) {
        a().a(z, i2);
    }
}
