package com.bytedance.retrofit2.mime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;

public class TypedByteArray implements TypedInput, TypedOutput {
    private final byte[] bytes;
    private final String fakeFileName;
    private final String mimeType;

    static {
        Covode.recordClassIndex(26049);
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return this.mimeType;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return (long) this.bytes.length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        if (TextUtils.isEmpty(this.fakeFileName)) {
            return null;
        }
        return this.fakeFileName;
    }

    public int hashCode() {
        return (this.mimeType.hashCode() * 31) + Arrays.hashCode(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() {
        MethodCollector.i(4324);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.bytes);
        MethodCollector.o(4324);
        return byteArrayInputStream;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            return null;
        }
        return DigestUtil.md5Hex(bArr);
    }

    public String toString() {
        return "TypedByteArray[length=" + length() + "]";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
        MethodCollector.i(4322);
        outputStream.write(this.bytes);
        MethodCollector.o(4322);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypedByteArray typedByteArray = (TypedByteArray) obj;
        if (Arrays.equals(this.bytes, typedByteArray.bytes) && this.mimeType.equals(typedByteArray.mimeType)) {
            return true;
        }
        return false;
    }

    public TypedByteArray(String str, byte[] bArr, String... strArr) {
        String str2;
        if (strArr == null || strArr.length <= 0) {
            str2 = null;
        } else {
            str2 = strArr[0];
        }
        if (str == null) {
            if (TextUtils.isEmpty(str2)) {
                str = "application/unknown";
            } else {
                str = "application/octet-stream";
            }
        }
        Objects.requireNonNull(bArr, "bytes");
        this.mimeType = str;
        this.bytes = bArr;
        this.fakeFileName = str2;
    }
}
