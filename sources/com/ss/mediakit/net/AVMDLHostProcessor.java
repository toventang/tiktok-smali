package com.ss.mediakit.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;

public class AVMDLHostProcessor {
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private int mEnableParallel;
    private Handler mHandler;
    public String mHost;
    public HashMap<AVMDLDNSParserListener, Integer> mListeners;
    private int mMainType;
    private BaseDNS[] mParsers = new BaseDNS[2];
    private int[] mStates = new int[2];

    static {
        Covode.recordClassIndex(101141);
    }

    public boolean isEnd() {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.mParsers[i2] != null) {
                int[] iArr = this.mStates;
                if (!(iArr[i2] == 3 || iArr[i2] == 2)) {
                    return false;
                }
            }
        }
        AVMDLLog.d("AVMDLHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.d("AVMDLHostProcessor", a.a("id: %s is empty", new Object[]{str}));
            return false;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i2] != null && str.equals(baseDNSArr[i2].mId)) {
                AVMDLLog.d("AVMDLHostProcessor", a.a("id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i2)}));
                return true;
            }
        }
        AVMDLLog.d("AVMDLHostProcessor", a.a("id: %s is valid", new Object[]{str}));
        return false;
    }

    public void processMsg(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.d("AVMDLHostProcessor", a.a("----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
        if (i2 != 5) {
            if (i2 == 6) {
                int[] iArr = this.mStates;
                if ((iArr[0] == 1 || iArr[0] == 2 || iArr[0] == 3 || this.mEnableParallel > 0) && iArr[1] == 0) {
                    AVMDLLog.d("AVMDLHostProcessor", a.a("main dns is not end or enable parrallel and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i2, aVMDLDNSInfo);
                }
            }
        } else if (this.mStates[0] == 0) {
            AVMDLLog.d("AVMDLHostProcessor", a.a("main dns is idle call main dns", new Object[0]));
            doParseInternal(i2, aVMDLDNSInfo);
        }
        AVMDLLog.d("AVMDLHostProcessor", a.a("****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mHost, aVMDLDNSInfo}));
    }

    private void doParseInternal(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.d("AVMDLHostProcessor", a.a("----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo}));
        if (aVMDLDNSInfo != null) {
            if (i2 == 5) {
                if (this.mParsers[0] == null) {
                    AVMDLLog.d("AVMDLHostProcessor", a.a("create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), aVMDLDNSInfo.mHost}));
                    this.mStates[0] = 1;
                    this.mParsers[0] = createDNSParser(aVMDLDNSInfo.mHost, this.mMainType, 0);
                    this.mParsers[0].start();
                    Message message = new Message();
                    message.what = 6;
                    message.obj = aVMDLDNSInfo;
                    if (this.mBackUpDelayedTime > 0 || this.mEnableParallel > 0) {
                        AVMDLLog.d("AVMDLHostProcessor", a.a("BackUpDelayedTime:%d enableparallel:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType), Integer.valueOf(this.mEnableParallel)}));
                        this.mHandler.sendMessageDelayed(message, (long) (this.mBackUpDelayedTime * 1000));
                    }
                }
            } else if (i2 == 6 && this.mParsers[1] == null) {
                AVMDLLog.d("AVMDLHostProcessor", a.a("create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mBackUpType), aVMDLDNSInfo.mHost}));
                this.mStates[1] = 1;
                this.mParsers[1] = createDNSParser(aVMDLDNSInfo.mHost, this.mBackUpType, 1);
                this.mParsers[1].start();
            }
            AVMDLLog.d("AVMDLHostProcessor", a.a("****do parse internal end", new Object[0]));
        }
    }

    public void processResult(int i2, AVMDLDNSInfo aVMDLDNSInfo) {
        String str;
        AVMDLLog.d("AVMDLHostProcessor", a.a("----process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost}));
        if (i2 == 2 || i2 == 3) {
            str = aVMDLDNSInfo.mId;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.d("AVMDLHostProcessor", a.a("****process result err id is empty", new Object[0]));
            return;
        }
        int i3 = 0;
        while (true) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i3] == null || !str.equals(baseDNSArr[i3].mId)) {
                i3++;
                if (i3 >= 2) {
                    break;
                }
            } else {
                this.mParsers[i3].close();
                this.mParsers[i3] = null;
                if (i2 == 3) {
                    this.mStates[i3] = 3;
                } else if (i2 == 2) {
                    this.mStates[i3] = 2;
                }
                AVMDLLog.d("AVMDLHostProcessor", a.a("****process result parser index:%d is end, be close", new Object[]{Integer.valueOf(i3)}));
            }
        }
        if (i3 == 0 && i2 == 2) {
            AVMDLLog.d("AVMDLHostProcessor", a.a("mian dns parse error, try back up dns", new Object[0]));
            processMsg(6, new AVMDLDNSInfo(this.mBackUpType, aVMDLDNSInfo.mHost, (String) null, 0, (String) null));
        }
        AVMDLLog.d("AVMDLHostProcessor", a.a("****end process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i2), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost}));
    }

    private BaseDNS createDNSParser(String str, int i2, int i3) {
        try {
            CreateConstructor createConstructor = AVMDLDNSManager.getInstance().getCreateConstructor(i2);
            if (createConstructor != null) {
                return createConstructor.createDns(str, null, i2, this.mHandler);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (i2 != 4 || AVMDLDNSParser.mCustomHttpDNSParser == null) {
            AVMDLLog.d("AVMDLHostProcessor", a.a("create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i2)}));
            return new LocalDNS(str, this.mHandler);
        }
        AVMDLLog.d("AVMDLHostProcessor", a.a("create custom httpdns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i2)}));
        return new CustomHTTPDNS(str, this.mHandler);
    }

    public AVMDLHostProcessor(String str, Handler handler, int i2, int i3, int i4, int i5) {
        this.mMainType = i2;
        this.mBackUpType = i3;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i4;
        this.mEnableParallel = i5;
        int i6 = 0;
        do {
            this.mParsers[i6] = null;
            i6++;
        } while (i6 < 2);
        int i7 = 0;
        do {
            this.mStates[i7] = 0;
            i7++;
        } while (i7 < 2);
        this.mListeners = new HashMap<>();
    }
}
