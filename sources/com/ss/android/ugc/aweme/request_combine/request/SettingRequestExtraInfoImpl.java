package com.ss.android.ugc.aweme.request_combine.request;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.requestcombine.b;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class SettingRequestExtraInfoImpl implements ISettingRequestExtraInfo {

    /* renamed from: a  reason: collision with root package name */
    public List<b> f120626a = new ArrayList();

    static {
        Covode.recordClassIndex(78553);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f120627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingRequestExtraInfoImpl f120628b;

        static {
            Covode.recordClassIndex(78554);
        }

        a(Map map, SettingRequestExtraInfoImpl settingRequestExtraInfoImpl) {
            this.f120627a = map;
            this.f120628b = settingRequestExtraInfoImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Iterator<T> it = this.f120628b.f120626a.iterator();
            while (it.hasNext()) {
                it.next().a(this.f120627a);
            }
            return z.f158842a;
        }
    }

    public static ISettingRequestExtraInfo a() {
        MethodCollector.i(267);
        Object a2 = com.ss.android.ugc.b.a(ISettingRequestExtraInfo.class, false);
        if (a2 != null) {
            ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) a2;
            MethodCollector.o(267);
            return iSettingRequestExtraInfo;
        }
        if (com.ss.android.ugc.b.dh == null) {
            synchronized (ISettingRequestExtraInfo.class) {
                try {
                    if (com.ss.android.ugc.b.dh == null) {
                        com.ss.android.ugc.b.dh = new SettingRequestExtraInfoImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(267);
                    throw th;
                }
            }
        }
        SettingRequestExtraInfoImpl settingRequestExtraInfoImpl = (SettingRequestExtraInfoImpl) com.ss.android.ugc.b.dh;
        MethodCollector.o(267);
        return settingRequestExtraInfoImpl;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    public final void a(b bVar) {
        if (!this.f120626a.contains(bVar)) {
            this.f120626a.add(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo
    public final void a(Map<String, String> map) {
        i.b(new a(map, this), i.f4824a);
    }
}
