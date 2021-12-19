package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

public final class FormUrlEncodedTypedOutput implements TypedOutput {
    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    static {
        Covode.recordClassIndex(26045);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return (long) this.content.size();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return DigestUtil.md5Hex(this.content.toByteArray());
    }

    public FormUrlEncodedTypedOutput() {
        MethodCollector.i(4207);
        MethodCollector.o(4207);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        MethodCollector.i(4730);
        outputStream.write(this.content.toByteArray());
        MethodCollector.o(4730);
    }

    public final void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    public final void addField(String str, boolean z, String str2, boolean z2) {
        MethodCollector.i(4229);
        if (str == null) {
            NullPointerException nullPointerException = new NullPointerException(StringSet.name);
            MethodCollector.o(4229);
            throw nullPointerException;
        } else if (str2 != null) {
            if (this.content.size() > 0) {
                this.content.write(38);
            }
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                } catch (IOException e2) {
                    RuntimeException runtimeException = new RuntimeException(e2);
                    MethodCollector.o(4229);
                    throw runtimeException;
                }
            }
            if (z2) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
            this.content.write(str.getBytes("UTF-8"));
            this.content.write(61);
            this.content.write(str2.getBytes("UTF-8"));
            MethodCollector.o(4229);
        } else {
            NullPointerException nullPointerException2 = new NullPointerException("value");
            MethodCollector.o(4229);
            throw nullPointerException2;
        }
    }
}
