package com.bytedance.apm.net;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.l.b;
import com.ss.android.ugc.aweme.net.model.d;
import com.ss.android.ugc.aweme.net.model.e;
import com.ss.android.ugc.aweme.net.monitor.n;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f25188a;

    /* renamed from: b  reason: collision with root package name */
    private HttpURLConnection f25189b;

    /* renamed from: c  reason: collision with root package name */
    private String f25190c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25191d = false;

    /* renamed from: e  reason: collision with root package name */
    private DataOutputStream f25192e;

    /* renamed from: f  reason: collision with root package name */
    private GZIPOutputStream f25193f;

    static {
        Covode.recordClassIndex(14677);
    }

    public final String a() {
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f25188a + "--\r\n").getBytes();
        if (this.f25191d) {
            this.f25193f.write(bytes);
            this.f25193f.finish();
            this.f25193f.close();
        } else {
            this.f25192e.write(bytes);
            this.f25192e.flush();
            this.f25192e.close();
        }
        int responseCode = this.f25189b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f25189b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f25189b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                sb.append(str);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }

    public final void a(JSONObject jSONObject) {
        String jSONObject2;
        StringBuilder sb = new StringBuilder(100);
        sb.append("--").append(this.f25188a).append("\r\nContent-Disposition: form-data; name=\"params.txt\"; filetype=\"common_params\"; logtype=\"env\"; filename=\"params.txt\"\r\n");
        sb.append("Content-Type: text/plain\r\n");
        sb.append("\r\n");
        if (this.f25191d) {
            this.f25193f.write(sb.toString().getBytes());
        } else {
            this.f25192e.write(sb.toString().getBytes());
        }
        if (jSONObject != null) {
            jSONObject2 = jSONObject.toString();
        } else {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("defaultData", "none commonParams");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            jSONObject2 = jSONObject3.toString();
        }
        if (this.f25191d) {
            this.f25193f.write(jSONObject2.getBytes());
        } else {
            this.f25192e.write(jSONObject2.getBytes());
        }
        if (this.f25191d) {
            this.f25193f.write("\r\n".getBytes());
            return;
        }
        this.f25192e.write("\r\n".getBytes());
        this.f25192e.flush();
    }

    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--").append(this.f25188a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"\r\nContent-Type: text/plain; charset=").append(this.f25190c).append("\r\n\r\n").append(str2).append("\r\n");
        try {
            if (this.f25191d) {
                this.f25193f.write(sb.toString().getBytes());
            } else {
                this.f25192e.write(sb.toString().getBytes());
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public a(String str, String str2) {
        R openConnection;
        URLConnection aVar;
        this.f25190c = str2;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f25188a = str3;
        URL url = new URL(str);
        e<URL, URLConnection> m2 = n.f112474e.m(new e<>(url, null, null, d.CONTINUE));
        if (m2.f112463f == d.INTERCEPT && m2.f112459b != null) {
            openConnection = m2.f112459b;
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new b(openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new com.ss.android.ugc.aweme.net.l.a(openConnection);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                this.f25189b = httpURLConnection;
                httpURLConnection.setUseCaches(false);
                this.f25189b.setDoOutput(true);
                this.f25189b.setDoInput(true);
                this.f25189b.setRequestMethod("POST");
                this.f25189b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
                this.f25192e = new DataOutputStream(this.f25189b.getOutputStream());
            }
        } else if (m2.f112463f != d.EXCEPTION || m2.f112462e == null) {
            openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new b((HttpsURLConnection) openConnection);
            } else {
                if (openConnection instanceof HttpURLConnection) {
                    aVar = new com.ss.android.ugc.aweme.net.l.a((HttpURLConnection) openConnection);
                }
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
                this.f25189b = httpURLConnection2;
                httpURLConnection2.setUseCaches(false);
                this.f25189b.setDoOutput(true);
                this.f25189b.setDoInput(true);
                this.f25189b.setRequestMethod("POST");
                this.f25189b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
                this.f25192e = new DataOutputStream(this.f25189b.getOutputStream());
            }
        } else {
            throw m2.f112462e;
        }
        openConnection = aVar;
        HttpURLConnection httpURLConnection22 = (HttpURLConnection) openConnection;
        this.f25189b = httpURLConnection22;
        httpURLConnection22.setUseCaches(false);
        this.f25189b.setDoOutput(true);
        this.f25189b.setDoInput(true);
        this.f25189b.setRequestMethod("POST");
        this.f25189b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        this.f25192e = new DataOutputStream(this.f25189b.getOutputStream());
    }

    public final void a(String str, File file, Map<String, String> map) {
        String name = file.getName();
        StringBuilder sb = new StringBuilder(100);
        sb.append("--").append(this.f25188a).append("\r\nContent-Disposition: form-data; name=\"").append(str).append("\"; filename=\"").append(name).append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ").append(entry.getKey()).append("=\"").append(entry.getValue()).append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f25191d) {
            this.f25193f.write(sb.toString().getBytes());
        } else {
            this.f25192e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f25191d) {
                this.f25193f.write(bArr, 0, read);
            } else {
                this.f25192e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f25191d) {
            this.f25193f.write("\r\n".getBytes());
            return;
        }
        this.f25192e.write("\r\n".getBytes());
        this.f25192e.flush();
    }
}
