package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public interface ByteAudioSinkInterface {

    public interface ByteAudioAuxSink {
        static {
            Covode.recordClassIndex(15316);
        }

        void onMixingBegin(ByteAudioAuxStream byteAudioAuxStream);

        void onMixingEnd(ByteAudioAuxStream byteAudioAuxStream);

        int onPullAudioBufferToAuxStream(ByteAudioAuxStream byteAudioAuxStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioFilterSink {
        static {
            Covode.recordClassIndex(15317);
        }

        int onProcess(ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioInputSink {
        static {
            Covode.recordClassIndex(15318);
        }

        int onPushAudioBufferFromStream(ByteAudioInputStream byteAudioInputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    public interface ByteAudioOutputSink {
        static {
            Covode.recordClassIndex(15319);
        }

        int onPullAudioBufferToStream(ByteAudioOutputStream byteAudioOutputStream, ByteAudioStreamBuffer byteAudioStreamBuffer);
    }

    static {
        Covode.recordClassIndex(15315);
    }
}
