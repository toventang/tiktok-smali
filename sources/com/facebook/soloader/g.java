package com.facebook.soloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class g {
    static {
        Covode.recordClassIndex(30766);
    }

    /* access modifiers changed from: package-private */
    public static class a extends RuntimeException {
        static {
            Covode.recordClassIndex(30767);
        }

        a(String str) {
            super(str);
        }
    }

    public static String[] a(File file) {
        MethodCollector.i(5030);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
            MethodCollector.o(5030);
        }
    }

    private static String[] a(FileChannel fileChannel) {
        long j2;
        long c2;
        int c3;
        long a2;
        long a3;
        long j3;
        long a4;
        long a5;
        long a6;
        long a7;
        long j4;
        long a8;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (b(fileChannel, allocate, 0) == 1179403647) {
            boolean z = true;
            if (d(fileChannel, allocate, 4) != 1) {
                z = false;
            }
            if (d(fileChannel, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j2 = b(fileChannel, allocate, 28);
                if (z) {
                    c2 = (long) c(fileChannel, allocate, 44);
                    c3 = c(fileChannel, allocate, 42);
                }
                c2 = (long) c(fileChannel, allocate, 56);
                c3 = c(fileChannel, allocate, 54);
            } else {
                j2 = a(fileChannel, allocate, 32);
                c2 = (long) c(fileChannel, allocate, 56);
                c3 = c(fileChannel, allocate, 54);
            }
            if (c2 == 65535) {
                if (z) {
                    c2 = b(fileChannel, allocate, b(fileChannel, allocate, 32) + 28);
                } else {
                    c2 = b(fileChannel, allocate, a(fileChannel, allocate, 40) + 44);
                }
            }
            long j5 = j2;
            long j6 = 0;
            while (true) {
                if (j6 >= c2) {
                    break;
                } else if (b(fileChannel, allocate, j5 + 0) == 2) {
                    if (z) {
                        a2 = b(fileChannel, allocate, j5 + 4);
                    } else {
                        a2 = a(fileChannel, allocate, j5 + 8);
                    }
                    long j7 = 0;
                    if (a2 != 0) {
                        long j8 = a2;
                        long j9 = 0;
                        int i2 = 0;
                        while (true) {
                            if (z) {
                                a3 = b(fileChannel, allocate, j8 + j7);
                            } else {
                                z = false;
                                a3 = a(fileChannel, allocate, j8 + j7);
                            }
                            if (a3 == 1) {
                                if (i2 != Integer.MAX_VALUE) {
                                    i2++;
                                } else {
                                    throw new a("malformed DT_NEEDED section");
                                }
                            } else if (a3 == 5) {
                                if (z) {
                                    j9 = b(fileChannel, allocate, j8 + 4);
                                } else {
                                    j9 = a(fileChannel, allocate, j8 + 8);
                                }
                            }
                            long j10 = 16;
                            if (z) {
                                j3 = 8;
                            } else {
                                j3 = 16;
                            }
                            j8 += j3;
                            j7 = 0;
                            if (a3 == 0) {
                                if (j9 != 0) {
                                    int i3 = 0;
                                    while (true) {
                                        if (((long) i3) >= c2) {
                                            break;
                                        }
                                        if (b(fileChannel, allocate, j2 + j7) == 1) {
                                            if (z) {
                                                a4 = b(fileChannel, allocate, j2 + 8);
                                                a5 = b(fileChannel, allocate, j2 + 20);
                                            } else {
                                                a4 = a(fileChannel, allocate, j2 + j10);
                                                a5 = a(fileChannel, allocate, j2 + 40);
                                            }
                                            if (a4 <= j9 && j9 < a5 + a4) {
                                                if (z) {
                                                    a6 = b(fileChannel, allocate, j2 + 4);
                                                } else {
                                                    a6 = a(fileChannel, allocate, j2 + 8);
                                                }
                                                long j11 = a6 + (j9 - a4);
                                                long j12 = 0;
                                                if (j11 != 0) {
                                                    String[] strArr = new String[i2];
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (z) {
                                                            a7 = b(fileChannel, allocate, a2 + j12);
                                                        } else {
                                                            a7 = a(fileChannel, allocate, a2 + j12);
                                                        }
                                                        if (a7 == 1) {
                                                            if (z) {
                                                                a8 = b(fileChannel, allocate, a2 + 4);
                                                            } else {
                                                                a8 = a(fileChannel, allocate, a2 + 8);
                                                            }
                                                            long j13 = a8 + j11;
                                                            StringBuilder sb = new StringBuilder();
                                                            while (true) {
                                                                long j14 = j13 + 1;
                                                                short d2 = d(fileChannel, allocate, j13);
                                                                if (d2 == 0) {
                                                                    break;
                                                                }
                                                                sb.append((char) d2);
                                                                j13 = j14;
                                                            }
                                                            strArr[i4] = sb.toString();
                                                            if (i4 != Integer.MAX_VALUE) {
                                                                i4++;
                                                            } else {
                                                                throw new a("malformed DT_NEEDED section");
                                                            }
                                                        }
                                                        if (z) {
                                                            j4 = 8;
                                                        } else {
                                                            j4 = 16;
                                                        }
                                                        a2 += j4;
                                                        if (a7 != 0) {
                                                            j12 = 0;
                                                        } else if (i4 == i2) {
                                                            return strArr;
                                                        } else {
                                                            throw new a("malformed DT_NEEDED section");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        j2 += (long) c3;
                                        i3++;
                                        j10 = 16;
                                        j7 = 0;
                                    }
                                    throw new a("did not find file offset of DT_STRTAB table");
                                }
                                throw new a("Dynamic section string-table not found");
                            }
                        }
                    }
                } else {
                    j5 += (long) c3;
                    j6++;
                }
            }
            throw new a("ELF file does not contain dynamic linking information");
        }
        throw new a("file is not ELF");
    }

    private static long a(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) {
        a(fileChannel, byteBuffer, 8, j2);
        return byteBuffer.getLong();
    }

    private static long b(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) {
        a(fileChannel, byteBuffer, 4, j2);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static int c(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) {
        a(fileChannel, byteBuffer, 2, j2);
        return byteBuffer.getShort() & 65535;
    }

    private static short d(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) {
        a(fileChannel, byteBuffer, 1, j2);
        return (short) (byteBuffer.get() & 255);
    }

    private static void a(FileChannel fileChannel, ByteBuffer byteBuffer, int i2, long j2) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j2)) != -1) {
            j2 += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new a("ELF file truncated");
    }
}
