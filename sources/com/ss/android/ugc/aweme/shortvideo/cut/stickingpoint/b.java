package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f125884a;

    /* renamed from: b  reason: collision with root package name */
    public c f125885b;

    public interface a {
        static {
            Covode.recordClassIndex(82711);
        }

        int a(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath);
    }

    static {
        Covode.recordClassIndex(82710);
    }

    private static VEAlgorithmPath a(VEAlgorithmPath vEAlgorithmPath) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VEAlgorithmPath vEAlgorithmPath2 = new VEAlgorithmPath();
        Integer num = null;
        if (vEAlgorithmPath != null) {
            str = vEAlgorithmPath.getVeBeatsPath();
        } else {
            str = null;
        }
        vEAlgorithmPath2.setVeBeatsPath(str);
        if (vEAlgorithmPath != null) {
            str2 = vEAlgorithmPath.getDownBeatsPath();
        } else {
            str2 = null;
        }
        vEAlgorithmPath2.setDownBeatsPath(str2);
        if (vEAlgorithmPath != null) {
            str3 = vEAlgorithmPath.getNoStrengthBeatsPath();
        } else {
            str3 = null;
        }
        vEAlgorithmPath2.setNoStrengthBeatsPath(str3);
        if (vEAlgorithmPath != null) {
            str4 = vEAlgorithmPath.getManMadePath();
        } else {
            str4 = null;
        }
        vEAlgorithmPath2.setManMadePath(str4);
        if (vEAlgorithmPath != null) {
            str5 = vEAlgorithmPath.getOnlineBeatsPath();
        } else {
            str5 = null;
        }
        vEAlgorithmPath2.setOnlineBeatsPath(str5);
        if (vEAlgorithmPath == null || (num = Integer.valueOf(vEAlgorithmPath.getMode())) == null) {
            l.b();
        }
        vEAlgorithmPath2.setMode(num.intValue());
        vEAlgorithmPath2.setType(vEAlgorithmPath.getType());
        return vEAlgorithmPath2;
    }

    public static VEAlgorithmPath a(c cVar) {
        int i2;
        if (cVar == null) {
            l.b();
            return null;
        }
        String b2 = f.b(cVar);
        String veBeatsPath = cVar.getStickPointMusicAlg().getVeBeatsPath();
        String downBeatsPath = cVar.getStickPointMusicAlg().getDownBeatsPath();
        String noStrengthBeatsPath = cVar.getStickPointMusicAlg().getNoStrengthBeatsPath();
        String manModeBeatsPath = cVar.getStickPointMusicAlg().getManModeBeatsPath();
        if (!e.b(veBeatsPath)) {
            veBeatsPath = null;
        }
        if (!e.b(downBeatsPath)) {
            downBeatsPath = null;
        }
        if (!e.b(noStrengthBeatsPath)) {
            noStrengthBeatsPath = null;
        }
        if (!e.b(manModeBeatsPath)) {
            manModeBeatsPath = null;
        }
        if (cVar.getStickPointMusicAlg().isSuccessivelyAlgType() && !cVar.getStickPointMusicAlg().existSuccessivelyAlgFile()) {
            cVar.getStickPointMusicAlg().setAlgType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        }
        VEAlgorithmPath vEAlgorithmPath = new VEAlgorithmPath();
        vEAlgorithmPath.setVeBeatsPath(veBeatsPath);
        vEAlgorithmPath.setDownBeatsPath(downBeatsPath);
        if (!cVar.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            if (e.b(downBeatsPath)) {
                vEAlgorithmPath.setNoStrengthBeatsPath(null);
            } else {
                vEAlgorithmPath.setNoStrengthBeatsPath(noStrengthBeatsPath);
            }
        }
        vEAlgorithmPath.setManMadePath(manModeBeatsPath);
        vEAlgorithmPath.setOnlineBeatsPath(b2);
        vEAlgorithmPath.setType(cVar.getStickPointMusicAlg().getAlgType());
        if (cVar.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            i2 = VEAlgorithmPath.MODE_SUCCESSIVELY;
        } else {
            i2 = VEAlgorithmPath.INTMODE_ONSET;
        }
        vEAlgorithmPath.setMode(i2);
        return vEAlgorithmPath;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013f, code lost:
        if (r10 < 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0168, code lost:
        if (r10 >= 0) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r12, com.ss.android.vesdk.clipparam.VEAlgorithmPath r13, int r14, int r15, java.lang.Integer r16) {
        /*
        // Method dump skipped, instructions count: 418
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a(java.lang.String, com.ss.android.vesdk.clipparam.VEAlgorithmPath, int, int, java.lang.Integer):int");
    }
}
