package com.ss.android.ugc.aweme.share.i;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.setting.ce;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.share.ag;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import com.ss.android.ugc.trill.share.data.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f123565c;

    /* renamed from: a  reason: collision with root package name */
    public List<ag> f123566a;

    /* renamed from: b  reason: collision with root package name */
    public List<ce> f123567b;

    /* renamed from: d  reason: collision with root package name */
    private ShareDatabase f123568d = ShareDatabase.a(d.a());

    /* renamed from: e  reason: collision with root package name */
    private Integer f123569e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f123570f;

    static {
        Covode.recordClassIndex(81118);
    }

    public final String[] b() {
        LinkedList linkedList = new LinkedList(Arrays.asList(d()));
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return a(strArr, 10);
    }

    public final long c() {
        try {
            ShareDatabase shareDatabase = this.f123568d;
            if (shareDatabase != null) {
                return shareDatabase.i().c(0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private a() {
        boolean z;
        com.ss.android.ugc.aweme.framework.a.a.b("I18nShareOrderUtil", "Instantiating I18nShareOrderUtil");
        StringBuilder sb = new StringBuilder("I18nShareOrderUtil instantiated, ShareDatabase ready: ");
        if (this.f123568d != null) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.framework.a.a.b("I18nShareOrderUtil", sb.append(z).toString());
    }

    public static a a() {
        MethodCollector.i(12044);
        if (f123565c == null) {
            synchronized (a.class) {
                try {
                    if (f123565c == null) {
                        f123565c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12044);
                    throw th;
                }
            }
        }
        a aVar = f123565c;
        MethodCollector.o(12044);
        return aVar;
    }

    public final String[] d() {
        String[] strArr;
        List<ag> list = this.f123566a;
        if (list == null || list.isEmpty()) {
            strArr = SettingServiceImpl.v().a(d.a()).d();
        } else {
            strArr = new String[this.f123566a.size()];
            for (int i2 = 0; i2 < this.f123566a.size(); i2++) {
                strArr[i2] = this.f123566a.get(i2).f123339a;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        if (!IMAdapterServiceImpl.d().a()) {
            arrayList.remove("chat_merge");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void a(String str, int i2) {
        i.b(new c(this, str, i2), i.f4824a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(String str, int i2) {
        if (TextUtils.equals("more", str)) {
            return null;
        }
        try {
            ShareDatabase shareDatabase = this.f123568d;
            if (shareDatabase != null) {
                b i3 = shareDatabase.i();
                i3.a(new com.ss.android.ugc.trill.share.data.a(Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(i2)));
                Integer num = this.f123570f;
                if (num != null) {
                    i3.b(num);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final String[] a(String[] strArr, int i2) {
        int i3;
        try {
            if (this.f123568d != null) {
                HashMap hashMap = new HashMap();
                for (String str : strArr) {
                    hashMap.put(str, 0);
                }
                List<com.ss.android.ugc.trill.share.data.a> a2 = this.f123568d.i().a(0, 100);
                if (a2.size() >= 100) {
                    this.f123570f = Integer.valueOf(a2.get(a2.size() - 1).f150666a);
                }
                if (a2.size() > i2 && i2 <= 100) {
                    a2 = a2.subList(0, i2);
                }
                for (com.ss.android.ugc.trill.share.data.a aVar : a2) {
                    Integer num = (Integer) hashMap.get(aVar.f150668c);
                    String str2 = aVar.f150668c;
                    if (num == null) {
                        i3 = 1;
                    } else {
                        i3 = num.intValue() + 1;
                    }
                    hashMap.put(str2, Integer.valueOf(i3));
                }
                Arrays.sort(strArr, new b(hashMap, a2));
                this.f123569e = 0;
            }
        } catch (Exception unused) {
        }
        return strArr;
    }
}
