package com.bytedance.z.a.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f46219a = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f46220b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f46221c;

    /* renamed from: d  reason: collision with root package name */
    public int f46222d = 37;

    /* renamed from: e  reason: collision with root package name */
    public int f46223e = 30;

    /* renamed from: f  reason: collision with root package name */
    public C1151a f46224f = new C1151a();

    static {
        Covode.recordClassIndex(28246);
    }

    /* renamed from: com.bytedance.z.a.a.a$a  reason: collision with other inner class name */
    public static class C1151a {

        /* renamed from: a  reason: collision with root package name */
        public String f46225a = "unknown";

        /* renamed from: b  reason: collision with root package name */
        public String f46226b = "default";

        /* renamed from: c  reason: collision with root package name */
        public float f46227c;

        /* renamed from: d  reason: collision with root package name */
        public float f46228d;

        /* renamed from: e  reason: collision with root package name */
        public float f46229e;

        /* renamed from: f  reason: collision with root package name */
        public float f46230f;

        static {
            Covode.recordClassIndex(28247);
        }

        public final String toString() {
            return "CpuAbnormalConfig{cpuHardWare='" + this.f46225a + '\'' + ", scene='" + this.f46226b + '\'' + ", cpuSpeed=" + this.f46227c + ", smallCpuCoreTimePercent=" + this.f46228d + ", middleCpuCoreTimePercent=" + this.f46229e + ", BigCpuCoreTimePercent=" + this.f46230f + '}';
        }
    }

    public final String toString() {
        return "AssistConfig{enableProcessTimeFreqPercent=" + this.f46220b + ", enableCpuUsageStat=" + this.f46221c + ", cpuSampleBatteryTemp=" + this.f46222d + ", cpuSampleBatteryLevel=" + this.f46223e + ", cpuAbnormalConfig=" + this.f46224f + '}';
    }
}
