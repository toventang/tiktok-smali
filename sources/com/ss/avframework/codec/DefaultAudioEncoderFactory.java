package com.ss.avframework.codec;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.engine.AudioEncoder;
import com.ss.avframework.engine.AudioEncoderFactory;
import com.ss.avframework.utils.AVLog;

public class DefaultAudioEncoderFactory extends AudioEncoderFactory {
    private static final String TAG = DefaultAudioEncoderFactory.class.getName();

    private native AudioEncoder nativeDefaultCreateAudioEncoder(String str, boolean z);

    private native String nativeDefaultGetSupportedFormats();

    static {
        Covode.recordClassIndex(99748);
    }

    @Override // com.ss.avframework.engine.AudioEncoderFactory
    public String GetSupportedFormats() {
        MethodCollector.i(14254);
        String GetSupportedFormats = AACHWAudioEncoder.GetSupportedFormats();
        String nativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats();
        if (nativeDefaultGetSupportedFormats != null && !nativeDefaultGetSupportedFormats.isEmpty()) {
            GetSupportedFormats = GetSupportedFormats + ":" + nativeDefaultGetSupportedFormats;
        }
        MethodCollector.o(14254);
        return GetSupportedFormats;
    }

    @Override // com.ss.avframework.engine.AudioEncoderFactory
    public AudioEncoder CreateAudioEncoder(String str, boolean z) {
        String str2;
        AACHWAudioEncoder aACHWAudioEncoder;
        MethodCollector.i(14225);
        String[] split = str.split(":");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str3 = split[i2];
            if (str3.contains("audio_type")) {
                String[] split2 = str3.split("=");
                if (split2.length > 1) {
                    str2 = split2[1];
                }
            } else {
                i2++;
            }
        }
        str2 = "";
        if (str2.equalsIgnoreCase("audio/mp4a-latm")) {
            AACHWAudioEncoder aACHWAudioEncoder2 = new AACHWAudioEncoder();
            boolean z2 = aACHWAudioEncoder2.setupCodecName();
            aACHWAudioEncoder = aACHWAudioEncoder2;
            if (!z2) {
                AVLog.ioe(TAG, str2 + " is not supported on this device.");
                aACHWAudioEncoder2.release();
            }
            MethodCollector.o(14225);
            return aACHWAudioEncoder;
        }
        aACHWAudioEncoder = nativeDefaultCreateAudioEncoder(str, z);
        MethodCollector.o(14225);
        return aACHWAudioEncoder;
    }
}
