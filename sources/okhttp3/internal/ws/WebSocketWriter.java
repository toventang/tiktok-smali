package okhttp3.internal.ws;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import k.ab;
import k.f;
import k.g;
import k.i;
import k.y;

/* access modifiers changed from: package-private */
public final class WebSocketWriter {
    boolean activeWriter;
    final f buffer = new f();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final f.b maskCursor;
    private final byte[] maskKey;
    final Random random;
    final g sink;
    final f sinkBuffer;
    boolean writerClosed;

    static {
        Covode.recordClassIndex(106330);
    }

    /* access modifiers changed from: package-private */
    public final class FrameSink implements y {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        static {
            Covode.recordClassIndex(106331);
        }

        @Override // k.y
        public final ab timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.f158864b, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.f158864b, this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        FrameSink() {
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            boolean z;
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(fVar, j2);
                if (!this.isFirstFrame || this.contentLength == -1 || WebSocketWriter.this.buffer.f158864b <= this.contentLength - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long g2 = WebSocketWriter.this.buffer.g();
                if (g2 > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, g2, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void writePing(i iVar) {
        writeControlFrame(9, iVar);
    }

    /* access modifiers changed from: package-private */
    public final void writePong(i iVar) {
        writeControlFrame(10, iVar);
    }

    /* access modifiers changed from: package-private */
    public final y newMessageSink(int i2, long j2) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            this.frameSink.formatOpcode = i2;
            this.frameSink.contentLength = j2;
            this.frameSink.isFirstFrame = true;
            this.frameSink.closed = false;
            return this.frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        if (r5 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeClose(int r4, k.i r5) {
        /*
            r3 = this;
            k.i r2 = k.i.EMPTY
            if (r4 != 0) goto L_0x001b
            if (r5 == 0) goto L_0x0017
        L_0x0006:
            k.f r0 = new k.f
            r0.<init>()
            r0.b(r4)
            if (r5 == 0) goto L_0x0013
            r0.a(r5)
        L_0x0013:
            k.i r2 = r0.q()
        L_0x0017:
            r0 = 8
            r1 = 1
            goto L_0x001f
        L_0x001b:
            okhttp3.internal.ws.WebSocketProtocol.validateCloseCode(r4)
            goto L_0x0006
        L_0x001f:
            r3.writeControlFrame(r0, r2)     // Catch:{ all -> 0x0025 }
            r3.writerClosed = r1
            return
        L_0x0025:
            r0 = move-exception
            r3.writerClosed = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketWriter.writeClose(int, k.i):void");
    }

    private void writeControlFrame(int i2, i iVar) {
        if (!this.writerClosed) {
            int size = iVar.size();
            if (((long) size) <= 125) {
                this.sinkBuffer.a(i2 | 128);
                if (this.isClient) {
                    this.sinkBuffer.a(size | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.a(this.maskKey);
                    if (size > 0) {
                        long j2 = this.sinkBuffer.f158864b;
                        this.sinkBuffer.a(iVar);
                        this.sinkBuffer.a(this.maskCursor);
                        this.maskCursor.a(j2);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.a(size);
                    this.sinkBuffer.a(iVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    WebSocketWriter(boolean z, g gVar, Random random2) {
        byte[] bArr;
        Objects.requireNonNull(gVar, "sink == null");
        Objects.requireNonNull(random2, "random == null");
        this.isClient = z;
        this.sink = gVar;
        this.sinkBuffer = gVar.a();
        this.random = random2;
        f.b bVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.maskKey = bArr;
        this.maskCursor = z ? new f.b() : bVar;
    }

    /* access modifiers changed from: package-private */
    public final void writeMessageFrame(int i2, long j2, boolean z, boolean z2) {
        if (!this.writerClosed) {
            int i3 = 0;
            if (!z) {
                i2 = 0;
            }
            if (z2) {
                i2 |= 128;
            }
            this.sinkBuffer.a(i2);
            if (this.isClient) {
                i3 = 128;
            }
            if (j2 <= 125) {
                this.sinkBuffer.a(((int) j2) | i3);
            } else if (j2 <= 65535) {
                this.sinkBuffer.a(i3 | 126);
                this.sinkBuffer.b((int) j2);
            } else {
                this.sinkBuffer.a(i3 | 127);
                this.sinkBuffer.m(j2);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.a(this.maskKey);
                if (j2 > 0) {
                    long j3 = this.sinkBuffer.f158864b;
                    this.sinkBuffer.write(this.buffer, j2);
                    this.sinkBuffer.a(this.maskCursor);
                    this.maskCursor.a(j3);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j2);
            }
            this.sink.c();
            return;
        }
        throw new IOException("closed");
    }
}
