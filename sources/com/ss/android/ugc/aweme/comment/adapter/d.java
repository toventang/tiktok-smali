package com.ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;

public class d {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f71351e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f71352a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f71353b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f71354c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f71355d;

    static {
        Covode.recordClassIndex(43930);
    }

    private d() {
        boolean z = true;
        this.f71355d = SettingsManager.a().a("aweme_comment_pre_create_viewholder_setting", 1) != 1 ? false : z;
    }

    public static d a() {
        MethodCollector.i(690);
        if (f71351e == null) {
            synchronized (d.class) {
                try {
                    if (f71351e == null) {
                        f71351e = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(690);
                    throw th;
                }
            }
        }
        d dVar = f71351e;
        MethodCollector.o(690);
        return dVar;
    }
}
