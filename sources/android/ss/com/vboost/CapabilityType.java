package android.ss.com.vboost;

import com.bytedance.covode.number.Covode;

/* JADX WARN: Init of enum TYPE_MIN can be incorrect */
/* JADX WARN: Init of enum TYPE_MAX can be incorrect */
public enum CapabilityType {
    CPU_FREQ_MIN("cpu_freq_min", 1),
    CPU_FREQ_MAX("cpu_freq_max", 2),
    CPU_CORE_MIN("cpu_core_min", 3),
    CPU_CORE_MAX("cpu_core_max", 4),
    GPU_FREQ_MIN("gpu_freq_min", 5),
    GPU_FREQ_MAX("gpu_freq_max", 6),
    BUS_FREQ_MIN("bus_freq_min", 7),
    BUS_FREQ_MAX("bus_freq_max", 8),
    UFS_FREQ_MIN("ufs_freq_min", 9),
    UFS_FREQ_MAX("ufs_freq_max", 10),
    TASK_PRIORITY("task_priority", 11),
    CPU_AFFINITY("cpu_affinity", 12),
    IDLE_STATE("idle_state", 13),
    IO_PRELOAD("io_preload", 14),
    NETWORK_ENHANCE("network_enhance", 15),
    PRESET_SCENE("preset_scene", 16),
    THUMB_FETCH("thumb_fetch", 17),
    VIBRATE_ENHANCE("vibrate_enhance", 18),
    TYPE_MIN(r11),
    TYPE_MAX(r0);
    
    private int index;
    private String name;

    public final int getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    static {
        Covode.recordClassIndex(4);
    }

    public static CapabilityType valueOf(int i2) {
        CapabilityType[] values = values();
        for (CapabilityType capabilityType : values) {
            if (i2 == capabilityType.index) {
                return capabilityType;
            }
        }
        throw new RuntimeException("Can't find enum type for index: ".concat(String.valueOf(i2)));
    }

    private CapabilityType(CapabilityType capabilityType) {
        this.name = capabilityType.name;
        this.index = capabilityType.index;
    }

    private CapabilityType(String str, int i2) {
        this.name = str;
        this.index = i2;
    }
}
