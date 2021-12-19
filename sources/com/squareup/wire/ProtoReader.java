package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import k.h;
import k.i;

public final class ProtoReader {
    private long limit = Long.MAX_VALUE;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit = -1;
    private int recursionDepth;
    private final h source;
    private int state = 2;
    private int tag = -1;

    static {
        Covode.recordClassIndex(36131);
    }

    public final FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public final i readBytes() {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.d(beforeLengthDelimitedScalar);
        return this.source.g(beforeLengthDelimitedScalar);
    }

    public final String readString() {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.d(beforeLengthDelimitedScalar);
        return this.source.h(beforeLengthDelimitedScalar);
    }

    private long beforeLengthDelimitedScalar() {
        if (this.state == 2) {
            long j2 = this.limit - this.pos;
            this.source.d(j2);
            this.state = 6;
            this.pos = this.limit;
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            return j2;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
    }

    public final long beginMessage() {
        if (this.state == 2) {
            int i2 = this.recursionDepth + 1;
            this.recursionDepth = i2;
            if (i2 <= 65) {
                long j2 = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return j2;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    public final int readFixed32() {
        int i2 = this.state;
        if (i2 == 5 || i2 == 2) {
            this.source.d(4);
            this.pos += 4;
            int m2 = this.source.m();
            afterPackableScalar(5);
            return m2;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
    }

    public final long readFixed64() {
        int i2 = this.state;
        if (i2 == 1 || i2 == 2) {
            this.source.d(8);
            this.pos += 8;
            long n = this.source.n();
            afterPackableScalar(1);
            return n;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
    }

    public final int readVarint32() {
        int i2 = this.state;
        if (i2 == 0 || i2 == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public final void skip() {
        int i2 = this.state;
        if (i2 == 0) {
            readVarint64();
        } else if (i2 == 1) {
            readFixed64();
        } else if (i2 == 2) {
            this.source.l(beforeLengthDelimitedScalar());
        } else if (i2 == 5) {
            readFixed32();
        } else {
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }

    public final long readVarint64() {
        int i2 = this.state;
        if (i2 == 0 || i2 == 2) {
            long j2 = 0;
            int i3 = 0;
            do {
                this.source.d(1);
                this.pos++;
                byte h2 = this.source.h();
                j2 |= ((long) (h2 & Byte.MAX_VALUE)) << i3;
                if ((h2 & 128) == 0) {
                    afterPackableScalar(0);
                    return j2;
                }
                i3 += 7;
            } while (i3 < 64);
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    private int internalReadVarint32() {
        int i2;
        this.source.d(1);
        this.pos++;
        byte h2 = this.source.h();
        if (h2 >= 0) {
            return h2;
        }
        int i3 = h2 & Byte.MAX_VALUE;
        this.source.d(1);
        this.pos++;
        byte h3 = this.source.h();
        if (h3 >= 0) {
            i2 = h3 << 7;
        } else {
            i3 |= (h3 & Byte.MAX_VALUE) << 7;
            this.source.d(1);
            this.pos++;
            byte h4 = this.source.h();
            if (h4 >= 0) {
                i2 = h4 << 14;
            } else {
                i3 |= (h4 & Byte.MAX_VALUE) << 14;
                this.source.d(1);
                this.pos++;
                byte h5 = this.source.h();
                if (h5 >= 0) {
                    i2 = h5 << 21;
                } else {
                    this.source.d(1);
                    this.pos++;
                    byte h6 = this.source.h();
                    int i4 = i3 | ((h5 & Byte.MAX_VALUE) << 21) | (h6 << 28);
                    if (h6 >= 0) {
                        return i4;
                    }
                    int i5 = 0;
                    do {
                        this.source.d(1);
                        this.pos++;
                        if (this.source.h() >= 0) {
                            return i4;
                        }
                        i5++;
                    } while (i5 < 5);
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return i3 | i2;
    }

    public final int nextTag() {
        int i2 = this.state;
        if (i2 == 7) {
            this.state = 2;
            return this.tag;
        } else if (i2 == 6) {
            while (this.pos < this.limit && !this.source.e()) {
                int internalReadVarint32 = internalReadVarint32();
                if (internalReadVarint32 != 0) {
                    int i3 = internalReadVarint32 >> 3;
                    this.tag = i3;
                    int i4 = internalReadVarint32 & 7;
                    if (i4 == 0) {
                        this.nextFieldEncoding = FieldEncoding.VARINT;
                        this.state = 0;
                        return this.tag;
                    } else if (i4 == 1) {
                        this.nextFieldEncoding = FieldEncoding.FIXED64;
                        this.state = 1;
                        return this.tag;
                    } else if (i4 == 2) {
                        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        this.state = 2;
                        int internalReadVarint322 = internalReadVarint32();
                        if (internalReadVarint322 < 0) {
                            throw new ProtocolException("Negative length: ".concat(String.valueOf(internalReadVarint322)));
                        } else if (this.pushedLimit == -1) {
                            long j2 = this.limit;
                            this.pushedLimit = j2;
                            long j3 = this.pos + ((long) internalReadVarint322);
                            this.limit = j3;
                            if (j3 <= j2) {
                                return this.tag;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i4 == 3) {
                        skipGroup(i3);
                    } else if (i4 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i4 == 5) {
                        this.nextFieldEncoding = FieldEncoding.FIXED32;
                        this.state = 5;
                        return this.tag;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i4)));
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    public ProtoReader(h hVar) {
        this.source = hVar;
    }

    private void afterPackableScalar(int i2) {
        if (this.state == i2) {
            this.state = 6;
            return;
        }
        long j2 = this.pos;
        long j3 = this.limit;
        if (j2 > j3) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        } else if (j2 == j3) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
        } else {
            this.state = 7;
        }
    }

    private void skipGroup(int i2) {
        while (this.pos < this.limit && !this.source.e()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 != 0) {
                int i3 = internalReadVarint32 >> 3;
                int i4 = internalReadVarint32 & 7;
                if (i4 == 0) {
                    this.state = 0;
                    readVarint64();
                } else if (i4 == 1) {
                    this.state = 1;
                    readFixed64();
                } else if (i4 == 2) {
                    long internalReadVarint322 = (long) internalReadVarint32();
                    this.pos += internalReadVarint322;
                    this.source.l(internalReadVarint322);
                } else if (i4 == 3) {
                    skipGroup(i3);
                } else if (i4 != 4) {
                    if (i4 == 5) {
                        this.state = 5;
                        readFixed32();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i4)));
                    }
                } else if (i3 != i2) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    public final void endMessage(long j2) {
        if (this.state == 6) {
            int i2 = this.recursionDepth - 1;
            this.recursionDepth = i2;
            if (i2 < 0 || this.pushedLimit != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.pos == this.limit || i2 == 0) {
                this.limit = j2;
            } else {
                throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }
}
