package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.f;
import k.g;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* access modifiers changed from: package-private */
public final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final f hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize = 16384;
    private final g sink;

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    static {
        Covode.recordClassIndex(106282);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(149);
        this.closed = true;
        this.sink.close();
        MethodCollector.o(149);
    }

    public final synchronized void flush() {
        MethodCollector.i(110);
        if (!this.closed) {
            this.sink.flush();
            MethodCollector.o(110);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(110);
            throw iOException;
        }
    }

    public final synchronized void connectionPreface() {
        MethodCollector.i(6684);
        if (this.closed) {
            IOException iOException = new IOException("closed");
            MethodCollector.o(6684);
            throw iOException;
        } else if (!this.client) {
            MethodCollector.o(6684);
        } else {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.hex()));
            }
            this.sink.a(Http2.CONNECTION_PREFACE.toByteArray());
            this.sink.flush();
            MethodCollector.o(6684);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) {
        MethodCollector.i(6852);
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
            MethodCollector.o(6852);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(6852);
            throw iOException;
        }
    }

    public final synchronized void settings(Settings settings) {
        int i2;
        MethodCollector.i(129);
        if (!this.closed) {
            int i3 = 0;
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            while (true) {
                if (settings.isSet(i3)) {
                    if (i3 == 4) {
                        i2 = 3;
                    } else if (i3 == 7) {
                        i2 = 4;
                    } else {
                        i2 = i3;
                    }
                    this.sink.b(i2);
                    this.sink.c(settings.get(i3));
                }
                i3++;
                if (i3 >= 10) {
                    this.sink.flush();
                    MethodCollector.o(129);
                }
            }
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(129);
            throw iOException;
        }
    }

    Http2Writer(g gVar, boolean z) {
        this.sink = gVar;
        this.client = z;
        f fVar = new f();
        this.hpackBuffer = fVar;
        this.hpackWriter = new Hpack.Writer(fVar);
    }

    private static void writeMedium(g gVar, int i2) {
        gVar.a((i2 >>> 16) & 255);
        gVar.a((i2 >>> 8) & 255);
        gVar.a(i2 & 255);
    }

    private void writeContinuationFrames(int i2, long j2) {
        byte b2;
        while (j2 > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j2);
            long j3 = (long) min;
            j2 -= j3;
            if (j2 == 0) {
                b2 = 4;
            } else {
                b2 = 0;
            }
            frameHeader(i2, min, (byte) 9, b2);
            this.sink.write(this.hpackBuffer, j3);
        }
    }

    public final synchronized void headers(int i2, List<Header> list) {
        MethodCollector.i(122);
        if (!this.closed) {
            headers(false, i2, list);
            MethodCollector.o(122);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(122);
            throw iOException;
        }
    }

    public final synchronized void rstStream(int i2, ErrorCode errorCode) {
        MethodCollector.i(124);
        if (this.closed) {
            IOException iOException = new IOException("closed");
            MethodCollector.o(124);
            throw iOException;
        } else if (errorCode.httpCode != -1) {
            frameHeader(i2, 4, (byte) 3, (byte) 0);
            this.sink.c(errorCode.httpCode);
            this.sink.flush();
            MethodCollector.o(124);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            MethodCollector.o(124);
            throw illegalArgumentException;
        }
    }

    public final synchronized void windowUpdate(int i2, long j2) {
        MethodCollector.i(145);
        if (this.closed) {
            IOException iOException = new IOException("closed");
            MethodCollector.o(145);
            throw iOException;
        } else if (j2 == 0 || j2 > 2147483647L) {
            IllegalArgumentException illegalArgument = Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            MethodCollector.o(145);
            throw illegalArgument;
        } else {
            frameHeader(i2, 4, (byte) 8, (byte) 0);
            this.sink.c((int) j2);
            this.sink.flush();
            MethodCollector.o(145);
        }
    }

    public final synchronized void synReply(boolean z, int i2, List<Header> list) {
        MethodCollector.i(121);
        if (!this.closed) {
            headers(z, i2, list);
            MethodCollector.o(121);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(121);
            throw iOException;
        }
    }

    public final synchronized void ping(boolean z, int i2, int i3) {
        byte b2;
        MethodCollector.i(132);
        if (!this.closed) {
            if (z) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            frameHeader(0, 8, (byte) 6, b2);
            this.sink.c(i2);
            this.sink.c(i3);
            this.sink.flush();
            MethodCollector.o(132);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(132);
            throw iOException;
        }
    }

    public final synchronized void goAway(int i2, ErrorCode errorCode, byte[] bArr) {
        MethodCollector.i(139);
        if (this.closed) {
            IOException iOException = new IOException("closed");
            MethodCollector.o(139);
            throw iOException;
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.sink.c(i2);
            this.sink.c(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.a(bArr);
            }
            this.sink.flush();
            MethodCollector.o(139);
        } else {
            IllegalArgumentException illegalArgument = Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            MethodCollector.o(139);
            throw illegalArgument;
        }
    }

    /* access modifiers changed from: package-private */
    public final void headers(boolean z, int i2, List<Header> list) {
        byte b2;
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j2 = this.hpackBuffer.f158864b;
            int min = (int) Math.min((long) this.maxFrameSize, j2);
            long j3 = (long) min;
            if (j2 == j3) {
                b2 = 4;
            } else {
                b2 = 0;
            }
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            frameHeader(i2, min, (byte) 1, b2);
            this.sink.write(this.hpackBuffer, j3);
            if (j2 > j3) {
                writeContinuationFrames(i2, j2 - j3);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void pushPromise(int i2, int i3, List<Header> list) {
        byte b2;
        MethodCollector.i(109);
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long j2 = this.hpackBuffer.f158864b;
            int min = (int) Math.min((long) (this.maxFrameSize - 4), j2);
            long j3 = (long) min;
            if (j2 == j3) {
                b2 = 4;
            } else {
                b2 = 0;
            }
            frameHeader(i2, min + 4, (byte) 5, b2);
            this.sink.c(i3 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j3);
            if (j2 > j3) {
                writeContinuationFrames(i2, j2 - j3);
            }
            MethodCollector.o(109);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(109);
            throw iOException;
        }
    }

    /* access modifiers changed from: package-private */
    public final void dataFrame(int i2, byte b2, f fVar, int i3) {
        frameHeader(i2, i3, (byte) 0, b2);
        if (i3 > 0) {
            this.sink.write(fVar, (long) i3);
        }
    }

    public final synchronized void data(boolean z, int i2, f fVar, int i3) {
        MethodCollector.i(126);
        if (!this.closed) {
            dataFrame(i2, z ? (byte) 1 : 0, fVar, i3);
            MethodCollector.o(126);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(126);
            throw iOException;
        }
    }

    public final synchronized void synStream(boolean z, int i2, int i3, List<Header> list) {
        MethodCollector.i(119);
        if (!this.closed) {
            headers(z, i2, list);
            MethodCollector.o(119);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.o(119);
            throw iOException;
        }
    }

    public final void frameHeader(int i2, int i3, byte b2, byte b3) {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.frameLog(false, i2, i3, b2, b3));
        }
        int i4 = this.maxFrameSize;
        if (i3 > i4) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            writeMedium(this.sink, i3);
            this.sink.a(b2 & 255);
            this.sink.a(b3 & 255);
            this.sink.c(i2 & Integer.MAX_VALUE);
        } else {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i2));
        }
    }
}
