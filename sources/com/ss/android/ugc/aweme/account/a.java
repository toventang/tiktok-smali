package com.ss.android.ugc.aweme.account;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.util.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<g> f62572a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static List<b> f62573b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final C1369a f62574c = new C1369a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.account.a$a  reason: collision with other inner class name */
    public static final class C1369a {
        static {
            Covode.recordClassIndex(38507);
        }

        private C1369a() {
        }

        public static void a() {
            Iterator<T> it = a.f62572a.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }

        private static void b() {
            Iterator<T> it = a.f62572a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public /* synthetic */ C1369a(byte b2) {
            this();
        }

        public static void a(List<b> list) {
            l.d(list, "");
            a.f62573b = list;
        }

        public static void a(g gVar) {
            l.d(gVar, "");
            a.f62572a.add(gVar);
        }

        public static void b(g gVar) {
            l.d(gVar, "");
            a.f62572a.remove(gVar);
        }

        public static void a(Bundle bundle) {
            if (!a.f62573b.isEmpty()) {
                a.f62573b.remove(0).a(bundle);
            } else {
                b();
            }
        }
    }

    static {
        Covode.recordClassIndex(38506);
    }
}
