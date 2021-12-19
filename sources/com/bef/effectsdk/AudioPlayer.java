package com.bef.effectsdk;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AudioPlayer {
    public static final String TAG = AudioPlayer.class.getSimpleName();
    private String mFilename;
    public boolean mIsPrepared;
    public MediaPlayer mMediaPlayer;
    public long mNativePtr;

    public static int com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public native void nativeOnCompletion(long j2);

    public native void nativeOnError(long j2, int i2, int i3);

    public native void nativeOnInfo(long j2, int i2, int i3);

    public native void nativeOnPrepared(long j2);

    static {
        Covode.recordClassIndex(2821);
    }

    public float getCurrentPlayTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return ((float) mediaPlayer.getCurrentPosition()) / 1000.0f;
        }
        com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
        return 0.0f;
    }

    public float getTotalPlayTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return ((float) mediaPlayer.getDuration()) / 1000.0f;
        }
        com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
        return 0.0f;
    }

    public boolean pause() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.pause();
            return true;
        }
    }

    public boolean resume() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.start();
            return true;
        }
    }

    public int init() {
        this.mIsPrepared = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer2;
        mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            /* class com.bef.effectsdk.AudioPlayer.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2822);
            }

            public static int com_bef_effectsdk_AudioPlayer$1_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
                return 0;
            }

            public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
                MethodCollector.i(762);
                com_bef_effectsdk_AudioPlayer$1_com_ss_android_ugc_aweme_lancet_LogLancet_i(AudioPlayer.TAG, "MediaPlayer onInfo: [what, extra] = [" + i2 + ", " + i3 + "]");
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnInfo(audioPlayer.mNativePtr, i2, i3);
                MethodCollector.o(762);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            /* class com.bef.effectsdk.AudioPlayer.AnonymousClass2 */

            static {
                Covode.recordClassIndex(2823);
            }

            public static int com_bef_effectsdk_AudioPlayer$2_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
                return 0;
            }

            public static int com_bef_effectsdk_AudioPlayer$2_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
                return 0;
            }

            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                MethodCollector.i(754);
                com_bef_effectsdk_AudioPlayer$2_com_ss_android_ugc_aweme_lancet_LogLancet_d(AudioPlayer.TAG, "MediaPlayer onError: [what, extra] = [" + i2 + ", " + i3 + "]");
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    com_bef_effectsdk_AudioPlayer$2_com_ss_android_ugc_aweme_lancet_LogLancet_e(AudioPlayer.TAG, "MediaPlayer stop exception on error " + e2.toString());
                }
                AudioPlayer.this.mMediaPlayer = null;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnError(audioPlayer.mNativePtr, i2, i3);
                MethodCollector.o(754);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            /* class com.bef.effectsdk.AudioPlayer.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2824);
            }

            public static int com_bef_effectsdk_AudioPlayer$3_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
                return 0;
            }

            public void onPrepared(MediaPlayer mediaPlayer) {
                MethodCollector.i(659);
                com_bef_effectsdk_AudioPlayer$3_com_ss_android_ugc_aweme_lancet_LogLancet_i(AudioPlayer.TAG, "MediaPlayer onPrepared...");
                AudioPlayer.this.mIsPrepared = true;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnPrepared(audioPlayer.mNativePtr);
                MethodCollector.o(659);
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class com.bef.effectsdk.AudioPlayer.AnonymousClass4 */

            static {
                Covode.recordClassIndex(2825);
            }

            public static int com_bef_effectsdk_AudioPlayer$4_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
                return 0;
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                MethodCollector.i(1626);
                com_bef_effectsdk_AudioPlayer$4_com_ss_android_ugc_aweme_lancet_LogLancet_i(AudioPlayer.TAG, "MediaPlayer onCompletion...");
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnCompletion(audioPlayer.mNativePtr);
                MethodCollector.o(1626);
            }
        });
        return 0;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        boolean z = false;
        if (mediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else {
            try {
                z = mediaPlayer.isPlaying();
                return z;
            } catch (Exception e2) {
                e2.printStackTrace();
                com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer isPlaying exception. " + e2.toString());
                return z;
            }
        }
    }

    public int release() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        try {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        } catch (Exception e2) {
            e2.printStackTrace();
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer stop exception on release " + e2.toString());
        }
        this.mMediaPlayer = null;
        return 0;
    }

    public void startPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (!this.mIsPrepared) {
                    mediaPlayer.prepare();
                    this.mIsPrepared = true;
                }
                this.mMediaPlayer.start();
            } catch (Exception e2) {
                e2.printStackTrace();
                com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer setDataSource exception. " + e2.toString());
            }
        }
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
        } else if (this.mIsPrepared) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e2) {
                e2.printStackTrace();
                com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer stop exception on stop " + e2.toString());
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }

    public void setNativePtr(long j2) {
        this.mNativePtr = j2;
    }

    public boolean setVolume(float f2) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.setVolume(f2, f2);
            return true;
        }
    }

    public boolean seek(int i2) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        } else {
            try {
                mediaPlayer.seekTo(i2);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer seek exception. " + e2.toString());
                return true;
            }
        }
    }

    public boolean setLoop(boolean z) {
        if (this.mMediaPlayer == null) {
            com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer is null!");
            return false;
        }
        com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_i(TAG, "set isLoop ".concat(String.valueOf(z)));
        this.mMediaPlayer.setLooping(z);
        return true;
    }

    public void setDataSource(String str) {
        if (this.mMediaPlayer == null) {
            init();
        }
        if (!str.equals(this.mFilename) || !this.mIsPrepared || !this.mMediaPlayer.isPlaying()) {
            try {
                this.mMediaPlayer.reset();
                this.mMediaPlayer.setDataSource(str);
            } catch (Exception e2) {
                e2.printStackTrace();
                com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "MediaPlayer setDataSource exception. " + e2.toString());
            }
            this.mFilename = str;
        }
    }
}
