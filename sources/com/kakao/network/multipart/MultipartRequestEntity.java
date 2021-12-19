package com.kakao.network.multipart;

import com.a;
import com.bytedance.covode.number.Covode;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Random;

public class MultipartRequestEntity {
    private static final byte[] MULTIPART_CHARS = getAsciiBytes("-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
    private static final Random RANDOM = new Random();
    private final long contentLength;
    private final String contentType = computeContentType("multipart/form-data");
    private final byte[] multipartBoundary;
    private final List<Part> parts;

    public long getContentLength() {
        return this.contentLength;
    }

    public String getContentType() {
        return this.contentType;
    }

    static {
        Covode.recordClassIndex(34373);
    }

    private static byte[] generateMultipartBoundary() {
        int nextInt = RANDOM.nextInt(11) + 30;
        byte[] bArr = new byte[nextInt];
        for (int i2 = 0; i2 < nextInt; i2++) {
            byte[] bArr2 = MULTIPART_CHARS;
            bArr[i2] = bArr2[RANDOM.nextInt(bArr2.length)];
        }
        return bArr;
    }

    public void writeRequest(OutputStream outputStream) {
        Part.sendParts(outputStream, this.parts, this.multipartBoundary);
    }

    public MultipartRequestEntity(List<Part> list) {
        this.parts = list;
        byte[] generateMultipartBoundary = generateMultipartBoundary();
        this.multipartBoundary = generateMultipartBoundary;
        this.contentLength = Part.getLengthOfParts(list, generateMultipartBoundary);
    }

    public static byte[] getAsciiBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new IllegalArgumentException("data may not be null");
        }
    }

    private String computeContentType(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith(";")) {
            sb.append(";");
        }
        try {
            return sb.append(" boundary=").append(new String(this.multipartBoundary, "US-ASCII")).toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] getBytes(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        } else if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException("charset may not be null or empty");
        } else {
            try {
                return str.getBytes(str2);
            } catch (UnsupportedEncodingException unused) {
                throw new IllegalArgumentException(a.a("Unsupported encoding: %s", new Object[]{str2}));
            }
        }
    }
}
