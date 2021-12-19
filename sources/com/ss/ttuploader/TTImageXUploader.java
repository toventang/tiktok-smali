package com.ss.ttuploader;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class TTImageXUploader extends TTImageUploaderAbstractListener implements TTImageUploaderListener {
    private TTImageXUploaderAbstractListener mAbstractListener;
    private TTImageUploader mImageUploader;
    private TTImageXUploaderListener mListener;

    static {
        Covode.recordClassIndex(101391);
    }

    public static int com_ss_ttuploader_TTImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static boolean isError() {
        return TTImageUploader.isError();
    }

    public void close() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.close();
        }
    }

    public void start() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.start();
        }
    }

    public void stop() {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.stop();
        }
    }

    public TTImageXUploader() {
        try {
            TTImageUploader tTImageUploader = new TTImageUploader(4);
            this.mImageUploader = tTImageUploader;
            tTImageUploader.setListener(this);
            this.mImageUploader.setAbstractListener(this);
        } catch (Throwable th) {
            this.mImageUploader = null;
            com_ss_ttuploader_TTImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", th.toString());
        }
        if (this.mImageUploader == null) {
            throw new Exception("create native uploader fail");
        }
    }

    public void setAbstractListener(TTImageXUploaderAbstractListener tTImageXUploaderAbstractListener) {
        this.mAbstractListener = tTImageXUploaderAbstractListener;
    }

    public void setListener(TTImageXUploaderListener tTImageXUploaderListener) {
        this.mListener = tTImageXUploaderListener;
    }

    public void setEnableHttps(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setEnableHttps(i2);
        }
    }

    public void setFileRetryCount(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setFileRetryCount(i2);
        }
    }

    public void setImageUploadDomain(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setImageUploadDomain(str);
        }
    }

    public void setMaxFailTime(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setMaxFailTime(i2);
        }
    }

    public void setOpenBoe(boolean z) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setOpenBoe(z);
        }
    }

    public void setScenesTag(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setScenesTag(str);
        }
    }

    public void setServerParameter(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setServerParameter(str);
        }
    }

    public void setSliceReTryCount(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setSliceReTryCount(i2);
        }
    }

    public void setSliceTimeout(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setSliceTimeout(i2);
        }
    }

    public void setSocketNum(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setSocketNum(i2);
        }
    }

    public void setTraceIDConfig(Map<Object, Object> map) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setTraceIDConfig(map);
        }
    }

    public void setTranTimeOutUnit(int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setTranTimeOutUnit(i2);
        }
    }

    public void setUploadToken(String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setUploadToken(str);
        }
    }

    @Override // com.ss.ttuploader.TTImageUploaderAbstractListener
    public int imageUploadCheckNetState(int i2, int i3) {
        TTImageXUploaderAbstractListener tTImageXUploaderAbstractListener = this.mAbstractListener;
        if (tTImageXUploaderAbstractListener == null) {
            return -2;
        }
        return tTImageXUploaderAbstractListener.imagexUploadCheckNetState(i2, i3);
    }

    public void setFileName(int i2, String[] strArr) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setFileName(i2, strArr);
        }
    }

    public void setFilePath(int i2, String[] strArr) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setFilePath(i2, strArr);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i2) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setMediaDataReader(tTMediaDataReader, i2);
        }
    }

    public void setStringValue(int i2, String str) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setStringValue(i2, str);
        }
    }

    public void setMediaDataReader(TTMediaDataReader tTMediaDataReader, int i2, int i3) {
        TTImageUploader tTImageUploader = this.mImageUploader;
        if (tTImageUploader != null) {
            tTImageUploader.setMediaDataReader(tTMediaDataReader, i2, i3);
        }
    }

    @Override // com.ss.ttuploader.TTImageUploaderListener
    public void onNotify(int i2, long j2, TTImageInfo tTImageInfo) {
        TTImageXInfo tTImageXInfo;
        com_ss_ttuploader_TTImageXUploader_com_ss_android_ugc_aweme_lancet_LogLancet_e("ttmn", a.a("what:%d,parameter:%d", new Object[]{Integer.valueOf(i2), Long.valueOf(j2)}));
        if (tTImageInfo != null) {
            tTImageXInfo = new TTImageXInfo(tTImageInfo.mImageToskey, tTImageInfo.mProgress, tTImageInfo.mFileIndex, tTImageInfo.mMetaInfo);
        } else {
            tTImageXInfo = null;
        }
        if (i2 == 0) {
            this.mListener.onNotify(i2, j2, null);
        } else if (i2 == 1) {
            this.mListener.onNotify(i2, j2, null);
        } else if (i2 == 3) {
            this.mListener.onNotify(i2, j2, tTImageXInfo);
        } else if (i2 == 4) {
            tTImageXInfo.mErrcode = tTImageInfo.mErrcode;
            tTImageXInfo.mProgress = tTImageInfo.mProgress;
            this.mListener.onNotify(i2, j2, tTImageXInfo);
        } else if (i2 == 2) {
            this.mListener.onNotify(i2, j2, tTImageXInfo);
        }
    }
}
