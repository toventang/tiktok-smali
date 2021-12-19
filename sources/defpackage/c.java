package defpackage;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

/* renamed from: c  reason: default package */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static f f4871a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f4872b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final c f4873c = new c();

    /* renamed from: c$a */
    public static final class a implements q<IEffectService> {

        /* renamed from: a  reason: collision with root package name */
        public IEffectService f4874a;

        static {
            Covode.recordClassIndex(1918);
        }

        a() {
        }

        /* renamed from: a */
        public final IEffectService b() {
            if (this.f4874a == null) {
                this.f4874a = EffectService.getInstance();
            }
            return this.f4874a;
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(1917);
    }
}
