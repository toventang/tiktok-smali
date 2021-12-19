package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f27763g = Pattern.compile("(?<===).*?(?===ERROR)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f27764h = Pattern.compile("(?<=AddressSanitizer:).*?(?=on)");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f27765i = Pattern.compile("(?<=asan/).*?(?=/asan_report)");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f27766j = Pattern.compile("__asan_handle_no_return");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f27767k = Pattern.compile("(?<=\\().*?(?=\\+)");

    /* renamed from: a  reason: collision with root package name */
    public String f27768a;

    /* renamed from: b  reason: collision with root package name */
    public String f27769b;

    /* renamed from: c  reason: collision with root package name */
    public String f27770c;

    /* renamed from: d  reason: collision with root package name */
    public long f27771d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f27772e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f27773f = true;

    static {
        Covode.recordClassIndex(16272);
    }

    public a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(11967);
        File file = new File(str);
        if (!file.exists() || file.length() == 0) {
            MethodCollector.o(11967);
            return;
        }
        this.f27771d = new Date(file.lastModified()).getTime();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (readLine.startsWith("    #")) {
                        Matcher matcher = f27767k.matcher(readLine);
                        if (matcher.find() && matcher.group(0) != null) {
                            String str2 = matcher.group(0) + "\n";
                            if (str2.startsWith("/data/")) {
                                String name = new File(str2.trim()).getName();
                                NativeTools.a();
                                String g2 = NativeTools.g(name);
                                if (g2 != null) {
                                    this.f27772e.put(name, g2);
                                } else {
                                    NativeTools.a();
                                    String g3 = NativeTools.g(str2);
                                    if (g3 != null) {
                                        this.f27772e.put(name, g3);
                                    }
                                }
                            }
                        }
                    }
                    sb.append(readLine + "\n");
                }
                this.f27770c = sb.toString();
            } catch (Throwable th2) {
                th = th2;
                try {
                    d.a("NPTH_CATCH", th);
                    m.a(bufferedReader);
                    MethodCollector.o(11967);
                } catch (Throwable th3) {
                    m.a(bufferedReader);
                    MethodCollector.o(11967);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            d.a("NPTH_CATCH", th);
            m.a(bufferedReader);
            MethodCollector.o(11967);
        }
        m.a(bufferedReader);
        MethodCollector.o(11967);
    }
}
