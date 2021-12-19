package com.ss.android.socialbase.downloader.k;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.d.a;
import com.ss.android.socialbase.downloader.d.b;
import com.ss.android.socialbase.downloader.depend.ae;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60748a = g.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static volatile SparseArray<Boolean> f60749b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public static volatile SparseArray<List<ae>> f60750c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f60751d = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: e  reason: collision with root package name */
    private static String f60752e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final char[] f60753f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g  reason: collision with root package name */
    private static Pattern f60754g = null;

    /* renamed from: h  reason: collision with root package name */
    private static Pattern f60755h = null;

    /* renamed from: i  reason: collision with root package name */
    private static ConnectivityManager f60756i;

    /* renamed from: j  reason: collision with root package name */
    private static Boolean f60757j;

    /* renamed from: k  reason: collision with root package name */
    private static Boolean f60758k;

    public static boolean a(int i2) {
        return i2 == 0 || i2 == 2;
    }

    public static boolean a(long j2) {
        return j2 == -1;
    }

    private static String a(byte[] bArr, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = bArr[i5 + 0] & 255;
                int i7 = i4 + 1;
                char[] cArr2 = f60753f;
                cArr[i4] = cArr2[i6 >> 4];
                i4 = i7 + 1;
                cArr[i7] = cArr2[i6 & 15];
            }
            return new String(cArr, 0, i3);
        }
        throw new IndexOutOfBoundsException();
    }

    public static List<DownloadChunk> a(List<DownloadChunk> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.b()) {
                    sparseArray.put(downloadChunk.f60824e, downloadChunk);
                    List<DownloadChunk> list2 = (List) sparseArray2.get(downloadChunk.f60824e);
                    if (list2 != null) {
                        for (DownloadChunk downloadChunk2 : list2) {
                            downloadChunk2.a(downloadChunk);
                        }
                        downloadChunk.f60826g = list2;
                    }
                } else {
                    DownloadChunk downloadChunk3 = (DownloadChunk) sparseArray.get(downloadChunk.a());
                    if (downloadChunk3 != null) {
                        List list3 = downloadChunk3.f60826g;
                        if (list3 == null) {
                            list3 = new ArrayList();
                            downloadChunk3.f60826g = list3;
                        }
                        downloadChunk.a(downloadChunk3);
                        list3.add(downloadChunk);
                    } else {
                        List list4 = (List) sparseArray2.get(downloadChunk.a());
                        if (list4 == null) {
                            list4 = new ArrayList();
                            sparseArray2.put(downloadChunk.a(), list4);
                        }
                        list4.add(downloadChunk);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i2)));
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new a(str, str2).e();
    }

    public static void a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (downloadInfo.isForce() && !e(downloadInfo.getSavePath())) {
                z = false;
            } else if (z) {
                try {
                    b(downloadInfo.getSavePath(), downloadInfo.getName());
                } catch (Throwable unused) {
                    return;
                }
            }
            b(downloadInfo.getTempPath(), downloadInfo.getTempName());
            if (downloadInfo.isSavePathRedirected()) {
                a(downloadInfo);
            }
            if (z) {
                String c2 = c(downloadInfo.getUrl());
                if (!TextUtils.isEmpty(c2) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && downloadInfo.getSavePath().contains(c2)) {
                    h(downloadInfo.getSavePath());
                }
            }
        }
    }

    public static void a(DownloadInfo downloadInfo) {
        com.ss.android.socialbase.downloader.i.a a2;
        JSONObject a3;
        if (downloadInfo != null && (a3 = (a2 = com.ss.android.socialbase.downloader.i.a.a(downloadInfo.getId(), (DownloadInfo) null)).a("download_dir")) != null) {
            String optString = a3.optString("ins_desc");
            if (!TextUtils.isEmpty(optString)) {
                b(downloadInfo.getSavePath(), optString);
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = downloadInfo.getName();
            }
            String a4 = a(title, a2);
            String savePath = downloadInfo.getSavePath();
            if (!TextUtils.isEmpty(a4) && !TextUtils.isEmpty(savePath)) {
                File file = new File(a4);
                File file2 = new File(savePath);
                while (file2.isDirectory() && TextUtils.equals(file.getName(), file2.getName())) {
                    h(file2.getPath());
                    file = file.getParentFile();
                    file2 = file2.getParentFile();
                    if (file == null) {
                        return;
                    }
                    if (file2 == null) {
                        return;
                    }
                }
            }
        }
    }

    public static void b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            a aVar = new a(str, str2, false, true);
            if (aVar.b()) {
                aVar.d();
            }
        }
    }

    public static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    public static boolean a(DownloadInfo downloadInfo, boolean z, String str) {
        if (!z && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            try {
                a aVar = new a(downloadInfo.getSavePath(), downloadInfo.getName());
                if (b.a(aVar) && a(downloadInfo, aVar) && a(a(aVar, str))) {
                    return true;
                }
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean c(DownloadInfo downloadInfo) {
        boolean z = false;
        if (downloadInfo.isDeleteCacheIfCheckFailed() || !TextUtils.isEmpty(downloadInfo.getLastModified())) {
            com.ss.android.socialbase.downloader.e.a.b(f60748a, "dcache::curt=" + System.currentTimeMillis() + " expired=" + downloadInfo.getCacheExpiredTime());
            if (System.currentTimeMillis() > downloadInfo.getCacheExpiredTime()) {
                z = true;
            }
        } else {
            com.ss.android.socialbase.downloader.e.a.b(f60748a, "dcache::last modify is emtpy, so just return cache");
        }
        com.ss.android.socialbase.downloader.e.a.b(f60748a, "cacheExpired::dcache::name=" + downloadInfo.getName() + " expired=" + z);
        return z;
    }

    public static boolean a(DownloadInfo downloadInfo, a aVar) {
        return downloadInfo.getTotalBytes() <= 0 || aVar.a() >= downloadInfo.getTotalBytes();
    }

    public static void a(int i2, boolean z, BaseException baseException) {
        MethodCollector.i(13231);
        synchronized (f60749b) {
            try {
                List<ae> list = f60750c.get(i2);
                if (list != null) {
                    for (ae aeVar : list) {
                        if (aeVar != null) {
                            if (z) {
                                aeVar.a();
                            } else {
                                aeVar.a(baseException);
                            }
                        }
                    }
                }
                com.ss.android.socialbase.downloader.e.a.b(f60748a, "handleTempSaveCallback id:".concat(String.valueOf(i2)));
                f60749b.remove(i2);
            } finally {
                MethodCollector.o(13231);
            }
        }
    }

    public static void a(DownloadInfo downloadInfo, String str, String str2) {
        if (downloadInfo != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !str2.equals(downloadInfo.getName())) {
            a aVar = new a(downloadInfo.getSavePath(), str2);
            a aVar2 = new a(downloadInfo.getSavePath(), downloadInfo.getName());
            aVar.e();
            aVar2.e();
            if (aVar2.b() && !aVar2.f()) {
                throw new BaseException(1001, "targetPath file exists but read-only");
            } else if (!b(aVar, aVar2)) {
                throw new BaseException(1001, com.a.a("Can't copy the exist file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getSavePath(), str2, downloadInfo.getSavePath(), downloadInfo.getName()}));
            }
        }
    }

    private static boolean b(a aVar, a aVar2) {
        if (!(aVar == null || aVar2 == null)) {
            try {
                if (aVar.b() && !aVar.c()) {
                    if (!aVar.l().equals(aVar2.l())) {
                        File k2 = aVar2.k();
                        if (k2 == null || k2.mkdirs() || k2.isDirectory()) {
                            aVar.e();
                            aVar2.e();
                            if (!aVar2.b() || aVar2.f()) {
                                c(aVar, aVar2);
                                return true;
                            }
                            throw new IOException("Destination '" + aVar2 + "' exists but is read-only");
                        }
                        throw new BaseException(1053, "Destination '" + k2 + "' directory cannot be created");
                    }
                }
            } catch (BaseException e2) {
                throw e2;
            } catch (Throwable th) {
                a(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    public static boolean a(a aVar, a aVar2) {
        aVar.e();
        aVar2.e();
        boolean a2 = aVar.a(aVar2);
        if (!a2) {
            a2 = b(aVar, aVar2);
            try {
                aVar.e();
                aVar2.e();
                aVar.d();
            } catch (Throwable unused) {
            }
        }
        return a2;
    }

    public static List<HttpHeader> a(List<HttpHeader> list, String str, long j2, long j3) {
        String a2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        if (j3 <= 0) {
            a2 = com.a.a("bytes=%s-", new Object[]{String.valueOf(j2)});
        } else {
            a2 = com.a.a("bytes=%s-%s", new Object[]{String.valueOf(j2), String.valueOf(j3)});
        }
        arrayList.add(new HttpHeader("Range", a2));
        com.ss.android.socialbase.downloader.e.a.b(f60748a, " range CurrentOffset:" + j2 + " EndOffset:" + j3 + ", range = " + a2);
        return arrayList;
    }

    public static boolean a(int i2, String str, String str2) {
        return i2 == -3 && !d(str, str2);
    }

    public static boolean a(Context context) {
        NetworkInfo a2;
        try {
            ConnectivityManager d2 = d(context);
            if (!(d2 == null || (a2 = a(d2)) == null)) {
                if (a2.isAvailable()) {
                    if (1 == a2.getType()) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean b(Context context) {
        NetworkInfo a2;
        try {
            ConnectivityManager d2 = d(context);
            if (d2 == null || (a2 = a(d2)) == null) {
                return false;
            }
            return a2.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        Boolean bool = f60757j;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (com.ss.android.socialbase.downloader.i.a.f60573a.a("force_independent_process", 0) > 0) {
            Boolean bool2 = false;
            f60757j = bool2;
            return bool2.booleanValue();
        } else if (c.B() == null) {
            return true;
        } else {
            String c2 = c(c.B());
            if (c2 != null && !c2.contains(":") && c2.equals(c.B().getPackageName())) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f60757j = valueOf;
            return valueOf.booleanValue();
        }
    }

    public static boolean b() {
        return !c() && c.c() && l.a(true).h();
    }

    public static boolean c() {
        Boolean bool = f60758k;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (c.B() == null) {
            return false;
        }
        String c2 = c(c.B());
        if (c2 == null || !c2.equals(c.B().getPackageName() + ":downloader")) {
            f60758k = false;
        } else {
            f60758k = true;
        }
        return f60758k.booleanValue();
    }

    public static boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        c.A();
        String e2 = e(th);
        if (TextUtils.isEmpty(e2) || !e2.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    public static boolean b(Throwable th) {
        if (th == null) {
            return false;
        }
        c.A();
        String e2 = e(th);
        if (TextUtils.isEmpty(e2) || !e2.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    public static boolean a(BaseException baseException) {
        return baseException.getErrorCode() == 1051;
    }

    public static boolean b(BaseException baseException) {
        if (!(baseException instanceof DownloadHttpException)) {
            return false;
        }
        DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
        return downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416;
    }

    public static void a(Throwable th, String str) {
        String str2 = !TextUtils.isEmpty(str) ? str : "";
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            baseException.setErrorMsg(str2 + "-" + baseException.getErrorMessage());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, b(th, str2));
        } else if (f(th)) {
            throw new BaseException(1048, b(th, str2));
        } else if (a(th)) {
            throw new DownloadHttpException(1004, 412, b(th, str2));
        } else if (b(th)) {
            throw new DownloadHttpException(1004, 416, b(th, str2));
        } else if (g(th)) {
            throw new BaseException(1047, b(th, str2));
        } else if (h(th)) {
            throw new BaseException(1049, b(th, str2));
        } else if (i(th)) {
            throw new BaseException(1041, b(th, str2));
        } else if (th instanceof IOException) {
            j(th);
            a((IOException) th, str);
        } else {
            throw new BaseException(1000, b(th, str2));
        }
    }

    private static void a(IOException iOException, String str) {
        if (str == null) {
            str = "";
        }
        String b2 = b(iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException(1041, b2);
        } else if (iOException instanceof UnknownHostException) {
            throw new BaseException(1055, b2);
        } else if (iOException instanceof NoRouteToHostException) {
            throw new BaseException(1056, b2);
        } else if (iOException instanceof UnknownServiceException) {
            throw new BaseException(1057, b2);
        } else if (iOException instanceof PortUnreachableException) {
            throw new BaseException(1058, b2);
        } else if (iOException instanceof SocketTimeoutException) {
            throw new BaseException(1048, b2);
        } else if (iOException instanceof SocketException) {
            throw new BaseException(1059, b2);
        } else if (iOException instanceof HttpRetryException) {
            throw new BaseException(1060, b2);
        } else if (iOException instanceof ProtocolException) {
            throw new BaseException(1061, b2);
        } else if (iOException instanceof MalformedURLException) {
            throw new BaseException(1062, b2);
        } else if (iOException instanceof FileNotFoundException) {
            throw new BaseException(1063, b2);
        } else if (iOException instanceof InterruptedIOException) {
            throw new BaseException(1064, b2);
        } else if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException(1065, b2);
        } else if (iOException instanceof EOFException) {
            throw new BaseException(1066, b2);
        } else if (iOException instanceof StreamResetException) {
            throw new BaseException(1067, b2);
        } else if (iOException instanceof SSLException) {
            throw new BaseException(1011, b2);
        } else if (c(iOException)) {
            throw new BaseException(1006, b2);
        } else {
            throw new BaseException(1023, b2);
        }
    }

    public static boolean c(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                String message = baseException.getMessage();
                return !TextUtils.isEmpty(message) && message.contains("ENOSPC");
            }
        } else if (th instanceof IOException) {
            String e2 = e(th);
            return !TextUtils.isEmpty(e2) && e2.contains("ENOSPC");
        }
    }

    public static <K> HashMap<Integer, K> a(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i2));
        }
        return hashMap;
    }

    public static <K> void a(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (!(map == null || sparseArray == null)) {
            for (Integer num : map.keySet()) {
                if (num != null) {
                    sparseArray.put(num.intValue(), map.get(num));
                }
            }
        }
    }

    public static boolean a(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static String a(String str, com.ss.android.socialbase.downloader.i.a aVar) {
        JSONObject a2;
        if (aVar == null || (a2 = aVar.a("download_dir")) == null) {
            return "";
        }
        String optString = a2.optString("dir_name");
        if (!TextUtils.isEmpty(optString) && optString.startsWith("/")) {
            optString = optString.substring(1);
        }
        if (TextUtils.isEmpty(optString)) {
            return optString;
        }
        if (!optString.contains("%s")) {
            optString = optString + str;
        } else {
            try {
                optString = com.a.a(optString, new Object[]{str});
            } catch (Throwable unused) {
            }
        }
        return optString.length() > 255 ? optString.substring(optString.length() - 255) : optString;
    }

    private static boolean b(File file) {
        if (file == null) {
            return false;
        }
        try {
            if ((file.exists() || file.mkdirs()) && file.isDirectory()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
        if (throttleNetSpeed > 0) {
            list.add(new HttpHeader("extra_throttle_net_speed", String.valueOf(throttleNetSpeed)));
        }
    }

    public static void b(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long ttnetProtectTimeout = downloadInfo.getTtnetProtectTimeout();
        if (ttnetProtectTimeout > 300) {
            list.add(new HttpHeader("extra_ttnet_protect_timeout", String.valueOf(ttnetProtectTimeout)));
        }
    }

    public static void c(List<HttpHeader> list, DownloadInfo downloadInfo) {
        if (downloadInfo.isAddTTNetCommonParam()) {
            list.add(new HttpHeader("extra_ttnet_common_param", "true"));
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(11401);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11401);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11401);
        return delete;
    }

    public static boolean d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private static File f() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
            str = "";
        }
        if ("mounted".equals(str)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        return null;
    }

    static {
        Covode.recordClassIndex(37484);
    }

    private static String e() {
        BufferedReader bufferedReader;
        MethodCollector.i(13844);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                if (com.ss.android.socialbase.downloader.e.a.a()) {
                    com.ss.android.socialbase.downloader.e.a.b("Process", "get processName = " + sb.toString());
                }
                String sb2 = sb.toString();
                a(bufferedReader);
                MethodCollector.o(13844);
                return sb2;
            } catch (Throwable unused) {
                a(bufferedReader);
                MethodCollector.o(13844);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            a(bufferedReader);
            MethodCollector.o(13844);
            return null;
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean b(DownloadInfo downloadInfo) {
        return a(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5());
    }

    private static ConnectivityManager d(Context context) {
        ConnectivityManager connectivityManager = f60756i;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) c(context, "connectivity");
        f60756i = connectivityManager2;
        return connectivityManager2;
    }

    public static String e(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable unused) {
            return "throwable getMsg error";
        }
    }

    private static void j(Throwable th) {
        c.A();
        c.A();
        th.getCause();
    }

    public static long b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getAvailableBytes();
        } catch (IllegalArgumentException e2) {
            throw new BaseException(1050, e2);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    public static h c(int i2) {
        h hVar = h.MAIN;
        if (i2 == h.SUB.ordinal()) {
            return h.SUB;
        }
        if (i2 == h.NOTIFICATION.ordinal()) {
            return h.NOTIFICATION;
        }
        return hVar;
    }

    private static File e(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static boolean h(Throwable th) {
        if (th == null) {
            return false;
        }
        String e2 = e(th);
        if (TextUtils.isEmpty(e2) || !e2.contains("network not available")) {
            return false;
        }
        return true;
    }

    private static boolean i(Throwable th) {
        if (th == null) {
            return false;
        }
        String e2 = e(th);
        if (TextUtils.isEmpty(e2) || !e2.contains("Exception in connect")) {
            return false;
        }
        return true;
    }

    public static long b(List<DownloadChunk> list) {
        long j2 = 0;
        for (DownloadChunk downloadChunk : list) {
            j2 += downloadChunk.j();
        }
        return j2;
    }

    public static String c(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return a(digest, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(com.a.a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static boolean e(String str) {
        Context B;
        if (com.ss.android.socialbase.downloader.i.a.f60573a.a("save_path_security", 0) <= 0 || (B = c.B()) == null || TextUtils.isEmpty(str) || str.startsWith("/data") || str.contains("Android/data/" + B.getPackageName())) {
            return true;
        }
        return false;
    }

    public static long f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Matcher matcher = Pattern.compile("max-age=([0-9]+)").matcher(str);
        if (!matcher.find()) {
            return 0;
        }
        try {
            return Long.parseLong(matcher.group(1));
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static String g(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (f60754g == null) {
                f60754g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            Matcher matcher = f60754g.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            if (f60755h == null) {
                f60755h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
            }
            Matcher matcher2 = f60755h.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static boolean h(String str) {
        Thread.currentThread();
        if (b.a(str) == 1 && e(str) && !TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.isDirectory() || !a(file)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static long a(com.ss.android.socialbase.downloader.g.g gVar) {
        long j2 = -1;
        if (gVar == null) {
            return -1;
        }
        String b2 = b(gVar, "Content-Length");
        if (TextUtils.isEmpty(b2) && a.a(1)) {
            return b(gVar);
        }
        try {
            j2 = Long.parseLong(b2);
            return j2;
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    private static long b(com.ss.android.socialbase.downloader.g.g gVar) {
        if (gVar == null) {
            return -1;
        }
        String b2 = b(gVar, "Content-Range");
        if (TextUtils.isEmpty(b2)) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(b2);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e2) {
            com.ss.android.socialbase.downloader.e.a.d(f60748a, "parse content-length from content-range failed ".concat(String.valueOf(e2)));
        }
        return -1;
    }

    public static long c(List<DownloadChunk> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        long j2 = -1;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null && ((downloadChunk.i() <= downloadChunk.f60822c || downloadChunk.f60822c == 0) && (j2 == -1 || j2 > downloadChunk.i()))) {
                j2 = downloadChunk.i();
            }
        }
        return j2;
    }

    private static boolean f(Throwable th) {
        if (th == null) {
            return false;
        }
        String e2 = e(th);
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (TextUtils.isEmpty(e2) || (!e2.contains("time out") && !e2.contains("Time-out"))) {
            return false;
        }
        return true;
    }

    private static boolean g(Throwable th) {
        DownloadHttpException downloadHttpException;
        if (th == null) {
            return false;
        }
        String e2 = e(th);
        if ((th instanceof DownloadHttpException) && (((downloadHttpException = (DownloadHttpException) th) != null && downloadHttpException.getHttpStatusCode() == 403) || (!TextUtils.isEmpty(e2) && e2.contains("403")))) {
            return true;
        }
        if (TextUtils.isEmpty(e2) || !e2.contains("Forbidden")) {
            return false;
        }
        return true;
    }

    public static long a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                com.ss.android.socialbase.downloader.e.a.d(f60748a, "parse instance length failed with ".concat(String.valueOf(str)));
            }
        }
        return -1;
    }

    public static boolean d(Throwable th) {
        if (!(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    public static String b(int i2) {
        String str = "ttmd5 check code = " + i2 + ", ";
        if (i2 == 99) {
            return str + "unknown error";
        }
        switch (i2) {
            case 0:
                return str + "md5 match";
            case 1:
                return str + "md5 not match";
            case 2:
                return str + "md5 empty";
            case 3:
                return str + "ttmd5 version not support";
            case 4:
                return str + "ttmd5 tag parser error";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return str + "file not exist";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return str + "get file md5 error";
            default:
                return str;
        }
    }

    public static String c(Context context) {
        String str = f60752e;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) c(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (com.ss.android.socialbase.downloader.e.a.a()) {
                            com.ss.android.socialbase.downloader.e.a.b("Process", "processName = " + runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        f60752e = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String e3 = e();
        f60752e = e3;
        return e3;
    }

    public static String a(com.ss.android.socialbase.downloader.g.g gVar, String str) {
        String g2 = g(gVar.a("Content-Disposition"));
        if (TextUtils.isEmpty(g2)) {
            return c(str);
        }
        return g2;
    }

    public static int a(a aVar, String str) {
        if (aVar.n()) {
            return com.ss.android.k.c.a(str, aVar.g(), (com.ss.android.k.b) null);
        }
        try {
            return com.ss.android.k.c.a(str, aVar.g(), new b(aVar.i()));
        } catch (Throwable unused) {
            return 5;
        }
    }

    private static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new a(str, str2).b();
    }

    private static File b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (d.f107196d != null && d.f107197e) {
            return d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        d.f107196d = externalFilesDir;
        return externalFilesDir;
    }

    private static Object c(Context context, String str) {
        Object obj;
        MethodCollector.i(13793);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13793);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String a(File file, boolean z) {
        Context B = c.B();
        if (b(file)) {
            return file.getAbsolutePath();
        }
        int i2 = B.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29 || (i2 != 29 ? i2 <= 29 : Environment.isExternalStorageLegacy())) {
            if (z) {
                File f2 = f();
                if (b(f2)) {
                    return f2.getAbsolutePath();
                }
            }
            File b2 = b(B, Environment.DIRECTORY_DOWNLOADS);
            if (b(b2)) {
                return b2.getAbsolutePath();
            }
        } else {
            File b3 = b(B, Environment.DIRECTORY_DOWNLOADS);
            if (b(b3)) {
                return b3.getAbsolutePath();
            }
        }
        return e(B).getAbsolutePath();
    }

    public static String b(com.ss.android.socialbase.downloader.g.g gVar, String str) {
        if (gVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = gVar.a(str);
        if (!com.ss.android.socialbase.downloader.i.a.f60573a.a("fix_get_http_resp_head_ignore_case", true)) {
            return a2;
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = gVar.a(str.toLowerCase());
        }
        if (TextUtils.isEmpty(a2)) {
            return gVar.a(str.toUpperCase());
        }
        return a2;
    }

    public static String c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String c2 = c(str2);
        if (TextUtils.isEmpty(c2) || str.contains(c2)) {
            return str;
        }
        return new File(str, c2).getAbsolutePath();
    }

    public static String a(String str, int i2) {
        if (i2 == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str) || str.length() <= i2) {
            return str;
        }
        return str.substring(0, i2);
    }

    public static String b(Throwable th, String str) {
        if (str == null) {
            return e(th);
        }
        return str + "-" + e(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r11 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r5 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b5, code lost:
        if (r12 != null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bf, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c3, code lost:
        if (r7 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ca, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cd, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(com.ss.android.socialbase.downloader.d.a r15, com.ss.android.socialbase.downloader.d.a r16) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.k.g.c(com.ss.android.socialbase.downloader.d.a, com.ss.android.socialbase.downloader.d.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r8 != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.socialbase.downloader.model.c a(com.ss.android.socialbase.downloader.model.DownloadInfo r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.k.g.a(com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, int):com.ss.android.socialbase.downloader.model.c");
    }
}
