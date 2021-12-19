package com.kakao.network.multipart;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;

public class StringPart extends Part {
    private byte[] content;
    private final String value;

    static {
        Covode.recordClassIndex(34375);
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.network.multipart.Part
    public long lengthOfData() {
        return (long) getContent().length;
    }

    private byte[] getContent() {
        if (this.content == null) {
            this.content = MultipartRequestEntity.getBytes(this.value, this.charsetString);
        }
        return this.content;
    }

    /* access modifiers changed from: protected */
    @Override // com.kakao.network.multipart.Part
    public void sendData(OutputStream outputStream) {
        MethodCollector.i(4933);
        outputStream.write(getContent());
        MethodCollector.o(4933);
    }

    public StringPart(String str, String str2) {
        this(str, str2, "text/plain", "UTF-8", "8bit");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StringPart(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x0008
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
        L_0x0008:
            java.lang.String r4 = "text/plain"
        L_0x000a:
            if (r5 == 0) goto L_0x0012
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0014
        L_0x0012:
            java.lang.String r5 = "UTF-8"
        L_0x0014:
            if (r6 == 0) goto L_0x001c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            java.lang.String r6 = "8bit"
        L_0x001e:
            r1.<init>(r2, r4, r5, r6)
            r1.value = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.network.multipart.StringPart.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
