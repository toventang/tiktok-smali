package com.ss.android.ugc.aweme.n;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112199a = new a((byte) 0);

    static {
        Covode.recordClassIndex(72104);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72105);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.n.a
    public final int a(String str, String str2, VERecordData vERecordData) {
        String str3;
        l.d(str, "");
        int audioFromRecordData = VEUtils.getAudioFromRecordData(str2, vERecordData, 1, 88200, 44100);
        boolean a2 = i.a(str2);
        StringBuilder append = new StringBuilder("outputAudio: ").append(str2).append(", outMediaFile: ");
        if (vERecordData != null) {
            str3 = vERecordData.toString();
        } else {
            str3 = null;
        }
        String sb = append.append(str3).append(", channels: 1, bitRate: 88200, sampleRate: 44100").toString();
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        bVar.a("method", 4);
        bVar.a("scenario", str);
        bVar.a("status", audioFromRecordData);
        bVar.a("frame_exist", a2);
        bVar.a("params", sb);
        r.a("ve_audio_frame", bVar.f149193a);
        return audioFromRecordData;
    }

    @Override // com.ss.android.ugc.aweme.n.a
    public final int a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int transCodeAudio = VEUtils.transCodeAudio(str2, str3, 1, 88200);
        boolean a2 = i.a(str2);
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        bVar.a("method", 2);
        bVar.a("scenario", str);
        bVar.a("status", transCodeAudio);
        bVar.a("frame_exist", a2);
        bVar.a("params", "inMediaFile: " + str2 + ", outMediaFile: " + str3 + ", channels: 1, bitRate: 88200");
        r.a("ve_audio_frame", bVar.f149193a);
        return transCodeAudio;
    }

    public static int a(String str, String str2, String str3, int i2, int i3, int i4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int transCodeAudio = VEUtils.transCodeAudio(str2, str3, i2, i3, i4);
        boolean a2 = i.a(str2);
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        bVar.a("method", 3);
        bVar.a("scenario", str);
        bVar.a("status", transCodeAudio);
        bVar.a("frame_exist", a2);
        bVar.a("params", "inMediaFile: " + str2 + ", outMediaFile: " + str3 + ", channels: " + i2 + ", bitRate: " + i3 + ", sampleRate: " + i4);
        r.a("ve_audio_frame", bVar.f149193a);
        return transCodeAudio;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0102 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.n.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r28, java.lang.String r29, java.lang.String[] r30, long[] r31, long[] r32, long r33, long r35, float[] r37, int r38, int r39, int r40) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.n.b.a(java.lang.String, java.lang.String, java.lang.String[], long[], long[], long, long, float[], int, int, int):int");
    }
}
