package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.effectplatform.b.a.e;
import java.io.ByteArrayOutputStream;
import k.g;
import k.i;

class Huffman {
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] CODE_LENGTHS = {e.f153515b, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, e.f153515b, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, e.f153515b, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, e.f153515b, 19, e.f153515b, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, e.f153515b, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final Huffman INSTANCE = new Huffman();
    private final Node root = new Node();

    public static Huffman get() {
        return INSTANCE;
    }

    /* access modifiers changed from: package-private */
    public static final class Node {
        final Node[] children;
        final int symbol;
        final int terminalBits;

        static {
            Covode.recordClassIndex(106284);
        }

        Node() {
            this.children = new Node[256];
        }

        Node(int i2, int i3) {
            this.symbol = i2;
            int i4 = i3 & 7;
            this.terminalBits = i4 == 0 ? 8 : i4;
        }
    }

    private Huffman() {
        buildTree();
    }

    private void buildTree() {
        int i2 = 0;
        while (true) {
            byte[] bArr = CODE_LENGTHS;
            if (i2 < bArr.length) {
                addCode(i2, CODES[i2], bArr[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    static {
        Covode.recordClassIndex(106283);
    }

    /* access modifiers changed from: package-private */
    public int encodedLength(i iVar) {
        long j2 = 0;
        for (int i2 = 0; i2 < iVar.size(); i2++) {
            j2 += (long) CODE_LENGTHS[iVar.getByte(i2) & 255];
        }
        return (int) ((j2 + 7) >> 3);
    }

    /* access modifiers changed from: package-private */
    public byte[] decode(byte[] bArr) {
        MethodCollector.i(5169);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Node node = this.root;
        int i2 = 0;
        int i3 = 0;
        for (byte b2 : bArr) {
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                node = node.children[(i2 >>> (i3 - 8)) & 255];
                if (node.children == null) {
                    byteArrayOutputStream.write(node.symbol);
                    i3 -= node.terminalBits;
                    node = this.root;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            Node node2 = node.children[(i2 << (8 - i3)) & 255];
            if (node2.children != null || node2.terminalBits > i3) {
                break;
            }
            byteArrayOutputStream.write(node2.symbol);
            i3 -= node2.terminalBits;
            node = this.root;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.o(5169);
        return byteArray;
    }

    /* access modifiers changed from: package-private */
    public void encode(i iVar, g gVar) {
        int i2 = 0;
        long j2 = 0;
        byte b2 = 0;
        while (i2 < iVar.size()) {
            int i3 = iVar.getByte(i2) & 255;
            int i4 = CODES[i3];
            byte b3 = CODE_LENGTHS[i3];
            j2 = (j2 << b3) | ((long) i4);
            int i5 = b2 + b3;
            while (i5 >= 8) {
                i5 = (i5 == 1 ? 1 : 0) - 8;
                gVar.a((int) (j2 >> i5));
            }
            i2++;
            b2 = i5;
        }
        if (b2 > 0) {
            gVar.a((int) (((long) (255 >>> b2)) | (j2 << (8 - b2))));
        }
    }

    private void addCode(int i2, int i3, byte b2) {
        Node node = new Node(i2, b2);
        Node node2 = this.root;
        while (b2 > 8) {
            b2 = (byte) (b2 - 8);
            int i4 = (i3 >>> b2) & 255;
            if (node2.children != null) {
                if (node2.children[i4] == null) {
                    node2.children[i4] = new Node();
                }
                node2 = node2.children[i4];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        int i5 = 8 - b2;
        int i6 = (i3 << i5) & 255;
        int i7 = 1 << i5;
        for (int i8 = i6; i8 < i6 + i7; i8++) {
            node2.children[i8] = node;
        }
    }
}
