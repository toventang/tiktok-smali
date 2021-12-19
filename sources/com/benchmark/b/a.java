package com.benchmark.b;

import com.benchmark.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;

public class a {
    @c(a = "overall_score")

    /* renamed from: a  reason: collision with root package name */
    public float f6032a = -1.0f;
    @c(a = "cpu_score")

    /* renamed from: b  reason: collision with root package name */
    public float f6033b = -1.0f;
    @c(a = "gpu_score")

    /* renamed from: c  reason: collision with root package name */
    public float f6034c = -1.0f;
    @c(a = "memory_score")

    /* renamed from: d  reason: collision with root package name */
    public float f6035d = -1.0f;
    @c(a = "video_score")

    /* renamed from: e  reason: collision with root package name */
    public float f6036e = -1.0f;
    @c(a = "io_score")

    /* renamed from: f  reason: collision with root package name */
    public float f6037f = -1.0f;
    @c(a = "video_play_scene")

    /* renamed from: g  reason: collision with root package name */
    public float f6038g = -1.0f;
    @c(a = "video_record_scene")

    /* renamed from: h  reason: collision with root package name */
    public float f6039h = -1.0f;
    @c(a = "app_launch_scene")

    /* renamed from: i  reason: collision with root package name */
    public float f6040i = -1.0f;

    static {
        Covode.recordClassIndex(2940);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.benchmark.b.a$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6041a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.b.a.AnonymousClass1.<clinit>():void");
        }
    }

    public Object clone() {
        a aVar = new a();
        aVar.a(a.b.SCENE_CPU_SCORE, this.f6033b);
        aVar.a(a.b.SCENE_VIDEO_PROCESSING_SCORE, this.f6036e);
        aVar.a(a.b.SCENE_IO_PROCESSING_SCORE, this.f6037f);
        aVar.a(a.b.SCENE_VIDEO_PLAY_SCORE, this.f6038g);
        aVar.a(a.b.SCENE_OVERALL_SCORE, this.f6032a);
        aVar.a(a.b.SCENE_RECORD_SCORE, this.f6039h);
        aVar.a(a.b.SCENE_MEMORY_SCORE, this.f6035d);
        aVar.a(a.b.SCENE_LAUNCH_SCORE, this.f6040i);
        aVar.a(a.b.SCENE_GPU_SCORE, this.f6034c);
        return aVar;
    }

    public String toString() {
        return "overall_score: " + this.f6032a + " --- cpu_score: " + this.f6033b + " --- gpu_score: " + this.f6034c + " --- memory_score: " + this.f6035d + " --- video_score: " + this.f6036e + " --- io_score: " + this.f6037f + " --- video_play_scene: " + this.f6038g + " --- video_record_scene: " + this.f6039h + " --- app_launch_scene: " + this.f6040i;
    }

    private void a(a.b bVar, float f2) {
        switch (AnonymousClass1.f6041a[bVar.ordinal()]) {
            case 1:
                this.f6036e = f2;
                return;
            case 2:
                this.f6037f = f2;
                return;
            case 3:
                this.f6038g = f2;
                return;
            case 4:
                this.f6032a = f2;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                this.f6039h = f2;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                this.f6035d = f2;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                this.f6040i = f2;
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                this.f6034c = f2;
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                this.f6033b = f2;
                return;
            default:
                return;
        }
    }
}
