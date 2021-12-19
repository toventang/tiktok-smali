package com.bytedance.bae.router.receiver;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.router.device.BluetoothHeadsetScoDeviceManager;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class BTHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private BluetoothHeadsetScoDeviceManager mBTDeviceManager;

    static {
        Covode.recordClassIndex(15399);
    }

    private String getBTAdapterState(int i2) {
        return i2 != 10 ? i2 != 12 ? "adapter_known" : "adapter_on" : "adapter_off";
    }

    private String getBTHeadsetAudioStateName(int i2) {
        switch (i2) {
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return "audio_disconnected";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                return "audio_connecting";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                return "audio_connected";
            default:
                return "unknown_audio_state";
        }
    }

    private String getBTProfileStateName(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "unknown_state" : "disconnecting" : "connected" : "connecting" : "disconnected";
    }

    private String getScoAudioStateName(int i2) {
        return i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? "sco_audio_unknown" : "sco_audio_connecting" : "sco_audio_connected" : "sco_audio_disconnected" : "sco_audio_error";
    }

    public BTHeadsetBroadcastReceiver(BluetoothHeadsetScoDeviceManager bluetoothHeadsetScoDeviceManager) {
        this.mBTDeviceManager = bluetoothHeadsetScoDeviceManager;
    }

    private void onBlueToothDeviceOnline(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null && bluetoothDevice.getBluetoothClass() != null && this.mBTDeviceManager.mBTHeadset != null) {
            this.mBTDeviceManager.resetScoConnectionAttempts();
            this.mBTDeviceManager.onDeviceOnline();
        }
    }

    private void onBlueToothDeviceOffline(BluetoothDevice bluetoothDevice) {
        BluetoothAdapter defaultAdapter;
        if (this.mBTDeviceManager.isDevicePlugged() && bluetoothDevice != null && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
            BaeLogging.w("BTHeadsetBroadcastReceiver", "Bluetooth device " + bluetoothDevice + " disconnected, state:" + defaultAdapter.getProfileConnectionState(1) + " btAdapter:" + defaultAdapter.toString());
            this.mBTDeviceManager.onDeviceOffline();
        }
    }

    private String getBTDeviceInfo(BluetoothDevice bluetoothDevice) {
        String str;
        if (bluetoothDevice == null) {
            BaeLogging.e("BTHeadsetBroadcastReceiver", "getBTDeviceInfo device is null");
            return "";
        }
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass == null) {
            str = "null";
        } else {
            str = "" + bluetoothClass.toString() + " major_class: " + bluetoothClass.getMajorDeviceClass() + " service: [ audio=" + bluetoothClass.hasService(2097152) + " capture=" + bluetoothClass.hasService(524288) + " information=" + bluetoothClass.hasService(8388608) + " limited_discoverability=" + bluetoothClass.hasService(8192) + " networking=" + bluetoothClass.hasService(131072) + " object_transfer=" + bluetoothClass.hasService(1048576) + " positioning=" + bluetoothClass.hasService(65536) + " render=" + bluetoothClass.hasService(262144) + " telephony=" + bluetoothClass.hasService(4194304) + " ]";
        }
        return "" + "name: " + bluetoothDevice.getName() + " class: " + str;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            BaeLogging.w("BTHeadsetBroadcastReceiver", "BT ACTION_CONNECTION_STATE_CHANGED from " + getBTProfileStateName(intExtra2) + " to " + getBTProfileStateName(intExtra) + " bt_device_info: " + getBTDeviceInfo(bluetoothDevice) + " mBTHeadset: " + this.mBTDeviceManager.mBTHeadset);
            if (intExtra == 0) {
                onBlueToothDeviceOffline(bluetoothDevice);
            } else if (intExtra == 2) {
                onBlueToothDeviceOnline(bluetoothDevice);
            }
        } else if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(action)) {
            int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
            BaeLogging.w("BTHeadsetBroadcastReceiver", "BT ACTION_AUDIO_STATE_CHANGED from " + getBTHeadsetAudioStateName(intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99)) + " to " + getBTHeadsetAudioStateName(intExtra3) + " bt_device_info: " + getBTDeviceInfo((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) + " mBTHeadset: " + this.mBTDeviceManager.mBTHeadset);
        } else if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(action)) {
            int intExtra4 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
            BaeLogging.w("BTHeadsetBroadcastReceiver", "BT ACTION_SCO_AUDIO_STATE_UPDATED from " + getScoAudioStateName(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99)) + " to " + getScoAudioStateName(intExtra4) + " mBTHeadset: " + this.mBTDeviceManager.mBTHeadset);
            if (intExtra4 != 0) {
                if (intExtra4 == 1 && this.mBTDeviceManager.mBTAdapter != null && this.mBTDeviceManager.mBTAdapter.getProfileConnectionState(1) == 2) {
                    BaeLogging.w("BTHeadsetBroadcastReceiver", "Bluetooth SCO device connected");
                    this.mBTDeviceManager.cancelBluetoothSCOConnTimer();
                    this.mBTDeviceManager.onScoConnected();
                }
            } else if (this.mBTDeviceManager.isDevicePlugged() && this.mBTDeviceManager.mBTHeadset != null) {
                this.mBTDeviceManager.onScoDisconnected();
            }
        } else if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra5 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
            BaeLogging.w("BTHeadsetBroadcastReceiver", "BT BluetoothAdapter.ACTION_STATE_CHANGED from " + getBTAdapterState(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99)) + " to " + getBTAdapterState(intExtra5));
            if (intExtra5 == 10) {
                this.mBTDeviceManager.onDeviceOffline();
            } else if (intExtra5 == 12) {
                if (this.mBTDeviceManager.mBTAdapter == null) {
                    BaeLogging.w("BTHeadsetBroadcastReceiver", "BT BluetoothAdapter state on, mBTAdapter is null");
                    return;
                }
                int profileConnectionState = this.mBTDeviceManager.mBTAdapter.getProfileConnectionState(2);
                int profileConnectionState2 = this.mBTDeviceManager.mBTAdapter.getProfileConnectionState(1);
                if (profileConnectionState == 2 || profileConnectionState2 == 2) {
                    BaeLogging.w("BTHeadsetBroadcastReceiver", "BT BluetoothAdapter state on and trigger BT onDeviceOnline, a2dp_state:" + profileConnectionState + " headset_state:" + profileConnectionState2);
                    this.mBTDeviceManager.onDeviceOnline();
                }
            }
        }
    }
}
