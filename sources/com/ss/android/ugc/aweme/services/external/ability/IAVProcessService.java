package com.ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public interface IAVProcessService {

    public interface IProcessCallback<T> {
        static {
            Covode.recordClassIndex(79662);
        }

        void finish(T t);
    }

    static {
        Covode.recordClassIndex(79659);
    }

    void compileVideo(CompileParam compileParam, b<? super CompileResult, z> bVar, b<? super Throwable, z> bVar2);

    void compressPhoto(String str, Integer num, Integer num2, IProcessCallback<String> iProcessCallback);

    void createWaterMarkImages(int i2, int i3, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IProcessCallback<String[]> iProcessCallback);

    void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IProcessCallback<String[]> iProcessCallback);

    int[] getVideoFileInfo(String str);

    void muteVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback);

    public static final class CompileParam {
        private final String rawVideoPath;
        private int videoHeight;
        private int videoWidth;

        static {
            Covode.recordClassIndex(79660);
        }

        public final String getRawVideoPath() {
            return this.rawVideoPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            return "CompileParam{rawVideoPath=" + this.rawVideoPath + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + '}';
        }

        public final void setVideoHeight(int i2) {
            this.videoHeight = i2;
        }

        public final void setVideoWidth(int i2) {
            this.videoWidth = i2;
        }

        public CompileParam(String str, int i2, int i3) {
            l.d(str, "");
            this.rawVideoPath = str;
            this.videoWidth = i2;
            this.videoHeight = i3;
        }
    }

    public static final class CompileResult {
        private String checkPic;
        private String thumbnailPath;
        private int videoHeight = -1;
        private String videoMd5;
        private String videoPath;
        private int videoWidth = -1;

        static {
            Covode.recordClassIndex(79661);
        }

        public final String getCheckPic() {
            return this.checkPic;
        }

        public final String getThumbnailPath() {
            return this.thumbnailPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final String getVideoMd5() {
            return this.videoMd5;
        }

        public final String getVideoPath() {
            return this.videoPath;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final String toString() {
            return "CompileResult{videoPath=" + this.videoPath + ", videoMd5=" + this.videoMd5 + ", checkPic=" + this.checkPic + ", thumbnailPath=" + this.thumbnailPath + ", width=" + this.videoWidth + ", height=" + this.videoHeight + '}';
        }

        public final void setCheckPic(String str) {
            this.checkPic = str;
        }

        public final void setThumbnailPath(String str) {
            this.thumbnailPath = str;
        }

        public final void setVideoHeight(int i2) {
            this.videoHeight = i2;
        }

        public final void setVideoMd5(String str) {
            this.videoMd5 = str;
        }

        public final void setVideoPath(String str) {
            this.videoPath = str;
        }

        public final void setVideoWidth(int i2) {
            this.videoWidth = i2;
        }
    }
}
