package com.bytedance.ies.ugc.appcontext;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(20740);
    }

    /* access modifiers changed from: package-private */
    public static final class a<A, B> {

        /* renamed from: a  reason: collision with root package name */
        public final A f34589a;

        /* renamed from: b  reason: collision with root package name */
        public final B f34590b;

        static {
            Covode.recordClassIndex(20741);
        }

        public final int hashCode() {
            int hashCode;
            A a2 = this.f34589a;
            int i2 = 0;
            if (a2 == null) {
                hashCode = 0;
            } else {
                hashCode = a2.hashCode();
            }
            int i3 = (hashCode + 31) * 31;
            B b2 = this.f34590b;
            if (b2 != null) {
                i2 = b2.hashCode();
            }
            return i3 + i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            A a2 = this.f34589a;
            if (a2 == null) {
                if (aVar.f34589a != null) {
                    return false;
                }
            } else if (!a2.equals(aVar.f34589a)) {
                return false;
            }
            B b2 = this.f34590b;
            if (b2 == null) {
                if (aVar.f34590b != null) {
                    return false;
                }
            } else if (!b2.equals(aVar.f34590b)) {
                return false;
            }
            return true;
        }

        a(A a2, B b2) {
            this.f34589a = a2;
            this.f34590b = b2;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.b$b  reason: collision with other inner class name */
    public static class C0779b extends Exception {
        private static final long serialVersionUID = 1;

        static {
            Covode.recordClassIndex(20742);
        }

        public C0779b(String str) {
            super(str);
        }

        public C0779b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L_0x0008
            return r6
        L_0x0008:
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "r"
            r5.<init>(r7, r0)     // Catch:{ all -> 0x0055 }
            java.nio.channels.FileChannel r0 = r5.getChannel()     // Catch:{ all -> 0x0056 }
            com.bytedance.ies.ugc.appcontext.b$a r0 = a(r0)     // Catch:{ all -> 0x0056 }
            A r0 = r0.f34589a     // Catch:{ all -> 0x0056 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x0056 }
            java.util.Map r2 = a(r0)     // Catch:{ all -> 0x0056 }
            r1 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0056 }
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0056 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0056 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x0056 }
            byte[] r3 = r0.array()     // Catch:{ all -> 0x0056 }
            int r2 = r0.arrayOffset()     // Catch:{ all -> 0x0056 }
            int r1 = r0.position()     // Catch:{ all -> 0x0056 }
            int r1 = r1 + r2
            int r0 = r0.limit()     // Catch:{ all -> 0x0056 }
            int r2 = r2 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r1, r2)     // Catch:{ all -> 0x0056 }
            r4.<init>(r0)     // Catch:{ all -> 0x0056 }
            r5.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            return r4
        L_0x0055:
            r5 = r6
        L_0x0056:
            if (r5 == 0) goto L_0x005b
        L_0x0058:
            r5.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.appcontext.b.a(java.lang.String):java.lang.String");
    }

    private static a<ByteBuffer, Long> a(FileChannel fileChannel) {
        long size = fileChannel.size();
        if (size >= 22) {
            long j2 = size - 22;
            long min = Math.min(j2, 65535L);
            int i2 = 0;
            while (true) {
                long j3 = (long) i2;
                if (j3 <= min) {
                    long j4 = j2 - j3;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j4);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j4 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i2) {
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(ByteOrder.LITTLE_ENDIAN);
                            fileChannel.position((fileChannel.size() - ((long) s)) - 6);
                            fileChannel.read(allocate3);
                            long j5 = (long) allocate3.getInt(0);
                            if (j5 >= 32) {
                                fileChannel.position(j5 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(ByteOrder.LITTLE_ENDIAN);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j6 = allocate4.getLong(0);
                                    if (j6 < ((long) allocate4.capacity()) || j6 > 2147483639) {
                                        throw new C0779b("APK Signing Block size out of range: ".concat(String.valueOf(j6)));
                                    }
                                    int i3 = (int) (8 + j6);
                                    long j7 = j5 - ((long) i3);
                                    if (j7 >= 0) {
                                        fileChannel.position(j7);
                                        ByteBuffer allocate5 = ByteBuffer.allocate(i3);
                                        fileChannel.read(allocate5);
                                        allocate5.order(ByteOrder.LITTLE_ENDIAN);
                                        long j8 = allocate5.getLong(0);
                                        if (j8 == j6) {
                                            return new a<>(allocate5, Long.valueOf(j7));
                                        }
                                        throw new C0779b("APK Signing Block sizes in header and footer do not match: " + j8 + " vs " + j6);
                                    }
                                    throw new C0779b("APK Signing Block offset out of range: ".concat(String.valueOf(j7)));
                                }
                                throw new C0779b("No APK Signing Block before ZIP Central Directory");
                            }
                            throw new C0779b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(j5)));
                        }
                    }
                    i2++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    private static Map<Integer, ByteBuffer> a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer a2 = a(byteBuffer, byteBuffer.capacity() - 24);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            while (a2.hasRemaining()) {
                i2++;
                if (a2.remaining() >= 8) {
                    long j2 = a2.getLong();
                    if (j2 < 4 || j2 > 2147483647L) {
                        throw new C0779b("APK Signing Block entry #" + i2 + " size out of range: " + j2);
                    }
                    int i3 = (int) j2;
                    int position = a2.position() + i3;
                    if (i3 <= a2.remaining()) {
                        linkedHashMap.put(Integer.valueOf(a2.getInt()), b(a2, i3 - 4));
                        a2.position(position);
                    } else {
                        throw new C0779b("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + a2.remaining());
                    }
                } else {
                    throw new C0779b("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i2)));
                }
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i2) {
        if (i2 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i3 = i2 + position;
            if (i3 < position || i3 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i3);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i3);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i2)));
        }
    }

    /* JADX INFO: finally extract failed */
    private static ByteBuffer a(ByteBuffer byteBuffer, int i2) {
        if (i2 >= 8) {
            int capacity = byteBuffer.capacity();
            if (i2 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i2);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i2 + " < 8");
        }
    }
}
