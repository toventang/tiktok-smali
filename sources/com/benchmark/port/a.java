package com.benchmark.port;

import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f6311a = new a("overall_score", EnumC0084a.FLOAT);

    /* renamed from: b  reason: collision with root package name */
    public static a f6312b = new a("cpu_score", EnumC0084a.FLOAT);

    /* renamed from: c  reason: collision with root package name */
    public static a f6313c = new a("gpu_score", EnumC0084a.FLOAT);

    /* renamed from: d  reason: collision with root package name */
    public static a f6314d = new a("memory_score", EnumC0084a.FLOAT);

    /* renamed from: e  reason: collision with root package name */
    public static a f6315e = new a("video_score", EnumC0084a.FLOAT);

    /* renamed from: f  reason: collision with root package name */
    public static a f6316f = new a("io_score", EnumC0084a.FLOAT);

    /* renamed from: g  reason: collision with root package name */
    public static a f6317g = new a("video_play_scene", EnumC0084a.FLOAT);

    /* renamed from: h  reason: collision with root package name */
    public static a f6318h = new a("app_launch_scene", EnumC0084a.FLOAT);

    /* renamed from: i  reason: collision with root package name */
    public static a f6319i = new a("video_record_scene", EnumC0084a.FLOAT);

    /* renamed from: j  reason: collision with root package name */
    public String f6320j;

    /* renamed from: k  reason: collision with root package name */
    public EnumC0084a f6321k;

    /* renamed from: com.benchmark.port.a$a  reason: collision with other inner class name */
    public enum EnumC0084a {
        INT,
        FLOAT,
        BOOLEAN,
        STRING;

        static {
            Covode.recordClassIndex(3028);
        }
    }

    static {
        Covode.recordClassIndex(3027);
    }

    private a(String str, EnumC0084a aVar) {
        this.f6320j = str;
        this.f6321k = aVar;
    }
}
