package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.io.File;

public class VEDebugSettings {
    public String mCaptureDir;
    public boolean mEnableImageDump;
    public String mImageDumpDir;
    public a mImageDumpType;
    public String mPreviewDir;

    /* renamed from: com.ss.android.vesdk.VEDebugSettings$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(99128);
        }
    }

    static {
        Covode.recordClassIndex(99127);
    }

    public String getCapDumpDir() {
        return this.mCaptureDir;
    }

    public boolean getEnableImageDump() {
        return this.mEnableImageDump;
    }

    public String getImageDumpDir() {
        return this.mImageDumpDir;
    }

    public a getImageDumpType() {
        return this.mImageDumpType;
    }

    public String getPrvDumpDir() {
        return this.mPreviewDir;
    }

    public int getImageDumpTypeValue() {
        return this.mImageDumpType.ordinal();
    }

    public boolean isNeedDumpCapture() {
        if (!this.mEnableImageDump) {
            return false;
        }
        if (this.mImageDumpType == a.BOTH || this.mImageDumpType == a.CAPTURE) {
            return true;
        }
        return false;
    }

    public boolean isNeedDumpPreview() {
        if (!this.mEnableImageDump) {
            return false;
        }
        if (this.mImageDumpType == a.BOTH || this.mImageDumpType == a.PREVIEW) {
            return true;
        }
        return false;
    }

    public enum a {
        CAPTURE,
        PREVIEW,
        BOTH;

        static {
            Covode.recordClassIndex(99129);
        }
    }

    private VEDebugSettings() {
        this.mImageDumpType = a.CAPTURE;
        this.mImageDumpDir = "sdcard/vemo";
        this.mCaptureDir = this.mImageDumpDir + File.separator + "capture";
        this.mPreviewDir = this.mImageDumpDir + File.separator + "preview";
    }

    public String toString() {
        return "DebugSettings{mEnableImageDump=" + this.mEnableImageDump + ", mImageDumpType=" + this.mImageDumpType + ", mImageDumpDir=" + this.mImageDumpDir + ", mCaptureDir=" + this.mCaptureDir + ", mPreviewDir=" + this.mPreviewDir + "}";
    }

    public void init() {
        if (this.mEnableImageDump) {
            File file = new File(this.mImageDumpDir);
            if (!file.exists() && !file.isDirectory()) {
                an.a("VEDebugSettings", "Dump directory is not exist, so do mkdir {" + this.mImageDumpDir + "}");
                file.mkdir();
            }
            if (isNeedDumpCapture()) {
                File file2 = new File(this.mCaptureDir);
                if (!file2.exists() && !file2.isDirectory()) {
                    an.a("VEDebugSettings", "Dump capture directory is not exist, so do mkdir {" + this.mCaptureDir + "}");
                    file2.mkdir();
                }
            }
            if (isNeedDumpPreview()) {
                File file3 = new File(this.mPreviewDir);
                if (!file3.exists() && !file3.isDirectory()) {
                    an.a("VEDebugSettings", "Dump preview directory is not exist, so do mkdir {" + this.mPreviewDir + "}");
                    file3.mkdir();
                }
            }
        }
    }

    /* synthetic */ VEDebugSettings(AnonymousClass1 r1) {
        this();
    }
}
