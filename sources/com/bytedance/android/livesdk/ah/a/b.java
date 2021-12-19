package com.bytedance.android.livesdk.ah.a;

import android.content.Context;
import android.hardware.Camera;
import com.bytedance.android.livesdk.ah.b.a;
import com.bytedance.android.livesdk.ah.c.e;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private static a f13703a;

    static {
        Covode.recordClassIndex(7610);
    }

    private static void a(Camera camera) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(camera, new Object[0], 100101, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100106, "com_bytedance_android_livesdk_permission_checker_CameraChecker_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            camera.release();
            com.bytedance.helios.sdk.a.a(null, camera, new Object[0], 100101, "com_bytedance_android_livesdk_permission_checker_CameraChecker_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
        }
    }

    private static Camera c() {
        try {
            return b();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean a() {
        Camera c2 = c();
        if (c2 == null) {
            return false;
        }
        Field field = null;
        try {
            field = c2.getClass().getDeclaredField("mHasPermission");
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        if (field == null) {
            a(c2);
            return true;
        }
        try {
            field.setAccessible(true);
            return field.getBoolean(c2);
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return true;
        } finally {
            a(c2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb A[ExcHandler: Exception (r0v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:9:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.hardware.Camera b() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ah.a.b.b():android.hardware.Camera");
    }

    @Override // com.bytedance.android.livesdk.ah.a.d
    public final boolean a(Context context, String str) {
        if (f13703a == null) {
            return a();
        }
        if (!e.a.f13723a.b() || !f13703a.a()) {
            return false;
        }
        return true;
    }
}
