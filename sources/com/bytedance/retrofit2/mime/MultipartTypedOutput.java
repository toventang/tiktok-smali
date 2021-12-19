package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class MultipartTypedOutput implements TypedOutput {
    private final String boundary;
    private final byte[] footer;
    private long length;
    private final List<MimePart> mimeParts;

    static {
        Covode.recordClassIndex(26047);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return this.length;
    }

    public final int getPartCount() {
        return this.mimeParts.size();
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: package-private */
    public static final class MimePart {
        private final TypedOutput body;
        private final String boundary;
        private boolean isBuilt;
        private final boolean isFirst;
        private final String name;
        private byte[] partBoundary;
        private byte[] partHeader;
        private final String transferEncoding;

        static {
            Covode.recordClassIndex(26048);
        }

        private void build() {
            if (!this.isBuilt) {
                this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
                this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.transferEncoding, this.body);
                this.isBuilt = true;
            }
        }

        public final long size() {
            build();
            if (this.body.length() > -1) {
                return this.body.length() + ((long) this.partBoundary.length) + ((long) this.partHeader.length);
            }
            return -1;
        }

        public final void writeTo(OutputStream outputStream) {
            MethodCollector.i(2947);
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
            MethodCollector.o(2947);
        }

        public MimePart(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.name = str;
            this.transferEncoding = str2;
            this.body = typedOutput;
            this.isFirst = z;
            this.boundary = str3;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return "multipart/form-data; boundary=" + this.boundary;
    }

    /* access modifiers changed from: package-private */
    public final List<byte[]> getParts() {
        MethodCollector.i(4502);
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart mimePart : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimePart.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        MethodCollector.o(4502);
        return arrayList;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0037 A[SYNTHETIC, Splitter:B:23:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003c A[SYNTHETIC, Splitter:B:27:0x003c] */
    @Override // com.bytedance.retrofit2.mime.TypedOutput
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String md5Stub() {
        /*
            r7 = this;
            r6 = 4606(0x11fe, float:6.454E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            long r4 = r7.length
            r3 = 0
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0012
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r3
        L_0x0012:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0033 }
            r2.<init>()     // Catch:{ all -> 0x0033 }
            r7.writeTo(r2)     // Catch:{ all -> 0x0031 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0031 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0031 }
            r1.<init>(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = com.bytedance.retrofit2.mime.DigestUtil.md5Hex(r1)     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ all -> 0x002a }
        L_0x002a:
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x0031:
            r1 = r3
            goto L_0x0035
        L_0x0033:
            r2 = r3
            r1 = r2
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.mime.MultipartTypedOutput.md5Stub():java.lang.String");
    }

    MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        byte[] buildBoundary = buildBoundary(str, false, true);
        this.footer = buildBoundary;
        this.length = (long) buildBoundary.length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        MethodCollector.i(4523);
        for (MimePart mimePart : this.mimeParts) {
            mimePart.writeTo(outputStream);
        }
        outputStream.write(this.footer);
        MethodCollector.o(4523);
    }

    public final void addPart(String str, TypedOutput typedOutput) {
        addPart(str, "binary", typedOutput);
    }

    public static byte[] buildBoundary(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e2) {
            throw new RuntimeException("Unable to write multipart boundary", e2);
        }
    }

    public final void addPart(String str, String str2, TypedOutput typedOutput) {
        Objects.requireNonNull(str, "Part name must not be null.");
        Objects.requireNonNull(str2, "Transfer encoding must not be null.");
        Objects.requireNonNull(typedOutput, "Part body must not be null.");
        MimePart mimePart = new MimePart(str, str2, typedOutput, this.boundary, this.mimeParts.isEmpty());
        this.mimeParts.add(mimePart);
        long size = mimePart.size();
        if (size == -1) {
            this.length = -1;
            return;
        }
        long j2 = this.length;
        if (j2 != -1) {
            this.length = j2 + size;
        }
    }

    public static byte[] buildHeader(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length2 = typedOutput.length();
            if (length2 != -1) {
                sb.append("\r\nContent-Length: ").append(length2);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e2) {
            throw new RuntimeException("Unable to write multipart header", e2);
        }
    }
}
