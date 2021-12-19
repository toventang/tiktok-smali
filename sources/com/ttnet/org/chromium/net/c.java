package com.ttnet.org.chromium.net;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.w;
import com.ttnet.org.chromium.net.x;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f155468a = c.class.getSimpleName();

    public abstract ab.a a(String str, ab.b bVar, Executor executor);

    public abstract w.a a(w.b bVar);

    public abstract x.a a(x.b bVar, Executor executor);

    public abstract URLConnection a(URL url);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f155469a;

        /* renamed from: com.ttnet.org.chromium.net.c$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC4117a {
            static {
                Covode.recordClassIndex(103420);
            }

            public abstract void loadLibrary(String str);
        }

        static {
            Covode.recordClassIndex(103418);
        }

        public a a(String str) {
            this.f155469a.f(str);
            return this;
        }

        public a a(boolean z) {
            this.f155469a.b(z);
            return this;
        }

        public a a(ArrayList<byte[]> arrayList) {
            this.f155469a.a(arrayList);
            return this;
        }

        public a a(Map<String[], Pair<byte[], byte[]>> map) {
            this.f155469a.a(map);
            return this;
        }

        public a a(String str, int i2, int i3) {
            this.f155469a.a(str, i2, i3);
            return this;
        }

        public a a() {
            this.f155469a.a();
            return this;
        }

        public a(i iVar) {
            this.f155469a = iVar;
        }

        public a b(String str) {
            this.f155469a.e(str);
            return this;
        }

        public a c(String str) {
            this.f155469a.a(str);
            return this;
        }

        public a d(String str) {
            this.f155469a.b(str);
            return this;
        }

        public a e(String str) {
            this.f155469a.c(str);
            return this;
        }

        public a f(String str) {
            this.f155469a.d(str);
            return this;
        }

        public a b(boolean z) {
            this.f155469a.a(z);
            return this;
        }

        public a c(boolean z) {
            this.f155469a.c(z);
            return this;
        }

        public a d(boolean z) {
            this.f155469a.d(z);
            return this;
        }

        public a e(boolean z) {
            this.f155469a.e(z);
            return this;
        }

        public a a(long j2) {
            this.f155469a.a(j2);
            return this;
        }

        private static List<e> a(List<e> list) {
            if (list.size() != 0) {
                Iterator<e> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (list.size() != 0) {
                    Collections.sort(list, new Comparator<e>() {
                        /* class com.ttnet.org.chromium.net.c.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103419);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(e eVar, e eVar2) {
                            e eVar3 = eVar;
                            e eVar4 = eVar2;
                            if ("Fallback-Cronet-Provider".equals(eVar3.b())) {
                                return 1;
                            }
                            if ("Fallback-Cronet-Provider".equals(eVar4.b())) {
                                return -1;
                            }
                            return -a.a(eVar3.c(), eVar4.c());
                        }
                    });
                    return list;
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r5) {
            /*
                r4 = this;
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.lang.String r0 = "com.google.android.gms.net.PlayServicesCronetProvider"
                com.ttnet.org.chromium.net.e.a(r5, r0, r1)
                java.lang.String r0 = "com.google.android.gms.net.GmsCoreCronetProvider"
                com.ttnet.org.chromium.net.e.a(r5, r0, r1)
                java.lang.String r0 = "com.ttnet.org.chromium.net.impl.NativeCronetProvider"
                com.ttnet.org.chromium.net.e.a(r5, r0, r1)
                java.lang.String r0 = "com.ttnet.org.chromium.net.impl.JavaCronetProvider"
                com.ttnet.org.chromium.net.e.a(r5, r0, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r2.<init>(r0)
                java.util.List r0 = a(r2)
                r3 = 0
                java.lang.Object r2 = r0.get(r3)
                com.ttnet.org.chromium.net.e r2 = (com.ttnet.org.chromium.net.e) r2
                java.lang.String r1 = com.ttnet.org.chromium.net.c.f155468a
                r0 = 3
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L_0x0045
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r1[r3] = r2
                java.lang.String r0 = "Using '%s' provider for creating CronetEngine.Builder."
                com.a.a(r0, r1)
            L_0x0045:
                com.ttnet.org.chromium.net.c$a r0 = r2.a()
                com.ttnet.org.chromium.net.i r0 = r0.f155469a
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.c.a.<init>(android.content.Context):void");
        }

        public a a(TTAppInfoProvider tTAppInfoProvider) {
            this.f155469a.a(tTAppInfoProvider);
            return this;
        }

        public a a(AbstractC4117a aVar) {
            this.f155469a.a(aVar);
            return this;
        }

        public a a(u uVar) {
            this.f155469a.a(uVar);
            return this;
        }

        public a a(v vVar) {
            this.f155469a.a(vVar);
            return this;
        }

        public a a(int i2, long j2) {
            this.f155469a.a(i2, j2);
            return this;
        }

        static int a(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i2 = 0;
            while (i2 < split.length && i2 < split2.length) {
                try {
                    int parseInt = Integer.parseInt(split[i2]);
                    int parseInt2 = Integer.parseInt(split2[i2]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                    i2++;
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i2] + " & " + split2[i2], e2);
                }
            }
            return Integer.signum(split.length - split2.length);
        }
    }

    static {
        Covode.recordClassIndex(103417);
    }
}
