package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.aa;
import k.ab;
import k.f;
import k.h;
import k.i;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* access modifiers changed from: package-private */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final h source;

    /* access modifiers changed from: package-private */
    public interface Handler {
        static {
            Covode.recordClassIndex(106277);
        }

        void ackSettings();

        void alternateService(int i2, String str, i iVar, String str2, int i3, long j2);

        void data(boolean z, int i2, h hVar, int i3);

        void goAway(int i2, ErrorCode errorCode, i iVar);

        void headers(boolean z, int i2, int i3, List<Header> list);

        void ping(boolean z, int i2, int i3);

        void priority(int i2, int i3, int i4, boolean z);

        void pushPromise(int i2, int i3, List<Header> list);

        void rstStream(int i2, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i2, long j2);
    }

    /* access modifiers changed from: package-private */
    public static final class ContinuationSource implements aa {
        byte flags;
        int left;
        int length;
        short padding;
        private final h source;
        int streamId;

        static {
            Covode.recordClassIndex(106276);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // k.aa
        public final ab timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() {
            int i2 = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte h2 = (byte) (this.source.h() & 255);
            this.flags = (byte) (this.source.h() & 255);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, h2, this.flags));
            }
            int j2 = this.source.j() & Integer.MAX_VALUE;
            this.streamId = j2;
            if (h2 != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(h2));
            } else if (j2 != i2) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        ContinuationSource(h hVar) {
            this.source = hVar;
        }

        @Override // k.aa
        public final long read(f fVar, long j2) {
            while (true) {
                int i2 = this.left;
                if (i2 == 0) {
                    this.source.l((long) this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1;
                    }
                    readContinuationHeader();
                } else {
                    long read = this.source.read(fVar, Math.min(j2, (long) i2));
                    if (read == -1) {
                        return -1;
                    }
                    this.left = (int) (((long) this.left) - read);
                    return read;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.source.close();
    }

    static {
        Covode.recordClassIndex(106275);
    }

    static int readMedium(h hVar) {
        return (hVar.h() & 255) | ((hVar.h() & 255) << 16) | ((hVar.h() & 255) << 8);
    }

    public final void readConnectionPreface(Handler handler) {
        if (!this.client) {
            i g2 = this.source.g((long) Http2.CONNECTION_PREFACE.size());
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format("<< CONNECTION %s", g2.hex()));
            }
            if (!Http2.CONNECTION_PREFACE.equals(g2)) {
                throw Http2.ioException("Expected a connection header but was %s", g2.utf8());
            }
        } else if (!nextFrame(true, handler)) {
            throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
        }
    }

    Http2Reader(h hVar, boolean z) {
        this.source = hVar;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(hVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(4096, continuationSource);
    }

    private void readPriority(Handler handler, int i2) {
        boolean z;
        int j2 = this.source.j();
        if ((Integer.MIN_VALUE & j2) != 0) {
            z = true;
        } else {
            z = false;
        }
        handler.priority(i2, j2 & Integer.MAX_VALUE, (this.source.h() & 255) + 1, z);
    }

    public final boolean nextFrame(boolean z, Handler handler) {
        try {
            this.source.d(9);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
            }
            byte h2 = (byte) (this.source.h() & 255);
            if (!z || h2 == 4) {
                byte h3 = (byte) (this.source.h() & 255);
                int j2 = this.source.j() & Integer.MAX_VALUE;
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.frameLog(true, j2, readMedium, h2, h3));
                }
                switch (h2) {
                    case 0:
                        readData(handler, readMedium, h3, j2);
                        break;
                    case 1:
                        readHeaders(handler, readMedium, h3, j2);
                        break;
                    case 2:
                        readPriority(handler, readMedium, h3, j2);
                        break;
                    case 3:
                        readRstStream(handler, readMedium, h3, j2);
                        break;
                    case 4:
                        readSettings(handler, readMedium, h3, j2);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        readPushPromise(handler, readMedium, h3, j2);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        readPing(handler, readMedium, h3, j2);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        readGoAway(handler, readMedium, h3, j2);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        readWindowUpdate(handler, readMedium, h3, j2);
                        break;
                    default:
                        this.source.l((long) readMedium);
                        break;
                }
                return true;
            }
            throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(h2));
        } catch (IOException unused) {
            return false;
        }
    }

    static int lengthWithoutPadding(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }

    private List<Header> readHeaderBlock(int i2, short s, byte b2, int i3) {
        ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i2;
        continuationSource.length = i2;
        this.continuation.padding = s;
        this.continuation.flags = b2;
        this.continuation.streamId = i3;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readData(Handler handler, int i2, byte b2, int i3) {
        boolean z;
        short s = 0;
        if (i3 != 0) {
            if ((b2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b2 & 32) != 0) {
                throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            if ((b2 & 8) != 0) {
                s = (short) (this.source.h() & 255);
            }
            handler.data(z, i3, this.source, lengthWithoutPadding(i2, b2, s));
            this.source.l((long) s);
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    private void readHeaders(Handler handler, int i2, byte b2, int i3) {
        boolean z;
        short s = 0;
        if (i3 != 0) {
            if ((b2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b2 & 8) != 0) {
                s = (short) (this.source.h() & 255);
            }
            if ((b2 & 32) != 0) {
                readPriority(handler, i3);
                i2 -= 5;
            }
            handler.headers(z, i3, -1, readHeaderBlock(lengthWithoutPadding(i2, b2, s), s, b2, i3));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    private void readPing(Handler handler, int i2, byte b2, int i3) {
        boolean z = false;
        if (i2 != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i2));
        } else if (i3 == 0) {
            int j2 = this.source.j();
            int j3 = this.source.j();
            if ((b2 & 1) != 0) {
                z = true;
            }
            handler.ping(z, j2, j3);
        } else {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    private void readPriority(Handler handler, int i2, byte b2, int i3) {
        if (i2 != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i2));
        } else if (i3 != 0) {
            readPriority(handler, i3);
        } else {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    private void readPushPromise(Handler handler, int i2, byte b2, int i3) {
        short s = 0;
        if (i3 != 0) {
            if ((b2 & 8) != 0) {
                s = (short) (this.source.h() & 255);
            }
            handler.pushPromise(i3, this.source.j() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i2 - 4, b2, s), s, b2, i3));
            return;
        }
        throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    private void readRstStream(Handler handler, int i2, byte b2, int i3) {
        if (i2 != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
        } else if (i3 != 0) {
            int j2 = this.source.j();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(j2);
            if (fromHttp2 != null) {
                handler.rstStream(i3, fromHttp2);
            } else {
                throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j2));
            }
        } else {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    private void readWindowUpdate(Handler handler, int i2, byte b2, int i3) {
        if (i2 == 4) {
            long j2 = ((long) this.source.j()) & 2147483647L;
            if (j2 != 0) {
                handler.windowUpdate(i3, j2);
            } else {
                throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(j2));
            }
        } else {
            throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
        }
    }

    private void readGoAway(Handler handler, int i2, byte b2, int i3) {
        if (i2 < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
        } else if (i3 == 0) {
            int j2 = this.source.j();
            int j3 = this.source.j();
            int i4 = i2 - 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(j3);
            if (fromHttp2 != null) {
                i iVar = i.EMPTY;
                if (i4 > 0) {
                    iVar = this.source.g((long) i4);
                }
                handler.goAway(j2, fromHttp2, iVar);
                return;
            }
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j3));
        } else {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    private void readSettings(Handler handler, int i2, byte b2, int i3) {
        if (i3 != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b2 & 1) != 0) {
            if (i2 == 0) {
                handler.ackSettings();
                return;
            }
            throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i2 % 6 == 0) {
            Settings settings = new Settings();
            for (int i4 = 0; i4 < i2; i4 += 6) {
                int i5 = this.source.i() & 65535;
                int j2 = this.source.j();
                if (i5 != 2) {
                    if (i5 == 3) {
                        i5 = 4;
                    } else if (i5 == 4) {
                        i5 = 7;
                        if (j2 < 0) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (i5 == 5 && (j2 < 16384 || j2 > 16777215)) {
                        throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(j2));
                    }
                } else if (!(j2 == 0 || j2 == 1)) {
                    throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                settings.set(i5, j2);
            }
            handler.settings(false, settings);
        } else {
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
        }
    }
}
