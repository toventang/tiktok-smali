package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f106889c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f106890a;

    /* renamed from: b  reason: collision with root package name */
    public String f106891b;

    /* renamed from: d  reason: collision with root package name */
    private int f106892d = 22;

    /* renamed from: e  reason: collision with root package name */
    private int f106893e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f106894f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f106895g = -1;

    static {
        Covode.recordClassIndex(68371);
    }

    private a() {
    }

    public static boolean b() {
        if (TextUtils.equals(d.s, "local_test")) {
            return true;
        }
        return false;
    }

    public static a a() {
        MethodCollector.i(3539);
        if (f106889c == null) {
            synchronized (a.class) {
                try {
                    if (f106889c == null) {
                        f106889c = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3539);
                    throw th;
                }
            }
        }
        a aVar = f106889c;
        MethodCollector.o(3539);
        return aVar;
    }
}
