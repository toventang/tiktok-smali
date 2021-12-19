package com.ss.android.ugc.aweme.editSticker.text.a;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.utils.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f88277a = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: e  reason: collision with root package name */
    private static b f88278e;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, c> f88279b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Typeface> f88280c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public String f88281d = "default";

    /* renamed from: f  reason: collision with root package name */
    private String f88282f = "default";

    public interface a {
        static {
            Covode.recordClassIndex(55531);
        }

        void a();
    }

    private static boolean e(int i2) {
        return i2 == 1;
    }

    public final int d() {
        return e(this.f88281d);
    }

    static {
        Covode.recordClassIndex(55526);
    }

    private b() {
    }

    public final Typeface c() {
        if (this.f88280c.get(this.f88281d) != null) {
            return this.f88280c.get(this.f88281d);
        }
        return Typeface.DEFAULT_BOLD;
    }

    public final c e() {
        return this.f88279b.get(this.f88281d);
    }

    public static b a() {
        MethodCollector.i(2952);
        if (f88278e == null) {
            synchronized (b.class) {
                try {
                    if (f88278e == null) {
                        f88278e = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2952);
                    throw th;
                }
            }
        }
        b bVar = f88278e;
        MethodCollector.o(2952);
        return bVar;
    }

    public final List<c> b() {
        if (this.f88279b.size() == 0) {
            return new ArrayList();
        }
        for (c cVar : this.f88279b.values()) {
            if (cVar != null) {
                if (TextUtils.isEmpty(cVar.f88297e) || this.f88280c.get(cVar.f88297e) == null) {
                    Typeface d2 = d(cVar.f88299g);
                    if (d2 != null) {
                        this.f88280c.put(cVar.f88297e, d2);
                        cVar.f88300h = 1;
                    } else {
                        cVar.f88300h = 2;
                    }
                } else {
                    cVar.f88300h = 1;
                }
            }
        }
        return new ArrayList(this.f88279b.values());
    }

    private int e(String str) {
        c cVar = this.f88279b.get(str);
        if (cVar != null) {
            return cVar.f88298f;
        }
        return 0;
    }

    public final String b(int i2) {
        if (e(i2)) {
            return this.f88282f;
        }
        return this.f88281d;
    }

    public final c d(int i2) {
        return this.f88279b.get(b(i2));
    }

    public final c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f88279b.get(str);
    }

    public final Typeface b(String str) {
        if (TextUtils.isEmpty(str) || this.f88280c.size() == 0) {
            return null;
        }
        Typeface typeface = this.f88280c.get(str);
        if (!(typeface != null || this.f88279b.get(str) == null || (typeface = d(this.f88279b.get(str).f88299g)) == null)) {
            this.f88280c.put(str, typeface);
        }
        return typeface;
    }

    public final Typeface c(int i2) {
        if (!e(i2)) {
            return c();
        }
        if (this.f88280c.get(this.f88282f) != null) {
            return this.f88280c.get(this.f88282f);
        }
        return Typeface.DEFAULT_BOLD;
    }

    private static Typeface d(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        try {
            if (TypeFaceOptimizer.getSwitch() && str != null) {
                if (TypeFaceLancet.cache.contains(str)) {
                    return (Typeface) TypeFaceLancet.cache.get(str);
                }
                Typeface createFromFile = Typeface.createFromFile(str);
                if (createFromFile != null) {
                    TypeFaceLancet.cache.put(str, createFromFile);
                    return createFromFile;
                }
            }
            return Typeface.createFromFile(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(int i2) {
        List<c> b2 = b();
        if (!b2.isEmpty() && b2.get(0).b()) {
            a(b2.get(0).f88297e, i2);
        }
    }

    public final Typeface c(String str) {
        if (TextUtils.isEmpty(str) || this.f88279b.size() == 0) {
            return null;
        }
        for (c cVar : this.f88279b.values()) {
            if (str.equals(cVar.f88293a)) {
                return b(cVar.f88297e);
            }
        }
        return null;
    }

    public final void a(Context context) {
        if (context != null) {
            g.b().a(g.a().f88137a, false, false, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                /* class com.ss.android.ugc.aweme.editSticker.text.a.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(55527);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    d.d().b("prefetch fail err: " + exceptionResult.getMsg());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                        b.this.a(effect);
                    }
                    b bVar = b.this;
                    for (String str : bVar.f88279b.keySet()) {
                        if (bVar.f88280c.get(str) == null) {
                            d.d().c("text font " + str + " is null");
                            g.b().a(g.a().f88137a, false, true, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                                /* class com.ss.android.ugc.aweme.editSticker.text.a.b.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(55528);
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    d.d().b("textFontDownload err: " + exceptionResult.getMsg());
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                                        b.this.a(effect);
                                    }
                                }
                            });
                            return;
                        }
                    }
                }
            });
        }
    }

    public final c a(Effect effect) {
        Typeface d2;
        try {
            c cVar = (c) d.b().a(effect.getExtra(), c.class);
            if (!TextUtils.isEmpty(cVar.f88297e)) {
                c cVar2 = this.f88279b.get(cVar.f88297e);
                if (cVar2 == null) {
                    this.f88279b.put(cVar.f88297e, cVar);
                } else {
                    cVar2.f88297e = cVar.f88297e;
                    cVar2.f88293a = cVar.f88293a;
                    cVar2.f88298f = cVar.f88298f;
                    cVar2.f88294b = cVar.f88294b;
                    cVar2.f88295c = cVar.f88295c;
                    cVar2.f88296d = cVar.f88296d;
                    cVar = cVar2;
                }
                cVar.f88301i = effect;
                if (this.f88280c.get(cVar.f88297e) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && i.a(effect.getUnzipPath())) {
                    Typeface d3 = d(effect.getUnzipPath() + File.separator + cVar.f88297e);
                    if (d3 != null) {
                        cVar.f88299g = effect.getUnzipPath() + File.separator + cVar.f88297e;
                        cVar.f88300h = 1;
                        this.f88280c.put(cVar.f88297e, d3);
                        a(cVar, true, null);
                        return cVar;
                    }
                    File[] listFiles = new File(effect.getUnzipPath()).listFiles();
                    for (File file : listFiles) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (d2 = d(file.getAbsolutePath())) != null) {
                            cVar.f88299g = file.getAbsolutePath();
                            cVar.f88300h = 1;
                            this.f88280c.put(cVar.f88297e, d2);
                            a(cVar, true, null);
                            return cVar;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            if (d.d() != null) {
                d.d().b("parseTextFontStyleData err: " + e2.getMessage());
            }
            e2.printStackTrace();
        }
        return null;
    }

    public final void a(String str, int i2) {
        if (e(i2)) {
            this.f88282f = str;
        } else {
            this.f88281d = str;
        }
    }

    public static void a(c cVar, boolean z, Exception exc) {
        if (cVar != null && g.f88155b != null) {
            g.f88155b.a(cVar, z, exc);
        }
    }
}
