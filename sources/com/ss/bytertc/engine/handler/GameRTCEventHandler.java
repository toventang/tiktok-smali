package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.GameRTCEngineImpl;
import com.ss.bytertc.engine.InternalGameAudioVolumeInfo;
import com.ss.bytertc.engine.handler.IGameRTCEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class GameRTCEventHandler {
    private WeakReference<GameRTCEngineImpl> mGameRTCEngineImpl;

    static {
        Covode.recordClassIndex(100898);
    }

    public static int com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public GameRTCEventHandler(GameRTCEngineImpl gameRTCEngineImpl) {
        this.mGameRTCEngineImpl = new WeakReference<>(gameRTCEngineImpl);
    }

    private IGameRTCEventHandler.UserLeaveReasonType ConvertIntToUserLeaveReasonType(int i2) {
        if (i2 == 0) {
            return IGameRTCEventHandler.UserLeaveReasonType.QUIT;
        }
        if (i2 != 1) {
            return IGameRTCEventHandler.UserLeaveReasonType.INVALID;
        }
        return IGameRTCEventHandler.UserLeaveReasonType.DROPPED;
    }

    private IGameRTCEventHandler.JoinRoomErrorCode ConvertIntToJoinRoomErrorCode(int i2) {
        if (i2 == -2001) {
            return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_FAILED;
        }
        if (i2 == -1001) {
            return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_ERROR;
        }
        if (i2 != -1000) {
            return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_SUCCESS;
        }
        return IGameRTCEventHandler.JoinRoomErrorCode.JOIN_ROOM_INVALID_TOKEN;
    }

    private IGameRTCEventHandler.RoomErrorCode ConvertIntToRoomErrorCode(int i2) {
        switch (i2) {
            case -1004:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_DUPLICATE_LOGIN;
            case -1003:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_NO_SUBSCRIBE_PERMISSION;
            case -1002:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_NO_PUBLISH_PERMISSION;
            default:
                return IGameRTCEventHandler.RoomErrorCode.ROOM_ERROR_INVALID;
        }
    }

    private IGameRTCEventHandler.RoomWarnCode ConvertIntToRoomWarnCode(int i2) {
        if (i2 == -2007) {
            return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_INVALID_EXPECT_MS_ADDR;
        }
        switch (i2) {
            case -2004:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_SUBSCRIBE_STREAM_FAILED_5XX;
            case -2003:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_SUBSCRIBE_STREAM_FAILED_404;
            case -2002:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_PUBLISH_STREAM_FAILED;
            default:
                return IGameRTCEventHandler.RoomWarnCode.ROOM_WARN_INVALID;
        }
    }

    private IGameRTCEventHandler.ConnectionState ConvertIntToConnectionState(int i2) {
        if (i2 == 0) {
            return IGameRTCEventHandler.ConnectionState.DISCONNECTED;
        }
        if (i2 == 1) {
            return IGameRTCEventHandler.ConnectionState.CONNECTING;
        }
        if (i2 == 2) {
            return IGameRTCEventHandler.ConnectionState.CONNECTED;
        }
        if (i2 == 3) {
            return IGameRTCEventHandler.ConnectionState.RECONNECTING;
        }
        if (i2 == 4) {
            return IGameRTCEventHandler.ConnectionState.RECONNECTED;
        }
        if (i2 != 5) {
            return IGameRTCEventHandler.ConnectionState.INVALID;
        }
        return IGameRTCEventHandler.ConnectionState.LOST;
    }

    private IGameRTCEventHandler.EngineWarnCode ConvertIntToEngineWarnCode(int i2) {
        switch (i2) {
            case -5006:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_NO_PLAYOUT_DEVICE;
            case -5005:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_NO_RECORDING_DEVICE;
            case -5004:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_PLAYOUT_START_FAIL;
            case -5003:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_ADM_RECORDING_START_FAIL;
            case -5002:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_NO_MICROPHONE_PERMISSION;
            default:
                return IGameRTCEventHandler.EngineWarnCode.ENGINE_WARN_INVALID;
        }
    }

    private IGameRTCEventHandler.NetworkQuality ConvertIntToNetworkQuality(int i2) {
        if (i2 == 0) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_UNKNOWN;
        }
        if (i2 == 1) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_EXCELLENT;
        }
        if (i2 == 2) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_GOOD;
        }
        if (i2 == 3) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_POOR;
        }
        if (i2 == 4) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_BAD;
        }
        if (i2 != 5) {
            return IGameRTCEventHandler.NetworkQuality.QUALITY_INVALID;
        }
        return IGameRTCEventHandler.NetworkQuality.QUALITY_VBAD;
    }

    public void onConnectionStateChanged(int i2) {
        LogUtil.d("GameRTCEventHandler", "onConnectionStateChanged...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onConnectionStateChanged(ConvertIntToConnectionState(i2));
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onConnectionStateChanged GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onConnectionStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onEngineWarning(int i2) {
        LogUtil.d("GameRTCEventHandler", "onEngineWarning...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onEngineWarning(ConvertIntToEngineWarnCode(i2));
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onEngineWarning GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onEngineWarning callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLeaveRoom(String str) {
        LogUtil.d("GameRTCEventHandler", "onLeaveRoom...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onLeaveRoom(str);
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onLeaveRoom GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onLeaveRoom callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomError(String str, int i2) {
        LogUtil.d("GameRTCEventHandler", "onRoomError...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onRoomError(str, ConvertIntToRoomErrorCode(i2));
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onRoomError GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onRoomError callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomWarning(String str, int i2) {
        LogUtil.d("GameRTCEventHandler", "onRoomWarning...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onRoomWarning(str, ConvertIntToRoomWarnCode(i2));
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onRoomWarning GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onRoomWarning callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserJoined(String str, String str2) {
        LogUtil.d("GameRTCEventHandler", "onUserJoined...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onUserJoined(str, str2);
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onUserJoined GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onUserJoined callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLogReport(String str, String str2) {
        LogUtil.d("GameRTCEventHandler", "onLogReport...");
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                        GameRTCEngineImpl.getGameRTCEventHandler().onLogReport(str, jSONObject);
                    } else {
                        com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "GameRTCEngineImpl.getGameRTCEventHandler() == null");
                    }
                    try {
                        if ("rtc_media_statistics".equals(jSONObject.getString("event_key")) || "rtc_transport_statistics".equals(jSONObject.getString("event_key")) || "rtc_statistics".equals(jSONObject.getString("event_key"))) {
                            return;
                        }
                    } catch (JSONException e2) {
                        LogUtil.d("GameRTCEventHandler", "onLogReport...get event_key catch exception: " + e2.getMessage());
                        return;
                    }
                } catch (JSONException e3) {
                    LogUtil.d("GameRTCEventHandler", "onLogReport...parse json catch exception: " + e3.getMessage());
                    return;
                }
            }
            LogUtil.i(str, str2);
        } catch (Exception e4) {
            LogUtil.d("GameRTCEventHandler", "onLogReport callback catch exception.\n" + e4.getMessage());
        }
    }

    public void onAudioSendEnabled(String str, String str2, boolean z) {
        LogUtil.d("GameRTCEventHandler", "onAudioSendEnabled...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioSendEnabled(str, str2, z);
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onAudioSendEnabled GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onAudioSendEnabled callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onMicrophoneEnabled(String str, String str2, boolean z) {
        LogUtil.d("GameRTCEventHandler", "onMicrophoneEnabled...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onMicrophoneEnabled(str, str2, z);
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onMicrophoneEnabled GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onMicrophoneEnabled callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSpeakerphoneEnabled(String str, String str2, boolean z) {
        LogUtil.d("GameRTCEventHandler", "onSpeakerphoneEnabled...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onSpeakerphoneEnabled(str, str2, z);
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onSpeakerphoneEnabled GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onSpeakerphoneEnabled callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserLeave(String str, String str2, int i2) {
        LogUtil.d("GameRTCEventHandler", "onUserOffline...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onUserLeave(str, str2, ConvertIntToUserLeaveReasonType(i2));
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onUserLeave GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onUserOffline callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onAudioVolumeIndication(String str, InternalGameAudioVolumeInfo[] internalGameAudioVolumeInfoArr, int i2) {
        LogUtil.d("GameRTCEventHandler", "onAudioVolumeIndication...");
        try {
            IGameRTCEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IGameRTCEventHandler.AudioVolumeInfo[internalGameAudioVolumeInfoArr.length];
            String[] strArr = new String[internalGameAudioVolumeInfoArr.length];
            int[] iArr = new int[internalGameAudioVolumeInfoArr.length];
            for (int i3 = 0; i3 < internalGameAudioVolumeInfoArr.length; i3++) {
                audioVolumeInfoArr[i3] = new IGameRTCEventHandler.AudioVolumeInfo(internalGameAudioVolumeInfoArr[i3]);
                strArr[i3] = internalGameAudioVolumeInfoArr[i3].userId;
                iArr[i3] = internalGameAudioVolumeInfoArr[i3].volume;
            }
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onAudioVolumeIndication(str, new IGameRTCEventHandler.AudioVolumeInfoArray(strArr, iArr), i2);
                return;
            }
            com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onAudioVolumeIndication GameRTCEngineImpl.getGameRTCEventHandler() == null");
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onNetworkQuality(String str, String str2, int i2, int i3) {
        LogUtil.d("GameRTCEventHandler", "onNetworkQuality...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onNetworkQuality(str, str2, ConvertIntToNetworkQuality(i2), ConvertIntToNetworkQuality(i3));
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onNetworkQuality GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onNetworkQuality callback catch exception.\n" + e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void onJoinRoomResult(String str, String str2, int i2, boolean z, int i3) {
        LogUtil.d("GameRTCEventHandler", "onJoinRoomResult...");
        try {
            if (GameRTCEngineImpl.getGameRTCEventHandler() != null) {
                GameRTCEngineImpl.getGameRTCEventHandler().onJoinRoomResult(str, str2, ConvertIntToJoinRoomErrorCode(i2), z, i3);
            } else {
                com_ss_bytertc_engine_handler_GameRTCEventHandler_com_ss_android_ugc_aweme_lancet_LogLancet_w("GameRTCEventHandler", "onJoinRoomResult GameRTCEngineImpl.getGameRTCEventHandler() == null");
            }
        } catch (Exception e2) {
            LogUtil.d("GameRTCEventHandler", "onJoinRoomResult callback catch exception.\n" + e2.getMessage());
        }
    }
}
