package okhttp3.internal.cache2;

import com.bytedance.covode.number.Covode;
import java.nio.channels.FileChannel;
import k.f;

final class FileOperator {
    private final FileChannel fileChannel;

    static {
        Covode.recordClassIndex(106213);
    }

    FileOperator(FileChannel fileChannel2) {
        this.fileChannel = fileChannel2;
    }

    public final void read(long j2, f fVar, long j3) {
        long j4 = j3;
        long j5 = j2;
        if (j4 >= 0) {
            while (j4 > 0) {
                long transferTo = this.fileChannel.transferTo(j5, j4, fVar);
                j5 += transferTo;
                j4 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j2, f fVar, long j3) {
        long j4 = j3;
        long j5 = j2;
        if (j4 < 0 || j4 > fVar.f158864b) {
            throw new IndexOutOfBoundsException();
        }
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(fVar, j5, j4);
            j5 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
