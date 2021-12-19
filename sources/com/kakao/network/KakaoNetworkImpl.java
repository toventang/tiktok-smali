package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.network.multipart.MultipartRequestEntity;
import com.kakao.network.multipart.Part;
import com.kakao.util.helper.log.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KakaoNetworkImpl implements INetwork {
    private String charset = "ISO-8859-1";
    private final Map<String, String> header = new HashMap();
    private final Map<String, String> params = new HashMap();
    private final List<Part> parts = new ArrayList();
    private int statusCode = -1;
    private HttpURLConnection urlConnection = null;

    static {
        Covode.recordClassIndex(34363);
    }

    @Override // com.kakao.network.INetwork
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override // com.kakao.network.INetwork
    public void connect() {
        try {
            this.statusCode = this.urlConnection.getResponseCode();
        } catch (IOException unused) {
            this.statusCode = this.urlConnection.getResponseCode();
        }
    }

    @Override // com.kakao.network.INetwork
    public void disconnect() {
        this.params.clear();
        this.header.clear();
        this.parts.clear();
        HttpURLConnection httpURLConnection = this.urlConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.statusCode = 200;
    }

    @Override // com.kakao.network.INetwork
    public byte[] readFully() {
        MethodCollector.i(4226);
        InputStream inputStream = getInputStream(this.urlConnection);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            MethodCollector.o(4226);
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            MethodCollector.o(4226);
            throw th;
        }
    }

    @Override // com.kakao.network.INetwork
    public void configure() {
        MultipartRequestEntity multipartRequestEntity;
        int contentLength;
        MethodCollector.i(4203);
        this.urlConnection.setDoInput(true);
        this.urlConnection.setConnectTimeout(5000);
        this.urlConnection.setReadTimeout(30000);
        this.urlConnection.setInstanceFollowRedirects(false);
        this.urlConnection.setRequestProperty("Connection", "keep-alive");
        if (!this.header.isEmpty()) {
            for (String str : this.header.keySet()) {
                this.urlConnection.setRequestProperty(str, this.header.get(str));
            }
        }
        String requestMethod = this.urlConnection.getRequestMethod();
        if ("POST".equals(requestMethod) || a.f28513c.equals(requestMethod)) {
            this.urlConnection.setRequestProperty("Content-Length", "0");
            this.urlConnection.setDoOutput(true);
            String str2 = null;
            if (!this.params.isEmpty()) {
                String postDataString = getPostDataString(this.params);
                contentLength = 0 + postDataString.length();
                multipartRequestEntity = null;
                str2 = postDataString;
            } else if (!this.parts.isEmpty()) {
                multipartRequestEntity = new MultipartRequestEntity(this.parts);
                contentLength = (int) (multipartRequestEntity.getContentLength() + 0);
                this.urlConnection.setRequestProperty("Content-Type", multipartRequestEntity.getContentType());
            }
            if (contentLength > 0) {
                this.urlConnection.setFixedLengthStreamingMode(contentLength);
                this.urlConnection.setRequestProperty("Content-Length", String.valueOf(contentLength));
            }
            if (str2 != null && !str2.isEmpty()) {
                this.urlConnection.getOutputStream().write(str2.getBytes(this.charset));
            }
            if (multipartRequestEntity != null) {
                multipartRequestEntity.writeRequest(this.urlConnection.getOutputStream());
            }
        }
        MethodCollector.o(4203);
    }

    @Override // com.kakao.network.INetwork
    public void addPart(Part part) {
        this.parts.add(part);
    }

    private InputStream getInputStream(HttpURLConnection httpURLConnection) {
        MethodCollector.i(4241);
        if (httpURLConnection.getResponseCode() < 400) {
            InputStream inputStream = httpURLConnection.getInputStream();
            MethodCollector.o(4241);
            return inputStream;
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            MethodCollector.o(4241);
            return errorStream;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
        MethodCollector.o(4241);
        return byteArrayInputStream;
    }

    private String getPostDataString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(entry.getKey(), this.charset));
            sb.append("=");
            sb.append(URLEncoder.encode(entry.getValue(), this.charset));
        }
        return sb.toString();
    }

    @Override // com.kakao.network.INetwork
    public void addHeader(String str, String str2) {
        this.header.put(str, str2);
    }

    @Override // com.kakao.network.INetwork
    public void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    @Override // com.kakao.network.INetwork
    public void create(String str, String str2, String str3) {
        Logger.d("++ url: ".concat(String.valueOf(str)));
        Logger.d("++ method: ".concat(String.valueOf(str2)));
        this.charset = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection(Proxy.NO_PROXY);
        this.urlConnection = httpURLConnection;
        httpURLConnection.setRequestMethod(str2);
    }
}
