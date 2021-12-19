package com.bytedance.bae.router.device;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager;
import com.bytedance.bae.router.device.base.IAudioDeviceManager;
import com.bytedance.bae.router.receiver.BTHeadsetBroadcastReceiver;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.bytedance.covode.number.Covode;

public class BluetoothHeadsetScoDeviceManager extends BaseHotplugAudioDeviceManager {
    private final String BLUETOOTH_PERMISSION = "android.permission.BLUETOOTH";
    private final Runnable bluetoothSCOConnCheckerRunnable = new BluetoothHeadsetScoDeviceManager$$Lambda$0(this);
    public BluetoothAdapter mBTAdapter;
    public BluetoothHeadset mBTHeadset;
    private BluetoothProfile.ServiceListener mBTHeadsetListener;
    private OnBTScoDeviceCallback mCallback;
    private int mDynamicTimeout = 4000;
    private Handler mHandler;
    private int mScoConnectionAttempts = 1;

    public interface OnBTScoDeviceCallback extends IAudioDeviceManager.OnHotPlugDeviceCallback {
        static {
            Covode.recordClassIndex(15382);
        }

        void onScoConnected();

        void onScoDisconnected();
    }

    static {
        Covode.recordClassIndex(15379);
    }

    public void resetScoConnectionAttempts() {
        this.mScoConnectionAttempts = 1;
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager, com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
    public void onDeviceOffline() {
        super.onDeviceOffline();
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager, com.bytedance.bae.router.device.base.IAudioDeviceManager.HotplugDeviceListener
    public void onDeviceOnline() {
        super.onDeviceOnline();
    }

    private BluetoothProfile.ServiceListener createBTHeadsetListener() {
        return new BluetoothProfile.ServiceListener() {
            /* class com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15381);
            }

            public void onServiceDisconnected(int i2) {
                BaeLogging.w("BluetoothHeadsetScoDeviceManager", "onServiceConnected profile:".concat(String.valueOf(i2)));
                if (i2 == 1) {
                    BluetoothHeadsetScoDeviceManager.this.cancelBluetoothSCOConnTimer();
                    BluetoothHeadsetScoDeviceManager.this.mBTHeadset = null;
                }
            }

            public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
                BaeLogging.w("BluetoothHeadsetScoDeviceManager", "onServiceConnected profile:" + i2 + " proxy:" + bluetoothProfile);
                if (i2 == 1) {
                    BluetoothHeadsetScoDeviceManager.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                    BluetoothHeadsetScoDeviceManager.this.registerReceiver();
                }
            }
        };
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public BaseAudioDeviceBroadcastReceiver getBroadcastReceiver() {
        return new BTHeadsetBroadcastReceiver(this);
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public void onDestroy() {
        super.onDestroy();
        clearBTResource();
    }

    public void onScoConnected() {
        this.mCallback.onScoConnected();
    }

    public void onScoDisconnected() {
        this.mCallback.onScoDisconnected();
    }

    public void cancelBluetoothSCOConnTimer() {
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "cancel bluetooth timer");
        this.mHandler.removeCallbacks(this.bluetoothSCOConnCheckerRunnable);
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
        if (1 == getActiveState()) {
            stopBtSco();
        }
    }

    public boolean isDevicePlugged() {
        if (2 == getOnlineState()) {
            return true;
        }
        return false;
    }

    private void clearBTResource() {
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.closeProfileProxy(1, this.mBTHeadset);
            this.mBTAdapter = null;
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    private void stopBtSco() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            BaeLogging.e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "try to stopping bt sco ");
        doStopBTSco(audioManager);
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        if (getActiveState() == 1) {
            this.mCallback.onError(-1000, "Device already active");
        } else {
            checkAndActiveSCO();
        }
    }

    @Override // com.bytedance.bae.router.device.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager;
        if (getOnlineState() == 2 && (audioManager = getAudioManager()) != null && audioManager.isBluetoothScoOn()) {
            return 1;
        }
        return 2;
    }

    private void startBluetoothSCOConnTimer() {
        this.mDynamicTimeout = 4000;
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "start bluetooth timer mScoConnectionAttempts:" + this.mScoConnectionAttempts + " mDynamicTimeout:" + this.mDynamicTimeout);
        this.mHandler.postDelayed(this.bluetoothSCOConnCheckerRunnable, (long) this.mDynamicTimeout);
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public IntentFilter getBroadcastIntentFilter() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        return intentFilter;
    }

    private void initBluetoothHeadset() {
        Context context = getContext();
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") != 0) {
                BaeLogging.w("BluetoothHeadsetScoDeviceManager", "do not support BT monitoring on this device");
            } else if (!hasPermission(context)) {
                BaeLogging.w("BluetoothHeadsetScoDeviceManager", "lacks BLUETOOTH permission");
            } else if (this.mBTHeadsetListener != null) {
                BaeLogging.w("BluetoothHeadsetScoDeviceManager", "Bluetooth service Listener already been initialized");
            } else {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                this.mBTAdapter = defaultAdapter;
                if (defaultAdapter == null) {
                    BaeLogging.e("BluetoothHeadsetScoDeviceManager", "initialize: failed to get bluetooth adapter!!");
                    return;
                }
                try {
                    this.mBTHeadsetListener = createBTHeadsetListener();
                } catch (Exception e2) {
                    BaeLogging.e("BluetoothHeadsetScoDeviceManager", "initialize failed: unable to create BluetoothProfile.ServiceListener, err=" + e2.getMessage());
                }
                this.mBTAdapter.getProfileProxy(context, this.mBTHeadsetListener, 1);
                if (2 == this.mBTAdapter.getProfileConnectionState(1)) {
                    onDeviceOnline();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: bluetoothSCOConnChecker */
    public void bridge$lambda$0$BluetoothHeadsetScoDeviceManager() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            BaeLogging.e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        boolean z = false;
        if (audioManager.isBluetoothScoOn()) {
            BaeLogging.w("BluetoothHeadsetScoDeviceManager", "SCO connected");
            z = true;
        } else {
            BaeLogging.w("BluetoothHeadsetScoDeviceManager", "SCO is not connected");
        }
        if (this.mScoConnectionAttempts < 15) {
            BaeLogging.w("BluetoothHeadsetScoDeviceManager", "attemps trying, bt sco started: " + btStateAsString(getActiveState()) + " sco connected: " + z + " " + this.mScoConnectionAttempts + " times " + getActiveState() + "[" + btStateAsString(getActiveState()) + "]");
            if (1 != this.mOnlineState && 1 == getActiveState()) {
                startBluetoothSCOConnTimer();
                this.mScoConnectionAttempts++;
                doActiveSco(audioManager);
                return;
            }
            return;
        }
        BaeLogging.e("BluetoothHeadsetScoDeviceManager", "start bluetooth sco timeout");
        this.mScoConnectionAttempts = 1;
        this.mCallback.onError(-1001, "Could not establish SCO link.");
    }

    private void checkAndActiveSCO() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            BaeLogging.e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        int mode = audioManager.getMode();
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "try to opening bt sco " + this.mScoConnectionAttempts + " " + mode + "[" + modeAsString(mode) + "] " + getActiveState() + "[" + btStateAsString(getActiveState()) + "] sco on: " + audioManager.isBluetoothScoOn());
        if (!audioManager.isBluetoothScoOn()) {
            BaeLogging.w("BluetoothHeadsetScoDeviceManager", "Off call sco support = " + audioManager.isBluetoothScoAvailableOffCall());
            startBluetoothSCOConnTimer();
            this.mScoConnectionAttempts++;
            doActiveSco(audioManager);
        }
    }

    private boolean hasPermission(Context context) {
        if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0) {
            return true;
        }
        return false;
    }

    private String btStateAsString(int i2) {
        if (i2 == 0) {
            return "SCO_CONNECTING";
        }
        if (i2 == 1) {
            return "SCO_ACTIVE";
        }
        if (i2 != 2) {
            return "Unknown ".concat(String.valueOf(i2));
        }
        return "SCO_INACTIVE";
    }

    private void doStopBTSco(AudioManager audioManager) {
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn());
        audioManager.setBluetoothScoOn(false);
        audioManager.stopBluetoothSco();
        if (Build.VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, false);
        }
    }

    private String modeAsString(int i2) {
        if (i2 == 0) {
            return "MODE_NORMAL";
        }
        if (i2 == 1) {
            return "MODE_RINGTONE";
        }
        if (i2 == 2) {
            return "MODE_IN_CALL";
        }
        if (i2 != 3) {
            return "Unknown ".concat(String.valueOf(i2));
        }
        return "MODE_IN_COMMUNICATION";
    }

    @Override // com.bytedance.bae.router.device.base.BaseHotplugAudioDeviceManager
    public void onStickyIntentFoundWhenRegister(Intent intent) {
        if (!TextUtils.equals(intent.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            return;
        }
        if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) != 1) {
            BaeLogging.i("BluetoothHeadsetScoDeviceManager", "initial Bluetooth SCO device unconnected");
            return;
        }
        BaeLogging.i("BluetoothHeadsetScoDeviceManager", "initial Bluetooth SCO device connected");
        onScoConnected();
    }

    private void doActiveSco(AudioManager audioManager) {
        if (audioManager == null) {
            BaeLogging.e("BluetoothHeadsetScoDeviceManager", "invalid context: can't get AudioManager");
            this.mCallback.onError(-1002, "invalid context: can't get AudioManager");
            return;
        }
        int mode = audioManager.getMode();
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "doStartBTSco sdk_version:" + Build.VERSION.SDK_INT + " isDevicePlugged:" + isDevicePlugged() + " isBluetoothScoOn: " + audioManager.isBluetoothScoOn() + " mode: " + mode + "[" + modeAsString(mode) + "]");
        if (Build.VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, true);
        }
        if (isDevicePlugged()) {
            try {
                audioManager.setSpeakerphoneOn(false);
                audioManager.setBluetoothScoOn(false);
                audioManager.stopBluetoothSco();
                audioManager.startBluetoothSco();
                audioManager.setBluetoothScoOn(true);
            } catch (Exception e2) {
                BaeLogging.e("BluetoothHeadsetScoDeviceManager", e2.getMessage());
            }
        } else {
            BaeLogging.w("BluetoothHeadsetScoDeviceManager", "doStartBTSco is not device plugged");
        }
        BaeLogging.w("BluetoothHeadsetScoDeviceManager", "doStartBTSco done sco on: " + audioManager.isBluetoothScoOn() + " " + audioManager.getMode() + "[" + modeAsString(audioManager.getMode()) + "]");
    }

    public BluetoothHeadsetScoDeviceManager(Context context, Handler handler, OnBTScoDeviceCallback onBTScoDeviceCallback) {
        super(context, onBTScoDeviceCallback);
        this.mCallback = onBTScoDeviceCallback;
        this.mHandler = handler;
        initBluetoothHeadset();
    }
}
