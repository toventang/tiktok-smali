package com.ss.android.ugc.aweme.shortvideo.i;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.tools.utils.h;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final String f128563a = n.class.getSimpleName();

    static {
        Covode.recordClassIndex(84300);
    }

    public static class a {
        static {
            Covode.recordClassIndex(84301);
        }

        public static String a(String str) {
            MethodCollector.i(10621);
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                FileInputStream f2 = h.f(str);
                if (f2 == null) {
                    MethodCollector.o(10621);
                    return null;
                }
                byte[] bArr = new byte[8192];
                int i2 = 0;
                while (true) {
                    try {
                        int read = f2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        i2 += read;
                        int i3 = i2 - 524288;
                        if (i3 >= 0) {
                            instance.update(bArr, 0, read - i3);
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e2) {
                        g.a().I().a((Throwable) e2);
                        try {
                            f2.close();
                        } catch (IOException unused) {
                        }
                        MethodCollector.o(10621);
                        return null;
                    } catch (Throwable th) {
                        try {
                            f2.close();
                        } catch (IOException unused2) {
                        }
                        MethodCollector.o(10621);
                        throw th;
                    }
                }
                String replace = com.a.a("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0');
                try {
                    f2.close();
                } catch (IOException unused3) {
                }
                MethodCollector.o(10621);
                return replace;
            } catch (NoSuchAlgorithmException unused4) {
                MethodCollector.o(10621);
                return null;
            }
        }
    }

    public static String a(Activity activity, ShortVideoContext shortVideoContext) {
        List<EmbaddedWindowInfo> list;
        String path = shortVideoContext.f124757b.f124713h.a().getPath();
        Integer valueOf = Integer.valueOf((int) shortVideoContext.f124757b.f124712g);
        Integer valueOf2 = Integer.valueOf(shortVideoContext.f124757b.f124708c);
        Integer valueOf3 = Integer.valueOf(shortVideoContext.f124757b.f124709d);
        if (shortVideoContext.f124757b.b()) {
            list = shortVideoContext.f124757b.o.f124731l;
        } else {
            list = null;
        }
        return a(path, valueOf, valueOf2, valueOf3, list);
    }

    private static String a(List<String> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, List<List<EmbaddedWindowInfo>> list5) {
        return a(true, false, list, list2, list3, list4, null, list5);
    }

    public static String a(String str, Integer num, Integer num2, Integer num3, List<EmbaddedWindowInfo> list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(num);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(num2);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add(num3);
        if (list != null) {
            arrayList = new ArrayList();
            arrayList.add(list);
        } else {
            arrayList = null;
        }
        return a(arrayList2, arrayList3, arrayList4, arrayList5, arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068 A[SYNTHETIC, Splitter:B:28:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(boolean r16, boolean r17, java.util.List<java.lang.String> r18, java.util.List<java.lang.Integer> r19, java.util.List<java.lang.Integer> r20, java.util.List<java.lang.Integer> r21, java.util.List<java.lang.String> r22, java.util.List<java.util.List<com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo>> r23) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.i.n.a(boolean, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):java.lang.String");
    }
}
