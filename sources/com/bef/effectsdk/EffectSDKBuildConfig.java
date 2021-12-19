package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class EffectSDKBuildConfig {
    private static int ENABLE_AUDIO_EFFECT = 1;
    private static int ENABLE_BORINGSSL;
    private static int ENABLE_FFMPEG = 1;
    private static int ENABLE_IES_APPLOGGER = 1;
    private static int ENABLE_JAZZ = 1;
    private static int ENABLE_LENS;
    private static int ENABLE_SPEECH_ASR;
    private static int ENABLE_SPEECH_CAPT;
    private static int ENABLE_VC0 = 1;

    static {
        Covode.recordClassIndex(2830);
    }

    public static List<String> getEffectLibs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        if (ENABLE_BORINGSSL == 1 || ENABLE_FFMPEG == 1) {
            arrayList.add("ttcrypto");
            arrayList.add("ttboringssl");
        }
        if (ENABLE_FFMPEG == 1) {
            arrayList.add("ttffmpeg");
        }
        if (ENABLE_IES_APPLOGGER == 1) {
            arrayList.add("iesapplogger");
        }
        arrayList.add("bytenn");
        if (ENABLE_AUDIO_EFFECT == 1) {
            arrayList.add("audioeffect");
        }
        if (ENABLE_SPEECH_CAPT == 1 || ENABLE_SPEECH_ASR == 1) {
            arrayList.add("speechsdk");
        }
        arrayList.add("gaia_lib");
        arrayList.add("AGFX");
        if (ENABLE_LENS == 1) {
            arrayList.add("lens");
        }
        if (ENABLE_JAZZ == 1) {
            arrayList.add("jazz");
        }
        if (ENABLE_VC0 == 1) {
            arrayList.add("bytevc0");
        }
        arrayList.add("effect");
        return arrayList;
    }
}
