package com.google.android.play.core.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Context f53347a;

    static {
        Covode.recordClassIndex(32950);
    }

    v(Context context) {
        this.f53347a = context;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Set<String> a() {
        Set<String> stringSet;
        MethodCollector.i(6883);
        try {
            stringSet = d.a(this.f53347a, "playcore_split_install_internal", 0).getStringSet("deferred_uninstall_module_list", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            MethodCollector.o(6883);
        } catch (Exception unused) {
            HashSet hashSet = new HashSet();
            MethodCollector.o(6883);
            return hashSet;
        }
        return stringSet;
    }
}
