package com.ss.avframework.livestreamv2.core;

import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.game.MessageBox;
import com.ss.avframework.utils.TEBundle;

public interface IGameEngine {

    public interface GameEventListener {
        static {
            Covode.recordClassIndex(100054);
        }

        void onGameFirstRemoteFrameAvailable();
    }

    public interface GameLoadCallback extends GamePreloadCallback {
        static {
            Covode.recordClassIndex(100055);
        }

        void onError(String str, Throwable th);

        void onSuccess(String str, IGameClient iGameClient);
    }

    public interface GamePreloadCallback {

        public interface GamePreloadTask {
            static {
                Covode.recordClassIndex(100057);
            }

            boolean cancel();

            String getGameId();
        }

        static {
            Covode.recordClassIndex(100056);
        }

        void onDownloadCancel(String str);

        void onDownloadError(String str, String str2, Throwable th);

        void onDownloadStart(String str, GamePreloadTask gamePreloadTask);

        void onDownloadSuccess(String str);

        void onDownloadingProgress(String str, int i2);
    }

    public interface IGameClient {

        public interface Listener {
            static {
                Covode.recordClassIndex(100059);
            }

            void onGameSetMessageHandler(boolean z);

            void onReceiveGameClientMessage(MessageBox messageBox);
        }

        static {
            Covode.recordClassIndex(100058);
        }

        void destroy();

        void pause();

        boolean postMessage(MessageBox messageBox);

        void resume();

        void setListener(Listener listener);
    }

    static {
        Covode.recordClassIndex(100053);
    }

    void clearGameResource(String str);

    void disableCameraWhenPublishGame(boolean z);

    void enablePublish(boolean z);

    String getAudioLayerName();

    GameParameter getPublishParameter();

    float getRenderFps();

    TEBundle getRtcParameter();

    String getVideoLayerName();

    void initGameEngine();

    boolean isEnablePublish();

    boolean isEnableRender();

    boolean isGamePackageDownloaded(String str);

    boolean onActivityResult(String str, int i2, int i3, Intent intent);

    boolean onBackPressed(String str);

    void onMemoryWarning(String str, int i2);

    void onRequestPermissionsResult(String str, int i2, String[] strArr, int[] iArr);

    void preload(String str, GamePreloadCallback gamePreloadCallback);

    void setDisplay(View view);

    void setEnableRender(boolean z);

    void setGameEventListener(GameEventListener gameEventListener);

    void setPublishParameter(GameParameter gameParameter);

    void setPublishStreamWithGameResolution(boolean z);

    void setRtcParameter(TEBundle tEBundle);

    void setUseCameraMainGameMode(boolean z);

    void startGame(String str, GameLoadCallback gameLoadCallback, GameLauncherParameter gameLauncherParameter);

    void updateCameraPosition(float f2, float f3, float f4, float f5, boolean z);
}
