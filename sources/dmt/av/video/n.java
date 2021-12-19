package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class n {

    /* renamed from: j  reason: collision with root package name */
    public static final a f156911j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AtomicInteger f156912a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicInteger f156913b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicInteger f156914c;

    /* renamed from: d  reason: collision with root package name */
    public final String f156915d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f156916e;

    /* renamed from: f  reason: collision with root package name */
    public final IAudioEffectParam f156917f;

    /* renamed from: g  reason: collision with root package name */
    public final List<IAudioEffectParam> f156918g;

    /* renamed from: h  reason: collision with root package name */
    public final int f156919h;

    /* renamed from: i  reason: collision with root package name */
    public final b f156920i;

    static {
        Covode.recordClassIndex(104241);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104242);
        }

        private a() {
        }

        public static n a() {
            return new n("clear", true, null, null, 0, 60);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static n a(IAudioEffectParam iAudioEffectParam) {
            return new n("apply", true, iAudioEffectParam, null, 0, 56);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.bytedance.creativex.editor.preview.IAudioEffectParam> */
    /* JADX WARN: Multi-variable type inference failed */
    private n(String str, boolean z, IAudioEffectParam iAudioEffectParam, List<? extends IAudioEffectParam> list, int i2) {
        this.f156915d = str;
        this.f156916e = z;
        this.f156917f = iAudioEffectParam;
        this.f156918g = list;
        this.f156919h = i2;
        this.f156920i = null;
        this.f156912a = new AtomicInteger(-1);
        this.f156913b = new AtomicInteger(-1);
        this.f156914c = new AtomicInteger(-1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, boolean z, IAudioEffectParam iAudioEffectParam, List list, int i2, int i3) {
        this(str, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? null : iAudioEffectParam, (i3 & 8) == 0 ? list : null, (i3 & 16) != 0 ? 1 : i2);
    }
}
