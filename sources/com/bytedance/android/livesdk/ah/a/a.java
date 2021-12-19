package com.bytedance.android.livesdk.ah.a;

import android.content.Context;
import android.media.AudioRecord;
import com.bytedance.covode.number.Covode;

public final class a implements d {
    static {
        Covode.recordClassIndex(7609);
    }

    private static void a(AudioRecord audioRecord) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(audioRecord, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100405, "com_bytedance_android_livesdk_permission_checker_AudioRecorderChecker_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord.release();
            com.bytedance.helios.sdk.a.a(null, audioRecord, new Object[0], 100403, "com_bytedance_android_livesdk_permission_checker_AudioRecorderChecker_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[SYNTHETIC, Splitter:B:21:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a() {
        /*
            r4 = 44100(0xac44, float:6.1797E-41)
            r1 = 3
            r0 = 2
            r3 = 0
            r2 = 0
            int r10 = android.media.AudioRecord.getMinBufferSize(r4, r1, r0)     // Catch:{ Exception -> 0x0054 }
            android.media.AudioRecord r5 = new android.media.AudioRecord     // Catch:{ Exception -> 0x0054 }
            r6 = 1
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 3
            r9 = 2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0054 }
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0051 }
            r13 = 100400(0x18830, float:1.4069E-40)
            java.lang.String r14 = "void"
            r15 = 0
            r16 = 0
            r11 = r5
            android.util.Pair r0 = com.bytedance.helios.sdk.a.a(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r0 = r0.first     // Catch:{ Exception -> 0x0051 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0051 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0051 }
            if (r0 != 0) goto L_0x003c
            r5.startRecording()     // Catch:{ Exception -> 0x0051 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0051 }
            r1 = 100400(0x18830, float:1.4069E-40)
            java.lang.String r0 = "com_bytedance_android_livesdk_permission_checker_AudioRecorderChecker_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V"
            com.bytedance.helios.sdk.a.a(r3, r5, r4, r1, r0)     // Catch:{ Exception -> 0x0051 }
        L_0x003c:
            if (r10 <= 0) goto L_0x0050
            byte[] r0 = new byte[r10]
            int r1 = r5.read(r0, r2, r10)
            a(r5)     // Catch:{ Exception -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004c:
            if (r1 <= 0) goto L_0x0050
            r0 = 1
            return r0
        L_0x0050:
            return r2
        L_0x0051:
            r0 = move-exception
            r3 = r5
            goto L_0x0055
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            r0.printStackTrace()
            if (r3 == 0) goto L_0x005d
            a(r3)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ah.a.a.a():boolean");
    }

    @Override // com.bytedance.android.livesdk.ah.a.d
    public final boolean a(Context context, String str) {
        return a();
    }
}
