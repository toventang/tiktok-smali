package com.ss.android.ugc.gamora.editor.sticker.read;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public final class i {

    /* renamed from: a */
    public static final i f146924a = new i();

    /* renamed from: b */
    private static a f146925b;

    private i() {
    }

    static {
        Covode.recordClassIndex(96762);
    }

    private static a a() {
        if (f146925b == null) {
            try {
                f146925b = (a) SettingsManager.a().a("creative_read_text_sticker_config", a.class);
            } catch (Exception e2) {
                e.a("ReadTextHelper#getConfig: e: " + e2.getMessage());
            }
        }
        a aVar = f146925b;
        if (aVar == null) {
            return new a();
        }
        return aVar;
    }

    public static File b(String str) {
        MethodCollector.i(4466);
        l.d(str, "");
        try {
            String e2 = g.a().g().c().e("read_text_audio");
            if (!new File(e2).exists()) {
                new File(e2).mkdirs();
            }
            StringBuilder append = new StringBuilder().append(e2).append(File.separator);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
            l.b(instance, "");
            File file = new File(append.append(simpleDateFormat.format(instance.getTime()) + ".mp3").toString());
            new FileOutputStream(file).write(Base64.decode(str, 0));
            MethodCollector.o(4466);
            return file;
        } catch (Exception e3) {
            e.a("Base64 to File failed, Exception: " + e3.getMessage());
            MethodCollector.o(4466);
            return null;
        }
    }

    public static boolean a(String str, int i2) {
        if (str == null) {
            str = "";
        }
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt <= 127) {
                i4++;
            } else if (charAt <= 2047) {
                i4 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i4 += 4;
                i3++;
            } else {
                i4 += 3;
            }
            i3++;
        }
        if (i4 <= i2) {
            return true;
        }
        return false;
    }
}
