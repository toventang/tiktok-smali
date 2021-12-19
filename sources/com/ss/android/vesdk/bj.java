package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class bj {

    /* renamed from: a  reason: collision with root package name */
    private Map<a, c<?>> f151104a = new HashMap();

    static {
        Covode.recordClassIndex(99355);
    }

    public enum a {
        ConfigID_UseImageAllocator("UseImageAllocator"),
        ConfigID_UseMultiEffectOpt("UseMultiEffectOpt"),
        ConfigID_PreLoadNextClip("PreLoadNextClip"),
        ConfigID_EnableHighSpeedChange("vesdk_high_speed_change_opt"),
        ConfigID_EnableEditorFpsLog("EnableEditorFpsLog"),
        ConfigID_EnableVideoOutputCallback("EnableVideoOutputCallback"),
        ConfigID_MaxAudioReaderCount("MaxAudioReaderCount"),
        ConfigID_MaxSoftwareVideoReaderCount("MaxSoftwareVideoReaderCount"),
        ConfigID_MaxSoftwareFreeReaderCount("MaxSoftwareFreeReaderCount"),
        ConfigID_MaxPreloadReaderCount("veabtest_crossplat_maxPreloadReaderCnt"),
        ConfigID_MaxHwReaderCount("MaxHwReaderCount"),
        ConfigID_MaxImageTextureBufferCount("MaxImageTextureBufferCount"),
        ConfigID_SetDropFramePara("SetDropFramePara"),
        ConfigID_DelayTimeThreshold("DelayTimeThreshold"),
        ConfigID_MaxDropFrameCount("MaxDropFrameCount"),
        ConfigID_MaxTexturePoolCount("MaxTexturePoolCount"),
        ConfigID_TexturePoolCleanCount("TexturePoolCleanCount"),
        ConfigID_UseMultiThreadPool("UseMultiThreadPool"),
        ConfigID_EnableFirstFrameOpt("EnableFirstFrameOpt"),
        ConfigID_MaxImageTextureBufferWidth("MaxImageTextureBufferWidth"),
        ConfigID_MaxImageTextureBufferHeight("MaxImageTextureBufferHeight"),
        ConfigID_MaxCacheFrameCount("vesdk_max_cache_count"),
        ConfigID_UseEffectTransiton("UseEffectTransiton"),
        ConfigID_UseRefaCanvasWrap("UseRefaCanvasWrap"),
        ConfigID_CacheGLContext("CacheGlContext"),
        ConfigID_EnbaleInfoStickerTrans("EnbaleInfoStickerTrans"),
        ConfigID_OpenSeekTimeOpt("OpenSeekTimeOpt"),
        ConfigID_UseGaussianOpt("UseGaussianOpt"),
        ConfigID_UseNewEngineEffectOpt("UseNewEngineEffectOpt"),
        ConfigID_CacheGlProgram("CacheGlProgram"),
        ConfigID_OutResolutionBase4("ve_enable_render_encode_resolution_align4"),
        ConfigID_EffectUseAmazingMV("EffectUseAmazingMV"),
        ConfigID_ForceDropFrameWithoutAudio("ForceDropFrameWithoutAudio"),
        ConfigID_UseAudioSDKApiV2("aeabtest_v2api"),
        ConfigID_SeekPredictOpt("vesdk_seek_predict_opt"),
        ConfigID_LowPhoneOpt("LowPhoneOpt"),
        ConfigID_CrossplatGLBaseFBO("crossplat_glbase_fbo"),
        ConfigID_EnableRenderlib("enable_render_lib"),
        ConfigID_EnableAGFXContext("EnableAGFXContext"),
        ConfigID_EnableAGFXMetal("vesdk_use_agfxmetal"),
        ConfigID_LoadImageOptimize("LoadImageOptimize"),
        ConfigID_GraphRefactor("s_bGraphRefactor"),
        ConfigID_EnableCompileByte264("compile_probe_use_byte264"),
        ConfigID_EnableByte264("use_byte264"),
        ConfigID_ColorSpaceRepair("color_space"),
        ConfigID_ColorSpaceRepairFor2020("ve_color_space_for_2020"),
        ConfigID_NewAudioMixer("vesdk_audiomix_replace"),
        ConfigID_OptimizeSRVUM("optimize srv_um crash"),
        ConfigID_AudioHwEncoder("vesdk_audio_hw_encoder"),
        ConfigID_SetStickerResolutionWithHeight("SetStickerResolutionWithHeight"),
        ConfigID_EnableMultiThreadDecode("EnableMultiThreadDecode"),
        ConfigID_EnableAudioGBURefactor("ve_enable_audio_gbu_refactor"),
        ConfigID_EnableHWPlaybackDropFrame("ve_enable_hwdecode_playback_dropframe_opt"),
        ConfigID_EnableSeekAndPreloadOpt("EnableSeekAndPreloadOpt"),
        ConfigID_EnableHdrVsOptimization("veabtest_hdr_vs_optimization"),
        ConfigID_EnableApplHdrSupport("vesdk_enable_apple_hdr_support"),
        ConfigID_EnableFileInfoCache("ve_enable_file_info_cache"),
        ConfigID_PinRefactor("ve_enable_pin_refactor"),
        ConfigID_EnablePBO("EnablePBO"),
        ConfigID_EnableHdrToneMapping("EnableHdrToneMapping"),
        ConfigID_CreateDecoderByName("create_by_codec_name"),
        ConfigID_EnableDisplayP3ReEncode("ve_enable_p3_re_encode"),
        ConfigID_EnableDisplayP3Render("EnableDisplayP3Render"),
        ConfigID_EnableAudioDisplayCallBack("EnableAudioDisplayCallBack"),
        ConfigID_EnableTransitionKeyframe("EnableTransitionKeyframe"),
        ConfigID_EnableCrossplatInputCompile("EnableCrossplatInputCompile"),
        ConfigID_CompileReport("ve_compile_report"),
        ConfigID_EnableiOSEditFirstFrameOpt("veabtest_crossplatEditFirstFrameOptimize"),
        ConfigID_EnableSkipUnitPassthrough("EnableSkipUnitPassthrough"),
        ConfigID_EnableReEncodeOpt("EnableReEncodeOpt"),
        ConfigID_ForceDetectFace("ve_enable_face_detection"),
        ConfigID_EnableStickerAmazing("EnableStickerAmazing"),
        ConfigID_EnableGlobalEffect("EnableGlobalEffect"),
        ConfigID_ForceDisableGlobalEffect("ForceDisableGlobalEffect"),
        ConfigID_EnableAdaptiveEncodeLevel("ve_enable_adaptive_encode_level"),
        ConfigID_EnableImportParallelCompile("veEnableImportParallelCompile"),
        ConfigID_StickerPinPreviewMode("StickerPinPreviewMode"),
        ConfigID_VeabtestEnableupsamplingopt("veabtest_enableUpSamplingOpt"),
        ConfigID_VeabtestEnablepreviewqualityopt("veabtest_enablePreviewQualityOpt"),
        ConfigID_VeabtestEnablecrossplatcanvasopt("veabtest_enableCrossplatCanvasOpt"),
        ConfigID_VeabtestEnablecrossplatcanvasdownscaleopt("veabtest_enableCrossplatCanvasDownscaleOpt");
        
        private String value;

        public final String value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(99356);
        }

        private a(String str) {
            this.value = str;
        }
    }

    public enum b {
        BOOLEAN(0),
        INTEGER(1);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(99357);
        }

        private b(int i2) {
            this.value = i2;
        }
    }

    public final c<?>[] a() {
        Collection<c<?>> values = this.f151104a.values();
        c<?>[] cVarArr = new c[values.size()];
        values.toArray(cVarArr);
        return cVarArr;
    }

    public static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public b f151107a;

        /* renamed from: b  reason: collision with root package name */
        public T f151108b;

        /* renamed from: c  reason: collision with root package name */
        public a f151109c;

        static {
            Covode.recordClassIndex(99358);
        }

        public final String toString() {
            return "VEUserConfigItem{dataType=" + this.f151107a + ", value=" + ((Object) this.f151108b) + ", id=" + this.f151109c + '}';
        }

        public c(a aVar, T t) {
            if (t instanceof Boolean) {
                this.f151107a = b.BOOLEAN;
            } else if (t instanceof Integer) {
                this.f151107a = b.INTEGER;
            } else {
                throw new IllegalArgumentException("illegal value type");
            }
            this.f151109c = aVar;
            this.f151108b = t;
        }
    }

    public final bj a(c<?> cVar) {
        this.f151104a.put(cVar.f151109c, cVar);
        return this;
    }
}
