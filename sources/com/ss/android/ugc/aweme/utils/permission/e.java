package com.ss.android.ugc.aweme.utils.permission;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f143175a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static final c f143176b;

    public interface c {
        static {
            Covode.recordClassIndex(93719);
        }

        int a(Context context);

        int b(Context context);

        int c(Context context);
    }

    static class a implements c {
        static {
            Covode.recordClassIndex(93717);
        }

        private static void b(Camera camera) {
            if (!((Boolean) com.bytedance.helios.sdk.a.a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100106, "com_ss_android_ugc_aweme_utils_permission_PermissionUtils$BasePermissionUtil_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                camera.release();
                com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100101, "com_ss_android_ugc_aweme_utils_permission_PermissionUtils$BasePermissionUtil_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.e.c
        public int a(Context context) {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.e.c
        public int c(Context context) {
            return 0;
        }

        a() {
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0010 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void a(android.hardware.Camera r1) {
            /*
                r0 = 0
                r1.setPreviewTexture(r0)     // Catch:{ IOException | RuntimeException -> 0x0010, all -> 0x000b }
                r1.stopPreview()     // Catch:{ IOException | RuntimeException -> 0x0010, all -> 0x000b }
                b(r1)     // Catch:{ Exception -> 0x000a }
            L_0x000a:
                return
            L_0x000b:
                r0 = move-exception
                b(r1)     // Catch:{ Exception -> 0x000f }
            L_0x000f:
                throw r0
            L_0x0010:
                b(r1)     // Catch:{ Exception -> 0x0013 }
            L_0x0013:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.permission.e.a.a(android.hardware.Camera):void");
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.e.c
        public int b(Context context) {
            Camera camera;
            if (Camera.getNumberOfCameras() > 0) {
                try {
                    Camera.getCameraInfo(0, new Camera.CameraInfo());
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(Camera.class, new Object[]{0}, 100100, "android.hardware.Camera", false, null);
                    if (((Boolean) a2.first).booleanValue()) {
                        camera = (Camera) a2.second;
                    } else {
                        Camera open = Camera.open(0);
                        com.bytedance.helios.sdk.a.a(open, Camera.class, new Object[]{0}, 100100, "com_ss_android_ugc_aweme_utils_permission_PermissionUtils$BasePermissionUtil_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
                        camera = open;
                    }
                    if (camera == null) {
                        return 0;
                    }
                    camera.setParameters(camera.getParameters());
                    a(camera);
                    return 0;
                } catch (RuntimeException e2) {
                    com.bytedance.apm.b.a("aweme_open_camera_error_rate", -1001, new com.ss.android.ugc.aweme.app.f.c().a("errorDesc", "Camera permission denied. " + Log.getStackTraceString(e2)).a());
                    e2.getLocalizedMessage();
                    if (0 != 0) {
                        a((Camera) null);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        a((Camera) null);
                    }
                    throw th;
                }
            }
            return -1;
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(93716);
        if (a()) {
            f143176b = new b();
        } else {
            f143176b = new a();
        }
    }

    public static class b extends a {
        static {
            Covode.recordClassIndex(93718);
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.e.c, com.ss.android.ugc.aweme.utils.permission.e.a
        public final int a(Context context) {
            return androidx.core.content.b.a(context, "android.permission.RECORD_AUDIO");
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.e.c, com.ss.android.ugc.aweme.utils.permission.e.a
        public final int b(Context context) {
            return androidx.core.content.b.a(context, "android.permission.CAMERA");
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.e.c, com.ss.android.ugc.aweme.utils.permission.e.a
        public final int c(Context context) {
            return androidx.core.content.b.a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    public static int a(Context context) {
        return f143176b.b(context);
    }

    public static int b(Context context) {
        return f143176b.a(context);
    }

    public static int c(Context context) {
        return f143176b.c(context);
    }
}
