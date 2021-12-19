package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.network.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedList;
import java.util.List;

public class dr {

    /* renamed from: a  reason: collision with root package name */
    static dn f83126a;

    /* renamed from: b  reason: collision with root package name */
    public static a f83127b;

    /* renamed from: c  reason: collision with root package name */
    static List<IAccountUserService.a> f83128c = new LinkedList();

    static {
        Covode.recordClassIndex(51831);
    }

    public static void a(IAccountUserService.a aVar) {
        MethodCollector.i(6416);
        synchronized (dr.class) {
            try {
                if (!f83128c.contains(aVar)) {
                    f83128c.add(aVar);
                }
            } finally {
                MethodCollector.o(6416);
            }
        }
    }

    public static void a(int i2, User user, User user2) {
        MethodCollector.i(6423);
        LinkedList<IAccountUserService.a> linkedList = new LinkedList();
        synchronized (dr.class) {
            try {
                linkedList.addAll(f83128c);
            } finally {
                MethodCollector.o(6423);
            }
        }
        for (IAccountUserService.a aVar : linkedList) {
            aVar.a(i2, user, user2);
        }
    }
}
