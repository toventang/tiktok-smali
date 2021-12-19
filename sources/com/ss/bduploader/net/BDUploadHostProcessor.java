package com.ss.bduploader.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.bduploader.BDUploadLog;
import java.util.HashMap;

public class BDUploadHostProcessor {
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private Handler mHandler;
    public String mHost;
    public HashMap<BDUploadDNSParserListener, Integer> mListeners;
    private int mMainType;
    private BaseDNS[] mParsers = new BaseDNS[2];
    private int[] mStates = new int[2];

    static {
        Covode.recordClassIndex(100683);
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
        BDUploadLog.d("BDUploadHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            BDUploadLog.d("BDUploadHostProcessor", a.a("id: %s is empty", new Object[]{str}));
            return false;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i2] != null && str.equals(baseDNSArr[i2].mId)) {
                BDUploadLog.d("BDUploadHostProcessor", a.a("id: %s is valid index: %d", new Object[]{str, Integer.valueOf(i2)}));
                return true;
            }
        }
        BDUploadLog.d("BDUploadHostProcessor", a.a("id: %s is valid", new Object[]{str}));
        return false;
    }

    public void processMsg(int i2, BDUploadDNSInfo bDUploadDNSInfo) {
        BDUploadLog.d("BDUploadHostProcessor", a.a("----processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mHost, bDUploadDNSInfo}));
        if (i2 != 0) {
            if (i2 == 1) {
                int[] iArr = this.mStates;
                if ((iArr[0] == 1 || iArr[0] == 2 || iArr[0] == 3) && iArr[1] == 0) {
                    BDUploadLog.d("BDUploadHostProcessor", a.a("main dns is not end and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i2, bDUploadDNSInfo);
                }
            }
        } else if (this.mStates[0] == 0) {
            BDUploadLog.d("BDUploadHostProcessor", a.a("main dns is idle call main dns", new Object[0]));
            doParseInternal(i2, bDUploadDNSInfo);
        }
        BDUploadLog.d("BDUploadHostProcessor", a.a("****end processor pro msg what:%d host:%s info:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mHost, bDUploadDNSInfo}));
    }

    private void doParseInternal(int i2, BDUploadDNSInfo bDUploadDNSInfo) {
        BDUploadLog.d("BDUploadHostProcessor", a.a("----do parse internal what:%d info:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo}));
        if (bDUploadDNSInfo != null) {
            if (i2 == 0) {
                if (this.mParsers[0] == null) {
                    BDUploadLog.d("BDUploadHostProcessor", a.a("create main dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), bDUploadDNSInfo.mHost}));
                    this.mStates[0] = 1;
                    this.mParsers[0] = createDNSParser(bDUploadDNSInfo.mHost, this.mMainType, 0);
                    this.mParsers[0].start();
                    Message message = new Message();
                    message.what = 1;
                    message.obj = bDUploadDNSInfo;
                    if (this.mBackUpDelayedTime > 0) {
                        BDUploadLog.d("BDUploadHostProcessor", a.a("BackUpDelayedTime:%d send backup delay first", new Object[]{Integer.valueOf(this.mMainType)}));
                        this.mHandler.sendMessageDelayed(message, (long) (this.mBackUpDelayedTime * 1000));
                    }
                }
            } else if (i2 == 1 && this.mParsers[1] == null) {
                BDUploadLog.d("BDUploadHostProcessor", a.a("create backup dns type:%d host:%s", new Object[]{Integer.valueOf(this.mMainType), bDUploadDNSInfo.mHost}));
                this.mStates[1] = 1;
                this.mParsers[1] = createDNSParser(bDUploadDNSInfo.mHost, this.mBackUpType, 1);
                this.mParsers[1].start();
            }
            BDUploadLog.d("BDUploadHostProcessor", a.a("****do parse internal end", new Object[0]));
        }
    }

    public void processResult(int i2, BDUploadDNSInfo bDUploadDNSInfo) {
        String str;
        BDUploadLog.d("BDUploadHostProcessor", a.a("----process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mId, bDUploadDNSInfo.mHost}));
        if (i2 == 2 || i2 == 3) {
            str = bDUploadDNSInfo.mId;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            BDUploadLog.d("BDUploadHostProcessor", a.a("****process result err id is empty", new Object[0]));
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
                BDUploadLog.d("BDUploadHostProcessor", a.a("****process result parser index:%d is end, be close", new Object[]{Integer.valueOf(i3)}));
            }
        }
        if (i3 == 0 && i2 == 2) {
            BDUploadLog.d("BDUploadHostProcessor", a.a("mian dns parse error, try back up dns", new Object[0]));
            processMsg(1, new BDUploadDNSInfo(BDUploadDNSParser.mGlobalBackType, bDUploadDNSInfo.mHost, null, 0, null));
        }
        BDUploadLog.d("BDUploadHostProcessor", a.a("****end process result what:%d id:%s host:%s", new Object[]{Integer.valueOf(i2), bDUploadDNSInfo.mId, bDUploadDNSInfo.mHost}));
    }

    private BaseDNS createDNSParser(String str, int i2, int i3) {
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            BDUploadLog.d("BDUploadHostProcessor", a.a("create http dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i2)}));
            return new HTTPDNS(str, null, i2, this.mHandler);
        }
        BDUploadLog.d("BDUploadHostProcessor", a.a("create local dns parser for host:%s type:%d", new Object[]{str, Integer.valueOf(i2)}));
        return new LocalDNS(str, this.mHandler);
    }

    public BDUploadHostProcessor(String str, Handler handler, int i2, int i3, int i4) {
        this.mMainType = i2;
        this.mBackUpType = i3;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i4;
        int i5 = 0;
        do {
            this.mParsers[i5] = null;
            i5++;
        } while (i5 < 2);
        int i6 = 0;
        do {
            this.mStates[i6] = 0;
            i6++;
        } while (i6 < 2);
        this.mListeners = new HashMap<>();
    }
}
