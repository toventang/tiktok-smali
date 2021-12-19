package okhttp3.internal.ws;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k.f;
import k.h;
import k.i;

/* access modifiers changed from: package-private */
public final class WebSocketReader {
    boolean closed;
    private final f controlFrameBuffer = new f();
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final f.b maskCursor;
    private final byte[] maskKey;
    private final f messageFrameBuffer = new f();
    int opcode;
    final h source;

    public interface FrameCallback {
        static {
            Covode.recordClassIndex(106329);
        }

        void onReadClose(int i2, String str);

        void onReadMessage(String str);

        void onReadMessage(i iVar);

        void onReadPing(i iVar);

        void onReadPong(i iVar);
    }

    static {
        Covode.recordClassIndex(106328);
    }

    private void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    private void readMessageFrame() {
        int i2 = this.opcode;
        if (i2 == 1 || i2 == 2) {
            readMessage();
            if (i2 == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.r());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.q());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i2));
        }
    }

    private void readMessage() {
        while (!this.closed) {
            long j2 = this.frameLength;
            if (j2 > 0) {
                this.source.a(this.messageFrameBuffer, j2);
                if (!this.isClient) {
                    this.messageFrameBuffer.a(this.maskCursor);
                    this.maskCursor.a(this.messageFrameBuffer.f158864b - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private void readControlFrame() {
        String str;
        long j2 = this.frameLength;
        if (j2 > 0) {
            this.source.a(this.controlFrameBuffer, j2);
            if (!this.isClient) {
                this.controlFrameBuffer.a(this.maskCursor);
                this.maskCursor.a(0);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                short s = 1005;
                long j3 = this.controlFrameBuffer.f158864b;
                if (j3 != 1) {
                    if (j3 != 0) {
                        s = this.controlFrameBuffer.i();
                        str = this.controlFrameBuffer.r();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                this.frameCallback.onReadPing(this.controlFrameBuffer.q());
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                this.frameCallback.onReadPong(this.controlFrameBuffer.q());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX INFO: finally extract failed */
    private void readHeader() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int h2 = this.source.h() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = h2 & 15;
                boolean z6 = true;
                if ((h2 & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.isFinalFrame = z;
                if ((h2 & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.isControlFrame = z2;
                if (!z2 || z) {
                    if ((h2 & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((h2 & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((h2 & 16) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int h3 = this.source.h() & 255;
                    if ((h3 & 128) == 0) {
                        z6 = false;
                    }
                    if (z6 == this.isClient) {
                        if (this.isClient) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j2 = (long) (h3 & 127);
                    this.frameLength = j2;
                    if (j2 == 126) {
                        this.frameLength = ((long) this.source.i()) & 65535;
                    } else if (j2 == 127) {
                        long k2 = this.source.k();
                        this.frameLength = k2;
                        if (k2 < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.source.b(this.maskKey);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    WebSocketReader(boolean z, h hVar, FrameCallback frameCallback2) {
        byte[] bArr;
        Objects.requireNonNull(hVar, "source == null");
        Objects.requireNonNull(frameCallback2, "frameCallback == null");
        this.isClient = z;
        this.source = hVar;
        this.frameCallback = frameCallback2;
        f.b bVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.maskKey = bArr;
        this.maskCursor = !z ? new f.b() : bVar;
    }
}
