package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.a;
import com.ss.android.ugc.aweme.shortvideo.publish.ae;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public final class SynthetiseResult implements Cloneable {
    public float audioLength;
    public String cpuName;
    public int draftHardEncode;
    public EditPreviewInfo editPreviewInfo;
    public int effect;
    public int[] effectArray;
    public String fastImportResolution;
    public int filterIndex;
    public int flags;
    public String gpuName;
    public boolean hasSubtitle;
    public boolean isEnableFpsSet;
    public boolean isFastImport;
    public boolean isFastImportForLog;
    public boolean isFromDraft;
    public int isMusic;
    public boolean isTTStory;
    public int musicType;
    public boolean needRecode = true;
    public String outputFile;
    public VideoFileInfo outputVideoFileInfo;
    public String outputWavFile;
    public int ret;
    public String reverseFile;
    public int segmentCount;
    public List<ae> smartCompileSettings;
    public int specialPoints;
    public int synthetiseCPUEncode;
    public List<String> texts;
    public int unableRemuxCode;
    public int videoHeight;
    public float videoLength;
    public int videoWidth;

    static {
        Covode.recordClassIndex(81987);
    }

    @Override // java.lang.Object
    public final SynthetiseResult clone() {
        try {
            return (SynthetiseResult) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final int getFps() {
        VideoFileInfo videoFileInfo = this.outputVideoFileInfo;
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.getFps();
    }

    public final int getReportHardEncode() {
        return ((this.synthetiseCPUEncode ^ 1) * 10) + this.draftHardEncode;
    }

    public final boolean isUsingVECompiler() {
        if ((this.flags & 1) == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        try {
            return "SynthetiseResult{ret=" + this.ret + ", draftHardEncode=" + this.draftHardEncode + ", synthetiseCPUEncode=" + this.synthetiseCPUEncode + ", inputVideoFile='" + a.a(this.editPreviewInfo) + '\'' + ",length=" + a.c(this.editPreviewInfo) + ", reverseFile='" + this.reverseFile + '\'' + ",length=" + new File(this.reverseFile).length() + ", outputWavFile='" + a.e(this.editPreviewInfo) + '\'' + ",length=" + a.d(this.editPreviewInfo) + ", isMusic=" + this.isMusic + ", outputFile='" + this.outputFile + '\'' + ",length=" + new File(this.outputFile).length() + ", effect=" + this.effect + ", specialPoints=" + this.specialPoints + ", filterIndex=" + this.filterIndex + ", musicType=" + this.musicType + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", effectArray=" + Arrays.toString(this.effectArray) + ", isFromDraft=" + this.isFromDraft + ", cpuName=" + this.cpuName + ", gpuName=" + this.gpuName + ", fileFps=" + getFps() + ", flags=" + this.flags + ", isEnableFpsSet=" + this.isEnableFpsSet + ", audioLength=" + this.audioLength + ", videoLength=" + this.videoLength + ", texts=" + this.texts + ", isFastImport" + this.isFastImport + ", isFastImportForLog" + this.isFastImportForLog + ", isTTStory" + this.isTTStory + ", hasSubtitle" + this.hasSubtitle + ", unableRemuxCode" + this.unableRemuxCode + '}';
        } catch (NullPointerException unused) {
            return "SynthetiseResult{ret=" + this.ret + ", draftHardEncode=" + this.draftHardEncode + ", synthetiseCPUEncode=" + this.synthetiseCPUEncode + ", inputVideoFile='" + a.a(this.editPreviewInfo) + '\'' + ", reverseFile='" + this.reverseFile + '\'' + ", outputWavFile='" + a.e(this.editPreviewInfo) + '\'' + ", isMusic=" + this.isMusic + ", outputFile='" + this.outputFile + '\'' + ", effect=" + this.effect + ", specialPoints=" + this.specialPoints + ", filterIndex=" + this.filterIndex + ", musicType=" + this.musicType + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", effectArray=" + Arrays.toString(this.effectArray) + ", isFromDraft=" + this.isFromDraft + ", cpuName=" + this.cpuName + ", gpuName=" + this.gpuName + ", fileFps=" + getFps() + ", flags=" + this.flags + ", isEnableFpsSet=" + this.isEnableFpsSet + ", audioLength=" + this.audioLength + ", videoLength=" + this.videoLength + ", texts=" + this.texts + ", isFastImport" + this.isFastImport + ", isFastImportForLog" + this.isFastImportForLog + ", hasSubtitle" + this.hasSubtitle + ", unableRemuxCode" + this.unableRemuxCode + '}';
        }
    }
}
