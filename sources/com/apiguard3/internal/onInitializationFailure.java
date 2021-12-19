package com.apiguard3.internal;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class onInitializationFailure extends APIGuard$Callback {
    private static int AGRequest$Builder = -247385822;
    private static int delete = 1;
    private static char get = 0;
    private static long method = 0;
    private static int put;
    private String addHeader = Thread.currentThread().getName();
    private String getHeaders;
    private getBody newBuilder;
    private long url = Thread.currentThread().getId();

    static {
        Covode.recordClassIndex(2559);
    }

    public enum getBody {
        getBody,
        AGRequest;
        
        private static long getHeaders;
        private static int getUrl;
        private static int method = 1;

        static void getUrl() {
            getHeaders = 8865242339093977835L;
        }

        static {
            Covode.recordClassIndex(2560);
            getUrl = 0;
            getUrl();
            int i2 = method + 61;
            getUrl = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
            if (r10 == null) goto L_0x0011;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
            r1 = r1 + 117;
            com.apiguard3.internal.onInitializationFailure.getBody.method = r1 % 128;
            r1 = r1 % 2;
            r10 = r10.toCharArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
            if (r10 == null) goto L_0x0011;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getUrl(java.lang.String r10) {
            /*
                int r0 = com.apiguard3.internal.onInitializationFailure.getBody.method
                int r2 = r0 + 53
                int r1 = r2 % 128
                com.apiguard3.internal.onInitializationFailure.getBody.getUrl = r1
                r9 = 2
                int r2 = r2 % r9
                r0 = 1
                if (r2 != 0) goto L_0x0045
                r0 = 30
                if (r10 != 0) goto L_0x0048
            L_0x0011:
                char[] r10 = (char[]) r10
                long r0 = com.apiguard3.internal.onInitializationFailure.getBody.getHeaders
                char[] r8 = com.apiguard3.internal.setNextFocusRightId.AGRequest(r0, r10)
                r7 = 4
                r6 = 4
            L_0x001b:
                int r0 = r8.length
                if (r6 < r0) goto L_0x0026
                java.lang.String r1 = new java.lang.String
                int r0 = r8.length
                int r0 = r0 - r7
                r1.<init>(r8, r7, r0)
                return r1
            L_0x0026:
                int r0 = com.apiguard3.internal.onInitializationFailure.getBody.getUrl
                int r1 = r0 + 115
                int r0 = r1 % 128
                com.apiguard3.internal.onInitializationFailure.getBody.method = r0
                int r1 = r1 % r9
                int r2 = r6 + -4
                char r1 = r8[r6]
                int r0 = r6 % 4
                char r0 = r8[r0]
                r1 = r1 ^ r0
                long r4 = (long) r1
                long r2 = (long) r2
                long r0 = com.apiguard3.internal.onInitializationFailure.getBody.getHeaders
                long r2 = r2 * r0
                long r4 = r4 ^ r2
                int r0 = (int) r4
                char r0 = (char) r0
                r8[r6] = r0
                int r6 = r6 + 1
                goto L_0x001b
            L_0x0045:
                if (r10 != 0) goto L_0x0048
                goto L_0x0011
            L_0x0048:
                int r1 = r1 + 117
                int r0 = r1 % 128
                com.apiguard3.internal.onInitializationFailure.getBody.method = r0
                int r1 = r1 % r9
                char[] r10 = r10.toCharArray()
                goto L_0x0011
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.onInitializationFailure.getBody.getUrl(java.lang.String):java.lang.String");
        }
    }

    @Override // com.apiguard3.internal.APIGuard$Callback
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(getUrl("\u0000\u0000\u0000\u0000", "?姅言졄钜འ벅ﮢ", "賗뭽䢘", (char) (-1 - ExpandableListView.getPackedPositionChild(0)), TextUtils.getCapsMode("", 0, 0)).intern(), this.url);
            jSONObject.put(getUrl("\u0000\u0000\u0000\u0000", "有歘싴㚼?㾌ႁ꫄ᚥ唹", "荧ꕯ蕠", (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), Process.myTid() >> 22).intern(), this.addHeader);
            jSONObject.put(getUrl("\u0000\u0000\u0000\u0000", "蓽马뇏ﰊ乓ᕣꭽ抗䗍셄", "ޛ킮৶", (char) TextUtils.getCapsMode("", 0, 0), 1624288776 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))).intern(), this.newBuilder.ordinal());
            jSONObject.put(getUrl("\u0000\u0000\u0000\u0000", "鐔駉铸", "ꩀ䚦ᴴ", (char) (13382 - (ViewConfiguration.getLongPressTimeout() >> 16)), (Process.myPid() >> 22) - 1494731862).intern(), this.getHeaders);
            jSONObject.put(getUrl("\u0000\u0000\u0000\u0000", "쬤쿥嬫鯺㊽?쨺䡥䮞", "犑⎡蕸쓹", (char) Color.argb(0, 0, 0, 0), 2015601009 - TextUtils.lastIndexOf("", '0', 0)).intern(), this.getUrl);
            jSONObject.put(getUrl("\u0000\u0000\u0000\u0000", "旜｝", "܆ٿⱔ", (char) (21734 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 1745256199).intern(), this.AGRequest);
            int i2 = delete + 119;
            put = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private static String getUrl(String str, String str2, String str3, char c2, int i2) {
        char c3;
        if (str3 == null) {
            c3 = '\r';
        } else {
            c3 = 16;
        }
        char[] cArr = str3;
        if (c3 != '\r') {
            int i3 = put + 101;
            delete = i3 % 128;
            int i4 = i3 % 2;
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            int i5 = delete + 103;
            put = i5 % 128;
            int i6 = i5 % 2;
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            int i7 = put + 109;
            delete = i7 % 128;
            int i8 = i7 % 2;
            char[] charArray = str.toCharArray();
            int i9 = put + 83;
            delete = i9 % 128;
            int i10 = i9 % 2;
            cArr5 = charArray;
        }
        char[] cArr6 = (char[]) cArr2.clone();
        char[] cArr7 = (char[]) cArr5.clone();
        cArr6[0] = (char) (c2 ^ cArr6[0]);
        cArr7[2] = (char) (cArr7[2] + ((char) i2));
        int length = cArr4.length;
        char[] cArr8 = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = delete + 55;
            put = i12 % 128;
            int i13 = i12 % 2;
            setNextFocusUpId.getHeaders(cArr6, cArr7, i11);
            cArr8[i11] = (char) ((int) (((((long) (cArr4[i11] ^ cArr6[(i11 + 3) % 4])) ^ method) ^ ((long) AGRequest$Builder)) ^ ((long) get)));
        }
        String str4 = new String(cArr8);
        int i14 = put + 59;
        delete = i14 % 128;
        int i15 = i14 % 2;
        return str4;
    }

    public onInitializationFailure(getBody getbody, String str, log.getBody getbody2, log.getMethod getmethod, String str2, long j2) {
        super(getbody2, getmethod, str2, j2);
        this.newBuilder = getbody;
        this.getHeaders = str;
    }
}
