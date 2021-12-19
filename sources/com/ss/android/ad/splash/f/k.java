package com.ss.android.ad.splash.f;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.core.h;
import com.ss.android.ad.splash.core.x;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

public final class k extends AsyncTask<Void, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private String f58977a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f58978b;

    /* renamed from: c  reason: collision with root package name */
    private long f58979c;

    /* renamed from: d  reason: collision with root package name */
    private MessageDigest f58980d;

    /* renamed from: e  reason: collision with root package name */
    private long f58981e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f58982f;

    static {
        Covode.recordClassIndex(36485);
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0188, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x018a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x018e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0190, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0192, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0194, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0196, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0198, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0205 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:9:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0205 A[PHI: r4 
      PHI: (r4v8 int) = (r4v9 int), (r4v10 int), (r4v10 int), (r4v10 int), (r4v10 int), (r4v10 int), (r4v10 int) binds: [B:73:0x0204, B:62:0x01d4, B:63:?, B:64:0x01e2, B:65:?, B:66:0x01eb, B:67:?] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:75:0x0205] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Void a() {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.f.k.a():java.lang.Void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Void[] voidArr) {
        super.onProgressUpdate(voidArr);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final /* synthetic */ Void doInBackground(Void[] voidArr) {
        return a();
    }

    private final boolean a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[10];
        byte[] bArr4 = new byte[8];
        byte[] bArr5 = new byte[232];
        byte[] bArr6 = new byte[23];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0:
        while (true) {
            bArr2[i2] = bArr[i2];
            int i7 = i3 + 1;
            bArr6[i3] = bArr[i2];
            while (true) {
                i3 = i7;
                while (true) {
                    i2++;
                    if (i2 >= 255) {
                        break loop0;
                    } else if (i2 >= 4) {
                        if (i2 == 4) {
                            break;
                        } else if (i2 < 15) {
                            bArr3[i4] = bArr[i2];
                            bArr6[i3] = bArr[i2];
                            i3++;
                            i4++;
                        } else if (i2 < 23) {
                            bArr4[i6] = bArr[i2];
                            bArr6[i3] = bArr[i2];
                            i3++;
                            i6++;
                        } else {
                            bArr5[i5] = bArr[i2];
                            i5++;
                        }
                    }
                }
                i7 = i3 + 1;
                bArr6[i3] = bArr[i2];
            }
        }
        byte[] digest = this.f58980d.digest(bArr6);
        if (!Arrays.equals(digest, Arrays.copyOfRange(bArr5, 0, digest.length))) {
            return true;
        }
        String valueOf = String.valueOf(this.f58979c);
        int i8 = 0;
        for (int i9 = 0; i9 < valueOf.length(); i9++) {
            int numericValue = Character.getNumericValue(valueOf.charAt(i9));
            if (numericValue > 10) {
                return true;
            }
            i8 += bArr3[numericValue] & 255;
        }
        x.a().a(ByteBuffer.wrap(bArr4).getLong());
        g.b("sum: ".concat(String.valueOf(i8)));
        if (i8 % 10 > 4) {
            return true;
        }
        return false;
    }

    public k(String str, int i2) {
        if (i2 > 0) {
            this.f58982f = i2;
        } else if (h.b() != null) {
            this.f58982f = Integer.parseInt(h.b().a());
        }
        this.f58977a = str;
        this.f58978b = false;
    }
}
