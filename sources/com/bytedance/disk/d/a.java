package com.bytedance.disk.d;

import android.content.Context;
import android.os.Process;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.h.c;
import com.bytedance.disk.parcel.ClientProxyConfig;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f28556a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.disk.a.a f28557b;

    /* renamed from: c  reason: collision with root package name */
    private Context f28558c;

    /* renamed from: d  reason: collision with root package name */
    private int f28559d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f28560e = -1;

    static {
        Covode.recordClassIndex(16782);
    }

    public static void a(Exception exc) {
        if (exc instanceof RemoteException) {
            com.bytedance.disk.h.a.a("MigManager", "transact with remote failed!", exc, new Object[0]);
        } else {
            com.bytedance.disk.h.a.a("MigManager", "handleException", exc, new Object[0]);
        }
    }

    private int a(MigrationOpt migrationOpt) {
        int i2 = -1;
        MigrationItem migrationItem = null;
        try {
            int i3 = 0;
            migrationItem = this.f28557b.a(migrationOpt, false, false);
            if (migrationItem != null) {
                if (migrationItem.c()) {
                    i3 = 3;
                } else if (migrationItem.d()) {
                    i3 = 4;
                } else if (migrationItem.e()) {
                    i3 = 7;
                }
                i2 = migrationItem.f28633f | i3;
            }
        } catch (RemoteException e2) {
            a(e2);
        } catch (Throwable th) {
            MigrationItem.a.a(null);
            throw th;
        }
        MigrationItem.a.a(migrationItem);
        return i2;
    }

    /* JADX INFO: finally extract failed */
    private int b(String str, String str2) {
        MigrationOpt a2 = MigrationOpt.a.a();
        a2.f28638b = "trig-" + com.bytedance.disk.e.a.a.a(4);
        a2.f28639c = str;
        a2.f28640d = str2;
        a2.f28641e = 0;
        a2.f28642f = c.a(str);
        if (a2.f28642f == 0) {
            a2.f28642f = c.a(str2);
        }
        try {
            int a3 = this.f28557b.a(a2, 4);
            MigrationOpt.a.a(a2);
            return a3;
        } catch (RemoteException e2) {
            a(e2);
            MigrationOpt.a.a(a2);
            return -1;
        } catch (Throwable th) {
            MigrationOpt.a.a(a2);
            throw th;
        }
    }

    public final int a(String str, String str2) {
        MigrationOpt a2 = MigrationOpt.a.a();
        a2.f28638b = "check-".concat(String.valueOf(str));
        a2.f28639c = str;
        a2.f28640d = str2;
        int i2 = 0;
        a2.f28641e = 0;
        a2.f28642f = c.a(str);
        if (a2.f28642f == 0) {
            a2.f28642f = c.a(str2);
        }
        if (a2.f28642f == 0) {
            a2.f28642f = 1;
        }
        MigrationItem migrationItem = null;
        int i3 = -1;
        try {
            migrationItem = this.f28557b.a(a2, true, false);
            if (migrationItem != null) {
                if (migrationItem.c()) {
                    i2 = 3;
                } else if (migrationItem.d()) {
                    i2 = 4;
                } else if (migrationItem.e()) {
                    i2 = 7;
                }
                i3 = migrationItem.f28633f | i2;
            }
        } catch (RemoteException e2) {
            a(e2);
        } catch (Throwable th) {
            MigrationItem.a.a(null);
            throw th;
        }
        MigrationItem.a.a(migrationItem);
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[SYNTHETIC, Splitter:B:23:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(final com.bytedance.disk.parcel.MigrationItem r11, int r12) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.d.a.a(com.bytedance.disk.parcel.MigrationItem, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r15, int r16) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.d.a.a(java.lang.String, int):java.lang.String");
    }

    public a(Context context, int i2, int i3, com.bytedance.disk.e.c cVar) {
        MethodCollector.i(2041);
        com.bytedance.disk.e.b.a.a(context);
        this.f28558c = context;
        if (com.bytedance.disk.g.a.f28588a == null) {
            synchronized (com.bytedance.disk.g.a.class) {
                try {
                    if (com.bytedance.disk.g.a.f28588a == null) {
                        com.bytedance.disk.g.a.f28588a = new com.bytedance.disk.g.a(context, i2, i3, cVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2041);
                    throw th;
                }
            }
        }
        com.bytedance.disk.g.a aVar = com.bytedance.disk.g.a.f28588a;
        synchronized (aVar.f28591d) {
            try {
                ClientProxyConfig clientProxyConfig = new ClientProxyConfig();
                clientProxyConfig.f28625a = true;
                clientProxyConfig.f28627c = com.bytedance.disk.core.a.a();
                clientProxyConfig.f28626b = Process.myPid();
                aVar.f28591d.put(clientProxyConfig.f28626b, clientProxyConfig);
            } catch (Throwable th2) {
                MethodCollector.o(2041);
                throw th2;
            }
        }
        this.f28557b = aVar;
        MethodCollector.o(2041);
    }
}
