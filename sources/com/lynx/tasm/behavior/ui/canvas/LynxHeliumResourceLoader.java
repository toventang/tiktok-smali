package com.lynx.tasm.behavior.ui.canvas;

import android.content.ContextWrapper;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.he.lynx.loader.Loader;
import com.he.lynx.loader.Resolver;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.canvas.LynxHelium;
import com.lynx.tasm.behavior.ui.image.a;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.b;
import com.lynx.tasm.provider.d;
import com.lynx.tasm.provider.e;
import com.lynx.tasm.provider.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LynxHeliumResourceLoader implements Loader {
    private ContextWrapper mContext;
    private LynxHelium.PermissionHandler mPermissionHandler;

    static {
        Covode.recordClassIndex(35087);
    }

    public static int com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // com.he.lynx.loader.Loader
    public byte[] loadSync(String str) {
        return realLoad(str, null);
    }

    public static byte[] mergeArray(byte[]... bArr) {
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            i2 += bArr2.length;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            int length = bArr[i4].length;
            if (length != 0) {
                System.arraycopy(bArr[i4], 0, bArr3, i3, length);
                i3 += length;
            }
        }
        return bArr3;
    }

    @Override // com.he.lynx.loader.Loader
    public Uri loadMedia(String str) {
        String redirectUrl = redirectUrl(str);
        com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_d("HeliumResLoader", "loadMedia ".concat(String.valueOf(redirectUrl)));
        if (redirectUrl.startsWith("http://") || redirectUrl.startsWith("https://")) {
            return Uri.parse(redirectUrl);
        }
        if (redirectUrl.startsWith("file://")) {
            if (!redirectUrl.startsWith("file:///")) {
                redirectUrl = "file:///" + redirectUrl.substring(7);
            }
            LynxHelium.PermissionHandler permissionHandler = this.mPermissionHandler;
            if (permissionHandler != null) {
                String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
                if (!permissionHandler.verifyHasPermission(strArr)) {
                    this.mPermissionHandler.requestPermissions(strArr, new LynxHelium.OnPermissionListener() {
                        /* class com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(35091);
                        }

                        @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionDenied() {
                        }

                        @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.OnPermissionListener
                        public void onPermissionGranted() {
                        }
                    });
                }
            }
            return Uri.parse(redirectUrl);
        }
        com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_e("HeliumResLoader", "loadMedia do not support:".concat(String.valueOf(redirectUrl)));
        return Uri.parse(redirectUrl);
    }

    private String redirectUrl(String str) {
        MethodCollector.i(3821);
        String str2 = null;
        if (str == null) {
            MethodCollector.o(3821);
            return null;
        }
        com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_d("HeliumResLoader", "redirectUrl ".concat(String.valueOf(str)));
        int indexOf = str.indexOf("?_lynxId=");
        if (indexOf > 0) {
            str2 = str.substring(str.lastIndexOf("?_lynxId=") + 9);
            str = str.substring(0, indexOf);
        }
        if (str2 != null) {
            try {
                JSProxy nativeGetProxyById = JSProxy.nativeGetProxyById(Long.parseLong(str2));
                if (nativeGetProxyById == null) {
                    MethodCollector.o(3821);
                    return str;
                }
                j jVar = nativeGetProxyById.f56540c.get();
                if (jVar == null) {
                    MethodCollector.o(3821);
                    return str;
                }
                String a2 = a.a(jVar, str);
                LLog.a(3, "redirectUrl", "result:".concat(String.valueOf(a2)));
                MethodCollector.o(3821);
                return a2;
            } catch (Exception e2) {
                com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_d("redirectUrl", "exception:" + e2.toString());
            }
        }
        com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader_com_ss_android_ugc_aweme_lancet_LogLancet_d("HeliumResLoader", "redirectUrl to".concat(String.valueOf(str)));
        MethodCollector.o(3821);
        return str;
    }

    public LynxHeliumResourceLoader(ContextWrapper contextWrapper, LynxHelium.PermissionHandler permissionHandler) {
        this.mContext = contextWrapper;
        this.mPermissionHandler = permissionHandler;
    }

    @Override // com.he.lynx.loader.Loader
    public void load(final String str, final Resolver resolver) {
        new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35088);
            }

            public void run() {
                LynxHeliumResourceLoader.this.realLoad(str, resolver);
            }
        }).start();
    }

    @Override // com.he.lynx.loader.Loader
    public void loadUrl(final String str, final Resolver resolver) {
        new Thread(new Runnable() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35089);
            }

            public void run() {
                LynxHeliumResourceLoader.this.realLoad(str, resolver);
            }
        }).start();
    }

    private void requestResource(String str, final Resolver resolver) {
        b.a().a(new e(str), new d() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader.AnonymousClass5 */

            static {
                Covode.recordClassIndex(35092);
            }

            public static int com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader$5_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                return 0;
            }

            @Override // com.lynx.tasm.provider.d
            public void onFailed(f fVar) {
                String str = fVar.f56818b;
                com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader$5_com_ss_android_ugc_aweme_lancet_LogLancet_e("HeliumResLoader", "requestResource error ".concat(String.valueOf(str)));
                resolver.reject(new IOException(str));
            }

            @Override // com.lynx.tasm.provider.d
            public void onSuccess(f fVar) {
                try {
                    LynxHeliumResourceLoader.this.loadFromStream(fVar.f56820d, resolver);
                } catch (Exception e2) {
                    fVar.f56818b = e2.toString();
                }
            }
        });
    }

    public byte[] loadFromStream(InputStream inputStream, Resolver resolver) {
        MethodCollector.i(3798);
        int available = inputStream.available();
        if (available <= 0) {
            available = 1024;
        }
        byte[] bArr = new byte[available];
        byte[] bArr2 = new byte[0];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byte[] bArr3 = new byte[read];
            System.arraycopy(bArr, 0, bArr3, 0, read);
            bArr2 = mergeArray(bArr2, bArr3);
        }
        if (resolver != null) {
            resolver.resolve(bArr2, 0, bArr2.length);
        }
        inputStream.close();
        MethodCollector.o(3798);
        return bArr2;
    }

    private byte[] loadFromFile(String str, final Resolver resolver) {
        final File file;
        MethodCollector.i(3803);
        if (str.startsWith("/")) {
            file = new File(str);
        } else {
            file = new File("/".concat(String.valueOf(str)));
        }
        LynxHelium.PermissionHandler permissionHandler = this.mPermissionHandler;
        if (permissionHandler == null) {
            byte[] loadFromStream = loadFromStream(new FileInputStream(file), resolver);
            MethodCollector.o(3803);
            return loadFromStream;
        }
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        if (permissionHandler.verifyHasPermission(strArr)) {
            byte[] loadFromStream2 = loadFromStream(new FileInputStream(file), resolver);
            MethodCollector.o(3803);
            return loadFromStream2;
        }
        this.mPermissionHandler.requestPermissions(strArr, new LynxHelium.OnPermissionListener() {
            /* class com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35090);
            }

            public static int com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader$3_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                return 0;
            }

            @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.OnPermissionListener
            public void onPermissionDenied() {
                com_lynx_tasm_behavior_ui_canvas_LynxHeliumResourceLoader$3_com_ss_android_ugc_aweme_lancet_LogLancet_e("HeliumResLoader", "Read local file permission denied");
                Resolver resolver = resolver;
                if (resolver != null) {
                    resolver.reject(new IOException("Read local file permission denied"));
                }
            }

            @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.OnPermissionListener
            public void onPermissionGranted() {
                MethodCollector.i(5248);
                if (resolver != null) {
                    try {
                        LynxHeliumResourceLoader.this.loadFromStream(new FileInputStream(file), resolver);
                        MethodCollector.o(5248);
                        return;
                    } catch (Exception unused) {
                        resolver.reject(new IOException("loadFromStream error"));
                    }
                }
                MethodCollector.o(5248);
            }
        });
        if (resolver == null) {
            LLog.d("HeliumResLoader", "WARNING: PermissionProvider not set!!!");
            byte[] loadFromStream3 = loadFromStream(new FileInputStream(file), null);
            MethodCollector.o(3803);
            return loadFromStream3;
        }
        MethodCollector.o(3803);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] realLoad(java.lang.String r9, com.he.lynx.loader.Resolver r10) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.canvas.LynxHeliumResourceLoader.realLoad(java.lang.String, com.he.lynx.loader.Resolver):byte[]");
    }
}
