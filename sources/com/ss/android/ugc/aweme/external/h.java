package com.ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.uploader.d;
import com.ss.android.ugc.aweme.uploader.e;
import com.ss.android.ugc.aweme.uploader.f;

public final class h implements IExternalUploaderService {
    static {
        Covode.recordClassIndex(56747);
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final void cacheUploadAuthKeyConfig() {
        TTUploaderService.c();
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final int getUploadBackupNetworkType() {
        return d.a();
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final int getUploadMainNetworkType() {
        return e.a();
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final boolean uploaderUpdateEnable() {
        return f.a();
    }

    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final String getSdkV4AuthKey() {
        return g.a().e().getSdkV4AuthKey("");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r7 = r1.f118753d;
        r8 = r1.f118750a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r8 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r8 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r9 = r1.f118758i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r9 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r1 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r0 = r1.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r0 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r10 = r0.f118718a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r10 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r1 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r0 = r1.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r11 = r0.f118719b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r11 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r1 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r0 = r1.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r0 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        r12 = r0.f118720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        if (r12 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        r12 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        if (r1 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        r0 = r1.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        r0 = r0.f118721d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006f, code lost:
        if (r0 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0074, code lost:
        return new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r6 = r1.f118752c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r6 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        h.f.b.l.b(r6, r13);
     */
    @Override // com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig getUploadVideoConfig(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.external.h.getUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
    }
}
