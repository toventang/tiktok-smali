package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static HashMap<String, a> sCache = new HashMap<>();
    public Object mLazyProviderInfo;
    private a mStrategy;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(703);
        }

        Uri a(File file);

        File a(Uri uri);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo(this, context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete(this, uri, str, strArr);
    }

    public String getType(Uri uri) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType(this, uri);
    }

    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile(this, uri, str);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query(this, uri, strArr, str, strArr2, str2);
    }

    static {
        Covode.recordClassIndex(702);
    }

    /* access modifiers changed from: package-private */
    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final HashMap<String, File> f2267a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private final String f2268b;

        static {
            Covode.recordClassIndex(704);
        }

        b(String str) {
            this.f2268b = str;
        }

        @Override // androidx.core.content.FileProvider.a
        public final File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2267a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
            }
        }

        @Override // androidx.core.content.FileProvider.a
        public final Uri a(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f2267a.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.f2268b).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
            }
        }
    }

    public static File androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    public static File androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public String FileProvider__getType$___twin___(Uri uri) {
        String mimeTypeFromExtension;
        File a2 = this.mStrategy.a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public static boolean androidx_core_content_FileProvider_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
    }

    private static Object[] copyOf(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    private static String[] copyOf(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    public ParcelFileDescriptor FileProvider__openFile$___twin___(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.mStrategy.a(uri), modeToMode(str));
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static String androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType(FileProvider fileProvider, Uri uri) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__getType$___twin___(uri);
    }

    private static a getPathStrategy(Context context, String str) {
        a aVar;
        synchronized (sCache) {
            aVar = sCache.get(str);
            if (aVar == null) {
                try {
                    aVar = parsePathStrategy(context, str);
                    sCache.put(str, aVar);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return aVar;
    }

    public void FileProvider__attachInfo$___twin___(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.mStrategy = getPathStrategy(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    private static a parsePathStrategy(Context context, String str) {
        File file;
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, StringSet.name);
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = DEVICE_ROOT;
                        } else if ("files-path".equals(name)) {
                            file = androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
                        } else if ("cache-path".equals(name)) {
                            file = androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(context);
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            int i2 = Build.VERSION.SDK_INT;
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            } else {
                                continue;
                            }
                        } else if ("external-cache-path".equals(name)) {
                            int i3 = Build.VERSION.SDK_INT;
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            } else {
                                continue;
                            }
                        } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            } else {
                                continue;
                            }
                        }
                        if (file != null) {
                            File buildPath = buildPath(file, attributeValue2);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    bVar.f2267a.put(attributeValue, buildPath.getCanonicalFile());
                                } catch (IOException e2) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(buildPath)), e2);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
        }
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return getPathStrategy(context, str).a(file);
    }

    public int FileProvider__delete$___twin___(Uri uri, String str, String[] strArr) {
        if (androidx_core_content_FileProvider_com_ss_android_ugc_aweme_storage_FileLancet_delete(this.mStrategy.a(uri))) {
            return 1;
        }
        return 0;
    }

    public static void androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo(FileProvider fileProvider, Context context, ProviderInfo providerInfo) {
        if (fileProvider == null || !(fileProvider instanceof FileProvider)) {
            fileProvider.FileProvider__attachInfo$___twin___(context, providerInfo);
        } else if (fileProvider.getContext() != null) {
            fileProvider.FileProvider__attachInfo$___twin___(context, providerInfo);
        } else if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            fileProvider.mLazyProviderInfo = providerInfo;
            providerInfo.grantUriPermissions = false;
            try {
                fileProvider.FileProvider__attachInfo$___twin___(context, providerInfo);
            } catch (SecurityException unused) {
            }
            providerInfo.grantUriPermissions = true;
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public static ParcelFileDescriptor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile(FileProvider fileProvider, Uri uri, String str) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__openFile$___twin___(uri, str);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public static int androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__delete$___twin___(uri, str, strArr);
    }

    public Cursor FileProvider__query$___twin___(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File a2 = this.mStrategy.a(uri);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = a2.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(a2.length());
            }
            i3 = i2;
        }
        String[] copyOf = copyOf(strArr3, i3);
        Object[] copyOf2 = copyOf(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    public static Cursor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (fileProvider != null && (fileProvider instanceof FileProvider)) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.FileProvider__query$___twin___(uri, strArr, str, strArr2, str2);
    }
}
