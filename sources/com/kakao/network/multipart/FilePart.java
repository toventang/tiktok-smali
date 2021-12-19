package com.kakao.network.multipart;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePart extends Part {
    private static final byte[] FILE_NAME_BYTES = MultipartRequestEntity.getAsciiBytes("; filename=");
    private final File content;

    static {
        Covode.recordClassIndex(34372);
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.network.multipart.Part
    public long lengthOfData() {
        File file = this.content;
        if (file != null) {
            return file.length();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.network.multipart.Part
    public long dispositionHeaderLength() {
        String name = this.content.getName();
        long dispositionHeaderLength = super.dispositionHeaderLength();
        if (name != null) {
            return dispositionHeaderLength + ((long) FILE_NAME_BYTES.length) + ((long) QUOTE_BYTES.length) + ((long) MultipartRequestEntity.getAsciiBytes(name).length) + ((long) QUOTE_BYTES.length);
        }
        return dispositionHeaderLength;
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.network.multipart.Part
    public void sendDispositionHeader(OutputStream outputStream) {
        MethodCollector.i(4953);
        super.sendDispositionHeader(outputStream);
        String name = this.content.getName();
        if (name != null) {
            outputStream.write(FILE_NAME_BYTES);
            outputStream.write(QUOTE_BYTES);
            outputStream.write(MultipartRequestEntity.getAsciiBytes(name));
            outputStream.write(QUOTE_BYTES);
        }
        MethodCollector.o(4953);
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.network.multipart.Part
    public void sendData(OutputStream outputStream) {
        InputStream inputStream;
        MethodCollector.i(4955);
        if (lengthOfData() == 0) {
            MethodCollector.o(4955);
            return;
        }
        byte[] bArr = new byte[4096];
        if (this.content != null) {
            inputStream = new FileInputStream(this.content);
        } else {
            inputStream = new ByteArrayInputStream(new byte[0]);
        }
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                inputStream.close();
                MethodCollector.o(4955);
            }
        }
    }

    public FilePart(String str, File file) {
        this(str, file, "application/octet-stream", "ISO-8859-1", "binary");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FilePart(java.lang.String r2, java.io.File r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x0008
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
        L_0x0008:
            java.lang.String r4 = "application/octet-stream"
        L_0x000a:
            if (r5 == 0) goto L_0x0012
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0014
        L_0x0012:
            java.lang.String r5 = "ISO-8859-1"
        L_0x0014:
            if (r6 == 0) goto L_0x001c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            java.lang.String r6 = "binary"
        L_0x001e:
            r1.<init>(r2, r4, r5, r6)
            r1.content = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.network.multipart.FilePart.<init>(java.lang.String, java.io.File, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
