package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    final boolean f27704a;

    /* renamed from: b  reason: collision with root package name */
    g f27705b;

    /* renamed from: c  reason: collision with root package name */
    o f27706c;

    /* renamed from: d  reason: collision with root package name */
    private final String f27707d;

    /* renamed from: e  reason: collision with root package name */
    private final HttpURLConnection f27708e;

    /* renamed from: f  reason: collision with root package name */
    private final String f27709f;

    static {
        Covode.recordClassIndex(16245);
    }

    public final String a() {
        MethodCollector.i(8095);
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f27707d + "--\r\n").getBytes();
        if (this.f27704a) {
            this.f27706c.write(bytes);
            this.f27706c.b();
            this.f27706c.a();
        } else {
            this.f27705b.write(bytes);
            this.f27705b.flush();
            this.f27705b.a();
        }
        int responseCode = this.f27708e.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f27708e.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f27708e.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                sb.append(str);
            }
            String sb2 = sb.toString();
            MethodCollector.o(8095);
            return sb2;
        }
        IOException iOException = new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
        MethodCollector.o(8095);
        throw iOException;
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr) {
        if (this.f27704a) {
            this.f27706c.write(bArr);
        } else {
            this.f27705b.write(bArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(File file) {
        MethodCollector.i(8077);
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                MethodCollector.o(8077);
                return;
            } else if (this.f27704a) {
                this.f27706c.write(bArr, 0, read);
            } else {
                this.f27705b.write(bArr, 0, read);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("--").append(this.f27707d).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"; filename=\"").append(str).append("\"");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("; ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
            }
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        a(sb.toString().getBytes());
    }

    public final void a(String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("--").append(this.f27707d).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"\r\nContent-Type: text/plain; charset=").append(this.f27709f).append("\r\n\r\n");
        try {
            a(sb.toString().getBytes());
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = m.f27730g.getEncryptImpl().a(bytes);
        }
        try {
            a(bytes);
            a("\r\n".getBytes());
        } catch (IOException unused2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.l.<init>(java.lang.String, java.lang.String, boolean):void");
    }
}
