package com.google.android.play.core.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.d.d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    final d f53175a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53176b;

    /* renamed from: c  reason: collision with root package name */
    private final r f53177c;

    static {
        Covode.recordClassIndex(32855);
    }

    public p(Context context, d dVar, r rVar) {
        this.f53175a = dVar;
        this.f53177c = rVar;
        this.f53176b = context;
    }

    private static X509Certificate a(Signature signature) {
        MethodCollector.i(9435);
        try {
            X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
            MethodCollector.o(9435);
            return x509Certificate;
        } catch (CertificateException unused) {
            MethodCollector.o(9435);
            return null;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean a() {
        MethodCollector.i(9433);
        try {
            File b2 = this.f53175a.b();
            try {
                Signature[] signatureArr = this.f53176b.getPackageManager().getPackageInfo(this.f53176b.getPackageName(), 64).signatures;
                if (signatureArr != null) {
                    ArrayList<X509Certificate> arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        X509Certificate a2 = a(signature);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        File[] listFiles = b2.listFiles();
                        Arrays.sort(listFiles);
                        int length = listFiles.length;
                        loop1:
                        while (true) {
                            length--;
                            if (length >= 0) {
                                File file = listFiles[length];
                                try {
                                    String absolutePath = file.getAbsolutePath();
                                    try {
                                        X509Certificate[][] a3 = bq.a(absolutePath);
                                        if (a3 == null || a3.length == 0 || a3[0].length == 0) {
                                            String.valueOf(absolutePath).length();
                                        } else if (arrayList.isEmpty()) {
                                            break;
                                        } else {
                                            for (X509Certificate x509Certificate : arrayList) {
                                                int length2 = a3.length;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= length2) {
                                                        break loop1;
                                                    } else if (!a3[i2][0].equals(x509Certificate)) {
                                                        i2++;
                                                    }
                                                }
                                            }
                                            try {
                                                file.renameTo(d.a(this.f53175a.c(), file.getName()));
                                            } catch (IOException unused) {
                                                MethodCollector.o(9433);
                                                return false;
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        String.valueOf(absolutePath).length();
                                    }
                                } catch (Exception unused3) {
                                    MethodCollector.o(9433);
                                    return false;
                                }
                            } else {
                                MethodCollector.o(9433);
                                return true;
                            }
                        }
                        MethodCollector.o(9433);
                        return false;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused4) {
            }
            MethodCollector.o(9433);
            return false;
        } catch (IOException unused5) {
            MethodCollector.o(9433);
            return false;
        }
    }
}
