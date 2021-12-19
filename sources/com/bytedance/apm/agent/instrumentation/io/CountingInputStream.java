package com.bytedance.apm.agent.instrumentation.io;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CountingInputStream extends InputStream implements StreamCompleteListenerSource {
    private static final AgentLog log = AgentLogManager.getAgentLog();
    private final ByteBuffer buffer;
    private long count;
    private boolean enableBuffering = false;
    private final InputStream impl;
    private final StreamCompleteListenerManager listenerManager = new StreamCompleteListenerManager();

    public final boolean markSupported() {
        return this.impl.markSupported();
    }

    static {
        Covode.recordClassIndex(14340);
    }

    private boolean bufferEmpty() {
        if (this.buffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    private int readBuffer() {
        if (bufferEmpty()) {
            return -1;
        }
        return this.buffer.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        try {
            this.impl.close();
            notifyStreamComplete();
        } catch (IOException e2) {
            notifyStreamError(e2);
            throw e2;
        }
    }

    private void notifyStreamComplete() {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamComplete(new StreamCompleteEvent(this, this.count));
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        int i2;
        if (this.enableBuffering) {
            i2 = this.buffer.remaining();
        } else {
            i2 = 0;
        }
        try {
            return i2 + this.impl.available();
        } catch (IOException e2) {
            notifyStreamError(e2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        if (markSupported()) {
            try {
                this.impl.reset();
            } catch (IOException e2) {
                notifyStreamError(e2);
                throw e2;
            }
        }
    }

    public final String getBufferAsString() {
        String str;
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer == null) {
            return "";
        }
        synchronized (byteBuffer) {
            byte[] bArr = new byte[this.buffer.limit()];
            for (int i2 = 0; i2 < this.buffer.limit(); i2++) {
                bArr[i2] = this.buffer.get(i2);
            }
            str = new String(bArr);
        }
        return str;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes(1)) {
                    int readBuffer = readBuffer();
                    if (readBuffer >= 0) {
                        this.count++;
                    }
                    return readBuffer;
                }
            }
        }
        try {
            int read = this.impl.read();
            if (read >= 0) {
                this.count++;
            } else {
                notifyStreamComplete();
            }
            return read;
        } catch (IOException e2) {
            notifyStreamError(e2);
            throw e2;
        }
    }

    public final void fillBuffer() {
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null && byteBuffer.hasArray()) {
            synchronized (this.buffer) {
                try {
                    int read = this.impl.read(this.buffer.array(), 0, this.buffer.capacity());
                    if (read <= 0) {
                        this.buffer.limit(0);
                    } else if (read < this.buffer.capacity()) {
                        this.buffer.limit(read);
                    }
                } catch (IOException e2) {
                    log.error(e2.toString());
                }
            }
        }
    }

    public final void setBufferingEnabled(boolean z) {
        this.enableBuffering = z;
    }

    private int readBufferBytes(byte[] bArr) {
        return readBufferBytes(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public final void addStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.addStreamCompleteListener(streamCompleteListener);
    }

    @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListenerSource
    public final void removeStreamCompleteListener(StreamCompleteListener streamCompleteListener) {
        this.listenerManager.removeStreamCompleteListener(streamCompleteListener);
    }

    private boolean bufferHasBytes(long j2) {
        if (((long) this.buffer.remaining()) >= j2) {
            return true;
        }
        return false;
    }

    public final void mark(int i2) {
        if (markSupported()) {
            this.impl.mark(i2);
        }
    }

    public CountingInputStream(InputStream inputStream) {
        this.impl = inputStream;
        this.buffer = null;
    }

    private void notifyStreamError(Exception exc) {
        if (!this.listenerManager.isComplete()) {
            this.listenerManager.notifyStreamError(new StreamCompleteEvent(this, this.count, exc));
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes((long) length)) {
                    int readBufferBytes = readBufferBytes(bArr);
                    if (readBufferBytes >= 0) {
                        this.count += (long) readBufferBytes;
                        return readBufferBytes;
                    }
                    throw new IOException("readBufferBytes failed");
                }
                int remaining = this.buffer.remaining();
                if (remaining > 0) {
                    i2 = readBufferBytes(bArr, 0, remaining);
                    if (i2 >= 0) {
                        length -= i2;
                        this.count += (long) i2;
                    } else {
                        throw new IOException("partial read from buffer failed");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i2, length);
            if (read >= 0) {
                this.count += (long) read;
                return read + i2;
            } else if (i2 > 0) {
                return i2;
            } else {
                notifyStreamComplete();
                return read;
            }
        } catch (IOException e2) {
            log.error(e2.toString());
            System.out.println("NOTIFY STREAM ERROR: ".concat(String.valueOf(e2)));
            e2.printStackTrace();
            notifyStreamError(e2);
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes(j2)) {
                    this.buffer.position((int) j2);
                    this.count += j2;
                    return j2;
                }
                j2 -= (long) this.buffer.remaining();
                if (j2 > 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    byteBuffer.position(byteBuffer.remaining());
                } else {
                    throw new IOException("partial read from buffer (skip) failed");
                }
            }
        }
        try {
            long skip = this.impl.skip(j2);
            this.count += skip;
            return skip;
        } catch (IOException e2) {
            notifyStreamError(e2);
            throw e2;
        }
    }

    public CountingInputStream(InputStream inputStream, boolean z) {
        this.impl = inputStream;
        this.enableBuffering = z;
        if (z) {
            this.buffer = ByteBuffer.allocate(2048);
            fillBuffer();
            return;
        }
        this.buffer = null;
    }

    private int readBufferBytes(byte[] bArr, int i2, int i3) {
        if (bufferEmpty()) {
            return -1;
        }
        int remaining = this.buffer.remaining();
        this.buffer.get(bArr, i2, i3);
        return remaining - this.buffer.remaining();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (this.enableBuffering) {
            synchronized (this.buffer) {
                if (bufferHasBytes((long) i3)) {
                    int readBufferBytes = readBufferBytes(bArr, i2, i3);
                    if (readBufferBytes >= 0) {
                        this.count += (long) readBufferBytes;
                        return readBufferBytes;
                    }
                    throw new IOException("readBufferBytes failed");
                }
                int remaining = this.buffer.remaining();
                if (remaining > 0) {
                    i4 = readBufferBytes(bArr, i2, remaining);
                    if (i4 >= 0) {
                        i3 -= i4;
                        this.count += (long) i4;
                    } else {
                        throw new IOException("partial read from buffer failed");
                    }
                }
            }
        }
        try {
            int read = this.impl.read(bArr, i2 + i4, i3);
            if (read >= 0) {
                this.count += (long) read;
                return read + i4;
            } else if (i4 > 0) {
                return i4;
            } else {
                notifyStreamComplete();
                return read;
            }
        } catch (IOException e2) {
            notifyStreamError(e2);
            throw e2;
        }
    }
}
