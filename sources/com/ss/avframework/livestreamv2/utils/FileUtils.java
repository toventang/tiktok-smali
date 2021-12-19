package com.ss.avframework.livestreamv2.utils;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.AVLog;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class FileUtils {
    static {
        Covode.recordClassIndex(100487);
    }

    public static class File {
        private FileOutputStream mFileOutputStream;
        private String mName;

        static {
            Covode.recordClassIndex(100488);
        }

        public String name() {
            return this.mName;
        }

        public void close() {
            try {
                this.mFileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        public void write(Buffer buffer) {
            if (buffer instanceof ByteBuffer) {
                write((ByteBuffer) buffer);
                return;
            }
            throw new AndroidRuntimeException("Unsupport");
        }

        public void write(ByteBuffer byteBuffer) {
            byteBuffer.position(0);
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
            write(bArr);
        }

        public void write(byte[] bArr) {
            MethodCollector.i(12814);
            try {
                this.mFileOutputStream.write(bArr);
                this.mFileOutputStream.flush();
                MethodCollector.o(12814);
            } catch (IOException e2) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(e2.getMessage());
                MethodCollector.o(12814);
                throw androidRuntimeException;
            }
        }

        public File(FileOutputStream fileOutputStream, String str) {
            AVLog.w("Utils.File", "Open write file ".concat(String.valueOf(str)));
            this.mFileOutputStream = fileOutputStream;
            this.mName = str;
        }
    }

    public static File CreateWriteFile(String str) {
        MethodCollector.i(14381);
        try {
            File file = new File(new FileOutputStream(new java.io.File(str)), str);
            MethodCollector.o(14381);
            return file;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(e2.getMessage());
            MethodCollector.o(14381);
            throw androidRuntimeException;
        }
    }
}
