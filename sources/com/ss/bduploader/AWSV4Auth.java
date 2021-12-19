package com.ss.bduploader;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class AWSV4Auth {
    private static String MAC_ALGORITHM = "HmacSHA256";
    protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();
    private static Mac mMacInstance;
    private static MessageDigest mMessageDigest;
    private String accessKeyID;
    private TreeMap<String, String> awsHeaders;
    private boolean awsHeadersHasTimestamp;
    private String canonicalURI;
    private String currentDate;
    private boolean debug;
    private String httpMethodName;
    private String payload;
    private TreeMap<String, String> queryParameters;
    private String regionName;
    private String secretAccessKey;
    private String serviceName;
    private String strSignedHeader;
    private String xAmzDate;

    /* renamed from: com.ss.bduploader.AWSV4Auth$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(100630);
        }
    }

    private AWSV4Auth() {
    }

    public static class Builder {
        public String accessKeyID;
        public TreeMap<String, String> awsHeaders;
        public String canonicalURI;
        public boolean debug;
        public String httpMethodName;
        public String payload;
        public TreeMap<String, String> queryParameters;
        public String regionName;
        public String secretAccessKey;
        public String serviceName;

        static {
            Covode.recordClassIndex(100631);
        }

        public Builder debug() {
            this.debug = true;
            return this;
        }

        public AWSV4Auth build() {
            return new AWSV4Auth(this, null);
        }

        public Builder awsHeaders(TreeMap<String, String> treeMap) {
            this.awsHeaders = treeMap;
            return this;
        }

        public Builder canonicalURI(String str) {
            this.canonicalURI = str;
            return this;
        }

        public Builder httpMethodName(String str) {
            this.httpMethodName = str;
            return this;
        }

        public Builder payload(String str) {
            this.payload = str;
            return this;
        }

        public Builder queryParameters(TreeMap<String, String> treeMap) {
            this.queryParameters = treeMap;
            return this;
        }

        public Builder regionName(String str) {
            this.regionName = str;
            return this;
        }

        public Builder serviceName(String str) {
            this.serviceName = str;
            return this;
        }

        public Builder(String str, String str2) {
            this.accessKeyID = str;
            this.secretAccessKey = str2;
        }
    }

    private String getTimeStamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    static {
        Covode.recordClassIndex(100629);
        try {
            mMacInstance = Mac.getInstance("HmacSHA256");
            mMessageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private String findTimestampFromHeaderCaseInsensitive() {
        TreeMap<String, String> treeMap = this.awsHeaders;
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        for (Map.Entry<String, String> entry : this.awsHeaders.entrySet()) {
            if (entry.getKey().toLowerCase().equals("x-amz-date")) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Map<String, String> getHeaders() {
        String calculateSignature = calculateSignature(prepareStringToSign(prepareCanonicalRequest()));
        if (calculateSignature != null) {
            HashMap hashMap = new HashMap(0);
            for (Map.Entry<String, String> entry : this.awsHeaders.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put("Authorization", buildAuthorizationString(calculateSignature));
            if (this.debug) {
                System.out.println("##Signature:\n".concat(String.valueOf(calculateSignature)));
                System.out.println("##Header:");
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    System.out.println(((String) entry2.getKey()) + " = " + ((String) entry2.getValue()));
                }
                System.out.println("================================");
            }
            return hashMap;
        } else if (!this.debug) {
            return null;
        } else {
            System.out.println("##Signature:\n".concat(String.valueOf(calculateSignature)));
            return null;
        }
    }

    private String prepareCanonicalRequest() {
        String str;
        String str2 = "";
        StringBuilder sb = new StringBuilder(str2);
        sb.append(this.httpMethodName).append("\n");
        String str3 = this.canonicalURI;
        if (str3 == null || str3.trim().isEmpty()) {
            str = "/";
        } else {
            str = this.canonicalURI;
        }
        this.canonicalURI = str;
        sb.append(str).append("\n");
        StringBuilder sb2 = new StringBuilder(str2);
        TreeMap<String, String> treeMap = this.queryParameters;
        if (treeMap == null || treeMap.isEmpty()) {
            sb2.append("\n");
        } else {
            for (Map.Entry<String, String> entry : this.queryParameters.entrySet()) {
                sb2.append(entry.getKey()).append("=").append(encodeParameter(entry.getValue())).append("&");
            }
            sb2.deleteCharAt(sb2.lastIndexOf("&"));
            sb2.append("\n");
        }
        sb.append((CharSequence) sb2);
        StringBuilder sb3 = new StringBuilder(str2);
        TreeMap<String, String> treeMap2 = this.awsHeaders;
        if (treeMap2 == null || treeMap2.isEmpty()) {
            sb.append("\n");
        } else {
            TreeMap treeMap3 = new TreeMap();
            for (Map.Entry<String, String> entry2 : this.awsHeaders.entrySet()) {
                treeMap3.put(entry2.getKey().toLowerCase(), entry2.getValue().trim());
            }
            for (Map.Entry entry3 : treeMap3.entrySet()) {
                String lowerCase = ((String) entry3.getKey()).toLowerCase();
                String trim = ((String) entry3.getValue()).trim();
                sb3.append(lowerCase).append(";");
                sb.append(lowerCase).append(":").append(trim).append("\n");
            }
            sb.append("\n");
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        this.strSignedHeader = substring;
        sb.append(substring).append("\n");
        String str4 = this.payload;
        if (str4 != null) {
            str2 = str4;
        }
        this.payload = str2;
        sb.append(generateHex(str2));
        if (this.debug) {
            System.out.println("##Canonical Request:\n" + sb.toString());
        }
        return sb.toString();
    }

    private String calculateSignature(String str) {
        try {
            return bytesToHex(SHA256UseMac(getSignatureKey(this.secretAccessKey, this.currentDate, this.regionName, this.serviceName), str));
        } catch (Exception unused) {
            return null;
        }
    }

    private String encodeParameter(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (Exception unused) {
            return str;
        }
    }

    private String getDateFromTimeStamp(String str) {
        if (str == null || str.length() < 8) {
            return null;
        }
        return str.substring(0, 8);
    }

    private String bytesToHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = hexArray;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr).toLowerCase();
    }

    private static synchronized String generateHex(String str) {
        String a2;
        synchronized (AWSV4Auth.class) {
            MethodCollector.i(998);
            try {
                mMessageDigest.update(str.getBytes("UTF-8"));
                a2 = a.a("%064x", new Object[]{new BigInteger(1, mMessageDigest.digest())});
                MethodCollector.o(998);
            } catch (UnsupportedEncodingException unused) {
                MethodCollector.o(998);
                return null;
            }
        }
        return a2;
    }

    private AWSV4Auth(Builder builder) {
        this.accessKeyID = builder.accessKeyID;
        this.secretAccessKey = builder.secretAccessKey;
        this.regionName = builder.regionName;
        this.serviceName = builder.serviceName;
        this.httpMethodName = builder.httpMethodName;
        this.canonicalURI = builder.canonicalURI;
        this.queryParameters = builder.queryParameters;
        this.awsHeaders = builder.awsHeaders;
        this.payload = builder.payload;
        this.debug = builder.debug;
        if (this.awsHeaders == null) {
            this.awsHeaders = new TreeMap<>();
        }
        String findTimestampFromHeaderCaseInsensitive = findTimestampFromHeaderCaseInsensitive();
        this.xAmzDate = findTimestampFromHeaderCaseInsensitive;
        if (findTimestampFromHeaderCaseInsensitive == null) {
            String timeStamp = getTimeStamp();
            this.xAmzDate = timeStamp;
            this.awsHeaders.put("x-amz-date", timeStamp);
        } else {
            this.awsHeadersHasTimestamp = true;
        }
        this.currentDate = getDateFromTimeStamp(this.xAmzDate);
    }

    private String buildAuthorizationString(String str) {
        return "AWS4-HMAC-SHA256 Credential=" + this.accessKeyID + "/" + this.currentDate + "/" + this.regionName + "/" + this.serviceName + "/aws4_request,SignedHeaders=" + this.strSignedHeader + ",Signature=" + str;
    }

    private String prepareStringToSign(String str) {
        String str2 = (("AWS4-HMAC-SHA256\n" + this.xAmzDate + "\n") + this.currentDate + "/" + this.regionName + "/" + this.serviceName + "/aws4_request\n") + generateHex(str);
        if (this.debug) {
            System.out.println("##String to sign:\n".concat(String.valueOf(str2)));
        }
        return str2;
    }

    /* synthetic */ AWSV4Auth(Builder builder, AnonymousClass1 r2) {
        this(builder);
    }

    private static synchronized byte[] SHA256UseMac(byte[] bArr, String str) {
        byte[] doFinal;
        synchronized (AWSV4Auth.class) {
            MethodCollector.i(1069);
            mMacInstance.init(new SecretKeySpec(bArr, MAC_ALGORITHM));
            doFinal = mMacInstance.doFinal(str.getBytes("UTF8"));
            MethodCollector.o(1069);
        }
        return doFinal;
    }

    private static synchronized byte[] getSignatureKey(String str, String str2, String str3, String str4) {
        byte[] SHA256UseMac;
        synchronized (AWSV4Auth.class) {
            MethodCollector.i(1111);
            SHA256UseMac = SHA256UseMac(SHA256UseMac(SHA256UseMac(SHA256UseMac("AWS4".concat(String.valueOf(str)).getBytes("UTF8"), str2), str3), str4), "aws4_request");
            MethodCollector.o(1111);
        }
        return SHA256UseMac;
    }
}
