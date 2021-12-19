package com.ss.mediakit.medialoader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class AVMDLDataLoaderConfigure {
    public int mAccessCheckLevel;
    public int mAlogEnable;
    public String mAppInfo;
    public String mCacheDir;
    public String mCacheDirListsStr;
    public int mCheckContentTypeMethod;
    public int mCheckPreloadLevel;
    public int mCheckSumLevel;
    public int mCloseThreadPool;
    public long mConnectPoolStragetyValue;
    public int mControlCDNRangeType;
    public int mDNSBackType = 2;
    public int mDNSMainType;
    public int mDefaultExpiredTime = 60;
    public int mDevDiskSizeMB;
    public int mDevMemorySizeMB;
    public String mDmDomain;
    public String mDomains;
    public String mDownloadDir;
    public String mDynamicPreconnectConfigStr;
    public int mEnableBenchMarkIOSpeed;
    public int mEnableCacheReqRange;
    public int mEnableCellularUp;
    public int mEnableDownloaderLog;
    public int mEnableDynamicTimeout;
    public int mEnableEarlyData;
    public int mEnableEventInfo;
    public int mEnableExternDNS;
    public int mEnableFileCacheV2;
    public int mEnableFileRingBuffer;
    public int mEnableIOManager;
    public int mEnableIpBucket;
    public int mEnableLazyBufferpool;
    public int mEnableLoaderLogExtractUrls;
    public int mEnableLoaderPreempt;
    public int mEnableLoaderSeek;
    public int mEnableMaxCacheAgeForAllDir;
    public int mEnableNetScheduler;
    public int mEnableNewBufferpool;
    public int mEnableOwnVDPPreloadNotify = 1;
    public int mEnableP2PPreDown;
    public int mEnableP2pUpload;
    public int mEnablePlayInfoCache;
    public int mEnablePlayLog;
    public int mEnablePreconnect;
    public int mEnablePreloadReUse;
    public int mEnableReportTaskLog;
    public int mEnableSessionReuse;
    public int mEnableSocketReuse;
    public int mEnableSpeedPredict;
    public int mEnableStorageModule;
    public int mEnableSyncDnsForPcdn;
    public int mEnableTTNetLoader;
    public int mEnableUseFileExtendLoaderBuffer;
    public int mEnableUseOriginalUrl;
    public int mEncryptVersion;
    public int mErrorStateTrustTime;
    public int mFileExtendSizeKB = 8192;
    public int mFirstRangeLeftThreshold;
    public int mForbidByPassCookie;
    public String mForesightDomain;
    public int mGlobalSpeedSampleInterval;
    public int mIgnorePlayInfo;
    public int mIsAllowTryTheLastUrl;
    public int mIsCloseFileCache;
    public String mKeyDomain;
    public String mKeyToken;
    public int mLiveCacheThresholdHttpToP2p;
    public int mLiveCacheThresholdP2pToHttp;
    public String mLiveContainerString;
    public int mLiveEnableMdlProto;
    public int mLiveLoaderEnable;
    public int mLiveLoaderType;
    public int mLiveMaxTrySwitchP2pTimes;
    public int mLiveMobileDownloadAllow;
    public int mLiveMobileUploadAllow;
    public int mLiveP2pAllow;
    public int mLiveRecvDataTimeout;
    public int mLiveWaitP2pReadyThreshold;
    public int mLiveWatchDurationThreshold;
    public String mLoaderFactoryDir;
    public int mLoaderFactoryMaxCacheSize;
    public int mLoaderFactoryMaxMemorySize;
    public int mLoaderFactoryP2PLevel = 3;
    public int mLoaderType;
    public int mMainToBackUpDelayedTime;
    public int mMaxAliveHostNum;
    public int mMaxCacheAge;
    public int mMaxCacheSize;
    public int mMaxFileMemCacheNum;
    public int mMaxFileMemCacheSize;
    public int mMaxIPV4Num = Integer.MAX_VALUE;
    public int mMaxIPV6Num = Integer.MAX_VALUE;
    public int mMaxIpCountEachDomain;
    public int mMaxLoaderLogNum;
    public int mMaxSocketReuseCount;
    public int mMaxTlsVersion = 2;
    public String mMdlExtensionOptsStr;
    public int mMinAllowSpeed;
    public long mMonitorMinAllowLoadSize;
    public long mMonitorTimeInternal;
    public String mNetCacheDir;
    public int mNetSChedulerBlockDurationMs;
    public int mNetSchedulerBlockAllNetErr;
    public int mNetSchedulerBlockErrCount;
    public int mNetSchedulerBlockHostIpErrCount;
    public String mNetSchedulerConfigStr;
    public int mNewBufferPoolBlockSize;
    public int mNewBufferPoolGrowBlockCount;
    public int mNewBufferPoolResidentSize;
    public int mNextDownloadThreshold;
    public int mOnlyUseCdn;
    public int mOpenTimeOut;
    public String mP2PConfigStr;
    public int mP2PFirstRangeLoaderType = 1;
    public int mP2PPreDownPeerCount = 5;
    public long mP2PStragetyLevel;
    public int mPreconnectNum = 3;
    public int mPreloadParallelNum;
    public int mPreloadStrategy;
    public int mPreloadWaitListType;
    public int mRWTimeOut;
    public int mRingBufferSizeKB = -1;
    public int mSessionTimeout = 3600;
    public String mSettingsDomain;
    public int mSocketIdleTimeOut;
    public int mSocketInitialTimeout = 3;
    public int mSocketRecvBufferSize;
    public int mSocketSendBufferKB = -1;
    public String mSocketTraingCenterConfigStr;
    public int mSpeedCoefficientValue;
    public int mSpeedSampleInterval;
    public int mStoIoWriteLimitKBTh1;
    public int mStoIoWriteLimitKBTh2;
    public int mStoMaxIdleTimeSec;
    public int mStoPlayDldWinSizeKBLS;
    public int mStoPlayDldWinSizeKBNM;
    public int mStoRingBufferSizeKB;
    public int mTTNetLoaderCronetBufSizeKB;
    public int mTestSpeedTypeVersion;
    public int mTryCount;
    public int mUseNewSpeedTestForSingle;
    public String mVdpABTestId;
    public String mVdpExtGlobalInfo;
    public String mVdpGroupId;
    public int mWriteFileNotifyIntervalMS = 500;
    public int mXYLibValue = -1;

    static {
        Covode.recordClassIndex(101117);
    }

    public static AVMDLDataLoaderConfigure getDefaultonfigure() {
        return new AVMDLDataLoaderConfigure(314572800, 5, 5, 0, null);
    }

    public void ParseJsonConfig() {
        try {
            if (this.mLiveContainerString != null) {
                JSONObject jSONObject = new JSONObject(this.mLiveContainerString);
                if (!jSONObject.isNull("enable_mdl_proto")) {
                    this.mLiveEnableMdlProto = jSONObject.getInt("enable_mdl_proto");
                    AVMDLLog.w("ttmn", "mdl live json enable_mdl_proto:" + this.mLiveEnableMdlProto);
                }
            }
        } catch (Exception e2) {
            AVMDLLog.e("ttmn", "parse json config fail:" + e2.toString());
        }
    }

    public void setCacheInfoList(String[] strArr, long[] jArr) {
        if (strArr.length != 0 && jArr.length != 0 && strArr.length == jArr.length) {
            this.mCacheDirListsStr = null;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (this.mCacheDirListsStr == null) {
                        this.mCacheDirListsStr = strArr[i2] + "$" + Long.toString(jArr[i2]);
                    } else {
                        this.mCacheDirListsStr += "|" + strArr[i2] + "$" + Long.toString(jArr[i2]);
                    }
                }
            }
            if (TextUtils.isEmpty(this.mCacheDirListsStr)) {
                AVMDLLog.e("AVMDLDataLoaderConfigure", "cache dir list str is null");
            } else {
                AVMDLLog.d("AVMDLDataLoaderConfigure", "cache dir list str is:" + this.mCacheDirListsStr);
            }
        }
    }

    public AVMDLDataLoaderConfigure(int i2, int i3, int i4, int i5, String str) {
        this.mMaxCacheSize = i2;
        this.mOpenTimeOut = i3;
        this.mRWTimeOut = i4;
        this.mTryCount = i5;
        this.mCacheDir = str;
        this.mLoaderFactoryMaxCacheSize = 209715200;
        this.mLoaderFactoryMaxMemorySize = 5242880;
        this.mPreloadParallelNum = 1;
        this.mMaxCacheAge = 1209600;
        this.mPreloadStrategy = 1;
        this.mPreloadWaitListType = 1;
        this.mSocketIdleTimeOut = 120;
        this.mDNSBackType = 2;
        this.mDefaultExpiredTime = 60;
        this.mLoaderFactoryP2PLevel = 3;
        this.mTestSpeedTypeVersion = 1;
        this.mDefaultExpiredTime = 120;
        this.mSocketSendBufferKB = -1;
        this.mRingBufferSizeKB = -1;
        this.mFileExtendSizeKB = 8192;
        this.mLiveLoaderType = 10000;
        this.mLiveWatchDurationThreshold = 20000;
        this.mLiveCacheThresholdHttpToP2p = 3500;
        this.mLiveCacheThresholdP2pToHttp = 1000;
        this.mLiveMaxTrySwitchP2pTimes = 3;
        this.mLiveWaitP2pReadyThreshold = 60000;
        this.mLiveRecvDataTimeout = 5000;
        this.mPreconnectNum = 3;
        this.mMaxTlsVersion = 2;
        this.mXYLibValue = -1;
        this.mWriteFileNotifyIntervalMS = 500;
        this.mSessionTimeout = 3600;
        this.mSocketInitialTimeout = 3;
        this.mEnableOwnVDPPreloadNotify = 1;
    }
}
