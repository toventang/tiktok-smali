package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.m;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h {

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f27825k = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f27826l = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f27827m = Pattern.compile("^Abort message: (.*)$");
    private static final Pattern n = Pattern.compile("^Crash message: (.*)$");
    private static final Pattern o = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a  reason: collision with root package name */
    public String f27828a;

    /* renamed from: b  reason: collision with root package name */
    public String f27829b;

    /* renamed from: c  reason: collision with root package name */
    public String f27830c;

    /* renamed from: d  reason: collision with root package name */
    public String f27831d;

    /* renamed from: e  reason: collision with root package name */
    public String f27832e;

    /* renamed from: f  reason: collision with root package name */
    public String f27833f;

    /* renamed from: g  reason: collision with root package name */
    public String f27834g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f27835h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f27836i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    private final Set<String> f27837j = new HashSet();

    public final String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.f27832e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f27833f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f27834g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    static {
        Covode.recordClassIndex(16298);
    }

    private void b() {
        for (String str : this.f27837j) {
            if (!this.f27836i.containsKey(str)) {
                Map<String, String> map = this.f27836i;
                NativeTools.a();
                map.put(str, NativeTools.g(str));
                v.a("getBuildId nextStart: " + str + " : " + this.f27836i.get(str));
            }
        }
    }

    public final void a(File file) {
        b(r.a(file));
    }

    public h(File file) {
        b(r.a(file));
    }

    public static String a(String str) {
        int lastIndexOf;
        String[] split = str.split("\\s+");
        if (split.length < 4) {
            return null;
        }
        String str2 = split[3];
        if (!str2.endsWith(".so") || str2.contains("/system/lib") || (lastIndexOf = str2.lastIndexOf(47)) == -1) {
            return null;
        }
        return str2.substring(lastIndexOf + 1);
    }

    /* access modifiers changed from: package-private */
    public final void b(File file) {
        Throwable th;
        MethodCollector.i(9625);
        if (!file.exists() || file.length() == 0) {
            MethodCollector.o(9625);
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i2 = 0;
            int i3 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null || i3 >= 64) {
                        break;
                    }
                    if (this.f27828a == null && readLine.startsWith("pid: ")) {
                        Matcher matcher = f27825k.matcher(readLine);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f27828a = matcher.group(1);
                            this.f27829b = matcher.group(2);
                            this.f27831d = matcher.group(3);
                            this.f27830c = matcher.group(4);
                        }
                    } else if (this.f27832e == null && readLine.startsWith("signal ")) {
                        Matcher matcher2 = f27826l.matcher(readLine);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String replace = matcher2.group(1).replace(" ", "");
                            String replace2 = matcher2.group(2).replace(" ", "");
                            int indexOf = replace2.indexOf("frompid");
                            if (indexOf > 0) {
                                replace2 = replace2.substring(0, indexOf) + ")";
                            }
                            this.f27832e = "Signal " + replace + ", Code " + replace2 + "\n";
                        }
                    } else if (this.f27833f == null && readLine.startsWith("Abort ")) {
                        Matcher matcher3 = f27827m.matcher(readLine);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            this.f27833f = "abort message: " + matcher3.group(1) + "\n";
                        }
                    } else if (this.f27833f == null && readLine.startsWith("Crash ")) {
                        Matcher matcher4 = n.matcher(readLine);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            this.f27833f = "crash message: " + matcher4.group(1) + "\n";
                        }
                    } else if (this.f27834g == null && readLine.startsWith("backtrace:")) {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 == null || !readLine2.startsWith("    #")) {
                                i3++;
                                this.f27834g = sb.toString();
                            } else {
                                String substring = readLine2.substring(4);
                                sb.append(substring).append('\n');
                                String a2 = a(substring);
                                if (a2 != null) {
                                    this.f27837j.add(a2);
                                }
                            }
                        }
                        i3++;
                        this.f27834g = sb.toString();
                    } else if (this.f27836i.isEmpty() && readLine.startsWith("build id:")) {
                        while (true) {
                            String readLine3 = bufferedReader2.readLine();
                            if (readLine3 == null) {
                                break;
                            } else if (!readLine3.contains("BuildId:")) {
                                while (true) {
                                    if (!readLine3.startsWith("stack:")) {
                                        readLine3 = bufferedReader2.readLine();
                                        i2++;
                                        if (i2 < 10) {
                                            if (readLine3 == null) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        this.f27835h = true;
                                        break;
                                    }
                                }
                            } else {
                                Matcher matcher5 = o.matcher(readLine3);
                                if (matcher5.find()) {
                                    this.f27836i.put(matcher5.group(2), matcher5.group(3));
                                }
                            }
                        }
                        v.a("check complete end buildIds");
                    }
                    i3++;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        d.a("NPTH_CATCH", th);
                        m.a(bufferedReader);
                        MethodCollector.o(9625);
                    } catch (Throwable th3) {
                        m.a(bufferedReader);
                        MethodCollector.o(9625);
                        throw th3;
                    }
                }
            }
            v.a("check complete end");
            b();
            m.a(bufferedReader2);
        } catch (Throwable th4) {
            th = th4;
            d.a("NPTH_CATCH", th);
            m.a(bufferedReader);
            MethodCollector.o(9625);
        }
        MethodCollector.o(9625);
    }
}
