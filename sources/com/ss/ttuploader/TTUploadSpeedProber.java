package com.ss.ttuploader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TTUploadSpeedProber implements TTVideoUploaderListener {
    private Context mContext;
    private long mEndTime;
    private long mEndTime1;
    private String mFilePath;
    private InputStream mInputStream;
    AtomicBoolean mIsEnd;
    public TTUploadSpeedProberListener mListener;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mStartTime;
    private long mStartTime1;
    private int mTestSize;
    private Timer mTimer;
    public TTVideoUploader mUploader;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;

    static {
        Covode.recordClassIndex(101402);
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public String getStringFromExtern(int i2) {
        return null;
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public void onLog(int i2, int i3, String str) {
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public void onUploadVideoStage(int i2, long j2) {
    }

    @Override // com.ss.ttuploader.TTVideoUploaderListener
    public int videoUploadCheckNetState(int i2, int i3) {
        return 1;
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            TTVideoUploader tTVideoUploader = this.mUploader;
            if (tTVideoUploader != null) {
                tTVideoUploader.close();
                this.mUploader = null;
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setListener(TTUploadSpeedProberListener tTUploadSpeedProberListener) {
        if (tTUploadSpeedProberListener != null) {
            this.mListener = tTUploadSpeedProberListener;
        }
    }

    public static Context com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static File com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static boolean com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(2284);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2284);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2284);
        return delete;
    }

    private String getFilePath(Context context) {
        try {
            String absolutePath = com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context)).getAbsolutePath();
            if (absolutePath == null) {
                return null;
            }
            String str = absolutePath + File.separator + "speedprober";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            return str + File.separator + "speedprober.test";
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean initFile(int i2) {
        MethodCollector.i(2281);
        try {
            File file = new File(this.mFilePath);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                com_ss_ttuploader_TTUploadSpeedProber_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                file.createNewFile();
            }
            byte[] bArr = new byte[1024];
            int i3 = 0;
            while (true) {
                bArr[i3] = 97;
                i3++;
                if (i3 >= 1024) {
                    break;
                }
            }
            String str = new String(bArr);
            FileWriter fileWriter = new FileWriter(file, true);
            try {
                int i4 = (i2 / 1024) + 1;
                for (int i5 = 0; i5 <= i4; i5++) {
                    fileWriter.write(str);
                }
                fileWriter.close();
                MethodCollector.o(2281);
                return true;
            } catch (Throwable unused) {
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                MethodCollector.o(2281);
                return false;
            }
        } catch (Throwable unused2) {
            MethodCollector.o(2281);
            return false;
        }
    }

    public TTUploadSpeedProber(Context context, int i2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        if (context != null) {
            String filePath = getFilePath(context);
            this.mFilePath = filePath;
            if (filePath == null) {
                throw new Exception("get file path null");
            } else if (initFile(i2)) {
                this.mTestSize = i2;
                this.mContext = context;
                try {
                    TTVideoUploader tTVideoUploader = new TTVideoUploader();
                    this.mUploader = tTVideoUploader;
                    tTVideoUploader.setPathName(this.mFilePath);
                    this.mUploader.setListener(this);
                    this.mUploader.setTestSpeed(true);
                    this.mReadLock = reentrantReadWriteLock.readLock();
                    this.mWriteLock = reentrantReadWriteLock.writeLock();
                    this.mStartTime = 0;
                    this.mEndTime = 0;
                    this.mStartTime1 = 0;
                    this.mEndTime1 = 0;
                    this.mTimer = new Timer();
                    this.mIsEnd = new AtomicBoolean(false);
                } catch (Throwable th) {
                    throw new Exception("TTUploadSpeedProber create image uploader fail" + th.toString());
                }
            } else {
                throw new Exception("init file fail");
            }
        } else {
            throw new Exception("context is null create TTUploadSpeedProber fail");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    @Override // com.ss.ttuploader.TTVideoUploaderListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotify(int r5, long r6, com.ss.ttuploader.TTVideoInfo r8) {
        /*
            r4 = this;
            r3 = 1
            if (r5 != 0) goto L_0x003c
            long r0 = java.lang.System.currentTimeMillis()
            r4.mEndTime = r0
            com.ss.ttuploader.TTUploadSpeedProberListener r0 = r4.mListener
            if (r0 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.mIsEnd
            r0.set(r3)
            r0 = 0
            if (r8 == 0) goto L_0x0031
            org.json.JSONObject r1 = r8.mLog
            r0 = 0
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = "speedinfo"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = "0"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.String r0 = "avspeed"
            int r0 = r1.getInt(r0)     // Catch:{ Exception -> 0x002d }
            goto L_0x0032
        L_0x002d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0031:
            r0 = 0
        L_0x0032:
            com.ss.ttuploader.TTUploadSpeedProberListener r2 = r4.mListener
            if (r0 <= 0) goto L_0x0037
            r3 = 0
        L_0x0037:
            long r0 = (long) r0
            r2.onNotify(r3, r0)
            return
        L_0x003c:
            if (r5 != r3) goto L_0x004b
            r1 = 2
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            long r0 = java.lang.System.currentTimeMillis()
            r4.mStartTime1 = r0
            return
        L_0x004b:
            r0 = 2
            if (r5 != r0) goto L_0x005e
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.mIsEnd
            r0.set(r3)
            r0 = 0
            r4.mEndTime = r0
            com.ss.ttuploader.TTUploadSpeedProberListener r0 = r4.mListener
            if (r0 == 0) goto L_0x005e
            r0.onNotify(r3, r6)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTUploadSpeedProber.onNotify(int, long, com.ss.ttuploader.TTVideoInfo):void");
    }

    public void start(String str, String str2, String str3, long j2) {
        this.mWriteLock.lock();
        try {
            if (this.mStartTime == 0) {
                this.mStartTime = System.currentTimeMillis();
                this.mUploader.setVideoUploadDomain(str);
                this.mUploader.setAuthorization(str2);
                this.mUploader.setUserKey(str3);
                this.mUploader.setSocketNum(1);
                this.mUploader.setSliceSize(524288);
                this.mUploader.setSliceTimeout(10);
                this.mUploader.setFileRetryCount(0);
                this.mUploader.setSliceReTryCount(0);
                this.mUploader.start();
                this.mTimer.schedule(new TimerTask() {
                    /* class com.ss.ttuploader.TTUploadSpeedProber.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(101403);
                    }

                    public static int com_ss_ttuploader_TTUploadSpeedProber$1_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                        return 0;
                    }

                    /* JADX INFO: finally extract failed */
                    public void run() {
                        TTUploadSpeedProber.this.mWriteLock.lock();
                        try {
                            if (!TTUploadSpeedProber.this.mIsEnd.get() && TTUploadSpeedProber.this.mUploader != null) {
                                TTUploadSpeedProber.this.mUploader.close();
                                TTUploadSpeedProber.this.mUploader = null;
                                if (TTUploadSpeedProber.this.mListener != null) {
                                    TTUploadSpeedProber.this.mListener.onNotify(2, 0);
                                }
                            }
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                            com_ss_ttuploader_TTUploadSpeedProber$1_com_ss_android_ugc_aweme_lancet_LogLancet_e("lzp", "timer excute");
                        } catch (Throwable th) {
                            TTUploadSpeedProber.this.mWriteLock.unlock();
                            throw th;
                        }
                    }
                }, j2);
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }
}
