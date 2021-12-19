package com.ss.android.ugc.aweme.uploader.factory;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public abstract class AbstractVideoUploader {

    public enum a {
        NORMAL,
        CAPTION,
        TEST_SPEED;

        static {
            Covode.recordClassIndex(92797);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(92798);
        }

        int a();

        void a(int i2, long j2, VideoUploadInfo videoUploadInfo);
    }

    static {
        Covode.recordClassIndex(92795);
    }

    public abstract void a();

    public abstract void a(b bVar);

    public abstract void a(String str);

    public abstract void b();

    public static final class VideoUploadInfo {
        private long mErrorCode;
        private String mExtra;
        private String mTosKey;
        private String mVideoId;

        static {
            Covode.recordClassIndex(92796);
        }

        public VideoUploadInfo() {
            this(null, null, 0, null, 15, null);
        }

        public static int com_ss_android_ugc_aweme_uploader_factory_AbstractVideoUploader$VideoUploadInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
            return (int) (j2 ^ (j2 >>> 32));
        }

        public static /* synthetic */ VideoUploadInfo copy$default(VideoUploadInfo videoUploadInfo, String str, String str2, long j2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = videoUploadInfo.mTosKey;
            }
            if ((i2 & 2) != 0) {
                str2 = videoUploadInfo.mVideoId;
            }
            if ((i2 & 4) != 0) {
                j2 = videoUploadInfo.mErrorCode;
            }
            if ((i2 & 8) != 0) {
                str3 = videoUploadInfo.mExtra;
            }
            return videoUploadInfo.copy(str, str2, j2, str3);
        }

        public final String component1() {
            return this.mTosKey;
        }

        public final String component2() {
            return this.mVideoId;
        }

        public final long component3() {
            return this.mErrorCode;
        }

        public final String component4() {
            return this.mExtra;
        }

        public final VideoUploadInfo copy(String str, String str2, long j2, String str3) {
            return new VideoUploadInfo(str, str2, j2, str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoUploadInfo)) {
                return false;
            }
            VideoUploadInfo videoUploadInfo = (VideoUploadInfo) obj;
            return l.a(this.mTosKey, videoUploadInfo.mTosKey) && l.a(this.mVideoId, videoUploadInfo.mVideoId) && this.mErrorCode == videoUploadInfo.mErrorCode && l.a(this.mExtra, videoUploadInfo.mExtra);
        }

        public final int hashCode() {
            String str = this.mTosKey;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.mVideoId;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_uploader_factory_AbstractVideoUploader$VideoUploadInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mErrorCode)) * 31;
            String str3 = this.mExtra;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "VideoUploadInfo(mTosKey=" + this.mTosKey + ", mVideoId=" + this.mVideoId + ", mErrorCode=" + this.mErrorCode + ", mExtra=" + this.mExtra + ")";
        }

        public final long getMErrorCode() {
            return this.mErrorCode;
        }

        public final String getMExtra() {
            return this.mExtra;
        }

        public final String getMTosKey() {
            return this.mTosKey;
        }

        public final String getMVideoId() {
            return this.mVideoId;
        }

        public final void setMErrorCode(long j2) {
            this.mErrorCode = j2;
        }

        public final void setMExtra(String str) {
            this.mExtra = str;
        }

        public final void setMTosKey(String str) {
            this.mTosKey = str;
        }

        public final void setMVideoId(String str) {
            this.mVideoId = str;
        }

        public VideoUploadInfo(String str, String str2, long j2, String str3) {
            this.mTosKey = str;
            this.mVideoId = str2;
            this.mErrorCode = j2;
            this.mExtra = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ VideoUploadInfo(String str, String str2, long j2, String str3, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : j2, (i2 & 8) == 0 ? str3 : null);
        }
    }
}
