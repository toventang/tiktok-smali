package com.ss.android.ugc.aweme.uploader.factory;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.e;
import h.f.b.g;
import h.f.b.l;

public abstract class AbstractImageUploader {

    /* renamed from: a  reason: collision with root package name */
    public final e f141999a;

    public interface a {
        static {
            Covode.recordClassIndex(92794);
        }

        void a(int i2, long j2, ImageUploadInfo imageUploadInfo);
    }

    static {
        Covode.recordClassIndex(92792);
    }

    public abstract int a();

    public abstract void a(a aVar);

    public abstract void a(String str);

    public abstract void a(boolean z);

    public abstract void a(String[] strArr);

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public static final class ImageUploadInfo {
        private String mEncryptionImageTosKey;
        private long mErrorCode;
        private String mExtra;
        private String mImageToskey;
        private String mMetaInfo;
        private long mProgress;

        static {
            Covode.recordClassIndex(92793);
        }

        public ImageUploadInfo() {
            this(null, 0, null, null, 0, null, 63, null);
        }

        public static int com_ss_android_ugc_aweme_uploader_factory_AbstractImageUploader$ImageUploadInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
            return (int) (j2 ^ (j2 >>> 32));
        }

        public static /* synthetic */ ImageUploadInfo copy$default(ImageUploadInfo imageUploadInfo, String str, long j2, String str2, String str3, long j3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = imageUploadInfo.mImageToskey;
            }
            if ((i2 & 2) != 0) {
                j2 = imageUploadInfo.mErrorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = imageUploadInfo.mExtra;
            }
            if ((i2 & 8) != 0) {
                str3 = imageUploadInfo.mEncryptionImageTosKey;
            }
            if ((i2 & 16) != 0) {
                j3 = imageUploadInfo.mProgress;
            }
            if ((i2 & 32) != 0) {
                str4 = imageUploadInfo.mMetaInfo;
            }
            return imageUploadInfo.copy(str, j2, str2, str3, j3, str4);
        }

        public final String component1() {
            return this.mImageToskey;
        }

        public final long component2() {
            return this.mErrorCode;
        }

        public final String component3() {
            return this.mExtra;
        }

        public final String component4() {
            return this.mEncryptionImageTosKey;
        }

        public final long component5() {
            return this.mProgress;
        }

        public final String component6() {
            return this.mMetaInfo;
        }

        public final ImageUploadInfo copy(String str, long j2, String str2, String str3, long j3, String str4) {
            return new ImageUploadInfo(str, j2, str2, str3, j3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageUploadInfo)) {
                return false;
            }
            ImageUploadInfo imageUploadInfo = (ImageUploadInfo) obj;
            return l.a(this.mImageToskey, imageUploadInfo.mImageToskey) && this.mErrorCode == imageUploadInfo.mErrorCode && l.a(this.mExtra, imageUploadInfo.mExtra) && l.a(this.mEncryptionImageTosKey, imageUploadInfo.mEncryptionImageTosKey) && this.mProgress == imageUploadInfo.mProgress && l.a(this.mMetaInfo, imageUploadInfo.mMetaInfo);
        }

        public final int hashCode() {
            String str = this.mImageToskey;
            int i2 = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_uploader_factory_AbstractImageUploader$ImageUploadInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mErrorCode)) * 31;
            String str2 = this.mExtra;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.mEncryptionImageTosKey;
            int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_uploader_factory_AbstractImageUploader$ImageUploadInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mProgress)) * 31;
            String str4 = this.mMetaInfo;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "ImageUploadInfo(mImageToskey=" + this.mImageToskey + ", mErrorCode=" + this.mErrorCode + ", mExtra=" + this.mExtra + ", mEncryptionImageTosKey=" + this.mEncryptionImageTosKey + ", mProgress=" + this.mProgress + ", mMetaInfo=" + this.mMetaInfo + ")";
        }

        public final String getMEncryptionImageTosKey() {
            return this.mEncryptionImageTosKey;
        }

        public final long getMErrorCode() {
            return this.mErrorCode;
        }

        public final String getMExtra() {
            return this.mExtra;
        }

        public final String getMImageToskey() {
            return this.mImageToskey;
        }

        public final String getMMetaInfo() {
            return this.mMetaInfo;
        }

        public final long getMProgress() {
            return this.mProgress;
        }

        public final void setMEncryptionImageTosKey(String str) {
            this.mEncryptionImageTosKey = str;
        }

        public final void setMErrorCode(long j2) {
            this.mErrorCode = j2;
        }

        public final void setMExtra(String str) {
            this.mExtra = str;
        }

        public final void setMImageToskey(String str) {
            this.mImageToskey = str;
        }

        public final void setMMetaInfo(String str) {
            this.mMetaInfo = str;
        }

        public final void setMProgress(long j2) {
            this.mProgress = j2;
        }

        public ImageUploadInfo(String str, long j2, String str2, String str3, long j3, String str4) {
            this.mImageToskey = str;
            this.mErrorCode = j2;
            this.mExtra = str2;
            this.mEncryptionImageTosKey = str3;
            this.mProgress = j3;
            this.mMetaInfo = str4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ImageUploadInfo(String str, long j2, String str2, String str3, long j3, String str4, int i2, g gVar) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : j2, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) == 0 ? j3 : 0, (i2 & 32) == 0 ? str4 : null);
        }
    }

    public AbstractImageUploader(e eVar) {
        l.d(eVar, "");
        this.f141999a = eVar;
    }
}
