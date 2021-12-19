package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.aa;
import k.f;
import k.h;
import k.i;
import k.q;

/* access modifiers changed from: package-private */
public final class Hpack {
    static final Map<i, Integer> NAME_TO_FIRST_INDEX = nameToFirstIndex();
    static final Header[] STATIC_HEADER_TABLE = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};

    /* access modifiers changed from: package-private */
    public static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final h source;

        static {
            Covode.recordClassIndex(106253);
        }

        /* access modifiers changed from: package-private */
        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        private int readByte() {
            return this.source.h() & 255;
        }

        public final List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        private void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i3 - i2);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        /* access modifiers changed from: package-private */
        public final i readByteString() {
            boolean z;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int readInt = readInt(readByte, 127);
            if (z) {
                return i.of(Huffman.get().decode(this.source.k((long) readInt)));
            }
            return this.source.g((long) readInt);
        }

        /* access modifiers changed from: package-private */
        public final void readHeaders() {
            while (!this.source.e()) {
                int h2 = this.source.h() & 255;
                if (h2 == 128) {
                    throw new IOException("index == 0");
                } else if ((h2 & 128) == 128) {
                    readIndexedHeader(readInt(h2, 127) - 1);
                } else if (h2 == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((h2 & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(h2, 63) - 1);
                } else if ((h2 & 32) == 32) {
                    int readInt = readInt(h2, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (h2 == 16 || h2 == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(h2, 15) - 1);
                }
            }
        }

        private int dynamicTableIndex(int i2) {
            return this.nextHeaderIndex + 1 + i2;
        }

        private boolean isStaticHeader(int i2) {
            if (i2 < 0 || i2 > Hpack.STATIC_HEADER_TABLE.length - 1) {
                return false;
            }
            return true;
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i2) {
            insertIntoDynamicTable(-1, new Header(getName(i2), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i2) {
            this.headerList.add(new Header(getName(i2), readByteString()));
        }

        private int evictToRecoverBytes(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.dynamicTable.length - 1;
                while (true) {
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i2 <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.headerCount);
                        this.nextHeaderIndex += i4;
                    } else {
                        i2 -= this.dynamicTable[length].hpackSize;
                        this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                        this.headerCount--;
                        i4++;
                        length--;
                    }
                }
                Header[] headerArr2 = this.dynamicTable;
                System.arraycopy(headerArr2, i3 + 1, headerArr2, i3 + 1 + i4, this.headerCount);
                this.nextHeaderIndex += i4;
            }
            return i4;
        }

        private i getName(int i2) {
            if (isStaticHeader(i2)) {
                return Hpack.STATIC_HEADER_TABLE[i2].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i2 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private void readIndexedHeader(int i2) {
            if (isStaticHeader(i2)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i2]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i2 - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        Reader(int i2, aa aaVar) {
            this(i2, i2, aaVar);
        }

        /* access modifiers changed from: package-private */
        public final int readInt(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & 127) << i5;
                i5 += 7;
            }
        }

        private void insertIntoDynamicTable(int i2, Header header) {
            this.headerList.add(header);
            int i3 = header.hpackSize;
            if (i2 != -1) {
                i3 -= this.dynamicTable[dynamicTableIndex(i2)].hpackSize;
            }
            int i4 = this.maxDynamicTableByteCount;
            if (i3 > i4) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i3) - i4);
            if (i2 == -1) {
                int i5 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i5 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i6 = this.nextHeaderIndex;
                this.nextHeaderIndex = i6 - 1;
                this.dynamicTable[i6] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i2 + dynamicTableIndex(i2) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i3;
        }

        Reader(int i2, int i3, aa aaVar) {
            this.headerList = new ArrayList();
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i2;
            this.maxDynamicTableByteCount = i3;
            this.source = q.a(aaVar);
        }
    }

    private Hpack() {
    }

    /* access modifiers changed from: package-private */
    public static final class Writer {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final f out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        static {
            Covode.recordClassIndex(106254);
        }

        private void adjustDynamicTableByteCount() {
            int i2 = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i3 - i2);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        Writer(f fVar) {
            this(4096, true, fVar);
        }

        /* access modifiers changed from: package-private */
        public final void setHeaderTableSizeSetting(int i2) {
            this.headerTableSizeSetting = i2;
            int min = Math.min(i2, 16384);
            int i3 = this.maxDynamicTableByteCount;
            if (i3 != min) {
                if (min < i3) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        private int evictToRecoverBytes(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.dynamicTable.length - 1;
                while (true) {
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i2 <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i4, this.headerCount);
                        Header[] headerArr2 = this.dynamicTable;
                        int i5 = this.nextHeaderIndex;
                        Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                        this.nextHeaderIndex += i4;
                    } else {
                        i2 -= this.dynamicTable[length].hpackSize;
                        this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                        this.headerCount--;
                        i4++;
                        length--;
                    }
                }
                Header[] headerArr3 = this.dynamicTable;
                System.arraycopy(headerArr3, i3 + 1, headerArr3, i3 + 1 + i4, this.headerCount);
                Header[] headerArr22 = this.dynamicTable;
                int i52 = this.nextHeaderIndex;
                Arrays.fill(headerArr22, i52 + 1, i52 + 1 + i4, (Object) null);
                this.nextHeaderIndex += i4;
            }
            return i4;
        }

        private void insertIntoDynamicTable(Header header) {
            int i2 = header.hpackSize;
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            int i4 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i4 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i5 = this.nextHeaderIndex;
            this.nextHeaderIndex = i5 - 1;
            this.dynamicTable[i5] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i2;
        }

        /* access modifiers changed from: package-private */
        public final void writeByteString(i iVar) {
            if (!this.useCompression || Huffman.get().encodedLength(iVar) >= iVar.size()) {
                writeInt(iVar.size(), 127, 0);
                this.out.a(iVar);
                return;
            }
            f fVar = new f();
            Huffman.get().encode(iVar, fVar);
            i q = fVar.q();
            writeInt(q.size(), 127, 128);
            this.out.a(q);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
            if (r9 == -1) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r13) {
            /*
            // Method dump skipped, instructions count: 238
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        Writer(int i2, boolean z, f fVar) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
            this.headerTableSizeSetting = i2;
            this.maxDynamicTableByteCount = i2;
            this.useCompression = z;
            this.out = fVar;
        }

        /* access modifiers changed from: package-private */
        public final void writeInt(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.out.a(i2 | i4);
                return;
            }
            this.out.a(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.out.a(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.out.a(i5);
        }
    }

    private static Map<i, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i2 = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i2 >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i2].name)) {
                linkedHashMap.put(headerArr[i2].name, Integer.valueOf(i2));
            }
            i2++;
        }
    }

    static {
        Covode.recordClassIndex(106252);
    }

    static i checkLowercase(i iVar) {
        int size = iVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            byte b2 = iVar.getByte(i2);
            if (b2 >= 65 && b2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.utf8());
            }
        }
        return iVar;
    }
}
