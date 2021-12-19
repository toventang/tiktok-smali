package com.ss.android.ugc.aweme.crossplatform.f;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.j;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f78848a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(48914);
    }

    private static Uri a(Context context, String str, String str2) {
        String str3;
        String str4;
        File file = new File(str);
        String str5 = Environment.DIRECTORY_DCIM;
        String str6 = "";
        l.b(str5, str6);
        if (p.e((CharSequence) str, (CharSequence) str5)) {
            String str7 = Environment.DIRECTORY_DCIM;
            l.b(str7, str6);
            int a2 = p.a((CharSequence) str, str7, 0, false, 6);
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str3 = str.substring(a2);
            l.b(str3, str6);
        } else if (!file.isAbsolute()) {
            str3 = Environment.DIRECTORY_DCIM + File.separator + str;
        } else {
            str3 = Environment.DIRECTORY_DCIM + File.separator + j.f30896b + File.separator + file.getName();
        }
        File file2 = new File(str3);
        String name = file2.getName();
        File parentFile = file2.getParentFile();
        if (parentFile == null || (str4 = parentFile.getPath()) == null) {
            str4 = str6;
        }
        if (str2 == null) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(p.j(str3));
            if (mimeTypeFromExtension != null) {
                str6 = mimeTypeFromExtension;
            }
        } else {
            str6 = str2;
        }
        try {
            if (p.b(str6, "image", false)) {
                return e.a(context, name, str2, str4);
            }
            if (p.b(str6, "video", false)) {
                return e.b(context, name, str2, str4);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean a(Context context, String str, String str2, String str3) {
        MethodCollector.i(11680);
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        Uri a2 = a(context, str2, str3);
        if (a2 == null) {
            MethodCollector.o(11680);
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(a2);
            if (openOutputStream == null) {
                MethodCollector.o(11680);
                return false;
            }
            try {
                fileInputStream = new FileInputStream(new File(str));
            } catch (Exception unused) {
                if (0 == 0) {
                    MethodCollector.o(11680);
                    return false;
                }
            }
            boolean a3 = cs.a(fileInputStream, openOutputStream);
            MethodCollector.o(11680);
            return a3;
        } catch (Exception unused2) {
        }
    }
}
