package com.ss.android.ugc.aweme.sticker.i;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.editSticker.text.a.c;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.cw;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.tools.utils.i;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f134905a = {"default", "Proxima-Nova-Semibold.otf"};

    /* renamed from: f  reason: collision with root package name */
    private static a f134906f;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, c> f134907b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Typeface> f134908c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public String f134909d = "default";

    /* renamed from: e  reason: collision with root package name */
    f f134910e;

    /* renamed from: g  reason: collision with root package name */
    private String f134911g = "default";

    static {
        Covode.recordClassIndex(88190);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(2733);
        if (f134906f == null) {
            synchronized (a.class) {
                try {
                    if (f134906f == null) {
                        f134906f = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2733);
                    throw th;
                }
            }
        }
        a aVar = f134906f;
        MethodCollector.o(2733);
        return aVar;
    }

    public static Typeface a(String str) {
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

    private static void a(c cVar) {
        if (cVar != null) {
            q.a("font_resource_download_error_state", 0, new ar().a("font_title", cVar.f88294b).a("font_name", cVar.f88297e).a());
        }
    }

    public final c a(Effect effect) {
        Typeface a2;
        try {
            c cVar = (c) g.a().G().a(effect.getExtra(), c.class);
            if (TextUtils.isEmpty(cVar.f88297e)) {
                return null;
            }
            c cVar2 = this.f134907b.get(cVar.f88297e);
            if (cVar2 == null) {
                this.f134907b.put(cVar.f88297e, cVar);
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
            if (this.f134908c.get(cVar.f88297e) != null || TextUtils.isEmpty(effect.getUnzipPath()) || !i.a(effect.getUnzipPath())) {
                return null;
            }
            Typeface a3 = a(effect.getUnzipPath() + File.separator + cVar.f88297e);
            if (a3 != null) {
                cVar.f88299g = effect.getUnzipPath() + File.separator + cVar.f88297e;
                cVar.f88300h = 1;
                this.f134908c.put(cVar.f88297e, a3);
                a(cVar);
                return cVar;
            }
            File[] listFiles = new File(effect.getUnzipPath()).listFiles();
            for (File file : listFiles) {
                if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (a2 = a(file.getAbsolutePath())) != null) {
                    cVar.f88299g = file.getAbsolutePath();
                    cVar.f88300h = 1;
                    this.f134908c.put(cVar.f88297e, a2);
                    a(cVar);
                    return cVar;
                }
            }
            return null;
        } catch (Exception e2) {
            bj.b("parseTextFontStyleData err: " + e2.getMessage());
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(Context context) {
        if (context != null) {
            if (this.f134910e == null) {
                this.f134910e = AVServiceImpl.a().effectService().createFontEffectPlatform(com.ss.android.ugc.aweme.port.in.i.f115645a);
            }
            this.f134910e.a("textfont", false, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                /* class com.ss.android.ugc.aweme.sticker.i.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(88191);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    bj.b("prefetch fail err: " + exceptionResult.getMsg());
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                        if (cw.a()) {
                            b.i.b(new c(this, effect), b.i.f4824a);
                        } else {
                            a.this.a(effect);
                        }
                    }
                    a aVar = a.this;
                    for (String str : aVar.f134907b.keySet()) {
                        if (aVar.f134908c.get(str) == null) {
                            bj.d("text font " + str + " is null");
                            aVar.f134910e.a("textfont", true, (IFetchEffectChannelListener) new IFetchEffectChannelListener() {
                                /* class com.ss.android.ugc.aweme.sticker.i.a.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(88192);
                                }

                                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                                public final void onFail(ExceptionResult exceptionResult) {
                                    bj.b("textFontDownload err: " + exceptionResult.getMsg());
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                                    for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
                                        if (cw.a()) {
                                            b.i.b(new d(this, effect), b.i.f4824a);
                                        } else {
                                            a.this.a(effect);
                                        }
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
}
