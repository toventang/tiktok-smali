package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.lifecycle.t;
import com.bytedance.android.live.core.f.e;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.zhiliaoapp.musically.R;
import f.a.h;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public enum p {
    INST;
    

    /* renamed from: a  reason: collision with root package name */
    private static final String f8036a = y.a((int) R.string.gu5);

    /* renamed from: b  reason: collision with root package name */
    private static final String f8037b = y.a((int) R.string.gu4);

    /* renamed from: c  reason: collision with root package name */
    private static final String f8038c = y.a((int) R.string.gu8);

    /* renamed from: d  reason: collision with root package name */
    private static final String f8039d = y.a((int) R.string.gu2);

    /* renamed from: e  reason: collision with root package name */
    private static final String f8040e = y.a((int) R.string.gu1);

    /* renamed from: f  reason: collision with root package name */
    private static final String f8041f = y.a((int) R.string.gu7);

    /* renamed from: g  reason: collision with root package name */
    private static final String f8042g = y.a((int) R.string.gu_);

    /* renamed from: h  reason: collision with root package name */
    private static final String f8043h = y.a((int) R.string.gua);

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f8044i;

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f8045j = y.f(R.array.az);

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f8046k = y.f(R.array.b0);

    /* renamed from: l  reason: collision with root package name */
    private static String f8047l = (y.e().getDir(f8036a, 0).getAbsolutePath() + File.separator);
    public t<Boolean> isLoadedRes = new t<>();
    boolean isLoadingRes = false;
    String lastTimeFailedReason;
    final Map<String, Object> monitorExtra = new HashMap();

    public final String getLastTimeFailedReason() {
        return this.lastTimeFailedReason;
    }

    public final String getBeautyComposerFilePath() {
        return f8047l + f8040e;
    }

    public final String getBeautyFilePath() {
        String str = f8047l + f8039d;
        if (e.a(str)) {
            return str;
        }
        return "";
    }

    public final String getFaceReshapeFilePath() {
        return f8047l + f8041f;
    }

    public final String getFilterFilePath() {
        return f8047l + f8038c;
    }

    public final String getLiveComposerFilePath() {
        return f8047l + f8037b;
    }

    public final String getModelFilePath() {
        if (((IHostPlugin) a.a(IHostPlugin.class)).getHostModeFilePath() != null) {
            return ((IHostPlugin) a.a(IHostPlugin.class)).getHostModeFilePath();
        }
        return f8047l;
    }

    public final String getROIResPath() {
        return f8047l + f8043h;
    }

    public final String getReshapeComposerFilePath() {
        return f8047l + f8042g;
    }

    public final boolean isLoadedRes() {
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.20".equals(com.bytedance.android.livesdk.ap.a.f14017k.a())));
        }
        return this.isLoadedRes.getValue().booleanValue();
    }

    static {
        Covode.recordClassIndex(3996);
        String[] f2 = y.f(R.array.ay);
        f8044i = new String[f2.length];
        for (int i2 = 0; i2 < f2.length; i2++) {
            f8044i[i2] = f2[i2] + ".zip";
        }
    }

    public final synchronized void loadResources() {
        MethodCollector.i(6749);
        com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "call loadResources");
        if (this.isLoadingRes) {
            com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "resources is loading, return");
            MethodCollector.o(6749);
        } else if ("0.0.20".equals(com.bytedance.android.livesdk.ap.a.f14017k.a())) {
            com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "resources is already loaded, return");
            if (this.isLoadedRes.getValue() == null || !this.isLoadedRes.getValue().booleanValue()) {
                f.a.t.b((Object) 1).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new q(this));
            }
            MethodCollector.o(6749);
        } else {
            this.isLoadingRes = true;
            h.a((Callable) new r(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new s(this), new t(this), new u(this));
            MethodCollector.o(6749);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "start load resources");
        AssetManager assets = y.e().getAssets();
        String[] strArr = f8044i;
        boolean z = true;
        for (String str : strArr) {
            try {
                a(assets, str, f8047l + File.separator + str);
            } catch (IOException e2) {
                this.monitorExtra.put("copy_res_file_error", e2.toString());
                e2.printStackTrace();
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", e2);
                z = false;
            }
        }
        String[] strArr2 = f8045j;
        for (String str2 : strArr2) {
            try {
                b(assets, str2, f8047l + File.separator + str2);
            } catch (IOException e3) {
                this.monitorExtra.put("copy_res_folder_error", e3.toString());
                e3.printStackTrace();
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", e3);
                z = false;
            }
        }
        String[] strArr3 = f8046k;
        for (String str3 : strArr3) {
            try {
                a(assets, str3, f8047l + File.separator + str3);
            } catch (IOException e4) {
                this.monitorExtra.put("copy_res_file_error", e4.toString());
                e4.printStackTrace();
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", e4);
                z = false;
            }
        }
        String[] strArr4 = f8044i;
        int length = strArr4.length;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                String str4 = f8047l + strArr4[i2];
                e.a(str4, f8047l);
                com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "1 file unzipped: ".concat(String.valueOf(str4)));
            } catch (IOException e5) {
                this.monitorExtra.put("unzip_res_file_error", e5.toString());
                e5.printStackTrace();
                com.bytedance.android.live.core.c.a.a("LiveCameraResManager", e5);
                z = false;
            }
        }
        com.bytedance.android.live.core.c.a.a(3, "LiveCameraResManager", "finish load resources");
        return z;
    }

    private p(String str) {
    }

    public final Object getResourceFinder(Context context) {
        return ((IHostContext) a.a(IHostContext.class)).getResourceFinder(context, getModelFilePath());
    }

    public static boolean com_bytedance_android_live_broadcast_LiveCameraResManager_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(6894);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(6894);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6894);
        return delete;
    }

    private void b(AssetManager assetManager, String str, String str2) {
        MethodCollector.i(6901);
        String[] list = assetManager.list(str);
        if (list.length > 0) {
            new File(str2).mkdirs();
            for (String str3 : list) {
                b(assetManager, str + File.separator + str3, str2 + File.separator + str3);
            }
            MethodCollector.o(6901);
            return;
        }
        a(assetManager, str, str2);
        MethodCollector.o(6901);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.res.AssetManager r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.p.a(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }
}
