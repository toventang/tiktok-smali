package com.ss.android.ugc.aweme.bf;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lancet.d;
import h.f.b.l;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f68643a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final c f68644b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static File f68645c;

    private c() {
    }

    static {
        Covode.recordClassIndex(42249);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f68646a;

        static {
            Covode.recordClassIndex(42250);
        }

        public a(Context context) {
            this.f68646a = context;
        }

        public final void run() {
            MethodCollector.i(6200);
            boolean a2 = SettingsManager.a().a("keva_bak_sp", false);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(c.b(this.f68646a)));
                dataOutputStream.writeBoolean(a2);
                dataOutputStream.close();
                MethodCollector.o(6200);
            } catch (Throwable unused) {
                MethodCollector.o(6200);
            }
        }
    }

    public static File b(Context context) {
        File c2 = c(context);
        f68645c = new File(c2, "keva_bak_sp_record");
        if (c2.exists()) {
            c2.mkdir();
        }
        File file = f68645c;
        Objects.requireNonNull(file, "null cannot be cast to non-null type java.io.File");
        return file;
    }

    private static File c(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static boolean a(Context context) {
        MethodCollector.i(6361);
        l.d(context, "");
        boolean z = f68643a;
        if (!b(context).exists()) {
            MethodCollector.o(6361);
            return z;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(f68645c));
            z = dataInputStream.readBoolean();
            dataInputStream.close();
        } catch (Throwable unused) {
        }
        MethodCollector.o(6361);
        return z;
    }
}
